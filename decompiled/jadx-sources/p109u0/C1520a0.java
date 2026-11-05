package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.p061ip.Theme43F1RailGuideView;
import com.altaysoft.t500_split.p061ip.Theme45BarView;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import java.util.Locale;
import p000A.AbstractC0000a;
import p000A.AbstractC0001b;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p022K.C0174W;
import p022K.C0181b0;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1372y1;
import p098q0.C1311e0;
import p106t0.EnumC1457c;
import p111v.C1592d;

/* renamed from: u0.a0 */
/* loaded from: classes.dex */
public final class C1520a0 {

    /* renamed from: A0 */
    public static final ColorMatrixColorFilter f8047A0;

    /* renamed from: A */
    public Theme45BarView f8048A;

    /* renamed from: B */
    public TextView f8049B;

    /* renamed from: C */
    public TextView f8050C;

    /* renamed from: D */
    public TextView f8051D;

    /* renamed from: E */
    public TextView f8052E;

    /* renamed from: F */
    public TextView f8053F;

    /* renamed from: G */
    public TextView f8054G;

    /* renamed from: H */
    public TextView f8055H;

    /* renamed from: I */
    public TextView f8056I;

    /* renamed from: J */
    public TextView f8057J;

    /* renamed from: K */
    public ImageView f8058K;

    /* renamed from: L */
    public ImageView f8059L;

    /* renamed from: M */
    public ImageView f8060M;

    /* renamed from: N */
    public Theme43F1RailGuideView f8061N;

    /* renamed from: O */
    public Theme43F1RailGuideView f8062O;

    /* renamed from: P */
    public TextView f8063P;

    /* renamed from: Q */
    public TextView f8064Q;

    /* renamed from: R */
    public ImageView f8065R;

    /* renamed from: S */
    public TextView f8066S;

    /* renamed from: T */
    public ImageView f8067T;

    /* renamed from: U */
    public View f8068U;

    /* renamed from: V */
    public ImageView f8069V;

    /* renamed from: W */
    public TextView f8070W;

    /* renamed from: X */
    public TextView f8071X;

    /* renamed from: Y */
    public TextView f8072Y;

    /* renamed from: Z */
    public TextView f8073Z;

    /* renamed from: a */
    public final C1537g f8074a;

    /* renamed from: a0 */
    public ProgressBar f8075a0;

    /* renamed from: b */
    public final View f8076b;

    /* renamed from: c */
    public final Context f8078c;

    /* renamed from: c0 */
    public long f8079c0;

    /* renamed from: d0 */
    public long f8081d0;

    /* renamed from: e0 */
    public boolean f8083e0;

    /* renamed from: f0 */
    public long f8085f0;

    /* renamed from: g */
    public ViewGroup f8086g;

    /* renamed from: h */
    public View f8088h;

    /* renamed from: h0 */
    public float f8089h0;

    /* renamed from: i */
    public TextView f8090i;

    /* renamed from: i0 */
    public float f8091i0;

    /* renamed from: j */
    public TextView f8092j;

    /* renamed from: j0 */
    public float f8093j0;

    /* renamed from: k */
    public Theme45BarView f8094k;

    /* renamed from: k0 */
    public long f8095k0;

    /* renamed from: l */
    public TextView f8096l;

    /* renamed from: l0 */
    public View f8097l0;

    /* renamed from: m */
    public TextView f8098m;

    /* renamed from: m0 */
    public C1531e f8099m0;

    /* renamed from: n */
    public TextView f8100n;

    /* renamed from: n0 */
    public C1525c f8101n0;

    /* renamed from: o */
    public TextView f8102o;

    /* renamed from: o0 */
    public ValueAnimator f8103o0;

    /* renamed from: p */
    public TextView f8104p;

    /* renamed from: p0 */
    public boolean f8105p0;

    /* renamed from: q */
    public TextView f8106q;

    /* renamed from: r */
    public Theme45BarView f8108r;

    /* renamed from: s */
    public TextView f8110s;

    /* renamed from: s0 */
    public float f8111s0;

    /* renamed from: t */
    public TextView f8112t;

    /* renamed from: u */
    public TextView f8114u;

    /* renamed from: u0 */
    public boolean f8115u0;

    /* renamed from: v */
    public TextView f8116v;

    /* renamed from: v0 */
    public boolean f8117v0;

    /* renamed from: w */
    public TextView f8118w;

    /* renamed from: w0 */
    public float f8119w0;

    /* renamed from: x */
    public TextView f8120x;

    /* renamed from: y */
    public TextView f8122y;

    /* renamed from: z */
    public TextView f8124z;

    /* renamed from: d */
    public final cfgData f8080d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f8082e = carData.getInstance();

    /* renamed from: f */
    public final Handler f8084f = new Handler(Looper.getMainLooper());

    /* renamed from: b0 */
    public C0636d f8077b0 = C0636d.f2994j;

    /* renamed from: g0 */
    public float f8087g0 = 1.0f;

    /* renamed from: q0 */
    public final RunnableC1511W f8107q0 = new RunnableC1511W(this, 3);

    /* renamed from: r0 */
    public boolean f8109r0 = false;

    /* renamed from: t0 */
    public boolean f8113t0 = true;

    /* renamed from: x0 */
    public int f8121x0 = 999;

    /* renamed from: y0 */
    public final RunnableC1517Z f8123y0 = new RunnableC1517Z(this, 0);

