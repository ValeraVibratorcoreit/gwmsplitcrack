package p098q0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.EnumC0548m;
import com.altaysoft.t500_split.IPOverlayService;
import com.altaysoft.t500_split.MyAccessibilityService;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.p061ip.Theme43BarView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p001A0.RunnableC0005B;
import p016H.C0117i;
import p062d0.C0728a;
import p070g.AbstractActivityC0870i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p097q.AbstractC1241e;
import p106t0.EnumC1455a;
import p106t0.EnumC1456b;
import p106t0.EnumC1457c;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1569q1;
import p109u0.C1541h0;
import p118x0.C1656l;
import p121y0.AbstractC1687o;
import p124z0.RunnableC1704c;

/* renamed from: q0.y1 */
/* loaded from: classes.dex */
public abstract class AbstractC1372y1 {

    /* renamed from: j */
    public static volatile long f6440j;

    /* renamed from: k */
    public static volatile boolean f6441k;

    /* renamed from: n */
    public static C1253D0 f6444n;

    /* renamed from: o */
    public static C1246B f6445o;

    /* renamed from: q */
    public static RunnableC1369x1 f6447q;

    /* renamed from: r */
    public static long f6448r;

    /* renamed from: a */
    public static final carData f6431a = carData.getInstance();

    /* renamed from: b */
    public static final cfgData f6432b = cfgData.m1784i();

    /* renamed from: c */
    public static final String[] f6433c = {"com.gdc.carplay", "com.thunder.carplay", "com.gwm.app.aap"};

    /* renamed from: d */
    public static final String[] f6434d = {"com.gwm.app.carphone"};

    /* renamed from: e */
    public static final String[] f6435e = {"com.altaysoft.t500_split/.configActivity.CFG4", "com.altaysoft.t500_split/.AutoBrightnessSettingsActivity", "com.altaysoft.t500_split/.AutoPresetSettingsActivity", "com.altaysoft.t500_split/.YmSettingsActivity", "com.altaysoft.t500_split/.IpMessagesSettingsActivity", "com.altaysoft.t500_split/.SplitInfoSettingsActivity", "com.altaysoft.t500_split/.SplitBallSettingsActivity", "com.altaysoft.t500_split/.DriveModeSettingsActivity", "com.altaysoft.t500_split/.voice.VoiceSettingsActivity", "com.altaysoft.t500_split/.AppsList", "com.altaysoft.t500_split/.reminders.RemindersActivity", "com.altaysoft.t500_split/.stats.StatisticsActivity", "com.altaysoft.t500_split/.stats.TripsActivity", "com.altaysoft.t500_split/.stats.RefuelsActivity", "com.altaysoft.t500_split/.stats.StatsHelpActivity", "com.altaysoft.t500_split/.splitinfo.WeatherFullscreenActivity", "com.altaysoft.t500_split/.splitinfo.ChartsFullscreenActivity", "com.altaysoft.t500_split/.OssLicensesActivity", "com.altaysoft.t500_split/.Pay", "com.altaysoft.t500_split/.Help"};

    /* renamed from: f */
    public static final String[] f6436f = {"com.gwm.app.hvac"};

    /* renamed from: g */
    public static boolean f6437g = false;

    /* renamed from: h */
    public static volatile boolean f6438h = false;

    /* renamed from: i */
    public static volatile boolean f6439i = false;

    /* renamed from: l */
    public static volatile boolean f6442l = true;

    /* renamed from: m */
    public static volatile boolean f6443m = false;

    /* renamed from: p */
    public static final Handler f6446p = new Handler(Looper.getMainLooper());

