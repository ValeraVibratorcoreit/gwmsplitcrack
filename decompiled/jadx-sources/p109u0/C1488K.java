package p109u0;

import android.R;
import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.p061ip.Theme42RpmArcView;
import com.altaysoft.t500_split.p061ip.Theme42SegmentedBarView;
import com.altaysoft.t500_split.p061ip.Theme42SpeedArcView;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.Locale;
import p000A.AbstractC0000a;
import p000A.AbstractC0001b;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p021J0.ViewOnLayoutChangeListenerC0147a;
import p022K.C0174W;
import p022K.C0181b0;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1372y1;
import p098q0.C1311e0;
import p106t0.EnumC1457c;

/* renamed from: u0.K */
/* loaded from: classes.dex */
public final class C1488K {

    /* renamed from: A */
    public TextView f7447A;

    /* renamed from: B */
    public TextView f7448B;

    /* renamed from: C */
    public TextView f7449C;

    /* renamed from: D */
    public Theme42SegmentedBarView f7450D;

    /* renamed from: E */
    public TextView f7451E;

    /* renamed from: F */
    public TextView f7452F;

    /* renamed from: G */
    public View f7453G;

    /* renamed from: H */
    public TextView f7454H;

    /* renamed from: I */
    public TextView f7455I;

    /* renamed from: J */
    public TextView f7456J;

    /* renamed from: K */
    public Theme42SegmentedBarView f7457K;

    /* renamed from: L */
    public TextView f7458L;

    /* renamed from: M */
    public TextView f7459M;

    /* renamed from: N */
    public TextView f7460N;

    /* renamed from: O */
    public TextView f7461O;

    /* renamed from: P */
    public TextView f7462P;

    /* renamed from: Q */
    public TextView f7463Q;

    /* renamed from: R */
    public View f7464R;

    /* renamed from: S */
    public ImageView f7465S;

    /* renamed from: T */
    public TextView f7466T;

    /* renamed from: U */
    public ImageView f7467U;

    /* renamed from: V */
    public View f7468V;

    /* renamed from: W */
    public ImageView f7469W;

    /* renamed from: X */
    public TextView f7470X;

    /* renamed from: Y */
    public TextView f7471Y;

    /* renamed from: Z */
    public TextView f7472Z;

    /* renamed from: a */
    public final C1537g f7473a;

    /* renamed from: a0 */
    public TextView f7474a0;

    /* renamed from: b */
    public final View f7475b;

    /* renamed from: b0 */
    public ProgressBar f7476b0;

    /* renamed from: c */
    public final Context f7477c;

    /* renamed from: c0 */
    public long f7478c0;

    /* renamed from: d0 */
    public long f7480d0;

    /* renamed from: e0 */
    public boolean f7482e0;

    /* renamed from: f0 */
    public long f7484f0;

    /* renamed from: g */
    public ViewGroup f7485g;

    /* renamed from: h */
    public View f7487h;

    /* renamed from: i */
    public Theme42SpeedArcView f7489i;

    /* renamed from: i0 */
    public C1531e f7490i0;

    /* renamed from: j */
    public Theme42RpmArcView f7491j;

    /* renamed from: j0 */
    public C1525c f7492j0;

    /* renamed from: k */
    public TextView f7493k;

    /* renamed from: k0 */
    public boolean f7494k0;

    /* renamed from: l */
    public View f7495l;

    /* renamed from: l0 */
    public boolean f7496l0;

    /* renamed from: m */
    public TextView f7497m;

    /* renamed from: n */
    public View f7499n;

    /* renamed from: o */
    public TextView f7501o;

    /* renamed from: p */
    public TextView f7503p;

    /* renamed from: q */
    public TextView f7505q;

    /* renamed from: r */
    public TextView f7507r;

    /* renamed from: r0 */
    public ValueAnimator f7508r0;

    /* renamed from: s */
    public TextView f7509s;

    /* renamed from: s0 */
    public float f7510s0;

    /* renamed from: t */
    public TextView f7511t;

    /* renamed from: u */
    public ImageView f7513u;

    /* renamed from: v */
    public ImageView f7515v;

    /* renamed from: w */
    public TextView f7517w;

    /* renamed from: x */
    public TextView f7519x;

    /* renamed from: y */
    public TextView f7521y;

    /* renamed from: z */
    public TextView f7522z;

    /* renamed from: d */
    public final cfgData f7479d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f7481e = carData.getInstance();

    /* renamed from: f */
    public final Handler f7483f = new Handler(Looper.getMainLooper());

    /* renamed from: g0 */
    public C0636d f7486g0 = C0636d.f2994j;

    /* renamed from: h0 */
    public float f7488h0 = 1.0f;

    /* renamed from: m0 */
    public boolean f7498m0 = true;

    /* renamed from: n0 */
    public boolean f7500n0 = false;

    /* renamed from: o0 */
    public final RunnableC1476E f7502o0 = new RunnableC1476E(this, 3);

    /* renamed from: p0 */
    public boolean f7504p0 = false;

    /* renamed from: q0 */
    public float f7506q0 = 0.0f;

    /* renamed from: t0 */
    public int f7512t0 = 999;

    /* renamed from: u0 */
    public final ViewOnLayoutChangeListenerC0147a f7514u0 = new ViewOnLayoutChangeListenerC0147a(1, this);

    /* renamed from: v0 */
    public final C1484I f7516v0 = new C1484I(0, this);

    /* renamed from: w0 */
    public final RunnableC1486J f7518w0 = new RunnableC1486J(this, 0);

    /* renamed from: x0 */
    public final RunnableC1486J f7520x0 = new RunnableC1486J(this, 1);

    public C1488K(C1537g c1537g, View view) {
        this.f7473a = c1537g;
        this.f7475b = view;
        this.f7477c = view.getContext();
    }

    /* renamed from: g */
    public static int m3723g(float f2) {
        if (f2 < 40.0f) {
            return -16776961;
        }
        if (f2 > 112.0f) {
            return -65536;
        }
        return f2 > 107.0f ? -256 : -1714760;
    }

    /* renamed from: h */
    public static String m3724h(float f2) {
        return String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", ".");
    }

