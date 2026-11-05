package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
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
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.File;
import java.util.Locale;
import p001A0.RunnableC0018l;
import p001A0.RunnableC0029w;
import p006C.AbstractC0062j;
import p017H0.RunnableC0123b;
import p022K.C0174W;
import p022K.C0181b0;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1261H;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1372y1;
import p098q0.C1311e0;
import p106t0.EnumC1455a;
import p106t0.EnumC1456b;
import p106t0.EnumC1457c;
import p111v.C1592d;

/* renamed from: u0.D */
/* loaded from: classes.dex */
public final class C1474D {

    /* renamed from: f1 */
    public static final int f7183f1 = Color.rgb(210, 240, 240);

    /* renamed from: g1 */
    public static final int f7184g1 = Color.rgb(67, 160, 71);

    /* renamed from: h1 */
    public static final int f7185h1 = R.drawable.theme_41_spd;

    /* renamed from: i1 */
    public static final int f7186i1 = R.drawable.theme_41_rpm;

    /* renamed from: A */
    public TextView f7187A;

    /* renamed from: A0 */
    public C1472C f7188A0;

    /* renamed from: B */
    public TextView f7189B;

    /* renamed from: B0 */
    public C1472C f7190B0;

    /* renamed from: C */
    public TextView f7191C;

    /* renamed from: C0 */
    public boolean f7192C0;

    /* renamed from: D */
    public TextView f7193D;

    /* renamed from: D0 */
    public boolean f7194D0;

    /* renamed from: E */
    public TextView f7195E;

    /* renamed from: F */
    public ProgressBar f7197F;

    /* renamed from: G */
    public View f7199G;

    /* renamed from: G0 */
    public ValueAnimator f7200G0;

    /* renamed from: H */
    public TextView f7201H;

    /* renamed from: H0 */
    public ValueAnimator f7202H0;

    /* renamed from: I */
    public ViewGroup f7203I;

    /* renamed from: I0 */
    public boolean f7204I0;

    /* renamed from: J */
    public TextView f7205J;

    /* renamed from: K */
    public TextView f7207K;

    /* renamed from: L */
    public ViewGroup f7209L;

    /* renamed from: M */
    public TextView f7211M;

    /* renamed from: M0 */
    public float f7212M0;

    /* renamed from: N */
    public TextView f7213N;

    /* renamed from: N0 */
    public float f7214N0;

    /* renamed from: O */
    public TextView f7215O;

    /* renamed from: O0 */
    public boolean f7216O0;

    /* renamed from: P */
    public TextView f7217P;

    /* renamed from: P0 */
    public Boolean f7218P0;

    /* renamed from: Q */
    public ViewGroup f7219Q;

    /* renamed from: R */
    public TextView f7221R;

    /* renamed from: R0 */
    public Boolean f7222R0;

    /* renamed from: S */
    public TextView f7223S;

    /* renamed from: S0 */
    public float f7224S0;

    /* renamed from: T */
    public ProgressBar f7225T;

    /* renamed from: T0 */
    public float f7226T0;

    /* renamed from: U */
    public View f7227U;

    /* renamed from: U0 */
    public float f7228U0;

    /* renamed from: V */
    public TextView f7229V;

    /* renamed from: W */
    public TextView f7231W;

    /* renamed from: X */
    public TextView f7233X;

    /* renamed from: X0 */
    public Boolean f7234X0;

    /* renamed from: Y */
    public TextView f7235Y;

    /* renamed from: Y0 */
    public ValueAnimator f7236Y0;

    /* renamed from: Z */
    public TextView f7237Z;

    /* renamed from: Z0 */
    public float f7238Z0;

    /* renamed from: a */
    public final C1537g f7239a;

    /* renamed from: a0 */
    public TextView f7240a0;

    /* renamed from: b */
    public final View f7242b;

    /* renamed from: b0 */
    public TextView f7243b0;

    /* renamed from: b1 */
    public C1525c f7244b1;

    /* renamed from: c */
    public final Context f7245c;

    /* renamed from: c0 */
    public TextView f7246c0;

    /* renamed from: d0 */
    public TextView f7249d0;

    /* renamed from: e0 */
    public ImageView f7252e0;

    /* renamed from: f0 */
    public ImageView f7255f0;

    /* renamed from: g */
    public ViewGroup f7256g;

    /* renamed from: g0 */
    public TextView f7257g0;

    /* renamed from: h */
    public View f7258h;

    /* renamed from: h0 */
    public TextView f7259h0;

    /* renamed from: i */
    public View f7260i;

    /* renamed from: i0 */
    public TextView f7261i0;

    /* renamed from: j */
    public View f7262j;

    /* renamed from: j0 */
    public TextView f7263j0;

    /* renamed from: k */
    public View f7264k;

    /* renamed from: k0 */
    public View f7265k0;

    /* renamed from: l */
    public View f7266l;

    /* renamed from: l0 */
    public ImageView f7267l0;

    /* renamed from: m */
    public View f7268m;

    /* renamed from: m0 */
    public TextView f7269m0;

    /* renamed from: n */
    public C1528d f7270n;

    /* renamed from: n0 */
    public ImageView f7271n0;

    /* renamed from: o */
    public ImageView f7272o;

    /* renamed from: o0 */
    public View f7273o0;

    /* renamed from: p */
    public ImageView f7274p;

    /* renamed from: p0 */
    public ImageView f7275p0;

    /* renamed from: q */
    public ImageView f7276q;

    /* renamed from: q0 */
    public TextView f7277q0;

    /* renamed from: r */
    public ImageView f7278r;

    /* renamed from: r0 */
    public TextView f7279r0;

    /* renamed from: s */
    public ImageView f7280s;

    /* renamed from: s0 */
    public TextView f7281s0;

    /* renamed from: t */
    public TextView f7282t;

    /* renamed from: t0 */
    public TextView f7283t0;

    /* renamed from: u */
    public TextView f7284u;

    /* renamed from: u0 */
    public ProgressBar f7285u0;

    /* renamed from: v */
    public TextView f7286v;

    /* renamed from: v0 */
    public long f7287v0;

    /* renamed from: w */
    public TextView f7288w;

    /* renamed from: w0 */
    public long f7289w0;

    /* renamed from: x */
    public TextView f7290x;

    /* renamed from: x0 */
    public boolean f7291x0;

    /* renamed from: y */
    public TextView f7292y;

    /* renamed from: y0 */
    public long f7293y0;

    /* renamed from: z */
    public TextView f7294z;

    /* renamed from: z0 */
    public C1531e f7295z0;

    /* renamed from: d */
    public final cfgData f7248d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f7251e = carData.getInstance();

    /* renamed from: f */
    public final Handler f7254f = new Handler(Looper.getMainLooper());

    /* renamed from: E0 */
    public boolean f7196E0 = true;

    /* renamed from: F0 */
    public boolean f7198F0 = true;

    /* renamed from: J0 */
    public final RunnableC1578v f7206J0 = new RunnableC1578v(this, 13);

    /* renamed from: K0 */
    public boolean f7208K0 = false;

    /* renamed from: L0 */
    public float f7210L0 = 0.0f;

    /* renamed from: Q0 */
    public int f7220Q0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: V0 */
    public float f7230V0 = 1.0f;

    /* renamed from: W0 */
    public float f7232W0 = 0.0f;

    /* renamed from: a1 */
    public int f7241a1 = 999;

    /* renamed from: c1 */
    public final RunnableC1470B f7247c1 = new RunnableC1470B(this, 0);

    /* renamed from: d1 */
    public final RunnableC1470B f7250d1 = new RunnableC1470B(this, 1);

    /* renamed from: e1 */
    public final RunnableC1470B f7253e1 = new RunnableC1470B(this, 2);

    public C1474D(C1537g c1537g, View view) {
        this.f7239a = c1537g;
        this.f7242b = view;
        this.f7245c = view.getContext();
    }

    /* renamed from: A */
    public static void m3501A(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (view == null) {
            return;
        }
        view.setPivotX(f3 - view.getLeft());
        view.setPivotY(f4 - view.getTop());
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setTranslationX(f7 + f5);
        view.setTranslationY(f8 + f6);
    }

