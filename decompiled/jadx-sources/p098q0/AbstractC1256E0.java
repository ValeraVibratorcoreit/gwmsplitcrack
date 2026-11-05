package p098q0;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.altaysoft.t500_split.IPOverlayService;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.MarqueeTextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.RunnableC0637e;
import com.sun.jna.Platform;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p000A.AbstractC0000a;
import p000A.AbstractC0001b;
import p001A0.C0031y;
import p001A0.RunnableC0011e;
import p001A0.RunnableC0018l;
import p001A0.RunnableC0029w;
import p006C.AbstractC0062j;
import p070g.AbstractActivityC0870i;
import p070g.DialogInterfaceC0867f;
import p106t0.EnumC1457c;
import p109u0.AbstractC1569q1;
import p124z0.RunnableC1704c;

/* renamed from: q0.E0 */
/* loaded from: classes.dex */
public abstract class AbstractC1256E0 {

    /* renamed from: a */
    public static final String[] f5684a = {"swap", "fl_RF", "fl_LF", "alicealways", "alice2win", "usealice", "ymastart", "usehut", "ip_navi", "smallMenu", "showSplitInfo", "splitInfoRight", "splitInfo2win"};

    /* renamed from: b */
    public static final String[] f5685b = {"zbound", "zbottom", "splitInfoWidth"};

    /* renamed from: c */
    public static final String[] f5686c = {"left_pkg", "right_pkg"};

    /* renamed from: d */
    public static final String[] f5687d = {"astart", "tbox_ctrl", "tbox_mode", "pipmonitoring", "launcher", "noCorrectYN", "RHD", "customTank", "FW1791", "noUpdateCheck", "disableAP", "voice_enable", "driveModeControl", "driveMode_auto", "driveMode_normal", "driveMode_sport", "driveMode_eco", "driveMode_snow", "driveMode_sand", "driveMode_mud", "driveMode_4h", "ymExtendedControl", "autoBrightness", "autoBrightnessSunset", "autoPresetSwitch", "autoPresetSunset", "ipMsgCar", "ipMsgWell", "ipMsgBottom", "ipMsgAutoHide", "ballMsgNet", "ballMsgTrack", "ballMsgRadio", "ballMenuVertical"};

    /* renamed from: e */
    public static final String[] f5688e = {"presetnum", "modelNum", "hutFirmwareVersionNum", "ymStartMode", "autoBrightnessDay", "autoBrightnessNight", "autoPresetDay", "autoPresetNight", "splitInfoVolSwipe"};

    /* renamed from: f */
    public static final String[] f5689f = {"k_speed", "tankCapacityL", "k_remain_odo", "autoBrightnessLat", "autoBrightnessLon"};

    /* renamed from: g */
    public static final String[] f5690g = {"hutFirmwareVersion", "ymPassportLogin"};

    /* renamed from: h */
    public static final String[] f5691h = {"swap", "fl_RF", "fl_LF", "setlauncher", "speed_right", "alicealways", "mode_color", "ymastart", "useip", "usehud", "usehut", "ip_navi", "ip_navi_full", "usealice", "show_odo", "show_trip", "show_day", "show_tires", "show_gauge", "show_gauge_txt", "mediaData", "show_cruise", "show_frame", "show_back", "show_navi_but", "alice2win", "useJourneyFuel", "smallMenu", "overlay_open", "showSplitInfo", "splitInfoRight", "splitInfo2win", "showMenu", "splitBall"};

    /* renamed from: i */
    public static final String[] f5692i = {"zbottom", "zbound", "ipthemes", "ip_style_id", "themeMode", "overlay_page", "yn_corr_left_pp", "yn_corr_right_pp", "yn_corr_top_pp", "yn_corr_bottom_pp", "yn_corr_left_hu", "yn_corr_right_hu", "yn_corr_top_hu", "yn_corr_bottom_hu", "splitInfoWidth", "splitInfoPage", "splitInfoPage2", "splitInfoClockStyle", "splitInfoClockStyle2", "splitBallX", "splitBallY"};

    /* renamed from: j */
    public static final String[] f5693j = {"tire_p_min_alm", "spd_alm", "rpm_alm"};

    /* renamed from: k */
    public static final String[] f5694k = {"left_pkg", "right_pkg", "prg1"};

    /* renamed from: l */
    public static final Object f5695l = new Object();

    /* renamed from: m */
    public static final float[][] f5696m = {new float[]{0.0f, 0.9f}, new float[]{12.5f, 0.97f}, new float[]{25.0f, 1.0f}, new float[]{37.5f, 0.97f}, new float[]{50.0f, 0.92f}, new float[]{62.5f, 0.85f}, new float[]{75.0f, 0.75f}, new float[]{87.5f, 0.67f}, new float[]{100.0f, 0.6f}};

    /* renamed from: n */
    public static final float[][] f5697n = {new float[]{0.0f, 0.9f}, new float[]{9.090909f, 0.95f}, new float[]{18.181818f, 0.97f}, new float[]{27.272728f, 0.99f}, new float[]{36.363636f, 0.97f}, new float[]{45.454548f, 0.94f}, new float[]{54.545456f, 0.89f}, new float[]{63.636364f, 0.82f}, new float[]{72.72727f, 0.75f}, new float[]{81.818184f, 0.7f}, new float[]{90.909096f, 0.64f}, new float[]{100.0f, 0.6f}};

