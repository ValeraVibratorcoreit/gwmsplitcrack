package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.InterfaceC0553r;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.MarqueeTextView;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.p061ip.HolePunchImageView;
import com.altaysoft.t500_split.p061ip.HolePunchLayout;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import p001A0.RunnableC0024r;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p015G0.ViewOnLayoutChangeListenerC0108a;
import p022K.C0174W;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1372y1;
import p098q0.C1260G0;
import p098q0.C1271M;
import p098q0.C1311e0;
import p106t0.EnumC1455a;
import p106t0.EnumC1457c;

/* renamed from: u0.Z0 */
/* loaded from: classes.dex */
public final class C1518Z0 {

    /* renamed from: A */
    public TextView f7988A;

    /* renamed from: B */
    public long f7989B;

    /* renamed from: C */
    public long f7990C;

    /* renamed from: D */
    public boolean f7991D;

    /* renamed from: E */
    public long f7992E;

    /* renamed from: N */
    public C1260G0 f8001N;

    /* renamed from: O */
    public C1260G0 f8002O;

    /* renamed from: P */
    public C1260G0 f8003P;

    /* renamed from: Q */
    public C1260G0 f8004Q;

    /* renamed from: R */
    public long f8005R;

    /* renamed from: S */
    public boolean f8006S;

    /* renamed from: U */
    public float f8008U;

    /* renamed from: W */
    public boolean f8010W;

    /* renamed from: X */
    public boolean f8011X;

    /* renamed from: Y */
    public boolean f8012Y;

    /* renamed from: Z */
    public ValueAnimator f8013Z;

    /* renamed from: a */
    public final C1537g f8014a;

    /* renamed from: b */
    public final View f8016b;

    /* renamed from: c */
    public final InterfaceC0553r f8018c;

    /* renamed from: g */
    public C1563o1 f8024g;

    /* renamed from: h */
    public FrameLayout f8025h;

    /* renamed from: i */
    public HolePunchLayout f8026i;

    /* renamed from: j */
    public HolePunchImageView f8027j;

    /* renamed from: k */
    public ImageView f8028k;

    /* renamed from: l */
    public ImageView f8029l;

    /* renamed from: m */
    public ImageView f8030m;

    /* renamed from: n */
    public ImageView f8031n;

    /* renamed from: o */
    public C1524b1 f8032o;

    /* renamed from: p */
    public C1524b1 f8033p;

    /* renamed from: q */
    public ImageView f8034q;

    /* renamed from: r */
    public ImageView f8035r;

    /* renamed from: s */
    public C1527c1 f8036s;

    /* renamed from: t */
    public C1527c1 f8037t;

    /* renamed from: u */
    public LinearLayout f8038u;

    /* renamed from: v */
    public ImageView f8039v;

    /* renamed from: w */
    public MarqueeTextView f8040w;

    /* renamed from: x */
    public TextView f8041x;

    /* renamed from: y */
    public ProgressBar f8042y;

    /* renamed from: z */
    public TextView f8043z;

    /* renamed from: d */
    public final cfgData f8020d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f8022e = carData.getInstance();

    /* renamed from: f */
    public final Handler f8023f = new Handler(Looper.getMainLooper());

    /* renamed from: F */
    public final HashMap f7993F = new HashMap();

    /* renamed from: G */
    public final HashMap f7994G = new HashMap();

    /* renamed from: H */
    public final HashMap f7995H = new HashMap();

    /* renamed from: I */
    public final HashMap f7996I = new HashMap();

    /* renamed from: J */
    public final HashMap f7997J = new HashMap();

    /* renamed from: K */
    public final HashMap f7998K = new HashMap();

    /* renamed from: L */
    public final HashMap f7999L = new HashMap();

    /* renamed from: M */
    public final ArrayList f8000M = new ArrayList();

    /* renamed from: T */
    public boolean f8007T = true;

    /* renamed from: V */
    public int f8009V = 0;

    /* renamed from: a0 */
    public final RunnableC0024r f8015a0 = new RunnableC0024r(28, this);

    /* renamed from: b0 */
    public final RunnableC1514X0 f8017b0 = new RunnableC1514X0(this, 0);

    /* renamed from: c0 */
    public final RunnableC1514X0 f8019c0 = new RunnableC1514X0(this, 1);

    /* renamed from: d0 */
    public final RunnableC1514X0 f8021d0 = new RunnableC1514X0(this, 2);

    public C1518Z0(C1537g c1537g, View view) {
        this.f8014a = c1537g;
        this.f8016b = view;
        this.f8018c = c1537g;
        AbstractC1539g1.f8253b = c1537g.getApplicationContext();
    }

    /* renamed from: n */
    public static String m4083n(int i) {
        int max = Math.max(0, i);
        return String.format(Locale.US, "%d:%02d", Integer.valueOf(max / 60), Integer.valueOf(max % 60));
    }