    /* renamed from: i */
    public static String m3725i(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: t */
    public static void m3726t(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: u */
    public static void m3727u(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: A */
    public final void m3728A() {
        if (this.f7499n == null || this.f7491j == null) {
            return;
        }
        float max = Math.max(0.0f, this.f7481e.m1779y() / 1000.0f);
        Theme42RpmArcView theme42RpmArcView = this.f7491j;
        if (!theme42RpmArcView.f2800w || theme42RpmArcView.f2799v == null) {
            this.f7499n.post(new RunnableC1476E(this, 2));
            return;
        }
        float max2 = Math.max(0.0f, Math.min(8.0f, max));
        C1542h1 c1542h1 = theme42RpmArcView.f2799v;
        float f2 = c1542h1.f8329c + theme42RpmArcView.f2792o + theme42RpmArcView.f2793p;
        float f3 = theme42RpmArcView.f2794q;
        float f4 = c1542h1.f8328b;
        float f5 = f4 + f3;
        float f6 = f4 + f3;
        float f7 = c1542h1.f8331e;
        float f8 = c1542h1.f8327a;
        float radians = (float) Math.toRadians(((max2 / 8.0f) * theme42RpmArcView.f2799v.f8333g) + ((float) Math.toDegrees(Math.atan2(c1542h1.f8330d - f6, (f8 - f7) - f8))));
        float f9 = (theme42RpmArcView.f2792o * 0.2f) + f2;
        double d = radians;
        this.f7499n.post(new RunnableC1482H(this, new float[]{(((float) Math.cos(d)) * f9) + theme42RpmArcView.f2799v.f8327a, (f9 * ((float) Math.sin(d))) + f5}, 1));
    }

    /* renamed from: B */
    public final void m3729B() {
        if (this.f7495l == null || this.f7489i == null) {
            return;
        }
        float m3738j = m3738j();
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        if (!theme42SpeedArcView.f2829y || theme42SpeedArcView.f2828x == null) {
            this.f7495l.post(new RunnableC1476E(this, 0));
            return;
        }
        float max = Math.max(0.0f, Math.min(220.0f, m3738j));
        C1542h1 c1542h1 = theme42SpeedArcView.f2828x;
        float radians = (float) Math.toRadians(c1542h1.f8332f + ((max / 220.0f) * c1542h1.f8333g));
        C1542h1 c1542h12 = theme42SpeedArcView.f2828x;
        float f2 = (theme42SpeedArcView.f2822r * 0.2f) + c1542h12.f8329c;
        double d = radians;
        this.f7495l.post(new RunnableC1482H(this, new float[]{(((float) Math.cos(d)) * f2) + c1542h12.f8327a, (f2 * ((float) Math.sin(d))) + theme42SpeedArcView.f2828x.f8328b}, 0));
    }

    /* renamed from: C */
    public final void m3730C() {
        this.f7483f.removeCallbacks(this.f7502o0);
        if (!m3740l()) {
            m3747s();
            return;
        }
        ValueAnimator valueAnimator = this.f7508r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7508r0 = null;
        }
        if (!this.f7500n0 && AbstractC1372y1.m3272C()) {
            m3747s();
            return;
        }
        if (!this.f7500n0) {
            this.f7500n0 = true;
            AbstractC1372y1.m3287R(true, true);
            this.f7506q0 = 0.0f;
            m3735d();
            m3750x(0.0f, 1.0f, null);
            return;
        }
        float f2 = this.f7506q0;
        if (f2 > 0.0f) {
            m3750x(f2, 0.0f, new RunnableC1476E(this, 5));
            return;
        }
        this.f7500n0 = false;
        AbstractC1372y1.m3287R(false, true);
        m3735d();
    }

    /* renamed from: D */
    public final void m3731D() {
        C1542h1 arcGeometry;
        RectF rectF;
        RectF rectF2;
        ViewGroup viewGroup = this.f7485g;
        if (viewGroup == null || this.f7492j0 == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7485g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7485g.post(new RunnableC1476E(this, 4));
            return;
        }
        float f2 = this.f7477c.getResources().getDisplayMetrics().density;
        this.f7492j0.m4160b();
        if (this.f7500n0 || this.f7506q0 > 0.0f) {
            AbstractC1539g1.m4205a(this.f7492j0, width, height, f2, this.f7506q0, f2);
        }
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        if (theme42SpeedArcView != null && (arcGeometry = theme42SpeedArcView.getArcGeometry()) != null) {
            C1525c c1525c = this.f7492j0;
            boolean m4195Q = AbstractC1539g1.m4195Q(this.f7479d, this.f7481e);
            if (c1525c != null && width > 0 && height > 0) {
                if (width <= 0 || height <= 0) {
                    rectF = new RectF();
                } else {
                    RectF m4214e0 = AbstractC1539g1.m4214e0(arcGeometry);
                    float f3 = width / 1920.0f;
                    float f4 = height / 720.0f;
                    rectF = new RectF(m4214e0.left * f3, m4214e0.top * f4, m4214e0.right * f3, m4214e0.bottom * f4);
                }
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    float centerX = rectF.centerX();
                    float f5 = rectF.bottom;
                    float width2 = 0.5f * rectF.width();
                    float f6 = f2 * 14.0f;
                    if (width2 > 0.0f) {
                        c1525c.f8164h.add(new C1522b(centerX, f5, width2, f6, f2));
                        c1525c.invalidateSelf();
                    }
                    if (!m4195Q) {
                        if (width <= 0 || height <= 0) {
                            rectF2 = new RectF();
                        } else {
                            RectF m4214e02 = AbstractC1539g1.m4214e0(arcGeometry);
                            float f7 = width / 1920.0f;
                            float f8 = height / 720.0f;
                            rectF2 = new RectF(m4214e02.left * f7, m4214e02.bottom * f8, m4214e02.right * f7, f8 * 715.0f);
                        }
                        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
                            c1525c.m4159a(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 0.0f, 0.0f);
                        }
                    }
                }
            }
        }
        this.f7485g.invalidate();
    }

    /* renamed from: a */
    public final void m3732a() {
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        cfgData cfgdata = this.f7479d;
        if (theme42SpeedArcView != null) {
            float f2 = cfgdata.f2564R1;
            float f3 = cfgdata.f2568S1;
            if (Math.abs(f2 - theme42SpeedArcView.f2825u) > 0.05f || Math.abs(f3 - theme42SpeedArcView.f2826v) > 0.05f) {
                theme42SpeedArcView.f2825u = f2;
                theme42SpeedArcView.f2826v = f3;
                theme42SpeedArcView.invalidate();
            }
        }
        Theme42RpmArcView theme42RpmArcView = this.f7491j;
        if (theme42RpmArcView != null) {
            float f4 = cfgdata.f2572T1;
            float f5 = cfgdata.f2576U1;
            if (Math.abs(f4 - theme42RpmArcView.f2797t) > 0.02f || Math.abs(f5 - theme42RpmArcView.f2798u) > 0.02f) {
                theme42RpmArcView.f2797t = f4;
                theme42RpmArcView.f2798u = f5;
                theme42RpmArcView.invalidate();
            }
        }
    }

