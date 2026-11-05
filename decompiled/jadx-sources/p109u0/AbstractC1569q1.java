package p109u0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Environment;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.themecrypt.ThemeCrypt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p098q0.AbstractC1372y1;
import p106t0.EnumC1456b;

/* renamed from: u0.q1 */
/* loaded from: classes.dex */
public abstract class AbstractC1569q1 {

    /* renamed from: a */
    public static volatile int f8666a = 725;

    /* renamed from: b */
    public static volatile int f8667b = 240;

    /* renamed from: c */
    public static volatile boolean f8668c = true;

    /* renamed from: d */
    public static final AtomicReference f8669d = new AtomicReference();

    /* renamed from: e */
    public static final C1566p1[] f8670e = new C1566p1[9];

    /* renamed from: a */
    public static void m4449a(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m4449a(file2);
            }
        }
        file.delete();
    }

    /* renamed from: b */
    public static void m4450b(Context context, cfgData cfgdata) {
        if (cfgdata == null) {
            return;
        }
        EnumC1456b enumC1456b = EnumC1456b.nostalgia;
        cfgdata.f2620e1 = 0;
        cfgdata.f2615d1 = enumC1456b;
        carData.getInstance().setIPThemeID(cfgdata.f2620e1);
        if (context != null) {
            try {
                cfgdata.m1795o(context);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m4451c() {
        cfgData m1784i = cfgData.m1784i();
        return m1784i != null && m1784i.f2513E3 == 2;
    }

    /* renamed from: d */
    public static boolean m4452d(int i) {
        if (i < 1 || i > 9) {
            return false;
        }
        return m4467s(i, m4456h(i)).isFile();
    }

    /* renamed from: e */
    public static boolean m4453e(int i) {
        if (m4455g(i)) {
            return m4454f(i - EnumC1456b.values().length);
        }
        cfgData m1784i = cfgData.m1784i();
        if (m1784i == null || m1784i.f2513E3 != 2) {
            return i >= 0 && i < EnumC1456b.values().length;
        }
        EnumC1456b enumC1456b = EnumC1456b.nostalgia;
        return i == 0;
    }

    /* renamed from: f */
    public static boolean m4454f(int i) {
        if (i >= 0) {
            cfgData m1784i = cfgData.m1784i();
            if (i < ((m1784i == null || m1784i.f2513E3 != 2) ? 9 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m4455g(int i) {
        return i >= EnumC1456b.values().length && i < EnumC1456b.values().length + 9;
    }

    /* renamed from: h */
    public static String m4456h(int i) {
        return "theme" + i + "_layout.json";
    }

    /* renamed from: i */
    public static C1566p1 m4457i(Context context, int i) {
        C1566p1 c1566p1 = new C1566p1();
        c1566p1.f8527a = -1L;
        c1566p1.f8528b = true;
        c1566p1.f8530d = 610;
        c1566p1.f8531e = 100;
        c1566p1.f8532f = 703;
        c1566p1.f8533g = 575;
        if (i >= 1 && i <= 9) {
            File m4467s = m4467s(i, m4456h(i));
            if (!m4467s.isFile()) {
                return c1566p1;
            }
            int i2 = i - 1;
            long lastModified = m4467s.lastModified();
            C1566p1[] c1566p1Arr = f8670e;
            C1566p1 c1566p12 = c1566p1Arr[i2];
            if (c1566p12 != null && c1566p12.f8527a == lastModified) {
                return c1566p12;
            }
            c1566p1.f8527a = lastModified;
            c1566p1.f8528b = true;
            String str = null;
            c1566p1.f8529c = null;
            if (context != null) {
                try {
                    String unwrapToJson = ThemeCrypt.unwrapToJson(context, m4461m(m4467s));
                    if (unwrapToJson != null && !unwrapToJson.trim().isEmpty()) {
                        JSONObject jSONObject = new JSONObject(unwrapToJson);
                        c1566p1.f8528b = jSONObject.optBoolean("showInSplit", true);
                        String trim = jSONObject.optString("name", "").trim();
                        if (!trim.isEmpty()) {
                            str = trim;
                        }
                        c1566p1.f8529c = str;
                        JSONObject optJSONObject = jSONObject.optJSONObject("naviWindow");
                        if (optJSONObject != null) {
                            c1566p1.f8530d = optJSONObject.optInt("x", 610);
                            c1566p1.f8531e = optJSONObject.optInt("y", 100);
                            c1566p1.f8532f = optJSONObject.optInt("width", 703);
                            int optInt = optJSONObject.optInt("height", 575);
                            c1566p1.f8533g = optInt;
                            if (c1566p1.f8532f <= 0) {
                                c1566p1.f8532f = 703;
                            }
                            if (optInt <= 0) {
                                c1566p1.f8533g = 575;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            c1566p1Arr[i2] = c1566p1;
        }
        return c1566p1;
    }

    /* renamed from: j */
    public static Bitmap m4458j(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        File m4463o = m4463o(str);
        if (m4463o.isFile()) {
            return BitmapFactory.decodeFile(m4463o.getAbsolutePath());
        }
        return null;
    }

    /* renamed from: k */
    public static Rect m4459k(MainActivity mainActivity, int i) {
        if (!m4455g(i)) {
            return AbstractC1539g1.m4231n(0);
        }
        C1566p1 m4457i = m4457i(mainActivity, m4466r(i));
        int i2 = m4457i.f8530d;
        int i3 = m4457i.f8531e;
        return new Rect(i2, i3, m4457i.f8532f + i2, m4457i.f8533g + i3);
    }

    /* renamed from: l */
    public static String m4460l(int i) {
        return "theme" + i + "_needle_small.png";
    }

    /* renamed from: m */
    public static byte[] m4461m(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read < 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        fileInputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    public static void m4462n(boolean z2, String str, ArrayList arrayList, ArrayList arrayList2) {
        if (!z2 || str == null || str.isEmpty()) {
            return;
        }
        File m4463o = m4463o(str);
        if (!m4463o.isFile()) {
            arrayList.add(str);
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(m4463o.getAbsolutePath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            arrayList2.add(str + " (" + m4463o.length() + " B)");
        }
    }

    /* renamed from: o */
    public static File m4463o(String str) {
        int i = 1;
        if (str != null && !str.isEmpty() && str.startsWith("theme")) {
            if (str.length() > 5) {
                int i2 = 0;
                for (int i3 = 5; i3 < str.length() && Character.isDigit(str.charAt(i3)); i3++) {
                    i2 = (i2 * 10) + (str.charAt(i3) - '0');
                }
                if (i2 >= 1 && i2 <= 9) {
                    i = i2;
                }
            }
        }
        return m4467s(i, str);
    }

    /* renamed from: p */
    public static void m4464p(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            AbstractC1372y1.m3288S(context, context.getString(R.string.user_theme_error_title), str, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    public static File m4465q(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            externalStorageDirectory = new File("/storage/emulated/0");
        }
        return new File(new File(externalStorageDirectory, "gwm_split_user_themes"), AbstractC0062j.m156j(i, "theme"));
    }

    /* renamed from: r */
    public static int m4466r(int i) {
        return (i - EnumC1456b.values().length) + 1;
    }

    /* renamed from: s */
    public static File m4467s(int i, String str) {
        return new File(m4465q(i), str);
    }

    /* renamed from: t */
    public static String m4468t(Context context, cfgData cfgdata) {
        if (context == null || cfgdata == null) {
            return null;
        }
        if (!m4453e(cfgdata.f2620e1)) {
            m4450b(context, cfgdata);
            return null;
        }
        if (!m4455g(cfgdata.f2620e1)) {
            return null;
        }
        if (!m4452d(m4466r(cfgdata.f2620e1))) {
            m4450b(context, cfgdata);
            return null;
        }
        String m4469u = m4469u(context, cfgdata.f2620e1);
        if (m4469u == null) {
            return null;
        }
        m4450b(context, cfgdata);
        StringBuilder sb = new StringBuilder();
        sb.append(m4469u);
        sb.append("\n\n");
        EnumC1456b enumC1456b = EnumC1456b.nostalgia;
        sb.append(context.getString(R.string.user_theme_reset_to_first, "Split Ver 1"));
        String sb2 = sb.toString();
        f8669d.set(sb2);
        return sb2;
    }

    /* renamed from: u */
    public static String m4469u(Context context, int i) {
        String str;
        if (context == null) {
            return "Context is null";
        }
        if (!m4455g(i) || !m4454f(i - EnumC1456b.values().length)) {
            return context.getString(R.string.user_theme_slot_denied);
        }
        int m4466r = m4466r(i);
        File m4465q = m4465q(m4466r);
        File m4467s = m4467s(m4466r, m4456h(m4466r));
        if (!m4467s.isFile()) {
            return context.getString(R.string.user_theme_no_layout, m4467s.getAbsolutePath()) + "\n\n" + context.getString(R.string.user_theme_hint_gwm_split_edit);
        }
        C0043j m4305f = C1563o1.m4305f(context, m4466r);
        if (((String) m4305f.f142h) != null) {
            return ((String) m4305f.f142h) + "\n\n" + context.getString(R.string.user_theme_hint_gwm_split_edit);
        }
        C1563o1 c1563o1 = (C1563o1) m4305f.f141g;
        if (c1563o1 == null) {
            return context.getString(R.string.user_theme_build_error, "null layout");
        }
        f8668c = c1563o1.f8500g;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean m4451c = m4451c();
        m4462n((!c1563o1.f8500g || "fill".equals(c1563o1.f8502i) || "gradient".equals(c1563o1.f8502i)) ? false : true, c1563o1.f8501h, arrayList, arrayList2);
        if (!m4451c) {
            C1554l1 c1554l1 = c1563o1.f8506m;
            if (c1554l1.f8375a) {
                m4462n(true, c1554l1.f8376b, arrayList, arrayList2);
                m4462n(true, c1563o1.f8506m.f8377c, arrayList, arrayList2);
            }
            C1554l1 c1554l12 = c1563o1.f8507n;
            if (c1554l12.f8375a) {
                m4462n(true, c1554l12.f8376b, arrayList, arrayList2);
                m4462n(true, c1563o1.f8507n.f8377c, arrayList, arrayList2);
            }
        }
        ArrayList arrayList3 = c1563o1.f8511r;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C1560n1 c1560n1 = (C1560n1) it.next();
                if (c1560n1 != null && c1560n1.f8455b) {
                    if (c1560n1.f8474k0 && ("fuel".equals(c1560n1.f8453a) || "coolant".equals(c1560n1.f8453a))) {
                        m4462n(true, m4460l(m4466r), arrayList, arrayList2);
                    }
                    if (c1560n1.f8457c && (str = c1560n1.f8453a) != null && str.startsWith("image_")) {
                        m4462n(true, c1560n1.f8470i0, arrayList, arrayList2);
                    }
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.user_theme_error_header, Integer.valueOf(m4466r), m4465q.getAbsolutePath()));
        if (!arrayList.isEmpty()) {
            sb.append("\n\n");
            sb.append(context.getString(R.string.user_theme_missing_files));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                sb.append("\n• ");
                sb.append(str2);
            }
        }
        if (!arrayList2.isEmpty()) {
            sb.append("\n\n");
            sb.append(context.getString(R.string.user_theme_bad_images));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str3 = (String) it3.next();
                sb.append("\n• ");
                sb.append(str3);
            }
        }
        sb.append("\n\n");
        sb.append(context.getString(R.string.user_theme_hint_gwm_split_edit));
        return sb.toString().trim();
    }
}