    /* renamed from: F */
    public static void m3502F(ImageView imageView, ImageView imageView2, TextView textView, float f2) {
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            imageView2.setRotation(0.0f);
        }
        if (textView != null) {
            textView.setTranslationX(0.0f);
            textView.setTranslationY(f2);
        }
    }

    /* renamed from: I */
    public static String m3503I(float f2) {
        return String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", ".");
    }

    /* renamed from: J */
    public static String m3504J(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: K */
    public static float m3505K(float f2) {
        float f3 = f2 - 1.0f;
        if (Math.abs(f3) < 0.001f) {
            return 0.0f;
        }
        return f3 / 0.29999995f;
    }

    /* renamed from: c */
    public static void m3506c(ImageView imageView, ImageView imageView2, TextView textView, float f2, float f3, float f4, float f5) {
        if (imageView != null) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
            imageView.setTranslationX(f3 * f5);
            imageView.setRotation(f4 * f5);
        }
        if (imageView2 != null) {
            imageView2.setPivotY(AbstractC0062j.m153g(imageView2.getWidth(), 0.5f, imageView2) * 0.5f);
            imageView2.setTranslationX(f3 * f5);
            imageView2.setTranslationY(0.0f);
            imageView2.setRotation(f4 * f5);
        }
        if (textView != null) {
            textView.setTranslationX(f3 * f5);
            textView.setTranslationY(f2);
        }
    }

    /* renamed from: m0 */
    public static void m3507m0(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    /* renamed from: q0 */
    public static RectF m3508q0(RectF rectF, float f2) {
        if (f2 >= 1.0f) {
            return new RectF(rectF);
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (f2 <= 0.0f) {
            return new RectF(centerX, centerY, centerX, centerY);
        }
        float width = rectF.width() * 0.5f * f2;
        float height = rectF.height() * 0.5f * f2;
        return new RectF(centerX - width, centerY - height, centerX + width, centerY + height);
    }

    /* renamed from: r0 */
    public static void m3509r0(View view, float f2) {
        if (view != null) {
            view.setElevation(f2);
        }
    }

    /* renamed from: s */
    public static void m3510s(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        if (f2 <= 0.001f) {
            view.setTranslationY(0.0f);
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            if (view.getHeight() > 0) {
                f3 = view.getHeight();
            }
            view.setTranslationY((1.0f - f2) * f3);
        }
    }

    /* renamed from: s0 */
    public static void m3511s0(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: t0 */
    public static void m3512t0(TextView textView, boolean z2) {
        if (textView == null) {
            return;
        }
        if (z2) {
            textView.setVisibility(0);
            textView.setAlpha(1.0f);
        } else {
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            textView.setAlpha(0.0f);
            textView.setVisibility(4);
        }
    }

    /* renamed from: u0 */
    public static void m3513u0(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 8);
    }

    /* renamed from: v0 */
    public static void m3514v0(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: A0 */
    public final void m3515A0(float f2, float f3, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f7200G0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f7200G0);
        this.f7200G0.addUpdateListener(new C0174W(5, this));
        this.f7200G0.addListener(new C0181b0(this, 3, runnable));
        this.f7200G0.start();
    }

    /* renamed from: B */
    public final void m3516B() {
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f7196E0);
        cfgData cfgdata = this.f7248d;
        int i = 8;
        if (!cfgdata.f2537K2) {
            m3564k0();
            this.f7256g.setVisibility(4);
            m3525G();
            m3581x();
            ImageView imageView = this.f7267l0;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            TextView textView = this.f7269m0;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ImageView imageView2 = this.f7271n0;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            m3549d();
            View view = this.f7258h;
            if (view != null) {
                view.setVisibility(8);
            }
            m3579w();
            return;
        }
        boolean m3529L = m3529L();
        carData cardata = this.f7251e;
        if (m3529L) {
            this.f7256g.setVisibility(0);
            boolean m3535R = m3535R();
            Boolean bool = this.f7218P0;
            if (bool == null || bool.booleanValue() != m3535R) {
                this.f7218P0 = Boolean.valueOf(m3535R);
            }
            m3545a0();
            m3547b0(cardata.m1745e());
            m3572p();
            m3585z();
            m3549d();
            if (this.f7258h != null) {
                if (m3582x0()) {
                    this.f7258h.setVisibility(8);
                } else if (m3535R()) {
                    this.f7258h.setVisibility(0);
                } else if (m3528H0()) {
                    this.f7258h.setVisibility(4);
                } else {
                    this.f7258h.setVisibility(8);
                }
            }
            if (m3526G0()) {
                if (m3584y0() || m3528H0()) {
                    m3568n();
                }
                m3524F0();
                return;
            }
            return;
        }
        m3564k0();
        this.f7256g.setVisibility(0);
        if (cfgdata.f2561Q2) {
            m3545a0();
            View view2 = this.f7258h;
            if (view2 != null) {
                if (!m3582x0() && m3584y0()) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
            if (m3526G0()) {
                if (m3584y0()) {
                    m3568n();
                }
                m3524F0();
            }
        } else {
            if (m3534Q()) {
                m3545a0();
                if (m3526G0()) {
                    m3524F0();
                }
            } else {
                m3525G();
            }
            View view3 = this.f7258h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        m3514v0(this.f7274p, false);
        m3514v0(this.f7276q, false);
        m3514v0(this.f7278r, false);
        m3514v0(this.f7280s, false);
        m3514v0(this.f7257g0, false);
        m3514v0(this.f7259h0, false);
        m3566l0();
        m3560i0();
        m3547b0(cardata.m1745e());
        m3585z();
        m3558h0();
        m3549d();
        m3552e0(C0639g.m1872x().m1880u());
        m3578v();
        m3576t();
        m3575r();
        m3579w();
        m3581x();
    }

    /* renamed from: B0 */
    public final void m3517B0(String str) {
        Context context = this.f7245c;
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
    public final void m3518C() {
        final RunnableC1578v runnableC1578v = new RunnableC1578v(this, 14);
        final int i = 8;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        };
        carData cardata = this.f7251e;
        C1537g c1537g = this.f7239a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 9;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i3 = 10;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i4 = 11;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i5 = 12;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i6 = 13;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i7 = 14;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i8 = 15;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i9 = 16;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i10 = 17;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i11 = 18;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i12 = 0;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i13 = 1;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i14 = 2;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i15 = 3;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i16 = 4;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i17 = 5;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i18 = 6;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i19 = 7;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.w
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1578v.run();
                        break;
                    case 1:
                        runnableC1578v.run();
                        break;
                    case 2:
                        runnableC1578v.run();
                        break;
                    case 3:
                        runnableC1578v.run();
                        break;
                    case 4:
                        runnableC1578v.run();
                        break;
                    case 5:
                        runnableC1578v.run();
                        break;
                    case 6:
                        runnableC1578v.run();
                        break;
                    case 7:
                        runnableC1578v.run();
                        break;
                    case 8:
                        runnableC1578v.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1578v.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1578v.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1578v.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1578v.run();
                        break;
                    case 13:
                        runnableC1578v.run();
                        break;
                    case 14:
                        runnableC1578v.run();
                        break;
                    case 15:
                        runnableC1578v.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1578v.run();
                        break;
                    case 17:
                        runnableC1578v.run();
                        break;
                    default:
                        runnableC1578v.run();
                        break;
                }
            }
        });
        final int i20 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i20) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i21) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i22) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i23) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i24) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i25) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f7245c);
        final int i26 = 6;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i26) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i27) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 8;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i28) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 9;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i29) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 10;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i30) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 11;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i31) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 12;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i32) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 13;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i33) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 14;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i34) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 15;
        cardata.m1756j0(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i35) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
        final int i36 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.x

            /* renamed from: b */
            public final /* synthetic */ C1474D f8843b;

            {
                this.f8843b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                int intValue2;
                int intValue3;
                int intValue4;
                switch (i36) {
                    case 0:
                        this.f8843b.m3556g0();
                        break;
                    case 1:
                        this.f8843b.m3554f0();
                        break;
                    case 2:
                        this.f8843b.m3554f0();
                        break;
                    case 3:
                        this.f8843b.m3554f0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1474D c1474d = this.f8843b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1474d.getClass();
                            intValue = num.intValue();
                        }
                        if (c1474d.f7241a1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1474d.f7245c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1474d.f7248d;
                            if (cfgdata.f2537K2) {
                                c1474d.f7238Z0 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1474d.f7241a1 == -1 && intValue > -1) {
                            c1474d.f7238Z0 = 0.0f;
                            ViewGroup viewGroup = c1474d.f7256g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1474d.f7256g.setAlpha(1.0f);
                            }
                            c1474d.m3517B0("ip");
                        }
                        c1474d.f7241a1 = intValue;
                        c1474d.m3550d0();
                        break;
                    case 5:
                        this.f8843b.m3550d0();
                        break;
                    case 6:
                        C1474D c1474d2 = this.f8843b;
                        Integer num2 = (Integer) obj;
                        c1474d2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1474d2.f7245c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1474d2.f7248d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1474d2.f7208K0 || !c1474d2.m3586z0()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1474d2.f7248d, c1474d2.f7251e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1474d2.f7248d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1474d2.f7245c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1474d2.m3517B0("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1474d2.f7251e)) {
                                                                        cfgData cfgdata3 = c1474d2.f7248d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1474d2.f7251e.m1760l0(z2);
                                                                        c1474d2.f7248d.m1795o(c1474d2.f7245c);
                                                                        Context context2 = c1474d2.f7245c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1474d2.f7248d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1474d2.f7248d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1474d2.f7245c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1474d2.m3517B0("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v2 = c1474d2.f7206J0;
                                                                    handler.removeCallbacks(runnableC1578v2);
                                                                    handler.postDelayed(runnableC1578v2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1474d2.m3586z0()) {
                                                                    c1474d2.f7208K0 = true;
                                                                    if (c1474d2.m3533P() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1474d2.f7198F0 && ((valueAnimator = c1474d2.f7200G0) == null || !valueAnimator.isRunning())) {
                                                                            c1474d2.m3523E0(true);
                                                                        }
                                                                        Handler handler2 = c1474d2.f7254f;
                                                                        RunnableC1578v runnableC1578v3 = c1474d2.f7206J0;
                                                                        handler2.removeCallbacks(runnableC1578v3);
                                                                        handler2.postDelayed(runnableC1578v3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1474d2.f7208K0) {
                                                                    Handler handler3 = c1474d2.f7254f;
                                                                    RunnableC1578v runnableC1578v4 = c1474d2.f7206J0;
                                                                    handler3.removeCallbacks(runnableC1578v4);
                                                                    handler3.postDelayed(runnableC1578v4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1474d2.f7204I0) {
                                                        ValueAnimator valueAnimator2 = c1474d2.f7236Y0;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1474d2.f7196E0;
                                                            if (!z3 || !c1474d2.m3536S()) {
                                                                boolean z4 = !c1474d2.f7196E0;
                                                                c1474d2.f7196E0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1474d2.m3544a(z3);
                                                                break;
                                                            } else {
                                                                RunnableC1578v runnableC1578v5 = new RunnableC1578v(c1474d2, 7);
                                                                if (!c1474d2.m3536S() && Math.abs(c1474d2.f7230V0 - 1.0f) < 0.001f && c1474d2.f7232W0 < 0.001f) {
                                                                    runnableC1578v5.run();
                                                                    break;
                                                                } else {
                                                                    cfgData cfgdata4 = c1474d2.f7248d;
                                                                    cfgdata4.f2635h1 = 0;
                                                                    cfgdata4.m1795o(c1474d2.f7245c);
                                                                    c1474d2.m3546b(runnableC1578v5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1474d2.f7248d.f2672o3) {
                                                        Context context3 = c1474d2.f7245c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1474d2.m3517B0("ip_rest");
                                                        break;
                                                    } else {
                                                        c1474d2.m3517B0("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1474d2.f7251e.m1714B()) {
                                                if (!AbstractC1372y1.f6437g) {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1474d2.f7248d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1474d2.f7245c, m3282M[0], m3282M[1], 0.5f, c1474d2.f7248d.f2657l3);
                                                    break;
                                                } else {
                                                    AbstractC1372y1.m3305k(c1474d2.f7245c);
                                                    break;
                                                }
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1474d2.m3533P()) {
                                            ValueAnimator valueAnimator3 = c1474d2.f7200G0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1474d2.f7208K0 = false;
                                                c1474d2.m3523E0(c1474d2.f7198F0);
                                                break;
                                            }
                                        }
                                    } else if (c1474d2.f7248d.f2561Q2 && !c1474d2.f7204I0) {
                                        ValueAnimator valueAnimator4 = c1474d2.f7236Y0;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata5 = c1474d2.f7248d;
                                            if (cfgdata5.f2561Q2) {
                                                cfgdata5.f2635h1 = (cfgdata5.f2635h1 + 1) % 3;
                                                cfgdata5.m1795o(c1474d2.f7245c);
                                                c1474d2.m3546b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1474d2.f7245c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1474D c1474d3 = this.f8843b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1474d3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1474d3.m3548c0(intValue2);
                        break;
                    case 8:
                        C1474D c1474d4 = this.f8843b;
                        c1474d4.m3516B();
                        c1474d4.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1474D c1474d5 = this.f8843b;
                        c1474d5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1474d5.m3564k0();
                        }
                        c1474d5.m3516B();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1474D c1474d6 = this.f8843b;
                        c1474d6.m3516B();
                        c1474d6.m3552e0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1474D c1474d7 = this.f8843b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1474d7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1474d7.m3547b0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1474D c1474d8 = this.f8843b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1474d8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1474d8.f7269m0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1474d8.m3547b0(c1474d8.f7251e.m1745e());
                        break;
                    case 13:
                        C1474D c1474d9 = this.f8843b;
                        AbstractC1539g1.m4225k(c1474d9.f7245c);
                        c1474d9.m3516B();
                        break;
                    case 14:
                        C1474D c1474d10 = this.f8843b;
                        c1474d10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1474d10.f7196E0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1474d10.f7196E0;
                        Context context4 = c1474d10.f7245c;
                        if (!z5) {
                            cfgData cfgdata6 = c1474d10.f7248d;
                            if (cfgdata6.f2635h1 != 0) {
                                cfgdata6.f2635h1 = 0;
                                cfgdata6.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1474d10.f7236Y0;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1474d10.f7236Y0 = null;
                            }
                            c1474d10.f7230V0 = 1.0f;
                            c1474d10.f7232W0 = 0.0f;
                            c1474d10.m3577u();
                        }
                        c1474d10.m3516B();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1474d10.f7196E0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1474D c1474d11 = this.f8843b;
                        if (bool == null) {
                            c1474d11.getClass();
                            break;
                        } else {
                            c1474d11.m3559i(false);
                            break;
                        }
                    default:
                        this.f8843b.m3552e0((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: C0 */
    public final boolean m3519C0() {
        return m3582x0() && m3569n0().m4472a();
    }

    /* renamed from: D */
    public final void m3520D() {
        ValueAnimator valueAnimator = this.f7200G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7200G0 = null;
        }
    }

    /* renamed from: D0 */
    public final void m3521D0() {
        ValueAnimator valueAnimator = this.f7236Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7236Y0 = null;
        }
        cfgData cfgdata = this.f7248d;
        if (cfgdata.f2561Q2) {
            this.f7230V0 = m3536S() ? 1.3f : 1.0f;
            this.f7232W0 = cfgdata.f2635h1 == 2 ? 1.0f : 0.0f;
            return;
        }
        if (cfgdata.f2635h1 != 0) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(this.f7245c);
        }
        this.f7230V0 = 1.0f;
        this.f7232W0 = 0.0f;
    }

    /* renamed from: E */
    public final void m3522E() {
        ImageView m3571o0 = m3571o0();
        if (m3571o0 == null) {
            this.f7216O0 = false;
            return;
        }
        RunnableC0018l runnableC0018l = new RunnableC0018l(this, 26, m3571o0);
        if (m3571o0.getWidth() <= 0 || m3571o0.getHeight() <= 0) {
            m3571o0.post(runnableC0018l);
        } else {
            runnableC0018l.run();
        }
    }

    /* renamed from: E0 */
    public final void m3523E0(boolean z2) {
        this.f7254f.removeCallbacks(this.f7206J0);
        if (z2 && AbstractC1372y1.m3272C()) {
            m3564k0();
            return;
        }
        if (!m3533P()) {
            m3564k0();
            return;
        }
        m3520D();
        if (z2) {
            AbstractC1372y1.m3287R(true, true);
            m3522E();
            this.f7198F0 = false;
            this.f7210L0 = 0.0f;
            if (m3532O()) {
                m3524F0();
            } else {
                m3545a0();
            }
            m3572p();
            m3515A0(0.0f, 1.0f, new RunnableC1578v(this, 9));
            return;
        }
        if (m3586z0() && this.f7210L0 > 0.0f) {
            m3572p();
            m3515A0(this.f7210L0, 0.0f, new RunnableC1578v(this, 10));
        } else {
            this.f7198F0 = true;
            this.f7210L0 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m3516B();
        }
    }

    /* renamed from: F0 */
    public final void m3524F0() {
        float f2;
        float f3;
        View view;
        View view2;
        if (this.f7256g == null || this.f7244b1 == null || !m3526G0()) {
            return;
        }
        if (this.f7256g.getWidth() <= 0 || this.f7256g.getHeight() <= 0) {
            this.f7256g.post(new RunnableC1578v(this, 1));
            return;
        }
        if (m3582x0() && ((view2 = this.f7262j) == null || view2.getHeight() <= 0)) {
            this.f7256g.post(new RunnableC1578v(this, 1));
            return;
        }
        if (m3584y0() && (view = this.f7258h) != null && view.getVisibility() == 0 && (this.f7258h.getWidth() <= 0 || this.f7258h.getHeight() <= 0)) {
            this.f7258h.post(new RunnableC1578v(this, 1));
            return;
        }
        float f4 = this.f7245c.getResources().getDisplayMetrics().density;
        float f5 = 14.0f * f4;
        float f6 = 1.0f * f4;
        if (m3582x0()) {
            f4 = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f2 = f5;
            f3 = f6;
        }
        this.f7244b1.m4160b();
        C1525c c1525c = this.f7244b1;
        if (c1525c != null && !c1525c.m4161c()) {
            this.f7244b1.m4162d(m3582x0() ? -15854822 : -15722462);
        }
        if (m3582x0()) {
            RectF rectF = new RectF();
            ViewGroup viewGroup = this.f7256g;
            if (viewGroup != null && viewGroup.getWidth() > 0 && this.f7256g.getHeight() > 0) {
                float width = this.f7256g.getWidth() - 0.0f;
                float height = this.f7256g.getHeight();
                View view3 = this.f7262j;
                if (view3 != null && view3.getHeight() > 0) {
                    height = this.f7262j.getTop();
                }
                if (width > 0.0f && height > 0.0f) {
                    rectF.set(0.0f, 0.0f, width, height);
                }
            }
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                this.f7244b1.m4159a(rectF.left, rectF.top, rectF.right, rectF.bottom, f2, f3);
            }
        }
        if (m3584y0()) {
            RectF m3539V = m3539V();
            if (m3539V.width() > 0.0f && m3539V.height() > 0.0f) {
                this.f7244b1.m4159a(m3539V.left, m3539V.top, m3539V.right, m3539V.bottom, f5, f4);
            }
        } else if (m3528H0()) {
            RectF m3508q0 = m3508q0(m3540W(), this.f7232W0);
            if (m3508q0.width() > 0.0f && m3508q0.height() > 0.0f) {
                this.f7244b1.m4159a(m3508q0.left, m3508q0.top, m3508q0.right, m3508q0.bottom, f5, f4);
            }
        }
        if (m3586z0()) {
            RectF m3508q02 = m3508q0(m3541X(), this.f7210L0);
            if (m3508q02.width() > 0.0f && m3508q02.height() > 0.0f) {
                this.f7244b1.m4159a(m3508q02.left, m3508q02.top, m3508q02.right, m3508q02.bottom, f5, f4);
            }
        }
        ImageView imageView = this.f7272o;
        if (imageView != null && imageView.getBackground() == this.f7244b1) {
            this.f7272o.invalidate();
        } else if (this.f7256g.getBackground() == this.f7244b1) {
            this.f7256g.invalidate();
        }
    }

    /* renamed from: G */
    public final void m3525G() {
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f7256g;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(android.R.color.transparent);
        }
        m3531N();
        C1525c c1525c = this.f7244b1;
        if (c1525c != null) {
            c1525c.m4163e(null);
        }
    }

    /* renamed from: G0 */
    public final boolean m3526G0() {
        return m3584y0() || m3582x0() || m3586z0() || m3528H0();
    }

    /* renamed from: H */
    public final void m3527H() {
        ImageView imageView = this.f7272o;
        if (imageView != null && imageView.getBackground() == this.f7244b1) {
            this.f7272o.setBackground(null);
            this.f7272o.setLayerType(0, null);
        }
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup != null && viewGroup.getBackground() == this.f7244b1) {
            this.f7256g.setBackgroundResource(android.R.color.transparent);
            this.f7256g.setLayerType(0, null);
        }
        C1525c c1525c = this.f7244b1;
        if (c1525c != null) {
            c1525c.m4160b();
            this.f7244b1.m4163e(null);
        }
    }

    /* renamed from: H0 */
    public final boolean m3528H0() {
        return m3529L() && !m3584y0() && !m3582x0() && (this.f7248d.f2635h1 == 2 || this.f7232W0 > 0.001f);
    }

    /* renamed from: L */
    public final boolean m3529L() {
        return this.f7248d.f2561Q2 && this.f7196E0;
    }

    /* renamed from: M */
    public final void m3530M(float[] fArr) {
        float f2 = (!this.f7198F0 || this.f7210L0 > 0.0f) ? this.f7210L0 : 0.0f;
        if (f2 <= 0.0f || !this.f7216O0) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        RectF m3541X = m3541X();
        if (m3541X.width() <= 0.0f || m3541X.height() <= 0.0f) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = (m3541X.centerX() - this.f7212M0) * f2;
            fArr[1] = (m3541X.centerY() - this.f7214N0) * f2;
        }
    }

    /* renamed from: N */
    public final void m3531N() {
        ImageView imageView = this.f7272o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        this.f7272o.setLayerType(0, null);
        this.f7272o.setBackground(null);
        this.f7272o.setImageDrawable(null);
    }

    /* renamed from: O */
    public final boolean m3532O() {
        if (this.f7244b1 == null) {
            return false;
        }
        ImageView imageView = this.f7272o;
        if (imageView != null && imageView.getVisibility() == 0 && this.f7272o.getBackground() == this.f7244b1) {
            return true;
        }
        ViewGroup viewGroup = this.f7256g;
        return viewGroup != null && viewGroup.getBackground() == this.f7244b1;
    }

    /* renamed from: P */
    public final boolean m3533P() {
        return this.f7248d.f2537K2 && m3529L();
    }

    /* renamed from: Q */
    public final boolean m3534Q() {
        cfgData cfgdata = this.f7248d;
        return AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
    }

    /* renamed from: R */
    public final boolean m3535R() {
        return AbstractC1539g1.m4195Q(this.f7248d, this.f7251e);
    }

    /* renamed from: S */
    public final boolean m3536S() {
        int i = this.f7248d.f2635h1;
        return i == 1 || i == 2;
    }

    /* renamed from: T */
    public final ImageView m3537T() {
        return this.f7248d.f2636h2 ? this.f7276q : this.f7274p;
    }

    /* renamed from: U */
    public final float m3538U() {
        return this.f7248d.f2636h2 ? this.f7226T0 : this.f7224S0;
    }

    /* renamed from: V */
    public final RectF m3539V() {
        ViewGroup viewGroup = this.f7256g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7256g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4206a0(AbstractC1539g1.m4238t(), this.f7256g.getWidth(), this.f7256g.getHeight());
    }

    /* renamed from: W */
    public final RectF m3540W() {
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7256g.getHeight() <= 0) {
            return new RectF();
        }
        int width = this.f7256g.getWidth();
        int height = this.f7256g.getHeight();
        Rect m4238t = AbstractC1539g1.m4238t();
        int round = 800 - Math.round(25.0f);
        if (round <= 99) {
            round = 100;
        }
        RectF m4206a0 = AbstractC1539g1.m4206a0(new Rect(m4238t.left, 99, m4238t.right, round), width, height);
        if (m4206a0.width() > 0.0f && m4206a0.height() > 0.0f) {
            m4206a0.set(m4206a0.left, m4206a0.top, m4206a0.right, height - 25.0f);
        }
        return m4206a0;
    }

    /* renamed from: X */
    public final RectF m3541X() {
        Rect m4239u = AbstractC1539g1.m4239u();
        ViewGroup viewGroup = this.f7256g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7256g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4208b0(m4239u, this.f7256g.getWidth(), this.f7256g.getHeight());
    }

    /* renamed from: Y */
    public final void m3542Y() {
        Context context = this.f7245c;
        float f2 = context.getResources().getDisplayMetrics().density * 6.0f;
        float f3 = context.getResources().getDisplayMetrics().density * 8.0f;
        m3509r0(this.f7274p, f2);
        m3509r0(this.f7276q, f2);
        m3509r0(this.f7278r, f2);
        m3509r0(this.f7280s, f2);
        m3509r0(this.f7257g0, f2);
        m3509r0(this.f7259h0, f2);
        m3509r0(this.f7197F, f3);
        m3509r0(this.f7225T, f3);
        m3509r0(this.f7199G, f3);
        m3509r0(this.f7227U, f3);
        m3509r0(this.f7193D, f3);
        m3509r0(this.f7191C, f3);
        m3509r0(this.f7195E, f3);
        m3509r0(this.f7201H, f3);
        m3509r0(this.f7223S, f3);
        m3509r0(this.f7221R, f3);
        m3509r0(this.f7273o0, f2);
        m3509r0(this.f7203I, f2);
        m3509r0(this.f7264k, 2.0f);
        m3509r0(this.f7266l, 2.0f);
        m3509r0(this.f7268m, 2.0f);
    }

    /* renamed from: Z */
    public final void m3543Z() {
        float max;
        float max2;
        float max3;
        AbstractC1539g1.m4228l0(this.f7256g, !this.f7196E0);
        carData cardata = this.f7251e;
        float m1780z = cardata.m1780z();
        cfgData cfgdata = this.f7248d;
        float f2 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        C1472C c1472c = this.f7188A0;
        c1472c.f7177c = Math.max(0.0f, Math.min(c1472c.f7175a, f2));
        C1472C c1472c2 = this.f7190B0;
        c1472c2.f7177c = Math.max(0.0f, Math.min(c1472c2.f7175a, Math.max(0.0f, cardata.m1779y() / 1000.0f)));
        float m1780z2 = cardata.m1780z();
        float f3 = m1780z2 < 0.0f ? 0.0f : m1780z2 * cfgdata.f2702u3;
        float m1779y = cardata.m1779y() / 1000.0f;
        if (m1779y < 0.0f) {
            m1779y = 0.0f;
        }
        TextView textView = this.f7257g0;
        int i = -65536;
        int i2 = f7183f1;
        if (textView != null) {
            textView.setTextColor(f3 > cfgdata.f2568S1 ? -65536 : f3 > cfgdata.f2564R1 ? -256 : i2);
            this.f7257g0.setText(m3503I(f3));
        }
        TextView textView2 = this.f7259h0;
        if (textView2 != null) {
            textView2.setTextColor(m1779y > cfgdata.f2576U1 ? -65536 : m1779y > cfgdata.f2572T1 ? -256 : i2);
            this.f7259h0.setText(AbstractC1256E0.m2986A(m1779y));
        }
        m3558h0();
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c.f7147f) {
            float f4 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            max = cfgdata.m1787f(m1775u, cardata.m1776v(), f4);
            ProgressBar progressBar = this.f7197F;
            if (progressBar != null) {
                progressBar.setProgress(Math.round(m1775u * f4));
            }
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            ProgressBar progressBar2 = this.f7197F;
            if (progressBar2 != null) {
                progressBar2.setProgress(Math.round(max));
            }
        }
        EnumC1457c enumC1457c2 = cfgdata.f2543M0;
        if (enumC1457c2.f7147f) {
            max2 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c2 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
        } else {
            max2 = Math.max(0.0f, cardata.m1774t());
        }
        int i3 = max2 < 15.0f ? -65536 : max2 < 30.0f ? -256 : i2;
        TextView textView3 = this.f7191C;
        if (textView3 != null) {
            textView3.setText(String.format(Locale.ENGLISH, "%.0f%%", Float.valueOf(max)));
            this.f7191C.setTextColor(i3);
        }
        TextView textView4 = this.f7195E;
        if (textView4 != null) {
            Locale locale = Locale.ENGLISH;
            EnumC1457c enumC1457c3 = cfgdata.f2543M0;
            if (enumC1457c3.f7147f) {
                max3 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c3 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
            } else {
                max3 = Math.max(0.0f, cardata.m1774t()) * cfgdata.m1789h();
            }
            textView4.setText(String.format(locale, "%.0f L", Float.valueOf(max3)));
            this.f7195E.setTextColor(i3);
        }
        float m1743d = cardata.m1743d();
        ProgressBar progressBar3 = this.f7225T;
        if (progressBar3 != null) {
            progressBar3.setProgress(Math.round(m1743d < 40.0f ? 0 : m1743d > 130.0f ? 100 : Math.round(((m1743d - 40.0f) / 90.0f) * 100.0f)));
        }
        TextView textView5 = this.f7221R;
        if (textView5 != null) {
            if (m1743d < -90.0f) {
                textView5.setText("-- °C");
                this.f7221R.setTextColor(i2);
            } else {
                textView5.setText(String.format(Locale.ENGLISH, "%.0f °C", Float.valueOf(m1743d)));
                TextView textView6 = this.f7221R;
                if (m1743d < 40.0f) {
                    i = -16776961;
                } else if (m1743d <= 112.0f) {
                    i = m1743d > 107.0f ? -256 : i2;
                }
                textView6.setTextColor(i);
            }
        }
        TextView textView7 = this.f7201H;
        if (textView7 != null) {
            textView7.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(cardata.m1777w())));
        }
        float m1765o = cardata.m1765o();
        TextView textView8 = this.f7282t;
        if (textView8 != null) {
            textView8.setText(m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L");
        }
        if (this.f7284u != null) {
            this.f7284u.setText(this.f7242b.getContext().getString(cardata.m1780z() > 0.0f ? R.string.ip_theme_41_inst_fuel_unit_l100 : R.string.ip_theme_41_inst_fuel_unit_lph));
        }
        m3511s0(this.f7288w, cardata.m1739b());
        m3511s0(this.f7294z, cardata.m1737a());
        boolean z2 = cfgdata.f2543M0.f7149h;
        TextView textView9 = this.f7229V;
        Context context = this.f7245c;
        if (textView9 != null) {
            textView9.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(cardata.m1741c())));
            this.f7229V.setTranslationX(z2 ? 0.0f : 34.0f * context.getResources().getDisplayMetrics().density);
        }
        TextView textView10 = this.f7231W;
        if (textView10 != null) {
            textView10.setVisibility(z2 ? 0 : 4);
            if (z2) {
                TextView textView11 = this.f7231W;
                Locale locale2 = Locale.ENGLISH;
                Float valueOf = Float.valueOf(cardata.m1761m());
                EnumC1457c enumC1457c4 = cfgdata.f2543M0;
                textView11.setText(String.format(locale2, "%.1f%s", valueOf, (enumC1457c4 == EnumC1457c.T500_Urban || enumC1457c4 == EnumC1457c.T400 || enumC1457c4 == EnumC1457c.T700_100 || enumC1457c4 == EnumC1457c.T700) ? "%" : "V"));
            }
        }
        TextView textView12 = this.f7207K;
        if (textView12 != null) {
            textView12.setText(m3503I(cardata.m1771r()));
        }
        TextView textView13 = this.f7213N;
        if (textView13 != null) {
            textView13.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(",", "."));
        }
        TextView textView14 = this.f7217P;
        if (textView14 != null) {
            textView14.setText(m3503I(cardata.m1767p()));
        }
        m3580w0(this.f7233X, cardata.m1715C());
        m3580w0(this.f7235Y, cardata.m1716D());
        m3580w0(this.f7237Z, cardata.m1717E());
        m3580w0(this.f7240a0, cardata.m1718F());
        m3556g0();
        m3554f0();
        m3550d0();
        TextView textView15 = this.f7246c0;
        if (textView15 == null) {
            return;
        }
        textView15.setText(AbstractC1372y1.m3307m(context));
    }

    /* renamed from: a */
    public final void m3544a(boolean z2) {
        View view;
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup == null) {
            m3516B();
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7256g.getHeight() <= 0) {
            this.f7256g.post(new RunnableC0029w(this, z2, 6));
            return;
        }
        ValueAnimator valueAnimator = this.f7202H0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7202H0 = null;
        }
        this.f7204I0 = false;
        m3520D();
        m3564k0();
        ImageView m3537T = m3537T();
        ImageView m3571o0 = m3571o0();
        boolean z3 = this.f7248d.f2636h2;
        ImageView imageView = z3 ? this.f7280s : this.f7278r;
        ImageView imageView2 = z3 ? this.f7278r : this.f7280s;
        TextView textView = z3 ? this.f7259h0 : this.f7257g0;
        TextView textView2 = z3 ? this.f7257g0 : this.f7259h0;
        float m3538U = m3538U();
        float m3573p0 = m3573p0();
        float width = this.f7256g.getWidth();
        float height = this.f7256g.getHeight();
        float f2 = this.f7245c.getResources().getDisplayMetrics().density * 80.0f;
        float f3 = m3537T != null ? -(m3537T.getRight() + f2) : -width;
        if (m3571o0 != null) {
            width = (width - m3571o0.getLeft()) + f2;
        }
        float f4 = width;
        if (!z2) {
            m3514v0(m3537T, true);
            m3514v0(m3571o0, true);
            m3514v0(imageView, true);
            m3514v0(imageView2, true);
            m3514v0(textView, true);
            m3514v0(textView2, true);
            m3552e0(C0639g.m1872x().m1880u());
        }
        View view2 = this.f7273o0;
        boolean z4 = view2 != null && view2.getVisibility() == 0;
        float top = this.f7273o0 != null ? (height - r6.getTop()) + f2 : 0.0f;
        if (m3532O()) {
            m3527H();
        }
        ViewGroup viewGroup2 = this.f7256g;
        if (viewGroup2 != null) {
            viewGroup2.setLayerType(0, null);
        }
        ViewGroup viewGroup3 = this.f7256g;
        if (viewGroup3 != null) {
            viewGroup3.setBackgroundResource(android.R.color.transparent);
        }
        if (this.f7272o != null) {
            C1574t m3569n0 = m3569n0();
            this.f7272o.setVisibility(0);
            this.f7272o.setLayerType(0, null);
            this.f7272o.setBackground(null);
            if (m3569n0.m4472a()) {
                int i = m3569n0.f8687b;
                if (i != 0) {
                    this.f7272o.setImageResource(i);
                } else {
                    Uri uri = m3569n0.f8688c;
                    if (uri != null) {
                        this.f7272o.setImageURI(uri);
                    }
                }
            } else {
                this.f7272o.setImageDrawable(null);
                this.f7272o.setBackgroundResource(R.drawable.ip_theme_41_bg);
            }
        }
        float f5 = this.f7272o != null ? -(r0.getHeight() + f2) : -height;
        int[] m3297c = AbstractC1372y1.m3297c();
        this.f7204I0 = true;
        float f6 = z2 ? 0.0f : 1.0f;
        float f7 = f6;
        m3506c(m3537T, imageView, textView, m3538U, f3, -540.0f, f7);
        m3506c(m3571o0, imageView2, textView2, m3573p0, f4, 540.0f, f7);
        if (z4 && (view = this.f7273o0) != null) {
            view.setTranslationY(top * f6);
        }
        ImageView imageView3 = this.f7272o;
        if (imageView3 != null) {
            imageView3.setTranslationY(f6 * f5);
        }
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7202H0 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f7202H0);
        this.f7202H0.addUpdateListener(new C1558n(this, z2, m3537T, imageView, textView, m3538U, f3, m3571o0, imageView2, textView2, m3573p0, f4, z4, top, f5, m3297c, 1));
        this.f7202H0.addListener(new C1586z(this, m3297c, m3537T, imageView, textView, m3538U, m3571o0, imageView2, textView2, m3573p0, z4));
        this.f7202H0.start();
    }

    /* renamed from: a0 */
    public final void m3545a0() {
        C1525c c1525c;
        if (this.f7256g == null) {
            return;
        }
        try {
            if (!this.f7248d.f2561Q2 && !m3534Q()) {
                m3525G();
                return;
            }
            if (m3526G0()) {
                if (!m3532O()) {
                    m3563k();
                    return;
                }
                C1574t m3569n0 = m3569n0();
                if (m3519C0()) {
                    C1525c c1525c2 = this.f7244b1;
                    if (c1525c2 != null && c1525c2.m4161c()) {
                        m3531N();
                        m3565l();
                    }
                } else if (m3569n0.m4472a() && (c1525c = this.f7244b1) != null && !c1525c.m4161c()) {
                    m3563k();
                    return;
                }
                m3524F0();
                return;
            }
            if (m3532O()) {
                m3527H();
            }
            ViewGroup viewGroup = this.f7256g;
            if (viewGroup != null) {
                viewGroup.setLayerType(0, null);
            }
            C1574t m3569n02 = m3569n0();
            if (!m3569n02.m4472a()) {
                ImageView imageView = this.f7272o;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f7272o.setImageDrawable(null);
                }
                this.f7256g.setBackgroundResource(R.drawable.ip_theme_41_bg);
                return;
            }
            this.f7256g.setBackgroundResource(android.R.color.transparent);
            ImageView imageView2 = this.f7272o;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                this.f7272o.setLayerType(0, null);
                this.f7272o.setBackground(null);
                int i = m3569n02.f8687b;
                if (i != 0) {
                    this.f7272o.setImageResource(i);
                } else {
                    Uri uri = m3569n02.f8688c;
                    if (uri != null) {
                        this.f7272o.setImageURI(uri);
                    }
                }
            }
        } finally {
            m3581x();
        }
    }

    /* renamed from: b */
    public final void m3546b(RunnableC1578v runnableC1578v) {
        float f2 = m3536S() ? 1.3f : 1.0f;
        float f3 = this.f7248d.f2635h1 != 2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = this.f7236Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.f7230V0 - f2) < 0.001f && Math.abs(this.f7232W0 - f3) < 0.001f) {
            this.f7236Y0 = null;
            this.f7230V0 = f2;
            this.f7232W0 = f3;
            m3577u();
            if (runnableC1578v != null) {
                runnableC1578v.run();
                return;
            }
            return;
        }
        final float f4 = this.f7230V0;
        final float f5 = this.f7232W0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7236Y0 = ofFloat;
        ofFloat.setDuration(260L);
        AbstractC0062j.m166t(this.f7236Y0);
        final float f6 = f2;
        final float f7 = f3;
        this.f7236Y0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u0.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C1474D c1474d = C1474D.this;
                c1474d.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f8 = f6;
                float f9 = f4;
                c1474d.f7230V0 = AbstractC0062j.m149c(f8, f9, floatValue, f9);
                float f10 = f7;
                float f11 = f5;
                c1474d.f7232W0 = AbstractC0062j.m149c(f10, f11, floatValue, f11);
                c1474d.m3577u();
            }
        });
        this.f7236Y0.addListener(new C1468A(this, f2, f3, runnableC1578v));
        this.f7236Y0.start();
    }

    /* renamed from: b0 */
    public final void m3547b0(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f7248d;
        if (!cfgdata.f2537K2) {
            ImageView imageView2 = this.f7267l0;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView2 = this.f7269m0;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            ImageView imageView3 = this.f7271n0;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
                return;
            }
            return;
        }
        byte b2 = (byte) (i & 15);
        byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite) {
            b3 = 1;
            b2 = 1;
        }
        if (b2 == 1) {
            ImageView imageView4 = this.f7267l0;
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            TextView textView3 = this.f7269m0;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        } else if (b2 == 2) {
            ImageView imageView5 = this.f7267l0;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                this.f7267l0.setColorFilter(-7829368);
            }
            TextView textView4 = this.f7269m0;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (b2 == 3) {
            ImageView imageView6 = this.f7267l0;
            if (imageView6 != null) {
                imageView6.setVisibility(0);
                this.f7267l0.setColorFilter(-16711936);
            }
            TextView textView5 = this.f7269m0;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
        if (this.f7251e.m1747f() < 20 && (textView = this.f7269m0) != null) {
            textView.setVisibility(4);
        }
        if (b3 == 1) {
            ImageView imageView7 = this.f7271n0;
            if (imageView7 != null) {
                imageView7.setVisibility(4);
                return;
            }
            return;
        }
        if (b3 == 2) {
            ImageView imageView8 = this.f7271n0;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
                this.f7271n0.setColorFilter(-7829368);
                return;
            }
            return;
        }
        if (b3 != 3 || (imageView = this.f7271n0) == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f7271n0.setColorFilter(-16711936);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001b, code lost:
    
        if (r10 == 2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3548c0(int i) {
        int i2;
        ImageView imageView = this.f7274p;
        if (imageView == null || this.f7276q == null) {
            return;
        }
        cfgData cfgdata = this.f7248d;
        if (cfgdata.f2641i2 && cfgdata.f2615d1.f7096F) {
            i2 = i == 1 ? 1 : 2;
            if (i2 != this.f7220Q0) {
                return;
            }
            this.f7220Q0 = i2;
            if (i2 == 0) {
                imageView.setImageResource(f7185h1);
                this.f7276q.setImageResource(f7186i1);
                return;
            } else {
                int i3 = i2 == 1 ? -65536 : f7184g1;
                EnumC1456b enumC1456b = cfgdata.f2615d1;
                AbstractC1261H.m3036a(this.f7245c, imageView, f7185h1, i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                AbstractC1261H.m3036a(this.f7245c, this.f7276q, f7186i1, i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                return;
            }
        }
        i2 = 0;
        if (i2 != this.f7220Q0) {
        }
    }

    /* renamed from: d */
    public final void m3549d() {
        cfgData cfgdata = this.f7248d;
        if (!cfgdata.f2537K2) {
            ViewGroup viewGroup = this.f7203I;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            m3514v0(this.f7219Q, false);
            return;
        }
        boolean z2 = cfgdata.f2569S2;
        boolean z3 = cfgdata.f2577U2;
        boolean z4 = cfgdata.f2573T2;
        boolean z5 = z3 || z4;
        boolean z6 = z2 || z5;
        ViewGroup viewGroup2 = this.f7203I;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(z6 ? 0 : 8);
        }
        m3513u0(this.f7205J, z2);
        m3513u0(this.f7207K, z2);
        ViewGroup viewGroup3 = this.f7209L;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(z5 ? 0 : 8);
        }
        m3513u0(this.f7211M, z3);
        m3513u0(this.f7213N, z3);
        m3513u0(this.f7215O, z4);
        m3513u0(this.f7217P, z4);
        TextView textView = this.f7215O;
        Context context = this.f7245c;
        if (textView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int round = Math.round(context.getResources().getDisplayMetrics().density * 12.0f);
            if (!z3) {
                round = 0;
            }
            marginLayoutParams.setMarginStart(round);
            this.f7215O.setLayoutParams(marginLayoutParams);
        }
        m3514v0(this.f7219Q, cfgdata.f2581V2);
        boolean z7 = cfgdata.useJourneyFuel;
        m3514v0(this.f7290x, z7);
        m3514v0(this.f7288w, z7);
        m3514v0(this.f7292y, z7);
        boolean z8 = z2 && !z5;
        boolean z9 = !z2 && z5;
        ViewGroup viewGroup4 = this.f7203I;
        if (viewGroup4 != null) {
            C1592d c1592d = (C1592d) viewGroup4.getLayoutParams();
            if (z8 || z9) {
                c1592d.f9046i = R.id.theme_41_bottom_panel;
                c1592d.f9052l = R.id.theme_41_bottom_panel;
                ((ViewGroup.MarginLayoutParams) c1592d).bottomMargin = 0;
                c1592d.f9009F = 0.5f;
            } else {
                c1592d.f9046i = -1;
                c1592d.f9052l = 0;
                ((ViewGroup.MarginLayoutParams) c1592d).bottomMargin = Math.round(context.getResources().getDisplayMetrics().density * 12.0f);
                c1592d.f9009F = 0.5f;
            }
            this.f7203I.setLayoutParams(c1592d);
            TextView textView2 = this.f7205J;
            if (textView2 != null) {
                C1592d c1592d2 = (C1592d) textView2.getLayoutParams();
                if (z8) {
                    c1592d2.f9050k = -1;
                    c1592d2.f9052l = R.id.theme_41_odo_wrap;
                    c1592d2.f9046i = R.id.theme_41_odo_wrap;
                    c1592d2.f9009F = 0.5f;
                } else {
                    c1592d2.f9052l = -1;
                    c1592d2.f9050k = R.id.theme_41_odo_day_row;
                    c1592d2.f9046i = R.id.theme_41_odo_wrap;
                    c1592d2.f9009F = 0.5f;
                }
                this.f7205J.setLayoutParams(c1592d2);
            }
            ViewGroup viewGroup5 = this.f7209L;
            if (viewGroup5 != null) {
                C1592d c1592d3 = (C1592d) viewGroup5.getLayoutParams();
                if (z9) {
                    c1592d3.f9046i = R.id.theme_41_odo_wrap;
                    c1592d3.f9052l = R.id.theme_41_odo_wrap;
                    c1592d3.f9048j = -1;
                    c1592d3.f9009F = 0.5f;
                } else {
                    c1592d3.f9046i = -1;
                    c1592d3.f9052l = R.id.theme_41_odo_wrap;
                    c1592d3.f9048j = R.id.theme_41_odo_label;
                    c1592d3.f9009F = 0.5f;
                }
                this.f7209L.setLayoutParams(c1592d3);
            }
        }
        ViewGroup viewGroup6 = this.f7209L;
        if (viewGroup6 == null) {
            return;
        }
        C1592d c1592d4 = (C1592d) viewGroup6.getLayoutParams();
        if (z5) {
            c1592d4.f9065t = R.id.theme_41_bottom_panel;
            c1592d4.f9067v = R.id.theme_41_bottom_panel;
            c1592d4.f9008E = 0.5f;
        } else {
            c1592d4.f9065t = R.id.theme_41_odo_wrap;
            c1592d4.f9067v = R.id.theme_41_odo_wrap;
        }
        this.f7209L.setLayoutParams(c1592d4);
    }

    /* renamed from: d0 */
    public final void m3550d0() {
        TextView textView = this.f7243b0;
        if (textView == null) {
            return;
        }
        if (!this.f7248d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f7251e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f7243b0.setVisibility(4);
            return;
        }
        this.f7243b0.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f7243b0, -7829368, -1), 0, replace.length(), 33);
        this.f7243b0.setText(spannableString);
    }

    /* renamed from: e */
    public final void m3551e(boolean z2, View view, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, float f2, float f3) {
        if (view == null || imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1578v(this, 0));
            return;
        }
        if (f3 <= 0.0f) {
            m3553f(view, 0.0f, 0.0f, false);
            m3553f(view2, 0.0f, 0.0f, view2 == this.f7227U);
            m3553f(textView2, 0.0f, 0.0f, false);
            m3553f(textView3, 0.0f, 0.0f, false);
            m3553f(textView4, 0.0f, 0.0f, false);
            m3512t0(textView, true);
            return;
        }
        m3512t0(textView, false);
        float width = (imageView.getWidth() * 0.5f) + imageView.getLeft();
        float width2 = (width - ((view.getWidth() * 0.5f) + view.getLeft())) * f3;
        float height = ((((imageView.getHeight() * 0.58f) + imageView.getTop()) + f2) - ((view.getHeight() * 0.5f) + view.getTop())) * f3;
        float f4 = 50.0f * f3;
        float f5 = 140.0f * f3;
        if (!z2) {
            f4 = -f4;
        }
        float f6 = width2 + f4;
        if (z2) {
            f6 -= f3 * 40.0f;
        }
        float f7 = height + f5;
        m3553f(view, f6, f7, false);
        m3553f(view2, f6, f7, view2 == this.f7227U);
        m3553f(textView2, f6, f7, false);
        m3553f(textView3, f6, f7, false);
        m3553f(textView4, f6, f7, false);
    }

    /* renamed from: e0 */
    public final void m3552e0(C0636d c0636d) {
        View view = this.f7273o0;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        cfgData cfgdata = this.f7248d;
        if (!cfgdata.f2585W2 || m3535R() || m3534Q() || ((cfgdata.f2561Q2 && !this.f7196E0) || c0636d == null || !c0636d.m1851a())) {
            this.f7273o0.setVisibility(8);
            return;
        }
        this.f7273o0.setVisibility(0);
        TextView textView = this.f7277q0;
        if (textView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f7279r0;
        if (textView2 != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            this.f7279r0.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f7275p0;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f7275p0.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f7275p0.setVisibility(8);
            }
        }
        this.f7289w0 = c0636d.f3002h;
        this.f7287v0 = c0636d.f3001g;
        this.f7291x0 = c0636d.f3000f;
        this.f7293y0 = SystemClock.elapsedRealtime();
        m3567m(this.f7287v0);
        m3578v();
    }

    /* renamed from: f */
    public final void m3553f(View view, float f2, float f3, boolean z2) {
        if (view == null) {
            return;
        }
        view.setTranslationX((z2 ? this.f7228U0 : 0.0f) + f2);
        view.setTranslationY(f3);
    }

    /* renamed from: f0 */
    public final void m3554f0() {
        ImageView imageView = this.f7252e0;
        carData cardata = this.f7251e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f7255f0 != null) {
            this.f7255f0.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f7255f0.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
    }

    /* renamed from: g */
    public final void m3555g(ImageView imageView, ImageView imageView2, TextView textView, float f2, boolean z2, float f3, float f4, float f5) {
        float width;
        float f6;
        if (imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1578v(this, 12));
            return;
        }
        float f7 = f3 - 1.0f;
        if (Math.abs(f7) < 0.001f) {
            m3507m0(imageView, f4, f5);
            m3562j0(imageView2);
            m3507m0(textView, f4, f2 + f5);
            return;
        }
        float width2 = z2 ? imageView.getWidth() + r0 : imageView.getLeft();
        float top = imageView.getTop();
        float f8 = 0.0f;
        if (Math.abs(f7) < 0.001f) {
            width = 0.0f;
        } else {
            width = imageView.getWidth() * 0.13f * f7;
            if (!z2) {
                width = -width;
            }
        }
        if (Math.abs(f7) < 0.001f) {
            f6 = 0.0f;
        } else {
            f6 = (10.0f * f7) / 0.29999995f;
            if (!z2) {
                f6 = -f6;
            }
        }
        float f9 = width + f6;
        float f10 = Math.abs(f7) < 0.001f ? 0.0f : (((-20.0f) * f7) / 0.29999995f) + ((-imageView.getHeight()) * 0.13f * f7);
        m3501A(imageView, f3, width2, top, f4, f5, f9, f10);
        m3570o(imageView2, imageView, f3, width2, top, f9 + f4, f10 + f5);
        float f11 = f2 + f10;
        if (Math.abs(f7) >= 0.001f) {
            float m3505K = m3505K(f3);
            f8 = (((-imageView.getHeight()) * 0.16f) * m3505K) - (m3505K * 120.0f);
        }
        m3501A(textView, f3, width2, top, f4, f5, f9, f11 + f8 + f5);
    }

    /* renamed from: g0 */
    public final void m3556g0() {
        if (this.f7249d0 == null) {
            return;
        }
        float m1773s = this.f7251e.m1773s();
        if (m1773s < -90.0f) {
            this.f7249d0.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        this.f7249d0.setTextColor(-7829368);
        spannableString.setSpan(new ForegroundColorSpan(f7183f1), 0, replace.length(), 33);
        this.f7249d0.setText(spannableString);
    }

    /* renamed from: h */
    public final void m3557h(ImageView imageView, boolean z2) {
        if (imageView == null) {
            return;
        }
        C1592d c1592d = (C1592d) imageView.getLayoutParams();
        int round = Math.round(this.f7245c.getResources().getDisplayMetrics().density * 25.0f);
        c1592d.f9065t = -1;
        c1592d.f9064s = -1;
        c1592d.f9066u = -1;
        c1592d.f9067v = -1;
        c1592d.f9040f = -1;
        c1592d.f9042g = -1;
        if (z2) {
            c1592d.f9038e = -1;
            c1592d.f9044h = 0;
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = round;
        } else {
            c1592d.f9044h = -1;
            c1592d.f9038e = 0;
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = round;
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = 0;
        }
        imageView.setLayoutParams(c1592d);
    }

    /* renamed from: h0 */
    public final void m3558h0() {
        cfgData cfgdata = this.f7248d;
        if (cfgdata.f2537K2 && m3534Q() && !m3529L()) {
            carData cardata = this.f7251e;
            float m1780z = cardata.m1780z();
            float f2 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
            float m1779y = cardata.m1779y() / 1000.0f;
            float f3 = m1779y >= 0.0f ? m1779y : 0.0f;
            TextView textView = this.f7261i0;
            int i = -1;
            if (textView != null) {
                textView.setTextColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : -1);
                this.f7261i0.setText(m3503I(f2));
            }
            TextView textView2 = this.f7263j0;
            if (textView2 != null) {
                if (f3 > cfgdata.f2576U1) {
                    i = -65536;
                } else if (f3 > cfgdata.f2572T1) {
                    i = -256;
                }
                textView2.setTextColor(i);
                this.f7263j0.setText(AbstractC1256E0.m2986A(f3));
            }
        }
    }

    /* renamed from: i */
    public final void m3559i(boolean z2) {
        boolean z3 = this.f7248d.f2636h2;
        if (z2 || !Boolean.valueOf(z3).equals(this.f7222R0)) {
            this.f7222R0 = Boolean.valueOf(z3);
            this.f7216O0 = false;
            ImageView imageView = this.f7274p;
            if (imageView != null) {
                imageView.setLayoutDirection(z3 ? 1 : 0);
            }
            ImageView imageView2 = this.f7276q;
            if (imageView2 != null) {
                imageView2.setLayoutDirection(z3 ? 1 : 0);
            }
            ImageView imageView3 = this.f7278r;
            if (imageView3 != null) {
                imageView3.setLayoutDirection(z3 ? 1 : 0);
            }
            ImageView imageView4 = this.f7280s;
            if (imageView4 != null) {
                imageView4.setLayoutDirection(z3 ? 1 : 0);
            }
            TextView textView = this.f7257g0;
            if (textView != null) {
                textView.setLayoutDirection(z3 ? 1 : 0);
            }
            TextView textView2 = this.f7259h0;
            if (textView2 != null) {
                textView2.setLayoutDirection(z3 ? 1 : 0);
            }
            m3557h(this.f7274p, z3);
            m3557h(this.f7276q, !z3);
            ImageView imageView5 = this.f7278r;
            if (imageView5 != null && this.f7188A0 != null) {
                imageView5.post(new RunnableC1578v(this, 4));
            }
            ImageView imageView6 = this.f7280s;
            if (imageView6 != null && this.f7190B0 != null) {
                imageView6.post(new RunnableC1578v(this, 5));
            }
            m3572p();
            carData cardata = this.f7251e;
            m3548c0(cardata.m1753i());
            m3547b0(cardata.m1745e());
        }
    }

    /* renamed from: i0 */
    public final void m3560i0() {
        ImageView m3537T = m3537T();
        boolean z2 = this.f7248d.f2636h2;
        ImageView imageView = z2 ? this.f7280s : this.f7278r;
        TextView textView = z2 ? this.f7259h0 : this.f7257g0;
        m3507m0(m3537T, 0.0f, 0.0f);
        m3562j0(imageView);
        m3507m0(textView, 0.0f, m3538U());
    }

    /* renamed from: j */
    public final void m3561j(View view, float f2) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        float f3 = 0.0f;
        if (f2 <= 0.0f) {
            view.setTranslationY(0.0f);
            return;
        }
        float f4 = this.f7245c.getResources().getDisplayMetrics().density * 40.0f;
        for (View view2 = view; view2 != null && view2 != this.f7256g; view2 = (View) view2.getParent()) {
            f3 += view2.getTop();
            if (!(view2.getParent() instanceof View)) {
                break;
            }
        }
        view.setTranslationY(((this.f7256g.getHeight() - f3) + f4) * f2);
    }

    /* renamed from: j0 */
    public final void m3562j0(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        m3507m0(imageView, 0.0f, 0.0f);
        if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        }
        C1472C c1472c = imageView == this.f7278r ? this.f7188A0 : this.f7190B0;
        if (c1472c != null) {
            c1472c.m3499a(imageView);
        }
    }

    /* renamed from: k */
    public final void m3563k() {
        if (this.f7244b1 == null) {
            C1525c c1525c = new C1525c(-15722462);
            this.f7244b1 = c1525c;
            c1525c.m4164f(1716503543);
        }
        C1574t m3569n0 = m3569n0();
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        this.f7256g.setBackgroundResource(android.R.color.transparent);
        if (!m3569n0.m4472a() || m3519C0()) {
            if (m3569n0.m4472a()) {
                m3531N();
            }
            m3565l();
        } else if (m3519C0()) {
            m3531N();
            m3565l();
            m3524F0();
        } else if (this.f7272o == null) {
            m3531N();
            this.f7244b1.m4163e(null);
            this.f7244b1.m4162d(m3582x0() ? -15854822 : -15722462);
            this.f7256g.setLayerType(1, null);
            this.f7256g.setBackground(this.f7244b1);
        } else if (m3532O() && this.f7272o.getBackground() == this.f7244b1) {
            this.f7272o.setLayerType(1, null);
            m3524F0();
        } else {
            this.f7272o.setVisibility(0);
            this.f7272o.setLayerType(1, null);
            this.f7272o.setBackground(null);
            RunnableC0123b runnableC0123b = new RunnableC0123b(this, 3, m3569n0);
            if (m3569n0.f8687b != 0) {
                runnableC0123b.run();
            } else {
                Uri uri = m3569n0.f8688c;
                if (uri != null) {
                    this.f7272o.setImageURI(uri);
                    this.f7272o.post(runnableC0123b);
                }
            }
        }
        m3524F0();
    }

    /* renamed from: k0 */
    public final void m3564k0() {
        this.f7254f.removeCallbacks(this.f7206J0);
        m3520D();
        this.f7198F0 = true;
        this.f7210L0 = 0.0f;
        this.f7216O0 = false;
        AbstractC1372y1.m3287R(false, false);
    }

    /* renamed from: l */
    public final void m3565l() {
        if (this.f7272o == null) {
            m3531N();
            this.f7244b1.m4163e(null);
            this.f7244b1.m4162d(m3582x0() ? -15854822 : -15722462);
            this.f7256g.setLayerType(1, null);
            this.f7256g.setBackground(this.f7244b1);
            return;
        }
        if (m3532O()) {
            Drawable background = this.f7272o.getBackground();
            C1525c c1525c = this.f7244b1;
            if (background == c1525c) {
                c1525c.m4163e(null);
                this.f7244b1.m4162d(m3582x0() ? -15854822 : -15722462);
                this.f7272o.setLayerType(1, null);
                return;
            }
        }
        this.f7272o.setVisibility(0);
        this.f7272o.setLayerType(1, null);
        this.f7272o.setImageDrawable(null);
        this.f7272o.setBackground(null);
        this.f7244b1.m4163e(null);
        this.f7244b1.m4162d(m3582x0() ? -15854822 : -15722462);
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
            this.f7256g.setBackgroundResource(android.R.color.transparent);
        }
        this.f7272o.setBackground(this.f7244b1);
    }

    /* renamed from: l0 */
    public final void m3566l0() {
        ImageView m3571o0 = m3571o0();
        boolean z2 = this.f7248d.f2636h2;
        ImageView imageView = z2 ? this.f7278r : this.f7280s;
        TextView textView = z2 ? this.f7257g0 : this.f7259h0;
        m3507m0(m3571o0, 0.0f, 0.0f);
        m3562j0(imageView);
        m3507m0(textView, 0.0f, m3573p0());
    }

    /* renamed from: m */
    public final void m3567m(long j2) {
        boolean z2 = this.f7289w0 > 0;
        ProgressBar progressBar = this.f7285u0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7285u0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7289w0)));
            }
        }
        TextView textView = this.f7281s0;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7281s0.setText(m3504J(j2));
            }
        }
        TextView textView2 = this.f7283t0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7283t0.setText(m3504J(this.f7289w0));
            }
        }
    }

    /* renamed from: n */
    public final void m3568n() {
        ViewGroup viewGroup;
        if (this.f7258h == null || (viewGroup = this.f7256g) == null) {
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7256g.getHeight() <= 0) {
            this.f7256g.post(new RunnableC1578v(this, 6));
            return;
        }
        if (this.f7258h.getLayoutParams() instanceof C1592d) {
            RectF m3539V = (!m3528H0() || m3584y0()) ? m3539V() : m3540W();
            C1592d c1592d = (C1592d) this.f7258h.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m3539V.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m3539V.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m3539V.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m3539V.top);
            this.f7258h.setLayoutParams(c1592d);
        }
    }

    /* renamed from: n0 */
    public final C1574t m3569n0() {
        int i;
        cfgData cfgdata = this.f7248d;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        if (enumC1455a == EnumC1455a.f6949f) {
            return new C1574t(0, null, 1);
        }
        int i2 = cfgdata.f2630g1;
        if (i2 < 31) {
            int i3 = enumC1455a.f7036d;
            return i3 != 0 ? new C1574t(i3, null, 1) : new C1574t(0, null, 1);
        }
        String[] strArr = cfgdata.f2603b;
        if (strArr != null && i2 >= 31 && (i = i2 - 31) >= 0 && i < strArr.length) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata.f2603b[i]);
            if (file.exists()) {
                return new C1574t(0, Uri.fromFile(file), 1);
            }
        }
        return new C1574t(0, null, 1);
    }

    /* renamed from: o */
    public final void m3570o(ImageView imageView, ImageView imageView2, float f2, float f3, float f4, float f5, float f6) {
        if (imageView == null || imageView2 == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1578v(this, 2));
            return;
        }
        float width = (imageView2.getWidth() * 0.5f) + imageView2.getLeft();
        float m149c = AbstractC0062j.m149c(width, f3, f2, f3);
        imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setTranslationX((m149c - ((imageView.getWidth() * 0.5f) + imageView.getLeft())) + f5);
        imageView.setTranslationY((AbstractC0062j.m149c((imageView2.getHeight() * 0.5f) + imageView2.getTop(), f4, f2, f4) - ((imageView.getHeight() * 0.5f) + imageView.getTop())) + f6 + 0.0f);
        C1472C c1472c = imageView == this.f7278r ? this.f7188A0 : this.f7190B0;
        if (c1472c != null) {
            c1472c.m3499a(imageView);
        }
    }

    /* renamed from: o0 */
    public final ImageView m3571o0() {
        return this.f7248d.f2636h2 ? this.f7274p : this.f7276q;
    }

    /* renamed from: p */
    public final void m3572p() {
        m3579w();
        m3574q();
        boolean m3529L = m3529L();
        ImageView m3537T = m3537T();
        cfgData cfgdata = this.f7248d;
        boolean z2 = cfgdata.f2636h2;
        ImageView imageView = z2 ? this.f7280s : this.f7278r;
        TextView textView = z2 ? this.f7259h0 : this.f7257g0;
        m3514v0(m3537T, m3529L);
        m3514v0(imageView, m3529L);
        m3514v0(textView, m3529L && AbstractC1539g1.m4220h0(cfgdata, null));
        if (!m3529L) {
            m3560i0();
        } else if (m3536S()) {
            m3555g(m3537T, imageView, textView, m3538U(), false, this.f7230V0, 0.0f, 0.0f);
        } else {
            m3560i0();
        }
        m3578v();
        m3576t();
        m3575r();
    }

    /* renamed from: p0 */
    public final float m3573p0() {
        return this.f7248d.f2636h2 ? this.f7224S0 : this.f7226T0;
    }

    /* renamed from: q */
    public final void m3574q() {
        boolean z2;
        int i = 2;
        boolean z3 = m3529L() && (((z2 = this.f7198F0) && this.f7210L0 <= 0.0f) || z2 || this.f7210L0 < 1.0f);
        ImageView m3571o0 = m3571o0();
        cfgData cfgdata = this.f7248d;
        boolean z4 = cfgdata.f2636h2;
        ImageView imageView = z4 ? this.f7278r : this.f7280s;
        TextView textView = z4 ? this.f7257g0 : this.f7259h0;
        m3514v0(m3571o0, z3);
        m3514v0(imageView, z3);
        m3514v0(textView, z3 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (!z3) {
            m3566l0();
            return;
        }
        if (m3536S()) {
            float[] fArr = new float[2];
            m3530M(fArr);
            m3555g(m3571o0, imageView, textView, m3573p0(), true, (1.0f - this.f7210L0) * this.f7230V0, fArr[0], fArr[1]);
            return;
        }
        boolean z5 = this.f7198F0;
        float f2 = (!z5 || this.f7210L0 > 0.0f) ? this.f7210L0 : 0.0f;
        float max = (!z5 || this.f7210L0 > 0.0f) ? Math.max(0.0f, 1.0f - this.f7210L0) : 1.0f;
        if (f2 <= 0.0f && Math.abs(max - 1.0f) < 0.001f) {
            m3566l0();
            return;
        }
        ImageView m3571o02 = m3571o0();
        if (m3571o02 == null) {
            return;
        }
        if (m3571o02.getWidth() <= 0 || m3571o02.getHeight() <= 0) {
            m3571o02.post(new RunnableC1578v(this, i));
            return;
        }
        float[] fArr2 = {this.f7216O0 ? this.f7212M0 : m3571o02.getLeft() + (m3571o02.getWidth() * 0.5f), this.f7216O0 ? this.f7214N0 : (m3571o02.getHeight() * 0.5f) + m3571o02.getTop()};
        float f3 = fArr2[0];
        float f4 = fArr2[1];
        float[] fArr3 = new float[2];
        m3530M(fArr3);
        boolean z6 = cfgdata.f2636h2;
        ImageView imageView2 = z6 ? this.f7278r : this.f7280s;
        TextView textView2 = z6 ? this.f7257g0 : this.f7259h0;
        float m3573p0 = m3573p0();
        m3501A(m3571o02, max, f3, f4, fArr3[0], fArr3[1], 0.0f, 0.0f);
        m3570o(imageView2, m3571o02, max, f3, f4, fArr3[0], fArr3[1]);
        m3501A(textView2, max, f3, f4, fArr3[0], fArr3[1], 0.0f, m3573p0);
    }

    /* renamed from: r */
    public final void m3575r() {
        ViewGroup viewGroup = this.f7256g;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getHeight() <= 0) {
            this.f7256g.post(new RunnableC1578v(this, 8));
            return;
        }
        float m3505K = m3505K(this.f7230V0);
        m3561j(this.f7286v, m3505K);
        m3561j(this.f7282t, m3505K);
        m3561j(this.f7284u, m3505K);
        m3561j(this.f7187A, m3505K);
        m3561j(this.f7294z, m3505K);
        m3561j(this.f7189B, m3505K);
        m3561j(this.f7290x, m3505K);
        m3561j(this.f7288w, m3505K);
        m3561j(this.f7292y, m3505K);
        m3561j(this.f7219Q, m3505K);
        m3561j(this.f7229V, m3505K);
        m3561j(this.f7231W, m3505K);
    }

    /* renamed from: t */
    public final void m3576t() {
        m3551e(true, this.f7197F, this.f7199G, this.f7193D, this.f7191C, this.f7195E, this.f7201H, m3537T(), m3538U(), m3505K(this.f7230V0));
        ProgressBar progressBar = this.f7225T;
        View view = this.f7227U;
        TextView textView = this.f7223S;
        TextView textView2 = this.f7221R;
        ImageView m3571o0 = m3571o0();
        float m3573p0 = m3573p0();
        float m3505K = m3505K(this.f7230V0);
        m3551e(false, progressBar, view, textView, textView2, null, null, m3571o0, m3573p0, m3505K > 0.0f ? (1.0f - this.f7210L0) * m3505K : 0.0f);
    }

    /* renamed from: u */
    public final void m3577u() {
        m3579w();
        m3578v();
        m3576t();
        m3575r();
        if (m3529L()) {
            ImageView m3537T = m3537T();
            cfgData cfgdata = this.f7248d;
            boolean z2 = cfgdata.f2636h2;
            m3555g(m3537T, z2 ? this.f7280s : this.f7278r, z2 ? this.f7259h0 : this.f7257g0, m3538U(), false, this.f7230V0, 0.0f, 0.0f);
            if (m3586z0()) {
                m3574q();
                return;
            }
            ImageView m3571o0 = m3571o0();
            boolean z3 = cfgdata.f2636h2;
            m3555g(m3571o0, z3 ? this.f7278r : this.f7280s, z3 ? this.f7257g0 : this.f7259h0, m3573p0(), true, this.f7230V0, 0.0f, 0.0f);
        }
    }

    /* renamed from: v */
    public final void m3578v() {
        View view = this.f7273o0;
        if (view == null || this.f7204I0 || !(view.getLayoutParams() instanceof C1592d)) {
            return;
        }
        C1592d c1592d = (C1592d) this.f7273o0.getLayoutParams();
        int round = Math.round(this.f7245c.getResources().getDisplayMetrics().density * 470.0f);
        if (Math.abs(this.f7230V0 - 1.0f) < 0.001f) {
            ((ViewGroup.MarginLayoutParams) c1592d).width = round;
            this.f7273o0.setLayoutParams(c1592d);
            return;
        }
        float f2 = round;
        float f3 = this.f7230V0 - 1.0f;
        int max = Math.max(1, Math.round(f2 - (Math.abs(f3) < 0.001f ? 0.0f : (f3 * 150.0f) / 0.29999995f)));
        if (((ViewGroup.MarginLayoutParams) c1592d).width != max) {
            ((ViewGroup.MarginLayoutParams) c1592d).width = max;
            this.f7273o0.setLayoutParams(c1592d);
        }
    }

    /* renamed from: w */
    public final void m3579w() {
        boolean m3528H0 = m3528H0();
        Boolean bool = this.f7234X0;
        if (bool == null || bool.booleanValue() != m3528H0) {
            this.f7234X0 = Boolean.valueOf(m3528H0);
            m3545a0();
        }
        if (this.f7258h != null && !m3582x0()) {
            if (m3535R()) {
                this.f7258h.setVisibility(0);
            } else if (m3528H0) {
                this.f7258h.setVisibility(4);
            } else if (!m3584y0()) {
                this.f7258h.setVisibility(8);
            }
        }
        if (m3528H0 && m3526G0()) {
            m3568n();
            m3524F0();
        } else if (!m3535R() && !m3534Q() && !m3586z0() && m3526G0()) {
            m3524F0();
        }
        boolean m3528H02 = m3528H0();
        float f2 = m3528H02 ? this.f7232W0 : 0.0f;
        if (!m3528H02 || m3534Q()) {
            View view = this.f7264k;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f7266l;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f7268m;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.f7262j;
            if (view4 != null) {
                view4.setBackgroundResource(R.drawable.ip_theme_41_bottom_bar);
            }
        } else {
            float f3 = this.f7245c.getResources().getDisplayMetrics().density;
            float f4 = (80.0f * f3) + 10.0f;
            float f5 = f3 * 14.0f;
            AbstractC1539g1.m4217g(this.f7264k, f4);
            AbstractC1539g1.m4217g(this.f7268m, f4);
            View view5 = this.f7266l;
            if (view5 != null) {
                AbstractC1539g1.m4217g(view5, f5 + 25.0f + 10.0f);
                C1528d c1528d = this.f7270n;
                if (c1528d != null) {
                    c1528d.m4167b(f5);
                }
            }
            m3510s(this.f7264k, f2, f4);
            m3510s(this.f7266l, f2, f5 + 25.0f + 10.0f);
            m3510s(this.f7268m, f2, f4);
            View view6 = this.f7262j;
            if (view6 != null) {
                if (f2 > 0.001f) {
                    view6.setBackground(null);
                } else if (view6 != null) {
                    view6.setBackgroundResource(R.drawable.ip_theme_41_bottom_bar);
                }
            }
            View view7 = this.f7264k;
            if (view7 != null) {
                view7.bringToFront();
            }
            View view8 = this.f7266l;
            if (view8 != null) {
                view8.bringToFront();
            }
            View view9 = this.f7268m;
            if (view9 != null) {
                view9.bringToFront();
            }
            View view10 = this.f7273o0;
            if (view10 != null) {
                view10.bringToFront();
            }
            ViewGroup viewGroup = this.f7203I;
            if (viewGroup != null) {
                viewGroup.bringToFront();
            }
            m3542Y();
        }
        if (this.f7203I == null) {
            return;
        }
        float f6 = m3528H0() ? this.f7232W0 : 0.0f;
        this.f7203I.setTranslationX((-200.0f) * f6);
        this.f7203I.setTranslationY(f6 * (-20.0f));
    }

    /* renamed from: w0 */
    public final void m3580w0(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        if (f2 == -99.0f || f2 == 3.5f) {
            textView.setText("--");
            textView.setTextColor(-16776961);
        } else {
            textView.setText(String.format(Locale.ENGLISH, f2 > 10.0f ? "%.0f" : "%.1f", Float.valueOf(f2)).replace(",", "."));
            float f3 = this.f7248d.f2580V1;
            textView.setTextColor(f2 < 0.95f * f3 ? -65536 : f2 < f3 ? -256 : f7183f1);
        }
    }

    /* renamed from: x */
    public final void m3581x() {
        View view = this.f7260i;
        if (view == null) {
            return;
        }
        cfgData cfgdata = this.f7248d;
        boolean z2 = cfgdata.f2625f1 != EnumC1455a.f6981n;
        boolean z3 = view.getVisibility() == 0;
        this.f7260i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            AbstractC1539g1.m4215f(R.drawable.ip_theme_41_top_bar, this.f7260i, AbstractC1539g1.m4230m0(cfgdata, this.f7251e));
            AbstractC1539g1.m4221i(this.f7246c0, this.f7249d0, cfgdata, m3529L());
        }
        if (z3 == z2 || !m3532O()) {
            return;
        }
        m3524F0();
    }

    /* renamed from: x0 */
    public final boolean m3582x0() {
        return m3534Q() || (this.f7248d.f2561Q2 && !this.f7196E0);
    }

    /* renamed from: y */
    public final void m3583y(TextView textView) {
        if (textView == null) {
            return;
        }
        if (Math.abs(0.0f) < 0.001f) {
            m3507m0(textView, 0.0f, 0.0f);
        } else if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.post(new RunnableC0018l(this, 24, textView));
        } else {
            m3501A(textView, 1.0f, textView.getLeft(), textView.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: y0 */
    public final boolean m3584y0() {
        return m3535R() && (!this.f7248d.f2561Q2 || this.f7196E0);
    }

    /* renamed from: z */
    public final void m3585z() {
        boolean z2 = this.f7248d.f2537K2 && m3534Q() && !m3529L();
        m3514v0(this.f7265k0, z2);
        m3514v0(this.f7261i0, z2);
        m3514v0(this.f7263j0, z2);
        m3583y(this.f7261i0);
        m3583y(this.f7263j0);
    }

    /* renamed from: z0 */
    public final boolean m3586z0() {
        if (m3533P()) {
            return !this.f7198F0 || this.f7210L0 > 0.0f;
        }
        return false;
    }
}