    /* renamed from: b */
    public final void m3733b(long j2) {
        boolean z2 = this.f7480d0 > 0;
        ProgressBar progressBar = this.f7476b0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7476b0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7480d0)));
            }
        }
        TextView textView = this.f7472Z;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7472Z.setText(m3725i(j2));
            }
        }
        TextView textView2 = this.f7474a0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7474a0.setText(m3725i(this.f7480d0));
            }
        }
    }

    /* renamed from: c */
    public final void m3734c() {
        C0636d c0636d;
        if (this.f7468V == null) {
            return;
        }
        this.f7468V.setVisibility(this.f7479d.f2585W2 && (c0636d = this.f7486g0) != null && c0636d.m1851a() && (this.f7488h0 > 0.01f ? 1 : (this.f7488h0 == 0.01f ? 0 : -1)) > 0 ? 0 : 8);
        this.f7468V.setAlpha(this.f7488h0);
    }

    /* renamed from: d */
    public final void m3735d() {
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        if (theme42SpeedArcView != null) {
            theme42SpeedArcView.setQnxHoleProgress(this.f7506q0);
        }
        m3731D();
        boolean z2 = this.f7500n0;
        cfgData cfgdata = this.f7479d;
        if (!z2 && this.f7506q0 <= 0.0f) {
            TextView textView = this.f7503p;
            if (textView != null) {
                textView.setVisibility(0);
                this.f7503p.setAlpha(1.0f);
            }
            m3727u(this.f7505q, true);
            TextView textView2 = this.f7505q;
            if (textView2 != null) {
                textView2.setAlpha(1.0f);
            }
            m3727u(this.f7464R, cfgdata.f2581V2);
            View view = this.f7464R;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            this.f7488h0 = 1.0f;
            m3734c();
            return;
        }
        if (z2 && this.f7506q0 >= 1.0f) {
            TextView textView3 = this.f7503p;
            if (textView3 != null) {
                textView3.setVisibility(4);
                this.f7503p.setAlpha(0.0f);
            }
            m3727u(this.f7505q, false);
            TextView textView4 = this.f7505q;
            if (textView4 != null) {
                textView4.setAlpha(0.0f);
            }
            m3727u(this.f7464R, false);
            View view2 = this.f7464R;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            this.f7488h0 = 0.0f;
            m3734c();
            return;
        }
        float f2 = z2 ? 1.0f - this.f7506q0 : this.f7506q0;
        TextView textView5 = this.f7503p;
        if (textView5 != null) {
            textView5.setVisibility(f2 > 0.01f ? 0 : 4);
            this.f7503p.setAlpha(f2);
        }
        TextView textView6 = this.f7505q;
        if (textView6 != null) {
            textView6.setVisibility(f2 > 0.01f ? 0 : 4);
            this.f7505q.setAlpha(f2);
        }
        View view3 = this.f7464R;
        if (view3 != null) {
            view3.setVisibility((!cfgdata.f2581V2 || f2 <= 0.01f) ? 4 : 0);
            this.f7464R.setAlpha(f2);
        }
        this.f7488h0 = f2;
        m3734c();
    }

    /* renamed from: e */
    public final void m3736e() {
        ViewGroup viewGroup = this.f7485g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f7498m0);
        cfgData cfgdata = this.f7479d;
        if (!cfgdata.f2537K2 || !cfgdata.f2561Q2 || !this.f7498m0) {
            m3747s();
            this.f7485g.setVisibility(4);
            ViewGroup viewGroup2 = this.f7485g;
            if (viewGroup2 != null) {
                viewGroup2.setLayerType(0, null);
                this.f7485g.setBackgroundResource(R.color.transparent);
            }
            C1525c c1525c = this.f7492j0;
            if (c1525c != null) {
                c1525c.m4160b();
                this.f7492j0.m4163e(null);
            }
            m3739k();
            return;
        }
        this.f7485g.setVisibility(0);
        if (this.f7485g != null) {
            C1525c c1525c2 = this.f7492j0;
            Context context = this.f7477c;
            if (c1525c2 == null) {
                C1525c c1525c3 = new C1525c(-16777216);
                this.f7492j0 = c1525c3;
                c1525c3.m4164f(AbstractC0001b.m3a(context, com.altaysoft.t500_split.R.color.ip_theme_42_border_dim));
            }
            this.f7492j0.m4163e(AbstractC0000a.m1b(context, com.altaysoft.t500_split.R.drawable.ip_theme_42_bg));
            this.f7485g.setLayerType(1, null);
            this.f7485g.setBackground(this.f7492j0);
            m3731D();
            AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, this.f7487h, AbstractC1539g1.m4230m0(cfgdata, this.f7481e));
        }
        m3727u(this.f7489i, true);
        m3727u(this.f7491j, true);
        m3735d();
    }

    /* renamed from: f */
    public final void m3737f() {
        final RunnableC1476E runnableC1476E = new RunnableC1476E(this, 1);
        final int i = 3;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        };
        carData cardata = this.f7481e;
        C1537g c1537g = this.f7473a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 5;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i3 = 6;
        cardata.m1726O(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i4 = 7;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i5 = 8;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i6 = 9;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i7 = 10;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i8 = 11;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i9 = 12;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i10 = 13;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i11 = 14;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i12 = 15;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i13 = 16;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i14 = 17;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i15 = 18;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i16 = 19;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i17 = 0;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i18 = 1;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i19 = 2;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i20 = 4;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.F
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i20) {
                    case 0:
                        runnableC1476E.run();
                        break;
                    case 1:
                        runnableC1476E.run();
                        break;
                    case 2:
                        runnableC1476E.run();
                        break;
                    case 3:
                        runnableC1476E.run();
                        break;
                    case 4:
                        runnableC1476E.run();
                        break;
                    case 5:
                        runnableC1476E.run();
                        break;
                    case 6:
                        runnableC1476E.run();
                        break;
                    case 7:
                        runnableC1476E.run();
                        break;
                    case 8:
                        runnableC1476E.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1476E.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1476E.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1476E.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1476E.run();
                        break;
                    case 13:
                        runnableC1476E.run();
                        break;
                    case 14:
                        runnableC1476E.run();
                        break;
                    case 15:
                        runnableC1476E.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1476E.run();
                        break;
                    case 17:
                        runnableC1476E.run();
                        break;
                    case 18:
                        runnableC1476E.run();
                        break;
                    default:
                        runnableC1476E.run();
                        break;
                }
            }
        });
        final int i21 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i21) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i22) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i23) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i24) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i25) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i26 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i26) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f7477c);
        final int i27 = 6;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i27) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 7;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i28) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 8;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i29) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 9;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i30) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 10;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i31) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 11;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i32) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 12;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i33) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 13;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i34) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 14;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.G

            /* renamed from: b */
            public final /* synthetic */ C1488K f7430b;

            {
                this.f7430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                int intValue3;
                ValueAnimator valueAnimator;
                switch (i35) {
                    case 0:
                        this.f7430b.m3746r();
                        break;
                    case 1:
                        this.f7430b.m3745q();
                        break;
                    case 2:
                        this.f7430b.m3745q();
                        break;
                    case 3:
                        this.f7430b.m3745q();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1488K c1488k = this.f7430b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1488k.getClass();
                            intValue = num.intValue();
                        }
                        if (c1488k.f7512t0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1488k.f7477c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1488k.f7479d;
                            if (cfgdata.f2537K2) {
                                c1488k.f7510s0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1488k.f7512t0 == -1 && intValue > -1) {
                            c1488k.f7510s0 = 0.0f;
                            ViewGroup viewGroup = c1488k.f7485g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1488k.f7485g.setAlpha(1.0f);
                            }
                            c1488k.m3751y("ip");
                        }
                        c1488k.f7512t0 = intValue;
                        c1488k.m3743o();
                        break;
                    case 5:
                        this.f7430b.m3743o();
                        break;
                    case 6:
                        Integer num2 = (Integer) obj;
                        C1488K c1488k2 = this.f7430b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1488k2.getClass();
                            intValue2 = num2.intValue();
                        }
                        c1488k2.m3742n(intValue2);
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1488K c1488k3 = this.f7430b;
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            c1488k3.getClass();
                            intValue3 = num3.intValue();
                        }
                        TextView textView = c1488k3.f7466T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1488k3.m3742n(c1488k3.f7481e.m1745e());
                        break;
                    case 8:
                        C1488K c1488k4 = this.f7430b;
                        c1488k4.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        if (equals) {
                            c1488k4.f7498m0 = true;
                        }
                        AbstractC1372y1.m3286Q(c1488k4.f7498m0);
                        c1488k4.m3736e();
                        boolean z2 = AbstractC1372y1.f6437g;
                        if (z2 && !equals) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z2) {
                            AbstractC1372y1.m3292W(c1488k4.f7477c, true);
                            break;
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        C1488K c1488k5 = this.f7430b;
                        c1488k5.m3731D();
                        c1488k5.m3752z();
                        c1488k5.m3734c();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1488K c1488k6 = this.f7430b;
                        c1488k6.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1488k6.m3747s();
                        }
                        c1488k6.m3731D();
                        c1488k6.m3752z();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1488K c1488k7 = this.f7430b;
                        c1488k7.m3731D();
                        c1488k7.m3752z();
                        c1488k7.m3734c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1488K c1488k8 = this.f7430b;
                        AbstractC1539g1.m4225k(c1488k8.f7477c);
                        c1488k8.m3731D();
                        c1488k8.m3752z();
                        AbstractC1539g1.m4215f(com.altaysoft.t500_split.R.drawable.ip_theme_42_top_bar, c1488k8.f7487h, AbstractC1539g1.m4230m0(c1488k8.f7479d, c1488k8.f7481e));
                        break;
                    case 13:
                        C1488K c1488k9 = this.f7430b;
                        Integer num4 = (Integer) obj;
                        c1488k9.getClass();
                        if (num4 != null && num4.intValue() != 0) {
                            if (num4.intValue() != 16) {
                                if (num4.intValue() != 1) {
                                    if (num4.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1488k9.f7477c, num4.intValue())) {
                                            if (num4.intValue() != 6) {
                                                if (num4.intValue() != 3 || !c1488k9.f7479d.f2561Q2) {
                                                    if (num4.intValue() != 13 && num4.intValue() != 14) {
                                                        if ((num4.intValue() != 7 && num4.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num4.intValue() != 7 && num4.intValue() != 8) || !c1488k9.f7504p0 || !c1488k9.f7500n0) {
                                                                if (num4.intValue() == 9 && AbstractC1539g1.m4209c(c1488k9.f7481e)) {
                                                                    cfgData cfgdata2 = c1488k9.f7479d;
                                                                    boolean z3 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z3;
                                                                    c1488k9.f7481e.m1760l0(z3);
                                                                    c1488k9.f7479d.m1795o(c1488k9.f7477c);
                                                                    Context context2 = c1488k9.f7477c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1488k9.f7479d.f2549N2 ? com.altaysoft.t500_split.R.string.enablingAlice : com.altaysoft.t500_split.R.string.disablingAlice));
                                                                    if (c1488k9.f7479d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1488k9.f7477c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1488k9.m3751y("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1488k9.f7483f;
                                                                RunnableC1476E runnableC1476E2 = c1488k9.f7502o0;
                                                                handler.removeCallbacks(runnableC1476E2);
                                                                handler.postDelayed(runnableC1476E2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1488k9.f7500n0) {
                                                        c1488k9.f7504p0 = true;
                                                        if (c1488k9.m3740l() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1488k9.f7500n0 && ((valueAnimator = c1488k9.f7508r0) == null || !valueAnimator.isRunning())) {
                                                                c1488k9.m3730C();
                                                            }
                                                            Handler handler2 = c1488k9.f7483f;
                                                            RunnableC1476E runnableC1476E3 = c1488k9.f7502o0;
                                                            handler2.removeCallbacks(runnableC1476E3);
                                                            handler2.postDelayed(runnableC1476E3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1488k9.f7504p0) {
                                                        Handler handler3 = c1488k9.f7483f;
                                                        RunnableC1476E runnableC1476E4 = c1488k9.f7502o0;
                                                        handler3.removeCallbacks(runnableC1476E4);
                                                        handler3.postDelayed(runnableC1476E4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z4 = !c1488k9.f7498m0;
                                                    c1488k9.f7498m0 = z4;
                                                    AbstractC1372y1.m3286Q(z4);
                                                    c1488k9.m3736e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1488k9.f7477c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1488k9.f7479d.f2672o3) {
                                                    Context context3 = c1488k9.f7477c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(com.altaysoft.t500_split.R.string.msgSplitRecovery));
                                                    c1488k9.m3751y("ip_rest");
                                                    break;
                                                } else {
                                                    c1488k9.m3751y("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1488k9.f7481e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            int[] m3282M = AbstractC1372y1.m3282M(c1488k9.f7479d.f2620e1);
                                            AbstractC1372y1.m3290U(c1488k9.f7477c, m3282M[0], m3282M[1], 0.9f, c1488k9.f7479d.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1488k9.f7477c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && c1488k9.m3740l()) {
                                    ValueAnimator valueAnimator2 = c1488k9.f7508r0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1488k9.f7504p0 = false;
                                        c1488k9.m3730C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1488k9.f7477c);
                                break;
                            }
                        }
                        break;
                    default:
                        this.f7430b.m3744p((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: j */
    public final float m3738j() {
        float m1780z = this.f7481e.m1780z();
        if (m1780z < 0.0f) {
            return 0.0f;
        }
        return this.f7479d.f2702u3 * m1780z;
    }

    /* renamed from: k */
    public final void m3739k() {
        ImageView imageView = this.f7465S;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.f7466T;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView2 = this.f7467U;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        if (theme42SpeedArcView != null) {
            theme42SpeedArcView.m1820c(false, 0.0f, -7829368);
        }
    }

    /* renamed from: l */
    public final boolean m3740l() {
        cfgData cfgdata = this.f7479d;
        return cfgdata.f2537K2 && cfgdata.f2561Q2 && this.f7498m0;
    }

    /* renamed from: m */
    public final void m3741m() {
        float max;
        float max2;
        int m3723g;
        float max3;
        int i;
        int i2;
        int i3;
        int i4;
        AbstractC1539g1.m4228l0(this.f7485g, !this.f7498m0);
        m3732a();
        float m3738j = m3738j();
        TextView textView = this.f7493k;
        cfgData cfgdata = this.f7479d;
        carData cardata = this.f7481e;
        if (textView != null) {
            if (m3738j > cfgdata.f2568S1) {
                i4 = -65536;
            } else if (m3738j > cfgdata.f2564R1) {
                i4 = -256;
            } else {
                if (cfgdata.f2641i2) {
                    int m1753i = cardata.m1753i();
                    if (m1753i == 1) {
                        i4 = -1947062;
                    } else if (m1753i == 2) {
                        i4 = -12345273;
                    }
                }
                i4 = -1714760;
            }
            textView.setTextColor(i4);
            this.f7493k.setText(m3724h(m3738j));
        }
        TextView textView2 = this.f7497m;
        if (textView2 != null) {
            if (m3738j > cfgdata.f2568S1) {
                i3 = -65536;
            } else if (m3738j > cfgdata.f2564R1) {
                i3 = -256;
            } else {
                if (cfgdata.f2641i2) {
                    int m1753i2 = cardata.m1753i();
                    if (m1753i2 == 1) {
                        i3 = -1947062;
                    } else if (m1753i2 == 2) {
                        i3 = -12345273;
                    }
                }
                i3 = -1714760;
            }
            textView2.setTextColor(i3);
            this.f7497m.setText(m3724h(m3738j));
        }
        View view = this.f7495l;
        if (view != null) {
            view.setVisibility(m3738j <= 0.0f ? 4 : 0);
        }
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        int i5 = -2838432;
        if (theme42SpeedArcView != null) {
            theme42SpeedArcView.setSpeed(m3738j);
            this.f7489i.setProgressColor(m3738j > cfgdata.f2568S1 ? -65536 : m3738j > cfgdata.f2564R1 ? -256 : AbstractC1539g1.m4234p(Math.max(0.0f, Math.min(1.0f, m3738j / 220.0f)), -7704536, -2838432));
        }
        m3729B();
        float max4 = Math.max(0.0f, cardata.m1779y() / 1000.0f);
        View view2 = this.f7499n;
        if (view2 != null) {
            view2.setVisibility(max4 <= 0.0f ? 4 : 0);
        }
        Theme42RpmArcView theme42RpmArcView = this.f7491j;
        if (theme42RpmArcView != null) {
            theme42RpmArcView.setRpm(max4);
            this.f7491j.setProgressColor(max4 > cfgdata.f2576U1 ? -65536 : max4 > cfgdata.f2572T1 ? -256 : AbstractC1539g1.m4234p(Math.max(0.0f, Math.min(1.0f, max4 / 8.0f)), -9406336, -4669240));
        }
        TextView textView3 = this.f7503p;
        if (textView3 != null) {
            if (max4 > cfgdata.f2576U1) {
                i2 = -65536;
            } else if (max4 > cfgdata.f2572T1) {
                i2 = -256;
            } else {
                if (cfgdata.f2641i2) {
                    int m1753i3 = cardata.m1753i();
                    if (m1753i3 == 1) {
                        i2 = -1947062;
                    } else if (m1753i3 == 2) {
                        i2 = -12345273;
                    }
                }
                i2 = -1714760;
            }
            textView3.setTextColor(i2);
            this.f7503p.setText(AbstractC1256E0.m2986A(max4));
        }
        TextView textView4 = this.f7501o;
        if (textView4 != null) {
            if (max4 > cfgdata.f2576U1) {
                i = -65536;
            } else if (max4 > cfgdata.f2572T1) {
                i = -256;
            } else {
                if (cfgdata.f2641i2) {
                    int m1753i4 = cardata.m1753i();
                    if (m1753i4 == 1) {
                        i = -1947062;
                    } else if (m1753i4 == 2) {
                        i = -12345273;
                    }
                }
                i = -1714760;
            }
            textView4.setTextColor(i);
            this.f7501o.setText(AbstractC1256E0.m2986A(max4));
        }
        m3728A();
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c.f7147f) {
            max = cardata.m1775u() * (enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
            Theme42SegmentedBarView theme42SegmentedBarView = this.f7450D;
            if (theme42SegmentedBarView != null) {
                theme42SegmentedBarView.setProgress(Math.round(max));
            }
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            Theme42SegmentedBarView theme42SegmentedBarView2 = this.f7450D;
            if (theme42SegmentedBarView2 != null) {
                theme42SegmentedBarView2.setProgress(Math.round(max));
            }
        }
        EnumC1457c enumC1457c2 = cfgdata.f2543M0;
        if (enumC1457c2.f7147f) {
            max2 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c2 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
        } else {
            max2 = Math.max(0.0f, cardata.m1774t());
        }
        int i6 = max2 < 15.0f ? -65536 : max2 < 30.0f ? -256 : -1714760;
        Theme42SegmentedBarView theme42SegmentedBarView3 = this.f7450D;
        if (theme42SegmentedBarView3 != null) {
            if (max < 15.0f) {
                i5 = -7651304;
            } else if (max < 35.0f) {
                i5 = AbstractC1539g1.m4234p((max - 15.0f) / 20.0f, -7651304, -6658008);
            } else if (max < 55.0f) {
                i5 = AbstractC1539g1.m4234p((max - 35.0f) / 20.0f, -6658008, -2838432);
            }
            theme42SegmentedBarView3.setBarProgressColor(i5);
        }
        TextView textView5 = this.f7449C;
        if (textView5 != null) {
            Locale locale = Locale.ENGLISH;
            EnumC1457c enumC1457c3 = cfgdata.f2543M0;
            if (enumC1457c3.f7147f) {
                max3 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c3 != EnumC1457c.T500_BT_NEW ? 1.0f : 10.0f);
            } else {
                max3 = Math.max(0.0f, cardata.m1774t()) * cfgdata.m1789h();
            }
            textView5.setText(String.format(locale, "%.0f L", Float.valueOf(max3)));
            this.f7449C.setTextColor(i6);
        }
        float m1743d = cardata.m1743d();
        Theme42SegmentedBarView theme42SegmentedBarView4 = this.f7457K;
        if (theme42SegmentedBarView4 != null) {
            theme42SegmentedBarView4.setProgress(Math.round(m1743d < 40.0f ? 0 : m1743d > 130.0f ? 100 : Math.round(((m1743d - 40.0f) / 90.0f) * 100.0f)));
            Theme42SegmentedBarView theme42SegmentedBarView5 = this.f7457K;
            if (m1743d < -90.0f) {
                m3723g = AbstractC1539g1.m4241w(40.0f);
            } else {
                m3723g = m3723g(m1743d);
                if (m3723g == -1714760) {
                    m3723g = AbstractC1539g1.m4241w(m1743d);
                }
            }
            theme42SegmentedBarView5.setBarProgressColor(m3723g);
        }
        TextView textView6 = this.f7456J;
        if (textView6 != null) {
            if (m1743d < -90.0f) {
                textView6.setText("-- °C");
                this.f7456J.setTextColor(-1714760);
            } else {
                textView6.setText(String.format(Locale.ENGLISH, "%.0f °C", Float.valueOf(m1743d)));
                this.f7456J.setTextColor(m3723g(m1743d));
            }
        }
        float m1765o = cardata.m1765o();
        TextView textView7 = this.f7517w;
        if (textView7 != null) {
            textView7.setText(m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L");
        }
        if (this.f7519x != null) {
            this.f7519x.setText((m3738j() > 0.0f ? 1 : (m3738j() == 0.0f ? 0 : -1)) > 0 ? "/100km" : "/час");
        }
        TextView textView8 = this.f7451E;
        if (textView8 != null) {
            textView8.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(cardata.m1777w())));
        }
        m3726t(this.f7522z, cardata.m1739b());
        m3726t(this.f7448B, cardata.m1737a());
        TextView textView9 = this.f7458L;
        if (textView9 != null) {
            textView9.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(cardata.m1741c())));
        }
        TextView textView10 = this.f7459M;
        if (textView10 != null) {
            boolean z2 = cfgdata.f2543M0.f7149h;
            textView10.setVisibility(z2 ? 0 : 4);
            if (z2) {
                TextView textView11 = this.f7459M;
                Locale locale2 = Locale.ENGLISH;
                Float valueOf = Float.valueOf(cardata.m1761m());
                EnumC1457c enumC1457c4 = cfgdata.f2543M0;
                textView11.setText(String.format(locale2, "%.1f%s", valueOf, (enumC1457c4 == EnumC1457c.T500_Urban || enumC1457c4 == EnumC1457c.T400 || enumC1457c4 == EnumC1457c.T700_100 || enumC1457c4 == EnumC1457c.T700) ? "%" : "V"));
            }
        }
        TextView textView12 = this.f7452F;
        if (textView12 != null) {
            Locale locale3 = Locale.ENGLISH;
            textView12.setText("ODO: " + m3724h(cardata.m1771r()));
        }
        TextView textView13 = this.f7454H;
        String str = "";
        if (textView13 != null) {
            textView13.setText(cfgdata.f2577U2 ? AbstractC1561o.m4299c("Day: ", String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(",", ".")) : "");
            this.f7454H.setVisibility(cfgdata.f2577U2 ? 0 : 8);
        }
        TextView textView14 = this.f7455I;
        if (textView14 != null) {
            if (cfgdata.f2573T2) {
                Locale locale4 = Locale.ENGLISH;
                str = AbstractC1561o.m4299c("Trip: ", m3724h(cardata.m1767p()));
            }
            textView14.setText(str);
            this.f7455I.setVisibility(cfgdata.f2573T2 ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = this.f7455I.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int round = (cfgdata.f2577U2 && cfgdata.f2573T2) ? Math.round(this.f7455I.getPaint().measureText("   ")) + 20 : 0;
                if (marginLayoutParams.getMarginStart() != round) {
                    marginLayoutParams.setMarginStart(round);
                    this.f7455I.setLayoutParams(marginLayoutParams);
                }
            }
        }
        m3727u(this.f7452F, cfgdata.f2569S2);
        m3727u(this.f7453G, cfgdata.f2577U2 || cfgdata.f2573T2);
        boolean z3 = cfgdata.useJourneyFuel;
        m3727u(this.f7521y, z3);
        m3727u(this.f7522z, z3);
        m3727u(this.f7447A, z3);
        m3748v(this.f7460N, cardata.m1715C());
        m3748v(this.f7461O, cardata.m1716D());
        m3748v(this.f7462P, cardata.m1717E());
        m3748v(this.f7463Q, cardata.m1718F());
        m3746r();
        m3745q();
        m3743o();
        TextView textView15 = this.f7509s;
        if (textView15 != null) {
            textView15.setText(AbstractC1372y1.m3307m(this.f7477c));
        }
        m3742n(cardata.m1745e());
    }

    /* renamed from: n */
    public final void m3742n(int i) {
        ImageView imageView;
        TextView textView;
        if (!m3740l()) {
            m3739k();
            return;
        }
        byte b2 = (byte) (i & 15);
        byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
        EnumC1457c enumC1457c = this.f7479d.f2543M0;
        if (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite) {
            b3 = 1;
            b2 = 1;
        }
        if (b2 == 1) {
            ImageView imageView2 = this.f7465S;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView2 = this.f7466T;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        } else if (b2 == 2) {
            ImageView imageView3 = this.f7465S;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                this.f7465S.setColorFilter(-7829368);
            }
            TextView textView3 = this.f7466T;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else if (b2 == 3) {
            ImageView imageView4 = this.f7465S;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
                this.f7465S.setColorFilter(-16711936);
            }
            TextView textView4 = this.f7466T;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        }
        carData cardata = this.f7481e;
        if (cardata.m1747f() < 20 && (textView = this.f7466T) != null) {
            textView.setVisibility(4);
        }
        if (this.f7489i != null) {
            ImageView imageView5 = this.f7465S;
            if (imageView5 == null || imageView5.getVisibility() != 0 || cardata.m1747f() < 20) {
                this.f7489i.m1820c(false, 0.0f, -7829368);
            } else {
                this.f7489i.m1820c(true, cardata.m1747f(), b2 == 3 ? -16711936 : -7829368);
            }
        }
        if (b3 == 1) {
            ImageView imageView6 = this.f7467U;
            if (imageView6 != null) {
                imageView6.setVisibility(4);
                return;
            }
            return;
        }
        if (b3 == 2) {
            ImageView imageView7 = this.f7467U;
            if (imageView7 != null) {
                imageView7.setVisibility(0);
                this.f7467U.setColorFilter(-7829368);
                return;
            }
            return;
        }
        if (b3 != 3 || (imageView = this.f7467U) == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f7467U.setColorFilter(-16711936);
    }

    /* renamed from: o */
    public final void m3743o() {
        TextView textView = this.f7507r;
        if (textView == null) {
            return;
        }
        if (!this.f7479d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f7481e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f7507r.setVisibility(4);
            return;
        }
        this.f7507r.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f7507r, -5728136, -1714760), 0, replace.length(), 33);
        this.f7507r.setText(spannableString);
    }

    /* renamed from: p */
    public final void m3744p(C0636d c0636d) {
        this.f7486g0 = c0636d != null ? c0636d : C0636d.f2994j;
        View view = this.f7468V;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        TextView textView = this.f7470X;
        if (textView != null) {
            String str = this.f7486g0.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f7471Y;
        if (textView2 != null) {
            String str2 = this.f7486g0.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            TextView textView3 = this.f7471Y;
            String str3 = this.f7486g0.f2997c;
            textView3.setVisibility((str3 == null || str3.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f7469W;
        if (imageView != null) {
            Bitmap bitmap = this.f7486g0.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f7469W.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f7469W.setVisibility(8);
            }
        }
        C0636d c0636d2 = this.f7486g0;
        this.f7480d0 = c0636d2.f3002h;
        this.f7478c0 = c0636d2.f3001g;
        this.f7482e0 = c0636d2.f3000f;
        this.f7484f0 = SystemClock.elapsedRealtime();
        m3733b(this.f7478c0);
        m3734c();
    }

    /* renamed from: q */
    public final void m3745q() {
        ImageView imageView = this.f7513u;
        carData cardata = this.f7481e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f7515v != null) {
            this.f7515v.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f7515v.setColorFilter(cardata.m1713A() ? -256 : -1714760);
        }
    }

    /* renamed from: r */
    public final void m3746r() {
        if (this.f7511t == null) {
            return;
        }
        float m1773s = this.f7481e.m1773s();
        if (m1773s < -90.0f) {
            this.f7511t.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        spannableString.setSpan(AbstractC0062j.m155i(this.f7511t, -5728136, -1714760), 0, replace.length(), 33);
        this.f7511t.setText(spannableString);
    }

    /* renamed from: s */
    public final void m3747s() {
        this.f7483f.removeCallbacks(this.f7502o0);
        ValueAnimator valueAnimator = this.f7508r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7508r0 = null;
        }
        this.f7500n0 = false;
        this.f7506q0 = 0.0f;
        AbstractC1372y1.m3287R(false, false);
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        if (theme42SpeedArcView != null) {
            theme42SpeedArcView.setQnxHoleProgress(0.0f);
        }
        m3735d();
    }

    /* renamed from: v */
    public final void m3748v(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        if (f2 == -99.0f || f2 == 3.5f) {
            textView.setText("--");
            textView.setTextColor(-16776961);
        } else {
            textView.setText(String.format(Locale.ENGLISH, f2 > 10.0f ? "%.0f" : "%.1f", Float.valueOf(f2)).replace(",", "."));
            float f3 = this.f7479d.f2580V1;
            textView.setTextColor(f2 < 0.95f * f3 ? -65536 : f2 < f3 ? -256 : -1714760);
        }
    }

    /* renamed from: w */
    public final void m3749w() {
        Theme42SpeedArcView theme42SpeedArcView;
        ViewGroup.LayoutParams layoutParams;
        View view = this.f7475b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_root);
        this.f7485g = viewGroup;
        AbstractC1539g1.m4207b(viewGroup);
        View findViewById = view.findViewById(com.altaysoft.t500_split.R.id.theme_42_bottom_bg);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            int i = layoutParams.height;
            if (i > 0) {
                AbstractC1539g1.m4217g(findViewById, i + 10.0f);
            } else {
                AbstractC1539g1.m4217g(findViewById, 10.0f);
            }
        }
        this.f7487h = view.findViewById(com.altaysoft.t500_split.R.id.theme_42_top_panel);
        this.f7489i = (Theme42SpeedArcView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_spd);
        this.f7491j = (Theme42RpmArcView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_rpm);
        this.f7493k = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_spd_value);
        this.f7495l = view.findViewById(com.altaysoft.t500_split.R.id.theme_42_spd_arc_badge);
        this.f7497m = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_spd_arc_value);
        this.f7499n = view.findViewById(com.altaysoft.t500_split.R.id.theme_42_rpm_arc_badge);
        this.f7501o = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_rpm_arc_value);
        this.f7503p = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_rpm_value);
        this.f7505q = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_rpm_unit);
        Theme42RpmArcView theme42RpmArcView = this.f7491j;
        if (theme42RpmArcView != null && (theme42SpeedArcView = this.f7489i) != null) {
            Theme42SpeedArcView theme42SpeedArcView2 = theme42RpmArcView.f2788k;
            C1484I c1484i = theme42RpmArcView.f2789l;
            if (theme42SpeedArcView2 != null) {
                theme42SpeedArcView2.f2809A.remove(c1484i);
            }
            theme42RpmArcView.f2788k = theme42SpeedArcView;
            theme42SpeedArcView.m1818a(c1484i);
        }
        Theme42SpeedArcView theme42SpeedArcView3 = this.f7489i;
        if (theme42SpeedArcView3 != null) {
            theme42SpeedArcView3.m1818a(this.f7516v0);
        }
        m3752z();
        m3732a();
        this.f7507r = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_gear);
        this.f7509s = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_clock);
        this.f7511t = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_out_temp);
        this.f7513u = (ImageView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_wifi);
        this.f7515v = (ImageView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_inet);
        this.f7517w = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_inst_fuel);
        this.f7519x = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_inst_fuel_sub);
        this.f7521y = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_lbl_avg_jour);
        this.f7522z = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_avg_jour);
        this.f7447A = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_avg_jour_sub);
        this.f7448B = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_avg_total);
        this.f7449C = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_fuel_liters);
        this.f7450D = (Theme42SegmentedBarView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_fuel_bar);
        this.f7451E = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_remain);
        this.f7452F = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_odo);
        this.f7453G = view.findViewById(com.altaysoft.t500_split.R.id.theme_42_odo_sub);
        this.f7454H = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_odo_sub_day);
        this.f7455I = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_odo_sub_trip);
        AbstractC1539g1.m4219h(this.f7452F, "ODO: 888888");
        AbstractC1539g1.m4227l(this.f7454H);
        AbstractC1539g1.m4227l(this.f7455I);
        AbstractC1539g1.m4202X(this.f7448B, this.f7522z, this.f7517w);
        this.f7456J = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_coolant);
        this.f7457K = (Theme42SegmentedBarView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_coolant_bar);
        Theme42SegmentedBarView theme42SegmentedBarView = this.f7450D;
        if (theme42SegmentedBarView != null) {
            theme42SegmentedBarView.f2806k = -7704536;
            theme42SegmentedBarView.f2807l = -2838432;
            theme42SegmentedBarView.f2808m = true;
            theme42SegmentedBarView.invalidate();
        }
        Theme42SegmentedBarView theme42SegmentedBarView2 = this.f7457K;
        if (theme42SegmentedBarView2 != null) {
            theme42SegmentedBarView2.f2806k = -9406336;
            theme42SegmentedBarView2.f2807l = -4669240;
            theme42SegmentedBarView2.f2808m = true;
            theme42SegmentedBarView2.invalidate();
        }
        this.f7458L = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_battery);
        this.f7459M = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_hv);
        this.f7460N = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_wheel_fl);
        this.f7461O = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_wheel_fr);
        this.f7462P = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_wheel_rl);
        this.f7463Q = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_wheel_rr);
        this.f7464R = view.findViewById(com.altaysoft.t500_split.R.id.theme_42_tires_wrap);
        this.f7465S = (ImageView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_cruise);
        this.f7466T = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_cruise_speed);
        this.f7467U = (ImageView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_lane);
        View findViewById2 = view.findViewById(com.altaysoft.t500_split.R.id.theme_42_media_wrap);
        this.f7468V = findViewById2;
        AbstractC0641i.m1886c(findViewById2);
        this.f7469W = (ImageView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_media_art);
        this.f7470X = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_media_title);
        this.f7471Y = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_media_artist);
        this.f7472Z = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_media_elapsed);
        this.f7474a0 = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_media_total);
        this.f7476b0 = (ProgressBar) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_media_bar);
        TextView textView = (TextView) view.findViewById(com.altaysoft.t500_split.R.id.theme_42_free_mem);
        Handler handler = this.f7483f;
        this.f7490i0 = new C1531e(handler, textView);
        C0043j m61g = C0043j.m61g(view, com.altaysoft.t500_split.R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f7473a);
        }
        ViewGroup viewGroup2 = this.f7485g;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this.f7514u0);
        }
        if (!this.f7496l0) {
            m3737f();
            this.f7496l0 = true;
        }
        ViewGroup viewGroup3 = this.f7485g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f);
        }
        this.f7510s0 = 0.0f;
        cfgData cfgdata = this.f7479d;
        boolean z2 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f7498m0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m3747s();
        m3736e();
        this.f7494k0 = true;
        handler.post(this.f7520x0);
        handler.post(this.f7518w0);
        this.f7490i0.m4171b();
        m3741m();
        m3744p(C0639g.m1872x().m1880u());
    }

    /* renamed from: x */
    public final void m3750x(float f2, float f3, RunnableC1476E runnableC1476E) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f7508r0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f7508r0);
        this.f7508r0.addUpdateListener(new C0174W(6, this));
        this.f7508r0.addListener(new C0181b0(this, 4, runnableC1476E));
        this.f7508r0.start();
    }

    /* renamed from: y */
    public final void m3751y(String str) {
        Context context = this.f7477c;
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.addFlags(402722816);
            intent.putExtra("caller", str);
            context.startActivity(intent, makeBasic.setLaunchBounds(new Rect(0, 0, 1920, 1080)).toBundle());
        } catch (Exception e2) {
            Toast.makeText(context, "ERROR3" + e2, 1).show();
        }
    }

    /* renamed from: z */
    public final void m3752z() {
        boolean m4195Q = AbstractC1539g1.m4195Q(this.f7479d, this.f7481e);
        Theme42SpeedArcView theme42SpeedArcView = this.f7489i;
        if (theme42SpeedArcView != null) {
            theme42SpeedArcView.setChordDecorNaviActive(m4195Q);
        }
        Theme42RpmArcView theme42RpmArcView = this.f7491j;
        if (theme42RpmArcView != null) {
            theme42RpmArcView.invalidate();
        }
    }
}