    /* renamed from: o */
    public static String m4084o(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: s */
    public static boolean m4085s(String str) {
        return "avg_speed_trip".equals(str) || "avg_speed_day".equals(str) || "avg_fuel".equals(str) || "avg_fuel_day".equals(str);
    }

    /* renamed from: t */
    public static boolean m4086t(String str) {
        return "wheel_fl".equals(str) || "wheel_fr".equals(str) || "wheel_rl".equals(str) || "wheel_rr".equals(str);
    }

    /* renamed from: u */
    public static boolean m4087u(float f2) {
        return f2 == -99.0f || f2 == 3.5f;
    }

    /* renamed from: v */
    public static boolean m4088v(String str) {
        return "wheel_fl_t".equals(str) || "wheel_fr_t".equals(str) || "wheel_rl_t".equals(str) || "wheel_rr_t".equals(str);
    }

    /* renamed from: w */
    public static float m4089w(C1516Y0 c1516y0, long j2) {
        long j3 = j2 - c1516y0.f7983d;
        if (j3 < 0) {
            j3 = 0;
        }
        int i = c1516y0.f7984e;
        if (i <= 0) {
            i = 1000;
        }
        float min = Math.min(1.0f, j3 / i);
        float f2 = c1516y0.f7980a;
        return AbstractC0062j.m149c(c1516y0.f7981b, f2, min, f2);
    }

    /* renamed from: A */
    public final void m4090A() {
        boolean z2 = this.f8007T;
        HashMap hashMap = this.f7999L;
        if (!z2) {
            for (ImageView imageView : hashMap.values()) {
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            return;
        }
        ImageView imageView2 = (ImageView) hashMap.get("wifi");
        carData cardata = this.f8022e;
        if (imageView2 != null) {
            imageView2.setVisibility(cardata.getWifi() ? 0 : 4);
            imageView2.setColorFilter(-1);
        }
        ImageView imageView3 = (ImageView) hashMap.get("inet");
        if (imageView3 != null) {
            imageView3.setVisibility((cardata.m1763n() || cardata.m1713A()) ? 0 : 4);
            imageView3.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
        ImageView imageView4 = (ImageView) hashMap.get("cruise_ico");
        ImageView imageView5 = (ImageView) hashMap.get("la");
        cfgData cfgdata = this.f8020d;
        if (!cfgdata.f2589X2) {
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            if (imageView5 != null) {
                imageView5.setVisibility(4);
            }
            m4109d(false);
            return;
        }
        int m1745e = cardata.m1745e();
        int i = m1745e & 15;
        int i2 = (m1745e >> 4) & Function.USE_VARARGS;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite) {
            i2 = 1;
            i = 1;
        }
        m4109d(i == 2 || i == 3);
        if (imageView4 != null) {
            if (i == 2) {
                imageView4.setVisibility(0);
                imageView4.setColorFilter(-7829368);
            } else if (i == 3) {
                imageView4.setVisibility(0);
                imageView4.setColorFilter(-16711936);
            } else {
                imageView4.setVisibility(4);
            }
        }
        if (imageView5 != null) {
            if (i2 == 1) {
                imageView5.setVisibility(4);
                return;
            }
            if (i2 == 2) {
                imageView5.setVisibility(0);
                imageView5.setColorFilter(-7829368);
            } else if (i2 != 3) {
                imageView5.setVisibility(4);
            } else {
                imageView5.setVisibility(0);
                imageView5.setColorFilter(-16711936);
            }
        }
    }

    /* renamed from: B */
    public final void m4091B(C0636d c0636d) {
        LinearLayout linearLayout = this.f8038u;
        if (linearLayout == null) {
            return;
        }
        AbstractC0641i.m1892i(linearLayout, c0636d);
        if (!this.f8007T) {
            this.f8038u.setVisibility(8);
            return;
        }
        if (!this.f8020d.f2585W2 || c0636d == null || !c0636d.m1851a()) {
            this.f8038u.setVisibility(8);
            return;
        }
        this.f8038u.setVisibility(0);
        MarqueeTextView marqueeTextView = this.f8040w;
        if (marqueeTextView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(marqueeTextView, str);
        }
        TextView textView = this.f8041x;
        if (textView != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView, str2 != null ? str2 : "");
            this.f8041x.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f8039v;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f8039v.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f8039v.setVisibility(8);
            }
        }
        this.f7989B = c0636d.f3002h;
        this.f7990C = c0636d.f3001g;
        this.f7991D = c0636d.f3000f;
        this.f7992E = SystemClock.elapsedRealtime();
        m4111f(this.f7990C);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: C */
    public final void m4092C(String str) {
        carData cardata;
        cfgData cfgdata;
        char c2;
        String valueOf;
        String str2;
        String str3;
        char c3;
        C1260G0 c1260g0;
        C1260G0 c1260g02;
        float max;
        C1560n1 c1560n1 = (C1560n1) this.f7995H.get(str);
        if (c1560n1 == null) {
            return;
        }
        TextView textView = (TextView) this.f7993F.get(str);
        str.getClass();
        cardata = this.f8022e;
        cfgdata = this.f8020d;
        Float f2 = null;
        switch (str) {
            case "cruise_speed":
                if (cfgdata.f2589X2) {
                    int m1747f = cardata.m1747f();
                    c2 = 20;
                    if (m1747f >= 20) {
                        valueOf = String.valueOf(m1747f);
                        break;
                    } else {
                        valueOf = "--";
                        break;
                    }
                }
                valueOf = null;
                c2 = 20;
                break;
            case "moto_hours":
                valueOf = m4083n((int) (Math.max(0L, cfgdata.f2675p1) / 60000));
                c2 = 20;
                break;
            case "gear":
                int m1757k = cardata.m1757k();
                str2 = m1757k != 2 ? m1757k != 3 ? m1757k != 4 ? m1757k != 5 ? "N" : "M" : "R" : "P" : "D";
                str3 = str2;
                valueOf = str3;
                c2 = 20;
                break;
            case "hv_a":
                EnumC1457c enumC1457c = cfgdata.f2543M0;
                if (enumC1457c != null && enumC1457c.f7149h) {
                    float m1761m = cardata.m1761m();
                    if (!Float.isNaN(m1761m) && !Float.isInfinite(m1761m) && m1761m >= 0.1f) {
                        float m1759l = cardata.m1759l();
                        if (!Float.isNaN(m1759l) && !Float.isInfinite(m1759l)) {
                            str3 = null;
                            valueOf = str3;
                            c2 = 20;
                            break;
                        }
                    }
                }
                str2 = "—";
                str3 = str2;
                valueOf = str3;
                c2 = 20;
                break;
            case "drive_time_day":
                str3 = m4083n(((Integer) cardata.f2477u0.m1395d()).intValue());
                valueOf = str3;
                c2 = 20;
                break;
            case "gear_num":
                EnumC1457c enumC1457c2 = cfgdata.f2543M0;
                if (enumC1457c2 == null || enumC1457c2.f7150i) {
                    int m1749g = cardata.m1749g();
                    if (cardata.m1757k() != 5 && m1749g > 0) {
                        str2 = String.valueOf(m1749g);
                        str3 = str2;
                        valueOf = str3;
                        c2 = 20;
                        break;
                    }
                }
                str3 = "";
                valueOf = str3;
                c2 = 20;
                break;
            case "drive_time_trip":
                str3 = m4083n(((Integer) cardata.f2479v0.m1395d()).intValue());
                valueOf = str3;
                c2 = 20;
                break;
            default:
                valueOf = null;
                c2 = 20;
                break;
        }
        if (valueOf != null) {
            if (textView != null) {
                textView.setText(valueOf);
                String str4 = c1560n1.f8479n;
                if (str4 == null) {
                    str4 = "#FFFFFF";
                }
                m4113h(textView, c1560n1, str4);
                m4094E(str);
                return;
            }
            return;
        }
        switch (str.hashCode()) {
            case -1271819970:
                if (str.equals("fuel_range2")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1263626205:
                if (str.equals("fuel_l")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1253510409:
                if (str.equals("fuel_since_refuel")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -694183840:
                if (str.equals("at_temp")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -559640682:
                if (str.equals("oil_press")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -331239923:
                if (str.equals("battery")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -288443299:
                if (str.equals("cruise_speed")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 96681:
                if (str.equals("alt")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 99228:
                if (str.equals("day")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 109882:
                if (str.equals("odo")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 3016380:
                if (str.equals("baro")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 3154358:
                if (str.equals("fuel")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 3214704:
                if (str.equals("hv_a")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 3214725:
                if (str.equals("hv_v")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 3506301:
                if (str.equals("roll")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 3568677:
                if (str.equals("trip")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 27029519:
                if (str.equals("inst_fuel")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 54439461:
                if (str.equals("out_temp")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 74876074:
                if (str.equals("avg_speed_trip")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 97785148:
                if (str.equals("fuel2")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 106677056:
                if (str.equals("pitch")) {
                    c3 = c2;
                    break;
                }
                c3 = 65535;
                break;
            case 109760977:
                if (str.equals("steer")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 236068212:
                if (str.equals("fuel_range")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 418041463:
                if (str.equals("avg_speed_day")) {
                    c3 = 23;
                    break;
                }
                c3 = 65535;
                break;
            case 504679520:
                if (str.equals("avg_fuel_day")) {
                    c3 = 24;
                    break;
                }
                c3 = 65535;
                break;
            case 700458150:
                if (str.equals("fuel_used")) {
                    c3 = 25;
                    break;
                }
                c3 = 65535;
                break;
            case 795311618:
                if (str.equals("heading")) {
                    c3 = 26;
                    break;
                }
                c3 = 65535;
                break;
            case 952211966:
                if (str.equals("coolant")) {
                    c3 = 27;
                    break;
                }
                c3 = 65535;
                break;
            case 1649597855:
                if (str.equals("wheel_fl_t")) {
                    c3 = 28;
                    break;
                }
                c3 = 65535;
                break;
            case 1649603621:
                if (str.equals("wheel_fr_t")) {
                    c3 = 29;
                    break;
                }
                c3 = 65535;
                break;
            case 1649955347:
                if (str.equals("wheel_rl_t")) {
                    c3 = 30;
                    break;
                }
                c3 = 65535;
                break;
            case 1649961113:
                if (str.equals("wheel_rr_t")) {
                    c3 = 31;
                    break;
                }
                c3 = 65535;
                break;
            case 1939103406:
                if (str.equals("in_temp")) {
                    c3 = ' ';
                    break;
                }
                c3 = 65535;
                break;
            case 1939821315:
                if (str.equals("avg_fuel")) {
                    c3 = '!';
                    break;
                }
                c3 = 65535;
                break;
            case 2035233834:
                if (str.equals("wheel_fl")) {
                    c3 = '\"';
                    break;
                }
                c3 = 65535;
                break;
            case 2035233840:
                if (str.equals("wheel_fr")) {
                    c3 = '#';
                    break;
                }
                c3 = 65535;
                break;
            case 2035234206:
                if (str.equals("wheel_rl")) {
                    c3 = '$';
                    break;
                }
                c3 = 65535;
                break;
            case 2035234212:
                if (str.equals("wheel_rr")) {
                    c3 = '%';
                    break;
                }
                c3 = 65535;
                break;
            case 2060263969:
                if (str.equals("oil_temp")) {
                    c3 = '&';
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
                f2 = (Float) cardata.f2457k0.m1395d();
                f2.floatValue();
                break;
            case 1:
                EnumC1457c enumC1457c3 = cfgdata.f2543M0;
                if (enumC1457c3 == null || !enumC1457c3.f7147f) {
                    max = Math.max(0.0f, cardata.m1774t()) * ((cfgdata.f2709w0 || enumC1457c3 != null) ? cfgdata.m1789h() : 1.0f);
                } else {
                    max = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c3 != EnumC1457c.T500_BT_NEW ? 1.0f : 10.0f);
                }
                f2 = Float.valueOf(max);
                break;
            case 2:
                f2 = Float.valueOf(cfgdata.f2524H1);
                break;
            case 3:
                f2 = Float.valueOf(((Integer) cardata.f2419V.m1395d()).intValue());
                break;
            case 4:
                f2 = (Float) cardata.f2463n0.m1395d();
                f2.floatValue();
                break;
            case 5:
                f2 = Float.valueOf(cardata.m1741c());
                break;
            case 6:
                f2 = Float.valueOf(cardata.m1747f());
                break;
            case 7:
                f2 = (Float) cardata.f2405O.m1395d();
                f2.floatValue();
                break;
            case '\b':
                f2 = Float.valueOf(cardata.m1769q());
                break;
            case Platform.GNU /* 9 */:
                f2 = Float.valueOf(cardata.m1771r());
                break;
            case Platform.KFREEBSD /* 10 */:
                f2 = (Float) cardata.f2407P.m1395d();
                f2.floatValue();
                break;
            case Platform.NETBSD /* 11 */:
                f2 = Float.valueOf(m4119p());
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                f2 = Float.valueOf(cardata.m1759l());
                break;
            case '\r':
                f2 = Float.valueOf(cardata.m1761m());
                break;
            case 14:
                Float f3 = (Float) cardata.f2443e1.m1395d();
                f2 = Float.valueOf(f3 != null ? f3.floatValue() : 0.0f);
                break;
            case 15:
                f2 = Float.valueOf(cardata.m1767p());
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                f2 = Float.valueOf(cardata.m1765o());
                break;
            case 17:
                f2 = Float.valueOf(cardata.m1773s());
                break;
            case 18:
                f2 = (Float) cardata.f2475t0.m1395d();
                f2.getClass();
                break;
            case 19:
                f2 = Float.valueOf(cardata.m1776v());
                break;
            case 20:
                Float f4 = (Float) cardata.f2440d1.m1395d();
                f2 = Float.valueOf(f4 != null ? f4.floatValue() : 0.0f);
                break;
            case 21:
                Float f5 = (Float) cardata.f2409Q.m1395d();
                f2 = Float.valueOf((((-(f5 != null ? f5.floatValue() : 0.0f)) / 10.0f) / 2.0f) * 1.1290323f);
                break;
            case 22:
                f2 = Float.valueOf(cardata.m1777w());
                break;
            case 23:
                f2 = (Float) cardata.f2473s0.m1395d();
                f2.floatValue();
                break;
            case 24:
                f2 = Float.valueOf(cardata.m1739b());
                break;
            case 25:
                f2 = Float.valueOf(Math.max(cardata.m1755j(), cfgdata.f2516F1));
                break;
            case 26:
                f2 = Float.valueOf(cardata.m1751h());
                break;
            case 27:
                f2 = Float.valueOf(cardata.m1743d());
                break;
            case 28:
                f2 = (Float) cardata.f2391H.m1395d();
                f2.floatValue();
                break;
            case 29:
                f2 = (Float) cardata.f2395J.m1395d();
                f2.floatValue();
                break;
            case 30:
                f2 = (Float) cardata.f2399L.m1395d();
                f2.floatValue();
                break;
            case 31:
                f2 = (Float) cardata.f2403N.m1395d();
                f2.floatValue();
                break;
            case ' ':
                f2 = (Float) cardata.f2413S.m1395d();
                f2.getClass();
                break;
            case '!':
                f2 = Float.valueOf(cardata.m1737a());
                break;
            case '\"':
                f2 = Float.valueOf(cardata.m1715C());
                break;
            case '#':
                f2 = Float.valueOf(cardata.m1716D());
                break;
            case '$':
                f2 = Float.valueOf(cardata.m1717E());
                break;
            case '%':
                f2 = Float.valueOf(cardata.m1718F());
                break;
            case '&':
                f2 = (Float) cardata.f2465o0.m1395d();
                f2.floatValue();
                break;
        }
        if (f2 == null) {
            return;
        }
        if ("fuel".equals(str) && (c1260g02 = this.f8003P) != null) {
            c1260g02.m3034a(f2.floatValue());
        } else if ("coolant".equals(str) && (c1260g0 = this.f8004Q) != null) {
            c1260g0.m3034a(f2.floatValue());
        }
        m4122x(str, f2.floatValue());
    }

    /* renamed from: D */
    public final void m4093D() {
        float m4120q = m4120q();
        C1260G0 c1260g0 = this.f8001N;
        if (c1260g0 != null) {
            c1260g0.m3034a(m4120q);
        }
        m4122x("speed", m4120q);
        TextView textView = (TextView) this.f7994G.get("inst_fuel");
        C1560n1 c1560n1 = (C1560n1) this.f7995H.get("inst_fuel");
        if (textView == null || c1560n1 == null || !c1560n1.f8427A) {
            return;
        }
        String m4294a = c1560n1.m4294a(m4120q() > 0.0f);
        if (m4294a.isEmpty()) {
            if (textView.getVisibility() != 4) {
                textView.setVisibility(4);
            }
        } else {
            if (textView.getVisibility() == 0 && m4294a.contentEquals(textView.getText())) {
                return;
            }
            textView.setText(m4294a);
            textView.setVisibility(0);
            m4094E("inst_fuel");
        }
    }

    /* renamed from: E */
    public final void m4094E(String str) {
        CharSequence text;
        TextView textView = (TextView) this.f7993F.get(str);
        C1560n1 c1560n1 = (C1560n1) this.f7996I.get(str);
        if (textView == null || c1560n1 == null) {
            return;
        }
        TextView textView2 = (TextView) this.f7994G.get(str);
        AbstractC1539g1.m4201W(textView, c1560n1.f8459d, c1560n1.f8461e, c1560n1.f8463f);
        if (textView2 == null || !c1560n1.f8427A || textView2.getVisibility() != 0 || (text = textView2.getText()) == null || text.length() <= 0) {
            return;
        }
        AbstractC1539g1.m4200V(textView2, textView, c1560n1);
    }

    /* renamed from: F */
    public final void m4095F() {
        this.f8023f.removeCallbacks(this.f8015a0);
        m4118m();
        this.f8010W = false;
        this.f8011X = false;
        AbstractC1372y1.m3287R(false, false);
        HolePunchLayout holePunchLayout = this.f8026i;
        if (holePunchLayout != null) {
            holePunchLayout.f2752L = false;
            holePunchLayout.f2745E = 0.0f;
            holePunchLayout.m1806l();
        }
    }

    /* renamed from: G */
    public final void m4096G() {
        m4097H();
        FrameLayout frameLayout = this.f8025h;
        if (frameLayout != null && this.f8008U <= 0.0f && frameLayout.getAlpha() < 1.0f) {
            this.f8025h.setAlpha(1.0f);
        }
        if (this.f8006S) {
            m4123y();
            m4091B(C0639g.m1872x().m1880u());
        }
    }

    /* renamed from: H */
    public final void m4097H() {
        HolePunchLayout holePunchLayout = this.f8026i;
        if (holePunchLayout != null) {
            holePunchLayout.animate().cancel();
            this.f8026i.setAlpha(1.0f);
            return;
        }
        View view = this.f8016b;
        if (view == null || view == this.f8025h) {
            return;
        }
        view.animate().cancel();
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4098I(String str, float f2, boolean z2) {
        String format;
        String str2;
        boolean contentEquals;
        int i;
        C1560n1 c1560n1 = (C1560n1) this.f7995H.get(str);
        if (c1560n1 == null) {
            return;
        }
        if (z2) {
            m4105P(str, f2);
        }
        TextView textView = (TextView) this.f7993F.get(str);
        if (textView == null) {
            return;
        }
        if (m4086t(str) && m4087u(f2)) {
            textView.setText("--");
            m4113h(textView, c1560n1, "#0000FF");
            m4094E(str);
            return;
        }
        if (m4088v(str) && f2 == -99.0f) {
            textView.setText("--");
            m4113h(textView, c1560n1, "#0000FF");
            m4094E(str);
            return;
        }
        if (("out_temp".equals(str) || "in_temp".equals(str)) && (f2 < -90.0f || Float.isNaN(f2) || Float.isInfinite(f2))) {
            textView.setText("--");
            m4113h(textView, c1560n1, c1560n1.f8479n);
            m4094E(str);
            return;
        }
        if (m4085s(str) && (f2 < 0.0f || Float.isNaN(f2) || Float.isInfinite(f2))) {
            textView.setText("--");
            m4113h(textView, c1560n1, c1560n1.f8479n);
            m4094E(str);
            return;
        }
        String str3 = (!m4086t(str) || f2 <= 10.0f) ? null : "%.0f";
        if (str3 != null) {
            format = String.format(Locale.US, str3, Float.valueOf(f2));
        } else {
            int i2 = c1560n1.f8465g;
            if (i2 <= 0) {
                Locale locale = Locale.US;
                int round = Math.round(f2);
                StringBuilder sb = new StringBuilder();
                sb.append(round);
                format = sb.toString();
            } else {
                format = String.format(Locale.US, "%." + i2 + "f", Float.valueOf(f2));
            }
        }
        if (m4086t(str) && !m4087u(f2)) {
            float f3 = this.f8020d.f2580V1;
            if (f2 < 0.95f * f3) {
                str2 = "#FF3333";
            } else if (f2 < f3) {
                str2 = "#FFCC00";
            }
            contentEquals = format.contentEquals(textView.getText());
            if (contentEquals) {
                int currentTextColor = textView.getCurrentTextColor();
                try {
                    i = Color.parseColor(str2);
                } catch (Exception unused) {
                    i = -1;
                }
                if (currentTextColor == i) {
                    return;
                }
            }
            if (!contentEquals) {
                textView.setText(format);
            }
            m4113h(textView, c1560n1, str2);
            if (contentEquals) {
                m4094E(str);
                return;
            }
            return;
        }
        Double d = c1560n1.f8483r;
        if (d == null || f2 < d.doubleValue()) {
            Double d2 = c1560n1.f8482q;
            if (d2 == null || f2 > d2.doubleValue()) {
                Double d3 = c1560n1.f8481p;
                if (d3 == null || f2 < d3.doubleValue()) {
                    Double d4 = c1560n1.f8480o;
                    str2 = (d4 == null || ((double) f2) > d4.doubleValue()) ? c1560n1.f8479n : c1560n1.f8484s;
                } else {
                    str2 = c1560n1.f8484s;
                }
            } else {
                str2 = c1560n1.f8485t;
            }
        } else {
            str2 = c1560n1.f8485t;
        }
        contentEquals = format.contentEquals(textView.getText());
        if (contentEquals) {
        }
        if (!contentEquals) {
        }
        m4113h(textView, c1560n1, str2);
        if (contentEquals) {
        }
    }

    /* renamed from: J */
    public final void m4099J(String str) {
        TextView textView = new TextView(this.f8014a);
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(0, 28.0f);
        textView.setGravity(17);
        textView.setPadding(48, 48, 48, 48);
        this.f8025h.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        m4097H();
        this.f8025h.setAlpha(1.0f);
    }

    /* renamed from: K */
    public final void m4100K() {
        C1563o1 c1563o1;
        if (this.f8012Y) {
            this.f8012Y = false;
            try {
                NativeLib.nativeUnbindPanel();
            } catch (Throwable unused) {
            }
        }
        View findViewById = this.f8016b.findViewById(R.id.main);
        if (findViewById instanceof FrameLayout) {
            this.f8025h = (FrameLayout) findViewById;
            View findViewById2 = this.f8016b.findViewById(R.id.ip_hole_root);
            if (findViewById2 instanceof HolePunchLayout) {
                this.f8026i = (HolePunchLayout) findViewById2;
            } else if (this.f8025h.getParent() instanceof HolePunchLayout) {
                this.f8026i = (HolePunchLayout) this.f8025h.getParent();
            } else {
                this.f8026i = null;
            }
            this.f8025h.removeAllViews();
            this.f8025h.setBackgroundColor(0);
            this.f7993F.clear();
            this.f7994G.clear();
            this.f7995H.clear();
            this.f7996I.clear();
            this.f7997J.clear();
            this.f7998K.clear();
            this.f7999L.clear();
            this.f8000M.clear();
            this.f8027j = null;
            this.f8031n = null;
            this.f8030m = null;
            this.f8029l = null;
            this.f8028k = null;
            this.f8033p = null;
            this.f8032o = null;
            this.f8035r = null;
            this.f8034q = null;
            this.f8004Q = null;
            this.f8003P = null;
            this.f8037t = null;
            this.f8036s = null;
            this.f8038u = null;
            this.f8039v = null;
            this.f7988A = null;
            this.f8043z = null;
            this.f8041x = null;
            this.f8040w = null;
            this.f8042y = null;
            this.f8024g = null;
            m4095F();
            cfgData cfgdata = this.f8020d;
            if (!cfgdata.f2537K2) {
                this.f8006S = false;
                HolePunchLayout holePunchLayout = this.f8026i;
                if (holePunchLayout != null) {
                    holePunchLayout.setQnxHoleEnabled(false);
                    return;
                }
                return;
            }
            boolean z2 = cfgdata.f2561Q2;
            this.f8007T = z2;
            AbstractC1372y1.m3286Q(z2);
            HolePunchLayout holePunchLayout2 = this.f8026i;
            if (holePunchLayout2 != null) {
                holePunchLayout2.setClosedHoleCoverAllowed(false);
                this.f8026i.setQnxHoleEnabled(false);
            }
            final String m4469u = AbstractC1569q1.m4469u(this.f8014a, this.f8020d.f2620e1);
            if (m4469u != null) {
                this.f8025h.setBackgroundColor(-16777216);
                m4099J(m4469u);
                final int i = 0;
                this.f8023f.post(new Runnable(this) { // from class: u0.U0

                    /* renamed from: b */
                    public final /* synthetic */ C1518Z0 f7884b;

                    {
                        this.f7884b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, m4469u);
                                break;
                            case 1:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, m4469u);
                                break;
                            default:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, m4469u);
                                break;
                        }
                    }
                });
                return;
            }
            C0043j m4305f = C1563o1.m4305f(this.f8014a, AbstractC1569q1.m4466r(this.f8020d.f2620e1));
            final String str = (String) m4305f.f142h;
            if (str != null || (c1563o1 = (C1563o1) m4305f.f141g) == null) {
                if (str == null) {
                    str = this.f8014a.getString(R.string.user_theme_build_error, "null layout");
                }
                this.f8025h.setBackgroundColor(-16777216);
                m4099J(str);
                final int i2 = 1;
                this.f8023f.post(new Runnable(this) { // from class: u0.U0

                    /* renamed from: b */
                    public final /* synthetic */ C1518Z0 f7884b;

                    {
                        this.f7884b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, str);
                                break;
                            case 1:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, str);
                                break;
                            default:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, str);
                                break;
                        }
                    }
                });
                return;
            }
            this.f8024g = c1563o1;
            AbstractC1569q1.f8668c = c1563o1.f8500g;
            C1551k1 c1551k1 = this.f8024g.f8508o;
            AbstractC1569q1.f8666a = c1551k1.f8366a;
            AbstractC1569q1.f8667b = c1551k1.f8367b;
            try {
                m4116k(this.f8025h);
                m4110e();
                AbstractC1294Y.m3149a(this.f8014a);
                m4121r();
                m4115j();
                Context context = this.f8014a;
                if (!this.f8012Y) {
                    HashMap hashMap = this.f7995H;
                    if (hashMap.containsKey("pitch") || hashMap.containsKey("roll") || hashMap.containsKey("heading")) {
                        try {
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            NativeLib.nativeBindPanel(context);
                            this.f8012Y = true;
                        } catch (Throwable unused2) {
                        }
                    }
                }
                m4097H();
                this.f8025h.setAlpha(0.0f);
                this.f8025h.animate().alpha(1.0f).setDuration(280L).start();
                this.f8006S = true;
                this.f8005R = 0L;
                this.f8008U = 0.0f;
                this.f8009V = this.f8022e.m1749g();
                this.f8023f.post(this.f8017b0);
                this.f8023f.post(this.f8019c0);
                this.f8023f.post(this.f8021d0);
                m4123y();
            } catch (Exception e2) {
                if (this.f8012Y) {
                    this.f8012Y = false;
                    try {
                        NativeLib.nativeUnbindPanel();
                    } catch (Throwable unused3) {
                    }
                }
                final String string = this.f8014a.getString(R.string.user_theme_build_error, e2.getMessage() != null ? e2.getMessage() : e2.getClass().getSimpleName());
                this.f8025h.removeAllViews();
                this.f8025h.setBackgroundColor(-16777216);
                m4099J(string);
                final int i3 = 2;
                this.f8023f.post(new Runnable(this) { // from class: u0.U0

                    /* renamed from: b */
                    public final /* synthetic */ C1518Z0 f7884b;

                    {
                        this.f7884b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, string);
                                break;
                            case 1:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, string);
                                break;
                            default:
                                AbstractC1569q1.m4464p(this.f7884b.f8014a, string);
                                break;
                        }
                    }
                });
            }
        }
    }

    /* renamed from: L */
    public final void m4101L(float f2, float f3) {
        if (this.f8026i == null || !m4104O()) {
            return;
        }
        m4118m();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f8013Z = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f8013Z);
        this.f8013Z.addUpdateListener(new C0174W(16, this));
        this.f8013Z.addListener(new C1271M(this, f3, 1));
        this.f8013Z.start();
    }

    /* renamed from: M */
    public final void m4102M(String str) {
        C1537g c1537g = this.f8014a;
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(c1537g, (Class<?>) MainActivity.class);
            intent.addFlags(402722816);
            intent.putExtra("caller", str);
            c1537g.startActivity(intent, makeBasic.setLaunchBounds(new Rect(0, 0, 1920, 1080)).toBundle());
        } catch (Exception e2) {
            Toast.makeText(c1537g, "ERROR3" + e2, 1).show();
        }
    }

    /* renamed from: N */
    public final void m4103N(float f2) {
        HolePunchLayout holePunchLayout = this.f8026i;
        if (holePunchLayout == null) {
            return;
        }
        holePunchLayout.setRightQnxHoleOpenProgress(f2);
        this.f8010W = f2 > 0.5f;
        AbstractC1372y1.m3287R(f2 > 0.01f, true);
        if (f2 <= 0.0f) {
            HolePunchLayout holePunchLayout2 = this.f8026i;
            holePunchLayout2.f2752L = false;
            holePunchLayout2.f2745E = 0.0f;
            holePunchLayout2.m1806l();
            this.f8025h.invalidate();
            this.f8026i.invalidate();
        }
    }

    /* renamed from: O */
    public final boolean m4104O() {
        C1563o1 c1563o1 = this.f8024g;
        return c1563o1 != null && c1563o1.f8500g;
    }

    /* renamed from: P */
    public final void m4105P(String str, float f2) {
        View view = (View) this.f7997J.get(str);
        C1560n1 c1560n1 = (C1560n1) this.f7995H.get(str);
        if (view == null || c1560n1 == null || !c1560n1.m4296c()) {
            return;
        }
        double d = f2;
        double d2 = c1560n1.f8438L;
        double d3 = c1560n1.f8439M;
        float f3 = 0.0f;
        if (d3 > d2) {
            double d4 = (d - d2) / (d3 - d2);
            if (d4 >= 0.0d) {
                f3 = d4 > 1.0d ? 1.0f : (float) d4;
            }
        }
        if (view instanceof C1548j1) {
            ((C1548j1) view).setFraction(f3);
            return;
        }
        int max = Math.max(1, c1560n1.f8440N);
        int max2 = Math.max(1, c1560n1.f8441O);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if ("bar_v".equals(c1560n1.f8437K)) {
                layoutParams2.width = max;
                layoutParams2.height = AbstractC0062j.m152f(max2, f3, 0);
                layoutParams2.gravity = 80;
            } else {
                layoutParams2.width = AbstractC0062j.m152f(max, f3, 0);
                layoutParams2.height = max2;
                layoutParams2.gravity = 8388627;
            }
            view.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: a */
    public final ImageView m4106a(FrameLayout frameLayout, C1554l1 c1554l1, boolean z2) {
        Bitmap bitmap = null;
        if (!c1554l1.f8375a) {
            return null;
        }
        int m4289a = c1554l1.m4289a();
        C1537g c1537g = this.f8014a;
        ImageView imageView = new ImageView(c1537g);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m4289a, m4289a);
        layoutParams.leftMargin = c1554l1.m4290b();
        layoutParams.topMargin = c1554l1.m4291c();
        frameLayout.addView(imageView, layoutParams);
        if (!AbstractC1569q1.m4451c()) {
            bitmap = AbstractC1569q1.m4458j(c1554l1.f8376b);
        } else if (c1537g != null) {
            bitmap = BitmapFactory.decodeResource(c1537g.getResources(), z2 ? R.drawable.theme_0_spd : R.drawable.theme_0_rpm);
        }
        if (bitmap == null) {
            throw new IllegalStateException(c1537g.getString(R.string.user_theme_bitmap_gauge, AbstractC1569q1.m4451c() ? "theme_0" : c1554l1.f8376b));
        }
        bitmap.setDensity(0);
        imageView.setImageBitmap(bitmap);
        this.f8000M.add(imageView);
        return imageView;
    }

    /* renamed from: b */
    public final ImageView m4107b(FrameLayout frameLayout, C1554l1 c1554l1) {
        Bitmap bitmap = null;
        if (!c1554l1.f8375a) {
            return null;
        }
        int m4289a = c1554l1.m4289a();
        C1537g c1537g = this.f8014a;
        ImageView imageView = new ImageView(c1537g);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m4289a, m4289a);
        layoutParams.leftMargin = c1554l1.m4290b();
        layoutParams.topMargin = c1554l1.m4291c();
        frameLayout.addView(imageView, layoutParams);
        if (!AbstractC1569q1.m4451c()) {
            bitmap = AbstractC1569q1.m4458j(c1554l1.f8377c);
        } else if (c1537g != null) {
            bitmap = BitmapFactory.decodeResource(c1537g.getResources(), R.drawable.theme_0_needle);
        }
        if (bitmap == null) {
            throw new IllegalStateException(c1537g.getString(R.string.user_theme_bitmap_needle, AbstractC1569q1.m4451c() ? "theme_0_needle" : c1554l1.f8377c));
        }
        bitmap.setDensity(0);
        imageView.setImageBitmap(bitmap);
        this.f8000M.add(imageView);
        return imageView;
    }

    /* renamed from: c */
    public final C1524b1 m4108c(FrameLayout frameLayout, C1554l1 c1554l1) {
        if (!c1554l1.f8375a) {
            return null;
        }
        C1563o1 c1563o1 = this.f8024g;
        C1557m1 c1557m1 = c1563o1 != null ? c1563o1.f8499f : null;
        if (c1557m1 == null || !c1557m1.f8397a) {
            return null;
        }
        int m4289a = c1554l1.m4289a();
        C1524b1 c1524b1 = new C1524b1(this.f8014a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m4289a, m4289a);
        layoutParams.leftMargin = c1554l1.m4290b();
        layoutParams.topMargin = c1554l1.m4291c();
        frameLayout.addView(c1524b1, layoutParams);
        c1524b1.m4158a(c1557m1, c1554l1.f8382h);
        this.f8000M.add(c1524b1);
        return c1524b1;
    }

    /* renamed from: d */
    public final void m4109d(boolean z2) {
        int i = z2 ? 0 : 4;
        View view = (View) this.f7993F.get("cruise_speed");
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = (View) this.f7994G.get("cruise_speed");
        if (view2 != null) {
            view2.setVisibility(i);
        }
        View view3 = (View) this.f7997J.get("cruise_speed");
        if (view3 != null) {
            view3.setVisibility(i);
        }
    }

    /* renamed from: e */
    public final void m4110e() {
        boolean z2;
        AbstractC1372y1.m3286Q(this.f8007T);
        boolean z3 = false;
        int i = this.f8007T ? 0 : 8;
        if (this.f8025h != null) {
            for (int i2 = 0; i2 < this.f8025h.getChildCount(); i2++) {
                View childAt = this.f8025h.getChildAt(i2);
                if (childAt != null) {
                    childAt.setVisibility(i);
                }
            }
        } else {
            Iterator it = this.f8000M.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null) {
                    view.setVisibility(i);
                }
            }
        }
        boolean z4 = this.f8007T;
        cfgData cfgdata = this.f8020d;
        if (z4) {
            C1563o1 c1563o1 = this.f8024g;
            z2 = AbstractC1539g1.m4220h0(cfgdata, c1563o1 != null ? c1563o1.f8494a : null);
        } else {
            z2 = AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
        }
        C1527c1 c1527c1 = this.f8036s;
        if (c1527c1 != null) {
            c1527c1.setVisibility(z2 ? 0 : 4);
        }
        C1527c1 c1527c12 = this.f8037t;
        if (c1527c12 != null) {
            c1527c12.setVisibility(z2 ? 0 : 4);
        }
        HashMap hashMap = this.f7994G;
        View view2 = (View) hashMap.get("speed");
        if (view2 != null) {
            view2.setVisibility(z2 ? 0 : 4);
        }
        View view3 = (View) hashMap.get("rpm");
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 4);
        }
        if (this.f8026i != null) {
            if (m4104O() && this.f8007T) {
                z3 = true;
            }
            this.f8026i.setQnxHoleEnabled(z3);
            if (!z3 && (this.f8010W || this.f8026i.m1807m())) {
                m4095F();
            }
        }
        AbstractC1539g1.m4228l0(this.f8026i, !this.f8007T);
        if (this.f8007T) {
            m4090A();
            m4091B(C0639g.m1872x().m1880u());
        }
    }

    /* renamed from: f */
    public final void m4111f(long j2) {
        boolean z2 = this.f7989B > 0;
        ProgressBar progressBar = this.f8042y;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8042y.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7989B)));
            }
        }
        TextView textView = this.f8043z;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8043z.setText(m4084o(j2));
            }
        }
        TextView textView2 = this.f7988A;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7988A.setText(m4084o(this.f7989B));
            }
        }
    }

    /* renamed from: g */
    public final void m4112g() {
        Rect m4231n;
        int i;
        int i2;
        HolePunchImageView holePunchImageView = this.f8027j;
        if (holePunchImageView == null) {
            return;
        }
        C1563o1 c1563o1 = this.f8024g;
        if (c1563o1 != null && c1563o1.f8498e) {
            holePunchImageView.m1802b();
            return;
        }
        boolean m4199U = AbstractC1539g1.m4199U(this.f8022e);
        cfgData cfgdata = this.f8020d;
        boolean m4197S = AbstractC1539g1.m4197S(cfgdata);
        if (!m4199U && !m4197S) {
            this.f8027j.m1802b();
            return;
        }
        if (this.f8027j.getWidth() <= 0 || this.f8027j.getHeight() <= 0) {
            this.f8027j.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0108a(1, this));
            return;
        }
        boolean z2 = m4197S && cfgdata.f2557P2 && !m4199U;
        int i3 = 1920;
        if (z2) {
            int i4 = AbstractC1569q1.f8666a;
            m4231n = new Rect(0, 0, 1920, 800);
        } else {
            C1563o1 c1563o12 = this.f8024g;
            if (c1563o12 != null) {
                C1551k1 c1551k1 = c1563o12.f8510q;
                int i5 = c1551k1.f8368c;
                if (i5 <= 0) {
                    i5 = 703;
                }
                int i6 = c1551k1.f8369d;
                if (i6 <= 0) {
                    i6 = 575;
                }
                int i7 = c1551k1.f8366a;
                int i8 = c1551k1.f8367b;
                m4231n = new Rect(i7, i8, i5 + i7, i6 + i8);
            } else {
                m4231n = AbstractC1539g1.m4231n(0);
            }
        }
        AbstractC1256E0.m3025r(cfgdata, cfgdata.f2548N1, m4231n, 2);
        float f2 = this.f8014a.getResources().getDisplayMetrics().density;
        if (z2) {
            this.f8027j.m1805f(new RectF(0.0f, 0.0f, this.f8027j.getWidth(), this.f8027j.getHeight()), 0.0f, 0.0f);
            return;
        }
        C1563o1 c1563o13 = this.f8024g;
        if (c1563o13 != null && (i2 = c1563o13.f8495b) > 0) {
            i3 = i2;
        }
        if (c1563o13 == null || (i = c1563o13.f8496c) <= 0) {
            i = 720;
        }
        float width = this.f8027j.getWidth() / i3;
        float height = this.f8027j.getHeight() / i;
        this.f8027j.m1805f(new RectF(m4231n.left * width, m4231n.top * height, m4231n.right * width, m4231n.bottom * height), f2 * 14.0f, 0.0f);
    }

    /* renamed from: h */
    public final void m4113h(TextView textView, C1560n1 c1560n1, String str) {
        try {
            textView.setTextColor(Color.parseColor(str));
        } catch (Exception unused) {
            textView.setTextColor(-1);
        }
        int i = 0;
        textView.setTextSize(0, c1560n1.f8469i);
        boolean z2 = c1560n1.f8471j;
        if (z2 && c1560n1.f8473k) {
            i = 3;
        } else if (z2) {
            i = 1;
        } else if (c1560n1.f8473k) {
            i = 2;
        }
        textView.setTypeface(AbstractC1539g1.m4216f0(this.f8014a, i, c1560n1.f8467h));
        C1527c1.m4165h(textView, c1560n1.f8475l, c1560n1.f8477m);
    }

    /* renamed from: i */
    public final void m4114i() {
        if (this.f8026i == null) {
            return;
        }
        this.f8011X = false;
        m4118m();
        float rightQnxHoleOpenProgress = this.f8026i.getRightQnxHoleOpenProgress();
        this.f8010W = false;
        AbstractC1372y1.m3287R(false, true);
        if (Math.abs(rightQnxHoleOpenProgress) < 0.001f) {
            m4103N(0.0f);
        } else {
            m4101L(rightQnxHoleOpenProgress, 0.0f);
        }
    }

    /* renamed from: j */
    public final void m4115j() {
        final int i = 20;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        };
        carData cardata = this.f8022e;
        InterfaceC0553r interfaceC0553r = this.f8018c;
        cardata.m1754i0(interfaceC0553r, interfaceC0561z);
        final int i2 = 6;
        cardata.m1750g0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i2) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i3 = 17;
        cardata.m1721J(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i3) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i4 = 28;
        cardata.m1728Q(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i4) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i5 = 9;
        carData.m1712X(cardata.f2439d0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i5) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i6 = 15;
        cardata.m1722K(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i6) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i7 = 16;
        cardata.m1742c0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i7) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i8 = 17;
        cardata.m1744d0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i8) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i9 = 18;
        cardata.m1746e0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i9) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i10 = 19;
        cardata.m1748f0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i10) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i11 = 21;
        carData.m1712X(cardata.f2453i0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i11) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i12 = 22;
        carData.m1712X(cardata.f2457k0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i12) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i13 = 23;
        cardata.m1731T(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i13) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i14 = 24;
        cardata.m1720I(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i14) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i15 = 0;
        cardata.m1719H(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i15) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i16 = 1;
        carData.m1712X(cardata.f2469q0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i16) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i17 = 2;
        cardata.m1738a0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i17) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i18 = 3;
        cardata.m1736Z(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i18) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i19 = 4;
        cardata.m1735Y(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i19) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i20 = 5;
        carData.m1712X(cardata.f2473s0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i20) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i21 = 7;
        carData.m1712X(cardata.f2475t0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i21) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i22 = 8;
        carData.m1712X(cardata.f2477u0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i22) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i23 = 9;
        carData.m1712X(cardata.f2479v0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i23) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i24 = 10;
        carData.m1712X(cardata.f2481w0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i24) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i25 = 11;
        cardata.m1740b0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i25) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i26 = 12;
        carData.m1712X(cardata.f2413S, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i26) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i27 = 13;
        carData.m1712X(cardata.f2419V, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i27) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i28 = 14;
        carData.m1712X(cardata.f2465o0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i28) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i29 = 15;
        carData.m1712X(cardata.f2463n0, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i29) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i30 = 16;
        cardata.m1727P(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i30) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i31 = 18;
        cardata.m1725N(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i31) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i32 = 19;
        cardata.m1724M(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i32) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i33 = 20;
        cardata.m1764n0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i33) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i34 = 21;
        cardata.m1766o0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i34) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i35 = 22;
        cardata.m1768p0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i35) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i36 = 23;
        cardata.m1770q0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i36) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i37 = 24;
        carData.m1712X(cardata.f2391H, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i37) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i38 = 25;
        carData.m1712X(cardata.f2395J, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i38) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i39 = 26;
        carData.m1712X(cardata.f2399L, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i39) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i40 = 27;
        carData.m1712X(cardata.f2403N, interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i40) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i41 = 29;
        cardata.f2405O.m1396e(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.V0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7969b;

            {
                this.f7969b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                switch (i41) {
                    case 0:
                        this.f7969b.m4092C("avg_fuel_day");
                        break;
                    case 1:
                        C1518Z0 c1518z0 = this.f7969b;
                        c1518z0.m4092C("fuel_used");
                        c1518z0.m4092C("fuel_since_refuel");
                        break;
                    case 2:
                        this.f7969b.m4092C("odo");
                        break;
                    case 3:
                        this.f7969b.m4092C("day");
                        break;
                    case 4:
                        this.f7969b.m4092C("trip");
                        break;
                    case 5:
                        this.f7969b.m4092C("avg_speed_day");
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7969b;
                        float m1779y = c1518z02.f8022e.m1779y() / 1000.0f;
                        C1260G0 c1260g0 = c1518z02.f8002O;
                        if (c1260g0 != null) {
                            c1260g0.m3034a(m1779y);
                        }
                        c1518z02.m4122x("rpm", m1779y);
                        break;
                    case 7:
                        this.f7969b.m4092C("avg_speed_trip");
                        break;
                    case 8:
                        this.f7969b.m4092C("drive_time_day");
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7969b.m4092C("drive_time_trip");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7969b.m4092C("moto_hours");
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7969b.m4092C("out_temp");
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f7969b.m4092C("in_temp");
                        break;
                    case 13:
                        this.f7969b.m4092C("at_temp");
                        break;
                    case 14:
                        this.f7969b.m4092C("oil_temp");
                        break;
                    case 15:
                        this.f7969b.m4092C("oil_press");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z03 = this.f7969b;
                        c1518z03.m4092C("gear");
                        c1518z03.m4092C("gear_num");
                        break;
                    case 17:
                        this.f7969b.m4092C("battery");
                        break;
                    case 18:
                        Integer num = (Integer) obj;
                        C1518Z0 c1518z04 = this.f7969b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1518z04.getClass();
                            intValue = num.intValue();
                        }
                        if (c1518z04.f8009V > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            C1537g c1537g = c1518z04.f8014a;
                            C1311e0.m3165d(c1537g).m3171e();
                            AbstractC1294Y.m3153e(c1537g);
                            cfgData cfgdata = c1518z04.f8020d;
                            if (cfgdata.f2537K2) {
                                c1518z04.f8008U = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                            c1518z04.m4095F();
                        }
                        if (c1518z04.f8009V == -1 && intValue > -1) {
                            c1518z04.f8008U = 0.0f;
                            c1518z04.m4097H();
                            FrameLayout frameLayout = c1518z04.f8025h;
                            if (frameLayout != null) {
                                frameLayout.animate().cancel();
                                c1518z04.f8025h.setAlpha(1.0f);
                            }
                            c1518z04.m4102M("ip");
                        }
                        c1518z04.f8009V = intValue;
                        c1518z04.m4092C("gear");
                        c1518z04.m4092C("gear_num");
                        break;
                    case 19:
                        this.f7969b.m4092C("cruise_speed");
                        break;
                    case 20:
                        this.f7969b.m4092C("wheel_fl");
                        break;
                    case 21:
                        this.f7969b.m4092C("wheel_fr");
                        break;
                    case 22:
                        this.f7969b.m4092C("wheel_rl");
                        break;
                    case 23:
                        this.f7969b.m4092C("wheel_rr");
                        break;
                    case 24:
                        this.f7969b.m4092C("wheel_fl_t");
                        break;
                    case 25:
                        this.f7969b.m4092C("wheel_fr_t");
                        break;
                    case 26:
                        this.f7969b.m4092C("wheel_rl_t");
                        break;
                    case 27:
                        this.f7969b.m4092C("wheel_rr_t");
                        break;
                    case 28:
                        this.f7969b.m4092C("hv_v");
                        break;
                    default:
                        this.f7969b.m4092C("alt");
                        break;
                }
            }
        });
        final int i42 = 0;
        cardata.f2407P.m1396e(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i42) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i43 = 1;
        cardata.f2409Q.m1396e(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i43) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i44 = 2;
        cardata.f2440d1.m1396e(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i44) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i45 = 3;
        cardata.f2443e1.m1396e(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i45) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i46 = 4;
        cardata.f2446f1.m1396e(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i46) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(interfaceC0553r, this.f8014a);
        final int i47 = 5;
        cardata.m1734W(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i47) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i48 = 6;
        cardata.m1733V(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i48) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i49 = 7;
        cardata.m1729R(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i49) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i50 = 8;
        cardata.m1772r0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i50) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i51 = 10;
        cardata.m1730S(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i51) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i52 = 11;
        cardata.m1758k0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i52) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i53 = 12;
        cardata.m1723L(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i53) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i54 = 13;
        cardata.m1752h0(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i54) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        final int i55 = 14;
        C0639g.m1872x().m1883z(interfaceC0553r, new InterfaceC0561z(this) { // from class: u0.W0

            /* renamed from: b */
            public final /* synthetic */ C1518Z0 f7973b;

            {
                this.f7973b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                HolePunchLayout holePunchLayout;
                switch (i55) {
                    case 0:
                        this.f7973b.m4092C("baro");
                        break;
                    case 1:
                        this.f7973b.m4092C("steer");
                        break;
                    case 2:
                        this.f7973b.m4092C("pitch");
                        break;
                    case 3:
                        this.f7973b.m4092C("roll");
                        break;
                    case 4:
                        this.f7973b.m4092C("heading");
                        break;
                    case 5:
                        C1518Z0 c1518z0 = this.f7973b;
                        Integer num = (Integer) obj;
                        c1518z0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (num.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1518z0.f8014a, num.intValue())) {
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 4) {
                                            if (num.intValue() != 6) {
                                                if (num.intValue() != 3 || !c1518z0.f8020d.f2561Q2) {
                                                    if (num.intValue() != 13 && num.intValue() != 14) {
                                                        if ((num.intValue() != 7 && num.intValue() != 8) || !c1518z0.f8011X || !c1518z0.f8010W) {
                                                            if (num.intValue() != 9) {
                                                                if (num.intValue() == 12) {
                                                                    cfgData cfgdata = c1518z0.f8020d;
                                                                    if (cfgdata.f2537K2 && !cfgdata.f2549N2 && !AbstractC1372y1.m3299e("ip_navi_full")) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata2 = c1518z0.f8020d;
                                                                        cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                        cfgdata2.m1795o(c1518z0.f8014a);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1518z0.m4102M("ip");
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (AbstractC1539g1.m4209c(c1518z0.f8022e)) {
                                                                cfgData cfgdata3 = c1518z0.f8020d;
                                                                boolean z2 = !cfgdata3.f2549N2;
                                                                cfgdata3.f2549N2 = z2;
                                                                c1518z0.f8022e.m1760l0(z2);
                                                                c1518z0.f8020d.m1795o(c1518z0.f8014a);
                                                                C1537g c1537g = c1518z0.f8014a;
                                                                AbstractC1372y1.m3289T(c1537g, c1537g.getString(c1518z0.f8020d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                if (c1518z0.f8020d.f2549N2) {
                                                                    AbstractC1372y1.m3304j(c1518z0.f8014a);
                                                                }
                                                                AbstractC1372y1.m3300f();
                                                                c1518z0.m4102M("ip");
                                                                break;
                                                            }
                                                        } else {
                                                            Handler handler = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r = c1518z0.f8015a0;
                                                            handler.removeCallbacks(runnableC0024r);
                                                            handler.postDelayed(runnableC0024r, 15000L);
                                                            break;
                                                        }
                                                    } else if (!AbstractC1372y1.f6438h && c1518z0.m4117l()) {
                                                        if (!c1518z0.f8010W) {
                                                            C1563o1 c1563o1 = c1518z0.f8024g;
                                                            if (c1563o1 == null || !c1563o1.f8497d) {
                                                                c1518z0.f8011X = true;
                                                                if ((c1563o1 == null || !c1563o1.f8497d) && c1518z0.m4117l()) {
                                                                    float rightQnxHoleOpenProgress = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                                    if (!c1518z0.f8010W || rightQnxHoleOpenProgress < 0.999f) {
                                                                        c1518z0.m4118m();
                                                                        c1518z0.f8010W = true;
                                                                        AbstractC1372y1.m3287R(true, true);
                                                                        if (Math.abs(1.0f - rightQnxHoleOpenProgress) < 0.001f) {
                                                                            c1518z0.m4103N(1.0f);
                                                                        } else {
                                                                            c1518z0.m4101L(rightQnxHoleOpenProgress, 1.0f);
                                                                        }
                                                                    }
                                                                    Handler handler2 = c1518z0.f8023f;
                                                                    RunnableC0024r runnableC0024r2 = c1518z0.f8015a0;
                                                                    handler2.removeCallbacks(runnableC0024r2);
                                                                    handler2.postDelayed(runnableC0024r2, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        } else if (c1518z0.f8011X) {
                                                            Handler handler3 = c1518z0.f8023f;
                                                            RunnableC0024r runnableC0024r3 = c1518z0.f8015a0;
                                                            handler3.removeCallbacks(runnableC0024r3);
                                                            handler3.postDelayed(runnableC0024r3, 15000L);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    boolean z3 = !c1518z0.f8007T;
                                                    c1518z0.f8007T = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1518z0.m4110e();
                                                    if (!c1518z0.f8007T) {
                                                        c1518z0.m4095F();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1518z0.f8020d.f2672o3) {
                                                    C1537g c1537g2 = c1518z0.f8014a;
                                                    AbstractC1372y1.m3289T(c1537g2, c1537g2.getString(R.string.msgSplitRecovery));
                                                    c1518z0.m4102M("ip_rest");
                                                    break;
                                                } else {
                                                    c1518z0.m4102M("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        } else if (c1518z0.f8022e.m1714B()) {
                                            if (!AbstractC1372y1.f6437g) {
                                                int[] m3282M = AbstractC1372y1.m3282M(c1518z0.f8020d.f2620e1);
                                                AbstractC1372y1.m3290U(c1518z0.f8014a, m3282M[0], m3282M[1], 0.9f, c1518z0.f8020d.f2657l3);
                                                break;
                                            } else {
                                                AbstractC1372y1.m3305k(c1518z0.f8014a);
                                                break;
                                            }
                                        }
                                    } else if (!AbstractC1372y1.m3302h()) {
                                        ValueAnimator valueAnimator = c1518z0.f8013Z;
                                        if ((valueAnimator == null || !valueAnimator.isRunning()) && c1518z0.m4117l()) {
                                            C1563o1 c1563o12 = c1518z0.f8024g;
                                            if (c1563o12 != null && c1563o12.f8497d) {
                                                if (c1518z0.f8010W || ((holePunchLayout = c1518z0.f8026i) != null && holePunchLayout.m1807m())) {
                                                    c1518z0.m4114i();
                                                    break;
                                                }
                                            } else {
                                                c1518z0.f8011X = false;
                                                if (c1518z0.m4104O() && c1518z0.f8026i != null) {
                                                    c1518z0.f8023f.removeCallbacks(c1518z0.f8015a0);
                                                    c1518z0.m4118m();
                                                    float rightQnxHoleOpenProgress2 = c1518z0.f8026i.getRightQnxHoleOpenProgress();
                                                    boolean z4 = rightQnxHoleOpenProgress2 < 0.5f;
                                                    c1518z0.f8010W = z4;
                                                    AbstractC1372y1.m3287R(z4, true);
                                                    float f2 = z4 ? 1.0f : 0.0f;
                                                    if (Math.abs(rightQnxHoleOpenProgress2 - f2) >= 0.001f) {
                                                        c1518z0.m4101L(rightQnxHoleOpenProgress2, f2);
                                                        break;
                                                    } else {
                                                        c1518z0.m4103N(f2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1518z0.f8014a);
                                break;
                            }
                        }
                        break;
                    case 6:
                        C1518Z0 c1518z02 = this.f7973b;
                        c1518z02.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1518z02.m4095F();
                        }
                        c1518z02.m4112g();
                        AbstractC1539g1.m4228l0(c1518z02.f8026i, !c1518z02.f8007T);
                        break;
                    case 7:
                        this.f7973b.m4112g();
                        break;
                    case 8:
                        this.f7973b.m4090A();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f7973b.m4092C("hv_a");
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f7973b.m4090A();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1518Z0 c1518z03 = this.f7973b;
                        c1518z03.m4092C("cruise_speed");
                        c1518z03.m4090A();
                        break;
                    case 13:
                        C1518Z0 c1518z04 = this.f7973b;
                        cfgData cfgdata4 = c1518z04.f8020d;
                        c1518z04.f8007T = cfgdata4.f2537K2 && cfgdata4.f2561Q2;
                        c1518z04.m4110e();
                        if (!c1518z04.f8007T) {
                            c1518z04.m4095F();
                            break;
                        }
                        break;
                    case 14:
                        this.f7973b.m4091B((C0636d) obj);
                        break;
                    case 15:
                        this.f7973b.m4092C("coolant");
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1518Z0 c1518z05 = this.f7973b;
                        c1518z05.m4092C("fuel");
                        c1518z05.m4092C("fuel_l");
                        break;
                    case 17:
                        C1518Z0 c1518z06 = this.f7973b;
                        c1518z06.m4092C("fuel");
                        c1518z06.m4092C("fuel_l");
                        c1518z06.m4092C("fuel2");
                        break;
                    case 18:
                        C1518Z0 c1518z07 = this.f7973b;
                        c1518z07.m4092C("fuel");
                        c1518z07.m4092C("fuel_l");
                        c1518z07.m4092C("fuel2");
                        break;
                    case 19:
                        C1518Z0 c1518z08 = this.f7973b;
                        c1518z08.m4092C("fuel_range");
                        AbstractC1539g1.m4228l0(c1518z08.f8026i, !c1518z08.f8007T);
                        break;
                    case 20:
                        this.f7973b.m4093D();
                        break;
                    case 21:
                        AbstractC1539g1.m4228l0(this.f7973b.f8026i, !r9.f8007T);
                        break;
                    case 22:
                        C1518Z0 c1518z09 = this.f7973b;
                        c1518z09.m4092C("fuel_range2");
                        AbstractC1539g1.m4228l0(c1518z09.f8026i, !c1518z09.f8007T);
                        break;
                    case 23:
                        this.f7973b.m4092C("inst_fuel");
                        break;
                    default:
                        this.f7973b.m4092C("avg_fuel");
                        break;
                }
            }
        });
        m4091B(C0639g.m1872x().m1880u());
        m4090A();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x04ad, code lost:
    
        if (r6.f7149h != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x04ca, code lost:
    
        if (r6.f7147f != false) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [u0.Z0] */
    /* JADX WARN: Type inference failed for: r32v0, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v23, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4116k(FrameLayout frameLayout) {
        C1574t c1574t;
        int i;
        cfgData cfgdata;
        char c2;
        cfgData cfgdata2;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        boolean z4;
        char c3;
        C1560n1 c1560n1;
        String str;
        ?? r14;
        int parseColor;
        int parseColor2;
        int parseColor3;
        int i2;
        Bitmap m4458j;
        int i3;
        cfgData cfgdata3 = this.f8020d;
        EnumC1455a enumC1455a = cfgdata3.f2625f1;
        if (enumC1455a == null || enumC1455a == EnumC1455a.f6949f) {
            c1574t = new C1574t(0, null, 7);
        } else {
            int i4 = cfgdata3.f2630g1;
            if (i4 <= 30) {
                int i5 = enumC1455a.f7036d;
                c1574t = i5 != 0 ? new C1574t(i5, null, 7) : new C1574t(0, null, 7);
            } else {
                String[] strArr = cfgdata3.f2603b;
                if (strArr != null && i4 > 30 && i4 - 31 >= 0 && i3 < strArr.length) {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata3.f2603b[i3]);
                    if (file.exists()) {
                        c1574t = new C1574t(0, Uri.fromFile(file), 7);
                    }
                }
                c1574t = new C1574t(0, null, 7);
            }
        }
        int i6 = c1574t.f8687b;
        Uri uri = c1574t.f8688c;
        boolean z5 = (i6 == 0 && uri == null) ? false : true;
        C1537g c1537g = this.f8014a;
        if (z5 || this.f8024g.f8500g) {
            HolePunchImageView holePunchImageView = new HolePunchImageView(c1537g);
            this.f8027j = holePunchImageView;
            holePunchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            frameLayout.addView(this.f8027j, new FrameLayout.LayoutParams(-1, -1));
            if (i6 == 0 && uri == null) {
                int i7 = -16777216;
                if ("fill".equals(this.f8024g.f8502i)) {
                    HolePunchImageView holePunchImageView2 = this.f8027j;
                    try {
                        i7 = Color.parseColor(this.f8024g.f8503j);
                    } catch (Exception unused) {
                    }
                    holePunchImageView2.setSolidFill(i7);
                } else if ("gradient".equals(this.f8024g.f8502i)) {
                    HolePunchImageView holePunchImageView3 = this.f8027j;
                    try {
                        i = Color.parseColor(this.f8024g.f8503j);
                    } catch (Exception unused2) {
                        i = -16777216;
                    }
                    try {
                        i7 = Color.parseColor(this.f8024g.f8504k);
                    } catch (Exception unused3) {
                    }
                    boolean equals = "lr".equals(this.f8024g.f8505l);
                    holePunchImageView3.f2737m = 2;
                    holePunchImageView3.f2738n = i;
                    holePunchImageView3.f2739o = i7;
                    holePunchImageView3.f2740p = equals;
                    holePunchImageView3.setImageDrawable(null);
                    holePunchImageView3.invalidate();
                } else {
                    Bitmap m4458j2 = AbstractC1569q1.m4458j(this.f8024g.f8501h);
                    if (m4458j2 == null) {
                        throw new IllegalStateException(c1537g.getString(R.string.user_theme_bitmap_bg, this.f8024g.f8501h));
                    }
                    this.f8027j.setImageBitmap(m4458j2);
                }
            } else if (i6 != 0) {
                this.f8027j.setImageResource(i6);
            } else if (uri != null) {
                this.f8027j.setImageURI(uri);
            }
            m4112g();
        }
        this.f8028k = m4106a(frameLayout, this.f8024g.f8506m, true);
        this.f8032o = m4108c(frameLayout, this.f8024g.f8506m);
        this.f8030m = m4107b(frameLayout, this.f8024g.f8506m);
        this.f8029l = m4106a(frameLayout, this.f8024g.f8507n, false);
        this.f8033p = m4108c(frameLayout, this.f8024g.f8507n);
        this.f8031n = m4107b(frameLayout, this.f8024g.f8507n);
        C1563o1 c1563o1 = this.f8024g;
        C1551k1 c1551k1 = c1563o1 != null ? c1563o1.f8509p : null;
        if (c1551k1 == null) {
            cfgdata = cfgdata3;
        } else {
            int i8 = c1551k1.f8368c;
            if (i8 <= 0) {
                i8 = 477;
            }
            int i9 = c1551k1.f8369d;
            if (i9 <= 0) {
                i9 = 128;
            }
            ?? linearLayout = new LinearLayout(c1537g);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            float f4 = i8;
            float f5 = (f4 * 14.0f) / 477.0f;
            int round = Math.round(f5);
            float f6 = i9;
            int round2 = Math.round((10.0f * f6) / 128.0f);
            linearLayout.setPadding(round, round2, round + 2, round2);
            linearLayout.setBackgroundResource(R.drawable.ip_theme_41_media_frame);
            linearLayout.setVisibility(8);
            ImageView imageView = new ImageView(c1537g);
            this.f8039v = imageView;
            imageView.setId(R.id.overlay_media_art);
            int round3 = Math.round((72.0f * f6) / 128.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(round3, round3);
            layoutParams.setMarginEnd(Math.round(f5));
            this.f8039v.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f8039v.setVisibility(8);
            linearLayout.addView(this.f8039v, layoutParams);
            ?? linearLayout2 = new LinearLayout(c1537g);
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
            MarqueeTextView marqueeTextView = new MarqueeTextView(c1537g);
            this.f8040w = marqueeTextView;
            marqueeTextView.setTextColor(Color.parseColor("#FFF5F6FF"));
            this.f8040w.setTextSize(0, Math.round((22.0f * f6) / 128.0f));
            this.f8040w.setTypeface(Typeface.DEFAULT_BOLD);
            this.f8040w.setMaxLines(1);
            linearLayout2.addView(this.f8040w, new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(c1537g);
            this.f8041x = textView;
            textView.setTextColor(Color.parseColor("#FF9AA8B6"));
            this.f8041x.setTextSize(0, Math.round((16.0f * f6) / 128.0f));
            this.f8041x.setMaxLines(1);
            cfgdata = cfgdata3;
            linearLayout2.addView(this.f8041x, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout3 = new LinearLayout(c1537g);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(16);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = Math.round((f6 * 8.0f) / 128.0f);
            linearLayout2.addView(linearLayout3, layoutParams2);
            TextView textView2 = new TextView(c1537g);
            this.f8043z = textView2;
            textView2.setTextColor(Color.parseColor("#FFF5F6FF"));
            float f7 = (14.0f * f6) / 128.0f;
            this.f8043z.setTextSize(0, Math.round(f7));
            float f8 = (46.0f * f4) / 477.0f;
            this.f8043z.setMinWidth(Math.round(f8));
            this.f8043z.setText("0:00");
            linearLayout3.addView(this.f8043z);
            ProgressBar progressBar = new ProgressBar(c1537g, null, android.R.attr.progressBarStyleHorizontal);
            this.f8042y = progressBar;
            progressBar.setMax(1000);
            this.f8042y.setProgress(0);
            this.f8042y.setProgressDrawable(c1537g.getDrawable(R.drawable.ip_theme_41_progress_media));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, Math.round((f6 * 6.0f) / 128.0f), 1.0f);
            float f9 = (f4 * 8.0f) / 477.0f;
            layoutParams3.setMarginStart(Math.round(f9));
            layoutParams3.setMarginEnd(Math.round(f9));
            linearLayout3.addView(this.f8042y, layoutParams3);
            TextView textView3 = new TextView(c1537g);
            this.f7988A = textView3;
            textView3.setTextColor(Color.parseColor("#FF9AA8B6"));
            this.f7988A.setTextSize(0, Math.round(f7));
            this.f7988A.setMinWidth(Math.round(f8));
            this.f7988A.setGravity(8388613);
            this.f7988A.setText("0:00");
            linearLayout3.addView(this.f7988A);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i8, i9);
            layoutParams4.leftMargin = c1551k1.f8366a;
            layoutParams4.topMargin = c1551k1.f8367b;
            frameLayout.addView(linearLayout, layoutParams4);
            this.f8038u = linearLayout;
            AbstractC0641i.m1886c(linearLayout);
        }
        Iterator it = this.f8024g.f8511r.iterator();
        while (it.hasNext()) {
            C1560n1 c1560n12 = (C1560n1) it.next();
            String str2 = c1560n12.f8453a;
            if (str2 == null || !str2.endsWith("_unit")) {
                if (c1560n12.f8455b) {
                    String str3 = c1560n12.f8453a;
                    if (str3 != null) {
                        switch (str3.hashCode()) {
                            case -1271819970:
                                if (str3.equals("fuel_range2")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -288443299:
                                if (str3.equals("cruise_speed")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 99228:
                                if (str3.equals("day")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 109882:
                                if (str3.equals("odo")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3214704:
                                if (str3.equals("hv_a")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3214725:
                                if (str3.equals("hv_v")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3568677:
                                if (str3.equals("trip")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 74876074:
                                if (str3.equals("avg_speed_trip")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 97785148:
                                if (str3.equals("fuel2")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 418041463:
                                if (str3.equals("avg_speed_day")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 617908799:
                                if (str3.equals("drive_time_day")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1649597855:
                                if (str3.equals("wheel_fl_t")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1649603621:
                                if (str3.equals("wheel_fr_t")) {
                                    c2 = '\f';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1649955347:
                                if (str3.equals("wheel_rl_t")) {
                                    c2 = '\r';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1649961113:
                                if (str3.equals("wheel_rr_t")) {
                                    c2 = 14;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1975796194:
                                if (str3.equals("drive_time_trip")) {
                                    c2 = 15;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2035233834:
                                if (str3.equals("wheel_fl")) {
                                    c2 = 16;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2035233840:
                                if (str3.equals("wheel_fr")) {
                                    c2 = 17;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2035234206:
                                if (str3.equals("wheel_rl")) {
                                    c2 = 18;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2035234212:
                                if (str3.equals("wheel_rr")) {
                                    c2 = 19;
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
                            case '\b':
                                cfgdata2 = cfgdata;
                                EnumC1457c enumC1457c = cfgdata2.f2543M0;
                                if (enumC1457c != null) {
                                    break;
                                }
                                z2 = false;
                                break;
                            case 1:
                                cfgdata2 = cfgdata;
                                z2 = cfgdata2.f2589X2;
                                break;
                            case 2:
                            case Platform.GNU /* 9 */:
                            case Platform.KFREEBSD /* 10 */:
                                cfgdata2 = cfgdata;
                                z2 = cfgdata2.f2577U2;
                                break;
                            case 3:
                                cfgdata2 = cfgdata;
                                z2 = cfgdata2.f2569S2;
                                break;
                            case 4:
                            case 5:
                                cfgdata2 = cfgdata;
                                EnumC1457c enumC1457c2 = cfgdata2.f2543M0;
                                if (enumC1457c2 != null) {
                                    break;
                                }
                                z2 = false;
                                break;
                            case 6:
                            case 7:
                            case 15:
                                cfgdata2 = cfgdata;
                                z2 = cfgdata2.f2573T2;
                                break;
                            case Platform.NETBSD /* 11 */:
                            case Platform.DRAGONFLYBSD /* 12 */:
                            case '\r':
                            case 14:
                            case DLLCallback.DLL_FPTRS /* 16 */:
                            case 17:
                            case 18:
                            case 19:
                                cfgdata2 = cfgdata;
                                z2 = cfgdata2.f2581V2;
                                break;
                        }
                        if (z2) {
                            cfgdata = cfgdata2;
                        } else {
                            boolean equals2 = "fuel".equals(str3);
                            HashMap hashMap = this.f7995H;
                            if ((equals2 || "coolant".equals(c1560n12.f8453a)) && (z3 = c1560n12.f8474k0)) {
                                if (z3) {
                                    boolean equals3 = "fuel".equals(c1560n12.f8453a);
                                    boolean equals4 = "coolant".equals(c1560n12.f8453a);
                                    if (equals3 || equals4) {
                                        C1563o1 c1563o12 = this.f8024g;
                                        C1554l1 c1554l1 = equals3 ? c1563o12.f8506m : c1563o12.f8507n;
                                        if (c1554l1.f8375a) {
                                            Bitmap m4458j3 = !AbstractC1569q1.m4451c() ? AbstractC1569q1.m4458j(AbstractC1569q1.m4460l(AbstractC1569q1.m4466r(cfgdata2.f2620e1))) : null;
                                            if (m4458j3 != null) {
                                                m4458j3.setDensity(0);
                                                int m4289a = c1554l1.m4289a();
                                                ImageView imageView2 = new ImageView(c1537g);
                                                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                                                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(m4289a, m4289a);
                                                layoutParams5.leftMargin = c1554l1.m4290b();
                                                layoutParams5.topMargin = c1554l1.m4291c();
                                                frameLayout.addView(imageView2, layoutParams5);
                                                imageView2.setImageBitmap(m4458j3);
                                                float f10 = m4289a * 0.5f;
                                                imageView2.setPivotX(f10);
                                                imageView2.setPivotY(f10);
                                                this.f8000M.add(imageView2);
                                                ImageView imageView3 = equals3 ? this.f8028k : this.f8029l;
                                                if (imageView3 != null) {
                                                    imageView3.post(new RunnableC1559n0(imageView2, 17, imageView3));
                                                }
                                                float f11 = (float) c1560n12.f8438L;
                                                float f12 = (float) c1560n12.f8439M;
                                                if (f12 > f11 && (!equals4 || Math.abs(f11) >= 0.01f || Math.abs(f12 - 100.0f) >= 0.01f)) {
                                                    f2 = f11;
                                                } else if (equals3) {
                                                    f3 = 100.0f;
                                                    f2 = 0.0f;
                                                    C1260G0 c1260g0 = new C1260G0(f2, f3, 300L, !equals3 ? m4119p() : this.f8022e.m1743d(), c1560n12.f8476l0, c1560n12.f8478m0, 0.01f);
                                                    if (equals3) {
                                                        this.f8035r = imageView2;
                                                        this.f8004Q = c1260g0;
                                                    } else {
                                                        this.f8034q = imageView2;
                                                        this.f8003P = c1260g0;
                                                    }
                                                } else {
                                                    f12 = 130.0f;
                                                    f2 = 40.0f;
                                                }
                                                f3 = f12;
                                                C1260G0 c1260g02 = new C1260G0(f2, f3, 300L, !equals3 ? m4119p() : this.f8022e.m1743d(), c1560n12.f8476l0, c1560n12.f8478m0, 0.01f);
                                                if (equals3) {
                                                }
                                            }
                                        }
                                    }
                                }
                                hashMap.put(c1560n12.f8453a, c1560n12);
                            }
                            if (c1560n12.f8457c) {
                                String str4 = c1560n12.f8453a;
                                if (str4 != null && str4.startsWith("image_")) {
                                    String str5 = c1560n12.f8470i0;
                                    if (str5 != null && !str5.isEmpty() && (m4458j = AbstractC1569q1.m4458j(str5)) != null) {
                                        float f13 = c1560n12.f8472j0;
                                        if (f13 <= 0.01f) {
                                            f13 = 1.0f;
                                        }
                                        int m152f = AbstractC0062j.m152f(m4458j.getWidth(), f13, 1);
                                        int m152f2 = AbstractC0062j.m152f(m4458j.getHeight(), f13, 1);
                                        ImageView imageView4 = new ImageView(c1537g);
                                        imageView4.setScaleType(ImageView.ScaleType.FIT_XY);
                                        imageView4.setImageBitmap(m4458j);
                                        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(m152f, m152f2);
                                        layoutParams6.leftMargin = c1560n12.f8459d;
                                        layoutParams6.topMargin = c1560n12.f8461e;
                                        frameLayout.addView(imageView4, layoutParams6);
                                    }
                                    hashMap.put(c1560n12.f8453a, c1560n12);
                                } else {
                                    String str6 = c1560n12.f8453a;
                                    if ("wifi".equals(str6) || "inet".equals(str6) || "cruise_ico".equals(str6) || "la".equals(str6)) {
                                        String str7 = c1560n12.f8453a;
                                        int i10 = "wifi".equals(str7) ? R.drawable.icon_wifi : "inet".equals(str7) ? R.drawable.icon_inet : "cruise_ico".equals(str7) ? R.drawable.icon_cruise : "la".equals(str7) ? R.drawable.icon_lane : 0;
                                        if (i10 != 0) {
                                            int i11 = c1560n12.f8488w;
                                            if (i11 <= 0) {
                                                String str8 = c1560n12.f8453a;
                                                if ("wifi".equals(str8)) {
                                                    i2 = 32;
                                                } else if ("inet".equals(str8)) {
                                                    i11 = 30;
                                                } else {
                                                    i2 = "cruise_ico".equals(str8) ? 70 : "la".equals(str8) ? 60 : 40;
                                                }
                                                i11 = i2;
                                            }
                                            ImageView imageView5 = new ImageView(c1537g);
                                            imageView5.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                            imageView5.setColorFilter(-1);
                                            try {
                                                imageView5.setImageResource(i10);
                                            } catch (Exception unused4) {
                                                imageView5.setBackgroundColor(-1);
                                            }
                                            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(i11, i11);
                                            layoutParams7.leftMargin = c1560n12.f8459d;
                                            layoutParams7.topMargin = c1560n12.f8461e;
                                            frameLayout.addView(imageView5, layoutParams7);
                                            this.f7999L.put(c1560n12.f8453a, imageView5);
                                        }
                                        hashMap.put(c1560n12.f8453a, c1560n12);
                                    } else {
                                        hashMap.put(c1560n12.f8453a, c1560n12);
                                        if (c1560n12.m4296c()) {
                                            int max = Math.max(1, c1560n12.f8440N);
                                            int max2 = Math.max(1, c1560n12.f8441O);
                                            C1548j1 c1548j1 = new C1548j1(c1537g);
                                            try {
                                                parseColor = Color.parseColor(c1560n12.f8443Q);
                                            } catch (Exception unused5) {
                                                parseColor = Color.parseColor("#664FC3F7");
                                            }
                                            try {
                                                parseColor2 = Color.parseColor(c1560n12.f8442P);
                                            } catch (Exception unused6) {
                                                parseColor2 = Color.parseColor("#FF4FC3F7");
                                            }
                                            try {
                                                parseColor3 = Color.parseColor(c1560n12.f8444R);
                                            } catch (Exception unused7) {
                                                parseColor3 = Color.parseColor("#FFFFFFFF");
                                            }
                                            c1548j1.m4286a("bar_v".equals(c1560n12.f8437K), c1560n12.f8449W, c1560n12.f8450X, parseColor, parseColor2, parseColor3, c1560n12.f8445S, c1560n12.f8446T);
                                            if ("bar_arc".equals(c1560n12.f8437K)) {
                                                c1548j1.m4288d(c1560n12.f8451Y, c1560n12.f8452Z, c1560n12.f8454a0, c1560n12.f8456b0);
                                            }
                                            c1548j1.setInvert(c1560n12.f8458c0);
                                            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(max, max2);
                                            layoutParams8.leftMargin = c1560n12.f8459d;
                                            layoutParams8.topMargin = c1560n12.f8461e;
                                            frameLayout.addView(c1548j1, layoutParams8);
                                            this.f7997J.put(c1560n12.f8453a, c1548j1);
                                            m4105P(c1560n12.f8453a, 0.0f);
                                        }
                                        if (!c1560n12.m4296c() || c1560n12.f8460d0) {
                                            if (c1560n12.m4296c()) {
                                                c1560n1 = new C1560n1();
                                                c1560n1.f8453a = c1560n12.f8453a;
                                                z4 = true;
                                                c3 = 2;
                                                c1560n1.f8459d = (Math.max(1, c1560n12.f8440N) / 2) + c1560n12.f8459d + c1560n12.f8462e0;
                                                c1560n1.f8461e = (Math.max(1, c1560n12.f8441O) / 2) + c1560n12.f8461e + c1560n12.f8464f0;
                                                String str9 = c1560n12.f8436J;
                                                if (str9 == null) {
                                                    str9 = "";
                                                }
                                                c1560n1.f8436J = str9;
                                                c1560n1.f8463f = C1563o1.m4304e(c1560n12) ? C1563o1.m4303d("center", c1560n12.f8436J) : "center";
                                                c1560n1.f8465g = c1560n12.f8465g;
                                                c1560n1.f8467h = c1560n12.f8467h;
                                                c1560n1.f8469i = c1560n12.f8469i;
                                                c1560n1.f8471j = c1560n12.f8471j;
                                                c1560n1.f8473k = c1560n12.f8473k;
                                                c1560n1.f8475l = c1560n12.f8475l;
                                                c1560n1.f8477m = c1560n12.f8477m;
                                                c1560n1.f8479n = c1560n12.f8479n;
                                                c1560n1.f8484s = c1560n12.f8484s;
                                                c1560n1.f8485t = c1560n12.f8485t;
                                                c1560n1.f8480o = c1560n12.f8480o;
                                                c1560n1.f8481p = c1560n12.f8481p;
                                                c1560n1.f8482q = c1560n12.f8482q;
                                                c1560n1.f8483r = c1560n12.f8483r;
                                                c1560n1.f8489x = c1560n12.f8489x;
                                                c1560n1.f8490y = c1560n12.f8490y;
                                                c1560n1.f8491z = c1560n12.f8491z;
                                                c1560n1.f8427A = c1560n12.f8427A;
                                                c1560n1.f8428B = c1560n12.f8428B;
                                                c1560n1.f8429C = c1560n12.f8429C;
                                                c1560n1.f8430D = c1560n12.f8430D;
                                                c1560n1.f8431E = c1560n12.f8431E;
                                                c1560n1.f8432F = c1560n12.f8432F;
                                                c1560n1.f8433G = c1560n12.f8433G;
                                                c1560n1.f8434H = c1560n12.f8434H;
                                                c1560n1.f8435I = c1560n12.f8435I;
                                                c1560n1.f8486u = c1560n12.f8486u;
                                                c1560n1.f8447U = c1560n12.f8447U;
                                                c1560n1.f8448V = c1560n12.f8448V;
                                            } else {
                                                z4 = true;
                                                c3 = 2;
                                                c1560n1 = c1560n12;
                                            }
                                            C1527c1 c1527c1 = new C1527c1(c1537g);
                                            c1527c1.setIncludeFontPadding(false);
                                            String str10 = c1560n1.f8453a;
                                            if (str10 == null || !str10.startsWith("label_")) {
                                                String str11 = c1560n1.f8486u;
                                                c1527c1.setText(str11 != null ? str11 : "");
                                            } else {
                                                String str12 = c1560n1.f8487v;
                                                String str13 = (str12 == null || str12.isEmpty()) ? c1560n1.f8486u : c1560n1.f8487v;
                                                c1527c1.setText(str13 != null ? str13 : "");
                                            }
                                            m4113h(c1527c1, c1560n1, c1560n1.f8479n);
                                            frameLayout.addView(c1527c1, new FrameLayout.LayoutParams(-2, -2));
                                            AbstractC1539g1.m4201W(c1527c1, c1560n1.f8459d, c1560n1.f8461e, c1560n1.f8463f);
                                            this.f7993F.put(c1560n12.f8453a, c1527c1);
                                            this.f7996I.put(c1560n12.f8453a, c1560n1);
                                            if ("speed".equals(c1560n12.f8453a)) {
                                                this.f8036s = c1527c1;
                                            } else if ("rpm".equals(c1560n12.f8453a)) {
                                                this.f8037t = c1527c1;
                                            }
                                            if (c1560n12.f8427A) {
                                                String str14 = c1560n12.f8489x;
                                                if (((str14 == null || str14.isEmpty()) && (!"inst_fuel".equals(c1560n12.f8453a) || !c1560n12.f8491z || (str = c1560n12.f8490y) == null || str.isEmpty())) ? false : z4) {
                                                    C1527c1 c1527c12 = new C1527c1(c1537g);
                                                    c1527c12.setIncludeFontPadding(false);
                                                    String m4294a = c1560n1.m4294a(m4120q() > 0.0f ? z4 : false);
                                                    c1527c12.setText(m4294a);
                                                    if (m4294a.isEmpty()) {
                                                        c1527c12.setVisibility(4);
                                                    }
                                                    try {
                                                        String str15 = c1560n1.f8428B;
                                                        if (str15 == null) {
                                                            str15 = "#747679";
                                                        }
                                                        c1527c12.setTextColor(Color.parseColor(str15));
                                                    } catch (Exception unused8) {
                                                        c1527c12.setTextColor(-7829368);
                                                    }
                                                    c1527c12.setTextSize(0, c1560n1.f8429C ? c1560n1.f8431E : c1560n1.f8469i);
                                                    boolean z6 = c1560n1.f8429C;
                                                    if (z6 ? c1560n1.f8432F : c1560n1.f8471j) {
                                                        if (z6 ? c1560n1.f8433G : c1560n1.f8473k) {
                                                            r14 = 3;
                                                            c1527c12.setTypeface(AbstractC1539g1.m4216f0(c1537g, r14, c1560n1.m4295b()));
                                                            C1527c1.m4165h(c1527c12, c1560n1.f8475l, c1560n1.f8477m);
                                                            frameLayout.addView(c1527c12, new FrameLayout.LayoutParams(-2, -2));
                                                            AbstractC1539g1.m4200V(c1527c12, c1527c1, c1560n1);
                                                            this.f7994G.put(c1560n12.f8453a, c1527c12);
                                                        }
                                                    }
                                                    if (z6 ? c1560n1.f8432F : c1560n1.f8471j) {
                                                        r14 = z4;
                                                    } else {
                                                        r14 = z6 ? c1560n1.f8433G : c1560n1.f8473k ? c3 : 0;
                                                    }
                                                    c1527c12.setTypeface(AbstractC1539g1.m4216f0(c1537g, r14, c1560n1.m4295b()));
                                                    C1527c1.m4165h(c1527c12, c1560n1.f8475l, c1560n1.f8477m);
                                                    frameLayout.addView(c1527c12, new FrameLayout.LayoutParams(-2, -2));
                                                    AbstractC1539g1.m4200V(c1527c12, c1527c1, c1560n1);
                                                    this.f7994G.put(c1560n12.f8453a, c1527c12);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            cfgdata = cfgdata2;
                        }
                    }
                    cfgdata2 = cfgdata;
                    z2 = true;
                    if (z2) {
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean m4117l() {
        HolePunchLayout holePunchLayout;
        if (m4104O() && (holePunchLayout = this.f8026i) != null) {
            cfgData cfgdata = this.f8020d;
            if (cfgdata.f2537K2) {
                if (this.f8010W || holePunchLayout.m1807m()) {
                    return true;
                }
                return !AbstractC1372y1.m3272C() && cfgdata.f2561Q2 && this.f8007T;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void m4118m() {
        ValueAnimator valueAnimator = this.f8013Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8013Z = null;
        }
    }

    /* renamed from: p */
    public final float m4119p() {
        cfgData cfgdata = this.f8020d;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        carData cardata = this.f8022e;
        if (enumC1457c == null || !enumC1457c.f7147f) {
            return Math.max(0.0f, cardata.m1774t());
        }
        return cfgdata.m1787f(cardata.m1775u(), cardata.m1776v(), enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
    }

    /* renamed from: q */
    public final float m4120q() {
        float m1780z = this.f8022e.m1780z();
        if (m1780z < 0.0f) {
            return 0.0f;
        }
        return this.f8020d.f2702u3 * m1780z;
    }

    /* renamed from: r */
    public final void m4121r() {
        carData cardata = this.f8022e;
        float f2 = 0.0f;
        float max = Math.max(0.0f, cardata.m1780z()) * this.f8020d.f2702u3;
        float m1779y = cardata.m1779y() / 1000.0f;
        C1563o1 c1563o1 = this.f8024g;
        C1554l1 c1554l1 = c1563o1.f8506m;
        float f3 = c1554l1 != null ? c1554l1.f8382h : -135.0f;
        float f4 = c1554l1 != null ? c1554l1.f8383i : 135.0f;
        C1554l1 c1554l12 = c1563o1.f8507n;
        float f5 = c1554l12 != null ? c1554l12.f8382h : -135.0f;
        float f6 = c1554l12 != null ? c1554l12.f8383i : 135.0f;
        float f7 = c1554l1 != null ? c1554l1.f8384j : 0.0f;
        float f8 = c1554l1 != null ? c1554l1.f8385k : 220.0f;
        float f9 = c1554l12 != null ? c1554l12.f8384j : 0.0f;
        float f10 = c1554l12 != null ? c1554l12.f8385k : 8.0f;
        if (f8 <= f7) {
            f7 = 0.0f;
            f8 = 220.0f;
        }
        if (f10 <= f9) {
            f10 = 8.0f;
        } else {
            f2 = f9;
        }
        this.f8001N = new C1260G0(f7, f8, 300L, max, f3, f4, 0.01f);
        this.f8002O = new C1260G0(f2, f10, 300L, m1779y, f5, f6, 0.01f);
        C1524b1 c1524b1 = this.f8032o;
        if (c1524b1 != null) {
            C1260G0 c1260g0 = this.f8001N;
            float f11 = c1260g0.f5723i;
            c1260g0.f5724j = f11;
            c1524b1.setNeedleAngle(f11);
        }
        C1524b1 c1524b12 = this.f8033p;
        if (c1524b12 != null) {
            C1260G0 c1260g02 = this.f8002O;
            float f12 = c1260g02.f5723i;
            c1260g02.f5724j = f12;
            c1524b12.setNeedleAngle(f12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0075, code lost:
    
        if (r0 > 30000) goto L38;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4122x(String str, float f2) {
        C1560n1 c1560n1 = (C1560n1) this.f7995H.get(str);
        if (c1560n1 == null) {
            return;
        }
        boolean z2 = c1560n1.f8466g0;
        HashMap hashMap = this.f7998K;
        if (!z2) {
            hashMap.remove(str);
            m4098I(str, f2, true);
            return;
        }
        if (Float.isNaN(f2) || Float.isInfinite(f2) || ((m4086t(str) && m4087u(f2)) || ((m4088v(str) && f2 == -99.0f) || ((("out_temp".equals(str) || "in_temp".equals(str)) && f2 < -90.0f) || (m4085s(str) && f2 < 0.0f))))) {
            C1516Y0 c1516y0 = (C1516Y0) hashMap.get(str);
            if (c1516y0 != null) {
                c1516y0.f7985f = false;
            }
            m4098I(str, f2, false);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = c1560n1.f8468h0;
        int i2 = i >= 50 ? 30000 : 50;
        i = i2;
        C1516Y0 c1516y02 = (C1516Y0) hashMap.get(str);
        if (c1516y02 == null) {
            C1516Y0 c1516y03 = new C1516Y0();
            c1516y03.f7980a = f2;
            c1516y03.f7981b = f2;
            c1516y03.f7982c = f2;
            c1516y03.f7984e = i;
            c1516y03.f7983d = elapsedRealtime - i;
            c1516y03.f7985f = true;
            hashMap.put(str, c1516y03);
            m4098I(str, f2, true);
            return;
        }
        if (!c1516y02.f7985f) {
            c1516y02.f7985f = true;
            c1516y02.f7980a = Float.isNaN(c1516y02.f7982c) ? f2 : c1516y02.f7982c;
            c1516y02.f7981b = f2;
            c1516y02.f7984e = i;
            c1516y02.f7983d = elapsedRealtime;
            return;
        }
        float m4089w = m4089w(c1516y02, elapsedRealtime);
        if (Math.abs(f2 - c1516y02.f7981b) > 0.001f) {
            c1516y02.f7980a = m4089w;
            c1516y02.f7981b = f2;
            c1516y02.f7984e = i;
            c1516y02.f7983d = elapsedRealtime;
        }
    }

    /* renamed from: y */
    public final void m4123y() {
        m4093D();
        float m1779y = this.f8022e.m1779y() / 1000.0f;
        C1260G0 c1260g0 = this.f8002O;
        if (c1260g0 != null) {
            c1260g0.m3034a(m1779y);
        }
        m4122x("rpm", m1779y);
        for (String str : this.f7995H.keySet()) {
            if (!"speed".equals(str) && !"rpm".equals(str) && !"clock".equals(str) && !"date".equals(str) && (str == null || !str.startsWith("image_"))) {
                m4092C(str);
            }
        }
        m4124z("clock");
        m4124z("date");
    }

    /* renamed from: z */
    public final void m4124z(String str) {
        String format;
        TextView textView = (TextView) this.f7993F.get(str);
        C1560n1 c1560n1 = (C1560n1) this.f7995H.get(str);
        if (textView == null || c1560n1 == null) {
            return;
        }
        if ("date".equals(str)) {
            format = new SimpleDateFormat(C1563o1.m4306h(c1560n1.f8448V), Locale.getDefault()).format(new Date());
        } else {
            format = new SimpleDateFormat("12".equals("12".equals(c1560n1.f8447U) ? "12" : "24") ? "h:mm a" : "HH:mm", Locale.getDefault()).format(new Date());
        }
        textView.setText(format);
        m4113h(textView, c1560n1, c1560n1.f8479n);
        m4094E(str);
    }
}