    /* renamed from: z0 */
    public final RunnableC1517Z f8125z0 = new RunnableC1517Z(this, 1);

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        f8047A0 = new ColorMatrixColorFilter(colorMatrix);
    }

    public C1520a0(C1537g c1537g, View view) {
        this.f8074a = c1537g;
        this.f8076b = view;
        this.f8078c = view.getContext();
    }

    /* renamed from: h */
    public static String m4125h(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: i */
    public static RectF m4126i(int i, int i2) {
        RectF m4206a0 = AbstractC1539g1.m4206a0(AbstractC1539g1.m4238t(), i, i2);
        if (m4206a0.width() > 0.0f && m4206a0.height() > 0.0f) {
            float f2 = i2 - 20.0f;
            m4206a0.set(m4206a0.left, f2 - Math.max(0.0f, m4206a0.height() - 30.0f), m4206a0.right, f2);
        }
        return m4206a0;
    }

    /* renamed from: u */
    public static void m4127u(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: v */
    public static void m4128v(View view, float f2) {
        if (view == null) {
            return;
        }
        view.setVisibility(f2 > 0.01f ? 0 : 4);
        view.setAlpha(f2);
    }

    /* renamed from: x */
    public static void m4129x(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: A */
    public final void m4130A(float f2, float f3, RunnableC1511W runnableC1511W) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f8103o0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f8103o0);
        this.f8103o0.addUpdateListener(new C0174W(9, this));
        this.f8103o0.addListener(new C0181b0(this, 7, runnableC1511W));
        this.f8103o0.start();
    }

    /* renamed from: B */
    public final void m4131B(String str) {
        Context context = this.f8078c;
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

    /* renamed from: C */
    public final void m4132C() {
        this.f8084f.removeCallbacks(this.f8107q0);
        ValueAnimator valueAnimator = this.f8103o0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8103o0 = null;
        }
        if (!this.f8105p0 && AbstractC1372y1.m3272C()) {
            m4150s();
            return;
        }
        if (!this.f8105p0) {
            this.f8105p0 = true;
            AbstractC1372y1.m3287R(true, true);
            this.f8111s0 = 0.0f;
            m4133D();
            m4130A(0.0f, 1.0f, null);
            return;
        }
        float f2 = this.f8111s0;
        if (f2 > 0.0f) {
            m4130A(f2, 0.0f, new RunnableC1511W(this, 6));
            return;
        }
        this.f8105p0 = false;
        AbstractC1372y1.m3287R(false, true);
        m4133D();
    }

    /* renamed from: D */
    public final void m4133D() {
        ViewGroup viewGroup = this.f8086g;
        if (viewGroup == null || this.f8101n0 == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8086g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8086g.post(new RunnableC1511W(this, 0));
            return;
        }
        float f2 = this.f8078c.getResources().getDisplayMetrics().density;
        float f3 = f2 * 14.0f;
        this.f8101n0.m4160b();
        RectF m4126i = m4126i(width, height);
        if (m4126i.width() <= 0.0f || m4126i.height() <= 0.0f) {
            ViewGroup viewGroup2 = this.f8086g;
            if (viewGroup2 != null) {
                viewGroup2.getOverlay().clear();
            }
        } else {
            this.f8101n0.m4159a(m4126i.left, m4126i.top, m4126i.right, m4126i.bottom, f3, 0.0f);
            ViewGroup viewGroup3 = this.f8086g;
            if (viewGroup3 != null) {
                viewGroup3.getOverlay().clear();
            }
        }
        if (this.f8105p0 || this.f8111s0 > 0.0f) {
            AbstractC1539g1.m4205a(this.f8101n0, width, height, f2, this.f8111s0, 0.0f);
        }
        boolean z2 = this.f8105p0;
        if (!z2 && this.f8111s0 <= 0.0f) {
            m4152w(1.0f);
        } else if (!z2 || this.f8111s0 < 1.0f) {
            m4152w(z2 ? 1.0f - this.f8111s0 : this.f8111s0);
        } else {
            m4152w(0.0f);
        }
        this.f8086g.invalidate();
    }

    /* renamed from: a */
    public final void m4134a(long j2) {
        boolean z2 = this.f8081d0 > 0;
        ProgressBar progressBar = this.f8075a0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8075a0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f8081d0)));
            }
        }
        TextView textView = this.f8072Y;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8072Y.setText(m4125h(j2));
            }
        }
        TextView textView2 = this.f8073Z;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8073Z.setText(m4125h(this.f8081d0));
            }
        }
    }

    /* renamed from: b */
    public final void m4135b() {
        C0636d c0636d;
        if (this.f8068U == null) {
            return;
        }
        this.f8068U.setVisibility(this.f8080d.f2585W2 && (c0636d = this.f8077b0) != null && c0636d.m1851a() && (this.f8087g0 > 0.01f ? 1 : (this.f8087g0 == 0.01f ? 0 : -1)) > 0 ? 0 : 8);
        this.f8068U.setAlpha(this.f8087g0);
    }

    /* renamed from: c */
    public final void m4136c() {
        ViewGroup viewGroup;
        if (this.f8097l0 == null || (viewGroup = this.f8086g) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8086g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8086g.post(new RunnableC1511W(this, 4));
            return;
        }
        if (this.f8097l0.getLayoutParams() instanceof C1592d) {
            RectF m4126i = m4126i(width, height);
            C1592d c1592d = (C1592d) this.f8097l0.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m4126i.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m4126i.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m4126i.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m4126i.top);
            this.f8097l0.setLayoutParams(c1592d);
            this.f8076b.post(new RunnableC1511W(this, 5));
        }
    }

    /* renamed from: d */
    public final void m4137d() {
        if (this.f8086g == null) {
            return;
        }
        C1525c c1525c = this.f8101n0;
        Context context = this.f8078c;
        if (c1525c == null) {
            C1525c c1525c2 = new C1525c(-16777216);
            this.f8101n0 = c1525c2;
            c1525c2.m4164f(AbstractC0001b.m3a(context, R.color.ip_theme_45_border));
        }
        this.f8101n0.m4163e(AbstractC0000a.m1b(context, R.drawable.ip_theme_45_bg));
        this.f8086g.setLayerType(1, null);
        this.f8086g.setBackground(this.f8101n0);
        m4136c();
        m4133D();
        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, this.f8088h, AbstractC1539g1.m4230m0(this.f8080d, this.f8082e));
    }

    /* renamed from: e */
    public final void m4138e() {
        ViewGroup viewGroup = this.f8086g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f8113t0);
        if (this.f8080d.f2537K2 && this.f8113t0) {
            this.f8086g.setVisibility(0);
            m4142k(this.f8082e.m1745e());
        } else {
            m4150s();
            this.f8086g.setVisibility(4);
            ImageView imageView = this.f8065R;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            TextView textView = this.f8066S;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ImageView imageView2 = this.f8067T;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
        }
        m4133D();
    }

    /* renamed from: f */
    public final void m4139f() {
        ViewGroup viewGroup;
        if (this.f8062O == null || (viewGroup = this.f8086g) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        if (width <= 0) {
            this.f8086g.post(new RunnableC1511W(this, 2));
            return;
        }
        this.f8062O.setPivotX(((width / 2.0f) - r1.getLeft()) - this.f8062O.getTranslationX());
        this.f8062O.setScaleX(-1.0f);
    }

    /* renamed from: g */
    public final void m4140g() {
        final RunnableC1511W runnableC1511W = new RunnableC1511W(this, 1);
        final int i = 0;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        };
        carData cardata = this.f8082e;
        C1537g c1537g = this.f8074a;
        cardata.m1742c0(c1537g, interfaceC0561z);
        final int i2 = 1;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i3 = 2;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i4 = 3;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i5 = 5;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i6 = 6;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i7 = 7;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i8 = 8;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i9 = 9;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i10 = 4;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i11 = 10;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i12 = 11;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i13 = 12;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i14 = 13;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i15 = 14;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i16 = 15;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i17 = 16;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.Y
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1511W.run();
                        break;
                    case 1:
                        runnableC1511W.run();
                        break;
                    case 2:
                        runnableC1511W.run();
                        break;
                    case 3:
                        runnableC1511W.run();
                        break;
                    case 4:
                        runnableC1511W.run();
                        break;
                    case 5:
                        runnableC1511W.run();
                        break;
                    case 6:
                        runnableC1511W.run();
                        break;
                    case 7:
                        runnableC1511W.run();
                        break;
                    case 8:
                        runnableC1511W.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1511W.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1511W.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1511W.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1511W.run();
                        break;
                    case 13:
                        runnableC1511W.run();
                        break;
                    case 14:
                        runnableC1511W.run();
                        break;
                    case 15:
                        runnableC1511W.run();
                        break;
                    default:
                        runnableC1511W.run();
                        break;
                }
            }
        });
        final int i18 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i18) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i19 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i19) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i20 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i20) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i21) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i22) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i23) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f8078c);
        final int i24 = 6;
        cardata.m1754i0(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i24) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 7;
        cardata.m1750g0(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i25) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i26 = 8;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i26) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 9;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i27) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 10;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i28) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 11;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i29) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 12;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i30) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 13;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i31) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 14;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i32) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 15;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.X

            /* renamed from: b */
            public final /* synthetic */ C1520a0 f7975b;

            {
                this.f7975b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i33) {
                    case 0:
                        this.f7975b.m4146o();
                        break;
                    case 1:
                        this.f7975b.m4145n();
                        break;
                    case 2:
                        this.f7975b.m4145n();
                        break;
                    case 3:
                        this.f7975b.m4145n();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1520a0 c1520a0 = this.f7975b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1520a0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1520a0.f8121x0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1520a0.f8078c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1520a0.f8080d;
                            if (cfgdata.f2537K2) {
                                c1520a0.f8119w0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1520a0.f8121x0 == -1 && intValue > -1) {
                            c1520a0.f8119w0 = 0.0f;
                            ViewGroup viewGroup2 = c1520a0.f8086g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1520a0.f8086g.setAlpha(1.0f);
                            }
                            c1520a0.m4131B("ip");
                        }
                        c1520a0.f8121x0 = intValue;
                        c1520a0.m4143l();
                        break;
                    case 5:
                        this.f7975b.m4143l();
                        break;
                    case 6:
                        C1520a0 c1520a02 = this.f7975b;
                        c1520a02.m4149r();
                        c1520a02.m4148q();
                        break;
                    case 7:
                        this.f7975b.m4147p();
                        break;
                    case 8:
                        C1520a0 c1520a03 = this.f7975b;
                        Integer num2 = (Integer) obj;
                        c1520a03.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1520a03.f8078c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1520a03.f8109r0 || !c1520a03.f8105p0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1520a03.f8082e)) {
                                                                    cfgData cfgdata2 = c1520a03.f8080d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1520a03.f8082e.m1760l0(z2);
                                                                    c1520a03.f8080d.m1795o(c1520a03.f8078c);
                                                                    Context context2 = c1520a03.f8078c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1520a03.f8080d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1520a03.f8080d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1520a03.f8078c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1520a03.m4131B("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1520a03.f8084f;
                                                                RunnableC1511W runnableC1511W2 = c1520a03.f8107q0;
                                                                handler.removeCallbacks(runnableC1511W2);
                                                                handler.postDelayed(runnableC1511W2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1520a03.f8105p0) {
                                                        c1520a03.f8109r0 = true;
                                                        ViewGroup viewGroup3 = c1520a03.f8086g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1520a03.f8105p0 && ((valueAnimator = c1520a03.f8103o0) == null || !valueAnimator.isRunning())) {
                                                                c1520a03.m4132C();
                                                            }
                                                            Handler handler2 = c1520a03.f8084f;
                                                            RunnableC1511W runnableC1511W3 = c1520a03.f8107q0;
                                                            handler2.removeCallbacks(runnableC1511W3);
                                                            handler2.postDelayed(runnableC1511W3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1520a03.f8109r0) {
                                                        Handler handler3 = c1520a03.f8084f;
                                                        RunnableC1511W runnableC1511W4 = c1520a03.f8107q0;
                                                        handler3.removeCallbacks(runnableC1511W4);
                                                        handler3.postDelayed(runnableC1511W4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1520a03.f8113t0;
                                                    c1520a03.f8113t0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1520a03.m4138e();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1520a03.f8078c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1520a03.f8080d.f2672o3) {
                                                    Context context3 = c1520a03.f8078c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1520a03.m4131B("ip_rest");
                                                    break;
                                                } else {
                                                    c1520a03.m4131B("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1520a03.f8082e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1520a03.f8080d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1520a03.f8078c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1520a03.f8078c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1520a03.f8086g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1520a03.f8103o0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1520a03.f8109r0 = false;
                                        c1520a03.m4132C();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1520a03.f8078c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1520a0 c1520a04 = this.f7975b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1520a04.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1520a04.m4142k(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1520a0 c1520a05 = this.f7975b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1520a05.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1520a05.f8066S;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1520a05.m4142k(c1520a05.f8082e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1520a0 c1520a06 = this.f7975b;
                        c1520a06.m4133D();
                        c1520a06.m4135b();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1520a0 c1520a07 = this.f7975b;
                        c1520a07.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1520a07.m4150s();
                        }
                        c1520a07.m4133D();
                        c1520a07.m4135b();
                        break;
                    case 13:
                        C1520a0 c1520a08 = this.f7975b;
                        c1520a08.m4133D();
                        c1520a08.m4135b();
                        break;
                    case 14:
                        C1520a0 c1520a09 = this.f7975b;
                        AbstractC1539g1.m4225k(c1520a09.f8078c);
                        c1520a09.m4133D();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_45_top_bar, c1520a09.f8088h, AbstractC1539g1.m4230m0(c1520a09.f8080d, c1520a09.f8082e));
                        break;
                    default:
                        this.f7975b.m4144m((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: j */
    public final void m4141j() {
        float max;
        float max2;
        float max3;
        AbstractC1539g1.m4228l0(this.f8086g, !this.f8113t0);
        cfgData cfgdata = this.f8080d;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f8082e;
        if (z2) {
            float f2 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            max = cfgdata.m1787f(m1775u, cardata.m1776v(), f2);
            Theme45BarView theme45BarView = this.f8108r;
            if (theme45BarView != null) {
                theme45BarView.setProgress(Math.round(m1775u * f2));
            }
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            Theme45BarView theme45BarView2 = this.f8108r;
            if (theme45BarView2 != null) {
                theme45BarView2.setProgress(Math.round(max));
            }
        }
        EnumC1457c enumC1457c2 = cfgdata.f2543M0;
        if (enumC1457c2.f7147f) {
            max2 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c2 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
        } else {
            max2 = Math.max(0.0f, cardata.m1774t());
        }
        int i = -1513240;
        int i2 = max2 < 15.0f ? -65536 : max2 < 30.0f ? -256 : -1513240;
        Theme45BarView theme45BarView3 = this.f8108r;
        if (theme45BarView3 != null) {
            int i3 = -12961222;
            if (max >= 15.0f) {
                if (max < 35.0f) {
                    i3 = AbstractC1539g1.m4237s((max - 15.0f) / 20.0f, -12961222, -9934744);
                } else {
                    i3 = -3092272;
                    if (max < 55.0f) {
                        i3 = AbstractC1539g1.m4237s((max - 35.0f) / 20.0f, -9934744, -3092272);
                    }
                }
            }
            theme45BarView3.setBarProgressColor(i3);
        }
        TextView textView = this.f8104p;
        if (textView != null) {
            textView.setText(String.format(Locale.ENGLISH, "%.0f%%", Float.valueOf(max)));
            this.f8104p.setTextColor(i2);
        }
        TextView textView2 = this.f8106q;
        if (textView2 != null) {
            Locale locale = Locale.ENGLISH;
            EnumC1457c enumC1457c3 = cfgdata.f2543M0;
            if (enumC1457c3.f7147f) {
                max3 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c3 != EnumC1457c.T500_BT_NEW ? 1.0f : 10.0f);
            } else {
                max3 = Math.max(0.0f, cardata.m1774t()) * cfgdata.m1789h();
            }
            textView2.setText(String.format(locale, "%.0f L", Float.valueOf(max3)));
            this.f8106q.setTextColor(i2);
        }
        float m1743d = cardata.m1743d();
        Theme45BarView theme45BarView4 = this.f8048A;
        if (theme45BarView4 != null) {
            theme45BarView4.setProgress(Math.round(m1743d < 40.0f ? 0 : m1743d > 130.0f ? 100 : Math.round(((m1743d - 40.0f) / 90.0f) * 100.0f)));
            this.f8048A.setBarProgressColor(m1743d >= 40.0f ? m1743d > 112.0f ? -3090208 : m1743d > 107.0f ? AbstractC1539g1.m4237s((m1743d - 107.0f) / 5.0f, -7825240, -3090208) : m1743d < 75.0f ? AbstractC1539g1.m4237s((m1743d - 40.0f) / 35.0f, -14143432, -7825240) : -7825240 : -14143432);
        }
        TextView textView3 = this.f8124z;
        if (textView3 != null) {
            if (m1743d < -90.0f) {
                textView3.setText("-- °C");
                this.f8124z.setTextColor(-1513240);
            } else {
                textView3.setText(String.format(Locale.ENGLISH, "%.0f °C", Float.valueOf(m1743d)));
                TextView textView4 = this.f8124z;
                if (m1743d < 40.0f) {
                    i = -16776961;
                } else if (m1743d > 112.0f) {
                    i = -65536;
                } else if (m1743d > 107.0f) {
                    i = -256;
                }
                textView4.setTextColor(i);
            }
        }
        TextView textView5 = this.f8110s;
        if (textView5 != null) {
            textView5.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(cardata.m1777w())));
            this.f8110s.setTextColor(-1);
        }
        float m1765o = cardata.m1765o();
        float min = m1765o > 0.0f ? Math.min(m1765o, 29.9f) : 0.0f;
        if (Math.abs(min - this.f8091i0) > 0.001f) {
            this.f8093j0 = this.f8089h0;
            this.f8091i0 = min;
            this.f8095k0 = SystemClock.elapsedRealtime();
        }
        m4147p();
        m4148q();
        m4149r();
        m4127u(this.f8098m, cardata.m1739b());
        m4127u(this.f8102o, cardata.m1737a());
        TextView textView6 = this.f8049B;
        if (textView6 != null) {
            textView6.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(cardata.m1741c())));
        }
        TextView textView7 = this.f8050C;
        if (textView7 != null) {
            boolean z3 = cfgdata.f2543M0.f7149h;
            textView7.setVisibility(z3 ? 0 : 4);
            if (z3) {
                TextView textView8 = this.f8050C;
                Locale locale2 = Locale.ENGLISH;
                Float valueOf = Float.valueOf(cardata.m1761m());
                EnumC1457c enumC1457c4 = cfgdata.f2543M0;
                textView8.setText(String.format(locale2, "%.1f%s", valueOf, (enumC1457c4 == EnumC1457c.T500_Urban || enumC1457c4 == EnumC1457c.T400 || enumC1457c4 == EnumC1457c.T700_100 || enumC1457c4 == EnumC1457c.T700) ? "%" : "V"));
            }
        }
        TextView textView9 = this.f8114u;
        if (textView9 != null) {
            textView9.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1771r())).replace(",", "."));
        }
        TextView textView10 = this.f8118w;
        if (textView10 != null) {
            textView10.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(",", "."));
        }
        TextView textView11 = this.f8122y;
        if (textView11 != null) {
            textView11.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1767p())).replace(",", "."));
        }
        m4153y(this.f8051D, cardata.m1715C());
        m4153y(this.f8052E, cardata.m1716D());
        m4153y(this.f8053F, cardata.m1717E());
        m4153y(this.f8054G, cardata.m1718F());
        m4146o();
        m4145n();
        m4143l();
        TextView textView12 = this.f8056I;
        Context context = this.f8078c;
        if (textView12 != null) {
            textView12.setText(AbstractC1372y1.m3307m(context));
        }
        boolean z4 = cfgdata.f2569S2;
        m4129x(this.f8112t, z4);
        m4129x(this.f8114u, z4);
        boolean z5 = cfgdata.f2577U2;
        boolean z6 = cfgdata.f2573T2;
        int i4 = (z5 || z6) ? 8 : 4;
        TextView textView13 = this.f8116v;
        if (textView13 != null) {
            textView13.setVisibility(z5 ? 0 : i4);
        }
        TextView textView14 = this.f8118w;
        if (textView14 != null) {
            textView14.setVisibility(z5 ? 0 : i4);
        }
        TextView textView15 = this.f8120x;
        if (textView15 != null) {
            textView15.setVisibility(z6 ? 0 : i4);
        }
        TextView textView16 = this.f8122y;
        if (textView16 != null) {
            if (z6) {
                i4 = 0;
            }
            textView16.setVisibility(i4);
        }
        TextView textView17 = this.f8120x;
        if (textView17 != null) {
            ViewGroup.LayoutParams layoutParams = textView17.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int round = z5 ? Math.round(context.getResources().getDisplayMetrics().density * 12.0f) : 0;
                if (marginLayoutParams.getMarginStart() != round) {
                    marginLayoutParams.setMarginStart(round);
                    this.f8120x.setLayoutParams(marginLayoutParams);
                }
            }
        }
        boolean z7 = cfgdata.useJourneyFuel;
        m4129x(this.f8096l, z7);
        m4129x(this.f8098m, z7);
        m4129x(this.f8100n, z7);
    }

    /* renamed from: k */
    public final void m4142k(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f8080d;
        if (!cfgdata.f2537K2 || !cfgdata.f2589X2 || !this.f8113t0) {
            ImageView imageView2 = this.f8065R;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView2 = this.f8066S;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            ImageView imageView3 = this.f8067T;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
                return;
            }
            return;
        }
        byte b2 = (byte) (i & 15);
        byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
        if (b2 == 1) {
            ImageView imageView4 = this.f8065R;
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            TextView textView3 = this.f8066S;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        } else if (b2 == 2) {
            ImageView imageView5 = this.f8065R;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                this.f8065R.setColorFilter(-7829368);
            }
            TextView textView4 = this.f8066S;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (b2 == 3) {
            ImageView imageView6 = this.f8065R;
            if (imageView6 != null) {
                imageView6.setVisibility(0);
                this.f8065R.setColorFilter(-16711936);
            }
            TextView textView5 = this.f8066S;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
        if (this.f8082e.m1747f() < 20 && (textView = this.f8066S) != null) {
            textView.setVisibility(4);
        }
        if (b3 == 1) {
            ImageView imageView7 = this.f8067T;
            if (imageView7 != null) {
                imageView7.setVisibility(4);
            }
        } else if (b3 == 2) {
            ImageView imageView8 = this.f8067T;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
                this.f8067T.setColorFilter(-7829368);
            }
        } else if (b3 == 3 && (imageView = this.f8067T) != null) {
            imageView.setVisibility(0);
            this.f8067T.setColorFilter(-16711936);
        }
        if (this.f8086g == null) {
            return;
        }
        TextView textView6 = this.f8066S;
        if (textView6 != null) {
            textView6.bringToFront();
        }
        ImageView imageView9 = this.f8065R;
        if (imageView9 != null) {
            imageView9.bringToFront();
        }
        ImageView imageView10 = this.f8067T;
        if (imageView10 != null) {
            imageView10.bringToFront();
        }
        this.f8086g.invalidate();
    }

    /* renamed from: l */
    public final void m4143l() {
        TextView textView = this.f8055H;
        if (textView == null) {
            return;
        }
        if (!this.f8080d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f8082e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f8055H.setVisibility(4);
            return;
        }
        this.f8055H.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f8055H, -7829368, -1513240), 0, replace.length(), 33);
        this.f8055H.setText(spannableString);
    }

    /* renamed from: m */
    public final void m4144m(C0636d c0636d) {
        this.f8077b0 = c0636d != null ? c0636d : C0636d.f2994j;
        View view = this.f8068U;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        TextView textView = this.f8070W;
        if (textView != null) {
            String str = this.f8077b0.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f8071X;
        if (textView2 != null) {
            String str2 = this.f8077b0.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            TextView textView3 = this.f8071X;
            String str3 = this.f8077b0.f2997c;
            textView3.setVisibility((str3 == null || str3.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f8069V;
        if (imageView != null) {
            Bitmap bitmap = this.f8077b0.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f8069V.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f8069V.setVisibility(8);
            }
        }
        C0636d c0636d2 = this.f8077b0;
        this.f8081d0 = c0636d2.f3002h;
        this.f8079c0 = c0636d2.f3001g;
        this.f8083e0 = c0636d2.f3000f;
        this.f8085f0 = SystemClock.elapsedRealtime();
        m4134a(this.f8079c0);
        m4135b();
    }

    /* renamed from: n */
    public final void m4145n() {
        ImageView imageView = this.f8059L;
        carData cardata = this.f8082e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f8060M != null) {
            this.f8060M.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f8060M.setColorFilter(cardata.m1713A() ? -256 : -1513240);
        }
    }

    /* renamed from: o */
    public final void m4146o() {
        if (this.f8057J == null) {
            return;
        }
        float m1773s = this.f8082e.m1773s();
        if (m1773s < -90.0f) {
            this.f8057J.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        spannableString.setSpan(AbstractC0062j.m155i(this.f8057J, -7829368, -1513240), 0, replace.length(), 33);
        this.f8057J.setText(spannableString);
    }

    /* renamed from: p */
    public final void m4147p() {
        Theme43F1RailGuideView theme43F1RailGuideView = this.f8062O;
        cfgData cfgdata = this.f8080d;
        carData cardata = this.f8082e;
        if (theme43F1RailGuideView != null) {
            float m1779y = cardata.m1779y() / 1000.0f;
            if (m1779y < 0.0f) {
                m1779y = 0.0f;
            } else if (m1779y > 8.5f) {
                m1779y = 8.5f;
            }
            this.f8062O.setValue(m1779y);
            this.f8062O.setFillColor(m1779y > cfgdata.f2576U1 ? -2208966 : m1779y > cfgdata.f2572T1 ? -2051510 : -966895278);
            this.f8062O.setPuckText(AbstractC1256E0.m2986A(m1779y));
        }
        if (this.f8064Q == null) {
            return;
        }
        float max = Math.max(0.0f, cardata.m1779y() / 1000.0f);
        this.f8064Q.setTextColor(max > cfgdata.f2576U1 ? -65536 : max > cfgdata.f2572T1 ? -256 : -1513240);
        this.f8064Q.setText(AbstractC1256E0.m2986A(max));
    }

    /* renamed from: q */
    public final void m4148q() {
        if (this.f8061N == null) {
            return;
        }
        float m1780z = this.f8082e.m1780z();
        float f2 = 0.0f;
        cfgData cfgdata = this.f8080d;
        float f3 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        if (f3 >= 0.0f) {
            f2 = 230.0f;
            if (f3 <= 230.0f) {
                f2 = f3;
            }
        }
        this.f8061N.setValue(f2);
        this.f8061N.setFillColor(f2 > cfgdata.f2568S1 ? -2208966 : f2 > cfgdata.f2564R1 ? -2051510 : -967484572);
        this.f8061N.setPuckText(String.valueOf(Math.round(f2)));
    }

    /* renamed from: r */
    public final void m4149r() {
        if (this.f8063P == null) {
            return;
        }
        float m1780z = this.f8082e.m1780z();
        cfgData cfgdata = this.f8080d;
        float f2 = m1780z >= 0.0f ? cfgdata.f2702u3 * m1780z : 0.0f;
        this.f8063P.setTextColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : -1513240);
        this.f8063P.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)));
    }

    /* renamed from: s */
    public final void m4150s() {
        this.f8084f.removeCallbacks(this.f8107q0);
        ValueAnimator valueAnimator = this.f8103o0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8103o0 = null;
        }
        this.f8105p0 = false;
        this.f8111s0 = 0.0f;
        AbstractC1372y1.m3287R(false, false);
        m4133D();
    }

    /* renamed from: t */
    public final void m4151t() {
        ViewGroup viewGroup;
        if (!this.f8117v0) {
            m4140g();
            this.f8117v0 = true;
        }
        C1531e c1531e = this.f8099m0;
        if (c1531e != null) {
            c1531e.m4170a();
        }
        if (this.f8119w0 <= 0.0f && (viewGroup = this.f8086g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        cfgData cfgdata = this.f8080d;
        boolean z2 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f8113t0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4137d();
        m4138e();
        m4142k(this.f8082e.m1745e());
        m4141j();
        m4144m(C0639g.m1872x().m1880u());
    }

    /* renamed from: w */
    public final void m4152w(float f2) {
        float f3 = this.f8080d.f2581V2 ? f2 : 0.0f;
        m4128v(this.f8058K, f3);
        m4128v(this.f8051D, f3);
        m4128v(this.f8052E, f3);
        m4128v(this.f8053F, f3);
        m4128v(this.f8054G, f3);
        this.f8087g0 = f2;
        m4135b();
    }

    /* renamed from: y */
    public final void m4153y(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        if (f2 == -99.0f || f2 == 3.5f) {
            textView.setText("--");
            textView.setTextColor(-16776961);
        } else {
            textView.setText(String.format(Locale.ENGLISH, f2 > 10.0f ? "%.0f" : "%.1f", Float.valueOf(f2)).replace(",", "."));
            float f3 = this.f8080d.f2580V1;
            textView.setTextColor(f2 < 0.95f * f3 ? -65536 : f2 < f3 ? -256 : -1513240);
        }
    }

    /* renamed from: z */
    public final void m4154z() {
        View view = this.f8076b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_45_root);
        this.f8086g = viewGroup;
        AbstractC1539g1.m4207b(viewGroup);
        Context context = this.f8078c;
        float dimension = context.getResources().getDimension(R.dimen.theme_45_bottom_panel_height) + 10.0f;
        AbstractC1539g1.m4217g(view.findViewById(R.id.theme_45_bottom_panel_left), dimension);
        AbstractC1539g1.m4217g(view.findViewById(R.id.theme_45_bottom_panel_right), dimension);
        this.f8088h = view.findViewById(R.id.theme_45_top_panel);
        this.f8090i = (TextView) view.findViewById(R.id.theme_45_inst_fuel);
        this.f8092j = (TextView) view.findViewById(R.id.theme_45_inst_fuel_sub);
        Theme45BarView theme45BarView = (Theme45BarView) view.findViewById(R.id.theme_45_inst_fuel_bar);
        this.f8094k = theme45BarView;
        if (theme45BarView != null) {
            theme45BarView.setMax(299);
        }
        this.f8096l = (TextView) view.findViewById(R.id.theme_45_lbl_avg_jour);
        this.f8098m = (TextView) view.findViewById(R.id.theme_45_avg_jour);
        this.f8100n = (TextView) view.findViewById(R.id.theme_45_avg_jour_sub);
        this.f8102o = (TextView) view.findViewById(R.id.theme_45_avg_total);
        this.f8104p = (TextView) view.findViewById(R.id.theme_45_fuel);
        this.f8106q = (TextView) view.findViewById(R.id.theme_45_fuel_liters);
        this.f8108r = (Theme45BarView) view.findViewById(R.id.theme_45_fuel_bar);
        this.f8110s = (TextView) view.findViewById(R.id.theme_45_remain);
        this.f8112t = (TextView) view.findViewById(R.id.theme_45_odo_label);
        this.f8114u = (TextView) view.findViewById(R.id.theme_45_odo_total);
        this.f8116v = (TextView) view.findViewById(R.id.theme_45_odo_day_label);
        this.f8118w = (TextView) view.findViewById(R.id.theme_45_odo_day);
        this.f8120x = (TextView) view.findViewById(R.id.theme_45_odo_trip_label);
        TextView textView = (TextView) view.findViewById(R.id.theme_45_odo_trip);
        this.f8122y = textView;
        TextView textView2 = this.f8114u;
        TextView textView3 = this.f8118w;
        AbstractC1539g1.m4219h(textView2, "888888");
        AbstractC1539g1.m4227l(textView3);
        AbstractC1539g1.m4219h(textView, "888888");
        AbstractC1539g1.m4219h(this.f8102o, "88.8 L");
        AbstractC1539g1.m4227l(this.f8098m);
        AbstractC1539g1.m4229m(this.f8090i, "88.8 L");
        AbstractC1539g1.m4227l(this.f8110s);
        this.f8124z = (TextView) view.findViewById(R.id.theme_45_coolant);
        this.f8048A = (Theme45BarView) view.findViewById(R.id.theme_45_coolant_bar);
        this.f8049B = (TextView) view.findViewById(R.id.theme_45_battery);
        this.f8050C = (TextView) view.findViewById(R.id.theme_45_hv);
        this.f8051D = (TextView) view.findViewById(R.id.theme_45_wheel_fl);
        this.f8052E = (TextView) view.findViewById(R.id.theme_45_wheel_fr);
        this.f8053F = (TextView) view.findViewById(R.id.theme_45_wheel_rl);
        this.f8054G = (TextView) view.findViewById(R.id.theme_45_wheel_rr);
        this.f8058K = (ImageView) view.findViewById(R.id.theme_45_tires_car);
        float dimension2 = context.getResources().getDimension(R.dimen.theme_45_wheel_front_shift_down);
        float dimension3 = context.getResources().getDimension(R.dimen.theme_45_wheel_rear_shift_up);
        ImageView imageView = this.f8058K;
        if (imageView != null) {
            imageView.setTranslationX(-0.0f);
            this.f8058K.setTranslationY(-0.0f);
        }
        TextView textView4 = this.f8051D;
        float f2 = dimension2 + (-0.0f);
        if (textView4 != null) {
            textView4.setTranslationX(-0.0f);
            textView4.setTranslationY(f2);
        }
        TextView textView5 = this.f8052E;
        if (textView5 != null) {
            textView5.setTranslationX(-0.0f);
            textView5.setTranslationY(f2);
        }
        TextView textView6 = this.f8053F;
        float f3 = dimension3 + (-0.0f);
        if (textView6 != null) {
            textView6.setTranslationX(-0.0f);
            textView6.setTranslationY(f3);
        }
        TextView textView7 = this.f8054G;
        if (textView7 != null) {
            textView7.setTranslationX(-0.0f);
            textView7.setTranslationY(f3);
        }
        this.f8055H = (TextView) view.findViewById(R.id.theme_45_gear);
        this.f8056I = (TextView) view.findViewById(R.id.theme_45_clock);
        this.f8057J = (TextView) view.findViewById(R.id.theme_45_out_temp);
        this.f8059L = (ImageView) view.findViewById(R.id.theme_45_wifi);
        this.f8060M = (ImageView) view.findViewById(R.id.theme_45_inet);
        this.f8061N = (Theme43F1RailGuideView) view.findViewById(R.id.theme_45_spd_rail);
        Theme43F1RailGuideView theme43F1RailGuideView = (Theme43F1RailGuideView) view.findViewById(R.id.theme_45_rpm_rail);
        this.f8062O = theme43F1RailGuideView;
        if (theme43F1RailGuideView != null) {
            theme43F1RailGuideView.setLabelsMirrorCompensated(true);
            m4139f();
        }
        this.f8063P = (TextView) view.findViewById(R.id.theme_45_spd_value);
        this.f8064Q = (TextView) view.findViewById(R.id.theme_45_rpm_value);
        this.f8065R = (ImageView) view.findViewById(R.id.theme_45_cruise);
        this.f8066S = (TextView) view.findViewById(R.id.theme_45_cruise_speed);
        this.f8067T = (ImageView) view.findViewById(R.id.theme_45_lane);
        View findViewById = view.findViewById(R.id.theme_45_media_wrap);
        this.f8068U = findViewById;
        AbstractC0641i.m1886c(findViewById);
        this.f8069V = (ImageView) view.findViewById(R.id.theme_45_media_art);
        this.f8070W = (TextView) view.findViewById(R.id.theme_45_media_title);
        this.f8071X = (TextView) view.findViewById(R.id.theme_45_media_artist);
        this.f8072Y = (TextView) view.findViewById(R.id.theme_45_media_elapsed);
        this.f8073Z = (TextView) view.findViewById(R.id.theme_45_media_total);
        this.f8075a0 = (ProgressBar) view.findViewById(R.id.theme_45_media_bar);
        ImageView imageView2 = this.f8069V;
        if (imageView2 != null) {
            imageView2.setColorFilter(f8047A0);
        }
        this.f8097l0 = view.findViewById(R.id.theme_45_navi_hole);
        TextView textView8 = (TextView) view.findViewById(R.id.theme_45_free_mem);
        Handler handler = this.f8084f;
        this.f8099m0 = new C1531e(handler, textView8);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f8074a);
        }
        m4137d();
        if (!this.f8117v0) {
            m4140g();
            this.f8117v0 = true;
        }
        ViewGroup viewGroup2 = this.f8086g;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f);
        }
        this.f8119w0 = 0.0f;
        cfgData cfgdata = this.f8080d;
        boolean z2 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f8113t0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4138e();
        this.f8115u0 = true;
        handler.post(this.f8125z0);
        handler.post(this.f8123y0);
        this.f8099m0.m4171b();
        carData cardata = this.f8082e;
        m4142k(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView9 = this.f8066S;
        if (textView9 != null) {
            textView9.setText(String.valueOf(m1747f));
        }
        m4142k(cardata.m1745e());
        m4133D();
        m4141j();
        m4144m(C0639g.m1872x().m1880u());
    }
}
