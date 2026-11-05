package p098q0;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.InterfaceC0553r;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.p061ip.HolePunchImageView;
import com.altaysoft.t500_split.p061ip.HolePunchLayout;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import java.io.File;
import java.util.Locale;
import p001A0.RunnableC0029w;
import p003B.AbstractC0049p;
import p006C.AbstractC0062j;
import p022K.C0174W;
import p106t0.EnumC1455a;
import p106t0.EnumC1456b;
import p106t0.EnumC1457c;
import p109u0.AbstractC1539g1;
import p109u0.C1537g;
import p111v.C1592d;

/* renamed from: q0.O */
/* loaded from: classes.dex */
public final class C1275O extends ContextWrapper implements InterfaceC0553r {

    /* renamed from: v1 */
    public static final int f5796v1 = Color.rgb(67, 160, 71);

    /* renamed from: w1 */
    public static int f5797w1 = 999;

    /* renamed from: x1 */
    public static int f5798x1;

    /* renamed from: A */
    public C1260G0 f5799A;

    /* renamed from: A0 */
    public ImageView f5800A0;

    /* renamed from: B */
    public C1260G0 f5801B;

    /* renamed from: B0 */
    public TextView f5802B0;

    /* renamed from: C */
    public C1260G0 f5803C;

    /* renamed from: C0 */
    public TextView f5804C0;

    /* renamed from: D */
    public TextView f5805D;

    /* renamed from: D0 */
    public C1592d f5806D0;

    /* renamed from: E */
    public TextView f5807E;

    /* renamed from: E0 */
    public TextView f5808E0;

    /* renamed from: F */
    public View f5809F;

    /* renamed from: F0 */
    public ProgressBar f5810F0;

    /* renamed from: G */
    public HolePunchImageView f5811G;

    /* renamed from: G0 */
    public ImageView f5812G0;

    /* renamed from: H */
    public ImageView f5813H;

    /* renamed from: H0 */
    public TextView f5814H0;

    /* renamed from: I */
    public TextView f5815I;

    /* renamed from: I0 */
    public TextView f5816I0;

    /* renamed from: J */
    public TextView f5817J;

    /* renamed from: J0 */
    public TextView f5818J0;

    /* renamed from: K */
    public TextView f5819K;

    /* renamed from: K0 */
    public float f5820K0;

    /* renamed from: L */
    public View f5821L;

    /* renamed from: L0 */
    public float f5822L0;

    /* renamed from: M */
    public TextView f5823M;

    /* renamed from: M0 */
    public final RunnableC1265J f5824M0;

    /* renamed from: N */
    public TextView f5825N;

    /* renamed from: N0 */
    public boolean f5826N0;

    /* renamed from: O */
    public TextView f5827O;

    /* renamed from: O0 */
    public boolean f5828O0;

    /* renamed from: P */
    public TextView f5829P;

    /* renamed from: P0 */
    public HolePunchLayout f5830P0;

    /* renamed from: Q */
    public ImageView f5831Q;

    /* renamed from: Q0 */
    public ValueAnimator f5832Q0;

    /* renamed from: R */
    public ImageView f5833R;

    /* renamed from: R0 */
    public final RunnableC1265J f5834R0;

    /* renamed from: S */
    public TextView f5835S;

    /* renamed from: S0 */
    public boolean f5836S0;

    /* renamed from: T */
    public TextView f5837T;

    /* renamed from: T0 */
    public boolean f5838T0;

    /* renamed from: U */
    public TextView f5839U;

    /* renamed from: U0 */
    public boolean f5840U0;

    /* renamed from: V */
    public TextView f5841V;

    /* renamed from: V0 */
    public boolean f5842V0;

    /* renamed from: W */
    public TextView f5843W;

    /* renamed from: W0 */
    public boolean f5844W0;

    /* renamed from: X */
    public TextView f5845X;

    /* renamed from: X0 */
    public boolean f5846X0;

    /* renamed from: Y */
    public View f5847Y;

    /* renamed from: Y0 */
    public boolean f5848Y0;

    /* renamed from: Z */
    public TextView f5849Z;

    /* renamed from: Z0 */
    public boolean f5850Z0;

    /* renamed from: a0 */
    public TextView f5851a0;

    /* renamed from: a1 */
    public boolean f5852a1;

    /* renamed from: b0 */
    public TextView f5853b0;

    /* renamed from: b1 */
    public boolean f5854b1;

    /* renamed from: c0 */
    public TextView f5855c0;

    /* renamed from: c1 */
    public boolean f5856c1;

    /* renamed from: d0 */
    public TextView f5857d0;

    /* renamed from: d1 */
    public boolean f5858d1;

    /* renamed from: e0 */
    public TextView f5859e0;

    /* renamed from: e1 */
    public boolean f5860e1;

    /* renamed from: f */
    public final View f5861f;

    /* renamed from: f0 */
    public TextView f5862f0;

    /* renamed from: f1 */
    public boolean f5863f1;

    /* renamed from: g */
    public final Handler f5864g;

    /* renamed from: g0 */
    public TextView f5865g0;

    /* renamed from: g1 */
    public boolean f5866g1;

    /* renamed from: h */
    public final C0555t f5867h;

    /* renamed from: h0 */
    public TextView f5868h0;

    /* renamed from: h1 */
    public boolean f5869h1;

    /* renamed from: i */
    public boolean f5870i;

    /* renamed from: i0 */
    public TextView f5871i0;

    /* renamed from: i1 */
    public boolean f5872i1;

    /* renamed from: j */
    public final Handler f5873j;

    /* renamed from: j0 */
    public TextView f5874j0;

    /* renamed from: j1 */
    public boolean f5875j1;

    /* renamed from: k */
    public final Handler f5876k;

    /* renamed from: k0 */
    public TextView f5877k0;

    /* renamed from: k1 */
    public boolean f5878k1;

    /* renamed from: l */
    public final Handler f5879l;

    /* renamed from: l0 */
    public TextView f5880l0;

    /* renamed from: l1 */
    public ValueAnimator f5881l1;

    /* renamed from: m */
    public boolean f5882m;

    /* renamed from: m0 */
    public ProgressBar f5883m0;

    /* renamed from: m1 */
    public boolean f5884m1;

    /* renamed from: n */
    public ActivityManager f5885n;

    /* renamed from: n0 */
    public ImageView f5886n0;

    /* renamed from: n1 */
    public boolean f5887n1;

    /* renamed from: o */
    public ActivityManager.MemoryInfo f5888o;

    /* renamed from: o0 */
    public ImageView f5889o0;

    /* renamed from: o1 */
    public float f5890o1;

    /* renamed from: p */
    public final carData f5891p;

    /* renamed from: p0 */
    public ImageView f5892p0;

    /* renamed from: p1 */
    public float f5893p1;

    /* renamed from: q */
    public final cfgData f5894q;

    /* renamed from: q0 */
    public ImageView f5895q0;

    /* renamed from: q1 */
    public float f5896q1;

    /* renamed from: r */
    public ImageView f5897r;

    /* renamed from: r0 */
    public ImageView f5898r0;

    /* renamed from: r1 */
    public float f5899r1;

    /* renamed from: s */
    public ImageView f5900s;

    /* renamed from: s0 */
    public ImageView f5901s0;

    /* renamed from: s1 */
    public final RunnableC1273N f5902s1;

    /* renamed from: t */
    public ImageView f5903t;

    /* renamed from: t0 */
    public ImageView f5904t0;

    /* renamed from: t1 */
    public final RunnableC1273N f5905t1;

    /* renamed from: u */
    public ImageView f5906u;

    /* renamed from: u0 */
    public ImageView f5907u0;

    /* renamed from: u1 */
    public final RunnableC1273N f5908u1;

    /* renamed from: v */
    public int f5909v;

    /* renamed from: v0 */
    public ImageView f5910v0;

    /* renamed from: w */
    public int f5911w;

    /* renamed from: w0 */
    public ImageView f5912w0;

    /* renamed from: x */
    public int f5913x;

    /* renamed from: x0 */
    public ImageView f5914x0;

    /* renamed from: y */
    public int f5915y;

    /* renamed from: y0 */
    public ImageView f5916y0;

    /* renamed from: z */
    public C1260G0 f5917z;

    /* renamed from: z0 */
    public ProgressBar f5918z0;

    public C1275O(C1537g c1537g, View view) {
        super(c1537g);
        this.f5864g = new Handler(Looper.getMainLooper());
        C0555t c0555t = new C0555t(this);
        this.f5867h = c0555t;
        this.f5870i = true;
        this.f5873j = new Handler(Looper.getMainLooper());
        this.f5876k = new Handler(Looper.getMainLooper());
        this.f5879l = new Handler(Looper.getMainLooper());
        this.f5882m = false;
        this.f5891p = carData.getInstance();
        this.f5894q = cfgData.m1784i();
        this.f5909v = 590;
        this.f5911w = 0;
        this.f5913x = 0;
        this.f5915y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f5820K0 = 0.0f;
        this.f5822L0 = 0.0f;
        this.f5824M0 = new RunnableC1265J(this, 1);
        this.f5826N0 = true;
        this.f5834R0 = new RunnableC1265J(this, 2);
        this.f5836S0 = false;
        this.f5838T0 = true;
        this.f5840U0 = false;
        this.f5842V0 = false;
        this.f5844W0 = false;
        this.f5846X0 = false;
        this.f5848Y0 = false;
        this.f5850Z0 = false;
        this.f5852a1 = false;
        this.f5854b1 = false;
        this.f5856c1 = false;
        this.f5858d1 = false;
        this.f5860e1 = false;
        this.f5863f1 = false;
        this.f5866g1 = false;
        this.f5869h1 = false;
        this.f5872i1 = false;
        this.f5875j1 = false;
        this.f5878k1 = false;
        this.f5884m1 = false;
        this.f5887n1 = false;
        this.f5902s1 = new RunnableC1273N(this, 0);
        this.f5905t1 = new RunnableC1273N(this, 1);
        this.f5908u1 = new RunnableC1273N(this, 2);
        this.f5861f = view;
        EnumC0548m enumC0548m = EnumC0548m.f1991b;
        c0555t.m1379c("setCurrentState");
        c0555t.m1381e(enumC0548m);
    }

    /* renamed from: L */
    public static void m3045L(TextView textView, int i) {
        C1592d c1592d = (C1592d) textView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = i;
        textView.setLayoutParams(c1592d);
    }

    /* renamed from: M */
    public static void m3046M(TextView textView, int i) {
        C1592d c1592d = (C1592d) textView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = i;
        textView.setLayoutParams(c1592d);
    }