    /* renamed from: o */
    public static final float[][] f5698o = {new float[]{0.0f, 0.75f}, new float[]{12.5f, 0.85f}, new float[]{18.75f, 0.85f}, new float[]{25.0f, 0.9f}, new float[]{31.25f, 0.95f}, new float[]{37.5f, 0.8f}, new float[]{43.75f, 0.81f}, new float[]{50.0f, 0.82f}, new float[]{56.25f, 0.8f}, new float[]{62.5f, 0.83f}, new float[]{65.625f, 0.87f}, new float[]{75.0f, 0.78f}, new float[]{81.25f, 0.78f}, new float[]{87.5f, 0.83f}, new float[]{93.75f, 0.97f}, new float[]{100.0f, 1.05f}};

    /* renamed from: p */
    public static final float[][] f5699p = {new float[]{0.0f, 0.75f}, new float[]{12.5f, 0.85f}, new float[]{18.75f, 0.85f}, new float[]{25.0f, 0.9f}, new float[]{31.25f, 0.95f}, new float[]{37.5f, 0.8f}, new float[]{43.75f, 0.81f}, new float[]{50.0f, 0.82f}, new float[]{56.25f, 0.8f}, new float[]{62.5f, 0.83f}, new float[]{65.625f, 0.87f}, new float[]{75.0f, 0.78f}, new float[]{81.25f, 0.78f}, new float[]{87.5f, 0.83f}, new float[]{93.75f, 0.97f}, new float[]{100.0f, 1.05f}};

    /* renamed from: q */
    public static final float[][] f5700q = {new float[]{0.0f, 1.0f}, new float[]{6.25f, 1.07f}, new float[]{12.5f, 1.07f}, new float[]{18.75f, 1.02f}, new float[]{25.0f, 1.0f}, new float[]{31.25f, 1.03f}, new float[]{37.5f, 1.1f}, new float[]{43.75f, 1.03f}, new float[]{50.0f, 1.0f}, new float[]{56.25f, 1.0f}, new float[]{62.5f, 0.97f}, new float[]{68.75f, 0.89f}, new float[]{75.0f, 0.9f}, new float[]{81.25f, 0.93f}, new float[]{87.5f, 1.0f}, new float[]{93.75f, 1.13f}, new float[]{100.0f, 1.28f}};

    /* renamed from: r */
    public static final float[][] f5701r = {new float[]{0.0f, 1.0f}, new float[]{6.25f, 1.07f}, new float[]{12.5f, 1.07f}, new float[]{18.75f, 1.02f}, new float[]{25.0f, 1.0f}, new float[]{31.25f, 1.03f}, new float[]{37.5f, 1.1f}, new float[]{43.75f, 1.03f}, new float[]{50.0f, 1.0f}, new float[]{56.25f, 1.0f}, new float[]{62.5f, 0.97f}, new float[]{68.75f, 0.89f}, new float[]{75.0f, 0.9f}, new float[]{81.25f, 0.93f}, new float[]{87.5f, 1.0f}, new float[]{93.75f, 1.13f}, new float[]{100.0f, 1.28f}};

    /* renamed from: s */
    public static final float[][] f5702s = {new float[]{0.0f, 0.8f}, new float[]{6.25f, 0.8f}, new float[]{12.5f, 0.85f}, new float[]{18.75f, 0.9f}, new float[]{25.0f, 0.95f}, new float[]{31.25f, 0.9f}, new float[]{37.5f, 0.9f}, new float[]{43.75f, 0.9f}, new float[]{50.0f, 0.9f}, new float[]{56.25f, 0.82f}, new float[]{62.5f, 0.77f}, new float[]{68.75f, 0.72f}, new float[]{75.0f, 0.7f}, new float[]{81.25f, 0.73f}, new float[]{87.5f, 0.8f}, new float[]{93.75f, 0.9f}, new float[]{100.0f, 1.1f}};

    /* renamed from: t */
    public static final float[][] f5703t = {new float[]{0.0f, 0.8f}, new float[]{6.25f, 0.8f}, new float[]{12.5f, 0.85f}, new float[]{18.75f, 0.9f}, new float[]{25.0f, 0.95f}, new float[]{31.25f, 0.9f}, new float[]{37.5f, 0.9f}, new float[]{43.75f, 0.9f}, new float[]{50.0f, 0.9f}, new float[]{56.25f, 0.82f}, new float[]{62.5f, 0.77f}, new float[]{68.75f, 0.72f}, new float[]{75.0f, 0.7f}, new float[]{81.25f, 0.73f}, new float[]{87.5f, 0.8f}, new float[]{93.75f, 0.9f}, new float[]{100.0f, 1.1f}};

    /* renamed from: u */
    public static final float[][] f5704u = {new float[]{0.0f, 1.035f}, new float[]{6.25f, 1.08f}, new float[]{12.5f, 1.08f}, new float[]{18.75f, 1.02f}, new float[]{25.0f, 1.012f}, new float[]{31.25f, 1.025f}, new float[]{37.5f, 1.11f}, new float[]{43.75f, 1.0f}, new float[]{50.0f, 1.0f}, new float[]{56.25f, 1.0f}, new float[]{62.5f, 0.95f}, new float[]{68.75f, 0.9f}, new float[]{75.0f, 0.91f}, new float[]{81.25f, 0.95f}, new float[]{87.5f, 1.04f}, new float[]{93.75f, 1.2f}, new float[]{100.0f, 1.3f}};

