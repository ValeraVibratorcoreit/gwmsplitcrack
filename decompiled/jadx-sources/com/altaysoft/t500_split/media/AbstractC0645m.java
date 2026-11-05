package com.altaysoft.t500_split.media;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.os.Handler;
import android.os.Looper;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p109u0.AbstractC1561o;

/* renamed from: com.altaysoft.t500_split.media.m */
/* loaded from: classes.dex */
public abstract class AbstractC0645m {

    /* renamed from: a */
    public static final Pattern f3037a = Pattern.compile("^(\\d{6,})(?::(\\d{3,}))?$");

    /* renamed from: b */
    public static final Pattern f3038b = Pattern.compile("track[:/_-](\\d{6,})(?::(\\d{3,}))?", 2);

    /* renamed from: c */
    public static final Handler f3039c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public static final ExecutorService f3040d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    public static final HashSet f3041e = new HashSet();

    /* renamed from: a */
    public static String m1895a(HttpURLConnection httpURLConnection, int i) {
        InputStream inputStream = null;
        try {
            inputStream = i >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            String m1904j = m1904j(inputStream, httpURLConnection.getContentEncoding());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            httpURLConnection.disconnect();
            return m1904j;
        } catch (Exception unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused3) {
                }
            }
            httpURLConnection.disconnect();
            return "";
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused4) {
                }
            }
            httpURLConnection.disconnect();
            throw th;
        }
    }

    /* renamed from: b */
    public static JSONObject m1896b(Context context, String str) {
        String str2;
        Exception e2 = null;
        int i = 0;
        while (i < 3) {
            try {
                HttpURLConnection m1901g = m1901g(context, str, "GET");
                int responseCode = m1901g.getResponseCode();
                String m1895a = m1895a(m1901g, responseCode);
                if (responseCode == 429) {
                    throw new Exception("429");
                }
                if (responseCode >= 200 && responseCode < 300) {
                    return new JSONObject(m1895a);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(responseCode);
                sb.append(" ");
                if (m1895a != null) {
                    str2 = m1895a.replace('\n', ' ').trim();
                    if (str2.length() > 160) {
                        str2 = str2.substring(0, 160);
                    }
                } else {
                    str2 = "";
                }
                sb.append(str2);
                throw new Exception(sb.toString());
            } catch (Exception e3) {
                e2 = e3;
                if (!(e2.getMessage() == null ? "" : e2.getMessage()).contains("429") || i >= 2) {
                    throw e2;
                }
                i++;
                Thread.sleep(i * 700);
            }
        }
        if (e2 == null) {
            throw new Exception("GET");
        }
        throw e2;
    }

    /* renamed from: c */
    public static void m1897c(Context context) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = m1896b(context, "/users/" + URLEncoder.encode(m1905k(context), "UTF-8") + "/likes/tracks").optJSONObject("result");
        JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("library") : null;
        JSONArray optJSONArray = optJSONObject3 != null ? optJSONObject3.optJSONArray("tracks") : null;
        HashSet hashSet = f3041e;
        hashSet.clear();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject4 = optJSONArray.optJSONObject(i);
                if (optJSONObject4 != null) {
                    String m1899e = m1899e(String.valueOf(optJSONObject4.opt("id")));
                    if ((m1899e.isEmpty() || "null".equals(m1899e)) && (optJSONObject = optJSONObject4.optJSONObject("track")) != null) {
                        m1899e = m1899e(String.valueOf(optJSONObject.opt("id")));
                    }
                    if (!m1899e.isEmpty() && !"null".equals(m1899e)) {
                        hashSet.add(m1899e);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static void m1898d(Context context, String str, String str2, C0043j c0043j) {
        int m1903i;
        boolean isEmpty = ((String) c0043j.f142h).isEmpty();
        String str3 = (String) c0043j.f141g;
        if (!isEmpty) {
            str3 = str3 + ":" + ((String) c0043j.f142h);
        }
        String str4 = "/users/" + URLEncoder.encode(str, "UTF-8") + "/likes/tracks/" + str2;
        StringBuilder sb = new StringBuilder("track-ids=");
        if (str3 == null) {
            str3 = "";
        }
        sb.append(URLEncoder.encode(str3, "UTF-8"));
        String sb2 = sb.toString();
        Exception e2 = null;
        for (int i = 0; i < 3; i++) {
            try {
                m1903i = m1903i(context, str4, sb2);
            } catch (Exception e3) {
                e2 = e3;
                if (!(e2.getMessage() == null ? "" : e2.getMessage()).contains("429") || i >= 2) {
                    throw e2;
                }
                Thread.sleep((i + 1) * 700);
            }
            if (m1903i != 429) {
                if (m1903i < 200 || m1903i >= 300) {
                    throw new Exception("HTTP " + m1903i);
                }
                return;
            }
            e2 = new Exception("429");
            Thread.sleep((i + 1) * 700);
        }
        if (e2 != null) {
            throw e2;
        }
        throw new Exception("429");
    }

    /* renamed from: e */
    public static String m1899e(String str) {
        String trim = str.trim();
        if (trim.isEmpty() || "null".equals(trim)) {
            return "";
        }
        int indexOf = trim.indexOf(58);
        return indexOf > 0 ? trim.substring(0, indexOf) : trim;
    }

    /* renamed from: f */
    public static String m1900f(String str) {
        return str == null ? "" : str.trim().toLowerCase(Locale.ROOT);
    }

    /* renamed from: g */
    public static HttpURLConnection m1901g(Context context, String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(AbstractC1561o.m4299c("https://api.music.yandex.net", str)).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(25000);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setUseCaches(false);
        StringBuilder sb = new StringBuilder("OAuth ");
        Handler handler = AbstractC0650r.f3067a;
        sb.append(context.getApplicationContext().getSharedPreferences("ym_oauth", 0).getString("token", ""));
        httpURLConnection.setRequestProperty("Authorization", sb.toString());
        httpURLConnection.setRequestProperty("User-Agent", "Yandex-Music-API");
        httpURLConnection.setRequestProperty("X-Yandex-Music-Client", "YandexMusicAndroid/24026501");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Accept-Language", "ru");
        return httpURLConnection;
    }

    /* renamed from: h */
    public static C0043j m1902h(String str) {
        C0043j c0043j = null;
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            if (!lowerCase.contains("playlist") && !lowerCase.contains("station") && !lowerCase.contains("onyourwave") && !lowerCase.contains("radio") && !lowerCase.contains("owner") && !lowerCase.contains("kind")) {
                Matcher matcher = f3037a.matcher(trim);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    return new C0043j(group, group2 != null ? group2 : "");
                }
                Matcher matcher2 = f3038b.matcher(trim);
                if (matcher2.find()) {
                    String group3 = matcher2.group(1);
                    String group4 = matcher2.group(2);
                    c0043j = new C0043j(group3, group4 != null ? group4 : "");
                }
            }
        }
        return c0043j;
    }

    /* renamed from: i */
    public static int m1903i(Context context, String str, String str2) {
        String str3;
        HttpURLConnection m1901g = m1901g(context, str, "POST");
        m1901g.setDoOutput(true);
        m1901g.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        m1901g.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = m1901g.getOutputStream();
        try {
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = m1901g.getResponseCode();
            String m1895a = m1895a(m1901g, responseCode);
            if (responseCode == 429) {
                throw new Exception("429");
            }
            if (responseCode >= 200 && responseCode < 300) {
                return responseCode;
            }
            StringBuilder sb = new StringBuilder("HTTP ");
            sb.append(responseCode);
            sb.append(" ");
            if (m1895a != null) {
                str3 = m1895a.replace('\n', ' ').trim();
                if (str3.length() > 160) {
                    str3 = str3.substring(0, 160);
                }
            } else {
                str3 = "";
            }
            sb.append(str3);
            throw new Exception(sb.toString());
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: j */
    public static String m1904j(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        if ("gzip".equalsIgnoreCase(str)) {
            inputStream = new GZIPInputStream(inputStream);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: k */
    public static String m1905k(Context context) {
        Handler handler = AbstractC0650r.f3067a;
        String str = "";
        String string = context.getApplicationContext().getSharedPreferences("ym_oauth", 0).getString("uid", "");
        if (string == null || string.isEmpty()) {
            String string2 = context.getApplicationContext().getSharedPreferences("ym_oauth", 0).getString("token", "");
            if (string2 != null && !string2.isEmpty()) {
                str = AbstractC0650r.m1922b(string2);
                if (!str.isEmpty()) {
                    context.getApplicationContext().getSharedPreferences("ym_oauth", 0).edit().putString("uid", str).apply();
                }
            }
        } else {
            str = string;
        }
        if (str.isEmpty()) {
            throw new Exception("нет uid");
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0041, code lost:
    
        if (com.altaysoft.t500_split.media.AbstractC0638f.m1860i(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
    
        if ("null".equals(r4) != false) goto L84;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0043j m1906l(Context context, String str, String str2, String str3, String str4) {
        String str5;
        C0043j c0043j;
        String str6;
        String str7;
        C0043j m1902h = m1902h(str4);
        if (m1902h == null) {
            try {
                List<MediaController> m1855d = AbstractC0638f.m1855d(context);
                if (m1855d != null) {
                    for (MediaController mediaController : m1855d) {
                        if (mediaController != null && AbstractC0648p.m1910c(mediaController.getPackageName())) {
                            MediaMetadata metadata = mediaController.getMetadata();
                            if (metadata != null) {
                                str5 = metadata.getString("android.media.metadata.MEDIA_ID");
                            }
                            str5 = null;
                            if (AbstractC0638f.m1860i(str5)) {
                                break;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            str5 = "";
            m1902h = m1902h(str5);
        }
        if (m1902h != null) {
            return m1902h;
        }
        String trim = str2 == null ? "" : str2.trim();
        String trim2 = str == null ? "" : str.trim();
        if (trim.isEmpty()) {
            trim = trim2;
        } else if (!trim2.isEmpty()) {
            trim = AbstractC0062j.m169w(trim, " ", trim2);
        }
        if (trim.isEmpty()) {
            trim = str3 == null ? "" : str3.trim();
        }
        if (trim.isEmpty()) {
            return null;
        }
        JSONObject optJSONObject = m1896b(context, "/search?text=" + URLEncoder.encode(trim, "UTF-8") + "&type=track&page=0").optJSONObject("result");
        JSONObject optJSONObject2 = optJSONObject == null ? null : optJSONObject.optJSONObject("tracks");
        JSONArray optJSONArray = optJSONObject2 == null ? null : optJSONObject2.optJSONArray("results");
        if (optJSONArray == null) {
            return null;
        }
        String m1900f = m1900f(str);
        String m1900f2 = m1900f(str2);
        C0043j c0043j2 = null;
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
            if (optJSONObject3 != null) {
                String lowerCase = optJSONObject3.optString("type", "music").toLowerCase(Locale.ROOT);
                if (!lowerCase.contains("podcast") && !lowerCase.contains("audiobook") && !lowerCase.contains("book")) {
                    String m1899e = m1899e(String.valueOf(optJSONObject3.opt("id")));
                    if (m1899e.isEmpty() || "null".equals(m1899e)) {
                        c0043j = null;
                    } else {
                        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("albums");
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            JSONObject optJSONObject4 = optJSONArray2.optJSONObject(0);
                            str7 = optJSONObject4 != null ? m1899e(String.valueOf(optJSONObject4.opt("id"))) : "";
                        }
                        str7 = "";
                        c0043j = new C0043j(m1899e, str7);
                    }
                    if (c0043j != null) {
                        if (c0043j2 == null) {
                            c0043j2 = c0043j;
                        }
                        String m1900f3 = m1900f(optJSONObject3.optString("title", ""));
                        JSONArray optJSONArray3 = optJSONObject3.optJSONArray("artists");
                        if (optJSONArray3 == null) {
                            str6 = "";
                        } else {
                            StringBuilder sb = new StringBuilder();
                            for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                                JSONObject optJSONObject5 = optJSONArray3.optJSONObject(i2);
                                if (optJSONObject5 != null) {
                                    if (sb.length() > 0) {
                                        sb.append(' ');
                                    }
                                    sb.append(m1900f(optJSONObject5.optString("name", "")));
                                }
                            }
                            str6 = sb.toString();
                        }
                        if (!m1900f.isEmpty() && m1900f3.equals(m1900f) && (m1900f2.isEmpty() || str6.contains(m1900f2) || m1900f2.contains(str6))) {
                            return c0043j;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return c0043j2;
    }

    /* renamed from: m */
    public static C0043j m1907m(Context context, C0043j c0043j) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        if (!((String) c0043j.f142h).isEmpty()) {
            return c0043j;
        }
        try {
            StringBuilder sb = new StringBuilder("/tracks/");
            String str = (String) c0043j.f141g;
            sb.append(URLEncoder.encode(str == null ? "" : str, "UTF-8"));
            Object opt = m1896b(context, sb.toString()).opt("result");
            JSONObject optJSONObject2 = opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : opt instanceof JSONObject ? (JSONObject) opt : null;
            if (optJSONObject2 == null || (optJSONArray = optJSONObject2.optJSONArray("albums")) == null || optJSONArray.length() == 0 || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                return c0043j;
            }
            String m1899e = m1899e(String.valueOf(optJSONObject.opt("id")));
            return m1899e.isEmpty() ? c0043j : new C0043j(str, m1899e);
        } catch (Exception unused) {
            return c0043j;
        }
    }
}