    /* renamed from: A */
    public static boolean m3270A(Context context) {
        if (context == null) {
            return false;
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (Settings.System.getInt(contentResolver, "gwm_hvac_panel_status", 0) != 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        return Settings.Global.getInt(contentResolver, "gwm_hvac_panel_states", 0) != 0;
    }

    /* renamed from: B */
    public static boolean m3271B() {
        return carData.getInstance().m1749g() > -1;
    }

    /* renamed from: C */
    public static boolean m3272C() {
        cfgData m1784i = cfgData.m1784i();
        return AbstractC1539g1.m4198T(m1784i, carData.getInstance()) && m1784i.f2557P2;
    }

    /* renamed from: D */
    public static boolean m3273D(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : f6434d) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m3274E(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (String str2 : f6433c) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return str.contains("carplay");
    }

    /* renamed from: F */
    public static boolean m3275F(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (String str2 : f6433c) {
            if (str.contains(str2)) {
                return true;
            }
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("carplay") || lowerCase.contains("androidauto");
    }

    /* renamed from: G */
    public static boolean m3276G(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : f6435e) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m3277H(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.contains("com.altaysoft.t500_split/.LauncherBackGround") || str.contains("com.altaysoft.t500_split/.Launcher")) {
            return true;
        }
        cfgData cfgdata = f6432b;
        String str2 = cfgdata.f2544M1;
        if (str2 != null && !str2.equals("---") && str.contains(str2)) {
            return true;
        }
        String str3 = cfgdata.f2548N1;
        return (str3 == null || str3.equals("---") || !str.contains(str3)) ? false : true;
    }

    /* renamed from: I */
    public static boolean m3278I(String str) {
        if (str != null && !str.isEmpty() && !"unknown".equals(str)) {
            if (str.startsWith("com.altaysoft.t500_split")) {
                return true;
            }
            cfgData cfgdata = f6432b;
            String str2 = cfgdata.f2663n;
            if (str2 != null && !str2.isEmpty() && str.equals(str2)) {
                return true;
            }
            String str3 = cfgdata.f2544M1;
            if (str3 != null && !str3.equals("---") && str.equals(str3)) {
                return true;
            }
            String str4 = cfgdata.f2548N1;
            if (str4 != null && !str4.equals("---") && str.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static String m3279J(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(String.format("%02X", Byte.valueOf(b2)));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: K */
    public static void m3280K(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            int m2943b = AbstractC1241e.m2943b(AbstractC1687o.m4921P(f6432b.f2655l1));
            if (m2943b == 0) {
                Intent intent = new Intent("android.settings.SETTINGS");
                intent.addFlags(268435456);
                applicationContext.startActivity(intent);
            } else if (m2943b == 1) {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings"));
                intent2.setFlags(335544320);
                applicationContext.startActivity(intent2);
            } else if (m2943b == 2) {
                Intent intent3 = new Intent("android.intent.action.MAIN");
                intent3.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings"));
                intent3.addFlags(268435456);
                applicationContext.startActivity(intent3);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: L */
    public static float m3281L(int i) {
        if (i == 40) {
            return 1.0f;
        }
        if (i == 41 || i == 46) {
            return 0.5f;
        }
        return (i < 47 || i > 51) ? 0.9f : 0.7019608f;
    }

    /* renamed from: M */
    public static int[] m3282M(int i) {
        if (AbstractC1569q1.m4455g(i)) {
            return new int[]{AbstractC1569q1.f8666a, AbstractC1569q1.f8667b};
        }
        if (i == 46) {
            try {
                return new int[]{Math.max(0, Math.min(C1541h0.m4251q(C1541h0.f8258o0).right - 490, 1450)), Math.max(0, Math.min(!AbstractC1539g1.m4195Q(cfgData.m1784i(), carData.getInstance()) ? 440 : C1541h0.m4251q(C1541h0.f8258o0).bottom - 425, 540))};
            } catch (Exception unused) {
                return new int[]{725, 240};
            }
        }
        if (AbstractC1539g1.m4198T(cfgData.m1784i(), carData.getInstance())) {
            if (!m3272C() || (!f6439i && cfgData.m1784i().f2561Q2 && f6442l)) {
                return new int[]{Math.max(0, Math.min(725, 1450)), Math.max(0, Math.min(109, 540))};
            }
            Rect m4239u = AbstractC1539g1.m4239u();
            return new int[]{Math.max(0, Math.min(m4239u.left, 1450)), Math.max(0, Math.min(m4239u.top, 540))};
        }
        if (i == 10 || i == 11 || i == 22) {
            return new int[]{50, 280};
        }
        if (i == 12) {
            return new int[]{1220, 240};
        }
        if (i == 21) {
            return new int[]{1340, 240};
        }
        if (i == 28 || i == 29) {
            return new int[]{10, 280};
        }
        if (i == 30) {
            return new int[]{100, 280};
        }
        if (i == 32) {
            return new int[]{5, 280};
        }
        if (i == 33 || i == 34 || i == 35) {
            return new int[]{725, 370};
        }
        if (i == 41) {
            return new int[]{725, 180};
        }
        if (i == 42) {
            return new int[]{725, 300};
        }
        if (i != 43 && i != 44 && i != 45) {
            return (i == 40 || i == 47 || i == 48 || i == 49 || i == 50 || i == 51) ? new int[]{725, 110} : new int[]{725, 200};
        }
        return new int[]{725, 240};
    }

    /* renamed from: N */
    public static boolean m3283N(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: O */
    public static void m3284O(int i, String str) {
        int m3313s = m3313s(i, str);
        if (m3313s != -1) {
            m3285P(m3313s, i);
        }
    }

    /* renamed from: P */
    public static void m3285P(int i, int i2) {
        if (i > 0) {
            try {
                cfgData cfgdata = f6432b;
                Class<?> cls = Class.forName(cfgdata.f2679q0);
                Object invoke = cls.getMethod(cfgdata.f2684r0, null).invoke(cls, null);
                Class<?> cls2 = invoke.getClass();
                String str = cfgdata.f2689s0;
                Class cls3 = Integer.TYPE;
                cls2.getMethod(str, cls3, cls3).invoke(invoke, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Q */
    public static void m3286Q(boolean z2) {
        f6442l = z2;
        Handler handler = AbstractC1294Y.f6039a;
        if (m3299e("ip_message") || AbstractC1294Y.m3154f()) {
            AbstractC1294Y.m3152d();
            C1288V.m3128n();
        }
    }

    /* renamed from: R */
    public static void m3287R(boolean z2, boolean z3) {
        C1253D0 c1253d0;
        if (f6439i == z2) {
            return;
        }
        f6439i = z2;
        if (z3 && !f6443m && f6437g && (c1253d0 = f6444n) != null && c1253d0.f5620W && m3272C()) {
            int[] m3282M = m3282M(cfgData.m1784i().f2620e1);
            f6444n.m2977p(m3282M[0], m3282M[1]);
        }
        Handler handler = AbstractC1294Y.f6039a;
        if (m3299e("ip_message") || AbstractC1294Y.m3154f()) {
            AbstractC1294Y.m3152d();
            C1288V.m3128n();
        }
    }

    /* renamed from: S */
    public static void m3288S(Context context, String str, String str2, RunnableC1704c runnableC1704c) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_ok, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.txt_msg)).setText(str2);
        ((TextView) inflate.findViewById(R.id.txt_caption)).setText(str);
        C0117i c0117i = new C0117i(context, R.style.T500Split_Dialog);
        ((C0863b) c0117i.f369g).f4328i = inflate;
        DialogInterfaceC0867f m365a = c0117i.m365a();
        m365a.setCancelable(false);
        m365a.setCanceledOnTouchOutside(false);
        AbstractC1256E0.m3022o(m365a);
        inflate.findViewById(R.id.butOk).setOnClickListener(new ViewOnClickListenerC1326j0(m365a, inflate, runnableC1704c, 1));
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        } else if (context == null) {
            return;
        }
        try {
            AbstractC1256E0.m3002Q(m365a, inflate);
            inflate.post(new RunnableC0005B(context, m365a, inflate));
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: T */
    public static void m3289T(Context context, String str) {
        if (context == null || str == null || str.length() == 0) {
            return;
        }
        C1311e0.m3165d(context).m3176l(context, str.toString(), context.getResources().getConfiguration().getLayoutDirection() == 1, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0096, code lost:
    
        if (r2.m2983v() != false) goto L45;
     */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3290U(Context context, int i, int i2, float f2, int i3) {
        int i4;
        ContextThemeWrapper contextThemeWrapper;
        int i5 = 1;
        if (m3299e("overlay") || f6443m || !m3271B()) {
            return;
        }
        if (f6444n == null) {
            if (C1253D0.f5589H0 == null) {
                C1253D0.f5589H0 = new C1253D0(context);
            }
            f6444n = C1253D0.f5589H0;
        }
        C1253D0 c1253d0 = f6444n;
        Context context2 = c1253d0.f5624a;
        if (c1253d0.f5621X) {
            c1253d0.m2975n();
        }
        RunnableC1247B0 runnableC1247B0 = c1253d0.f5635f0;
        Handler handler = c1253d0.f5633e0;
        if (runnableC1247B0 != null) {
            handler.removeCallbacks(runnableC1247B0);
            c1253d0.f5635f0 = null;
        }
        handler.removeCallbacks(c1253d0.f5661s0);
        if (c1253d0.f5620W) {
            c1253d0.m2975n();
        }
        if (i3 == 9) {
            i4 = 8;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    i4 = 3;
                } else if (i3 >= 0 && i3 <= 10) {
                    i4 = 6;
                    if (i3 == 7 && !c1253d0.m2983v()) {
                        if (!c1253d0.m2983v()) {
                            if (c1253d0.f5626b.f2543M0.f7152k) {
                                i4 = 5;
                            }
                        }
                        i4 = 7;
                    } else if (i3 != 5 || c1253d0.f5626b.f2543M0.f7152k) {
                        i4 = i3;
                    }
                }
            }
            i4 = 0;
        }
        c1253d0.f5623Z = i4;
        c1253d0.f5622Y = false;
        try {
            DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(2) : null;
            if (display != null) {
                Context createDisplayContext = context2.createDisplayContext(display);
                c1253d0.f5619V = (WindowManager) createDisplayContext.getSystemService("window");
                contextThemeWrapper = new ContextThemeWrapper(createDisplayContext, R.style.Theme_T500_Split);
            } else {
                c1253d0.f5619V = (WindowManager) context2.getSystemService("window");
                contextThemeWrapper = new ContextThemeWrapper(context2, R.style.Theme_T500_Split);
            }
            c1253d0.f5628c = contextThemeWrapper;
            LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
            if (from.getFactory2() == null) {
                from.setFactory2(new LayoutInflaterFactory2C1277P(i5));
            }
            View inflate = from.inflate(R.layout.popup_overlay_panel, (ViewGroup) null);
            c1253d0.f5630d = inflate;
            c1253d0.f5632e = inflate.findViewById(R.id.overlay_panel_content);
            c1253d0.f5634f = c1253d0.f5630d.findViewById(R.id.overlay_page_stats);
            c1253d0.f5636g = c1253d0.f5630d.findViewById(R.id.overlay_page_cabin);
            c1253d0.f5638h = (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_body);
            c1253d0.f5640i = new ImageView[]{(ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_d1), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_d2), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_d3), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_d4), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_d5), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_d6)};
            c1253d0.f5642j = new ImageView[]{(ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_b1), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_b2), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_b3), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_b4), (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_cabin_b5)};
            c1253d0.f5644k = c1253d0.f5630d.findViewById(R.id.overlay_page_system);
            c1253d0.f5646l = c1253d0.f5630d.findViewById(R.id.overlay_page_oil);
            c1253d0.f5648m = c1253d0.f5630d.findViewById(R.id.overlay_page_fuel);
            c1253d0.f5650n = c1253d0.f5630d.findViewById(R.id.overlay_page_elec);
            c1253d0.f5652o = c1253d0.f5630d.findViewById(R.id.overlay_page_media);
            c1253d0.f5654p = c1253d0.f5630d.findViewById(R.id.overlay_page_compass);
            C1656l c1656l = new C1656l(context2);
            c1253d0.f5656q = c1656l;
            c1656l.m4808a(c1253d0.f5630d);
            C0728a c0728a = new C0728a(context2);
            c1253d0.f5658r = c0728a;
            c0728a.m2160a(c1253d0.f5650n);
            c1253d0.f5660s = c1253d0.f5630d.findViewById(R.id.overlay_media_content);
            c1253d0.f5662t = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_media_empty);
            c1253d0.f5664u = (ImageView) c1253d0.f5630d.findViewById(R.id.overlay_media_art);
            c1253d0.f5666v = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_media_title);
            c1253d0.f5668w = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_media_artist);
            c1253d0.f5670x = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_media_elapsed);
            c1253d0.f5672y = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_media_total);
            c1253d0.f5674z = (ProgressBar) c1253d0.f5630d.findViewById(R.id.overlay_media_bar);
            View findViewById = c1253d0.f5630d.findViewById(R.id.ym_media_heart);
            ArrayList arrayList = AbstractC0641i.f3014a;
            if (findViewById instanceof ImageView) {
                AbstractC0641i.m1893j((ImageView) findViewById);
            }
            c1253d0.f5591A = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_time);
            c1253d0.f5593B = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_distance);
            c1253d0.f5595C = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_speed);
            c1253d0.f5597D = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_fuel);
            c1253d0.f5611N = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_tire_fl);
            c1253d0.f5612O = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_tire_fr);
            c1253d0.f5613P = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_tire_rl);
            c1253d0.f5614Q = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_tire_rr);
            c1253d0.f5615R = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_ram);
            c1253d0.f5616S = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_storage);
            c1253d0.f5599E = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_oil_temp);
            c1253d0.f5601F = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_oil_press);
            c1253d0.f5603G = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_inst_fuel);
            c1253d0.f5605H = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_label_inst_fuel_unit);
            c1253d0.f5606I = (Theme43BarView) c1253d0.f5630d.findViewById(R.id.overlay_inst_fuel_bar);
            c1253d0.f5607J = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_value_avg_fuel);
            c1253d0.f5608K = (Theme43BarView) c1253d0.f5630d.findViewById(R.id.overlay_avg_fuel_bar);
            c1253d0.f5609L = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_label_avg_fuel);
            c1253d0.f5610M = (TextView) c1253d0.f5630d.findViewById(R.id.overlay_panel_label_avg_fuel_unit);
            c1253d0.f5641i0 = true;
            c1253d0.m2965c(f2);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(470, 260, 2038, 536, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = i;
            layoutParams.y = i2;
            AbstractC1256E0.m2994I(c1253d0.f5630d);
            c1253d0.f5619V.addView(c1253d0.f5630d, layoutParams);
            c1253d0.f5620W = true;
            C1253D0.f5590I0 = true;
            C1311e0.m3166g();
            C1364w.m3261c();
            C1288V.m3132s();
            AbstractC1256E0.m3009b(c1253d0.f5630d);
            c1253d0.m2969g();
            c1253d0.m2967e();
            RunnableC1247B0 runnableC1247B02 = c1253d0.f5635f0;
            Handler handler2 = c1253d0.f5633e0;
            if (runnableC1247B02 != null) {
                handler2.removeCallbacks(runnableC1247B02);
                c1253d0.f5635f0 = null;
            }
            handler2.removeCallbacks(c1253d0.f5661s0);
            RunnableC1247B0 runnableC1247B03 = new RunnableC1247B0(c1253d0, i5);
            c1253d0.f5635f0 = runnableC1247B03;
            c1253d0.f5633e0.postDelayed(runnableC1247B03, 2000L);
        } catch (Exception unused) {
            c1253d0.m2975n();
        }
        boolean z2 = f6444n.f5620W;
        f6437g = z2;
        if (z2) {
            cfgData m1784i = cfgData.m1784i();
            m1784i.f2652k3 = true;
            m1784i.f2657l3 = i3;
            m1784i.m1796p(context.getApplicationContext());
        }
    }

    /* renamed from: V */
    public static void m3291V(int i) {
        cfgData cfgdata;
        EnumC1455a enumC1455a;
        int i2;
        do {
            cfgdata = f6432b;
            int i3 = cfgdata.f2630g1 + i;
            cfgdata.f2630g1 = i3;
            int i4 = cfgdata.f2608c + 30;
            int i5 = 0;
            if (i3 > i4) {
                cfgdata.f2630g1 = 0;
            }
            if (cfgdata.f2630g1 < 0) {
                cfgdata.f2630g1 = i4;
            }
            int i6 = cfgdata.f2630g1;
            EnumC1455a[] values = EnumC1455a.values();
            int length = values.length;
            while (true) {
                if (i5 >= length) {
                    enumC1455a = EnumC1455a.f6949f;
                    break;
                }
                enumC1455a = values[i5];
                if (enumC1455a.f7033a == i6) {
                    break;
                } else {
                    i5++;
                }
            }
            cfgdata.f2625f1 = enumC1455a;
            i2 = enumC1455a.f7037e;
            if (i2 == 1) {
                return;
            }
        } while (i2 != cfgdata.f2508D3);
    }

    /* renamed from: W */
    public static void m3292W(Context context, boolean z2) {
        C1253D0 c1253d0;
        if (m3299e("overlay") || f6443m) {
            return;
        }
        cfgData m1784i = cfgData.m1784i();
        if (m1784i.f2537K2 && m1784i.f2652k3) {
            if (!m3271B()) {
                m3306l();
                return;
            }
            if (f6437g && ((c1253d0 = f6444n) == null || !c1253d0.f5620W)) {
                f6437g = false;
            }
            int[] m3282M = m3282M(m1784i.f2620e1);
            C1253D0 c1253d02 = f6444n;
            if (c1253d02 == null || !c1253d02.f5620W) {
                if (f6437g) {
                    return;
                }
                m3290U(context, m3282M[0], m3282M[1], m3281L(m1784i.f2620e1), m1784i.f2657l3);
                return;
            }
            float m3281L = m3281L(m1784i.f2620e1);
            if (c1253d02.f5620W && c1253d02.f5630d != null && c1253d02.f5641i0) {
                c1253d02.m2965c(m3281L);
            }
            if (z2) {
                f6444n.m2977p(m3282M[0], m3282M[1]);
            } else {
                f6444n.m2971i();
                f6444n.m2976o(m3282M[0], m3282M[1]);
            }
            f6437g = true;
        }
    }

    /* renamed from: X */
    public static String m3293X(Context context, int i) {
        if (!AbstractC1569q1.m4455g(i)) {
            return m3309o(i).f7102b;
        }
        if (!AbstractC1569q1.m4455g(i)) {
            return "";
        }
        int m4466r = AbstractC1569q1.m4466r(i);
        String str = AbstractC1569q1.m4457i(context, m4466r).f8529c;
        return (str == null || str.trim().isEmpty()) ? context.getString(R.string.user_theme_n_name, Integer.valueOf(m4466r)) : str.trim();
    }

    /* renamed from: Y */
    public static void m3294Y(AbstractActivityC0870i abstractActivityC0870i, int i) {
        boolean z2;
        int i2 = AbstractC1569q1.f8666a;
        int length = EnumC1456b.values().length;
        int i3 = length + 8;
        cfgData cfgdata = f6432b;
        int i4 = cfgdata.f2620e1;
        for (int i5 = 0; i5 <= length + 11; i5++) {
            i4 += i;
            if (cfgdata.f2508D3 == 31 && i4 == 3) {
                i4 += i;
            }
            if (i4 > i3) {
                i4 = 0;
            }
            if (i4 < 0) {
                i4 = i3;
            }
            if (AbstractC1569q1.m4453e(i4)) {
                if (AbstractC1569q1.m4455g(i4)) {
                    if (AbstractC1569q1.m4455g(i4)) {
                        if (AbstractC1569q1.m4454f(i4 - EnumC1456b.values().length)) {
                            int m4466r = AbstractC1569q1.m4466r(i4);
                            if (AbstractC1569q1.m4452d(m4466r)) {
                                z2 = AbstractC1569q1.m4457i(abstractActivityC0870i, m4466r).f8528b;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        cfgdata.f2620e1 = i4;
                        cfgdata.f2615d1 = EnumC1456b.simple;
                        return;
                    }
                } else {
                    EnumC1456b m3309o = m3309o(i4);
                    int i6 = cfgdata.f2508D3;
                    int i7 = m3309o.f7100J;
                    if (i7 == 1 || i7 == i6 || (i7 == 17 && i6 == 2)) {
                        cfgdata.f2620e1 = i4;
                        cfgdata.f2615d1 = m3309o;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3295a(int[] iArr, float f2) {
        C1253D0 c1253d0;
        if (iArr == null || (c1253d0 = f6444n) == null || !c1253d0.f5620W) {
            return;
        }
        c1253d0.m2978q(iArr, f2);
    }

    /* renamed from: b */
    public static void m3296b() {
        f6443m = true;
        RunnableC1369x1 runnableC1369x1 = f6447q;
        if (runnableC1369x1 != null) {
            f6446p.removeCallbacks(runnableC1369x1);
            f6447q = null;
        }
        m3306l();
        IPOverlayService.m1667a();
    }

    /* renamed from: c */
    public static int[] m3297c() {
        C1253D0 c1253d0 = f6444n;
        if (c1253d0 == null || !c1253d0.f5620W) {
            return null;
        }
        c1253d0.m2971i();
        int[] m2974m = f6444n.m2974m();
        if (m2974m == null) {
            return null;
        }
        int[] m3282M = m3282M(cfgData.m1784i().f2620e1);
        int i = m2974m[0];
        int i2 = m3282M[0];
        if (i == i2 && m2974m[1] == m3282M[1]) {
            return null;
        }
        return new int[]{i, m2974m[1], i2, m3282M[1]};
    }

    /* renamed from: d */
    public static void m3298d(int i) {
        cfgData cfgdata;
        EnumC1457c enumC1457c;
        do {
            cfgdata = f6432b;
            int i2 = cfgdata.f2539L0 + i;
            cfgdata.f2539L0 = i2;
            if (i2 > EnumC1457c.values().length - 1) {
                cfgdata.f2539L0 = 0;
            }
            if (cfgdata.f2539L0 < 0) {
                cfgdata.f2539L0 = EnumC1457c.values().length - 1;
            }
            int i3 = cfgdata.f2539L0;
            EnumC1457c[] values = EnumC1457c.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    enumC1457c = EnumC1457c.NOT_SET;
                    break;
                }
                enumC1457c = values[i4];
                if (enumC1457c.f7142a == i3) {
                    break;
                } else {
                    i4++;
                }
            }
            cfgdata.f2543M0 = enumC1457c;
        } while (enumC1457c.f7143b >= 1000);
        if (enumC1457c.f7154m) {
            return;
        }
        cfgdata.f2567S0 = false;
    }

    /* renamed from: e */
    public static boolean m3299e(String str) {
        String str2 = "";
        switch (f6432b.f2513E3) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 2:
                str2 = "overlay pip tbox_ctrl launcher show_back presets5 allapps hide_mode theme_change ip_message voice_ctrl drive_mode disable_ap mediaData splitInfo auto_brightness";
                break;
            default:
                throw null;
        }
        return str2.contains(str);
    }

    /* renamed from: f */
    public static void m3300f() {
        cfgData cfgdata = f6432b;
        int i = cfgdata.f2722y3;
        if (i > 0) {
            m3285P(i, cfgdata.f2717x3);
        }
        int i2 = cfgdata.f2712w3;
        if (i2 > 0) {
            m3285P(i2, cfgdata.f2707v3);
        }
    }

    /* renamed from: g */
    public static void m3301g() {
        cfgData cfgdata = f6432b;
        m3284O(2, cfgdata.f2544M1);
        m3284O(2, cfgdata.f2548N1);
    }

    /* renamed from: h */
    public static boolean m3302h() {
        C1288V c1288v = C1288V.f5996D;
        if (c1288v != null && c1288v.f6020p) {
            f6441k = true;
            Handler handler = AbstractC1294Y.f6039a;
            NativeLib.nativeAckWellBack();
            C1288V.m3128n();
            carData.getInstance().setIpMessage(0);
            return true;
        }
        long j2 = f6440j;
        if (j2 != 0 && SystemClock.elapsedRealtime() < j2) {
            f6440j = 0L;
            return true;
        }
        f6440j = 0L;
        if (m3272C()) {
            return !f6439i;
        }
        return false;
    }

    /* renamed from: i */
    public static void m3303i() {
        f6443m = false;
        RunnableC1369x1 runnableC1369x1 = f6447q;
        if (runnableC1369x1 != null) {
            f6446p.removeCallbacks(runnableC1369x1);
            f6447q = null;
        }
        C1253D0 c1253d0 = C1253D0.f5589H0;
        if (c1253d0 != null) {
            c1253d0.m2975n();
            C1253D0.f5589H0 = null;
        }
        C1253D0.f5590I0 = false;
        f6444n = null;
        f6437g = false;
        C1246B c1246b = f6445o;
        if (c1246b != null) {
            c1246b.f5556b.removeCallbacks(c1246b.f5574t);
            c1246b.f5568n = -1;
            c1246b.m2958d();
        } else {
            C1246B c1246b2 = C1246B.f5554x;
            if (c1246b2 != null) {
                c1246b2.m2958d();
                C1246B.f5554x = null;
            }
        }
        f6445o = null;
        f6438h = false;
        AbstractC1353s0.f6358a.evictAll();
    }

    /* renamed from: j */
    public static void m3304j(Context context) {
        TopOverlayService.m1704c(context.getApplicationContext());
        String m3314t = m3314t(0);
        if (m3314t == null || !m3314t.contains(".Top")) {
            return;
        }
        m3284O(0, context.getPackageName());
    }

    /* renamed from: k */
    public static void m3305k(Context context) {
        int i = cfgData.m1784i().f2657l3;
        cfgData m1784i = cfgData.m1784i();
        m1784i.f2652k3 = false;
        m1784i.f2657l3 = i;
        m1784i.m1796p(context.getApplicationContext());
        m3306l();
    }

    /* renamed from: l */
    public static void m3306l() {
        C1253D0 c1253d0 = f6444n;
        if (c1253d0 != null) {
            c1253d0.m2971i();
            C1253D0 c1253d02 = f6444n;
            if (c1253d02.f5620W && !c1253d02.f5621X) {
                c1253d02.f5621X = true;
                c1253d02.m2971i();
                c1253d02.m2985x();
                View view = c1253d02.f5630d;
                if (view != null) {
                    AbstractC1256E0.m3011d(view, new RunnableC1374z0(c1253d02, 1));
                } else {
                    c1253d02.m2982u();
                    c1253d02.f5621X = false;
                }
            }
        }
        f6437g = false;
    }

    /* renamed from: m */
    public static String m3307m(Context context) {
        return new SimpleDateFormat(AbstractC1256E0.m3026s(context) == EnumC1314f0.f6116c ? "h:mm" : "HH:mm", Locale.ENGLISH).format(Calendar.getInstance().getTime());
    }

    /* renamed from: n */
    public static long m3308n() {
        return (new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024) / 1024;
    }

    /* renamed from: o */
    public static EnumC1456b m3309o(int i) {
        for (EnumC1456b enumC1456b : EnumC1456b.values()) {
            if (enumC1456b.f7101a == i) {
                return enumC1456b;
            }
        }
        return EnumC1456b.simple;
    }

    /* renamed from: p */
    public static int m3310p(int i) {
        if (i == 11 || i == 18 || i == 19 || i == 20 || i == 22 || i == 23 || i == 25 || i == 26 || i == 27 || i == 38 || i == 39 || i == 40 || i == 41 || i == 42 || i == 43 || i == 44 || i == 45 || i == 46) {
            return 12;
        }
        if (i >= 100 && i <= 200) {
            return 3;
        }
        for (int i2 : AbstractC1241e.m2944c(47)) {
            if (AbstractC1241e.m2943b(i2) == i) {
                return i2;
            }
        }
        return 1;
    }

    /* renamed from: q */
    public static int m3311q(int i) {
        for (int i2 : AbstractC1241e.m2944c(7)) {
            if (AbstractC1241e.m2943b(i2) == i) {
                return i2;
            }
        }
        return 2;
    }

    /* renamed from: r */
    public static String m3312r(String str) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()));
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                return readLine;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                bufferedReader.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: s */
    public static int m3313s(int i, String str) {
        try {
            cfgData cfgdata = f6432b;
            Class<?> cls = Class.forName(cfgdata.f2679q0);
            Object invoke = cls.getMethod(cfgdata.f2684r0, null).invoke(cls, null);
            return ((Integer) invoke.getClass().getMethod(cfgdata.f2694t0, String.class, Integer.TYPE).invoke(invoke, str, Integer.valueOf(i))).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: t */
    public static String m3314t(int i) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityManager");
            Object invoke = cls.getMethod("getService", null).invoke(cls, null);
            ComponentName componentName = (ComponentName) invoke.getClass().getMethod("getTopActivityByDisplayId", Integer.TYPE).invoke(invoke, Integer.valueOf(i));
            if (componentName != null) {
                return componentName.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: u */
    public static boolean m3315u(Context context, int i) {
        ContextThemeWrapper contextThemeWrapper;
        if (i != 18 && i != 2) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - f6448r < 2000) {
            return true;
        }
        f6448r = uptimeMillis;
        if (f6438h) {
            C1246B c1246b = f6445o;
            if (c1246b != null) {
                c1246b.f5556b.removeCallbacks(c1246b.f5574t);
                c1246b.f5568n = -1;
                c1246b.m2958d();
            } else {
                C1246B c1246b2 = C1246B.f5554x;
                if (c1246b2 != null) {
                    c1246b2.m2958d();
                    C1246B.f5554x = null;
                }
            }
            f6445o = null;
            f6438h = false;
        } else if (context != null && m3271B() && cfgData.m1784i().f2567S0) {
            if (f6445o == null) {
                if (C1246B.f5554x == null) {
                    C1246B.f5554x = new C1246B(context);
                }
                f6445o = C1246B.f5554x;
            }
            C1246B c1246b3 = f6445o;
            boolean z2 = c1246b3.f5566l;
            if (!z2) {
                if (!z2) {
                    try {
                        DisplayManager displayManager = (DisplayManager) c1246b3.f5555a.getSystemService("display");
                        Display display = displayManager != null ? displayManager.getDisplay(2) : null;
                        if (display != null) {
                            Context createDisplayContext = c1246b3.f5555a.createDisplayContext(display);
                            c1246b3.f5557c = (WindowManager) createDisplayContext.getSystemService("window");
                            contextThemeWrapper = new ContextThemeWrapper(createDisplayContext, R.style.Theme_T500_Split);
                        } else {
                            c1246b3.f5557c = (WindowManager) c1246b3.f5555a.getSystemService("window");
                            contextThemeWrapper = new ContextThemeWrapper(c1246b3.f5555a, R.style.Theme_T500_Split);
                        }
                        c1246b3.f5564j = contextThemeWrapper;
                        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.drive_mode_overlay, (ViewGroup) null);
                        c1246b3.f5558d = inflate;
                        c1246b3.f5559e = (TextView) inflate.findViewById(R.id.drive_mode_title);
                        c1246b3.f5560f = (TextView) c1246b3.f5558d.findViewById(R.id.drive_mode_prev);
                        c1246b3.f5561g = (TextView) c1246b3.f5558d.findViewById(R.id.drive_mode_value);
                        c1246b3.f5562h = (TextView) c1246b3.f5558d.findViewById(R.id.drive_mode_next);
                        c1246b3.f5563i = (TextView) c1246b3.f5558d.findViewById(R.id.drive_mode_spare);
                        TextView textView = c1246b3.f5559e;
                        if (textView != null) {
                            textView.setText(R.string.drive_mode_overlay_title);
                        }
                        c1246b3.f5570p = TypedValue.applyDimension(1, 40.0f, contextThemeWrapper.getResources().getDisplayMetrics());
                        c1246b3.f5571q = TypedValue.applyDimension(1, -10.0f, contextThemeWrapper.getResources().getDisplayMetrics());
                        c1246b3.f5567m = C1246B.m2953g(carData.getInstance().m1753i());
                        c1246b3.f5573s = 0L;
                        c1246b3.f5558d.post(new RunnableC1367x(c1246b3, 1));
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(320, 195, 2038, 536, -3);
                        layoutParams.x = 800;
                        layoutParams.y = 302;
                        layoutParams.gravity = 8388659;
                        c1246b3.f5557c.addView(c1246b3.f5558d, layoutParams);
                        c1246b3.f5566l = true;
                        f6438h = true;
                        C1243A c1243a = c1246b3.f5565k;
                        if (c1243a != null) {
                            c1243a.f5543g.m1383g(EnumC0548m.f1990a);
                            c1246b3.f5565k = null;
                        }
                        c1246b3.f5565k = new C1243A(0);
                        carData.getInstance().m1734W(c1246b3.f5565k, c1246b3.f5575u);
                        carData.getInstance().m1726O(c1246b3.f5565k, c1246b3.f5576v);
                    } catch (Throwable unused) {
                        c1246b3.m2958d();
                    }
                }
                f6438h = f6445o.f5566l;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m3316v() {
        MyAccessibilityService myAccessibilityService = MyAccessibilityService.f2328m;
        if (myAccessibilityService != null) {
            try {
                List<AccessibilityWindowInfo> windows = myAccessibilityService.getWindows();
                if (windows != null && !windows.isEmpty()) {
                    for (AccessibilityWindowInfo accessibilityWindowInfo : windows) {
                        if (accessibilityWindowInfo != null) {
                            try {
                                if (!accessibilityWindowInfo.isInPictureInPictureMode()) {
                                    String m1695a = MyAccessibilityService.m1695a(accessibilityWindowInfo);
                                    if (MyAccessibilityService.m1696b(accessibilityWindowInfo, m1695a)) {
                                        try {
                                            accessibilityWindowInfo.recycle();
                                        } catch (Exception unused) {
                                        }
                                        return true;
                                    }
                                    if (accessibilityWindowInfo.isActive() && !m3278I(m1695a)) {
                                        MyAccessibilityService.m1698e(m1695a);
                                    }
                                }
                            } catch (Exception unused2) {
                            } catch (Throwable th) {
                                try {
                                    accessibilityWindowInfo.recycle();
                                } catch (Exception unused3) {
                                }
                                throw th;
                            }
                            try {
                                accessibilityWindowInfo.recycle();
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
            } catch (Exception unused5) {
            }
        }
        return false;
    }

    /* renamed from: w */
    public static void m3317w() {
        if (cfgData.m1784i().f2652k3) {
            return;
        }
        m3306l();
    }

    /* renamed from: x */
    public static int m3318x(String str) {
        if (str != null && str.length() >= 4) {
            try {
                return Integer.parseInt(str.substring(str.length() - 4), 16);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: y */
    public static void m3319y() {
        String stringByIndex = NativeLib.getStringByIndex(149);
        cfgData cfgdata = f6432b;
        cfgdata.f2658m = stringByIndex;
        cfgdata.f2663n = NativeLib.getStringByIndex(125);
        cfgdata.f2668o = NativeLib.getStringByIndex(40);
        cfgdata.f2673p = NativeLib.getStringByIndex(219);
        cfgdata.f2678q = NativeLib.getStringByIndex(147);
        cfgdata.f2683r = NativeLib.getStringByIndex(215);
        cfgdata.f2688s = NativeLib.getStringByIndex(168);
        cfgdata.f2693t = NativeLib.getStringByIndex(201);
        cfgdata.f2698u = NativeLib.getStringByIndex(232);
        cfgdata.f2703v = NativeLib.getStringByIndex(175);
        cfgdata.f2708w = NativeLib.getStringByIndex(207);
        cfgdata.f2713x = NativeLib.getStringByIndex(134);
        cfgdata.f2718y = NativeLib.getStringByIndex(49);
        cfgdata.f2723z = NativeLib.getStringByIndex(100);
        cfgdata.f2489A = NativeLib.getStringByIndex(5);
        cfgdata.f2494B = NativeLib.getStringByIndex(51);
        cfgdata.f2499C = NativeLib.getStringByIndex(15);
        cfgdata.f2504D = NativeLib.getStringByIndex(235);
        cfgdata.f2509E = NativeLib.getStringByIndex(53);
        cfgdata.f2514F = NativeLib.getStringByIndex(132);
        cfgdata.f2518G = NativeLib.getStringByIndex(189);
        cfgdata.f2522H = NativeLib.getStringByIndex(248);
        cfgdata.f2526I = NativeLib.getStringByIndex(247);
        cfgdata.f2530J = NativeLib.getStringByIndex(22);
        cfgdata.f2534K = NativeLib.getStringByIndex(7);
        cfgdata.f2538L = NativeLib.getStringByIndex(239);
        cfgdata.f2542M = NativeLib.getStringByIndex(244);
        cfgdata.f2546N = NativeLib.getStringByIndex(128);
        cfgdata.f2550O = NativeLib.getStringByIndex(114);
        cfgdata.f2554P = NativeLib.getStringByIndex(3);
        cfgdata.f2558Q = NativeLib.getStringByIndex(159);
        cfgdata.f2562R = NativeLib.getStringByIndex(18);
        cfgdata.f2566S = NativeLib.getStringByIndex(127);
        cfgdata.f2570T = NativeLib.getStringByIndex(198);
        cfgdata.f2574U = NativeLib.getStringByIndex(157);
        cfgdata.f2578V = NativeLib.getStringByIndex(66);
        cfgdata.f2582W = NativeLib.getStringByIndex(126);
        cfgdata.f2590Y = NativeLib.getStringByIndex(121);
        cfgdata.f2594Z = NativeLib.getStringByIndex(94);
        cfgdata.f2599a0 = NativeLib.getStringByIndex(98);
        cfgdata.f2604b0 = NativeLib.getStringByIndex(227);
        cfgdata.f2609c0 = NativeLib.getStringByIndex(41);
        cfgdata.f2614d0 = NativeLib.getStringByIndex(236);
        cfgdata.f2619e0 = NativeLib.getStringByIndex(153);
        cfgdata.f2624f0 = NativeLib.getStringByIndex(186);
        cfgdata.f2629g0 = NativeLib.getStringByIndex(77);
        cfgdata.f2634h0 = NativeLib.getStringByIndex(62);
        cfgdata.f2639i0 = NativeLib.getStringByIndex(173);
        cfgdata.f2644j0 = NativeLib.getStringByIndex(123);
        cfgdata.f2649k0 = NativeLib.getStringByIndex(6);
        cfgdata.f2654l0 = NativeLib.getStringByIndex(111);
        cfgdata.f2659m0 = NativeLib.getStringByIndex(28);
        cfgdata.f2664n0 = NativeLib.getStringByIndex(234);
        cfgdata.f2669o0 = NativeLib.getStringByIndex(70);
        cfgdata.f2674p0 = NativeLib.getStringByIndex(109);
        cfgdata.f2586X = NativeLib.getStringByIndex(214);
    }

    /* renamed from: z */
    public static boolean m3320z(String str) {
        if (str != null && !str.isEmpty()) {
            if (m3274E(str)) {
                return true;
            }
            for (String str2 : f6436f) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
