package p098q0;

import android.content.Context;
import android.content.res.AssetManager;
import com.altaysoft.t500_split.cfgData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import p097q.AbstractC1241e;

/* renamed from: q0.b0 */
/* loaded from: classes.dex */
public final class C1302b0 {

    /* renamed from: b */
    public static final Pattern f6060b = Pattern.compile("\\{WRN_\\d+\\}");

    /* renamed from: c */
    public static final Pattern f6061c = Pattern.compile("[ \\t]{2,}");

    /* renamed from: a */
    public final HashMap f6062a = new HashMap();

    /* renamed from: a */
    public static String m3157a(String str, int i, int i2) {
        String str2;
        if (str == null || str.isEmpty() || !str.contains("{")) {
            return str;
        }
        boolean z2 = i > 1;
        String num = z2 ? Integer.toString(i) : "";
        int m2943b = AbstractC1241e.m2943b(i2);
        if (m2943b == 1) {
            if (z2) {
                str2 = " km/h";
            }
            str2 = "";
        } else if (m2943b != 2) {
            if (z2) {
                str2 = " км/ч";
            }
            str2 = "";
        } else {
            if (z2) {
                str2 = " كم/س";
            }
            str2 = "";
        }
        return f6061c.matcher(f6060b.matcher(str.replace("{WARNING_UNIT}", str2).replace("{$1$2}", num).replace("{$3$4}", "")).replaceAll(num)).replaceAll(" ").trim();
    }

    /* renamed from: b */
    public static int m3158b(Context context) {
        if (cfgData.m1784i().f2508D3 == 12) {
            return 3;
        }
        String language = Locale.getDefault().getLanguage();
        if ("ar".equalsIgnoreCase(language)) {
            return 3;
        }
        if ("en".equalsIgnoreCase(language)) {
            return 2;
        }
        if (context == null) {
            return 1;
        }
        String language2 = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        if ("ar".equalsIgnoreCase(language2)) {
            return 3;
        }
        return "en".equalsIgnoreCase(language2) ? 2 : 1;
    }

    /* renamed from: c */
    public static C1302b0 m3159c(Context context) {
        C1302b0 c1302b0 = new C1302b0();
        HashMap m3160d = m3160d(context, 1);
        HashMap m3160d2 = m3160d(context, 2);
        HashMap m3160d3 = m3160d(context, 3);
        for (Map.Entry entry : m3160d.entrySet()) {
            Integer num = (Integer) entry.getKey();
            num.getClass();
            C1299a0 c1299a0 = (C1299a0) entry.getValue();
            C1299a0 c1299a02 = (C1299a0) m3160d2.get(num);
            C1299a0 c1299a03 = (C1299a0) m3160d3.get(num);
            c1302b0.f6062a.put(num, new C1296Z(c1299a0.f6054a, c1299a0.f6055b, c1299a0.f6056c, c1299a02 != null ? c1299a02.f6056c : "", c1299a03 != null ? c1299a03.f6056c : ""));
        }
        return c1302b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap m3160d(Context context, int i) {
        String str;
        InputStream open;
        BufferedReader bufferedReader;
        int parseInt;
        String str2;
        String trim;
        int i2;
        String str3;
        Locale locale;
        String str4;
        char c2 = 0;
        HashMap hashMap = new HashMap();
        try {
            AssetManager assets = context.getAssets();
            if (i == 1) {
                str = "ip_msg0.tsv";
            } else if (i == 2) {
                str = "ip_msg1.tsv";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "ip_msg2.tsv";
            }
            open = assets.open(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
            } finally {
            }
        } catch (IOException unused) {
        }
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    if (open != null) {
                        open.close();
                    }
                    return hashMap;
                }
                if (!readLine.isEmpty() && !readLine.startsWith("#")) {
                    String[] split = readLine.split("\t", 6);
                    if (split.length >= 5 && !"code".equalsIgnoreCase(split[c2].trim())) {
                        try {
                            parseInt = Integer.parseInt(split[c2].trim());
                            String str5 = split[3];
                            str2 = "";
                            trim = str5 != null ? str5.trim() : "";
                        } catch (NumberFormatException unused2) {
                        }
                        if (split.length >= 6 && (str3 = split[4]) != null) {
                            String trim2 = str3.trim();
                            locale = Locale.ROOT;
                            String lowerCase = trim2.toLowerCase(locale);
                            lowerCase.getClass();
                            switch (lowerCase) {
                                case "info":
                                case "warn":
                                case "alarm":
                                    String str6 = split[4];
                                    if (str6 != null) {
                                        String lowerCase2 = str6.trim().toLowerCase(locale);
                                        lowerCase2.getClass();
                                        if (lowerCase2.equals("info")) {
                                            i2 = 2;
                                        } else if (lowerCase2.equals("alarm")) {
                                            i2 = 3;
                                        }
                                        str4 = split[5];
                                        if (str4 != null) {
                                            str2 = str4;
                                            break;
                                        }
                                    }
                                    i2 = 1;
                                    str4 = split[5];
                                    if (str4 != null) {
                                    }
                                    break;
                            }
                            hashMap.put(Integer.valueOf(parseInt), new C1299a0(i2, trim, str2));
                            c2 = 0;
                        }
                        String str7 = split[4];
                        str2 = str7 != null ? str7 : "";
                        i2 = 1;
                        hashMap.put(Integer.valueOf(parseInt), new C1299a0(i2, trim, str2));
                        c2 = 0;
                    }
                }
            } finally {
            }
        }
    }
}
