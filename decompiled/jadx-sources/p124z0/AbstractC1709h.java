package p124z0;

import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import com.altaysoft.themecrypt.ThemeCrypt;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p006C.AbstractC0062j;
import p022K.C0198k;
import p034Q0.C0295l;
import p098q0.C1315f1;
import p109u0.AbstractC1569q1;
import p109u0.RunnableC1559n0;

/* renamed from: z0.h */
/* loaded from: classes.dex */
public abstract class AbstractC1709h {

    /* renamed from: a */
    public static final Pattern f9661a = Pattern.compile("^theme(\\d+)_(layout\\.json|bg\\.png|spd\\.png|rpm\\.png|needle_spd\\.png|needle_rpm\\.png|needle_small\\.png|image\\d+\\.png)$");

    /* renamed from: b */
    public static final Pattern f9662b = Pattern.compile("^theme\\d+_(.+)$");

    /* renamed from: c */
    public static final Pattern f9663c = Pattern.compile("href\\s*=\\s*(?:\"([^\"]+)\"|'([^']+)'|([^\\s>]+))", 2);

    /* renamed from: a */
    public static void m4975a(ArrayList arrayList, File file) {
        if (file == null || !file.isDirectory()) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.contains("/emulated/")) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((File) it.next()).getAbsolutePath().equals(absolutePath)) {
                return;
            }
        }
        arrayList.add(file);
    }

    /* renamed from: b */
    public static void m4976b(ArrayList arrayList, File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isDirectory()) {
                    String name = file2.getName();
                    if (!"emulated".equals(name) && !"self".equals(name) && !"sdcard0".equals(name) && !"primary".equals(name)) {
                        m4975a(arrayList, file2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static File m4977c(Context context, String str) {
        File file = new File(context.getCacheDir(), "theme_shop");
        String str2 = "theme";
        if (str != null && !str.trim().isEmpty()) {
            String trim = str.trim();
            StringBuilder sb = new StringBuilder(trim.length());
            for (int i = 0; i < trim.length(); i++) {
                char charAt = trim.charAt(i);
                if (charAt < ' ' || "\\/:*?\"<>|".indexOf(charAt) >= 0) {
                    sb.append('_');
                } else {
                    sb.append(charAt);
                }
            }
            if (sb.length() > 40) {
                sb.setLength(40);
            }
            if (sb.length() != 0) {
                str2 = sb.toString();
            }
        }
        File file2 = new File(file, str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    /* renamed from: d */
    public static void m4978d(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static void m4979e(String str, File file, int i, C1315f1 c1315f1, String str2) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        HttpURLConnection m4988n = m4988n(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            int responseCode = m4988n.getResponseCode();
            if (responseCode == 404) {
                throw new IOException("404");
            }
            if (responseCode < 200 || responseCode >= 300) {
                throw new IOException(String.valueOf(responseCode));
            }
            int contentLength = m4988n.getContentLength();
            inputStream = m4988n.getInputStream();
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[8192];
                int i2 = 0;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.flush();
                        if (c1315f1 != null) {
                            c1315f1.m3184h(100, str2);
                        }
                        m4978d(fileOutputStream);
                        m4978d(inputStream);
                        m4988n.disconnect();
                        return;
                    }
                    i3 += read;
                    if (i3 > i) {
                        throw new IOException("size");
                    }
                    fileOutputStream.write(bArr, i2, read);
                    if (c1315f1 != null && contentLength > 0) {
                        int i5 = (int) ((i3 * 100) / contentLength);
                        if (i5 != i4 && (i5 == 100 || i5 - i4 >= 2)) {
                            c1315f1.m3184h(i5, str2);
                            i4 = i5;
                        }
                    } else if (c1315f1 != null && i3 == read) {
                        c1315f1.m3184h(-1, str2);
                    }
                    i2 = 0;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                m4978d(fileOutputStream2);
                m4978d(inputStream);
                m4988n.disconnect();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    /* renamed from: f */
    public static LinkedHashSet m4980f(String str) {
        JSONArray optJSONArray;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            String trim = str.trim();
            optJSONArray = trim.startsWith("{") ? new JSONObject(trim).optJSONArray("themes") : new JSONArray(trim);
        } catch (Exception unused) {
        }
        if (optJSONArray == null) {
            return linkedHashSet;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String trim2 = optJSONObject.optString("folder", optJSONObject.optString("name", "")).trim();
                if (!trim2.isEmpty()) {
                    linkedHashSet.add(trim2);
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    public static byte[] m4981g(String str, C1315f1 c1315f1, String str2) {
        int i;
        HttpURLConnection m4988n = m4988n(str);
        try {
            int responseCode = m4988n.getResponseCode();
            if (responseCode == 404) {
                m4988n.disconnect();
                return null;
            }
            if (responseCode < 200 || responseCode >= 300) {
                throw new IOException(String.valueOf(responseCode));
            }
            int contentLength = m4988n.getContentLength();
            InputStream inputStream = m4988n.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            int i2 = -1;
            int i3 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    if (c1315f1 != null && contentLength > 0) {
                        c1315f1.m3184h(100, str2);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m4978d(inputStream);
                    m4988n.disconnect();
                    return byteArray;
                }
                i3 += read;
                if (i3 > 524288) {
                    throw new IOException("size");
                }
                byteArrayOutputStream.write(bArr, 0, read);
                if (c1315f1 != null && contentLength > 0 && (i = (int) ((i3 * 100) / contentLength)) != i2 && (i == 100 || i - i2 >= 5)) {
                    c1315f1.m3184h(i, str2);
                    i2 = i;
                }
            }
        } catch (Throwable th) {
            m4978d(null);
            m4988n.disconnect();
            throw th;
        }
    }

    /* renamed from: h */
    public static String m4982h(String str, boolean z2, C1315f1 c1315f1, String str2) {
        try {
            byte[] m4981g = m4981g(str, c1315f1, str2);
            if (m4981g == null) {
                return null;
            }
            return new String(m4981g, StandardCharsets.UTF_8);
        } catch (IOException e2) {
            if (z2) {
                return null;
            }
            throw e2;
        }
    }

    /* renamed from: i */
    public static void m4983i(Context context, C1708g c1708g, int i) {
        FileOutputStream fileOutputStream;
        if (context == null || c1708g == null) {
            throw new IOException("zip");
        }
        C1708g m4987m = m4987m(context, c1708g, null);
        File file = m4987m.f9659g;
        if (!file.isFile()) {
            throw new IOException("zip");
        }
        File m4465q = AbstractC1569q1.m4465q(i);
        if (!m4465q.exists() && !m4465q.mkdirs()) {
            throw new IOException(m4465q.getAbsolutePath());
        }
        File[] listFiles = m4465q.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile()) {
                    file2.delete();
                }
            }
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        try {
            byte[] bArr = new byte[8192];
            boolean z2 = false;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (nextEntry.isDirectory()) {
                    zipInputStream.closeEntry();
                } else {
                    String name = nextEntry.getName();
                    if (name == null) {
                        name = "";
                    } else {
                        int max = Math.max(name.lastIndexOf(47), name.lastIndexOf(92));
                        if (max >= 0) {
                            name = name.substring(max + 1);
                        }
                    }
                    Matcher matcher = f9661a.matcher(name);
                    if (matcher.matches() && !name.contains("..")) {
                        File m4467s = AbstractC1569q1.m4467s(i, "theme" + i + "_" + matcher.group(2));
                        File parentFile = m4467s.getParentFile();
                        if (parentFile != null && !parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        fileOutputStream = new FileOutputStream(m4467s);
                        while (true) {
                            try {
                                int read = zipInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, read);
                                }
                            } finally {
                            }
                        }
                        fileOutputStream.close();
                        zipInputStream.closeEntry();
                        z2 = true;
                    }
                    zipInputStream.closeEntry();
                }
            }
            if (!z2) {
                throw new IOException("zip");
            }
            zipInputStream.close();
            File m4467s2 = AbstractC1569q1.m4467s(i, AbstractC1569q1.m4456h(i));
            if (!m4467s2.isFile()) {
                throw new IOException("layout");
            }
            String unwrapToJson = ThemeCrypt.unwrapToJson(context, m4990p(m4467s2));
            if (unwrapToJson == null || unwrapToJson.trim().isEmpty()) {
                String lastError = ThemeCrypt.lastError();
                throw new IOException(lastError != null ? lastError : "layout");
            }
            JSONObject jSONObject = new JSONObject(unwrapToJson);
            m4991q(i, jSONObject);
            jSONObject.put("id", "theme" + i);
            String str = m4987m.f9654b;
            if (!str.isEmpty()) {
                jSONObject.put("name", str);
            }
            jSONObject.put("author", m4987m.f9655c);
            jSONObject.put("description", m4987m.f9656d);
            byte[] wrapJson = ThemeCrypt.wrapJson(context, jSONObject.toString(2));
            if (wrapJson == null) {
                String lastError2 = ThemeCrypt.lastError();
                if (lastError2 == null) {
                    lastError2 = "encrypt";
                }
                throw new IOException(lastError2);
            }
            fileOutputStream = new FileOutputStream(m4467s2);
            try {
                fileOutputStream.write(wrapJson);
                fileOutputStream.flush();
                if (i < 1 || i > 9) {
                    return;
                }
                AbstractC1569q1.f8670e[i - 1] = null;
            } finally {
            }
        } catch (Throwable th) {
            zipInputStream.close();
            throw th;
        }
    }

    /* renamed from: j */
    public static ArrayList m4984j(File file) {
        File[] listFiles;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (file == null || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            if (file2 != null && file2.isDirectory()) {
                File file3 = new File(file2, "theme.zip");
                if (file3.isFile()) {
                    File file4 = new File(file2, "preview.png");
                    File file5 = new File(file2, "info.txt");
                    String name = file2.getName();
                    if (file5.isFile()) {
                        C0198k m4989o = m4989o(file5);
                        if (!((String) m4989o.f533b).isEmpty()) {
                            name = (String) m4989o.f533b;
                        }
                        String str3 = (String) m4989o.f534c;
                        str2 = (String) m4989o.f535d;
                        str = str3;
                    } else {
                        str = "";
                        str2 = "";
                    }
                    arrayList.add(new C1708g(file2, name, str, str2, file4.isFile() ? file4 : null, file5.isFile() ? file5 : null, file3, null));
                }
            }
        }
        Collections.sort(arrayList, new C0295l(7));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ec, code lost:
    
        if (r5.equals("list") == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f5 A[SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m4985k(Context context, C1315f1 c1315f1) {
        LinkedHashSet linkedHashSet;
        Iterator it;
        String sb;
        String[] strArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String trim;
        String m4982h;
        if (c1315f1 != null) {
            UserThemeImportActivity userThemeImportActivity = (UserThemeImportActivity) c1315f1.f6118f;
            userThemeImportActivity.runOnUiThread(new RunnableC1559n0(c1315f1, 22, UserThemeImportActivity.m1997t(userThemeImportActivity, "catalog")));
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i = 1;
        String m4982h2 = m4982h("https://gwm-split.ru/split_themes/themes.json", true, c1315f1, "themes.json");
        if (m4982h2 != null && m4986l(m4982h2)) {
            linkedHashSet2.addAll(m4980f(m4982h2));
        }
        int i2 = 0;
        if (linkedHashSet2.isEmpty() && (m4982h = m4982h("https://gwm-split.ru/split_themes/themes.list", true, c1315f1, "themes.list")) != null && !m4986l(m4982h)) {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (String str6 : m4982h.split("\n")) {
                String trim2 = str6.trim();
                if (trim2.endsWith("\r")) {
                    trim2 = trim2.substring(0, trim2.length() - 1).trim();
                }
                if (!trim2.isEmpty() && !trim2.startsWith("#")) {
                    linkedHashSet3.add(trim2);
                }
            }
            linkedHashSet2.addAll(linkedHashSet3);
        }
        char c2 = '\\';
        char c3 = '/';
        String str7 = "UTF-8";
        String str8 = "%20";
        if (linkedHashSet2.isEmpty()) {
            String m4982h3 = m4982h("https://gwm-split.ru/split_themes/", false, c1315f1, "index");
            if (m4982h3 != null && m4986l(m4982h3)) {
                linkedHashSet2.addAll(m4980f(m4982h3));
            } else if (m4982h3 != null) {
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                Matcher matcher = f9663c.matcher(m4982h3);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (group == null) {
                        group = matcher.group(2);
                    }
                    if (group == null) {
                        group = matcher.group(3);
                    }
                    if (group != null) {
                        trim = group.trim();
                        if (!trim.isEmpty() && !trim.startsWith("?") && !trim.startsWith("#") && !trim.contains("://")) {
                            try {
                                trim = URLDecoder.decode(trim.replace("+", "%20"), "UTF-8");
                            } catch (Exception unused) {
                            }
                            int indexOf = trim.indexOf(63);
                            if (indexOf >= 0) {
                                trim = trim.substring(i2, indexOf);
                            }
                            if (trim.endsWith("/")) {
                                trim = trim.substring(i2, trim.length() - 1);
                            }
                            if (trim.startsWith("/split_themes/")) {
                                trim = trim.substring(14);
                            } else if (!trim.equals("/split_themes") && !trim.equals("/")) {
                                if (trim.startsWith("/")) {
                                    int lastIndexOf = trim.lastIndexOf(47);
                                    if (lastIndexOf >= 0) {
                                        trim = trim.substring(lastIndexOf + 1);
                                    }
                                } else {
                                    int max = Math.max(trim.lastIndexOf(47), trim.lastIndexOf(92));
                                    if (max >= 0) {
                                        trim = trim.substring(max + 1);
                                    }
                                }
                            }
                            if (!trim.isEmpty() && !".".equals(trim) && !"..".equals(trim) && !"Parent Directory".equalsIgnoreCase(trim) && !trim.startsWith(".")) {
                                int lastIndexOf2 = trim.lastIndexOf(46);
                                if (lastIndexOf2 > 0) {
                                    String lowerCase = trim.substring(lastIndexOf2 + 1).toLowerCase();
                                    if (!lowerCase.equals("zip")) {
                                        if (!lowerCase.equals("png")) {
                                            if (!lowerCase.equals("txt")) {
                                                if (!lowerCase.equals("json")) {
                                                    if (!lowerCase.equals("gif")) {
                                                        if (!lowerCase.equals("jpg")) {
                                                            if (!lowerCase.equals("html")) {
                                                                if (!lowerCase.equals("htm")) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (trim == null) {
                                    linkedHashSet4.add(trim);
                                }
                                i2 = 0;
                            }
                        }
                    }
                    trim = null;
                    if (trim == null) {
                    }
                    i2 = 0;
                }
                linkedHashSet2.addAll(linkedHashSet4);
            }
        }
        if (c1315f1 != null) {
            String str9 = "folders:" + linkedHashSet2.size();
            UserThemeImportActivity userThemeImportActivity2 = (UserThemeImportActivity) c1315f1.f6118f;
            userThemeImportActivity2.runOnUiThread(new RunnableC1559n0(c1315f1, 22, UserThemeImportActivity.m1997t(userThemeImportActivity2, str9)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = linkedHashSet2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            String str10 = (String) it2.next();
            i3 += i;
            int size = linkedHashSet2.size();
            String str11 = "";
            if (str10 == null) {
                linkedHashSet = linkedHashSet2;
                it = it2;
                sb = "";
            } else {
                String[] split = str10.replace(c2, c3).split("/");
                StringBuilder sb2 = new StringBuilder();
                int length = split.length;
                linkedHashSet = linkedHashSet2;
                int i4 = 0;
                while (i4 < length) {
                    Iterator it3 = it2;
                    String str12 = split[i4];
                    if (str12.isEmpty()) {
                        strArr = split;
                    } else {
                        if (sb2.length() > 0) {
                            strArr = split;
                            sb2.append('/');
                        } else {
                            strArr = split;
                        }
                        try {
                            sb2.append(URLEncoder.encode(str12, str7).replace("+", str8));
                        } catch (Exception unused2) {
                            sb2.append(str12.replace(" ", str8));
                        }
                    }
                    i4++;
                    it2 = it3;
                    split = strArr;
                }
                it = it2;
                sb = sb2.toString();
            }
            String m161o = AbstractC0062j.m161o("https://gwm-split.ru/split_themes/", sb, "/theme.zip");
            File m4977c = m4977c(context, str10);
            File file = new File(m4977c, "preview.png");
            String str13 = str7;
            File file2 = new File(m4977c, "info.txt");
            String str14 = str8;
            String str15 = i3 + "/" + size + " " + str10;
            try {
                m4979e("https://gwm-split.ru/split_themes/" + sb + "/info.txt", file2, 524288, c1315f1, "info:" + str15);
                if (file2.isFile()) {
                    C0198k m4989o = m4989o(file2);
                    if (!((String) m4989o.f533b).isEmpty()) {
                        str10 = (String) m4989o.f533b;
                    }
                    str = (String) m4989o.f534c;
                    try {
                        str5 = (String) m4989o.f535d;
                        str11 = str;
                    } catch (Exception unused3) {
                        str2 = str10;
                        str3 = str;
                        str4 = "";
                        m4979e("https://gwm-split.ru/split_themes/" + sb + "/preview.png", file, 8388608, c1315f1, "preview:" + str15);
                        arrayList.add(new C1708g(m4977c, str2, str3, str4, !file.isFile() ? file : null, !file2.isFile() ? file2 : null, new File(m4977c, "theme.zip"), m161o));
                        linkedHashSet2 = linkedHashSet;
                        it2 = it;
                        str7 = str13;
                        str8 = str14;
                        i = 1;
                        c2 = '\\';
                        c3 = '/';
                    }
                } else {
                    str5 = "";
                }
                str4 = str5;
                str2 = str10;
                str3 = str11;
            } catch (Exception unused4) {
                str = "";
            }
            try {
                m4979e("https://gwm-split.ru/split_themes/" + sb + "/preview.png", file, 8388608, c1315f1, "preview:" + str15);
            } catch (Exception unused5) {
            }
            arrayList.add(new C1708g(m4977c, str2, str3, str4, !file.isFile() ? file : null, !file2.isFile() ? file2 : null, new File(m4977c, "theme.zip"), m161o));
            linkedHashSet2 = linkedHashSet;
            it2 = it;
            str7 = str13;
            str8 = str14;
            i = 1;
            c2 = '\\';
            c3 = '/';
        }
        Collections.sort(arrayList, new C0295l(7));
        if (c1315f1 != null) {
            String str16 = "done:" + arrayList.size();
            UserThemeImportActivity userThemeImportActivity3 = (UserThemeImportActivity) c1315f1.f6118f;
            userThemeImportActivity3.runOnUiThread(new RunnableC1559n0(c1315f1, 22, UserThemeImportActivity.m1997t(userThemeImportActivity3, str16)));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static boolean m4986l(String str) {
        String trim = str.trim();
        return trim.startsWith("[") || trim.startsWith("{");
    }

    /* renamed from: m */
    public static C1708g m4987m(Context context, C1708g c1708g, C1315f1 c1315f1) {
        if (c1708g == null) {
            throw new IOException("zip");
        }
        File file = c1708g.f9659g;
        if (file != null && file.isFile() && file.length() > 0) {
            return c1708g;
        }
        String str = c1708g.f9660h;
        if (str == null || str.isEmpty()) {
            throw new IOException("zip");
        }
        String str2 = c1708g.f9654b;
        File file2 = c1708g.f9653a;
        File m4977c = m4977c(context, file2 != null ? file2.getName() : str2);
        File file3 = new File(m4977c, "theme.zip");
        m4979e(str, file3, 83886080, c1315f1, "zip:" + str2);
        return new C1708g(m4977c, c1708g.f9654b, c1708g.f9655c, c1708g.f9656d, c1708g.f9657e, c1708g.f9658f, file3, c1708g.f9660h);
    }

    /* renamed from: n */
    public static HttpURLConnection m4988n(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(25000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setRequestProperty("Accept", "*/*");
        httpURLConnection.setRequestProperty("User-Agent", "GwmSplit");
        return httpURLConnection;
    }

    /* renamed from: o */
    public static C0198k m4989o(File file) {
        C0198k c0198k = new C0198k(9);
        c0198k.f533b = "";
        c0198k.f534c = "";
        c0198k.f535d = "";
        try {
            String[] split = new String(m4990p(file), StandardCharsets.UTF_8).split("\n", -1);
            StringBuilder sb = new StringBuilder();
            boolean z2 = false;
            for (String str : split) {
                if (str.endsWith("\r")) {
                    str = str.substring(0, str.length() - 1);
                }
                if (z2) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(str);
                } else if (str.startsWith("name:")) {
                    c0198k.f533b = str.substring(5).trim();
                } else if (str.startsWith("author:")) {
                    c0198k.f534c = str.substring(7).trim();
                } else if (str.startsWith("description:")) {
                    String substring = str.substring(12);
                    if (substring.startsWith(" ")) {
                        substring = substring.substring(1);
                    }
                    if (!substring.isEmpty()) {
                        sb.append(substring);
                    }
                    z2 = true;
                }
            }
            String sb2 = sb.toString();
            int length = sb2.length();
            while (length > 0) {
                int i = length - 1;
                if (sb2.charAt(i) != '\n' && sb2.charAt(i) != '\r') {
                    break;
                }
                length--;
            }
            c0198k.f535d = sb2.substring(0, length);
        } catch (Exception unused) {
        }
        return c0198k;
    }

    /* renamed from: p */
    public static byte[] m4990p(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    fileInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    /* renamed from: q */
    public static void m4991q(int i, Object obj) {
        boolean z2 = obj instanceof JSONObject;
        Pattern pattern = f9662b;
        if (!z2) {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    Object opt = jSONArray.opt(i2);
                    if (opt instanceof String) {
                        Matcher matcher = pattern.matcher((String) opt);
                        if (matcher.matches()) {
                            try {
                                jSONArray.put(i2, "theme" + i + "_" + matcher.group(1));
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        m4991q(i, opt);
                    }
                }
                return;
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object opt2 = jSONObject.opt(str);
            if (opt2 instanceof String) {
                Matcher matcher2 = pattern.matcher((String) opt2);
                if (matcher2.matches()) {
                    try {
                        jSONObject.put(str, "theme" + i + "_" + matcher2.group(1));
                    } catch (Exception unused2) {
                    }
                }
            } else {
                m4991q(i, opt2);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|21|(4:23|24|25|26)|28|29|(2:31|24)|25|26) */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m4992r(Context context) {
        StorageManager storageManager;
        File file;
        Object invoke;
        ArrayList arrayList = new ArrayList();
        if (context != null && (storageManager = (StorageManager) context.getSystemService("storage")) != null) {
            for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                if (storageVolume != null && storageVolume.isRemovable()) {
                    String state = storageVolume.getState();
                    if ("mounted".equals(state) || "mounted_ro".equals(state)) {
                        File file2 = null;
                        try {
                            invoke = storageVolume.getClass().getMethod("getPathFile", null).invoke(storageVolume, null);
                        } catch (Exception unused) {
                        }
                        if (invoke instanceof File) {
                            file = (File) invoke;
                            file2 = file;
                            m4975a(arrayList, file2);
                        }
                        Object invoke2 = storageVolume.getClass().getMethod("getPath", null).invoke(storageVolume, null);
                        if (invoke2 instanceof String) {
                            file = new File((String) invoke2);
                            file2 = file;
                        }
                        m4975a(arrayList, file2);
                    }
                }
            }
        }
        m4976b(arrayList, new File("/storage"));
        m4976b(arrayList, new File("/mnt/media_rw"));
        return arrayList;
    }
}