    /* renamed from: N */
    public static void m3047N(View view, int i, int i2) {
        C1592d c1592d = (C1592d) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) c1592d).bottomMargin = i2;
        view.setLayoutParams(c1592d);
    }

    /* renamed from: Q */
    public static void m3048Q(View view, int i, int i2, int i3) {
        C1592d c1592d = (C1592d) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d).width = i;
        ((ViewGroup.MarginLayoutParams) c1592d).height = i;
        ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = i2;
        ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = 0;
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = i3;
        view.setLayoutParams(c1592d);
    }

    /* renamed from: R */
    public static void m3049R(View view, boolean z2) {
        if (view != null) {
            view.setVisibility(z2 ? 0 : 4);
        }
    }

    /* renamed from: a */
    public static void m3050a(C1275O c1275o, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        c1275o.getClass();
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
            imageView2.setRotation(0.0f);
        }
        if (textView != null) {
            textView.setTranslationX(0.0f);
        }
        if (textView2 != null) {
            textView2.setTranslationX(0.0f);
        }
    }

    /* renamed from: g */
    public static void m3051g(ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, float f2, float f3, float f4) {
        if (imageView != null) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
            imageView.setTranslationX(f2 * f4);
            imageView.setRotation(f3 * f4);
        }
        if (imageView2 != null) {
            imageView2.setPivotY(AbstractC0062j.m153g(imageView2.getWidth(), 0.5f, imageView2) * 0.5f);
            imageView2.setTranslationX(f2 * f4);
            imageView2.setRotation(f3 * f4);
        }
        if (textView != null) {
            textView.setTranslationX(f2 * f4);
        }
        if (textView2 != null) {
            textView2.setTranslationX(f2 * f4);
        }
    }

    /* renamed from: A */
    public final void m3052A() {
        if (this.f5894q.f2543M0.f7147f) {
            carData cardata = this.f5891p;
            m3083r(R.id.id_RemainOdometer, "         ", cardata.m1778x(), "km", -1, "%.0f");
            m3054C(cardata.m1778x());
        }
    }

    /* renamed from: B */
    public final void m3053B() {
        if (this.f5894q.f2543M0.f7147f) {
            m3083r(R.id.id_RemainOdometer2, "         ", ((Float) this.f5891p.f2457k0.m1395d()).floatValue(), "km", -1, "%.0f");
        }
    }

    /* renamed from: C */
    public final void m3054C(float f2) {
        TextView textView = this.f5804C0;
        if (textView == null) {
            return;
        }
        textView.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(f2)));
    }

    /* renamed from: D */
    public final void m3055D(float f2) {
        if (f2 < -90.0f) {
            this.f5841V.setText("--°C");
        } else {
            m3083r(R.id.id_out_temp, "", f2, "°C", -1, "%.0f");
        }
    }

    /* renamed from: E */
    public final void m3056E() {
        int i;
        String str = ((double) this.f5891p.m1715C()) > 10.0d ? "%.0f" : "%.1f";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        double[] dArr = {r4.m1715C(), r4.m1716D(), r4.m1717E(), r4.m1718F()};
        String[] strArr = {"       ", "\n", "       ", ""};
        for (int i2 = 0; i2 < 4; i2++) {
            double d = dArr[i2];
            String replace = (d == -99.0d || d == 3.5d) ? "--" : String.format(Locale.ENGLISH, str, Double.valueOf(d)).replace(",", ".");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) replace);
            if (d == -99.0d) {
                i = -16776961;
            } else {
                double d2 = this.f5894q.f2580V1;
                i = d < 0.95d * d2 ? -65536 : d < d2 ? -256 : -1;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 33);
            if (i2 < 3) {
                spannableStringBuilder.append((CharSequence) strArr[i2]);
            }
        }
        this.f5827O.setText(spannableStringBuilder);
        this.f5829P.setText(spannableStringBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0024, code lost:
    
        if (r11 == 2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3057F(int i) {
        int i2;
        int i3;
        ImageView imageView = this.f5897r;
        if (imageView == null || this.f5900s == null || (i2 = this.f5911w) == 0 || this.f5913x == 0) {
            return;
        }
        cfgData cfgdata = this.f5894q;
        if (cfgdata.f2641i2 && cfgdata.f2615d1.f7096F) {
            i3 = i == 1 ? 1 : 2;
            if (i3 != this.f5915y) {
                return;
            }
            this.f5915y = i3;
            if (i3 == 0) {
                imageView.setImageResource(i2);
                this.f5900s.setImageResource(this.f5913x);
                return;
            }
            int i4 = i3 == 1 ? -65536 : f5796v1;
            EnumC1456b enumC1456b = cfgdata.f2615d1;
            int i5 = enumC1456b.f7097G;
            int i6 = enumC1456b.f7098H;
            float f2 = enumC1456b.f7099I;
            AbstractC1261H.m3036a(this, imageView, i2, i4, i5, i6, f2);
            AbstractC1261H.m3036a(this, this.f5900s, this.f5913x, i4, i5, i6, f2);
            return;
        }
        i3 = 0;
        if (i3 != this.f5915y) {
        }
    }

    /* renamed from: G */
    public final void m3058G() {
        this.f5864g.removeCallbacks(this.f5834R0);
        m3078m();
        this.f5828O0 = false;
        AbstractC1372y1.m3287R(false, false);
        HolePunchLayout holePunchLayout = this.f5830P0;
        if (holePunchLayout != null) {
            holePunchLayout.f2752L = false;
            holePunchLayout.f2745E = 0.0f;
            holePunchLayout.m1806l();
        }
        HolePunchImageView holePunchImageView = this.f5811G;
        if (holePunchImageView != null) {
            holePunchImageView.invalidate();
        }
        ImageView imageView = this.f5813H;
        if (imageView != null) {
            imageView.invalidate();
        }
        View view = this.f5809F;
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: H */
    public final void m3059H() {
        File file;
        HolePunchImageView holePunchImageView = this.f5811G;
        if (holePunchImageView != null) {
            holePunchImageView.m1802b();
        }
        boolean z2 = this.f5842V0;
        cfgData cfgdata = this.f5894q;
        if (z2) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            if (!this.f5826N0) {
                this.f5813H.setImageResource(R.drawable.ip_back_t500_navi__full_w_gauge_2);
                return;
            }
            int i = cfgdata.f2615d1.f7106f;
            if (i < 3) {
                this.f5813H.setImageResource(R.drawable.ip_back_style_type_1_gsize_0);
                return;
            } else if (i == 3) {
                this.f5813H.setImageResource(R.drawable.ip_back_style_type_1_gsize_3);
                return;
            } else {
                if (i == 4) {
                    this.f5813H.setImageResource(R.drawable.ip_back_style_type_1_gsize_4);
                    return;
                }
                return;
            }
        }
        if (!this.f5826N0) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        EnumC1456b enumC1456b = cfgdata.f2615d1;
        if (enumC1456b != EnumC1456b.GCircle && enumC1456b != EnumC1456b.TOG && cfgdata.f2625f1 != EnumC1455a.f6949f) {
            int i2 = cfgdata.f2630g1;
            if (i2 < 31) {
                this.f5811G.setImageResource(cfgdata.f2625f1.f7036d);
            } else {
                int i3 = i2 - 31;
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                String[] strArr = cfgdata.f2603b;
                if (strArr == null || i3 < 0 || i3 >= strArr.length) {
                    file = null;
                } else {
                    file = new File(externalStoragePublicDirectory, "GWMSplit_Styles/" + cfgdata.f2603b[i3]);
                }
                if (file == null || !file.exists()) {
                    this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
                } else {
                    this.f5811G.setImageURI(Uri.fromFile(file));
                }
            }
            if (this.f5840U0) {
                if (this.f5811G != null) {
                    Rect m4231n = AbstractC1539g1.m4231n(cfgdata.f2620e1);
                    AbstractC1256E0.m3025r(cfgdata, cfgdata.f2548N1, m4231n, 2);
                    float f2 = getResources().getDisplayMetrics().density;
                    this.f5811G.m1805f(new RectF(m4231n), 14.0f * f2, Math.max(1.5f, f2 * 1.5f));
                }
                this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
                return;
            }
            if (cfgdata.f2630g1 > 30) {
                this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
                return;
            }
            if (cfgdata.f2625f1.f7035c == 1) {
                if (cfgdata.f2615d1.f7106f < 3) {
                    this.f5813H.setImageResource(R.drawable.ip_back_style_type_1_gsize_0);
                    return;
                } else if (cfgdata.f2615d1.f7106f == 3) {
                    this.f5813H.setImageResource(R.drawable.ip_back_style_type_1_gsize_3);
                    return;
                } else {
                    if (cfgdata.f2615d1.f7106f == 4) {
                        this.f5813H.setImageResource(R.drawable.ip_back_style_type_1_gsize_4);
                        return;
                    }
                    return;
                }
            }
            if (cfgdata.f2625f1.f7035c == 2) {
                if (cfgdata.f2615d1.f7106f < 3) {
                    this.f5813H.setImageResource(R.drawable.ip_back_style_type_2_gsize_0);
                    return;
                } else if (cfgdata.f2615d1.f7106f == 3) {
                    this.f5813H.setImageResource(R.drawable.ip_back_style_type_2_gsize_3);
                    return;
                } else {
                    if (cfgdata.f2615d1.f7106f == 4) {
                        this.f5813H.setImageResource(R.drawable.ip_back_style_type_2_gsize_4);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i4 = cfgdata.f2620e1;
        if (i4 == 6) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 10) {
            if (!cfgdata.f2553O2 || cfgdata.f2625f1 == EnumC1455a.f6949f) {
                this.f5811G.setImageResource(R.drawable.ip_back_theme_10);
            } else {
                this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            }
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 11) {
            this.f5811G.setImageResource(R.drawable.ip_back_style_type_0_gsize_4);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 12) {
            this.f5811G.setImageResource(R.drawable.ip_back_3_circle);
            this.f5813H.setImageResource(R.drawable.ip_back_3_circle);
            return;
        }
        if (i4 == 21) {
            this.f5811G.setImageResource(R.drawable.ip_back_theme21);
            this.f5813H.setImageResource(R.drawable.ip_back_theme21);
            return;
        }
        if (i4 == 22) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 29) {
            this.f5811G.setImageResource(R.drawable.ip_back_theme_31);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 28) {
            this.f5811G.setImageResource(R.drawable.ip_back_theme_31);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 30) {
            this.f5811G.setImageResource(R.drawable.ip_back_theme_10);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 31) {
            this.f5811G.setImageResource(R.drawable.ip_back_theme_31);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 32) {
            this.f5811G.setImageResource(R.drawable.ip_back_theme_31);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 33) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_style_type_0_gsize_3);
            return;
        }
        if (i4 == 34) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_theme34);
            return;
        }
        if (i4 == 35) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_style_type_0_gsize_3);
            return;
        }
        if (i4 == 36) {
            this.f5811G.setImageResource(R.drawable.ip_back_theme_31);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        if (i4 == 38) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_style_type_0_gsize_3);
            return;
        }
        if (i4 == 40) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_transparent);
            return;
        }
        int i5 = cfgdata.f2615d1.f7106f;
        if (i5 == 3) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_style_type_0_gsize_3);
        } else if (i5 == 4) {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_style_type_0_gsize_4);
        } else {
            this.f5811G.setImageResource(R.drawable.ip_back_t500_transparent);
            this.f5813H.setImageResource(R.drawable.ip_back_t500_0);
        }
    }

    /* renamed from: I */
    public final void m3060I() {
        boolean z2 = this.f5878k1;
        this.f5897r.setLayoutDirection(z2 ? 1 : 0);
        this.f5900s.setLayoutDirection(z2 ? 1 : 0);
        this.f5903t.setLayoutDirection(z2 ? 1 : 0);
        this.f5906u.setLayoutDirection(z2 ? 1 : 0);
        cfgData cfgdata = this.f5894q;
        int i = cfgdata.f2620e1;
        if (i != 28 && i != 29 && i != 31 && i != 33 && i != 37) {
            this.f5901s0.setLayoutDirection(z2 ? 1 : 0);
            this.f5907u0.setLayoutDirection(z2 ? 1 : 0);
        }
        int i2 = cfgdata.f2620e1;
        if (i2 == 24) {
            if (this.f5878k1) {
                m3062K(R.drawable.theme_24_spd_r, R.drawable.theme_24_rpm_r);
            } else {
                m3062K(R.drawable.theme_24_spd, R.drawable.theme_24_rpm);
            }
        } else if (i2 == 25) {
            if (this.f5878k1) {
                m3062K(R.drawable.theme_25_spd_r, R.drawable.theme_25_rpm_r);
            } else {
                m3062K(R.drawable.theme_25_spd, R.drawable.theme_25_rpm);
            }
        } else if (i2 == 33) {
            if (this.f5878k1) {
                m3062K(R.drawable.theme_33_spd_r, R.drawable.theme_33_rpm_r);
            } else {
                m3062K(R.drawable.theme_33_spd, R.drawable.theme_33_rpm);
            }
        } else if (i2 != 37) {
            EnumC1456b enumC1456b = cfgdata.f2615d1;
            m3062K(enumC1456b.f7108h, enumC1456b.f7109i);
        } else if (this.f5878k1) {
            m3062K(R.drawable.theme_33_spd_r, R.drawable.theme_33_rpm_r);
        } else {
            m3062K(R.drawable.theme_33_spd, R.drawable.theme_33_rpm);
        }
        this.f5903t.setImageResource(cfgdata.f2615d1.f7110j);
        this.f5906u.setImageResource(cfgdata.f2615d1.f7111k);
        this.f5907u0.setImageResource(cfgdata.f2615d1.f7115o);
        this.f5901s0.setImageResource(cfgdata.f2615d1.f7114n);
    }

    /* renamed from: J */
    public final void m3061J(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f5838T0 = true;
        ImageView imageView = this.f5910v0;
        C1592d c1592d = (C1592d) imageView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d).width = i;
        ((ViewGroup.MarginLayoutParams) c1592d).height = i;
        ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = i2;
        ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = 0;
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = i3;
        imageView.setLayoutParams(c1592d);
        ImageView imageView2 = this.f5912w0;
        C1592d c1592d2 = (C1592d) imageView2.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d2).width = i4;
        ((ViewGroup.MarginLayoutParams) c1592d2).height = i4;
        ((ViewGroup.MarginLayoutParams) c1592d2).leftMargin = i5;
        ((ViewGroup.MarginLayoutParams) c1592d2).rightMargin = 0;
        ((ViewGroup.MarginLayoutParams) c1592d2).topMargin = i6;
        imageView2.setLayoutParams(c1592d2);
        this.f5818J0.setTextSize(i7);
        Drawable drawable = (!this.f5840U0 || this.f5894q.f2620e1 > 40) ? null : getDrawable(R.drawable.ip_legacy_cruise_icon_bg);
        this.f5910v0.setBackground(drawable);
        this.f5912w0.setBackground(drawable);
        this.f5818J0.setBackground(drawable);
    }

    /* renamed from: K */
    public final void m3062K(int i, int i2) {
        this.f5911w = i;
        this.f5913x = i2;
        this.f5915y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        AbstractC1261H.m3039d();
        AbstractC1353s0.f6358a.evictAll();
        m3057F(this.f5891p.m1753i());
    }

    /* renamed from: O */
    public final void m3063O(View view, int i, int i2, int i3) {
        C1592d c1592d = (C1592d) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d).width = i;
        ((ViewGroup.MarginLayoutParams) c1592d).height = i;
        if (this.f5878k1) {
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = i2;
        } else {
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = i2;
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = 0;
        }
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = i3;
        view.setLayoutParams(c1592d);
    }

    /* renamed from: P */
    public final void m3064P(View view, int i, int i2, int i3, int i4) {
        C1592d c1592d = (C1592d) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1592d).width = i;
        ((ViewGroup.MarginLayoutParams) c1592d).height = i2;
        if (this.f5878k1) {
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = i3;
        } else {
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = i3;
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = 0;
        }
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = i4;
        view.setLayoutParams(c1592d);
    }

    /* renamed from: S */
    public final void m3065S(float f2, float f3) {
        m3078m();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f5832Q0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f5832Q0);
        this.f5832Q0.addUpdateListener(new C0174W(2, this));
        this.f5832Q0.addListener(new C1271M(this, f3, 0));
        this.f5832Q0.start();
    }

    /* renamed from: T */
    public final boolean m3066T() {
        cfgData cfgdata = this.f5894q;
        if (!cfgdata.f2709w0 || this.f5804C0 == null || this.f5842V0) {
            return false;
        }
        if (!this.f5826N0) {
            return true;
        }
        int i = cfgdata.f2620e1;
        return i <= 4 || i == 6 || i == 7 || i == 10 || i == 22 || i == 30;
    }

    /* renamed from: U */
    public final void m3067U(float f2) {
        if (this.f5830P0 == null) {
            return;
        }
        if (m3081p()) {
            f2 = 0.0f;
        }
        this.f5830P0.setRightQnxHoleOpenProgress(f2);
        this.f5828O0 = f2 > 0.5f;
        AbstractC1372y1.m3287R(f2 > 0.01f, true);
        if (f2 <= 0.0f) {
            HolePunchImageView holePunchImageView = this.f5811G;
            if (holePunchImageView != null) {
                holePunchImageView.invalidate();
            }
            ImageView imageView = this.f5813H;
            if (imageView != null) {
                imageView.invalidate();
            }
            View view = this.f5809F;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* renamed from: V */
    public final void m3068V() {
        int i;
        EnumC1455a enumC1455a;
        if (this.f5914x0 == null || this.f5916y0 == null) {
            return;
        }
        if (this.f5838T0) {
            cfgData cfgdata = this.f5894q;
            if (!cfgdata.f2553O2 && !AbstractC1539g1.m4199U(this.f5891p) && ((enumC1455a = cfgdata.f2625f1) == EnumC1455a.f6949f || enumC1455a == EnumC1455a.f6981n)) {
                i = 0;
                this.f5914x0.setVisibility(i);
                this.f5916y0.setVisibility(i);
            }
        }
        i = 4;
        this.f5914x0.setVisibility(i);
        this.f5916y0.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0fec  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x1024  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x10b2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x10fa  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x11bb  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x1216  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x12a8  */
    /* JADX WARN: Removed duplicated region for block: B:369:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x1065  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x1000  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0e2d  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0505  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3069W() {
        boolean z2;
        cfgData cfgdata;
        int i;
        cfgData cfgdata2;
        EnumC1456b enumC1456b;
        cfgData cfgdata3;
        HolePunchLayout holePunchLayout;
        HolePunchLayout holePunchLayout2;
        View view;
        boolean m3066T;
        cfgData cfgdata4;
        int i2;
        int i3;
        int i4;
        EnumC1455a enumC1455a;
        int i5;
        int i6;
        cfgData cfgdata5;
        EnumC1457c enumC1457c;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        cfgData cfgdata6;
        int i14;
        cfgData cfgdata7;
        cfgData cfgdata8;
        EnumC1456b enumC1456b2;
        int i15;
        int i16;
        int i17;
        TextView textView;
        int i18;
        boolean z3;
        int i19;
        cfgData cfgdata9;
        EnumC1456b enumC1456b3;
        m3049R(this.f5815I, false);
        m3049R(this.f5817J, false);
        this.f5840U0 = AbstractC1539g1.m4197S(this.f5894q) && !this.f5894q.f2557P2;
        this.f5842V0 = AbstractC1539g1.m4197S(this.f5894q) && this.f5894q.f2557P2;
        EnumC1456b enumC1456b4 = this.f5894q.f2615d1;
        EnumC1456b enumC1456b5 = EnumC1456b.GCircle;
        this.f5863f1 = !(enumC1456b4 == enumC1456b5 || enumC1456b4 == EnumC1456b.TOG || this.f5894q.f2625f1 == EnumC1455a.f6949f || !this.f5826N0) || this.f5842V0;
        this.f5860e1 = (!this.f5840U0 || this.f5894q.f2620e1 == 10 || (this.f5840U0 && (enumC1456b3 = (cfgdata9 = this.f5894q).f2615d1) != enumC1456b5 && enumC1456b3 != EnumC1456b.TOG && cfgdata9.f2625f1 != EnumC1455a.f6949f)) ? false : true;
        this.f5848Y0 = this.f5826N0 && this.f5894q.f2615d1.m3480j();
        this.f5844W0 = this.f5826N0 && this.f5894q.f2615d1.m3483m() && AbstractC1539g1.m4220h0(this.f5894q, null);
        this.f5846X0 = this.f5826N0 && this.f5894q.f2615d1.m3482l() && AbstractC1539g1.m4220h0(this.f5894q, null);
        boolean z4 = this.f5826N0;
        this.f5850Z0 = !z4 && this.f5842V0;
        cfgData cfgdata10 = this.f5894q;
        boolean z5 = (cfgdata10.f2625f1.f7035c == 1 && z4 && !this.f5840U0) || this.f5842V0 || cfgdata10.f2615d1.m3479i() == 31;
        boolean z6 = z5 || (((i19 = this.f5894q.f2620e1) == 10 || i19 == 37) && this.f5826N0);
        this.f5858d1 = z6;
        boolean z7 = this.f5848Y0;
        this.f5856c1 = z7 && !z6;
        if (!z5 && z7) {
            cfgData cfgdata11 = this.f5894q;
            if (cfgdata11.f2581V2 && cfgdata11.f2620e1 != 37) {
                z2 = true;
                this.f5852a1 = z2;
                this.f5854b1 = (!z5 && this.f5894q.f2581V2) || (((i = (cfgdata = this.f5894q).f2620e1) == 10 || i == 37) && this.f5826N0 && cfgdata.f2581V2);
                cfgData cfgdata12 = this.f5894q;
                EnumC1456b enumC1456b6 = cfgdata12.f2615d1;
                this.f5869h1 = (((enumC1456b6 == enumC1456b5 && enumC1456b6 != EnumC1456b.TOG && cfgdata12.f2625f1 != EnumC1455a.f6949f && this.f5826N0) || this.f5842V0) && this.f5894q.f2615d1.f7106f < 3 && this.f5826N0 && !this.f5840U0) || ((enumC1456b = (cfgdata2 = this.f5894q).f2615d1) != enumC1456b5 && enumC1456b != EnumC1456b.TOG && cfgdata2.f2625f1.f7035c == 2 && enumC1456b.f7106f < 3 && this.f5826N0 && !this.f5840U0) || (this.f5842V0 && !this.f5826N0);
                if (this.f5894q.f2615d1.m3479i() == 28) {
                    this.f5869h1 = false;
                }
                if (this.f5894q.f2615d1.m3479i() == 29) {
                    this.f5869h1 = false;
                }
                if (this.f5894q.f2615d1.m3479i() == 31) {
                    this.f5869h1 = false;
                }
                if (this.f5894q.f2615d1.m3479i() == 32) {
                    this.f5869h1 = false;
                }
                cfgData cfgdata13 = this.f5894q;
                EnumC1456b enumC1456b7 = cfgdata13.f2615d1;
                boolean z8 = !enumC1456b7.f7125y && this.f5826N0;
                this.f5875j1 = z8;
                this.f5872i1 = z8 && (!(z3 = this.f5826N0) || (enumC1456b7.f7106f < 4 && z3));
                this.f5866g1 = !cfgdata13.f2561Q2 && this.f5826N0 && enumC1456b7.m3481k();
                cfgdata3 = this.f5894q;
                this.f5878k1 = (cfgdata3.f2636h2 || (i18 = cfgdata3.f2620e1) == 11 || i18 == 12 || i18 == 21 || i18 == 22 || i18 == 26 || i18 == 30 || i18 == 32 || i18 == 34 || i18 == 35 || i18 == 38) ? false : true;
                if (cfgdata3.f2620e1 == 37 && (!cfgdata3.f2553O2 || !cfgdata3.f2557P2)) {
                    m3045L(this.f5825N, 170);
                    m3045L(this.f5829P, 1550);
                }
                holePunchLayout = this.f5830P0;
                if (holePunchLayout != null) {
                    holePunchLayout.setQnxHoleEnabled(!m3081p());
                }
                if ((!m3081p() || AbstractC1372y1.m3272C()) && (this.f5828O0 || AbstractC1372y1.f6439i || ((holePunchLayout2 = this.f5830P0) != null && holePunchLayout2.m1807m()))) {
                    m3058G();
                }
                m3049R(this.f5897r, this.f5826N0);
                m3049R(this.f5900s, this.f5826N0);
                m3049R(this.f5903t, this.f5826N0);
                m3049R(this.f5906u, this.f5826N0);
                m3049R(this.f5898r0, false);
                m3049R(this.f5904t0, false);
                m3049R(this.f5901s0, this.f5866g1);
                m3049R(this.f5907u0, this.f5866g1);
                m3049R(this.f5839U, this.f5863f1);
                m3049R(this.f5841V, this.f5863f1);
                cfgData cfgdata14 = this.f5894q;
                EnumC1456b enumC1456b8 = cfgdata14.f2615d1;
                boolean z9 = (this.f5863f1 || !(enumC1456b8 == enumC1456b5 && enumC1456b8 != EnumC1456b.TOG && cfgdata14.f2625f1 != EnumC1455a.f6949f) || this.f5842V0) ? false : true;
                m3049R(this.f5821L, z9);
                view = this.f5821L;
                if (view != null && z9) {
                    view.setBackgroundResource(this.f5894q.f2630g1 > 30 ? R.drawable.ip_legacy_top_data_plain : R.drawable.ip_legacy_top_data_frame);
                }
                m3049R(this.f5895q0, this.f5860e1);
                m3049R(this.f5857d0, this.f5844W0);
                m3049R(this.f5859e0, this.f5846X0);
                m3049R(this.f5862f0, this.f5844W0);
                m3049R(this.f5865g0, this.f5846X0);
                m3049R(this.f5827O, this.f5852a1);
                m3049R(this.f5831Q, this.f5852a1);
                m3049R(this.f5823M, this.f5856c1);
                m3049R(this.f5829P, this.f5854b1);
                m3049R(this.f5833R, this.f5854b1);
                m3049R(this.f5825N, this.f5858d1);
                m3049R(this.f5847Y, this.f5850Z0);
                m3049R(this.f5845X, this.f5850Z0);
                m3049R(this.f5849Z, this.f5850Z0);
                m3049R(this.f5853b0, this.f5850Z0);
                m3049R(this.f5855c0, this.f5850Z0);
                m3049R(this.f5883m0, this.f5869h1);
                m3049R(this.f5886n0, this.f5869h1);
                m3049R(this.f5851a0, (this.f5872i1 || !this.f5894q.f2543M0.m3488c() || this.f5875j1) ? false : true);
                m3049R(this.f5877k0, this.f5875j1);
                m3049R(this.f5880l0, this.f5875j1);
                m3049R(this.f5802B0, this.f5869h1);
                m3066T = m3066T();
                m3049R(this.f5804C0, m3066T);
                if (m3066T) {
                    m3054C(this.f5894q.f2543M0.m3486a() ? this.f5891p.m1778x() : this.f5891p.m1777w());
                }
                m3049R(this.f5918z0, this.f5869h1);
                m3049R(this.f5800A0, this.f5869h1);
                m3049R(this.f5808E0, (this.f5872i1 || this.f5875j1) ? false : true);
                m3049R(this.f5814H0, !this.f5869h1 && this.f5894q.f2543M0.m3486a());
                m3049R(this.f5810F0, !this.f5869h1 && this.f5894q.f2543M0.m3486a());
                m3049R(this.f5812G0, !this.f5869h1 && this.f5894q.f2543M0.m3486a());
                m3049R(this.f5816I0, (this.f5872i1 || this.f5875j1 || !this.f5894q.f2543M0.m3486a()) ? false : true);
                this.f5838T0 = false;
                cfgdata4 = this.f5894q;
                if (cfgdata4.f2553O2) {
                    i2 = 20;
                    i3 = 32;
                    i4 = 12;
                    int i20 = cfgdata4.f2620e1;
                    if (i20 == 31) {
                        m3061J(70, 890, 100, 60, 960, 100, 24);
                    } else if (i20 == 32) {
                        m3061J(60, 900, 95, 55, 965, 95, 24);
                    } else if (i20 == 25 || i20 == 26) {
                        m3061J(70, 690, 100, 60, 760, 100, 24);
                    } else if (i20 == 5 || i20 == 8 || i20 == 9 || i20 == 12 || i20 == 13 || i20 == 14 || i20 == 15 || i20 == 16 || i20 == 17 || i20 == 19 || i20 == 20 || i20 == 23 || i20 == 24 || i20 == 27 || i20 == 28 || i20 == 29 || i20 == 39 || ((enumC1455a = cfgdata4.f2625f1) != EnumC1455a.f6949f && enumC1455a != EnumC1455a.f6981n && i20 != 6)) {
                        m3061J(70, 610, 100, 60, 1240, 100, 24);
                    }
                } else if (cfgdata4.f2557P2) {
                    int i21 = cfgdata4.f2620e1;
                    if (i21 == 5) {
                        i2 = 20;
                        i3 = 32;
                        i4 = 12;
                        m3061J(50, 370, 510, 50, 420, 510, 20);
                    } else {
                        i2 = 20;
                        i3 = 32;
                        i4 = 12;
                        if (i21 == 10) {
                            m3061J(50, 300, 645, 50, 350, 645, 20);
                        } else if (i21 == 19) {
                            m3061J(50, 300, 645, 50, 470, 645, 20);
                        } else if (i21 == 20) {
                            m3061J(50, 300, 645, 50, 470, 645, 20);
                        } else {
                            m3061J(50, 620, 645, 50, 1250, 645, 20);
                        }
                    }
                } else {
                    i2 = 20;
                    i3 = 32;
                    i4 = 12;
                    m3061J(60, 900, 105, 55, 965, 105, 24);
                }
                m3068V();
                if (this.f5894q.f2543M0.m3486a()) {
                    this.f5891p.m1777w();
                    m3091z();
                    m3086u(this.f5891p.m1774t());
                } else {
                    this.f5891p.m1778x();
                    m3052A();
                    m3087v(this.f5891p.m1775u());
                    ((Float) this.f5891p.f2457k0.m1395d()).getClass();
                    m3053B();
                    m3088w(this.f5891p.m1776v());
                }
                if (this.f5894q.useJourneyFuel) {
                    m3082q(this.f5891p.m1737a());
                } else {
                    m3082q(this.f5891p.m1739b());
                }
                m3055D(this.f5891p.m1773s());
                m3084s(this.f5891p.m1743d());
                m3056E();
                this.f5839U.setText(AbstractC1372y1.m3307m(this));
                m3090y();
                m3085t(this.f5891p.m1745e());
                cfgData cfgdata15 = this.f5894q;
                i5 = cfgdata15.f2620e1;
                if (i5 != 11) {
                    this.f5898r0.setImageResource(R.drawable.theme_11_fuel);
                } else if (i5 == i4) {
                    this.f5898r0.setImageResource(R.drawable.theme_12_fuel);
                } else if (i5 == 21) {
                    if (cfgdata15.f2543M0.m3487b()) {
                        this.f5898r0.setImageResource(R.drawable.theme_21_fuel_wr);
                    } else {
                        this.f5898r0.setImageResource(R.drawable.theme_21_fuel);
                    }
                } else if (i5 == 28) {
                    this.f5898r0.setImageResource(R.drawable.theme_28_fuel);
                    this.f5904t0.setImageResource(R.drawable.theme_28_temp);
                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                    this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                } else if (i5 == 29) {
                    this.f5898r0.setImageResource(R.drawable.theme_29_fuel);
                    this.f5904t0.setImageResource(R.drawable.theme_29_temp);
                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                    this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                } else if (i5 == 31) {
                    this.f5898r0.setImageResource(R.drawable.theme_31_fuel);
                    this.f5904t0.setImageResource(R.drawable.theme_31_temp);
                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                    this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                } else if (i5 == i3) {
                    this.f5898r0.setImageResource(R.drawable.theme_32_fuel);
                    this.f5904t0.setImageResource(R.drawable.theme_32_temp);
                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                    this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                } else if (i5 == 33) {
                    this.f5898r0.setImageResource(R.drawable.theme_33_fuel);
                    this.f5904t0.setImageResource(R.drawable.theme_33_temp);
                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                    this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                } else {
                    i6 = 34;
                    if (i5 == 34) {
                        this.f5898r0.setImageResource(R.drawable.theme_33_fuel);
                        this.f5904t0.setImageResource(R.drawable.theme_33_temp);
                        this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                        this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                    } else if (i5 == 35) {
                        this.f5898r0.setImageResource(R.drawable.theme_35_fuel);
                        this.f5904t0.setImageResource(R.drawable.theme_35_temp);
                        this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                        this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                    } else if (i5 == 37) {
                        this.f5898r0.setImageResource(R.drawable.theme_37_fuel);
                        this.f5904t0.setImageResource(R.drawable.theme_37_temp);
                        this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                        this.f5904t0.setVisibility(this.f5826N0 ? 0 : 4);
                    }
                    if (this.f5894q.f2620e1 == i4) {
                        this.f5897r.setZ(1.0f);
                        this.f5857d0.setZ(1.0f);
                        this.f5903t.setZ(1.0f);
                        this.f5835S.setZ(1.0f);
                        this.f5837T.setZ(1.0f);
                    }
                    if ((this.f5842V0 || this.f5826N0) && (enumC1457c = (cfgdata5 = this.f5894q).f2543M0) != EnumC1457c.T500_BT && enumC1457c != EnumC1457c.T500_BT_NEW) {
                        i7 = cfgdata5.f2620e1;
                        if (i7 == 5) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            if (this.f5878k1) {
                                m3045L(this.f5802B0, 1270);
                                m3046M(this.f5802B0, 685);
                            } else {
                                m3045L(this.f5802B0, 400);
                                m3046M(this.f5802B0, 645);
                            }
                        } else if (i7 == 8 || i7 == 9) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 70);
                            m3046M(this.f5802B0, 660);
                        } else if (i7 == 11) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 70);
                            m3046M(this.f5802B0, 575);
                        } else if (i7 == i4) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 1360);
                            m3046M(this.f5802B0, 275);
                        } else if (i7 == i2) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, -25);
                            m3046M(this.f5802B0, 580);
                        }
                        i8 = this.f5894q.f2620e1;
                        if (i8 == 21) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 190);
                            m3046M(this.f5802B0, 590);
                        } else if (i8 == 27 || i8 == 25 || i8 == 24 || i8 == 23 || (i8 < 18 && i8 > i4)) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 80);
                            m3046M(this.f5802B0, 670);
                        } else if (i8 == 28) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 200);
                            m3046M(this.f5802B0, 575);
                        } else if (i8 == 29) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 200);
                            m3046M(this.f5802B0, 560);
                        } else if (i8 == 31) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, -25);
                            m3046M(this.f5802B0, 550);
                        } else if (i8 == i3) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 180);
                            m3046M(this.f5802B0, 488);
                        } else if (i8 == 33) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 640);
                            m3046M(this.f5802B0, 175);
                        }
                        if (this.f5894q.f2620e1 == i6) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 630);
                            m3046M(this.f5802B0, 175);
                        }
                        if (this.f5894q.f2620e1 == 35) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 640);
                            m3046M(this.f5802B0, 180);
                        }
                        if (this.f5894q.f2620e1 == 37) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 365);
                            m3046M(this.f5802B0, 520);
                        }
                        if (this.f5894q.f2620e1 == 39) {
                            this.f5802B0.setVisibility(this.f5826N0 ? 0 : 4);
                            m3045L(this.f5802B0, 70);
                            m3046M(this.f5802B0, 670);
                        }
                    }
                    if (this.f5842V0 && !this.f5826N0) {
                        textView = this.f5802B0;
                        if (textView != null && this.f5806D0 != null) {
                            textView.setLayoutParams(new C1592d(this.f5806D0));
                        }
                        m3049R(this.f5802B0, true);
                        m3049R(this.f5814H0, this.f5894q.f2543M0.m3486a());
                    }
                    cfgData cfgdata16 = this.f5894q;
                    i9 = cfgdata16.f2620e1;
                    if (i9 == 10) {
                        i10 = 4;
                        this.f5898r0.setVisibility(4);
                        this.f5901s0.setVisibility(4);
                        this.f5907u0.setVisibility(4);
                        this.f5900s.setVisibility(4);
                        this.f5906u.setVisibility(4);
                        int m3474d = this.f5894q.f2615d1.m3474d();
                        int i22 = 960 - (m3474d / 2);
                        int m3476f = this.f5894q.f2615d1.m3476f();
                        m3063O(this.f5897r, m3474d, i22, m3476f);
                        m3063O(this.f5903t, m3474d, i22, m3476f);
                    } else {
                        i10 = 4;
                        if (i9 != 30) {
                            if (i9 == 36) {
                                this.f5900s.setVisibility(4);
                                int m3477g = this.f5894q.f2615d1.m3477g();
                                int i23 = m3477g * 3;
                                i11 = 180;
                                m3064P(this.f5897r, i23, m3477g, 960 - (i23 / 2), this.f5894q.f2615d1.m3478h());
                                m3063O(this.f5903t, 900, -70, -65);
                                m3063O(this.f5906u, 900, 1090, -65);
                                m3063O(this.f5898r0, this.f5894q.f2615d1.m3474d(), this.f5894q.f2615d1.m3475e(), this.f5894q.f2615d1.m3476f());
                                m3063O(this.f5904t0, this.f5894q.f2615d1.m3474d(), (1920 - this.f5894q.f2615d1.m3475e()) - this.f5894q.f2615d1.m3474d(), this.f5894q.f2615d1.m3476f());
                                m3063O(this.f5901s0, this.f5894q.f2615d1.m3474d(), this.f5894q.f2615d1.m3475e(), this.f5894q.f2615d1.m3476f());
                                m3063O(this.f5907u0, this.f5894q.f2615d1.m3474d(), (1920 - this.f5894q.f2615d1.m3475e()) - this.f5894q.f2615d1.m3474d(), this.f5894q.f2615d1.m3476f());
                            } else {
                                i11 = 180;
                                if (i9 == 11) {
                                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                                    this.f5901s0.setVisibility(this.f5826N0 ? 0 : 4);
                                    this.f5907u0.setVisibility(this.f5826N0 ? 0 : 4);
                                    int m3474d2 = this.f5894q.f2615d1.m3474d();
                                    int i24 = 960 - (m3474d2 / 2);
                                    int m3476f2 = this.f5894q.f2615d1.m3476f();
                                    int m3477g2 = this.f5894q.f2615d1.m3477g();
                                    int m3478h = this.f5894q.f2615d1.m3478h();
                                    int i25 = this.f5894q.f2615d1.f7117q;
                                    int i26 = (1920 - i25) - m3477g2;
                                    m3063O(this.f5897r, m3474d2, i24, m3476f2);
                                    m3063O(this.f5903t, m3474d2, i24, m3476f2);
                                    m3063O(this.f5900s, m3477g2, i26, m3478h);
                                    m3063O(this.f5906u, m3477g2, i26, m3478h);
                                    m3063O(this.f5898r0, m3477g2, i25, m3478h);
                                    m3063O(this.f5901s0, m3477g2, i25, m3478h);
                                    m3063O(this.f5907u0, m3477g2, i25, m3478h);
                                } else if (i9 == i4) {
                                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                                    this.f5901s0.setVisibility(this.f5826N0 ? 0 : 4);
                                    this.f5907u0.setVisibility(this.f5826N0 ? 0 : 4);
                                    int m3474d3 = this.f5894q.f2615d1.m3474d();
                                    int i27 = 960 - (m3474d3 / 2);
                                    int m3476f3 = this.f5894q.f2615d1.m3476f();
                                    int m3477g3 = this.f5894q.f2615d1.m3477g();
                                    int m3478h2 = this.f5894q.f2615d1.m3478h();
                                    int i28 = this.f5894q.f2615d1.f7117q;
                                    int i29 = (1920 - i28) - m3477g3;
                                    m3063O(this.f5897r, m3474d3, i27, m3476f3);
                                    m3063O(this.f5903t, m3474d3, i27, m3476f3);
                                    m3063O(this.f5900s, m3477g3, i28, m3478h2);
                                    m3063O(this.f5906u, m3477g3, i28, m3478h2);
                                    m3063O(this.f5898r0, m3477g3, i29, m3478h2);
                                    m3063O(this.f5901s0, m3477g3, i29, m3478h2);
                                    m3063O(this.f5907u0, m3477g3, i29, m3478h2);
                                } else if (i9 == 21) {
                                    this.f5898r0.setVisibility(this.f5826N0 ? 0 : 4);
                                    this.f5901s0.setVisibility(this.f5826N0 ? 0 : 4);
                                    this.f5907u0.setVisibility(this.f5826N0 ? 0 : 4);
                                    int m3474d4 = this.f5894q.f2615d1.m3474d();
                                    int i30 = 960 - (m3474d4 / 2);
                                    int m3476f4 = this.f5894q.f2615d1.m3476f();
                                    int m3477g4 = this.f5894q.f2615d1.m3477g();
                                    int m3478h3 = this.f5894q.f2615d1.m3478h();
                                    int i31 = this.f5894q.f2615d1.f7117q;
                                    int i32 = (1920 - i31) - m3477g4;
                                    m3063O(this.f5897r, m3474d4, i30, m3476f4);
                                    m3063O(this.f5903t, m3474d4, i30, m3476f4);
                                    m3063O(this.f5900s, m3477g4, i32, m3478h3);
                                    m3063O(this.f5906u, m3477g4, i32, m3478h3);
                                    m3063O(this.f5898r0, m3477g4, i31, m3478h3);
                                    m3063O(this.f5901s0, m3477g4, i31, m3478h3);
                                    m3063O(this.f5907u0, m3477g4, i31, m3478h3);
                                } else if (i9 == 22) {
                                    this.f5898r0.setVisibility(4);
                                    this.f5901s0.setVisibility(4);
                                    this.f5907u0.setVisibility(4);
                                    this.f5900s.setVisibility(4);
                                    this.f5906u.setVisibility(4);
                                    int m3474d5 = this.f5894q.f2615d1.m3474d();
                                    int i33 = 960 - (m3474d5 / 2);
                                    int m3476f5 = this.f5894q.f2615d1.m3476f();
                                    m3063O(this.f5897r, m3474d5, i33, m3476f5);
                                    m3063O(this.f5903t, m3474d5, i33, m3476f5);
                                } else {
                                    int m3477g5 = cfgdata16.f2615d1.m3477g();
                                    int m3478h4 = this.f5894q.f2615d1.m3478h();
                                    EnumC1456b enumC1456b9 = this.f5894q.f2615d1;
                                    int i34 = enumC1456b9.f7117q;
                                    int i35 = (1920 - i34) - m3477g5;
                                    int m3474d6 = enumC1456b9.m3474d();
                                    int m3476f6 = this.f5894q.f2615d1.m3476f();
                                    int m3475e = this.f5894q.f2615d1.m3475e();
                                    int i36 = (1920 - m3475e) - m3474d6;
                                    m3063O(this.f5897r, m3477g5, i34, m3478h4);
                                    m3063O(this.f5903t, m3477g5, i34, m3478h4);
                                    m3063O(this.f5900s, m3477g5, i35, m3478h4);
                                    m3063O(this.f5906u, m3477g5, i35, m3478h4);
                                    int i37 = this.f5894q.f2620e1;
                                    if (i37 == 28 || i37 == 29 || i37 == 31 || i37 == 33 || i37 == 37) {
                                        m3048Q(this.f5898r0, m3474d6, m3475e, m3476f6);
                                        m3048Q(this.f5901s0, m3474d6, m3475e, m3476f6);
                                        m3048Q(this.f5904t0, m3474d6, i36, m3476f6);
                                        m3048Q(this.f5907u0, m3474d6, i36, m3476f6);
                                    } else {
                                        m3063O(this.f5898r0, m3474d6, m3475e, m3476f6);
                                        m3063O(this.f5901s0, m3474d6, m3475e, m3476f6);
                                        m3063O(this.f5904t0, m3474d6, i36, m3476f6);
                                        m3063O(this.f5907u0, m3474d6, i36, m3476f6);
                                    }
                                }
                            }
                            cfgData cfgdata17 = this.f5894q;
                            i12 = cfgdata17.f2620e1;
                            if (i12 != 10) {
                                m3046M(this.f5857d0, 230);
                                this.f5862f0.setVisibility(i10);
                                this.f5857d0.setTextSize(2, 110.0f);
                            } else if (i12 == 30) {
                                m3046M(this.f5857d0, i11);
                                this.f5862f0.setVisibility(i10);
                                this.f5857d0.setTextSize(2, 45.0f);
                            } else if (i12 == 11) {
                                m3079n(R.id.id_Tires_up, R.id.imageRPMNeedle);
                                m3079n(R.id.id_odoUp, R.id.imageSpeedometerNeedle);
                                m3079n(R.id.id_Tires_img_up, R.id.id_Tires_up);
                                m3046M(this.f5862f0, 100);
                                m3046M(this.f5857d0, 170);
                                m3046M(this.f5827O, 310);
                                m3046M(this.f5823M, 490);
                                this.f5823M.setTextSize(2, 24.0f);
                                this.f5827O.setTextSize(2, 20.0f);
                                this.f5857d0.setTextSize(2, 110.0f);
                                this.f5862f0.setTextSize(2, 50.0f);
                            } else if (i12 == i4) {
                                m3079n(R.id.id_Tires_up, R.id.imgTempNeedle);
                                m3079n(R.id.id_odoUp, R.id.imgTempNeedle);
                                m3079n(R.id.id_Tires_img_up, R.id.id_Tires_up);
                                m3046M(this.f5862f0, 443);
                                m3046M(this.f5857d0, 493);
                                m3046M(this.f5827O, i11);
                                m3046M(this.f5823M, 290);
                                this.f5823M.setTextSize(2, 24.0f);
                                this.f5827O.setTextSize(2, 24.0f);
                                this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() + 15);
                                this.f5859e0.setTextSize(2, (this.f5894q.f2615d1.m3485o() / 3) + 5);
                                this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o());
                                this.f5865g0.setTextSize(2, this.f5894q.f2615d1.m3485o() / 3);
                            } else if (i12 == 21) {
                                m3079n(R.id.id_Tires_up, R.id.imageRPMNeedle);
                                m3079n(R.id.id_odoUp, R.id.imageSpeedometerNeedle);
                                m3079n(R.id.id_Tires_img_up, R.id.id_Tires_up);
                                m3046M(this.f5862f0, 150);
                                m3046M(this.f5857d0, 160);
                                m3046M(this.f5827O, 380);
                                m3046M(this.f5823M, 440);
                                this.f5823M.setTextSize(2, 20.0f);
                                this.f5827O.setTextSize(2, 20.0f);
                                this.f5857d0.setTextSize(2, 80.0f);
                                this.f5862f0.setTextSize(2, 50.0f);
                            } else if (i12 == 22) {
                                m3046M(this.f5857d0, 160);
                                this.f5857d0.setTextSize(2, 48.0f);
                                this.f5865g0.setVisibility(i10);
                                this.f5862f0.setVisibility(i10);
                            } else {
                                m3046M(this.f5862f0, cfgdata17.f2615d1.f7122v);
                                m3046M(this.f5857d0, this.f5894q.f2615d1.f7122v);
                                m3046M(this.f5827O, this.f5894q.f2615d1.m3472b());
                                m3046M(this.f5823M, this.f5894q.f2615d1.m3472b());
                                this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o());
                                this.f5859e0.setTextSize(2, this.f5894q.f2615d1.m3485o() / 3);
                                this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o());
                                this.f5865g0.setTextSize(2, this.f5894q.f2615d1.m3485o() / 3);
                            }
                            if (this.f5894q.f2615d1.m3479i() != 33) {
                                int i38 = this.f5878k1 ? -200 : 200;
                                m3045L(this.f5862f0, -i38);
                                m3045L(this.f5857d0, i38);
                            } else if (this.f5894q.f2615d1.m3479i() == 35) {
                                m3045L(this.f5862f0, -200);
                                m3045L(this.f5857d0, 200);
                            }
                            if (this.f5894q.f2615d1.m3479i() == 37) {
                                int i39 = this.f5878k1 ? -20 : 60;
                                m3045L(this.f5862f0, -i39);
                                m3045L(this.f5857d0, i39);
                            }
                            if (this.f5894q.f2615d1.m3479i() != 33) {
                                int i40 = this.f5878k1 ? -200 : 200;
                                ImageView imageView = this.f5831Q;
                                int i41 = (-i40) - 10;
                                C1592d c1592d = (C1592d) imageView.getLayoutParams();
                                ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = i41;
                                imageView.setLayoutParams(c1592d);
                                m3045L(this.f5827O, i41);
                                m3045L(this.f5823M, i40);
                            } else if (this.f5894q.f2615d1.m3479i() == 34) {
                                this.f5827O.setVisibility(i10);
                                this.f5831Q.setVisibility(i10);
                                m3045L(this.f5823M, 120);
                            } else if (this.f5894q.f2615d1.m3479i() == 35) {
                                ImageView imageView2 = this.f5831Q;
                                C1592d c1592d2 = (C1592d) imageView2.getLayoutParams();
                                ((ViewGroup.MarginLayoutParams) c1592d2).leftMargin = -210;
                                imageView2.setLayoutParams(c1592d2);
                                m3045L(this.f5827O, -210);
                                m3045L(this.f5823M, 200);
                            }
                            i13 = this.f5894q.f2620e1;
                            if (i13 != 17 || i13 == 8 || i13 == 9) {
                                Typeface m101a = AbstractC0049p.m101a(this, R.font.naziona);
                                this.f5862f0.setTypeface(m101a);
                                this.f5857d0.setTypeface(m101a);
                                this.f5827O.setTypeface(m101a);
                                this.f5823M.setTypeface(m101a);
                            } else {
                                Typeface m101a2 = AbstractC0049p.m101a(this, R.font.europec);
                                this.f5862f0.setTypeface(m101a2);
                                this.f5857d0.setTypeface(m101a2);
                                this.f5827O.setTypeface(m101a2);
                                this.f5823M.setTypeface(m101a2);
                            }
                            cfgdata6 = this.f5894q;
                            i14 = cfgdata6.f2620e1;
                            if ((i14 != 8 || i14 == 9) && ((!cfgdata6.f2577U2 && !cfgdata6.f2569S2 && !cfgdata6.f2573T2 && !cfgdata6.f2581V2) || (this.f5858d1 && this.f5854b1))) {
                                m3046M(this.f5862f0, cfgdata6.f2615d1.m3472b() - 15);
                                m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 15);
                                this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
                                this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
                            }
                            cfgdata7 = this.f5894q;
                            if (cfgdata7.f2620e1 == 13 && ((!cfgdata7.f2577U2 && !cfgdata7.f2569S2 && !cfgdata7.f2573T2 && !cfgdata7.f2581V2) || (this.f5858d1 && this.f5854b1))) {
                                m3046M(this.f5862f0, cfgdata7.f2615d1.m3472b() - 80);
                                m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 80);
                                this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                                this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                            }
                            cfgdata8 = this.f5894q;
                            if (cfgdata8.f2620e1 == 39 && ((!cfgdata8.f2577U2 && !cfgdata8.f2569S2 && !cfgdata8.f2573T2 && !cfgdata8.f2581V2) || (this.f5858d1 && this.f5854b1))) {
                                m3046M(this.f5862f0, cfgdata8.f2615d1.m3472b() - 80);
                                m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 80);
                                this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                                this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                            }
                            cfgData cfgdata18 = this.f5894q;
                            enumC1456b2 = cfgdata18.f2615d1;
                            if (enumC1456b2.f7125y) {
                                boolean z10 = this.f5878k1;
                                if (!z10 || (i17 = cfgdata18.f2620e1) == 28 || !z10 || i17 == 29 || !z10 || i17 == 31 || !z10 || i17 == 33 || i17 == 37) {
                                    m3045L(this.f5880l0, enumC1456b2.f7126z);
                                    m3045L(this.f5877k0, this.f5894q.f2615d1.f7092B);
                                } else {
                                    m3045L(this.f5880l0, enumC1456b2.f7092B);
                                    m3045L(this.f5877k0, this.f5894q.f2615d1.f7126z);
                                }
                                m3046M(this.f5880l0, this.f5894q.f2615d1.m3484n());
                                m3046M(this.f5877k0, this.f5894q.f2615d1.m3473c());
                                int i42 = this.f5894q.f2615d1.f7094D;
                                if (i42 != 0) {
                                    Typeface m101a3 = AbstractC0049p.m101a(this, i42);
                                    this.f5880l0.setTypeface(m101a3);
                                    this.f5877k0.setTypeface(m101a3);
                                }
                                this.f5880l0.setTextSize(2, this.f5894q.f2615d1.f7095E);
                                this.f5877k0.setTextSize(2, this.f5894q.f2615d1.f7095E);
                            }
                            if (this.f5894q.f2620e1 != 5) {
                                Typeface m101a4 = AbstractC0049p.m101a(this, R.font.europec);
                                m3076k(m101a4);
                                m3075j(this.f5878k1 ? 18.0f : 22.0f, m101a4);
                                TextView textView2 = this.f5808E0;
                                if (textView2 == null) {
                                    i15 = 2;
                                    i16 = 1;
                                } else {
                                    i15 = 2;
                                    textView2.setTextSize(2, 18.0f);
                                    i16 = 1;
                                    textView2.setTypeface(Typeface.create("sans-serif", 1));
                                }
                                TextView textView3 = this.f5816I0;
                                if (textView3 != null) {
                                    textView3.setTextSize(i15, 18.0f);
                                    textView3.setTypeface(Typeface.create("sans-serif", i16));
                                }
                                TextView textView4 = this.f5851a0;
                                if (textView4 == null) {
                                    return;
                                }
                                textView4.setTextSize(i15, 20.0f);
                                textView4.setTypeface(Typeface.create("sans-serif", i16));
                                return;
                            }
                            return;
                        }
                        this.f5900s.setVisibility(4);
                        int m3477g6 = this.f5894q.f2615d1.m3477g();
                        int i43 = 960 - (m3477g6 / 2);
                        int m3478h5 = this.f5894q.f2615d1.m3478h();
                        m3063O(this.f5897r, m3477g6, i43, m3478h5);
                        m3063O(this.f5903t, m3477g6, i43, m3478h5);
                        m3063O(this.f5906u, 200, 860, 470);
                        m3063O(this.f5901s0, this.f5894q.f2615d1.m3474d(), this.f5894q.f2615d1.m3475e(), this.f5894q.f2615d1.m3476f());
                        m3063O(this.f5907u0, this.f5894q.f2615d1.m3474d(), 1720 - this.f5894q.f2615d1.m3475e(), this.f5894q.f2615d1.m3476f());
                    }
                    i11 = 180;
                    cfgData cfgdata172 = this.f5894q;
                    i12 = cfgdata172.f2620e1;
                    if (i12 != 10) {
                    }
                    if (this.f5894q.f2615d1.m3479i() != 33) {
                    }
                    if (this.f5894q.f2615d1.m3479i() == 37) {
                    }
                    if (this.f5894q.f2615d1.m3479i() != 33) {
                    }
                    i13 = this.f5894q.f2620e1;
                    if (i13 != 17) {
                    }
                    Typeface m101a5 = AbstractC0049p.m101a(this, R.font.naziona);
                    this.f5862f0.setTypeface(m101a5);
                    this.f5857d0.setTypeface(m101a5);
                    this.f5827O.setTypeface(m101a5);
                    this.f5823M.setTypeface(m101a5);
                    cfgdata6 = this.f5894q;
                    i14 = cfgdata6.f2620e1;
                    if (i14 != 8) {
                    }
                    m3046M(this.f5862f0, cfgdata6.f2615d1.m3472b() - 15);
                    m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 15);
                    this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
                    this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
                    cfgdata7 = this.f5894q;
                    if (cfgdata7.f2620e1 == 13) {
                        m3046M(this.f5862f0, cfgdata7.f2615d1.m3472b() - 80);
                        m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 80);
                        this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                        this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                    }
                    cfgdata8 = this.f5894q;
                    if (cfgdata8.f2620e1 == 39) {
                        m3046M(this.f5862f0, cfgdata8.f2615d1.m3472b() - 80);
                        m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 80);
                        this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                        this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.4f);
                    }
                    cfgData cfgdata182 = this.f5894q;
                    enumC1456b2 = cfgdata182.f2615d1;
                    if (enumC1456b2.f7125y) {
                    }
                    if (this.f5894q.f2620e1 != 5) {
                    }
                }
                i6 = 34;
                if (this.f5894q.f2620e1 == i4) {
                }
                if (this.f5842V0) {
                }
                i7 = cfgdata5.f2620e1;
                if (i7 == 5) {
                }
                i8 = this.f5894q.f2620e1;
                if (i8 == 21) {
                }
                if (this.f5894q.f2620e1 == i6) {
                }
                if (this.f5894q.f2620e1 == 35) {
                }
                if (this.f5894q.f2620e1 == 37) {
                }
                if (this.f5894q.f2620e1 == 39) {
                }
                if (this.f5842V0) {
                    textView = this.f5802B0;
                    if (textView != null) {
                        textView.setLayoutParams(new C1592d(this.f5806D0));
                    }
                    m3049R(this.f5802B0, true);
                    m3049R(this.f5814H0, this.f5894q.f2543M0.m3486a());
                }
                cfgData cfgdata162 = this.f5894q;
                i9 = cfgdata162.f2620e1;
                if (i9 == 10) {
                }
                i11 = 180;
                cfgData cfgdata1722 = this.f5894q;
                i12 = cfgdata1722.f2620e1;
                if (i12 != 10) {
                }
                if (this.f5894q.f2615d1.m3479i() != 33) {
                }
                if (this.f5894q.f2615d1.m3479i() == 37) {
                }
                if (this.f5894q.f2615d1.m3479i() != 33) {
                }
                i13 = this.f5894q.f2620e1;
                if (i13 != 17) {
                }
                Typeface m101a52 = AbstractC0049p.m101a(this, R.font.naziona);
                this.f5862f0.setTypeface(m101a52);
                this.f5857d0.setTypeface(m101a52);
                this.f5827O.setTypeface(m101a52);
                this.f5823M.setTypeface(m101a52);
                cfgdata6 = this.f5894q;
                i14 = cfgdata6.f2620e1;
                if (i14 != 8) {
                }
                m3046M(this.f5862f0, cfgdata6.f2615d1.m3472b() - 15);
                m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 15);
                this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
                this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
                cfgdata7 = this.f5894q;
                if (cfgdata7.f2620e1 == 13) {
                }
                cfgdata8 = this.f5894q;
                if (cfgdata8.f2620e1 == 39) {
                }
                cfgData cfgdata1822 = this.f5894q;
                enumC1456b2 = cfgdata1822.f2615d1;
                if (enumC1456b2.f7125y) {
                }
                if (this.f5894q.f2620e1 != 5) {
                }
            }
        }
        z2 = false;
        this.f5852a1 = z2;
        this.f5854b1 = (!z5 && this.f5894q.f2581V2) || (((i = (cfgdata = this.f5894q).f2620e1) == 10 || i == 37) && this.f5826N0 && cfgdata.f2581V2);
        cfgData cfgdata122 = this.f5894q;
        EnumC1456b enumC1456b62 = cfgdata122.f2615d1;
        this.f5869h1 = (((enumC1456b62 == enumC1456b5 && enumC1456b62 != EnumC1456b.TOG && cfgdata122.f2625f1 != EnumC1455a.f6949f && this.f5826N0) || this.f5842V0) && this.f5894q.f2615d1.f7106f < 3 && this.f5826N0 && !this.f5840U0) || ((enumC1456b = (cfgdata2 = this.f5894q).f2615d1) != enumC1456b5 && enumC1456b != EnumC1456b.TOG && cfgdata2.f2625f1.f7035c == 2 && enumC1456b.f7106f < 3 && this.f5826N0 && !this.f5840U0) || (this.f5842V0 && !this.f5826N0);
        if (this.f5894q.f2615d1.m3479i() == 28) {
        }
        if (this.f5894q.f2615d1.m3479i() == 29) {
        }
        if (this.f5894q.f2615d1.m3479i() == 31) {
        }
        if (this.f5894q.f2615d1.m3479i() == 32) {
        }
        cfgData cfgdata132 = this.f5894q;
        EnumC1456b enumC1456b72 = cfgdata132.f2615d1;
        if (enumC1456b72.f7125y) {
        }
        this.f5875j1 = z8;
        this.f5872i1 = z8 && (!(z3 = this.f5826N0) || (enumC1456b72.f7106f < 4 && z3));
        this.f5866g1 = !cfgdata132.f2561Q2 && this.f5826N0 && enumC1456b72.m3481k();
        cfgdata3 = this.f5894q;
        this.f5878k1 = (cfgdata3.f2636h2 || (i18 = cfgdata3.f2620e1) == 11 || i18 == 12 || i18 == 21 || i18 == 22 || i18 == 26 || i18 == 30 || i18 == 32 || i18 == 34 || i18 == 35 || i18 == 38) ? false : true;
        if (cfgdata3.f2620e1 == 37) {
            m3045L(this.f5825N, 170);
            m3045L(this.f5829P, 1550);
        }
        holePunchLayout = this.f5830P0;
        if (holePunchLayout != null) {
        }
        if (!m3081p()) {
        }
        m3058G();
        m3049R(this.f5897r, this.f5826N0);
        m3049R(this.f5900s, this.f5826N0);
        m3049R(this.f5903t, this.f5826N0);
        m3049R(this.f5906u, this.f5826N0);
        m3049R(this.f5898r0, false);
        m3049R(this.f5904t0, false);
        m3049R(this.f5901s0, this.f5866g1);
        m3049R(this.f5907u0, this.f5866g1);
        m3049R(this.f5839U, this.f5863f1);
        m3049R(this.f5841V, this.f5863f1);
        cfgData cfgdata142 = this.f5894q;
        EnumC1456b enumC1456b82 = cfgdata142.f2615d1;
        if (this.f5863f1) {
        }
        m3049R(this.f5821L, z9);
        view = this.f5821L;
        if (view != null) {
            view.setBackgroundResource(this.f5894q.f2630g1 > 30 ? R.drawable.ip_legacy_top_data_plain : R.drawable.ip_legacy_top_data_frame);
        }
        m3049R(this.f5895q0, this.f5860e1);
        m3049R(this.f5857d0, this.f5844W0);
        m3049R(this.f5859e0, this.f5846X0);
        m3049R(this.f5862f0, this.f5844W0);
        m3049R(this.f5865g0, this.f5846X0);
        m3049R(this.f5827O, this.f5852a1);
        m3049R(this.f5831Q, this.f5852a1);
        m3049R(this.f5823M, this.f5856c1);
        m3049R(this.f5829P, this.f5854b1);
        m3049R(this.f5833R, this.f5854b1);
        m3049R(this.f5825N, this.f5858d1);
        m3049R(this.f5847Y, this.f5850Z0);
        m3049R(this.f5845X, this.f5850Z0);
        m3049R(this.f5849Z, this.f5850Z0);
        m3049R(this.f5853b0, this.f5850Z0);
        m3049R(this.f5855c0, this.f5850Z0);
        m3049R(this.f5883m0, this.f5869h1);
        m3049R(this.f5886n0, this.f5869h1);
        m3049R(this.f5851a0, (this.f5872i1 || !this.f5894q.f2543M0.m3488c() || this.f5875j1) ? false : true);
        m3049R(this.f5877k0, this.f5875j1);
        m3049R(this.f5880l0, this.f5875j1);
        m3049R(this.f5802B0, this.f5869h1);
        m3066T = m3066T();
        m3049R(this.f5804C0, m3066T);
        if (m3066T) {
        }
        m3049R(this.f5918z0, this.f5869h1);
        m3049R(this.f5800A0, this.f5869h1);
        m3049R(this.f5808E0, (this.f5872i1 || this.f5875j1) ? false : true);
        m3049R(this.f5814H0, !this.f5869h1 && this.f5894q.f2543M0.m3486a());
        m3049R(this.f5810F0, !this.f5869h1 && this.f5894q.f2543M0.m3486a());
        m3049R(this.f5812G0, !this.f5869h1 && this.f5894q.f2543M0.m3486a());
        m3049R(this.f5816I0, (this.f5872i1 || this.f5875j1 || !this.f5894q.f2543M0.m3486a()) ? false : true);
        this.f5838T0 = false;
        cfgdata4 = this.f5894q;
        if (cfgdata4.f2553O2) {
        }
        m3068V();
        if (this.f5894q.f2543M0.m3486a()) {
        }
        if (this.f5894q.useJourneyFuel) {
        }
        m3055D(this.f5891p.m1773s());
        m3084s(this.f5891p.m1743d());
        m3056E();
        this.f5839U.setText(AbstractC1372y1.m3307m(this));
        m3090y();
        m3085t(this.f5891p.m1745e());
        cfgData cfgdata152 = this.f5894q;
        i5 = cfgdata152.f2620e1;
        if (i5 != 11) {
        }
        i6 = 34;
        if (this.f5894q.f2620e1 == i4) {
        }
        if (this.f5842V0) {
        }
        i7 = cfgdata5.f2620e1;
        if (i7 == 5) {
        }
        i8 = this.f5894q.f2620e1;
        if (i8 == 21) {
        }
        if (this.f5894q.f2620e1 == i6) {
        }
        if (this.f5894q.f2620e1 == 35) {
        }
        if (this.f5894q.f2620e1 == 37) {
        }
        if (this.f5894q.f2620e1 == 39) {
        }
        if (this.f5842V0) {
        }
        cfgData cfgdata1622 = this.f5894q;
        i9 = cfgdata1622.f2620e1;
        if (i9 == 10) {
        }
        i11 = 180;
        cfgData cfgdata17222 = this.f5894q;
        i12 = cfgdata17222.f2620e1;
        if (i12 != 10) {
        }
        if (this.f5894q.f2615d1.m3479i() != 33) {
        }
        if (this.f5894q.f2615d1.m3479i() == 37) {
        }
        if (this.f5894q.f2615d1.m3479i() != 33) {
        }
        i13 = this.f5894q.f2620e1;
        if (i13 != 17) {
        }
        Typeface m101a522 = AbstractC0049p.m101a(this, R.font.naziona);
        this.f5862f0.setTypeface(m101a522);
        this.f5857d0.setTypeface(m101a522);
        this.f5827O.setTypeface(m101a522);
        this.f5823M.setTypeface(m101a522);
        cfgdata6 = this.f5894q;
        i14 = cfgdata6.f2620e1;
        if (i14 != 8) {
        }
        m3046M(this.f5862f0, cfgdata6.f2615d1.m3472b() - 15);
        m3046M(this.f5857d0, this.f5894q.f2615d1.m3472b() - 15);
        this.f5857d0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
        this.f5862f0.setTextSize(2, this.f5894q.f2615d1.m3485o() * 1.3f);
        cfgdata7 = this.f5894q;
        if (cfgdata7.f2620e1 == 13) {
        }
        cfgdata8 = this.f5894q;
        if (cfgdata8.f2620e1 == 39) {
        }
        cfgData cfgdata18222 = this.f5894q;
        enumC1456b2 = cfgdata18222.f2615d1;
        if (enumC1456b2.f7125y) {
        }
        if (this.f5894q.f2620e1 != 5) {
        }
    }

    /* renamed from: c */
    public final void m3070c(String str) {
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(402722816);
            Rect rect = new Rect(0, 0, 1920, 1080);
            intent.putExtra("caller", str);
            startActivity(intent, makeBasic.setLaunchBounds(rect).toBundle());
        } catch (Exception e2) {
            Toast.makeText(this, "ERROR3" + e2, 1).show();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        return this.f5867h;
    }

    /* renamed from: e */
    public final void m3071e(final boolean z2) {
        ImageView imageView;
        ImageView imageView2 = this.f5897r;
        View view = imageView2 != null ? (View) imageView2.getParent() : null;
        if (view == null || this.f5897r == null || this.f5900s == null) {
            m3069W();
            m3059H();
            m3060I();
            return;
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            view.post(new RunnableC0029w(this, z2, 2));
            return;
        }
        ValueAnimator valueAnimator = this.f5881l1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5881l1 = null;
        }
        this.f5884m1 = false;
        boolean z3 = this.f5897r.getLeft() <= this.f5900s.getLeft();
        final ImageView imageView3 = z3 ? this.f5897r : this.f5900s;
        final ImageView imageView4 = z3 ? this.f5900s : this.f5897r;
        final ImageView imageView5 = z3 ? this.f5903t : this.f5906u;
        final ImageView imageView6 = z3 ? this.f5906u : this.f5903t;
        final TextView textView = z3 ? this.f5857d0 : this.f5862f0;
        final TextView textView2 = z3 ? this.f5862f0 : this.f5857d0;
        final TextView textView3 = z3 ? this.f5859e0 : this.f5865g0;
        final TextView textView4 = z3 ? this.f5865g0 : this.f5859e0;
        float width = view.getWidth();
        float f2 = 0.06f * width;
        final float f3 = -(imageView3.getRight() + f2);
        final float left = (width - imageView4.getLeft()) + f2;
        final float f4 = -(view.getHeight() + f2);
        cfgData cfgdata = this.f5894q;
        int i = cfgdata.f2620e1;
        float f5 = (i == 24 || (i >= 33 && i <= 37)) ? 0.0f : 540.0f;
        this.f5887n1 = z2;
        if (z2 && (imageView = this.f5898r0) != null && this.f5904t0 != null) {
            boolean z4 = imageView.getLeft() <= this.f5904t0.getLeft();
            this.f5890o1 = z4 ? -(this.f5898r0.getRight() + f2) : (width - this.f5898r0.getLeft()) + f2;
            this.f5893p1 = z4 ? -f5 : f5;
            this.f5896q1 = !z4 ? -(this.f5904t0.getRight() + f2) : (width - this.f5904t0.getLeft()) + f2;
            this.f5899r1 = !z4 ? -f5 : f5;
        }
        if (!z2) {
            m3059H();
            m3060I();
            m3049R(imageView3, true);
            m3049R(imageView4, true);
            m3049R(imageView5, true);
            m3049R(imageView6, true);
            boolean z5 = cfgdata.f2615d1.f7103c && AbstractC1539g1.m4220h0(cfgdata, null);
            boolean z6 = cfgdata.f2615d1.f7104d && AbstractC1539g1.m4220h0(cfgdata, null);
            m3049R(textView, z5);
            m3049R(textView2, z5);
            m3049R(textView3, z6);
            m3049R(textView4, z6);
        }
        final int[] m3297c = AbstractC1372y1.m3297c();
        this.f5884m1 = true;
        final float f6 = f5;
        m3072f(z2 ? 0.0f : 1.0f, imageView3, imageView5, textView, textView3, f3, -f5, imageView4, imageView6, textView2, textView4, left, f6, f4);
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5881l1 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f5881l1);
        this.f5881l1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: q0.K
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C1275O c1275o = C1275O.this;
                c1275o.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f7 = z2 ? floatValue : 1.0f - floatValue;
                float f8 = f6;
                c1275o.m3072f(f7, imageView3, imageView5, textView, textView3, f3, -f8, imageView4, imageView6, textView2, textView4, left, f8, f4);
                AbstractC1372y1.m3295a(m3297c, floatValue);
            }
        });
        this.f5881l1.addListener(new C1269L(this, m3297c, imageView3, imageView5, textView, textView3, imageView4, imageView6, textView2, textView4, z2));
        this.f5881l1.start();
    }

    /* renamed from: f */
    public final void m3072f(float f2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, float f3, float f4, ImageView imageView3, ImageView imageView4, TextView textView3, TextView textView4, float f5, float f6, float f7) {
        m3051g(imageView, imageView2, textView, textView2, f3, f4, f2);
        m3051g(imageView3, imageView4, textView3, textView4, f5, f6, f2);
        if (this.f5887n1) {
            m3051g(this.f5898r0, this.f5901s0, null, null, this.f5890o1, this.f5893p1, f2);
            m3051g(this.f5904t0, this.f5907u0, null, null, this.f5896q1, this.f5899r1, f2);
        }
        HolePunchImageView holePunchImageView = this.f5811G;
        if (holePunchImageView != null) {
            holePunchImageView.setTranslationY(f7 * f2);
        }
        ImageView imageView5 = this.f5813H;
        if (imageView5 != null) {
            imageView5.setTranslationY(f7 * f2);
        }
    }

    /* renamed from: h */
    public final void m3073h() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-865759859);
        gradientDrawable.setCornerRadius(10.0f);
        this.f5835S.setBackgroundTintList(null);
        this.f5835S.setBackgroundTintMode(null);
        this.f5835S.setBackground(gradientDrawable);
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.f5835S.setPadding(applyDimension, applyDimension2, applyDimension, applyDimension2);
        this.f5835S.setTextColor(-1);
    }

    /* renamed from: i */
    public final void m3074i() {
        m3067U(this.f5828O0 ? 1.0f : 0.0f);
    }

    /* renamed from: j */
    public final void m3075j(float f2, Typeface typeface) {
        TextView[] textViewArr = {this.f5868h0, this.f5871i0, this.f5877k0, this.f5802B0, this.f5814H0, this.f5880l0, this.f5874j0, this.f5843W};
        for (int i = 0; i < 8; i++) {
            TextView textView = textViewArr[i];
            if (textView != null) {
                textView.setTextSize(2, f2);
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m3076k(Typeface typeface) {
        if (typeface == null) {
            return;
        }
        TextView[] textViewArr = {this.f5862f0, this.f5857d0, this.f5865g0, this.f5859e0, this.f5827O, this.f5829P, this.f5823M, this.f5825N, this.f5845X, this.f5849Z, this.f5853b0, this.f5855c0, this.f5841V, this.f5843W, this.f5839U, this.f5818J0, this.f5880l0, this.f5877k0, this.f5868h0, this.f5871i0, this.f5874j0, this.f5802B0, this.f5814H0, this.f5835S, this.f5837T, this.f5815I, this.f5817J, this.f5805D, this.f5807E};
        for (int i = 0; i < 29; i++) {
            TextView textView = textViewArr[i];
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: l */
    public final boolean m3077l() {
        cfgData cfgdata = this.f5894q;
        if (!cfgdata.f2537K2 || m3081p()) {
            return false;
        }
        HolePunchLayout holePunchLayout = this.f5830P0;
        if ((holePunchLayout == null || !holePunchLayout.m1807m()) && !this.f5828O0) {
            return !AbstractC1372y1.m3272C() && cfgdata.f2561Q2 && this.f5826N0;
        }
        return true;
    }

    /* renamed from: m */
    public final void m3078m() {
        ValueAnimator valueAnimator = this.f5832Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5832Q0 = null;
        }
    }

    /* renamed from: n */
    public final void m3079n(int i, int i2) {
        View view = this.f5861f;
        View findViewById = view.findViewById(i2);
        View findViewById2 = view.findViewById(i);
        C1592d c1592d = (C1592d) findViewById2.getLayoutParams();
        c1592d.f9046i = findViewById.getId();
        c1592d.f9065t = findViewById.getId();
        c1592d.f9067v = findViewById.getId();
        findViewById2.setLayoutParams(c1592d);
    }

    /* renamed from: o */
    public final void m3080o() {
        this.f5822L0 = 0.0f;
        TextView textView = this.f5835S;
        if (textView == null) {
            return;
        }
        textView.removeCallbacks(this.f5824M0);
        this.f5835S.animate().cancel();
        this.f5835S.setAlpha(0.0f);
        this.f5835S.setText("");
    }

    /* renamed from: p */
    public final boolean m3081p() {
        cfgData cfgdata = this.f5894q;
        EnumC1456b enumC1456b = cfgdata.f2615d1;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        enumC1456b.getClass();
        if (enumC1456b == EnumC1456b.GCircle || enumC1456b == EnumC1456b.TOG) {
            return true;
        }
        return (enumC1456b == EnumC1456b.LBSpeed || enumC1456b == EnumC1456b.vaz01 || enumC1456b == EnumC1456b.chrono) && enumC1455a == EnumC1455a.f6949f;
    }

    /* renamed from: q */
    public final void m3082q(float f2) {
        float f3 = f2 < 0.0f ? 0.0f : f2;
        if (f3 > 22.0f) {
            f5798x1 = -65536;
        } else if (f3 > 18.0f) {
            f5798x1 = -256;
        } else {
            f5798x1 = -1;
        }
        if (f3 > 0.0f) {
            m3083r(R.id.id_avgFuelCons, "", f3, "L", f5798x1, "%.1f");
        } else {
            this.f5868h0.setText("-.- L");
        }
        TextView textView = (TextView) this.f5861f.findViewById(R.id.id_avgFuelCons_1);
        SpannableString spannableString = new SpannableString("            \n100km");
        spannableString.setSpan(new StrikethroughSpan(), 0, 12, 0);
        textView.setText(spannableString);
    }

    /* renamed from: r */
    public final void m3083r(int i, String str, float f2, String str2, int i2, String str3) {
        TextView textView = (TextView) this.f5861f.findViewById(i);
        String replace = String.format(Locale.ENGLISH, str3, Float.valueOf(f2)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m169w(str, replace, str2));
        spannableString.setSpan(AbstractC0062j.m155i(textView, -7829368, i2), str.length(), replace.length() + str.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: s */
    public final void m3084s(float f2) {
        this.f5803C.m3034a(f2);
        if (this.f5869h1) {
            this.f5883m0.setProgress(Math.round(f2));
        }
        if (f2 < -90.0f) {
            this.f5851a0.setText("--°C");
            return;
        }
        if (f2 < 40.0f) {
            f5798x1 = -16776961;
        } else if (f2 > 112.0f) {
            f5798x1 = -65536;
        } else if (f2 > 107.0f) {
            f5798x1 = -256;
        } else {
            f5798x1 = -1;
        }
        if (this.f5872i1) {
            m3083r(R.id.id_coolant_t, "        ", f2, "°C", f5798x1, "%.0f");
        }
        if (this.f5875j1) {
            m3083r(R.id.tUp, "", f2, "°C", f5798x1, "%.0f");
        }
    }

    /* renamed from: t */
    public final void m3085t(float f2) {
        EnumC1457c enumC1457c;
        if (!this.f5838T0) {
            this.f5910v0.setVisibility(4);
            this.f5818J0.setVisibility(4);
            this.f5912w0.setVisibility(4);
            return;
        }
        int i = (int) f2;
        byte b2 = (byte) (i & 15);
        byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
        cfgData cfgdata = this.f5894q;
        if (!cfgdata.f2589X2 || (enumC1457c = cfgdata.f2543M0) == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite) {
            b3 = 1;
            b2 = 1;
        }
        if (b2 == 1) {
            this.f5910v0.setVisibility(4);
            this.f5818J0.setVisibility(4);
        } else if (b2 == 2) {
            this.f5910v0.setVisibility(0);
            this.f5818J0.setVisibility(0);
            this.f5910v0.setColorFilter(-7829368);
        } else if (b2 == 3) {
            this.f5910v0.setVisibility(0);
            this.f5818J0.setVisibility(0);
            this.f5910v0.setColorFilter(-16711936);
        }
        if (this.f5891p.m1747f() < 20.0d) {
            this.f5818J0.setVisibility(4);
        }
        if (b3 == 1) {
            this.f5912w0.setVisibility(4);
            return;
        }
        if (b3 == 2) {
            this.f5912w0.setVisibility(0);
            this.f5912w0.setColorFilter(-7829368);
        } else if (b3 == 3) {
            this.f5912w0.setVisibility(0);
            this.f5912w0.setColorFilter(-16711936);
        }
    }

    /* renamed from: u */
    public final void m3086u(float f2) {
        cfgData cfgdata = this.f5894q;
        if (cfgdata.f2543M0.f7147f) {
            return;
        }
        this.f5801B.m3034a(f2);
        if (this.f5869h1) {
            this.f5918z0.setProgress(Math.round(f2));
        }
        float m1789h = cfgdata.m1789h() * f2;
        if (f2 < 15.0f) {
            f5798x1 = -65536;
        } else if (f2 < 30.0f) {
            f5798x1 = -256;
        } else {
            f5798x1 = -1;
        }
        if (this.f5872i1) {
            m3083r(R.id.id_fuel, "", m1789h, "L", f5798x1, "%.0f");
        }
        if (this.f5875j1) {
            m3083r(R.id.fUp, "", m1789h, "L", f5798x1, "%.0f");
        }
    }

    /* renamed from: v */
    public final void m3087v(float f2) {
        cfgData cfgdata = this.f5894q;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c.f7147f) {
            float f3 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1776v = this.f5891p.m1776v();
            float m1786e = cfgdata.m1786e(f2, m1776v, f3);
            this.f5801B.m3034a(cfgdata.m1787f(f2, m1776v, f3));
            if (this.f5869h1) {
                this.f5918z0.setProgress(Math.round(f2 * f3));
            }
            float m1788g = (cfgdata.m1788g() * (f2 * f3)) / 100.0f;
            if (m1786e < 15.0f) {
                f5798x1 = -65536;
            } else if (m1786e < 30.0f) {
                f5798x1 = -256;
            } else {
                f5798x1 = -1;
            }
            if (this.f5872i1) {
                m3083r(R.id.id_fuel, "", m1788g, "L", f5798x1, "%.0f");
            }
            if (this.f5875j1) {
                m3083r(R.id.fUp, "", m1786e, "L", f5798x1, "%.0f");
            }
        }
    }

    /* renamed from: w */
    public final void m3088w(float f2) {
        cfgData cfgdata = this.f5894q;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c.f7147f) {
            float f3 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = this.f5891p.m1775u();
            float m1786e = cfgdata.m1786e(m1775u, f2, f3);
            this.f5801B.m3034a(cfgdata.m1787f(m1775u, f2, f3));
            if (this.f5869h1) {
                this.f5810F0.setProgress(Math.round(f2));
            }
            float f4 = (f2 * 50.0f) / 100.0f;
            if (m1786e < 15.0f) {
                f5798x1 = -65536;
            } else if (m1786e < 30.0f) {
                f5798x1 = -256;
            } else {
                f5798x1 = -1;
            }
            if (this.f5872i1) {
                m3083r(R.id.id_fuel2, "", f4, "L", f5798x1, "%.0f");
            }
            if (this.f5875j1) {
                m3083r(R.id.fUp, "", m1786e, "L", f5798x1, "%.0f");
            }
        }
    }

    /* renamed from: x */
    public final void m3089x(String str) {
        if (this.f5894q.f2537K2 && this.f5835S != null) {
            m3073h();
            this.f5822L0 = 0.0f;
            TextView textView = this.f5835S;
            RunnableC1265J runnableC1265J = this.f5824M0;
            textView.removeCallbacks(runnableC1265J);
            this.f5835S.animate().cancel();
            this.f5835S.setAlpha(1.0f);
            this.f5835S.setText("  " + str + "  ");
            this.f5835S.postDelayed(runnableC1265J, 3000L);
        }
    }

    /* renamed from: y */
    public final void m3090y() {
        String str;
        String str2;
        cfgData cfgdata = this.f5894q;
        boolean z2 = cfgdata.f2569S2;
        carData cardata = this.f5891p;
        String str3 = "";
        if (z2) {
            str = "ODO: " + String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1771r())).replace(",", ".");
        } else {
            str = "";
        }
        if (cfgdata.f2573T2) {
            str2 = "Trip: " + String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1767p())).replace(",", ".");
        } else {
            str2 = "";
        }
        if (cfgdata.f2577U2) {
            str3 = "Day: " + String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(",", ".");
        }
        String str4 = str + "\n" + str3 + ((!this.f5856c1 || cfgdata.f2620e1 == 11) ? " " : "\n") + str2;
        SpannableString spannableString = new SpannableString(str4);
        this.f5825N.setTextColor(-1);
        this.f5823M.setTextColor(-1);
        int indexOf = str4.indexOf("ODO:");
        if (indexOf > -1) {
            spannableString.setSpan(new ForegroundColorSpan(-7829368), indexOf, indexOf + 4, 0);
        }
        int indexOf2 = str4.indexOf("Trip:");
        if (indexOf2 > -1) {
            spannableString.setSpan(new ForegroundColorSpan(-7829368), indexOf2, indexOf2 + 5, 0);
        }
        int indexOf3 = str4.indexOf("Day:");
        if (indexOf3 > -1) {
            spannableString.setSpan(new ForegroundColorSpan(-7829368), indexOf3, indexOf3 + 4, 0);
        }
        TextView textView = this.f5823M;
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        textView.setText(spannableString, bufferType);
        this.f5825N.setText(spannableString, bufferType);
    }

    /* renamed from: z */
    public final void m3091z() {
        if (this.f5894q.f2543M0.f7147f) {
            return;
        }
        carData cardata = this.f5891p;
        m3083r(R.id.id_RemainOdometer, "         ", cardata.m1777w(), "km", -1, "%.0f");
        m3054C(cardata.m1777w());
    }
}