    /* renamed from: v */
    public static final float[][] f5705v = {new float[]{0.0f, 1.035f}, new float[]{6.25f, 1.08f}, new float[]{12.5f, 1.08f}, new float[]{18.75f, 1.02f}, new float[]{25.0f, 1.012f}, new float[]{31.25f, 1.025f}, new float[]{37.5f, 1.11f}, new float[]{43.75f, 1.0f}, new float[]{50.0f, 1.0f}, new float[]{56.25f, 1.0f}, new float[]{62.5f, 0.95f}, new float[]{68.75f, 0.9f}, new float[]{75.0f, 0.91f}, new float[]{81.25f, 0.95f}, new float[]{87.5f, 1.04f}, new float[]{93.75f, 1.2f}, new float[]{100.0f, 1.3f}};

    /* renamed from: w */
    public static float f5706w = -1.0f;

    /* renamed from: x */
    public static long f5707x;

    /* renamed from: A */
    public static String m2986A(float f2) {
        return String.format(Locale.ENGLISH, "%.1f", Float.valueOf(m3015h(f2))).replace(",", ".");
    }

    /* renamed from: B */
    public static float m2987B(long j2, long j3, long j4) {
        long j5 = j4 - j3;
        if (j5 <= 0) {
            return 1.0f;
        }
        float f2 = (j2 - j3) / j5;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    /* renamed from: C */
    public static boolean m2988C(Context context, int i, int i2) {
        if (i == i2) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("T500_SPLIT_AS", 0);
        String num = Integer.toString(i);
        String num2 = Integer.toString(i2);
        String[] strArr = f5684a;
        for (int i3 = 0; i3 < 13; i3++) {
            if (m2991F(sharedPreferences, strArr[i3], num, num2)) {
                return true;
            }
        }
        if (AbstractC0062j.m167u("showMenu", num, sharedPreferences, true) != AbstractC0062j.m167u("showMenu", num2, sharedPreferences, true)) {
            return true;
        }
        String[] strArr2 = f5685b;
        for (int i4 = 0; i4 < 3; i4++) {
            if (m2992G(sharedPreferences, strArr2[i4], num, num2)) {
                return true;
            }
        }
        String[] strArr3 = f5686c;
        for (int i5 = 0; i5 < 2; i5++) {
            String str = strArr3[i5];
            String string = sharedPreferences.getString(str + num, "---");
            String string2 = sharedPreferences.getString(str + num2, "---");
            if (string == null) {
                string = "---";
            }
            if (!string.equals(string2 != null ? string2 : "---")) {
                return true;
            }
        }
        if (!context.getSharedPreferences("T500_SPLIT_AS", 0).getBoolean("ip_navi" + Integer.toString(i), false)) {
            if (!context.getSharedPreferences("T500_SPLIT_AS", 0).getBoolean("ip_navi" + Integer.toString(i2), false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static void m2989D(AbstractActivityC0870i abstractActivityC0870i, boolean z2) {
        if (!abstractActivityC0870i.isFinishing() || abstractActivityC0870i.isChangingConfigurations()) {
            return;
        }
        if (z2) {
            m2998M(abstractActivityC0870i, true);
        } else {
            m2998M(abstractActivityC0870i, false);
        }
    }

    /* renamed from: E */
    public static int m2990E(cfgData cfgdata) {
        if (cfgdata == null) {
            return 0;
        }
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c == null || !enumC1457c.f7155n) {
            return cfgdata.f2519G0;
        }
        return 0;
    }

    /* renamed from: F */
    public static boolean m2991F(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        boolean z2 = sharedPreferences.getBoolean(str + str2, false);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str3);
        return z2 != sharedPreferences.getBoolean(sb.toString(), false);
    }

    /* renamed from: G */
    public static boolean m2992G(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        int i = sharedPreferences.getInt(str + str2, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str3);
        return i != sharedPreferences.getInt(sb.toString(), 0);
    }

    /* renamed from: H */
    public static void m2993H(Context context) {
        m3020m(context);
        C1287U0.m3100c(context);
        cfgData.m1784i();
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        MainActivity.f2308O = true;
    }

    /* renamed from: I */
    public static void m2994I(View view) {
        float f2 = -m3028u(view, 28.0f);
        view.setAlpha(0.0f);
        view.setScaleX(0.86f);
        view.setScaleY(0.86f);
        view.setTranslationY(f2);
    }

    /* renamed from: J */
    public static void m2995J(View view) {
        view.setAlpha(0.0f);
        view.setScaleX(0.94f);
        view.setScaleY(0.94f);
        view.setTranslationY(m3028u(view, 56.0f));
    }

    /* renamed from: K */
    public static String m2996K(File file) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
                sb.append('\n');
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: L */
    public static boolean m2997L(long j2, long j3, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j3);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    /* renamed from: M */
    public static void m2998M(Context context, boolean z2) {
        if (context == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f5707x < 2500) {
            return;
        }
        f5707x = elapsedRealtime;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0029w(z2, context.getApplicationContext(), 3), 900L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: N */
    public static void m2999N(TextView textView, String str) {
        int i;
        StringBuilder sb;
        int i2;
        if (textView == null || str == null) {
            return;
        }
        String replace = str.replace("@@", "@");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        int i4 = -1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int length = replace.length(); i3 < length; length = i) {
            int i5 = i3 + 3;
            if (i5 <= length) {
                String substring = replace.substring(i3, i5);
                if (substring.equals("@cr") || substring.equals("@cg") || substring.equals("@cb") || substring.equals("@cy")) {
                    i = length;
                } else {
                    i = length;
                    if (!substring.equals("@cw") && !substring.equals("@cd")) {
                        if (substring.equals("@fb") || substring.equals("@fn") || substring.equals("@fu") || substring.equals("@fi")) {
                            if (sb2.length() > 0) {
                                arrayList.add(new C1345p1(sb2.toString(), i4, z2, z3, z4));
                                sb = new StringBuilder();
                            } else {
                                sb = sb2;
                            }
                            switch (substring) {
                                case "@fb":
                                    z2 = true;
                                    break;
                                case "@fi":
                                    z4 = true;
                                    break;
                                case "@fn":
                                    z2 = false;
                                    z3 = false;
                                    z4 = false;
                                    break;
                                case "@fu":
                                    z3 = true;
                                    break;
                            }
                            sb2 = sb;
                            i3 = i5;
                        }
                    }
                }
                if (sb2.length() > 0) {
                    arrayList.add(new C1345p1(sb2.toString(), i4, z2, z3, z4));
                    sb = new StringBuilder();
                } else {
                    sb = sb2;
                }
                switch (substring) {
                    case "@cb":
                        i2 = -16776961;
                        i4 = i2;
                        break;
                    case "@cd":
                        i2 = -16777216;
                        i4 = i2;
                        break;
                    case "@cg":
                        i2 = -16711936;
                        i4 = i2;
                        break;
                    case "@cr":
                        i2 = -65536;
                        i4 = i2;
                        break;
                    case "@cy":
                        i2 = -256;
                        i4 = i2;
                        break;
                    default:
                        i4 = -1;
                        break;
                }
                sb2 = sb;
                i3 = i5;
            } else {
                i = length;
            }
            sb2.append(replace.charAt(i3));
            i3++;
        }
        StringBuilder sb3 = sb2;
        if (sb3.length() > 0) {
            arrayList.add(new C1345p1(sb3.toString(), i4, z2, z3, z4));
        }
        StringBuilder sb4 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb4.append(((C1345p1) it.next()).f6327a);
        }
        SpannableString spannableString = new SpannableString(sb4.toString());
        Iterator it2 = arrayList.iterator();
        int i6 = 0;
        while (it2.hasNext()) {
            C1345p1 c1345p1 = (C1345p1) it2.next();
            int length2 = c1345p1.f6327a.length() + i6;
            spannableString.setSpan(new ForegroundColorSpan(c1345p1.f6328b), i6, length2, 33);
            boolean z5 = c1345p1.f6331e;
            boolean z6 = c1345p1.f6329c;
            int i7 = (z6 && z5) ? 3 : z6 ? 1 : z5 ? 2 : 0;
            if (i7 != 0) {
                spannableString.setSpan(new StyleSpan(i7), i6, length2, 33);
            }
            if (c1345p1.f6330d) {
                spannableString.setSpan(new UnderlineSpan(), i6, length2, 33);
            }
            i6 = length2;
        }
        textView.setText(spannableString);
    }

    /* renamed from: O */
    public static void m3000O(TextView textView, String str) {
        if (textView instanceof MarqueeTextView) {
            ((MarqueeTextView) textView).setMarqueeText(str);
        } else if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    /* renamed from: P */
    public static void m3001P(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str.equals(textView.getTag(R.id.tag_raw_text))) {
            return;
        }
        textView.setTag(R.id.tag_raw_text, str);
        textView.setEllipsize(null);
        textView.setSingleLine(false);
        if (str.toString().indexOf(10) >= 0) {
            textView.setMaxLines(2);
            textView.setText(str);
            return;
        }
        textView.setMaxLines(1);
        RunnableC0018l runnableC0018l = new RunnableC0018l(textView, 18, str);
        if ((textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight() > 0) {
            runnableC0018l.run();
        } else {
            textView.setText(str);
            textView.post(runnableC0018l);
        }
    }

    /* renamed from: Q */
    public static void m3002Q(DialogInterfaceC0867f dialogInterfaceC0867f, View view) {
        view.setAlpha(0.0f);
        view.setScaleX(0.72f);
        view.setScaleY(0.72f);
        dialogInterfaceC0867f.show();
        m3008a(view);
    }

    /* renamed from: R */
    public static void m3003R(Context context) {
        if (context == null) {
            return;
        }
        AbstractC1372y1.m3288S(context, context.getString(R.string.Message), context.getString(R.string.msgFeatureDemoOrPaidOnly), null);
    }

    /* renamed from: S */
    public static boolean m3004S(cfgData cfgdata) {
        return cfgdata != null && cfgdata.f2597Z2 && cfgdata.f2545M2 && !cfgdata.f2549N2;
    }

    /* renamed from: T */
    public static int m3005T(cfgData cfgdata, int i, int i2, int i3) {
        int i4 = m3004S(cfgdata) && cfgdata.f2627f3 ? 2 : 1;
        int i5 = i3 == 1 ? 1 : 0;
        if (cfgdata == null || !cfgdata.f2622e3) {
            return (i5 * 600) + i;
        }
        return (((i4 - 1) - i5) * 600) + (i2 - (i4 * 600));
    }

    /* renamed from: U */
    public static int m3006U(int i, float f2) {
        double d = f2;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        if (floor != ceil) {
            float f3 = floor + 0.5f;
            if (f2 >= f3 && (f2 > f3 || Math.abs(floor - i) > Math.abs(ceil - i))) {
                floor = ceil;
            }
        }
        return cfgData.m1781b(floor, i);
    }

    /* renamed from: V */
    public static boolean m3007V(double d, double d2) {
        if (Double.isNaN(d) || Double.isNaN(d2) || d < -90.0d || d > 90.0d || d2 < -180.0d || d2 > 180.0d) {
            return false;
        }
        return (d == 0.0d && d2 == 0.0d) ? false : true;
    }

    /* renamed from: a */
    public static void m3008a(View view) {
        view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(450L).setInterpolator(new DecelerateInterpolator()).start();
    }

    /* renamed from: b */
    public static void m3009b(View view) {
        view.animate().cancel();
        view.setEnabled(true);
        view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(480L).setInterpolator(new OvershootInterpolator(0.9f)).start();
    }

    /* renamed from: c */
    public static void m3010c(View view) {
        view.animate().cancel();
        view.setEnabled(true);
        view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(480L).setInterpolator(new DecelerateInterpolator(1.6f)).start();
    }

    /* renamed from: d */
    public static void m3011d(View view, Runnable runnable) {
        view.animate().cancel();
        view.setEnabled(false);
        view.animate().alpha(0.0f).scaleX(0.86f).scaleY(0.86f).translationY(-m3028u(view, 18.199999f)).setDuration(320L).setInterpolator(new AccelerateInterpolator()).withEndAction(new RunnableC1356t0(runnable, 1)).start();
    }

    /* renamed from: e */
    public static void m3012e(View view, Runnable runnable) {
        view.animate().cancel();
        view.setEnabled(false);
        view.animate().alpha(0.0f).scaleX(0.94f).scaleY(0.94f).translationY(m3028u(view, 47.600002f)).setDuration(320L).setInterpolator(new AccelerateInterpolator()).withEndAction(new RunnableC1356t0(runnable, 0)).start();
    }

    /* renamed from: f */
    public static void m3013f(View view, C1350r0 c1350r0, float f2) {
        if (view != null) {
            float f3 = view.getResources().getDisplayMetrics().density;
            float f4 = 22.0f * f3;
            float f5 = 1.0f;
            float f6 = f3 * 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(f4);
            gradientDrawable.setColor(c1350r0.f6346a | (-16777216));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(Math.max(0.0f, f4 - f6));
            gradientDrawable2.setColor(c1350r0.f6347b | (-16777216));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            int max = Math.max(1, Math.round(f6));
            layerDrawable.setLayerInset(1, max, max, max, max);
            view.setBackground(layerDrawable);
            Drawable background = view.getBackground();
            if (background != null) {
                Drawable mutate = background.mutate();
                if (f2 < 0.0f) {
                    f5 = 0.0f;
                } else if (f2 <= 1.0f) {
                    f5 = f2;
                }
                mutate.setAlpha(Math.round(f5 * 255.0f));
                view.invalidate();
            }
            m3019l(view, c1350r0);
        }
    }

    /* renamed from: g */
    public static void m3014g(Context context, int i, int i2) {
        m3020m(context);
        C1324i1[] c1324i1Arr = C1324i1.f6151e1;
        for (int i3 = 0; i3 < 2; i3++) {
            C1324i1 c1324i1 = c1324i1Arr[i3];
            if (c1324i1 != null) {
                c1324i1.f6208b.post(new RunnableC1289V0(c1324i1, 0));
            }
        }
        C1287U0.m3100c(context);
        Context applicationContext = context.getApplicationContext();
        if (i != i2) {
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("T500_SPLIT_AS", 0);
            String num = Integer.toString(i2);
            if (AbstractC0062j.m167u("ip_navi", num, sharedPreferences, false)) {
                String num2 = Integer.toString(i);
                if (m2992G(sharedPreferences, "ipthemes", num2, num) || m2991F(sharedPreferences, "ip_navi_full", num2, num)) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0011e(context, 4));
                }
            }
        }
        TopOverlayService topOverlayService = TopOverlayService.f2357r;
        if (topOverlayService == null || topOverlayService.f2358f == null) {
            return;
        }
        topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 2));
    }

    /* renamed from: h */
    public static float m3015h(float f2) {
        float f3 = f2 * 1000.0f;
        if (f3 < 200.0f) {
            f5706w = -1.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
        } else {
            float f4 = 100.0f * ((int) ((f3 / 100.0f) + 0.5f));
            float f5 = f5706w;
            if (f5 < 0.0f) {
                f5706w = f4;
                f3 = f4;
            } else {
                if (f3 > f5 + 50.0f + 12.5f || f3 < (f5 - 50.0f) - 12.5f) {
                    f5706w = f4;
                }
                f3 = f5706w;
            }
        }
        return f3 / 1000.0f;
    }

    /* renamed from: i */
    public static void m3016i(View view, boolean z2) {
        if (view instanceof Switch) {
            m3017j((Switch) view, z2);
        } else if (view instanceof TextView) {
            m3018k((TextView) view, z2);
        } else if (view != null) {
            view.setAlpha(z2 ? 0.75f : 1.0f);
        }
    }

    /* renamed from: j */
    public static void m3017j(Switch r5, boolean z2) {
        r5.setTextColor(AbstractC0001b.m3a(r5.getContext(), z2 ? R.color.config_text_paywall_locked : R.color.config_text_color));
        Drawable m1b = AbstractC0000a.m1b(r5.getContext(), z2 ? R.drawable.switch_custom_thumb_paywall : R.drawable.switch_custom_thumb);
        Drawable m1b2 = AbstractC0000a.m1b(r5.getContext(), z2 ? R.drawable.switch_custom_track_paywall : R.drawable.switch_custom_track);
        if (m1b != null) {
            int round = Math.round(TypedValue.applyDimension(1, 26, r5.getResources().getDisplayMetrics()));
            r5.setThumbDrawable(new C1336m1(m1b.mutate(), round, round));
        }
        if (m1b2 != null) {
            r5.setTrackDrawable(new C1336m1(m1b2.mutate(), Math.round(TypedValue.applyDimension(1, 64, r5.getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 32, r5.getResources().getDisplayMetrics()))));
        }
        r5.setTag(f5695l);
        int[] drawableState = r5.getDrawableState();
        Drawable thumbDrawable = r5.getThumbDrawable();
        Drawable trackDrawable = r5.getTrackDrawable();
        if (thumbDrawable != null) {
            thumbDrawable.setState(drawableState);
        }
        if (trackDrawable != null) {
            trackDrawable.setState(drawableState);
        }
        r5.refreshDrawableState();
        r5.jumpDrawablesToCurrentState();
    }

    /* renamed from: k */
    public static void m3018k(TextView textView, boolean z2) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(AbstractC0001b.m3a(textView.getContext(), z2 ? R.color.config_text_paywall_locked : R.color.config_text_color));
    }

    /* renamed from: l */
    public static void m3019l(View view, C1350r0 c1350r0) {
        if (!(view instanceof TextView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m3019l(viewGroup.getChildAt(i), c1350r0);
                }
                return;
            }
            return;
        }
        TextView textView = (TextView) view;
        int id = textView.getId();
        if (id == R.id.overlay_panel_value_inst_fuel || id == R.id.overlay_panel_value_avg_fuel || id == R.id.overlay_panel_label_inst_fuel_unit || id == R.id.overlay_panel_label_avg_fuel_unit) {
            return;
        }
        if (id == R.id.overlay_panel_value_time || id == R.id.overlay_panel_value_distance || id == R.id.overlay_panel_value_speed || id == R.id.overlay_panel_value_fuel || id == R.id.overlay_panel_value_ram || id == R.id.overlay_panel_value_storage || id == R.id.overlay_panel_value_oil_temp || id == R.id.overlay_panel_value_oil_press || id == R.id.overlay_tire_fl || id == R.id.overlay_tire_fr || id == R.id.overlay_tire_rl || id == R.id.overlay_tire_rr) {
            textView.setTextColor(c1350r0.f6351f);
        } else {
            textView.setTextColor(c1350r0.f6350e);
        }
    }

    /* renamed from: m */
    public static void m3020m(Context context) {
        String str;
        int i = 1;
        Context applicationContext = context.getApplicationContext();
        AbstractC1372y1.m3303i();
        cfgData m1784i = cfgData.m1784i();
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        IPOverlayService.m1667a();
        m1784i.m1791k(applicationContext, true);
        String m4468t = AbstractC1569q1.m4468t(applicationContext, m1784i);
        IPOverlayService.m1668b(applicationContext);
        if (m4468t == null || !(context instanceof Activity) || (str = (String) AbstractC1569q1.f8669d.getAndSet(null)) == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0637e(context, i, str));
    }

    /* renamed from: n */
    public static void m3021n(View view) {
        if (!(view instanceof Switch)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m3021n(viewGroup.getChildAt(i));
                }
                return;
            }
            return;
        }
        Switch r6 = (Switch) view;
        Object tag = r6.getTag();
        Object obj = f5695l;
        if (tag == obj) {
            return;
        }
        r6.setTag(obj);
        Drawable m1b = AbstractC0000a.m1b(r6.getContext(), R.drawable.switch_custom_thumb);
        if (m1b != null) {
            int round = Math.round(TypedValue.applyDimension(1, 26, r6.getResources().getDisplayMetrics()));
            r6.setThumbDrawable(new C1336m1(m1b.mutate(), round, round));
        }
        Drawable m1b2 = AbstractC0000a.m1b(r6.getContext(), R.drawable.switch_custom_track);
        if (m1b2 != null) {
            r6.setTrackDrawable(new C1336m1(m1b2.mutate(), Math.round(TypedValue.applyDimension(1, 64, r6.getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 32, r6.getResources().getDisplayMetrics()))));
        }
    }

    /* renamed from: o */
    public static void m3022o(DialogInterfaceC0867f dialogInterfaceC0867f) {
        Window window = dialogInterfaceC0867f.getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
    }

    /* renamed from: p */
    public static void m3023p(Switch r2, String str, boolean z2, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        boolean m3299e = AbstractC1372y1.m3299e(str);
        r2.setChecked(!m3299e && z2);
        r2.setEnabled(true);
        m3017j(r2, m3299e);
        r2.setOnCheckedChangeListener(new C0031y(str, 6, onCheckedChangeListener));
    }

    /* renamed from: q */
    public static void m3024q(Activity activity) {
        if (activity == null) {
            return;
        }
        if (!cfgData.m1784i().m1790j()) {
            m2998M(activity, true);
        }
        activity.finish();
    }

    /* renamed from: r */
    public static void m3025r(cfgData cfgdata, String str, Rect rect, int i) {
        if (cfgdata == null || str == null) {
            return;
        }
        if (!cfgdata.f2592Y1 && (str.contains(cfgdata.f2708w) || str.contains(cfgdata.f2703v) || str.contains("yandex.auto.uma"))) {
            rect.left -= i == 2 ? cfgdata.f2596Z1 : cfgdata.f2616d2;
            rect.right += i == 2 ? cfgdata.f2601a2 : cfgdata.f2621e2;
            rect.top -= i == 2 ? cfgdata.f2606b2 : cfgdata.f2626f2;
            rect.bottom += i == 2 ? cfgdata.f2611c2 : cfgdata.f2631g2;
        }
        if (cfgdata.f2704v0) {
            rect.left -= 120;
            rect.right -= 120;
        }
    }

    /* renamed from: s */
    public static EnumC1314f0 m3026s(Context context) {
        int i = cfgData.m1784i().f2508D3;
        EnumC1314f0 enumC1314f0 = EnumC1314f0.f6116c;
        if (i == 12) {
            return enumC1314f0;
        }
        String language = Locale.getDefault().getLanguage();
        if ("ar".equalsIgnoreCase(language)) {
            return enumC1314f0;
        }
        boolean equalsIgnoreCase = "en".equalsIgnoreCase(language);
        EnumC1314f0 enumC1314f02 = EnumC1314f0.f6115b;
        if (equalsIgnoreCase) {
            return enumC1314f02;
        }
        if (context != null) {
            String language2 = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
            if ("ar".equalsIgnoreCase(language2)) {
                return enumC1314f0;
            }
            if ("en".equalsIgnoreCase(language2)) {
                return enumC1314f02;
            }
        }
        return EnumC1314f0.f6114a;
    }

    /* renamed from: t */
    public static void m3027t(DialogInterfaceC0867f dialogInterfaceC0867f, View view, RunnableC1704c runnableC1704c) {
        if (view != null) {
            view.animate().cancel();
            view.setEnabled(false);
            view.animate().alpha(0.0f).scaleX(0.72f).scaleY(0.72f).setDuration(350L).setInterpolator(new AccelerateInterpolator()).withEndAction(new RunnableC0018l(dialogInterfaceC0867f, 12, runnableC1704c)).start();
        } else {
            if (dialogInterfaceC0867f != null) {
                try {
                    if (dialogInterfaceC0867f.isShowing()) {
                        dialogInterfaceC0867f.dismiss();
                    }
                } catch (RuntimeException unused) {
                }
            }
            if (runnableC1704c != null) {
                runnableC1704c.run();
            }
        }
    }

    /* renamed from: u */
    public static float m3028u(View view, float f2) {
        return f2 * view.getResources().getDisplayMetrics().density;
    }

    /* renamed from: v */
    public static Long m3029v(double d, double d2, Calendar calendar, boolean z2) {
        double d3 = d2 / 15.0d;
        double d4 = (((z2 ? 6.0d : 18.0d) - d3) / 24.0d) + calendar.get(6);
        double d5 = (0.9856d * d4) - 3.289d;
        double sin = (((Math.sin(0.03490658503988659d * d5) * 0.02d) + ((Math.sin(d5 * 0.017453292519943295d) * 1.916d) + d5)) + 282.634d) % 360.0d;
        if (sin < 0.0d) {
            sin += 360.0d;
        }
        double d6 = sin * 0.017453292519943295d;
        double atan = (Math.atan(Math.tan(d6) * 0.91764d) * 57.29577951308232d) % 360.0d;
        if (atan < 0.0d) {
            atan += 360.0d;
        }
        double floor = (((Math.floor(sin / 90.0d) * 90.0d) - (Math.floor(atan / 90.0d) * 90.0d)) + atan) / 15.0d;
        double sin2 = Math.sin(d6) * 0.39782d;
        double d7 = 0.017453292519943295d * d;
        double cos = (Math.cos(1.5853401554517652d) - (Math.sin(d7) * sin2)) / (Math.cos(d7) * Math.cos(Math.asin(sin2)));
        if (cos > 1.0d || cos < -1.0d) {
            return null;
        }
        double acos = Math.acos(cos);
        double d8 = ((((((z2 ? 360.0d - (acos * 57.29577951308232d) : acos * 57.29577951308232d) / 15.0d) + floor) - (d4 * 0.06571d)) - 6.622d) - d3) % 24.0d;
        if (d8 < 0.0d) {
            d8 += 24.0d;
        }
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar2.set(1, calendar.get(1));
        calendar2.set(2, calendar.get(2));
        calendar2.set(5, calendar.get(5));
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return Long.valueOf(Math.round(d8 * 3600000.0d) + calendar2.getTimeInMillis());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: w */
    public static JSONObject m3030w(SharedPreferences sharedPreferences) {
        char c2;
        boolean z2;
        char c3;
        boolean z3;
        JSONObject jSONObject = new JSONObject();
        String[] strArr = f5687d;
        for (int i = 0; i < 34; i++) {
            String str = strArr[i];
            str.getClass();
            switch (str.hashCode()) {
                case -1579140449:
                    if (str.equals("driveMode_eco")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1417195774:
                    if (str.equals("driveMode_sport")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1356922855:
                    if (str.equals("ballMsgRadio")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1354572439:
                    if (str.equals("ballMsgTrack")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1254316021:
                    if (str.equals("tbox_mode")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1127381223:
                    if (str.equals("driveMode_normal")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 329418015:
                    if (str.equals("pipmonitoring")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1611990331:
                    if (str.equals("ballMsgNet")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    z3 = true;
                    break;
                default:
                    z3 = false;
                    break;
            }
            jSONObject.put(str, sharedPreferences.getBoolean(str, z3));
        }
        for (int i2 = 1; i2 <= 7; i2++) {
            String num = Integer.toString(i2);
            String[] strArr2 = f5691h;
            for (int i3 = 0; i3 < 34; i3++) {
                String str2 = strArr2[i3];
                String str3 = str2 + num;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -1903319001:
                        if (str2.equals("show_trip")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -836039136:
                        if (str2.equals("usehut")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -339042820:
                        if (str2.equals("showMenu")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -338507942:
                        if (str2.equals("show_day")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -338497288:
                        if (str2.equals("show_odo")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 5130383:
                        if (str2.equals("alicealways")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80166999:
                        if (str2.equals("show_cruise")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1114152247:
                        if (str2.equals("show_gauge")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1126393417:
                        if (str2.equals("show_tires")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1736426951:
                        if (str2.equals("mode_color")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1980111720:
                        if (str2.equals("show_gauge_txt")) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case Platform.GNU /* 9 */:
                    case Platform.KFREEBSD /* 10 */:
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
                jSONObject.put(str3, sharedPreferences.getBoolean(str3, z2));
            }
        }
        return jSONObject;
    }

    /* renamed from: x */
    public static JSONObject m3031x(SharedPreferences sharedPreferences) {
        float f2;
        JSONObject jSONObject = new JSONObject();
        String[] strArr = f5689f;
        int i = 0;
        while (true) {
            float f3 = 0.0f;
            if (i >= 5) {
                break;
            }
            String str = strArr[i];
            if ("k_speed".equals(str)) {
                f3 = 1.045f;
            } else if ("k_remain_odo".equals(str)) {
                f3 = 1.0f;
            }
            jSONObject.put(str, sharedPreferences.getFloat(str, f3));
            i++;
        }
        for (int i2 = 1; i2 <= 7; i2++) {
            String num = Integer.toString(i2);
            String[] strArr2 = f5693j;
            for (int i3 = 0; i3 < 3; i3++) {
                String str2 = strArr2[i3];
                String str3 = str2 + num;
                str2.getClass();
                switch (str2) {
                    case "spd_alm":
                        f2 = 220.0f;
                        break;
                    case "tire_p_min_alm":
                        f2 = 2.1f;
                        break;
                    case "rpm_alm":
                        f2 = 8.0f;
                        break;
                    default:
                        f2 = 0.0f;
                        break;
                }
                jSONObject.put(str3, sharedPreferences.getFloat(str3, f2));
            }
        }
        return jSONObject;
    }

    /* renamed from: y */
    public static JSONObject m3032y(SharedPreferences sharedPreferences) {
        int i;
        int i2;
        JSONObject jSONObject = new JSONObject();
        String[] strArr = f5688e;
        for (int i3 = 0; i3 < 9; i3++) {
            String str = strArr[i3];
            if (!"presetnum".equals(str) && !"autoPresetDay".equals(str)) {
                if ("autoPresetNight".equals(str)) {
                    i2 = 2;
                } else if (!"splitInfoVolSwipe".equals(str)) {
                    i2 = 0;
                }
                jSONObject.put(str, sharedPreferences.getInt(str, i2));
            }
            i2 = 1;
            jSONObject.put(str, sharedPreferences.getInt(str, i2));
        }
        for (int i4 = 1; i4 <= 7; i4++) {
            String num = Integer.toString(i4);
            String[] strArr2 = f5692i;
            for (int i5 = 0; i5 < 21; i5++) {
                String str2 = strArr2[i5];
                String str3 = str2 + num;
                str2.getClass();
                i = 30;
                switch (str2) {
                    case "zbound":
                        i = 1000;
                        break;
                    case "zbottom":
                        i = 500;
                        break;
                    case "yn_corr_left_hu":
                    case "yn_corr_left_pp":
                    case "yn_corr_bottom_hu":
                    case "yn_corr_bottom_pp":
                    case "yn_corr_right_hu":
                    case "yn_corr_right_pp":
                        break;
                    default:
                        i = 0;
                        break;
                }
                jSONObject.put(str3, sharedPreferences.getInt(str3, i));
            }
        }
        return jSONObject;
    }

    /* renamed from: z */
    public static JSONObject m3033z(SharedPreferences sharedPreferences) {
        String str;
        JSONObject jSONObject = new JSONObject();
        String[] strArr = f5690g;
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            jSONObject.put(str2, sharedPreferences.getString(str2, ""));
        }
        for (int i2 = 1; i2 <= 7; i2++) {
            String num = Integer.toString(i2);
            String[] strArr2 = f5694k;
            for (int i3 = 0; i3 < 3; i3++) {
                String str3 = strArr2[i3];
                String str4 = str3 + num;
                str3.getClass();
                switch (str3) {
                    case "right_pkg":
                    case "left_pkg":
                        str = "---";
                        break;
                    case "prg1":
                        str = "com.alphainventor.filemanager";
                        break;
                    default:
                        str = "";
                        break;
                }
                jSONObject.put(str4, sharedPreferences.getString(str4, str));
            }
        }
        return jSONObject;
    }
}
