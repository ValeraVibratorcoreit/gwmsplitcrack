package p109u0;

import android.content.Context;
import android.util.Log;
import com.altaysoft.t500_split.R;
import com.altaysoft.themecrypt.ThemeCrypt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import p003B.C0043j;

/* renamed from: u0.o1 */
/* loaded from: classes.dex */
public final class C1563o1 {

    /* renamed from: a */
    public String f8494a = "User Theme 1";

    /* renamed from: b */
    public int f8495b = 1920;

    /* renamed from: c */
    public int f8496c = 720;

    /* renamed from: d */
    public boolean f8497d = false;

    /* renamed from: e */
    public boolean f8498e = false;

    /* renamed from: f */
    public C1557m1 f8499f = new C1557m1();

    /* renamed from: g */
    public boolean f8500g = true;

    /* renamed from: h */
    public String f8501h = "theme1_bg.png";

    /* renamed from: i */
    public String f8502i = "image";

    /* renamed from: j */
    public String f8503j = "#FF000000";

    /* renamed from: k */
    public String f8504k = "#FF000000";

    /* renamed from: l */
    public String f8505l = "tb";

    /* renamed from: m */
    public C1554l1 f8506m = new C1554l1();

    /* renamed from: n */
    public C1554l1 f8507n = new C1554l1();

    /* renamed from: o */
    public C1551k1 f8508o = new C1551k1(0);

    /* renamed from: p */
    public C1551k1 f8509p = new C1551k1(1);

    /* renamed from: q */
    public C1551k1 f8510q = new C1551k1(2);

    /* renamed from: r */
    public final ArrayList f8511r = new ArrayList();

    /* renamed from: a */
    public static boolean m4300a(String str) {
        return str != null && ("right".equalsIgnoreCase(str) || "topright".equalsIgnoreCase(str));
    }

    /* renamed from: b */
    public static boolean m4301b(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        if (m4300a(str)) {
            return false;
        }
        return "center".equalsIgnoreCase(str) || "top".equalsIgnoreCase(str);
    }

    /* renamed from: c */
    public static boolean m4302c(String str) {
        return str == null || str.isEmpty() || "center".equalsIgnoreCase(str) || "left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str);
    }

    /* renamed from: d */
    public static String m4303d(String str, String str2) {
        boolean z2 = (str == null || str.isEmpty() || m4302c(str)) ? false : true;
        return "center".equals(str2) ? z2 ? "top" : "center" : "right".equals(str2) ? z2 ? "topright" : "right" : z2 ? "topleft" : "left";
    }

    /* renamed from: e */
    public static boolean m4304e(C1560n1 c1560n1) {
        String str = c1560n1.f8436J;
        return "left".equals(str) || "right".equals(str) || "center".equals(str);
    }

    /* renamed from: f */
    public static C0043j m4305f(Context context, int i) {
        String m4456h = AbstractC1569q1.m4456h(i);
        File m4467s = AbstractC1569q1.m4467s(i, m4456h);
        if (!m4467s.isFile()) {
            return C0043j.m63x(context.getString(R.string.user_theme_no_layout, m4467s.getAbsolutePath()));
        }
        try {
            byte[] m4314p = m4314p(m4467s);
            String unwrapToJson = ThemeCrypt.unwrapToJson(context, m4314p);
            if (unwrapToJson != null && !unwrapToJson.trim().isEmpty()) {
                Log.i("UserTheme", "layout loaded: " + m4467s.getAbsolutePath() + " (" + m4314p.length + " B)");
                return m4308j(context, unwrapToJson, i, m4467s.getAbsolutePath());
            }
            return C0043j.m63x(context.getString(R.string.user_theme_empty_layout, m4467s.getAbsolutePath()));
        } catch (Exception e2) {
            return C0043j.m63x(context.getString(R.string.user_theme_read_error, m4456h, e2.getMessage() != null ? e2.getMessage() : e2.getClass().getSimpleName()));
        }
    }

    /* renamed from: h */
    public static String m4306h(String str) {
        return ("dd.MM".equals(str) || "dd.MM.yy".equals(str) || "dd.MM.yyyy".equals(str) || "EEE dd.MM".equals(str) || "dd MMM".equals(str)) ? str : "dd.MM";
    }

    /* renamed from: i */
    public static Double m4307i(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    /* renamed from: j */
    public static C0043j m4308j(Context context, String str, int i, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1563o1 c1563o1 = new C1563o1();
            ArrayList arrayList = c1563o1.f8511r;
            c1563o1.f8494a = jSONObject.optString("name", "User Theme " + i);
            jSONObject.optString("description", "");
            jSONObject.optString("author", "");
            jSONObject.optBoolean("showInSplit", true);
            boolean z2 = false;
            c1563o1.f8497d = jSONObject.optBoolean("dontOpenWell", false);
            c1563o1.f8498e = jSONObject.optBoolean("dontCutNavi", false);
            c1563o1.f8499f = C1557m1.m4292b(jSONObject.optJSONObject("needleTail"));
            JSONObject optJSONObject = jSONObject.optJSONObject("canvas");
            if (optJSONObject != null) {
                c1563o1.f8495b = optJSONObject.optInt("width", 1920);
                c1563o1.f8496c = optJSONObject.optInt("height", 720);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("background");
            if (optJSONObject2 != null) {
                c1563o1.f8500g = optJSONObject2.optBoolean("visible", true);
                int i2 = AbstractC1569q1.f8666a;
                c1563o1.f8501h = optJSONObject2.optString("file", "theme" + i + "_bg.png");
                c1563o1.f8502i = optJSONObject2.optString("mode", "image");
                c1563o1.f8503j = optJSONObject2.optString("color", "#FF000000");
                c1563o1.f8504k = optJSONObject2.optString("color2", "#FF000000");
                c1563o1.f8505l = optJSONObject2.optString("gradientDir", "tb");
            } else {
                int i3 = AbstractC1569q1.f8666a;
                c1563o1.f8501h = "theme" + i + "_bg.png";
            }
            c1563o1.m4315g();
            JSONObject optJSONObject3 = jSONObject.optJSONObject("gauges");
            if (optJSONObject3 == null) {
                return C0043j.m63x(context.getString(R.string.user_theme_no_gauges, str2));
            }
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("speedometer");
            JSONObject optJSONObject5 = optJSONObject3.optJSONObject("tachometer");
            if (optJSONObject4 == null) {
                return C0043j.m63x(context.getString(R.string.user_theme_no_speedo, str2));
            }
            if (optJSONObject5 == null) {
                return C0043j.m63x(context.getString(R.string.user_theme_no_tacho, str2));
            }
            c1563o1.f8506m = m4310l(optJSONObject4, true, i);
            c1563o1.f8507n = m4310l(optJSONObject5, false, i);
            c1563o1.f8508o = m4309k(jSONObject.optJSONObject("extraScreens"));
            c1563o1.f8509p = m4311m(jSONObject.optJSONObject("mediaWindow"));
            c1563o1.f8510q = m4312n(jSONObject.optJSONObject("naviWindow"));
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                    if (!jSONObject2.optString("id", "").endsWith("_unit")) {
                        arrayList.add(m4313o(jSONObject2));
                    }
                }
            }
            Iterator it = arrayList.iterator();
            Object obj = null;
            C1560n1 c1560n1 = null;
            while (it.hasNext()) {
                C1560n1 c1560n12 = (C1560n1) it.next();
                if (c1560n12 != null && (str3 = c1560n12.f8453a) != null) {
                    if ("day".equals(str3)) {
                        z2 = true;
                    }
                    if ("trip".equals(c1560n12.f8453a)) {
                        c1560n1 = c1560n12;
                    }
                }
            }
            if (!z2 && c1560n1 != null) {
                c1560n1.f8453a = "day";
            }
            return new C0043j(c1563o1, 17, obj);
        } catch (Exception e2) {
            return C0043j.m63x(context.getString(R.string.user_theme_parse_error, str2, e2.getMessage() != null ? e2.getMessage() : e2.getClass().getSimpleName()));
        }
    }

    /* renamed from: k */
    public static C1551k1 m4309k(JSONObject jSONObject) {
        C1551k1 c1551k1 = new C1551k1(0);
        if (jSONObject == null) {
            return c1551k1;
        }
        c1551k1.f8366a = jSONObject.optInt("x", 725);
        c1551k1.f8367b = jSONObject.optInt("y", c1551k1.f8367b);
        c1551k1.f8368c = jSONObject.optInt("width", c1551k1.f8368c);
        c1551k1.f8369d = jSONObject.optInt("height", c1551k1.f8369d);
        return c1551k1;
    }

    /* renamed from: l */
    public static C1554l1 m4310l(JSONObject jSONObject, boolean z2, int i) {
        String str;
        String str2;
        C1554l1 c1554l1 = new C1554l1();
        c1554l1.f8375a = jSONObject.optBoolean("visible", true);
        int i2 = AbstractC1569q1.f8666a;
        if (z2) {
            str = "theme" + i + "_spd.png";
        } else {
            str = "theme" + i + "_rpm.png";
        }
        c1554l1.f8376b = jSONObject.optString("file", str);
        if (z2) {
            str2 = "theme" + i + "_needle_spd.png";
        } else {
            str2 = "theme" + i + "_needle_rpm.png";
        }
        c1554l1.f8377c = jSONObject.optString("needleFile", str2);
        c1554l1.f8378d = jSONObject.optInt("x", z2 ? 85 : 1355);
        c1554l1.f8379e = jSONObject.optInt("y", 200);
        c1554l1.f8380f = jSONObject.optInt("size", 480);
        c1554l1.f8381g = (float) jSONObject.optDouble("scale", 1.0d);
        c1554l1.f8383i = (float) jSONObject.optDouble("angleMax", 135.0d);
        if (jSONObject.has("angleMin")) {
            c1554l1.f8382h = (float) jSONObject.optDouble("angleMin", -c1554l1.f8383i);
        } else {
            c1554l1.f8382h = -c1554l1.f8383i;
        }
        c1554l1.f8384j = (float) jSONObject.optDouble("valueMin", 0.0d);
        c1554l1.f8385k = (float) jSONObject.optDouble("valueMax", z2 ? 220.0d : 8.0d);
        return c1554l1;
    }

    /* renamed from: m */
    public static C1551k1 m4311m(JSONObject jSONObject) {
        C1551k1 c1551k1 = new C1551k1(1);
        if (jSONObject == null) {
            return c1551k1;
        }
        c1551k1.f8366a = jSONObject.optInt("x", 721);
        c1551k1.f8367b = jSONObject.optInt("y", c1551k1.f8367b);
        c1551k1.f8368c = jSONObject.optInt("width", c1551k1.f8368c);
        c1551k1.f8369d = jSONObject.optInt("height", c1551k1.f8369d);
        return c1551k1;
    }

    /* renamed from: n */
    public static C1551k1 m4312n(JSONObject jSONObject) {
        C1551k1 c1551k1 = new C1551k1(2);
        if (jSONObject == null) {
            return c1551k1;
        }
        c1551k1.f8366a = jSONObject.optInt("x", 610);
        c1551k1.f8367b = jSONObject.optInt("y", c1551k1.f8367b);
        c1551k1.f8368c = jSONObject.optInt("width", c1551k1.f8368c);
        int optInt = jSONObject.optInt("height", c1551k1.f8369d);
        c1551k1.f8369d = optInt;
        if (c1551k1.f8368c <= 0) {
            c1551k1.f8368c = 703;
        }
        if (optInt <= 0) {
            c1551k1.f8369d = 575;
        }
        return c1551k1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0296, code lost:
    
        if (r1 > 30000) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0178, code lost:
    
        if ("center".equals(r1) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0294  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1560n1 m4313o(JSONObject jSONObject) {
        String lowerCase;
        String optString;
        float optDouble;
        String str;
        String str2;
        C1560n1 c1560n1 = new C1560n1();
        c1560n1.f8453a = jSONObject.optString("id", "");
        c1560n1.f8455b = jSONObject.optBoolean("visible", true);
        c1560n1.f8457c = jSONObject.optBoolean("showValue", true);
        c1560n1.f8459d = jSONObject.optInt("x", 0);
        c1560n1.f8461e = jSONObject.optInt("y", 0);
        c1560n1.f8463f = jSONObject.optString("anchor", "center");
        c1560n1.f8465g = jSONObject.optInt("decimals", 0);
        c1560n1.f8467h = jSONObject.optString("font", "sans-serif");
        c1560n1.f8469i = (float) jSONObject.optDouble("fontSize", 24.0d);
        c1560n1.f8471j = jSONObject.optBoolean("bold", false);
        c1560n1.f8473k = jSONObject.optBoolean("italic", false);
        c1560n1.f8475l = (float) jSONObject.optDouble("outlineWidth", 0.0d);
        c1560n1.f8477m = jSONObject.optString("outlineColor", "#FF000000");
        c1560n1.f8479n = jSONObject.optString("color", "#FFFFFF");
        c1560n1.f8480o = m4307i(jSONObject, "warnMin");
        c1560n1.f8481p = m4307i(jSONObject, "warnMax");
        c1560n1.f8482q = m4307i(jSONObject, "alarmMin");
        c1560n1.f8483r = m4307i(jSONObject, "alarmMax");
        c1560n1.f8484s = jSONObject.optString("colorWarn", "#FFCC00");
        c1560n1.f8485t = jSONObject.optString("colorAlarm", "#FF3333");
        c1560n1.f8486u = jSONObject.optString("sample", "");
        c1560n1.f8487v = jSONObject.optString("text", "");
        c1560n1.f8488w = jSONObject.optInt("iconSize", 0);
        c1560n1.f8489x = jSONObject.optString("unit", "");
        boolean z2 = "inst_fuel".equals(c1560n1.f8453a) && jSONObject.has("unitIdle");
        c1560n1.f8491z = z2;
        c1560n1.f8490y = z2 ? jSONObject.optString("unitIdle", "") : "";
        c1560n1.f8427A = jSONObject.optBoolean("showUnit", !c1560n1.f8489x.isEmpty());
        c1560n1.f8428B = jSONObject.optString("unitColor", "#747679");
        c1560n1.f8429C = jSONObject.optBoolean("unitOwnFont", false);
        c1560n1.f8430D = jSONObject.optString("unitFont", "sans-serif");
        c1560n1.f8431E = (float) jSONObject.optDouble("unitFontSize", 22.0d);
        c1560n1.f8432F = jSONObject.optBoolean("unitBold", false);
        c1560n1.f8433G = jSONObject.optBoolean("unitItalic", false);
        c1560n1.f8434H = jSONObject.optInt("unitOffsetX", 0);
        c1560n1.f8435I = jSONObject.optInt("unitOffsetY", 0);
        String optString2 = jSONObject.optString("hAnchor", "");
        if (optString2 != null) {
            lowerCase = optString2.trim().toLowerCase(Locale.US);
            if (!"left".equals(lowerCase)) {
                if (!"right".equals(lowerCase)) {
                }
            }
            c1560n1.f8436J = lowerCase;
            if (m4304e(c1560n1)) {
                c1560n1.f8463f = m4303d(c1560n1.f8463f, c1560n1.f8436J);
            }
            optString = jSONObject.optString("displayMode", "digits");
            if (!"bar_h".equals(optString) || "bar_v".equals(optString) || "bar_arc".equals(optString) || "digits".equals(optString)) {
                c1560n1.f8437K = optString;
            } else {
                c1560n1.f8437K = "digits";
            }
            c1560n1.f8438L = jSONObject.optDouble("barMin", 0.0d);
            c1560n1.f8439M = jSONObject.optDouble("barMax", 100.0d);
            c1560n1.f8440N = jSONObject.optInt("barWidth", 200);
            c1560n1.f8441O = jSONObject.optInt("barHeight", 24);
            c1560n1.f8442P = jSONObject.optString("barColorFill", "#FF4FC3F7");
            c1560n1.f8443Q = jSONObject.optString("barColorEmpty", "#664FC3F7");
            c1560n1.f8444R = jSONObject.optString("barColorFill2", "#FFFFFFFF");
            c1560n1.f8445S = jSONObject.optBoolean("barGradient", false);
            c1560n1.f8446T = (int) Math.round(jSONObject.optDouble("barOpacity", 100.0d));
            c1560n1.f8447U = jSONObject.optString("clockFormat", "24");
            c1560n1.f8448V = jSONObject.optString("dateFormat", "dd.MM");
            c1560n1.f8449W = Math.max(1, Math.min(64, jSONObject.optInt("barSegments", 1)));
            c1560n1.f8450X = jSONObject.optBoolean("barRoundedEnds", false);
            c1560n1.f8451Y = (float) jSONObject.optDouble("barArcStart", -135.0d);
            c1560n1.f8452Z = (float) jSONObject.optDouble("barArcSweep", 270.0d);
            c1560n1.f8454a0 = (float) jSONObject.optDouble("barArcStroke", 20.0d);
            c1560n1.f8456b0 = jSONObject.optBoolean("barArcClockwise", true);
            c1560n1.f8458c0 = jSONObject.optBoolean("barInvert", false);
            c1560n1.f8460d0 = jSONObject.optBoolean("showDigitsWithBar", false);
            c1560n1.f8466g0 = jSONObject.optBoolean("average", false);
            int optInt = jSONObject.optInt("averageMs", 1000);
            int i = optInt >= 50 ? 30000 : 50;
            optInt = i;
            c1560n1.f8468h0 = optInt;
            c1560n1.f8462e0 = jSONObject.optInt("digitsOffsetX", 0);
            c1560n1.f8464f0 = jSONObject.optInt("digitsOffsetY", 0);
            c1560n1.f8470i0 = jSONObject.optString("imageFile", "");
            optDouble = (float) jSONObject.optDouble("imageScale", 1.0d);
            c1560n1.f8472j0 = optDouble;
            if (optDouble < 0.05f) {
                c1560n1.f8472j0 = 0.05f;
            }
            if (c1560n1.f8472j0 > 8.0f) {
                c1560n1.f8472j0 = 8.0f;
            }
            c1560n1.f8474k0 = jSONObject.optBoolean("showAsNeedle", false);
            c1560n1.f8476l0 = (float) jSONObject.optDouble("needleAngleMin", 37.5d);
            c1560n1.f8478m0 = (float) jSONObject.optDouble("needleAngleMax", -37.5d);
            if (c1560n1.f8446T < 0) {
                c1560n1.f8446T = 0;
            }
            if (c1560n1.f8446T > 100) {
                c1560n1.f8446T = 100;
            }
            c1560n1.f8447U = "12".equals(c1560n1.f8447U) ? "12" : "24";
            c1560n1.f8448V = m4306h(c1560n1.f8448V);
            str = c1560n1.f8444R;
            if (str != null || str.isEmpty()) {
                c1560n1.f8444R = "#FFFFFFFF";
            }
            if (c1560n1.f8452Z < 1.0f) {
                c1560n1.f8452Z = 1.0f;
            }
            if (c1560n1.f8452Z > 360.0f) {
                c1560n1.f8452Z = 360.0f;
            }
            if (c1560n1.f8454a0 < 1.0f) {
                c1560n1.f8454a0 = 1.0f;
            }
            if (c1560n1.f8454a0 > 400.0f) {
                c1560n1.f8454a0 = 400.0f;
            }
            if (c1560n1.f8475l < 0.0f) {
                c1560n1.f8475l = 0.0f;
            }
            if (c1560n1.f8475l > 20.0f) {
                c1560n1.f8475l = 20.0f;
            }
            str2 = c1560n1.f8477m;
            if (str2 != null || str2.isEmpty()) {
                c1560n1.f8477m = "#FF000000";
            }
            return c1560n1;
        }
        lowerCase = "";
        c1560n1.f8436J = lowerCase;
        if (m4304e(c1560n1)) {
        }
        optString = jSONObject.optString("displayMode", "digits");
        if ("bar_h".equals(optString)) {
        }
        c1560n1.f8437K = optString;
        c1560n1.f8438L = jSONObject.optDouble("barMin", 0.0d);
        c1560n1.f8439M = jSONObject.optDouble("barMax", 100.0d);
        c1560n1.f8440N = jSONObject.optInt("barWidth", 200);
        c1560n1.f8441O = jSONObject.optInt("barHeight", 24);
        c1560n1.f8442P = jSONObject.optString("barColorFill", "#FF4FC3F7");
        c1560n1.f8443Q = jSONObject.optString("barColorEmpty", "#664FC3F7");
        c1560n1.f8444R = jSONObject.optString("barColorFill2", "#FFFFFFFF");
        c1560n1.f8445S = jSONObject.optBoolean("barGradient", false);
        c1560n1.f8446T = (int) Math.round(jSONObject.optDouble("barOpacity", 100.0d));
        c1560n1.f8447U = jSONObject.optString("clockFormat", "24");
        c1560n1.f8448V = jSONObject.optString("dateFormat", "dd.MM");
        c1560n1.f8449W = Math.max(1, Math.min(64, jSONObject.optInt("barSegments", 1)));
        c1560n1.f8450X = jSONObject.optBoolean("barRoundedEnds", false);
        c1560n1.f8451Y = (float) jSONObject.optDouble("barArcStart", -135.0d);
        c1560n1.f8452Z = (float) jSONObject.optDouble("barArcSweep", 270.0d);
        c1560n1.f8454a0 = (float) jSONObject.optDouble("barArcStroke", 20.0d);
        c1560n1.f8456b0 = jSONObject.optBoolean("barArcClockwise", true);
        c1560n1.f8458c0 = jSONObject.optBoolean("barInvert", false);
        c1560n1.f8460d0 = jSONObject.optBoolean("showDigitsWithBar", false);
        c1560n1.f8466g0 = jSONObject.optBoolean("average", false);
        int optInt2 = jSONObject.optInt("averageMs", 1000);
        if (optInt2 >= 50) {
        }
        optInt2 = i;
        c1560n1.f8468h0 = optInt2;
        c1560n1.f8462e0 = jSONObject.optInt("digitsOffsetX", 0);
        c1560n1.f8464f0 = jSONObject.optInt("digitsOffsetY", 0);
        c1560n1.f8470i0 = jSONObject.optString("imageFile", "");
        optDouble = (float) jSONObject.optDouble("imageScale", 1.0d);
        c1560n1.f8472j0 = optDouble;
        if (optDouble < 0.05f) {
        }
        if (c1560n1.f8472j0 > 8.0f) {
        }
        c1560n1.f8474k0 = jSONObject.optBoolean("showAsNeedle", false);
        c1560n1.f8476l0 = (float) jSONObject.optDouble("needleAngleMin", 37.5d);
        c1560n1.f8478m0 = (float) jSONObject.optDouble("needleAngleMax", -37.5d);
        if (c1560n1.f8446T < 0) {
        }
        if (c1560n1.f8446T > 100) {
        }
        c1560n1.f8447U = "12".equals(c1560n1.f8447U) ? "12" : "24";
        c1560n1.f8448V = m4306h(c1560n1.f8448V);
        str = c1560n1.f8444R;
        if (str != null) {
        }
        c1560n1.f8444R = "#FFFFFFFF";
        if (c1560n1.f8452Z < 1.0f) {
        }
        if (c1560n1.f8452Z > 360.0f) {
        }
        if (c1560n1.f8454a0 < 1.0f) {
        }
        if (c1560n1.f8454a0 > 400.0f) {
        }
        if (c1560n1.f8475l < 0.0f) {
        }
        if (c1560n1.f8475l > 20.0f) {
        }
        str2 = c1560n1.f8477m;
        if (str2 != null) {
        }
        c1560n1.f8477m = "#FF000000";
        return c1560n1;
    }

    /* renamed from: p */
    public static byte[] m4314p(File file) {
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

    /* renamed from: g */
    public final void m4315g() {
        String str = this.f8502i;
        if (!"fill".equals(str) && !"gradient".equals(str)) {
            str = "image";
        }
        this.f8502i = str;
        this.f8505l = "lr".equals(this.f8505l) ? "lr" : "tb";
        String str2 = this.f8503j;
        if (str2 == null || str2.isEmpty()) {
            this.f8503j = "#FF000000";
        }
        String str3 = this.f8504k;
        if (str3 == null || str3.isEmpty()) {
            this.f8504k = "#FF000000";
        }
    }
}
