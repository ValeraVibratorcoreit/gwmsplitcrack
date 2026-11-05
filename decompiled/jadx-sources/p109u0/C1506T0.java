package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.altaysoft.t500_split.p061ip.Theme51GaugeArcView;
import com.altaysoft.t500_split.p061ip.Theme51SevenSegView;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.File;
import java.util.Locale;
import java.util.function.Consumer;
import p000A.AbstractC0000a;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p017H0.RunnableC0123b;
import p022K.C0174W;
import p022K.C0181b0;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1261H;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1354s1;
import p098q0.AbstractC1372y1;
import p098q0.C1311e0;
import p106t0.EnumC1455a;
import p106t0.EnumC1456b;
import p106t0.EnumC1457c;
import p111v.C1592d;

/* renamed from: u0.T0 */
/* loaded from: classes.dex */
public final class C1506T0 {

    /* renamed from: m1 */
    public static final int f7762m1 = Color.rgb(232, 238, 245);

    /* renamed from: n1 */
    public static final int f7763n1 = Color.rgb(138, 147, 160);

    /* renamed from: o1 */
    public static final int f7764o1 = R.drawable.ip_theme_51_media_frame;

    /* renamed from: A */
    public TextView f7765A;

    /* renamed from: A0 */
    public boolean f7766A0;

    /* renamed from: B */
    public TextView f7767B;

    /* renamed from: B0 */
    public C1531e f7768B0;

    /* renamed from: C */
    public TextView f7769C;

    /* renamed from: C0 */
    public C1504S0 f7770C0;

    /* renamed from: D */
    public TextView f7771D;

    /* renamed from: D0 */
    public C1504S0 f7772D0;

    /* renamed from: E */
    public TextView f7773E;

    /* renamed from: E0 */
    public C1504S0 f7774E0;

    /* renamed from: F */
    public TextView f7775F;

    /* renamed from: F0 */
    public C1504S0 f7776F0;

    /* renamed from: G */
    public View f7777G;

    /* renamed from: G0 */
    public boolean f7778G0;

    /* renamed from: H */
    public TextView f7779H;

    /* renamed from: H0 */
    public boolean f7780H0;

    /* renamed from: I */
    public TextView f7781I;

    /* renamed from: J */
    public TextView f7783J;

    /* renamed from: K */
    public View f7785K;

    /* renamed from: K0 */
    public ValueAnimator f7786K0;

    /* renamed from: L */
    public ViewGroup f7787L;

    /* renamed from: L0 */
    public ValueAnimator f7788L0;

    /* renamed from: M */
    public TextView f7789M;

    /* renamed from: M0 */
    public boolean f7790M0;

    /* renamed from: N */
    public TextView f7791N;

    /* renamed from: O */
    public TextView f7793O;

    /* renamed from: P */
    public ViewGroup f7795P;

    /* renamed from: Q */
    public TextView f7797Q;

    /* renamed from: Q0 */
    public float f7798Q0;

    /* renamed from: R */
    public TextView f7799R;

    /* renamed from: R0 */
    public float f7800R0;

    /* renamed from: S */
    public TextView f7801S;

    /* renamed from: S0 */
    public boolean f7802S0;

    /* renamed from: T */
    public TextView f7803T;

    /* renamed from: T0 */
    public Boolean f7804T0;

    /* renamed from: U */
    public TextView f7805U;

    /* renamed from: V */
    public TextView f7807V;

    /* renamed from: V0 */
    public Boolean f7808V0;

    /* renamed from: W */
    public ImageView f7809W;

    /* renamed from: W0 */
    public float f7810W0;

    /* renamed from: X */
    public ImageView f7811X;

    /* renamed from: X0 */
    public float f7812X0;

    /* renamed from: Y */
    public Theme51SevenSegView f7813Y;

    /* renamed from: Y0 */
    public float f7814Y0;

    /* renamed from: Z */
    public Theme51SevenSegView f7815Z;

    /* renamed from: a */
    public final C1537g f7817a;

    /* renamed from: a0 */
    public TextView f7818a0;

    /* renamed from: b */
    public final View f7820b;

    /* renamed from: b0 */
    public TextView f7821b0;

    /* renamed from: c */
    public final Context f7823c;

    /* renamed from: c0 */
    public View f7824c0;

    /* renamed from: c1 */
    public ValueAnimator f7825c1;

    /* renamed from: d0 */
    public ImageView f7827d0;

    /* renamed from: d1 */
    public boolean f7828d1;

    /* renamed from: e0 */
    public TextView f7830e0;

    /* renamed from: f0 */
    public ImageView f7833f0;

    /* renamed from: f1 */
    public Boolean f7834f1;

    /* renamed from: g */
    public ViewGroup f7835g;

    /* renamed from: g0 */
    public ImageView f7836g0;

    /* renamed from: g1 */
    public float f7837g1;

    /* renamed from: h */
    public View f7838h;

    /* renamed from: h0 */
    public ImageView f7839h0;

    /* renamed from: i */
    public View f7841i;

    /* renamed from: i0 */
    public View f7842i0;

    /* renamed from: i1 */
    public C1525c f7843i1;

    /* renamed from: j */
    public View f7844j;

    /* renamed from: j0 */
    public View f7845j0;

    /* renamed from: k */
    public View f7847k;

    /* renamed from: k0 */
    public View f7848k0;

    /* renamed from: l */
    public View f7850l;

    /* renamed from: l0 */
    public View f7851l0;

    /* renamed from: m */
    public View f7853m;

    /* renamed from: m0 */
    public int f7854m0;

    /* renamed from: n */
    public C1528d f7855n;

    /* renamed from: n0 */
    public ImageView f7856n0;

    /* renamed from: o */
    public ImageView f7857o;

    /* renamed from: o0 */
    public TextView f7858o0;

    /* renamed from: p */
    public ImageView f7859p;

    /* renamed from: p0 */
    public TextView f7860p0;

    /* renamed from: q */
    public ImageView f7861q;

    /* renamed from: q0 */
    public TextView f7862q0;

    /* renamed from: r */
    public Theme51GaugeArcView f7863r;

    /* renamed from: r0 */
    public TextView f7864r0;

    /* renamed from: s */
    public Theme51GaugeArcView f7865s;

    /* renamed from: s0 */
    public ProgressBar f7866s0;

    /* renamed from: t */
    public Theme51GaugeArcView f7867t;

    /* renamed from: t0 */
    public long f7868t0;

    /* renamed from: u */
    public Theme51GaugeArcView f7869u;

    /* renamed from: u0 */
    public long f7870u0;

    /* renamed from: v */
    public Bitmap f7871v;

    /* renamed from: v0 */
    public boolean f7872v0;

    /* renamed from: w */
    public Bitmap f7873w;

    /* renamed from: w0 */
    public long f7874w0;

    /* renamed from: x */
    public TextView f7875x;

    /* renamed from: y */
    public TextView f7877y;

    /* renamed from: z */
    public TextView f7879z;

    /* renamed from: z0 */
    public float f7880z0;

    /* renamed from: d */
    public final cfgData f7826d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f7829e = carData.getInstance();

    /* renamed from: f */
    public final Handler f7832f = new Handler(Looper.getMainLooper());

    /* renamed from: x0 */
    public float f7876x0 = -1.0f;

    /* renamed from: y0 */
    public float f7878y0 = -1.0f;

    /* renamed from: I0 */
    public boolean f7782I0 = true;

    /* renamed from: J0 */
    public boolean f7784J0 = true;

    /* renamed from: N0 */
    public final RunnableC1493M0 f7792N0 = new RunnableC1493M0(this, 3);

    /* renamed from: O0 */
    public boolean f7794O0 = false;

    /* renamed from: P0 */
    public float f7796P0 = 0.0f;

    /* renamed from: U0 */
    public int f7806U0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: Z0 */
    public float f7816Z0 = 1.0f;

    /* renamed from: a1 */
    public float f7819a1 = 0.0f;

    /* renamed from: b1 */
    public float f7822b1 = 0.0f;

    /* renamed from: e1 */
    public int f7831e1 = -1;

    /* renamed from: h1 */
    public int f7840h1 = 999;

    /* renamed from: j1 */
    public final RunnableC1502R0 f7846j1 = new RunnableC1502R0(this, 0);

    /* renamed from: k1 */
    public final RunnableC1502R0 f7849k1 = new RunnableC1502R0(this, 1);

    /* renamed from: l1 */
    public final RunnableC1502R0 f7852l1 = new RunnableC1502R0(this, 2);

    public C1506T0(C1537g c1537g, View view) {
        this.f7817a = c1537g;
        this.f7820b = view;
        this.f7823c = view.getContext();
    }

    /* renamed from: A */
    public static void m3923A(View view, float f2, float f3) {
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

    /* renamed from: H */
    public static void m3924H(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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

    /* renamed from: J0 */
    public static void m3925J0(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    /* renamed from: P0 */
    public static RectF m3926P0(RectF rectF, float f2) {
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

    /* renamed from: Q0 */
    public static void m3927Q0(View view, boolean z2, float f2, boolean z3) {
        Drawable background;
        int i = 0;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        Drawable mutate = background.mutate();
        view.setBackground(mutate);
        if (mutate instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) mutate;
            Drawable drawable = layerDrawable.getDrawable(0);
            if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                if (z2) {
                    gradientDrawable.setCornerRadii(new float[]{14.0f, 14.0f, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
                } else {
                    gradientDrawable.setCornerRadii(new float[]{f2, f2, 14.0f, 14.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
            }
            if (layerDrawable.getNumberOfLayers() > 1) {
                if (z3) {
                    int width = view.getWidth();
                    int round = Math.round(f2);
                    i = width > 0 ? Math.min(round, Math.max(0, width - 8)) : round;
                }
                if (z2) {
                    layerDrawable.setLayerInset(1, 0, 0, i, 0);
                } else {
                    layerDrawable.setLayerInset(1, i, 0, 0, 0);
                }
            }
        }
    }

    /* renamed from: R0 */
    public static void m3928R0(View view, int i) {
        if (view == null || !(view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: S0 */
    public static void m3929S0(TextView textView, float f2, String str, int i, String str2) {
        if (textView == null) {
            return;
        }
        String replace = String.format(Locale.ENGLISH, str2, Float.valueOf(f2)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, str));
        spannableString.setSpan(AbstractC0062j.m155i(textView, -7829368, i), 0, replace.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: T0 */
    public static void m3930T0(View view, float f2) {
        if (view != null) {
            view.setElevation(f2);
        }
    }

    /* renamed from: U0 */
    public static void m3931U0(View view, int i) {
        if (view == null || i <= 0) {
            return;
        }
        view.setMinimumHeight(i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: V0 */
    public static void m3932V0(View view, float f2) {
        Drawable background;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        if (max < 0.999f) {
            background.mutate().setAlpha(Math.round(max * 255.0f));
            view.invalidate();
        } else {
            Drawable.ConstantState constantState = background.getConstantState();
            if (constantState != null) {
                view.setBackground(constantState.newDrawable(view.getResources()).mutate());
            }
        }
    }

    /* renamed from: W */
    public static String m3933W(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: W0 */
    public static void m3934W0(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(-10556716);
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: X0 */
    public static void m3935X0(TextView textView, float f2, float f3) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, f2 * f3);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(0.0f, 1.0f);
    }

    /* renamed from: a1 */
    public static void m3936a1(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b0 */
    public static void m3937b0(ImageView imageView, float f2, boolean z2, float[] fArr, float[] fArr2) {
        float width;
        float f3;
        fArr[0] = z2 ? imageView.getWidth() + r0 : imageView.getLeft();
        fArr[1] = imageView.getTop();
        float f4 = 0.0f;
        if (f2 < 0.999f) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            return;
        }
        float f5 = f2 - 1.0f;
        if (Math.abs(f5) < 0.001f) {
            width = 0.0f;
        } else {
            width = imageView.getWidth() * 0.13f * f5;
            if (!z2) {
                width = -width;
            }
        }
        if (Math.abs(f5) < 0.001f || f2 < 1.0f) {
            f3 = 0.0f;
        } else {
            f3 = (10.0f * f5) / 0.3f;
            if (!z2) {
                f3 = -f3;
            }
        }
        fArr2[0] = width + f3;
        if (Math.abs(f5) >= 0.001f && f2 >= 1.0f) {
            f4 = ((f5 * (-20.0f)) / 0.3f) + ((-imageView.getHeight()) * 0.13f * f5);
        }
        fArr2[1] = f4;
    }

    /* renamed from: b1 */
    public static void m3938b1(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: c1 */
    public static void m3939c1(Theme51GaugeArcView theme51GaugeArcView, C1504S0 c1504s0) {
        if (theme51GaugeArcView == null || c1504s0 == null) {
            return;
        }
        theme51GaugeArcView.post(new RunnableC1559n0(c1504s0, 13, theme51GaugeArcView));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3940e(View view, float f2) {
        if (view == null) {
            return;
        }
        int round = Math.round(f2);
        int round2 = Math.round(10.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = layoutParams.height != round;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = -round2;
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                if (z2) {
                    return;
                }
                layoutParams.height = round;
                view.setLayoutParams(layoutParams);
                return;
            }
        }
        z2 = z3;
        if (z2) {
        }
    }

    /* renamed from: k */
    public static void m3941k(ImageView imageView, boolean z2) {
        if (imageView == null) {
            return;
        }
        C1592d c1592d = (C1592d) imageView.getLayoutParams();
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
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = 40;
        } else {
            c1592d.f9044h = -1;
            c1592d.f9038e = 0;
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = 40;
            ((ViewGroup.MarginLayoutParams) c1592d).rightMargin = 0;
        }
        imageView.setLayoutParams(c1592d);
    }

    /* renamed from: A0 */
    public final void m3942A0() {
        if (this.f7807V == null) {
            return;
        }
        float m1773s = this.f7829e.m1773s();
        if (m1773s < -90.0f) {
            this.f7807V.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        this.f7807V.setTextColor(-7829368);
        spannableString.setSpan(new ForegroundColorSpan(f7762m1), 0, replace.length(), 33);
        this.f7807V.setText(spannableString);
    }

    /* renamed from: B */
    public final void m3943B(float f2) {
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, f2));
        if (m4001i0()) {
            max = 1.0f;
        }
        m3932V0(this.f7842i0, max);
        m3932V0(this.f7777G, max);
        float max2 = Math.max(0.0f, Math.min(1.0f, this.f7822b1));
        if (max2 > 0.001f) {
            m3980Z0(this.f7785K, max2);
            m3980Z0(this.f7795P, max2);
        } else {
            m3932V0(this.f7785K, max);
            m3932V0(this.f7795P, max);
        }
    }

    /* renamed from: B0 */
    public final void m3944B0() {
        cfgData cfgdata = this.f7826d;
        if (cfgdata.f2537K2 && m4001i0() && !m3977Y()) {
            C1504S0 c1504s0 = this.f7770C0;
            float m3962L0 = c1504s0 != null ? c1504s0.f7758c : m3962L0();
            C1504S0 c1504s02 = this.f7772D0;
            float m3960K0 = c1504s02 != null ? c1504s02.f7758c : m3960K0();
            TextView textView = this.f7818a0;
            int i = -1;
            if (textView != null) {
                textView.setTextColor(m3962L0 > cfgdata.f2568S1 ? -65536 : m3962L0 > cfgdata.f2564R1 ? -256 : -1);
                this.f7818a0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m3962L0)).replace(",", "."));
            }
            TextView textView2 = this.f7821b0;
            if (textView2 != null) {
                if (m3960K0 > cfgdata.f2576U1) {
                    i = -65536;
                } else if (m3960K0 > cfgdata.f2572T1) {
                    i = -256;
                }
                textView2.setTextColor(i);
                this.f7821b0.setText(AbstractC1256E0.m2986A(m3960K0));
            }
        }
    }

    /* renamed from: C */
    public final void m3945C() {
        if (this.f7816Z0 < 0.999f) {
            return;
        }
        m4012m0();
        m3985c0();
        m3976X(this.f7816Z0);
        m3968O0();
        m3985c0();
        m3976X(this.f7816Z0);
        m4009l0();
    }

    /* renamed from: C0 */
    public final void m3946C0() {
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup == null || this.f7790M0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7835g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7835g.post(new RunnableC1493M0(this, 9));
            return;
        }
        int round = Math.round(this.f7823c.getResources().getDisplayMetrics().density * 96.0f);
        float m4022p1 = m4022p1();
        m3943B(m4022p1);
        m4035u(width, height, round, AbstractC1561o.m4297a(1.0f, this.f7822b1, 0.0f, m4022p1()));
        m4000i(width, height, round, m4022p1);
    }

    /* renamed from: D */
    public final void m3947D() {
        boolean m4040v1 = m4040v1();
        Boolean bool = this.f7834f1;
        if (bool == null || bool.booleanValue() != m4040v1) {
            this.f7834f1 = Boolean.valueOf(m4040v1);
            m4033t0();
        }
        if (m4040v1 && m4034t1()) {
            m4029s();
            m4031s1();
        } else if (!m4004j0() && !m4001i0() && !m3993f1()) {
            m3974U();
        }
        float m4297a = m4040v1 ? AbstractC1561o.m4297a(1.0f, this.f7822b1, 0.0f, this.f7819a1) : 0.0f;
        if (m4001i0() || m3987d0()) {
            m3936a1(this.f7847k);
            m3936a1(this.f7850l);
            m3936a1(this.f7853m);
        } else {
            float f2 = this.f7823c.getResources().getDisplayMetrics().density;
            float f3 = (80.0f * f2) + 10.0f;
            float f4 = f2 * 14.0f;
            boolean z2 = (!m4040v1() || m3990e1() || m4001i0()) ? false : true;
            float f5 = z2 ? 0.0f : f4;
            m3940e(this.f7847k, f3);
            m3940e(this.f7853m, f3);
            View view = this.f7850l;
            if (view != null) {
                m3940e(view, f5 + 25.0f + 10.0f);
                C1528d c1528d = this.f7855n;
                if (c1528d != null) {
                    c1528d.m4167b(f5);
                }
            }
            m3923A(this.f7847k, m4297a, f3);
            m3923A(this.f7850l, m4297a, f5 + 25.0f + 10.0f);
            m3923A(this.f7853m, m4297a, f3);
            float max = z2 ? Math.max(14.0f, (f3 - 10.0f) - 25.0f) : 14.0f;
            m3927Q0(this.f7847k, true, max, z2);
            m3927Q0(this.f7853m, false, max, z2);
        }
        if (m4040v1) {
            View view2 = this.f7847k;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.f7850l;
            if (view3 != null) {
                view3.bringToFront();
            }
            View view4 = this.f7853m;
            if (view4 != null) {
                view4.bringToFront();
            }
        }
        View view5 = this.f7845j0;
        if (view5 != null) {
            view5.bringToFront();
        }
        View view6 = this.f7842i0;
        if (view6 != null && view6.getVisibility() == 0) {
            this.f7842i0.bringToFront();
            View view7 = this.f7845j0;
            if (view7 != null) {
                view7.bringToFront();
            }
        }
        View view8 = this.f7777G;
        if (view8 != null && view8.getVisibility() == 0) {
            this.f7777G.bringToFront();
        }
        m4020p(false);
        m3945C();
        m3989e0();
        if (m3977Y()) {
            ImageView m4012m0 = m4012m0();
            cfgData cfgdata = this.f7826d;
            boolean z3 = cfgdata.f2636h2;
            m4003j(m4012m0, z3 ? this.f7865s : this.f7863r, z3 ? this.f7815Z : this.f7813Y, m3985c0(), false, this.f7816Z0, 0.0f, 0.0f);
            m4010l1(m4012m0(), this.f7816Z0, false, 0.0f, 0.0f);
            if (m3993f1()) {
                m4044x();
            } else {
                ImageView m3968O0 = m3968O0();
                boolean z4 = cfgdata.f2636h2;
                m4003j(m3968O0, z4 ? this.f7863r : this.f7865s, z4 ? this.f7813Y : this.f7815Z, m3985c0(), true, this.f7816Z0, 0.0f, 0.0f);
                m4010l1(m3968O0(), this.f7816Z0, true, 0.0f, 0.0f);
            }
            m4041w();
        }
    }

    /* renamed from: D0 */
    public final float m3948D0(float f2) {
        float m4018o0 = m4018o0(this.f7781I);
        return f2 >= 0.999f ? m4018o0 - (-21.0f) : m4018o0;
    }

    /* renamed from: E */
    public final void m3949E() {
        View view = this.f7841i;
        if (view == null) {
            return;
        }
        cfgData cfgdata = this.f7826d;
        boolean z2 = cfgdata.f2625f1 != EnumC1455a.f6981n;
        boolean z3 = view.getVisibility() == 0;
        this.f7841i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            AbstractC1539g1.m4215f(R.drawable.ip_theme_51_top_bar, this.f7841i, AbstractC1539g1.m4230m0(cfgdata, this.f7829e));
            AbstractC1539g1.m4221i(this.f7805U, this.f7807V, cfgdata, m3977Y());
        }
        if (z3 == z2 || !m3995g0()) {
            return;
        }
        m4029s();
        m4031s1();
    }

    /* renamed from: E0 */
    public final void m3950E0(ImageView imageView) {
        View[] m3979Z = m3979Z(imageView);
        int length = m3979Z.length;
        for (int i = 0; i < length; i++) {
            View view = m3979Z[i];
            m3925J0(view, view == this.f7781I ? m3948D0(this.f7816Z0) : m4018o0(view), m4021p0(view));
        }
    }

    /* renamed from: F */
    public final void m3951F(TextView textView) {
        if (textView == null) {
            return;
        }
        if (Math.abs(0.0f) < 0.001f) {
            m3925J0(textView, 0.0f, 0.0f);
        } else if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.post(new RunnableC1559n0(this, 14, textView));
        } else {
            m3924H(textView, 1.0f, textView.getLeft(), textView.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: F0 */
    public final void m3952F0() {
        ImageView m4012m0 = m4012m0();
        boolean z2 = this.f7826d.f2636h2;
        Theme51GaugeArcView theme51GaugeArcView = z2 ? this.f7865s : this.f7863r;
        Theme51SevenSegView theme51SevenSegView = z2 ? this.f7815Z : this.f7813Y;
        m3925J0(m4012m0, 0.0f, 0.0f);
        m3954G0(theme51GaugeArcView);
        m3925J0(theme51SevenSegView, 0.0f, m3985c0());
        m3950E0(m4012m0);
    }

    /* renamed from: G */
    public final void m3953G() {
        boolean z2 = this.f7826d.f2537K2 && m4001i0() && !m3977Y();
        m3938b1(this.f7824c0, z2);
        m3938b1(this.f7818a0, z2);
        m3938b1(this.f7821b0, z2);
        m3951F(this.f7818a0);
        m3951F(this.f7821b0);
    }

    /* renamed from: G0 */
    public final void m3954G0(Theme51GaugeArcView theme51GaugeArcView) {
        if (theme51GaugeArcView == null) {
            return;
        }
        m3925J0(theme51GaugeArcView, 0.0f, (theme51GaugeArcView == this.f7867t || theme51GaugeArcView == this.f7869u) ? 15.0f : 0.0f);
        if (theme51GaugeArcView.getWidth() > 0 && theme51GaugeArcView.getHeight() > 0) {
            theme51GaugeArcView.setPivotX(theme51GaugeArcView.getWidth() * 0.5f);
            theme51GaugeArcView.setPivotY(theme51GaugeArcView.getHeight() * 0.5f);
        }
        Theme51GaugeArcView theme51GaugeArcView2 = this.f7863r;
        if (theme51GaugeArcView == theme51GaugeArcView2 || theme51GaugeArcView == this.f7865s) {
            C1504S0 c1504s0 = theme51GaugeArcView == theme51GaugeArcView2 ? this.f7770C0 : this.f7772D0;
            if (c1504s0 != null) {
                c1504s0.m3920a(theme51GaugeArcView);
            }
        }
    }

    /* renamed from: H0 */
    public final void m3955H0() {
        this.f7832f.removeCallbacks(this.f7792N0);
        m3961L();
        this.f7784J0 = true;
        this.f7796P0 = 0.0f;
        this.f7802S0 = false;
        AbstractC1372y1.m3287R(false, false);
    }

    /* renamed from: I */
    public final void m3956I() {
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f7782I0);
        cfgData cfgdata = this.f7826d;
        if (!cfgdata.f2537K2) {
            m3955H0();
            this.f7835g.setVisibility(4);
            m3969P();
            m3949E();
            m3975V();
            m3994g();
            View view = this.f7838h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        boolean m3977Y = m3977Y();
        carData cardata = this.f7829e;
        if (m3977Y) {
            this.f7835g.setVisibility(0);
            boolean m4004j0 = m4004j0();
            Boolean bool = this.f7804T0;
            if (bool == null || bool.booleanValue() != m4004j0) {
                this.f7804T0 = Boolean.valueOf(m4004j0);
            }
            m4033t0();
            m3991f();
            m4036u0(cardata.m1745e());
            m4038v();
            m3953G();
            m3994g();
            View view2 = this.f7838h;
            if (view2 != null) {
                view2.setVisibility(m4034t1() ? 4 : 8);
            }
            if (m4034t1()) {
                m4029s();
                m4031s1();
                return;
            }
            return;
        }
        m3955H0();
        this.f7835g.setVisibility(0);
        if (m3987d0()) {
            m3969P();
            View view3 = this.f7838h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else if (cfgdata.f2561Q2) {
            m4033t0();
            View view4 = this.f7838h;
            if (view4 != null) {
                view4.setVisibility(4);
            }
            if (m4034t1()) {
                m4029s();
                m4031s1();
            }
        } else {
            if (m4001i0()) {
                m4033t0();
                if (m4034t1()) {
                    m4031s1();
                }
            } else {
                m3969P();
            }
            View view5 = this.f7838h;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        m3938b1(this.f7859p, false);
        m3938b1(this.f7861q, false);
        m3938b1(this.f7863r, false);
        m3938b1(this.f7865s, false);
        m3938b1(this.f7867t, false);
        m3938b1(this.f7869u, false);
        m3938b1(this.f7813Y, false);
        m3938b1(this.f7815Z, false);
        m3938b1(this.f7779H, false);
        m3938b1(this.f7781I, false);
        m3938b1(this.f7799R, false);
        m3938b1(this.f7801S, false);
        if (m3977Y() || AbstractC1539g1.m4194P(cfgdata, cardata)) {
            m4028r1();
        } else {
            m3975V();
        }
        if (!m4001i0()) {
            m3938b1(this.f7783J, false);
            m3938b1(this.f7795P, false);
            m4007k1();
        }
        m3957I0();
        m3952F0();
        m3991f();
        m4036u0(cardata.m1745e());
        m3953G();
        m3944B0();
        m3994g();
        m4045x0(C0639g.m1872x().m1880u());
        m4020p(false);
        m3945C();
        m3989e0();
        m3949E();
    }

    /* renamed from: I0 */
    public final void m3957I0() {
        ImageView m3968O0 = m3968O0();
        boolean z2 = this.f7826d.f2636h2;
        Theme51GaugeArcView theme51GaugeArcView = z2 ? this.f7863r : this.f7865s;
        Theme51SevenSegView theme51SevenSegView = z2 ? this.f7813Y : this.f7815Z;
        m3925J0(m3968O0, 0.0f, 0.0f);
        m3954G0(theme51GaugeArcView);
        m3925J0(theme51SevenSegView, 0.0f, m3985c0());
        m3950E0(m3968O0);
    }

    /* renamed from: J */
    public final void m3958J() {
        final RunnableC1493M0 runnableC1493M0 = new RunnableC1493M0(this, 23);
        final int i = 8;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        };
        carData cardata = this.f7829e;
        C1537g c1537g = this.f7817a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 9;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i3 = 10;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i4 = 11;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i5 = 12;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i6 = 13;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i7 = 14;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i8 = 15;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i9 = 16;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i10 = 17;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i11 = 18;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i12 = 0;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i13 = 1;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i14 = 2;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i15 = 3;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i16 = 4;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i17 = 5;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i18 = 6;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i19 = 7;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.N0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1493M0.run();
                        break;
                    case 1:
                        runnableC1493M0.run();
                        break;
                    case 2:
                        runnableC1493M0.run();
                        break;
                    case 3:
                        runnableC1493M0.run();
                        break;
                    case 4:
                        runnableC1493M0.run();
                        break;
                    case 5:
                        runnableC1493M0.run();
                        break;
                    case 6:
                        runnableC1493M0.run();
                        break;
                    case 7:
                        runnableC1493M0.run();
                        break;
                    case 8:
                        runnableC1493M0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1493M0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1493M0.run();
                        break;
                    case 13:
                        runnableC1493M0.run();
                        break;
                    case 14:
                        runnableC1493M0.run();
                        break;
                    case 15:
                        runnableC1493M0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1493M0.run();
                        break;
                    case 17:
                        runnableC1493M0.run();
                        break;
                    default:
                        runnableC1493M0.run();
                        break;
                }
            }
        });
        final int i20 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i21 = cfgdata4.f2635h1;
                                                    if (i21 >= 0 && i21 <= 2) {
                                                        r4 = i21;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f7823c);
        final int i26 = 6;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 8;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 9;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 10;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 11;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 12;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 13;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 14;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 15;
        cardata.m1756j0(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
        final int i36 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.O0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7663b;

            {
                this.f7663b = this;
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
                        this.f7663b.m3942A0();
                        break;
                    case 1:
                        this.f7663b.m4047y0();
                        break;
                    case 2:
                        this.f7663b.m4047y0();
                        break;
                    case 3:
                        this.f7663b.m4047y0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1506T0 c1506t0 = this.f7663b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1506t0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1506t0.f7840h1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1506t0.f7823c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1506t0.f7826d;
                            if (cfgdata.f2537K2) {
                                c1506t0.f7837g1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1506t0.f7840h1 == -1 && intValue > -1) {
                            c1506t0.f7837g1 = 0.0f;
                            ViewGroup viewGroup = c1506t0.f7835g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1506t0.f7835g.setAlpha(1.0f);
                            }
                            c1506t0.m4002i1("ip");
                        }
                        c1506t0.f7840h1 = intValue;
                        c1506t0.m4042w0();
                        break;
                    case 5:
                        this.f7663b.m4042w0();
                        break;
                    case 6:
                        C1506T0 c1506t02 = this.f7663b;
                        Integer num2 = (Integer) obj;
                        c1506t02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1506t02.f7823c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1506t02.f7826d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1506t02.f7794O0 || !c1506t02.m3993f1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1506t02.f7826d, c1506t02.f7829e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1506t02.f7826d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1506t02.f7823c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1506t02.m4002i1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1506t02.f7829e)) {
                                                                        cfgData cfgdata3 = c1506t02.f7826d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1506t02.f7829e.m1760l0(z2);
                                                                        c1506t02.f7826d.m1795o(c1506t02.f7823c);
                                                                        Context context2 = c1506t02.f7823c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1506t02.f7826d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1506t02.f7826d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1506t02.f7823c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1506t02.m4002i1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M02 = c1506t02.f7792N0;
                                                                    handler.removeCallbacks(runnableC1493M02);
                                                                    handler.postDelayed(runnableC1493M02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1506t02.m3993f1()) {
                                                                    c1506t02.f7794O0 = true;
                                                                    if (c1506t02.m3998h0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1506t02.f7784J0 && ((valueAnimator = c1506t02.f7786K0) == null || !valueAnimator.isRunning())) {
                                                                            c1506t02.m4025q1(true);
                                                                        }
                                                                        Handler handler2 = c1506t02.f7832f;
                                                                        RunnableC1493M0 runnableC1493M03 = c1506t02.f7792N0;
                                                                        handler2.removeCallbacks(runnableC1493M03);
                                                                        handler2.postDelayed(runnableC1493M03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1506t02.f7794O0) {
                                                                    Handler handler3 = c1506t02.f7832f;
                                                                    RunnableC1493M0 runnableC1493M04 = c1506t02.f7792N0;
                                                                    handler3.removeCallbacks(runnableC1493M04);
                                                                    handler3.postDelayed(runnableC1493M04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1506t02.f7790M0) {
                                                        ValueAnimator valueAnimator2 = c1506t02.f7825c1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1506t02.f7782I0;
                                                            if (!z3 || !c1506t02.m4006k0()) {
                                                                boolean z4 = !c1506t02.f7782I0;
                                                                c1506t02.f7782I0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1506t02.m3981a(z3);
                                                                break;
                                                            } else {
                                                                c1506t02.f7831e1 = 0;
                                                                RunnableC1493M0 runnableC1493M05 = new RunnableC1493M0(c1506t02, 20);
                                                                if (!c1506t02.m4006k0() && Math.abs(c1506t02.f7816Z0 - 1.0f) < 0.001f) {
                                                                    runnableC1493M05.run();
                                                                    break;
                                                                } else {
                                                                    c1506t02.f7828d1 = true;
                                                                    c1506t02.m3983b(runnableC1493M05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1506t02.f7826d.f2672o3) {
                                                        Context context3 = c1506t02.f7823c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1506t02.m4002i1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1506t02.m4002i1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1506t02.f7829e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1506t02.f7823c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1506t02.f7826d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1506t02.f7823c, m3282M[0], m3282M[1], 0.7019608f, c1506t02.f7826d.f2657l3);
                                                }
                                                c1506t02.f7766A0 = AbstractC1372y1.f6437g;
                                                c1506t02.m4020p(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1506t02.m3998h0()) {
                                            ValueAnimator valueAnimator3 = c1506t02.f7786K0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1506t02.f7794O0 = false;
                                                c1506t02.m4025q1(c1506t02.f7784J0);
                                                break;
                                            }
                                        }
                                    } else if (c1506t02.f7826d.f2561Q2 && !c1506t02.f7790M0) {
                                        ValueAnimator valueAnimator4 = c1506t02.f7825c1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1506t02.f7826d;
                                            if (cfgdata4.f2561Q2 && !c1506t02.m4001i0()) {
                                                if (c1506t02.m4004j0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1506t02.f7823c);
                                                c1506t02.m3983b(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1506t02.f7823c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1506T0 c1506t03 = this.f7663b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1506t03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1506t03.m4039v0(intValue2);
                        break;
                    case 8:
                        C1506T0 c1506t04 = this.f7663b;
                        c1506t04.m3971R();
                        c1506t04.m3956I();
                        c1506t04.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1506T0 c1506t05 = this.f7663b;
                        c1506t05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1506t05.m3955H0();
                        }
                        c1506t05.m3971R();
                        c1506t05.m3956I();
                        c1506t05.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1506T0 c1506t06 = this.f7663b;
                        c1506t06.m3956I();
                        c1506t06.m4045x0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1506T0 c1506t07 = this.f7663b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1506t07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1506t07.m4036u0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1506T0 c1506t08 = this.f7663b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1506t08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1506t08.f7830e0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1506t08.m4036u0(c1506t08.f7829e.m1745e());
                        break;
                    case 13:
                        C1506T0 c1506t09 = this.f7663b;
                        AbstractC1539g1.m4225k(c1506t09.f7823c);
                        c1506t09.m3971R();
                        c1506t09.m3956I();
                        break;
                    case 14:
                        C1506T0 c1506t010 = this.f7663b;
                        c1506t010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1506t010.f7782I0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1506t010.f7782I0;
                        Context context4 = c1506t010.f7823c;
                        if (!z5) {
                            c1506t010.f7831e1 = -1;
                            cfgData cfgdata5 = c1506t010.f7826d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1506t010.f7825c1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1506t010.f7825c1 = null;
                            }
                            c1506t010.f7816Z0 = c1506t010.m4019o1();
                            c1506t010.f7819a1 = 1.0f;
                            c1506t010.f7822b1 = 0.0f;
                            c1506t010.m3947D();
                        }
                        c1506t010.m3956I();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1506t010.f7782I0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1506T0 c1506t011 = this.f7663b;
                        if (bool == null) {
                            c1506t011.getClass();
                            break;
                        } else {
                            c1506t011.m4008l(false);
                            break;
                        }
                    default:
                        this.f7663b.m4045x0((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: K */
    public final void m3959K() {
        if (this.f7835g == null) {
            return;
        }
        TextView textView = this.f7830e0;
        if (textView != null) {
            textView.bringToFront();
        }
        ImageView imageView = this.f7827d0;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.f7833f0;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        this.f7835g.invalidate();
    }

    /* renamed from: K0 */
    public final float m3960K0() {
        return Math.max(0.0f, this.f7829e.m1779y() / 1000.0f);
    }

    /* renamed from: L */
    public final void m3961L() {
        ValueAnimator valueAnimator = this.f7786K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7786K0 = null;
        }
    }

    /* renamed from: L0 */
    public final float m3962L0() {
        float m1780z = this.f7829e.m1780z();
        if (m1780z < 0.0f) {
            return 0.0f;
        }
        return this.f7826d.f2702u3 * m1780z;
    }

    /* renamed from: M */
    public final void m3963M() {
        ImageView m3968O0 = m3968O0();
        if (m3968O0 == null) {
            this.f7802S0 = false;
            return;
        }
        RunnableC1559n0 runnableC1559n0 = new RunnableC1559n0(this, m3968O0, 16);
        if (m3968O0.getWidth() <= 0 || m3968O0.getHeight() <= 0) {
            m3968O0.post(runnableC1559n0);
        } else {
            runnableC1559n0.run();
        }
    }

    /* renamed from: M0 */
    public final C1574t m3964M0() {
        int i;
        cfgData cfgdata = this.f7826d;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        if (enumC1455a == EnumC1455a.f6949f) {
            return new C1574t(0, null, 6);
        }
        int i2 = cfgdata.f2630g1;
        if (i2 < 31) {
            int i3 = enumC1455a.f7036d;
            return i3 != 0 ? new C1574t(i3, null, 6) : new C1574t(0, null, 6);
        }
        String[] strArr = cfgdata.f2603b;
        if (strArr != null && i2 >= 31 && (i = i2 - 31) >= 0 && i < strArr.length) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata.f2603b[i]);
            if (file.exists()) {
                return new C1574t(0, Uri.fromFile(file), 6);
            }
        }
        return new C1574t(0, null, 6);
    }

    /* renamed from: N */
    public final RectF m3965N() {
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7835g.getHeight() <= 0) {
            return new RectF();
        }
        int width = this.f7835g.getWidth();
        int height = this.f7835g.getHeight();
        float f2 = height - 25.0f;
        if (!m4040v1() && !m3990e1()) {
            RectF m4206a0 = AbstractC1539g1.m4206a0(AbstractC1539g1.m4238t(), width, height);
            if (m4206a0.width() > 0.0f && m4206a0.height() > 0.0f) {
                m4206a0.set(m4206a0.left, (f2 - Math.max(0.0f, m4206a0.height() - 30.0f)) - 90.0f, m4206a0.right, f2);
            }
            return m4206a0;
        }
        Rect m4238t = AbstractC1539g1.m4238t();
        int round = 800 - Math.round(25.0f);
        if (round <= 99) {
            round = 100;
        }
        RectF m4206a02 = AbstractC1539g1.m4206a0(new Rect(m4238t.left + 20, 99, m4238t.right - 20, round), width, height);
        if (m4206a02.width() > 0.0f && m4206a02.height() > 0.0f) {
            m4206a02.set(m4206a02.left, m4206a02.top, m4206a02.right, f2);
        }
        return m4206a02;
    }

    /* renamed from: N0 */
    public final void m3966N0() {
        ViewGroup viewGroup;
        if (!this.f7780H0) {
            m3958J();
            this.f7780H0 = true;
        }
        C1531e c1531e = this.f7768B0;
        if (c1531e != null) {
            c1531e.m4170a();
        }
        boolean z2 = this.f7826d.f2561Q2;
        this.f7782I0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4013m1();
        ValueAnimator valueAnimator = this.f7788L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7788L0 = null;
        }
        this.f7790M0 = false;
        ImageView imageView = this.f7857o;
        if (imageView != null) {
            imageView.setTranslationY(0.0f);
        }
        m3961L();
        this.f7784J0 = true;
        this.f7796P0 = 0.0f;
        this.f7802S0 = false;
        this.f7804T0 = Boolean.valueOf(m4004j0());
        m4027r0();
        m4008l(false);
        if (this.f7837g1 <= 0.0f && (viewGroup = this.f7835g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        m4030s0();
        m4045x0(C0639g.m1872x().m1880u());
        this.f7766A0 = AbstractC1372y1.f6437g;
        m3956I();
        View view = this.f7845j0;
        if (view != null) {
            view.post(new RunnableC1493M0(this, 7));
            return;
        }
        View view2 = this.f7842i0;
        if (view2 != null) {
            view2.post(new RunnableC1493M0(this, 17));
        }
    }

    /* renamed from: O */
    public final void m3967O(ImageView imageView, Theme51GaugeArcView theme51GaugeArcView, Theme51SevenSegView theme51SevenSegView, float f2) {
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        Theme51GaugeArcView theme51GaugeArcView2 = null;
        if (theme51GaugeArcView != null) {
            theme51GaugeArcView.setTranslationX(0.0f);
            theme51GaugeArcView.setTranslationY(0.0f);
            theme51GaugeArcView.setRotation(0.0f);
            C1504S0 c1504s0 = theme51GaugeArcView == this.f7863r ? this.f7770C0 : theme51GaugeArcView == this.f7865s ? this.f7772D0 : null;
            if (c1504s0 != null) {
                c1504s0.m3920a(theme51GaugeArcView);
            }
        }
        if (imageView == this.f7859p) {
            theme51GaugeArcView2 = this.f7867t;
        } else if (imageView == this.f7861q) {
            theme51GaugeArcView2 = this.f7869u;
        }
        if (theme51GaugeArcView2 != null) {
            theme51GaugeArcView2.setTranslationX(0.0f);
            theme51GaugeArcView2.setTranslationY(15.0f);
            theme51GaugeArcView2.setRotation(0.0f);
        }
        if (theme51SevenSegView != null) {
            theme51SevenSegView.setTranslationX(0.0f);
            theme51SevenSegView.setTranslationY(f2);
        }
        View[] m3979Z = m3979Z(imageView);
        int length = m3979Z.length;
        for (int i = 0; i < length; i++) {
            View view = m3979Z[i];
            if (view != null) {
                view.setTranslationX(view == this.f7781I ? m3948D0(this.f7816Z0) : m4018o0(view));
                view.setTranslationY(m4021p0(view));
            }
        }
    }

    /* renamed from: O0 */
    public final ImageView m3968O0() {
        return this.f7826d.f2636h2 ? this.f7859p : this.f7861q;
    }

    /* renamed from: P */
    public final void m3969P() {
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f7835g;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(android.R.color.transparent);
        }
        m3992f0();
        ViewGroup viewGroup3 = this.f7835g;
        if (viewGroup3 != null) {
            viewGroup3.getOverlay().clear();
        }
        C1525c c1525c = this.f7843i1;
        if (c1525c != null) {
            c1525c.m4163e(null);
        }
    }

    /* renamed from: Q */
    public final void m3970Q() {
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup != null) {
            viewGroup.getOverlay().clear();
        }
        ImageView imageView = this.f7857o;
        if (imageView != null && imageView.getBackground() == this.f7843i1) {
            this.f7857o.setBackground(null);
            this.f7857o.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f7835g;
        if (viewGroup2 != null && viewGroup2.getBackground() == this.f7843i1) {
            this.f7835g.setBackgroundResource(android.R.color.transparent);
            this.f7835g.setLayerType(0, null);
        }
        C1525c c1525c = this.f7843i1;
        if (c1525c != null) {
            c1525c.m4160b();
            this.f7843i1.m4163e(null);
        }
    }

    /* renamed from: R */
    public final void m3971R() {
        cfgData cfgdata = this.f7826d;
        if (cfgdata.f2561Q2) {
            boolean m4001i0 = m4001i0();
            Context context = this.f7823c;
            if (m4001i0) {
                if (cfgdata.f2635h1 != 0 || Math.abs(this.f7816Z0 - m4019o1()) >= 0.001f || this.f7822b1 >= 0.001f) {
                    cfgdata.f2635h1 = 0;
                    cfgdata.m1795o(context);
                    m3983b(null);
                    return;
                }
                return;
            }
            if (m4004j0() && cfgdata.f2635h1 == 1) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
                m3983b(null);
            } else {
                if (Math.abs(this.f7819a1 - (m4043w1() ? 1.0f : 0.0f)) < 0.001f) {
                    return;
                }
                m3983b(null);
            }
        }
    }

    /* renamed from: S */
    public final void m3972S() {
        View view = this.f7842i0;
        if (view == null || this.f7835g == null) {
            return;
        }
        if (this.f7845j0 != null && view.getParent() == this.f7845j0) {
            int round = Math.round(this.f7823c.getResources().getDisplayMetrics().density * 96.0f);
            ((ViewGroup) this.f7845j0).removeView(this.f7842i0);
            C1592d c1592d = new C1592d(470, round);
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            this.f7835g.addView(this.f7842i0, c1592d);
            this.f7876x0 = -1.0f;
            this.f7878y0 = -1.0f;
            this.f7842i0.setTranslationX(0.0f);
            this.f7842i0.setTranslationY(0.0f);
        }
        this.f7842i0.getParent();
    }

    /* renamed from: T */
    public final int m3973T() {
        int i = this.f7854m0;
        if (i > 0) {
            return i;
        }
        TextView textView = this.f7783J;
        if (textView == null || this.f7785K == null) {
            return 0;
        }
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        int paddingBottom = this.f7785K.getPaddingBottom() + this.f7785K.getPaddingTop() + Math.round((this.f7783J.getLineSpacingExtra() + (fontMetrics.descent - fontMetrics.ascent)) * 3.0f);
        this.f7854m0 = paddingBottom;
        if (paddingBottom <= 0) {
            float f2 = this.f7823c.getResources().getDisplayMetrics().density;
            this.f7854m0 = AbstractC0062j.m150d(f2, 20.0f, 22.0f * f2 * 3.2f);
        }
        return this.f7854m0;
    }

    /* renamed from: U */
    public final void m3974U() {
        m3936a1(this.f7847k);
        m3936a1(this.f7850l);
        m3936a1(this.f7853m);
        if (this.f7838h == null || m4034t1()) {
            return;
        }
        this.f7838h.setVisibility(8);
    }

    /* renamed from: V */
    public final void m3975V() {
        ImageView imageView = this.f7827d0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.f7830e0;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView2 = this.f7833f0;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        ImageView imageView3 = this.f7836g0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f7839h0;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
    }

    /* renamed from: X */
    public final float m3976X(float f2) {
        float m4019o1 = m4019o1();
        float f3 = f2 - 1.0f;
        if (Math.abs(f3) < 0.001f) {
            return 0.0f;
        }
        float f4 = m4019o1 - 1.0f;
        if (Math.abs(f4) < 0.001f) {
            return 0.0f;
        }
        return f3 / f4;
    }

    /* renamed from: Y */
    public final boolean m3977Y() {
        return this.f7826d.f2561Q2 && this.f7782I0;
    }

    /* renamed from: Y0 */
    public final void m3978Y0(ImageView imageView, boolean z2) {
        for (View view : m3979Z(imageView)) {
            if (view == this.f7781I) {
                m3938b1(view, z2 && !this.f7826d.f2543M0.f7147f);
            } else {
                m3938b1(view, z2);
            }
        }
    }

    /* renamed from: Z */
    public final View[] m3979Z(ImageView imageView) {
        return imageView == this.f7859p ? new View[]{this.f7779H, this.f7781I} : imageView == this.f7861q ? new View[]{this.f7799R, this.f7801S} : new View[0];
    }

    /* renamed from: Z0 */
    public final void m3980Z0(View view, float f2) {
        Context context;
        Drawable m1b;
        if (view == null || (context = this.f7823c) == null || (m1b = AbstractC0000a.m1b(context, f7764o1)) == null) {
            return;
        }
        Drawable mutate = m1b.mutate();
        int round = Math.round((Math.max(0.0f, Math.min(1.0f, f2)) * (Color.alpha(-535685862) - 128)) + 128);
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(Color.argb(round, 18, 21, 26));
        }
        view.setBackground(mutate);
    }

    /* renamed from: a */
    public final void m3981a(boolean z2) {
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup == null) {
            m3956I();
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7835g.getHeight() <= 0) {
            this.f7835g.post(new RunnableC1501Q0(this, z2, 1));
            return;
        }
        ValueAnimator valueAnimator = this.f7788L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7788L0 = null;
        }
        this.f7790M0 = false;
        m3961L();
        m3955H0();
        ImageView m4012m0 = m4012m0();
        ImageView m3968O0 = m3968O0();
        boolean z3 = this.f7826d.f2636h2;
        Theme51GaugeArcView theme51GaugeArcView = z3 ? this.f7865s : this.f7863r;
        Theme51GaugeArcView theme51GaugeArcView2 = z3 ? this.f7863r : this.f7865s;
        Theme51SevenSegView theme51SevenSegView = z3 ? this.f7815Z : this.f7813Y;
        Theme51SevenSegView theme51SevenSegView2 = z3 ? this.f7813Y : this.f7815Z;
        float m3985c0 = m3985c0();
        float m3985c02 = m3985c0();
        float width = this.f7835g.getWidth();
        float height = this.f7835g.getHeight();
        float f2 = this.f7823c.getResources().getDisplayMetrics().density * 80.0f;
        float f3 = m4012m0 != null ? -(m4012m0.getRight() + f2) : -width;
        if (m3968O0 != null) {
            width = (width - m3968O0.getLeft()) + f2;
        }
        float f4 = width;
        if (!z2) {
            m3938b1(m4012m0, true);
            m3938b1(m3968O0, true);
            m3938b1(theme51GaugeArcView, true);
            m3938b1(theme51GaugeArcView2, true);
            m3938b1(theme51SevenSegView, true);
            m3938b1(theme51SevenSegView2, true);
            m3938b1(this.f7867t, true);
            m3938b1(this.f7869u, true);
            m3938b1(this.f7779H, true);
            m3938b1(this.f7799R, true);
            m3938b1(this.f7801S, true);
            m3938b1(this.f7781I, !r3.f2543M0.f7147f);
            m4049z0();
            m4045x0(C0639g.m1872x().m1880u());
        }
        View view = this.f7842i0;
        boolean z4 = view != null && view.getVisibility() == 0;
        float top = this.f7842i0 != null ? (height - r3.getTop()) + f2 : 0.0f;
        if (m3995g0()) {
            m3970Q();
        }
        ViewGroup viewGroup2 = this.f7835g;
        if (viewGroup2 != null) {
            viewGroup2.setLayerType(0, null);
        }
        m4048z();
        float f5 = this.f7857o != null ? -(r1.getHeight() + f2) : -height;
        int[] m3297c = AbstractC1372y1.m3297c();
        this.f7790M0 = true;
        m3984c(z2 ? 0.0f : 1.0f, m4012m0, theme51GaugeArcView, theme51SevenSegView, m3985c0, f3, m3968O0, theme51GaugeArcView2, theme51SevenSegView2, m3985c02, f4, z4, top, f5);
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7788L0 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f7788L0);
        this.f7788L0.addUpdateListener(new C1558n(this, z2, m4012m0, theme51GaugeArcView, theme51SevenSegView, m3985c0, f3, m3968O0, theme51GaugeArcView2, theme51SevenSegView2, m3985c02, f4, z4, top, f5, m3297c));
        this.f7788L0.addListener(new C1564p(this, m3297c, m4012m0, theme51GaugeArcView, theme51SevenSegView, m3985c0, m3968O0, theme51GaugeArcView2, theme51SevenSegView2, m3985c02, z4, z2));
        this.f7788L0.start();
    }

    /* renamed from: a0 */
    public final void m3982a0(float[] fArr) {
        float f2 = (!this.f7784J0 || this.f7796P0 > 0.0f) ? this.f7796P0 : 0.0f;
        if (f2 <= 0.0f || !this.f7802S0) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        RectF m4024q0 = m4024q0();
        if (m4024q0.width() <= 0.0f || m4024q0.height() <= 0.0f) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = (m4024q0.centerX() - this.f7798Q0) * f2;
            fArr[1] = (m4024q0.centerY() - this.f7800R0) * f2;
        }
    }

    /* renamed from: b */
    public final void m3983b(RunnableC1493M0 runnableC1493M0) {
        ImageView m4012m0 = m4012m0();
        if (m4006k0() && (m4012m0 == null || m4012m0.getWidth() <= 0)) {
            if (m4012m0 != null) {
                m4012m0.post(new RunnableC1559n0(this, 15, runnableC1493M0));
                return;
            } else {
                if (runnableC1493M0 != null) {
                    runnableC1493M0.run();
                    return;
                }
                return;
            }
        }
        float m4019o1 = m4006k0() ? m4019o1() : 1.0f;
        float f2 = m4043w1() ? 1.0f : 0.0f;
        float f3 = this.f7826d.f2635h1 != 2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = this.f7825c1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.f7816Z0 - m4019o1) < 0.001f && Math.abs(this.f7819a1 - f2) < 0.001f && Math.abs(this.f7822b1 - f3) < 0.001f) {
            this.f7825c1 = null;
            this.f7816Z0 = m4019o1;
            this.f7819a1 = f2;
            this.f7822b1 = f3;
            m3947D();
            if (runnableC1493M0 != null) {
                runnableC1493M0.run();
                return;
            }
            return;
        }
        float f4 = this.f7816Z0;
        float f5 = this.f7819a1;
        float f6 = this.f7822b1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7825c1 = ofFloat;
        ofFloat.setDuration(260L);
        AbstractC0062j.m166t(this.f7825c1);
        this.f7825c1.addUpdateListener(new C1555m(this, f4, m4019o1, f5, f2, f6, f3, 5));
        this.f7825c1.addListener(new C1567q(this, m4019o1, f2, f3, runnableC1493M0, 5));
        this.f7825c1.start();
    }

    /* renamed from: c */
    public final void m3984c(float f2, ImageView imageView, Theme51GaugeArcView theme51GaugeArcView, Theme51SevenSegView theme51SevenSegView, float f3, float f4, ImageView imageView2, Theme51GaugeArcView theme51GaugeArcView2, Theme51SevenSegView theme51SevenSegView2, float f5, float f6, boolean z2, float f7, float f8) {
        View view;
        m3986d(imageView, theme51GaugeArcView, theme51SevenSegView, f3, f4, -540.0f, f2);
        m3986d(imageView2, theme51GaugeArcView2, theme51SevenSegView2, f5, f6, 540.0f, f2);
        if (z2 && (view = this.f7842i0) != null) {
            view.setTranslationY((f7 * f2) + this.f7880z0);
        }
        ImageView imageView3 = this.f7857o;
        if (imageView3 != null) {
            imageView3.setTranslationY(f8 * f2);
        }
    }

    /* renamed from: c0 */
    public final float m3985c0() {
        return m4006k0() ? 5.0f : 0.0f;
    }

    /* renamed from: d */
    public final void m3986d(ImageView imageView, Theme51GaugeArcView theme51GaugeArcView, Theme51SevenSegView theme51SevenSegView, float f2, float f3, float f4, float f5) {
        if (imageView != null) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
            imageView.setTranslationX(f3 * f5);
            imageView.setRotation(f4 * f5);
        }
        if (theme51GaugeArcView != null) {
            theme51GaugeArcView.setPivotX(theme51GaugeArcView.getWidth() * 0.5f);
            theme51GaugeArcView.setPivotY(theme51GaugeArcView.getHeight() * 0.5f);
            theme51GaugeArcView.setTranslationX(f3 * f5);
            theme51GaugeArcView.setTranslationY(0.0f);
            theme51GaugeArcView.setRotation(f4 * f5);
        }
        Theme51GaugeArcView theme51GaugeArcView2 = imageView == this.f7859p ? this.f7867t : imageView == this.f7861q ? this.f7869u : null;
        if (theme51GaugeArcView2 != null) {
            theme51GaugeArcView2.setPivotX(theme51GaugeArcView2.getWidth() * 0.5f);
            theme51GaugeArcView2.setPivotY(theme51GaugeArcView2.getHeight() * 0.5f);
            theme51GaugeArcView2.setTranslationX(f3 * f5);
            theme51GaugeArcView2.setTranslationY(15.0f);
            theme51GaugeArcView2.setRotation(f4 * f5);
        }
        if (theme51SevenSegView != null) {
            theme51SevenSegView.setTranslationX(f3 * f5);
            theme51SevenSegView.setTranslationY(f2);
        }
        View[] m3979Z = m3979Z(imageView);
        int length = m3979Z.length;
        for (int i = 0; i < length; i++) {
            View view = m3979Z[i];
            if (view != null) {
                view.setTranslationX((f3 * f5) + (view == this.f7781I ? m3948D0(this.f7816Z0) : m4018o0(view)));
                view.setTranslationY(m4021p0(view));
            }
        }
    }

    /* renamed from: d0 */
    public final boolean m3987d0() {
        return this.f7826d.f2561Q2 && !this.f7782I0;
    }

    /* renamed from: d1 */
    public final boolean m3988d1() {
        return m4001i0() && !m3987d0();
    }

    /* renamed from: e0 */
    public final void m3989e0() {
        m3936a1(this.f7844j);
        m3936a1(this.f7787L);
        if (m4001i0() || m3987d0() || !m4040v1()) {
            m3936a1(this.f7847k);
            m3936a1(this.f7850l);
            m3936a1(this.f7853m);
        }
        if (m4001i0() || this.f7826d.f2585W2) {
            m3936a1(this.f7777G);
            m3936a1(this.f7879z);
            m3936a1(this.f7875x);
            m3936a1(this.f7877y);
            m3936a1(this.f7767B);
            m3936a1(this.f7765A);
            m3936a1(this.f7769C);
            m3936a1(this.f7773E);
            m3936a1(this.f7771D);
            m3936a1(this.f7775F);
        }
    }

    /* renamed from: e1 */
    public final boolean m3990e1() {
        return m4004j0() && !m3987d0();
    }

    /* renamed from: f */
    public final void m3991f() {
        ImageView imageView = this.f7827d0;
        if (imageView == null || this.f7833f0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof C1592d) {
            C1592d c1592d = (C1592d) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1592d).width = 90;
            ((ViewGroup.MarginLayoutParams) c1592d).height = 90;
            c1592d.setMarginStart(630);
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = 630;
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = 100;
            imageView.setLayoutParams(c1592d);
        }
        ImageView imageView2 = this.f7833f0;
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        if (layoutParams2 instanceof C1592d) {
            C1592d c1592d2 = (C1592d) layoutParams2;
            ((ViewGroup.MarginLayoutParams) c1592d2).width = 90;
            ((ViewGroup.MarginLayoutParams) c1592d2).height = 90;
            c1592d2.setMarginStart(1197);
            ((ViewGroup.MarginLayoutParams) c1592d2).leftMargin = 1197;
            ((ViewGroup.MarginLayoutParams) c1592d2).topMargin = 100;
            imageView2.setLayoutParams(c1592d2);
        }
        TextView textView = this.f7830e0;
        if (textView != null) {
            textView.setTextSize(2, 32.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f7830e0.getLayoutParams();
            if (layoutParams3 instanceof C1592d) {
                C1592d c1592d3 = (C1592d) layoutParams3;
                ((ViewGroup.MarginLayoutParams) c1592d3).topMargin = -7;
                this.f7830e0.setLayoutParams(c1592d3);
            }
            this.f7830e0.setTranslationX(13.0f);
            this.f7830e0.setTranslationY(12.0f);
        }
        ImageView imageView3 = this.f7827d0;
        if (imageView3 != null) {
            imageView3.setBackgroundResource(R.drawable.ip_theme_51_cruise_icon_bg);
            this.f7827d0.setPadding(6, 6, 6, 6);
        }
        ImageView imageView4 = this.f7833f0;
        if (imageView4 != null) {
            imageView4.setBackgroundResource(R.drawable.ip_theme_51_cruise_icon_bg);
            this.f7833f0.setPadding(6, 6, 6, 6);
        }
        TextView textView2 = this.f7830e0;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.ip_theme_51_cruise_icon_bg);
        }
        m4028r1();
        m3959K();
    }

    /* renamed from: f0 */
    public final void m3992f0() {
        ImageView imageView = this.f7857o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        this.f7857o.setLayerType(0, null);
        this.f7857o.setBackground(null);
        this.f7857o.setImageDrawable(null);
    }

    /* renamed from: f1 */
    public final boolean m3993f1() {
        if (m3998h0()) {
            return !this.f7784J0 || this.f7796P0 > 0.0f;
        }
        return false;
    }

    /* renamed from: g */
    public final void m3994g() {
        cfgData cfgdata = this.f7826d;
        if (!cfgdata.f2537K2) {
            ViewGroup viewGroup = this.f7787L;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            m3938b1(this.f7783J, false);
            m3938b1(this.f7795P, false);
            View view = this.f7777G;
            if (view != null) {
                view.setVisibility(8);
            }
            m3936a1(this.f7801S);
            m4007k1();
            return;
        }
        m3938b1(this.f7795P, cfgdata.f2581V2 && (!m3987d0() && (m3977Y() || m4001i0())));
        m4049z0();
        if (m4001i0()) {
            m3997h(false);
        } else if (cfgdata.f2585W2 || m4001i0() || m3987d0() || !m3977Y() || this.f7822b1 >= 0.999f) {
            m3997h(false);
        } else {
            m3997h(true);
        }
        TextView textView = this.f7801S;
        if (textView != null) {
            m3929S0(textView, this.f7829e.m1741c(), "V", -10556716, "%.1f");
            m4009l0();
        }
        m4007k1();
        if (!m4040v1() && !m4004j0() && !m4001i0() && !m3993f1()) {
            m3974U();
            if (m3995g0()) {
                m4033t0();
            }
        }
        m3946C0();
    }

    /* renamed from: g0 */
    public final boolean m3995g0() {
        if (this.f7843i1 == null) {
            return false;
        }
        ImageView imageView = this.f7857o;
        if (imageView != null && imageView.getVisibility() == 0 && this.f7857o.getBackground() == this.f7843i1) {
            return true;
        }
        ViewGroup viewGroup = this.f7835g;
        return viewGroup != null && viewGroup.getBackground() == this.f7843i1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v229, types: [android.view.View] */
    /* renamed from: g1 */
    public final void m3996g1() {
        int i;
        View view = this.f7820b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_51_root);
        this.f7835g = viewGroup;
        for (ViewGroup viewGroup2 = viewGroup; viewGroup2 instanceof ViewGroup; viewGroup2 = (View) viewGroup2.getParent()) {
            ViewGroup viewGroup3 = viewGroup2;
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
            if (!(viewGroup2.getParent() instanceof View)) {
                break;
            }
        }
        this.f7857o = (ImageView) view.findViewById(R.id.theme_51_style_bg);
        this.f7838h = view.findViewById(R.id.theme_51_navi_hole);
        this.f7841i = view.findViewById(R.id.theme_51_top_panel);
        this.f7844j = view.findViewById(R.id.theme_51_bottom_panel);
        this.f7847k = view.findViewById(R.id.theme_51_bottom_panel_left);
        this.f7850l = view.findViewById(R.id.theme_51_bottom_panel_center);
        this.f7853m = view.findViewById(R.id.theme_51_bottom_panel_right);
        if (this.f7850l != null) {
            C1528d c1528d = new C1528d(-15592166);
            this.f7855n = c1528d;
            this.f7850l.setBackground(c1528d);
        }
        this.f7859p = (ImageView) view.findViewById(R.id.theme_51_spd_face);
        this.f7861q = (ImageView) view.findViewById(R.id.theme_51_rpm_face);
        this.f7863r = (Theme51GaugeArcView) view.findViewById(R.id.theme_51_spd_arc);
        this.f7865s = (Theme51GaugeArcView) view.findViewById(R.id.theme_51_rpm_arc);
        this.f7867t = (Theme51GaugeArcView) view.findViewById(R.id.theme_51_fuel_arc);
        this.f7869u = (Theme51GaugeArcView) view.findViewById(R.id.theme_51_temp_arc);
        this.f7875x = (TextView) view.findViewById(R.id.theme_51_inst_fuel);
        this.f7877y = (TextView) view.findViewById(R.id.theme_51_inst_fuel_sub);
        this.f7879z = (TextView) view.findViewById(R.id.theme_51_lbl_inst);
        this.f7765A = (TextView) view.findViewById(R.id.theme_51_avg_jour);
        this.f7767B = (TextView) view.findViewById(R.id.theme_51_lbl_avg_jour);
        this.f7769C = (TextView) view.findViewById(R.id.theme_51_avg_jour_sub);
        this.f7771D = (TextView) view.findViewById(R.id.theme_51_avg_total);
        this.f7773E = (TextView) view.findViewById(R.id.theme_51_lbl_avg_total);
        this.f7775F = (TextView) view.findViewById(R.id.theme_51_avg_total_sub);
        this.f7777G = view.findViewById(R.id.theme_51_fuel_cons_wrap);
        this.f7787L = (ViewGroup) view.findViewById(R.id.theme_51_odo_wrap);
        this.f7789M = (TextView) view.findViewById(R.id.theme_51_odo_total);
        this.f7791N = (TextView) view.findViewById(R.id.theme_51_odo_day);
        this.f7793O = (TextView) view.findViewById(R.id.theme_51_odo_trip);
        this.f7795P = (ViewGroup) view.findViewById(R.id.theme_51_tires_wrap);
        this.f7797Q = (TextView) view.findViewById(R.id.theme_51_tires_up);
        ImageView imageView = (ImageView) view.findViewById(R.id.theme_51_tires_car);
        if (imageView != null) {
            imageView.clearColorFilter();
        }
        TextView[] textViewArr = {this.f7771D, this.f7765A, this.f7875x};
        for (int i2 = 0; i2 < 3; i2++) {
            TextView textView = textViewArr[i2];
            if (textView != null) {
                textView.setTextColor(-10556716);
            }
        }
        TextView[] textViewArr2 = {this.f7773E, this.f7775F, this.f7767B, this.f7769C, this.f7879z, this.f7877y};
        for (int i3 = 0; i3 < 6; i3++) {
            TextView textView2 = textViewArr2[i3];
            if (textView2 != null) {
                textView2.setTextColor(-10839404);
            }
        }
        this.f7801S = (TextView) view.findViewById(R.id.theme_51_battery);
        this.f7803T = (TextView) view.findViewById(R.id.theme_51_gear);
        this.f7805U = (TextView) view.findViewById(R.id.theme_51_clock);
        this.f7807V = (TextView) view.findViewById(R.id.theme_51_out_temp);
        this.f7809W = (ImageView) view.findViewById(R.id.theme_51_wifi);
        this.f7811X = (ImageView) view.findViewById(R.id.theme_51_inet);
        this.f7813Y = (Theme51SevenSegView) view.findViewById(R.id.theme_51_spd_value);
        this.f7815Z = (Theme51SevenSegView) view.findViewById(R.id.theme_51_rpm_value);
        Theme51SevenSegView theme51SevenSegView = this.f7813Y;
        if (theme51SevenSegView != null) {
            theme51SevenSegView.f2966j = Math.max(1, Math.min(4, 3));
            theme51SevenSegView.f2967k = Math.max(0, Math.min(1, 0));
            theme51SevenSegView.f2968l = true;
            theme51SevenSegView.invalidate();
            this.f7813Y.setOnColor(-10556716);
        }
        Theme51SevenSegView theme51SevenSegView2 = this.f7815Z;
        if (theme51SevenSegView2 != null) {
            theme51SevenSegView2.f2966j = Math.max(1, Math.min(4, 1));
            theme51SevenSegView2.f2967k = Math.max(0, Math.min(1, 1));
            theme51SevenSegView2.f2968l = true;
            theme51SevenSegView2.invalidate();
            this.f7815Z.setOnColor(-10556716);
        }
        this.f7779H = (TextView) view.findViewById(R.id.theme_51_fuel_up);
        this.f7799R = (TextView) view.findViewById(R.id.theme_51_temp_up);
        TextView textView3 = (TextView) view.findViewById(R.id.theme_51_remain);
        this.f7781I = textView3;
        if (textView3 != null) {
            this.f7810W0 = textView3.getTranslationX();
        }
        this.f7783J = (TextView) view.findViewById(R.id.theme_51_odo_up);
        View findViewById = view.findViewById(R.id.theme_51_odo_frame);
        this.f7785K = findViewById;
        AbstractC1539g1.m4223j(this.f7783J, findViewById);
        AbstractC1539g1.m4204Z(this.f7789M, this.f7791N, this.f7793O);
        AbstractC1539g1.m4202X(this.f7771D, this.f7765A, this.f7875x);
        this.f7818a0 = (TextView) view.findViewById(R.id.theme_51_txt_speed);
        this.f7824c0 = view.findViewById(R.id.theme_51_txt_speed_scrim);
        this.f7821b0 = (TextView) view.findViewById(R.id.theme_51_txt_rpm);
        float m3985c0 = m3985c0();
        Theme51SevenSegView theme51SevenSegView3 = this.f7813Y;
        Theme51SevenSegView theme51SevenSegView4 = this.f7815Z;
        if (theme51SevenSegView3 != null) {
            theme51SevenSegView3.setTranslationY(m3985c0);
        }
        if (theme51SevenSegView4 != null) {
            theme51SevenSegView4.setTranslationY(m3985c0);
        }
        this.f7827d0 = (ImageView) view.findViewById(R.id.theme_51_cruise);
        this.f7830e0 = (TextView) view.findViewById(R.id.theme_51_cruise_speed);
        this.f7833f0 = (ImageView) view.findViewById(R.id.theme_51_lane);
        this.f7836g0 = (ImageView) view.findViewById(R.id.theme_51_hide_cruise);
        this.f7839h0 = (ImageView) view.findViewById(R.id.theme_51_hide_la);
        this.f7851l0 = view.findViewById(R.id.theme_51_ext_spacer);
        View findViewById2 = view.findViewById(R.id.theme_51_media_wrap);
        this.f7842i0 = findViewById2;
        AbstractC0641i.m1886c(findViewById2);
        this.f7845j0 = view.findViewById(R.id.theme_51_center_float);
        this.f7848k0 = view.findViewById(R.id.theme_51_ext_row);
        View view2 = this.f7845j0;
        if (view2 instanceof ViewGroup) {
            ((ViewGroup) view2).setClipChildren(false);
            ((ViewGroup) this.f7845j0).setClipToPadding(false);
        }
        ViewGroup viewGroup4 = this.f7835g;
        if (viewGroup4 != null) {
            viewGroup4.setClipChildren(false);
            this.f7835g.setClipToPadding(false);
        }
        View view3 = this.f7848k0;
        if (view3 != null) {
            if (view3 instanceof ViewGroup) {
                ((ViewGroup) view3).setClipChildren(false);
                ((ViewGroup) this.f7848k0).setClipToPadding(false);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7848k0.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin += 15;
                this.f7848k0.setLayoutParams(marginLayoutParams);
            }
        }
        m3972S();
        this.f7856n0 = (ImageView) view.findViewById(R.id.theme_51_media_art);
        this.f7858o0 = (TextView) view.findViewById(R.id.theme_51_media_title);
        this.f7860p0 = (TextView) view.findViewById(R.id.theme_51_media_artist);
        this.f7862q0 = (TextView) view.findViewById(R.id.theme_51_media_elapsed);
        this.f7864r0 = (TextView) view.findViewById(R.id.theme_51_media_total);
        this.f7866s0 = (ProgressBar) view.findViewById(R.id.theme_51_media_bar);
        TextView textView4 = (TextView) view.findViewById(R.id.theme_51_free_mem);
        Handler handler = this.f7832f;
        this.f7768B0 = new C1531e(handler, textView4);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f7817a);
        }
        m3989e0();
        m4008l(true);
        m3991f();
        carData cardata = this.f7829e;
        m4036u0(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView5 = this.f7830e0;
        if (textView5 != null) {
            textView5.setText(String.valueOf(m1747f));
        }
        m4036u0(cardata.m1745e());
        float m3962L0 = m3962L0();
        float m3960K0 = m3960K0();
        this.f7770C0 = new C1504S0(0.0f, 220.0f, -135.0f, 135.0f, m3962L0);
        this.f7772D0 = new C1504S0(0.0f, 8.0f, -135.0f, 135.0f, m3960K0);
        float max = Math.max(0.0f, cardata.m1774t());
        float m1743d = cardata.m1743d();
        float f2 = m1743d < 40.0f ? 40.0f : m1743d;
        this.f7774E0 = new C1504S0(0.0f, 100.0f, 35.0f, -35.0f, max);
        this.f7776F0 = new C1504S0(40.0f, 130.0f, 35.0f, -35.0f, f2);
        Theme51GaugeArcView theme51GaugeArcView = this.f7863r;
        if (theme51GaugeArcView != null) {
            theme51GaugeArcView.m1832b(0.0f, 220.0f, -135.0f, 135.0f, 0.6f, 75.0f, -5.0f);
            Theme51GaugeArcView theme51GaugeArcView2 = this.f7863r;
            theme51GaugeArcView2.f2960z = -15592166;
            theme51GaugeArcView2.f2919A = -11905952;
            theme51GaugeArcView2.invalidate();
            this.f7863r.m1836g(0.0f, 220.0f, 20.0f);
            this.f7863r.setScaleInflate(0.648f);
            this.f7863r.setScaleDigitInset(3.0f);
            Theme51GaugeArcView theme51GaugeArcView3 = this.f7863r;
            theme51GaugeArcView3.f2929K = 140.0f;
            theme51GaugeArcView3.f2930L = Theme51GaugeArcView.m1830a(0.55f, 0.05f, 1.0f);
            theme51GaugeArcView3.invalidate();
            this.f7863r.setTickStep(10.0f);
            this.f7863r.setTickMajorStep(20.0f);
            this.f7863r.setTipStripeEnabled(true);
        }
        Theme51GaugeArcView theme51GaugeArcView4 = this.f7865s;
        if (theme51GaugeArcView4 != null) {
            theme51GaugeArcView4.m1832b(0.0f, 8.0f, -135.0f, 135.0f, 0.6f, 75.0f, -5.0f);
            Theme51GaugeArcView theme51GaugeArcView5 = this.f7865s;
            theme51GaugeArcView5.f2960z = -15592166;
            theme51GaugeArcView5.f2919A = -11905952;
            theme51GaugeArcView5.invalidate();
            this.f7865s.m1836g(0, 8, 1.0f);
            this.f7865s.setScaleInflate(0.72f);
            this.f7865s.setScaleDigitInset(4.0f);
            this.f7865s.setTickStep(0.5f);
            this.f7865s.setTickMajorStep(1.0f);
            this.f7865s.setTipStripeEnabled(true);
        }
        Theme51GaugeArcView theme51GaugeArcView6 = this.f7867t;
        if (theme51GaugeArcView6 != null) {
            i = -14790068;
            theme51GaugeArcView6.m1832b(0.0f, 100.0f, 215.0f, 145.0f, 0.58f, 21.0f, 79.0f);
            Theme51GaugeArcView theme51GaugeArcView7 = this.f7867t;
            theme51GaugeArcView7.f2960z = -14790068;
            theme51GaugeArcView7.f2919A = -10556716;
            theme51GaugeArcView7.invalidate();
            this.f7867t.setTickSegments(16);
            this.f7867t.setTranslationY(15.0f);
        } else {
            i = -14790068;
        }
        Theme51GaugeArcView theme51GaugeArcView8 = this.f7869u;
        if (theme51GaugeArcView8 != null) {
            theme51GaugeArcView8.m1832b(40.0f, 130.0f, 215.0f, 145.0f, 0.58f, 21.0f, 79.0f);
            Theme51GaugeArcView theme51GaugeArcView9 = this.f7869u;
            theme51GaugeArcView9.f2960z = i;
            theme51GaugeArcView9.f2919A = -10556716;
            theme51GaugeArcView9.invalidate();
            this.f7869u.setTickSegments(16);
            this.f7869u.setTranslationY(15.0f);
        }
        m3939c1(this.f7863r, this.f7770C0);
        m3939c1(this.f7865s, this.f7772D0);
        m3939c1(this.f7867t, this.f7774E0);
        m3939c1(this.f7869u, this.f7776F0);
        ImageView imageView2 = this.f7859p;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        ImageView imageView3 = this.f7861q;
        if (imageView3 != null) {
            imageView3.setImageDrawable(null);
        }
        m4027r0();
        final int i4 = 0;
        C1562o0 c1562o0 = new C1562o0(new Consumer(this) { // from class: u0.P0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7746b;

            {
                this.f7746b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i4) {
                    case 0:
                        C1506T0 c1506t0 = this.f7746b;
                        c1506t0.f7871v = bitmap;
                        c1506t0.f7806U0 = -1;
                        c1506t0.m4039v0(c1506t0.f7829e.m1753i());
                        break;
                    default:
                        C1506T0 c1506t02 = this.f7746b;
                        c1506t02.f7873w = bitmap;
                        c1506t02.f7806U0 = -1;
                        c1506t02.m4039v0(c1506t02.f7829e.m1753i());
                        break;
                }
            }
        }, 4);
        Context context = this.f7823c;
        AbstractC1354s1.m3252a(context, "themes/51/theme_51_spd.bin", c1562o0, handler, 0);
        final int i5 = 1;
        AbstractC1354s1.m3252a(context, "themes/51/theme_51_rpm.bin", new C1562o0(new Consumer(this) { // from class: u0.P0

            /* renamed from: b */
            public final /* synthetic */ C1506T0 f7746b;

            {
                this.f7746b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i5) {
                    case 0:
                        C1506T0 c1506t0 = this.f7746b;
                        c1506t0.f7871v = bitmap;
                        c1506t0.f7806U0 = -1;
                        c1506t0.m4039v0(c1506t0.f7829e.m1753i());
                        break;
                    default:
                        C1506T0 c1506t02 = this.f7746b;
                        c1506t02.f7873w = bitmap;
                        c1506t02.f7806U0 = -1;
                        c1506t02.m4039v0(c1506t02.f7829e.m1753i());
                        break;
                }
            }
        }, 4), handler, 0);
        ImageView imageView4 = this.f7859p;
        if (imageView4 != null) {
            imageView4.post(new RunnableC1493M0(this, 0));
        }
        if (!this.f7780H0) {
            m3958J();
            this.f7780H0 = true;
        }
        ViewGroup viewGroup5 = this.f7835g;
        if (viewGroup5 != null) {
            viewGroup5.setAlpha(1.0f);
        }
        this.f7837g1 = 0.0f;
        this.f7784J0 = true;
        this.f7796P0 = 0.0f;
        boolean z2 = this.f7826d.f2561Q2;
        this.f7782I0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4013m1();
        this.f7804T0 = Boolean.valueOf(m4004j0());
        m3956I();
        this.f7778G0 = true;
        handler.post(this.f7846j1);
        handler.post(this.f7852l1);
        this.f7766A0 = AbstractC1372y1.f6437g;
        handler.post(this.f7849k1);
        this.f7768B0.m4171b();
        View view4 = this.f7845j0;
        if (view4 != null) {
            view4.post(new RunnableC1493M0(this, 1));
            return;
        }
        View view5 = this.f7842i0;
        if (view5 != null) {
            view5.post(new RunnableC1493M0(this, 2));
        }
    }

    /* renamed from: h */
    public final void m3997h(boolean z2) {
        if (!z2) {
            View view = this.f7777G;
            if (view != null) {
                view.setVisibility(8);
            }
            m3936a1(this.f7767B);
            m3936a1(this.f7765A);
            m3936a1(this.f7769C);
            m3936a1(this.f7879z);
            m3936a1(this.f7875x);
            m3936a1(this.f7877y);
            m3936a1(this.f7773E);
            m3936a1(this.f7771D);
            m3936a1(this.f7775F);
            return;
        }
        View view2 = this.f7777G;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        boolean z3 = this.f7826d.useJourneyFuel;
        m3938b1(this.f7767B, z3);
        m3938b1(this.f7765A, z3);
        m3938b1(this.f7769C, z3);
        m3938b1(this.f7879z, true);
        m3938b1(this.f7875x, true);
        m3938b1(this.f7877y, true);
        m3938b1(this.f7773E, true);
        m3938b1(this.f7771D, true);
        m3938b1(this.f7775F, true);
    }

    /* renamed from: h0 */
    public final boolean m3998h0() {
        return this.f7826d.f2537K2 && m3977Y();
    }

    /* renamed from: h1 */
    public final void m3999h1(float f2, float f3, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f7786K0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f7786K0);
        this.f7786K0.addUpdateListener(new C0174W(15, this));
        this.f7786K0.addListener(new C0181b0(this, 13, runnable));
        this.f7786K0.start();
    }

    /* renamed from: i */
    public final void m4000i(int i, int i2, int i3, float f2) {
        ImageView m4012m0;
        if (this.f7777G == null || m4001i0()) {
            return;
        }
        boolean z2 = (this.f7826d.f2585W2 || m3987d0() || !m3977Y()) ? false : true;
        float max = Math.max(0.0f, Math.min(1.0f, this.f7822b1));
        if (!z2) {
            this.f7777G.setAlpha(1.0f);
            this.f7777G.setTranslationY(0.0f);
            return;
        }
        if (max >= 0.999f) {
            this.f7777G.setAlpha(0.0f);
            this.f7777G.setVisibility(4);
            return;
        }
        if (this.f7777G.getVisibility() != 0) {
            m3997h(true);
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float f3 = ((-0.19999999f) * max2) + 1.0f;
        if (this.f7777G != null) {
            Context context = this.f7823c;
            float f4 = context.getResources().getDisplayMetrics().density;
            float f5 = context.getResources().getDisplayMetrics().scaledDensity;
            float max3 = Math.max(0.5f, Math.min(1.2f, f3));
            float f6 = 10.0f * f4 * max3;
            this.f7777G.setPadding(AbstractC0062j.m168v(f4, 14.0f, max3), Math.round(f6), AbstractC0062j.m168v(f4, 16.0f, max3), Math.round(f6));
            View view = this.f7777G;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(true);
                ((ViewGroup) this.f7777G).setClipChildren(true);
            }
            float f7 = 15.0f * max3;
            m3935X0(this.f7773E, f7, f5);
            float f8 = 30.0f * max3;
            m3935X0(this.f7771D, f8, f5);
            float f9 = 16.0f * max3;
            m3935X0(this.f7775F, f9, f5);
            m3935X0(this.f7767B, f7, f5);
            m3935X0(this.f7765A, f8, f5);
            m3935X0(this.f7769C, f9, f5);
            m3935X0(this.f7879z, f7, f5);
            m3935X0(this.f7875x, f8, f5);
            m3935X0(this.f7877y, f9, f5);
            AbstractC1539g1.m4202X(this.f7771D, this.f7765A, this.f7875x);
            TextView textView = this.f7767B;
            View view2 = textView != null ? (View) textView.getParent() : null;
            float f10 = 22.0f * f4 * max3;
            if (view2 != null && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMarginStart(Math.round(f10));
                view2.setLayoutParams(marginLayoutParams);
            }
            TextView textView2 = this.f7879z;
            View view3 = textView2 != null ? (View) textView2.getParent() : null;
            float f11 = f4 * 18.0f * max3;
            if (view3 != null && (view3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                marginLayoutParams2.setMarginStart(Math.round(f11));
                view3.setLayoutParams(marginLayoutParams2);
            }
        }
        int m152f = AbstractC0062j.m152f(i3, f3, 1);
        int i4 = i - 470;
        int max4 = Math.max(0, i4 / 2);
        int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
        if (max2 > 0.001f && (m4012m0 = m4012m0()) != null && m4012m0.getWidth() > 0 && m4012m0.getHeight() > 0) {
            float f12 = this.f7816Z0;
            float left = m4012m0.getLeft();
            float width = m4012m0.getWidth() * f12;
            float height = (m4012m0.getHeight() * f12) + m4012m0.getTop();
            float m149c = AbstractC0062j.m149c(width, 470, 0.5f, left);
            float f13 = height + 23.0f;
            float max5 = Math.max(0.0f, (i2 - m152f) - 8.0f);
            if (f13 > max5) {
                f13 = max5;
            }
            float f14 = max4;
            max4 = AbstractC0062j.m151e(m149c, f14, max2, f14);
            float f15 = m4298b;
            m4298b = AbstractC0062j.m151e(f13, f15, max2, f15);
        }
        int max6 = Math.max(0, Math.min(max4, Math.max(0, i4)));
        int max7 = Math.max(0, m4298b);
        View view4 = this.f7777G;
        if (view4 != null && this.f7835g != null && (view4.getLayoutParams() instanceof C1592d)) {
            C1592d c1592d = (C1592d) this.f7777G.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = 470;
            ((ViewGroup.MarginLayoutParams) c1592d).height = m152f;
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(max6);
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max7;
            this.f7777G.setLayoutParams(c1592d);
            this.f7777G.setTranslationX(0.0f);
            this.f7777G.setTranslationY(0.0f);
        }
        this.f7777G.setAlpha(1.0f - max);
        this.f7777G.setTranslationY(max * 40.0f);
        this.f7777G.bringToFront();
        View view5 = this.f7845j0;
        if (view5 != null) {
            view5.bringToFront();
        }
    }

    /* renamed from: i0 */
    public final boolean m4001i0() {
        cfgData cfgdata = this.f7826d;
        return AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
    }

    /* renamed from: i1 */
    public final void m4002i1(String str) {
        Context context = this.f7823c;
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

    /* renamed from: j */
    public final void m4003j(ImageView imageView, Theme51GaugeArcView theme51GaugeArcView, Theme51SevenSegView theme51SevenSegView, float f2, boolean z2, float f3, float f4, float f5) {
        if (imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1493M0(this, 16));
            return;
        }
        float f6 = f3 - 1.0f;
        if (Math.abs(f6) < 0.001f) {
            m3925J0(imageView, f4, f5);
            m3954G0(theme51GaugeArcView);
            m3925J0(theme51SevenSegView, f4, f2 + f5);
            m4016n1(imageView, 1.0f, 0.0f, 0.0f, f4, f5, 0.0f, 0.0f);
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m3937b0(imageView, f3, z2, fArr, fArr2);
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = 0.0f;
        if (f3 > 1.001f && Math.abs(f6) >= 0.001f && f3 >= 1.0f) {
            float m3976X = m3976X(f3);
            f11 = (((-imageView.getHeight()) * 0.16f) * m3976X) - (m3976X * 120.0f);
        }
        m3924H(imageView, f3, f7, f8, f4, f5, f9, f10);
        m4032t(theme51GaugeArcView, imageView, f3, f7, f8, f9 + f4, f10 + f5);
        m3924H(theme51SevenSegView, f3, f7, f8, f4, f5, f9, f2 + f10 + f11 + f5);
        m4016n1(imageView, f3, f7, f8, f4, f5, f9, f10);
    }

    /* renamed from: j0 */
    public final boolean m4004j0() {
        return AbstractC1539g1.m4195Q(this.f7826d, this.f7829e);
    }

    /* renamed from: j1 */
    public final boolean m4005j1() {
        return m3988d1() && m3964M0().m4472a();
    }

    /* renamed from: k0 */
    public final boolean m4006k0() {
        return this.f7826d.f2635h1 == 0 && !this.f7828d1;
    }

    /* renamed from: k1 */
    public final void m4007k1() {
        View view;
        ViewGroup viewGroup;
        View view2;
        TextView textView = this.f7783J;
        boolean z2 = textView != null && textView.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f7795P;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = z2 || z3;
        View view3 = this.f7785K;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        int m3973T = m3973T();
        View view4 = this.f7785K;
        if (view4 != null) {
            if (!z2 || m3973T <= 0) {
                view4.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    view4.setLayoutParams(layoutParams);
                }
            } else {
                m3931U0(view4, m3973T);
                View view5 = this.f7785K;
                if (view5 instanceof LinearLayout) {
                    ((LinearLayout) view5).setGravity(17);
                }
                TextView textView2 = this.f7783J;
                if (textView2 != null) {
                    AbstractC1539g1.m4223j(textView2, this.f7785K);
                }
            }
        }
        ViewGroup viewGroup3 = this.f7795P;
        if (viewGroup3 != null) {
            if (z3 && m3973T > 0) {
                TextView textView3 = this.f7797Q;
                if (textView3 != null) {
                    int round = Math.round(textView3.getPaint().measureText("000       000")) + this.f7795P.getPaddingEnd() + this.f7795P.getPaddingStart();
                    if (round > 0) {
                        this.f7795P.setMinimumWidth(round);
                    }
                }
                m3931U0(this.f7795P, m3973T);
            } else if (z3 && z2 && (view2 = this.f7785K) != null) {
                view2.post(new RunnableC1493M0(this, 11));
            } else {
                viewGroup3.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    viewGroup3.setLayoutParams(layoutParams2);
                }
            }
        }
        boolean z5 = (z2 && z3) || m4037u1() || m4022p1() > 0.001f;
        View view6 = this.f7851l0;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams3 = view6.getLayoutParams() instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) this.f7851l0.getLayoutParams() : null;
            if (z5) {
                this.f7851l0.setVisibility(0);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 1.0f;
                    this.f7851l0.setLayoutParams(layoutParams3);
                }
            } else {
                this.f7851l0.setVisibility(8);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 0.0f;
                    this.f7851l0.setLayoutParams(layoutParams3);
                }
            }
        }
        View view7 = this.f7848k0;
        if (view7 instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view7;
            ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = z5 ? -1 : -2;
                linearLayout.setLayoutParams(layoutParams4);
            }
            linearLayout.setGravity(z5 ? 8388659 : 49);
            linearLayout.setPadding(z5 ? 30 : 0, linearLayout.getPaddingTop(), z5 ? 30 : 0, linearLayout.getPaddingBottom());
        }
        boolean m4037u1 = m4037u1();
        View view8 = this.f7848k0;
        if ((view8 instanceof ViewGroup) && (view = this.f7785K) != null && (viewGroup = this.f7795P) != null && this.f7851l0 != null) {
            ViewGroup viewGroup4 = (ViewGroup) view8;
            if (m4037u1) {
                view = viewGroup;
            }
            if (viewGroup4.getChildCount() < 1 || viewGroup4.getChildAt(0) != view) {
                viewGroup4.removeView(this.f7785K);
                viewGroup4.removeView(this.f7851l0);
                viewGroup4.removeView(this.f7795P);
                if (m4037u1) {
                    viewGroup4.addView(this.f7795P);
                    viewGroup4.addView(this.f7851l0);
                    viewGroup4.addView(this.f7785K);
                } else {
                    viewGroup4.addView(this.f7785K);
                    viewGroup4.addView(this.f7851l0);
                    viewGroup4.addView(this.f7795P);
                }
            }
        }
        if (m4037u1) {
            m3928R0(this.f7795P, 48);
            m3928R0(this.f7785K, 8388661);
        } else {
            m3928R0(this.f7785K, 48);
            m3928R0(this.f7795P, 8388661);
        }
        View view9 = this.f7848k0;
        if (view9 != null) {
            view9.setVisibility(z4 ? 0 : 8);
        }
        View view10 = this.f7845j0;
        if (view10 != null) {
            view10.setVisibility(z4 ? 0 : 8);
        }
    }

    /* renamed from: l */
    public final void m4008l(boolean z2) {
        boolean z3 = this.f7826d.f2636h2;
        if (z2 || !Boolean.valueOf(z3).equals(this.f7808V0)) {
            this.f7808V0 = Boolean.valueOf(z3);
            this.f7802S0 = false;
            ImageView imageView = this.f7859p;
            if (imageView != null) {
                imageView.setLayoutDirection(z3 ? 1 : 0);
            }
            ImageView imageView2 = this.f7861q;
            if (imageView2 != null) {
                imageView2.setLayoutDirection(z3 ? 1 : 0);
            }
            Theme51GaugeArcView theme51GaugeArcView = this.f7863r;
            if (theme51GaugeArcView != null) {
                theme51GaugeArcView.setLayoutDirection(z3 ? 1 : 0);
            }
            Theme51GaugeArcView theme51GaugeArcView2 = this.f7865s;
            if (theme51GaugeArcView2 != null) {
                theme51GaugeArcView2.setLayoutDirection(z3 ? 1 : 0);
            }
            Theme51SevenSegView theme51SevenSegView = this.f7813Y;
            if (theme51SevenSegView != null) {
                theme51SevenSegView.setLayoutDirection(z3 ? 1 : 0);
            }
            Theme51SevenSegView theme51SevenSegView2 = this.f7815Z;
            if (theme51SevenSegView2 != null) {
                theme51SevenSegView2.setLayoutDirection(z3 ? 1 : 0);
            }
            m3941k(this.f7859p, z3);
            m3941k(this.f7861q, !z3);
            Theme51GaugeArcView theme51GaugeArcView3 = this.f7863r;
            if (theme51GaugeArcView3 != null && this.f7770C0 != null) {
                theme51GaugeArcView3.post(new RunnableC1493M0(this, 12));
            }
            Theme51GaugeArcView theme51GaugeArcView4 = this.f7865s;
            if (theme51GaugeArcView4 != null && this.f7772D0 != null) {
                theme51GaugeArcView4.post(new RunnableC1493M0(this, 13));
            }
            Theme51GaugeArcView theme51GaugeArcView5 = this.f7867t;
            if (theme51GaugeArcView5 != null && this.f7774E0 != null) {
                theme51GaugeArcView5.post(new RunnableC1493M0(this, 14));
            }
            Theme51GaugeArcView theme51GaugeArcView6 = this.f7869u;
            if (theme51GaugeArcView6 != null && this.f7776F0 != null) {
                theme51GaugeArcView6.post(new RunnableC1493M0(this, 15));
            }
            m4038v();
            carData cardata = this.f7829e;
            m4039v0(cardata.m1753i());
            m4036u0(cardata.m1745e());
        }
    }

    /* renamed from: l0 */
    public final void m4009l0() {
        TextView textView;
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f7801S == null || (textView = this.f7799R) == null || this.f7861q == null) {
            return;
        }
        if (textView.getVisibility() != 0) {
            this.f7801S.setVisibility(8);
            return;
        }
        if (this.f7861q.getWidth() <= 0 || this.f7799R.getWidth() <= 0 || this.f7801S.getWidth() <= 0) {
            this.f7801S.setVisibility(0);
            this.f7861q.post(new RunnableC1493M0(this, 10));
            return;
        }
        this.f7801S.setVisibility(0);
        float width = (this.f7799R.getWidth() * 0.5f) + this.f7799R.getLeft();
        this.f7812X0 = ((((((this.f7861q.getWidth() * 0.5f) + this.f7861q.getLeft()) * 2.0f) - width) - 5.0f) + 10.0f) - ((this.f7801S.getWidth() * 0.5f) + this.f7801S.getLeft());
        this.f7814Y0 = ((this.f7799R.getHeight() * 0.5f) + this.f7799R.getTop()) - ((this.f7801S.getHeight() * 0.5f) + this.f7801S.getTop());
        if (this.f7801S == null || (imageView = this.f7861q) == null || imageView.getWidth() <= 0) {
            return;
        }
        ImageView imageView2 = this.f7861q;
        boolean z2 = imageView2 == m3968O0();
        float f5 = this.f7816Z0;
        if (z2 && m3993f1()) {
            float[] fArr = new float[2];
            m3982a0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m4006k0()) {
                f5 = this.f7816Z0 * (1.0f - this.f7796P0);
            }
            f2 = f5;
            f4 = f7;
            f3 = f6;
        } else {
            f2 = f5;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.001f && Math.abs(f4) < 0.001f) {
            TextView textView2 = this.f7801S;
            m3925J0(textView2, m4018o0(textView2), m4021p0(this.f7801S));
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m3937b0(imageView2, f2, z2, fArr2, fArr3);
        TextView textView3 = this.f7801S;
        m3924H(textView3, f2, fArr2[0], fArr2[1], f3, f4, m4018o0(textView3) + fArr3[0], m4021p0(this.f7801S) + fArr3[1]);
    }

    /* renamed from: l1 */
    public final void m4010l1(ImageView imageView, float f2, boolean z2, float f3, float f4) {
        Theme51GaugeArcView theme51GaugeArcView = imageView == this.f7859p ? this.f7867t : imageView == this.f7861q ? this.f7869u : null;
        if (theme51GaugeArcView == null || imageView == null) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m3954G0(theme51GaugeArcView);
            C1504S0 c1504s0 = theme51GaugeArcView == this.f7867t ? this.f7774E0 : this.f7776F0;
            if (c1504s0 != null) {
                c1504s0.m3920a(theme51GaugeArcView);
                return;
            }
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m3937b0(imageView, f2, z2, fArr, fArr2);
        m4032t(theme51GaugeArcView, imageView, f2, fArr[0], fArr[1], fArr2[0] + f3, fArr2[1] + f4);
        C1504S0 c1504s02 = theme51GaugeArcView == this.f7867t ? this.f7774E0 : this.f7776F0;
        if (c1504s02 != null) {
            c1504s02.m3920a(theme51GaugeArcView);
        }
    }

    /* renamed from: m */
    public final void m4011m() {
        if (this.f7843i1 == null) {
            C1525c c1525c = new C1525c(-15988218);
            this.f7843i1 = c1525c;
            c1525c.m4164f(1720357792);
        }
        C1574t m3964M0 = m3964M0();
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        this.f7835g.setBackgroundResource(android.R.color.transparent);
        if (!m3964M0.m4472a() || m4005j1()) {
            if (m3964M0.m4472a()) {
                m3992f0();
            }
            m4014n();
        } else if (m4005j1()) {
            m3992f0();
            m4014n();
            m4031s1();
        } else if (this.f7857o == null) {
            m3992f0();
            this.f7843i1.m4163e(null);
            this.f7843i1.m4162d(m3988d1() ? -15856632 : -15988218);
            this.f7835g.setLayerType(1, null);
            this.f7835g.setBackground(this.f7843i1);
        } else if (m3995g0() && this.f7857o.getBackground() == this.f7843i1) {
            this.f7857o.setLayerType(1, null);
            m4031s1();
        } else {
            this.f7857o.setVisibility(0);
            this.f7857o.setLayerType(1, null);
            this.f7857o.setBackground(null);
            RunnableC0123b runnableC0123b = new RunnableC0123b(this, 8, m3964M0);
            if (m3964M0.f8687b != 0) {
                runnableC0123b.run();
            } else {
                Uri uri = m3964M0.f8688c;
                if (uri != null) {
                    this.f7857o.setImageURI(uri);
                    this.f7857o.post(runnableC0123b);
                }
            }
        }
        m4031s1();
    }

    /* renamed from: m0 */
    public final ImageView m4012m0() {
        return this.f7826d.f2636h2 ? this.f7861q : this.f7859p;
    }

    /* renamed from: m1 */
    public final void m4013m1() {
        ValueAnimator valueAnimator = this.f7825c1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7825c1 = null;
        }
        this.f7828d1 = false;
        this.f7831e1 = -1;
        cfgData cfgdata = this.f7826d;
        boolean z2 = cfgdata.f2561Q2;
        Context context = this.f7823c;
        if (!z2) {
            if (cfgdata.f2635h1 != 0) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
            }
            this.f7816Z0 = m4019o1();
            this.f7819a1 = 1.0f;
            this.f7822b1 = 0.0f;
            m3947D();
            return;
        }
        if (m4004j0() && cfgdata.f2635h1 == 1) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        if (m4001i0() && cfgdata.f2635h1 != 0) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        this.f7816Z0 = m4006k0() ? m4019o1() : 1.0f;
        this.f7819a1 = m4043w1() ? 1.0f : 0.0f;
        this.f7822b1 = cfgdata.f2635h1 == 2 ? 1.0f : 0.0f;
        m3947D();
        if (m4006k0()) {
            ImageView m4012m0 = m4012m0();
            if (m4012m0 == null) {
                m4012m0 = m3968O0();
            }
            if (m4012m0 == null || m4012m0.getWidth() > 0) {
                return;
            }
            m4012m0.post(new RunnableC1493M0(this, 4));
        }
    }

    /* renamed from: n */
    public final void m4014n() {
        if (this.f7857o == null) {
            m3992f0();
            this.f7843i1.m4163e(null);
            this.f7843i1.m4162d(m3988d1() ? -15856632 : -15988218);
            this.f7835g.setLayerType(1, null);
            this.f7835g.setBackground(this.f7843i1);
            return;
        }
        if (m3995g0()) {
            Drawable background = this.f7857o.getBackground();
            C1525c c1525c = this.f7843i1;
            if (background == c1525c) {
                c1525c.m4163e(null);
                this.f7843i1.m4162d(m3988d1() ? -15856632 : -15988218);
                this.f7857o.setLayerType(1, null);
                return;
            }
        }
        this.f7857o.setVisibility(0);
        this.f7857o.setLayerType(1, null);
        this.f7857o.setImageDrawable(null);
        this.f7857o.setBackground(null);
        this.f7843i1.m4163e(null);
        this.f7843i1.m4162d(m3988d1() ? -15856632 : -15988218);
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
            this.f7835g.setBackgroundResource(android.R.color.transparent);
        }
        this.f7857o.setBackground(this.f7843i1);
    }

    /* renamed from: n0 */
    public final RectF m4015n0() {
        RectF rectF = new RectF();
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup != null && viewGroup.getWidth() > 0 && this.f7835g.getHeight() > 0) {
            float width = this.f7835g.getWidth() - 0.0f;
            float height = this.f7835g.getHeight();
            if (width > 0.0f && height > 0.0f) {
                rectF.set(0.0f, 0.0f, width, height);
            }
        }
        return rectF;
    }

    /* renamed from: n1 */
    public final void m4016n1(ImageView imageView, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (Math.abs(f2 - 1.0f) < 0.001f) {
            View[] m3979Z = m3979Z(imageView);
            int length = m3979Z.length;
            for (int i = 0; i < length; i++) {
                View view = m3979Z[i];
                m3925J0(view, (view == this.f7781I ? m3948D0(f2) : m4018o0(view)) + f5 + f7, m4021p0(view) + f6 + f8);
            }
            return;
        }
        View[] m3979Z2 = m3979Z(imageView);
        int length2 = m3979Z2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            View view2 = m3979Z2[i2];
            m3924H(view2, f2, f3, f4, f5, f6, (view2 == this.f7781I ? m3948D0(f2) : m4018o0(view2)) + f7, m4021p0(view2) + f8);
        }
    }

    /* renamed from: o */
    public final void m4017o(float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f7842i0 == null) {
            return;
        }
        Context context = this.f7823c;
        float f3 = context.getResources().getDisplayMetrics().density;
        float f4 = context.getResources().getDisplayMetrics().scaledDensity;
        float f5 = f3 * 14.0f * f2;
        float f6 = 10.0f * f3 * f2;
        this.f7842i0.setPadding(Math.round(f5), Math.round(f6), AbstractC0062j.m168v(f3, 16.0f, f2), Math.round(f6));
        if (this.f7856n0 != null) {
            int max = Math.max(1, Math.round(72.0f * f3 * f2));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7856n0.getLayoutParams();
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = max;
                marginLayoutParams2.height = max;
                marginLayoutParams2.setMarginEnd(Math.round(f5));
                this.f7856n0.setLayoutParams(marginLayoutParams2);
            }
        }
        TextView textView = this.f7858o0;
        if (textView != null) {
            AbstractC0062j.m164r(f4, 22.0f, f2, textView, 0);
        }
        TextView textView2 = this.f7860p0;
        if (textView2 != null) {
            AbstractC0062j.m164r(f4, 16.0f, f2, textView2, 0);
        }
        TextView textView3 = this.f7862q0;
        if (textView3 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView3, 0);
            this.f7862q0.setMinWidth(Math.round(f3 * 46.0f * f2));
        }
        TextView textView4 = this.f7864r0;
        if (textView4 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView4, 0);
            this.f7864r0.setMinWidth(Math.round(46.0f * f3 * f2));
        }
        ProgressBar progressBar = this.f7866s0;
        if (progressBar != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar.getLayoutParams()) != null) {
            marginLayoutParams.height = Math.max(1, Math.round(6.0f * f3 * f2));
            int round = Math.round(f3 * 8.0f * f2);
            marginLayoutParams.setMarginStart(round);
            marginLayoutParams.setMarginEnd(round);
            this.f7866s0.setLayoutParams(marginLayoutParams);
        }
        View view = this.f7842i0;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof LinearLayout) && ((LinearLayout) childAt).getOrientation() == 1) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                        View childAt2 = viewGroup2.getChildAt(i2);
                        if ((childAt2 instanceof LinearLayout) && ((LinearLayout) childAt2).getOrientation() == 0) {
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                            if (marginLayoutParams3 != null) {
                                marginLayoutParams3.topMargin = AbstractC0062j.m168v(f3, 8.0f, f2);
                                childAt2.setLayoutParams(marginLayoutParams3);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: o0 */
    public final float m4018o0(View view) {
        float f2;
        float m4022p1 = m4022p1();
        if (view == this.f7801S) {
            float f3 = this.f7812X0;
            return m4022p1 > 0.001f ? f3 - (m4022p1 * 10.0f) : f3;
        }
        TextView textView = this.f7781I;
        float f4 = view == textView ? this.f7810W0 : 0.0f;
        if (m4022p1 <= 0.001f) {
            return f4;
        }
        if (view == this.f7799R) {
            f2 = m4022p1 * 10.0f;
        } else {
            if (view != this.f7779H && view != textView) {
                return f4;
            }
            f2 = m4022p1 * (-10.0f);
        }
        return f4 + f2;
    }

    /* renamed from: o1 */
    public final float m4019o1() {
        ImageView m4012m0 = m4012m0();
        if (m4012m0 == null) {
            m4012m0 = m3968O0();
        }
        float f2 = this.f7823c.getResources().getDisplayMetrics().density * 87.0f;
        float width = (m4012m0 == null || m4012m0.getWidth() <= 0) ? 730.0f : m4012m0.getWidth();
        return Math.max(0.2f, (width - f2) / width);
    }

    /* renamed from: p */
    public final void m4020p(boolean z2) {
        int i;
        int i2;
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup == null || this.f7790M0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7835g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7835g.post(new RunnableC1501Q0(this, z2, 0));
            return;
        }
        m3972S();
        m4007k1();
        int round = Math.round(this.f7823c.getResources().getDisplayMetrics().density * 96.0f);
        float m4022p1 = m4022p1();
        float max = Math.max(0.0f, Math.min(1.0f, this.f7822b1));
        m3943B(m4022p1);
        m4035u(width, height, round, AbstractC1561o.m4297a(1.0f, this.f7822b1, 0.0f, m4022p1()));
        m4000i(width, height, round, m4022p1);
        boolean z3 = m4022p1 > 0.001f;
        if (this.f7842i0 != null && this.f7826d.f2585W2 && !m3987d0() && !m4001i0()) {
            C0639g.m1872x().m1880u();
            if (C0639g.m1872x().m1880u().m1851a()) {
                if (max >= 0.999f) {
                    this.f7842i0.setAlpha(0.0f);
                    this.f7842i0.setVisibility(4);
                } else if (this.f7842i0.getVisibility() != 0) {
                    this.f7842i0.setVisibility(0);
                }
            }
        }
        View view = this.f7842i0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int i3 = width - 470;
        int max2 = Math.max(0, i3 / 2);
        int m4298b = AbstractC1561o.m4298b(height, round, 40, 0);
        if (!z3) {
            m4017o(1.0f);
            m4023q(this.f7842i0, round, max2, m4298b, max * 40.0f, z2);
            this.f7842i0.setAlpha(1.0f - max);
            this.f7842i0.bringToFront();
            View view2 = this.f7845j0;
            if (view2 != null) {
                view2.bringToFront();
                return;
            }
            return;
        }
        float f2 = ((-0.19999999f) * m4022p1) + 1.0f;
        m4017o(f2);
        int m152f = AbstractC0062j.m152f(round, f2, 1);
        ImageView m4012m0 = m4012m0();
        if (m4012m0 == null || m4012m0.getWidth() <= 0 || m4012m0.getHeight() <= 0) {
            i = max2;
            i2 = m4298b;
        } else {
            float f3 = this.f7816Z0;
            float left = m4012m0.getLeft();
            float width2 = m4012m0.getWidth() * f3;
            float height2 = (m4012m0.getHeight() * f3) + m4012m0.getTop();
            float m149c = AbstractC0062j.m149c(width2, 470, 0.5f, left);
            float f4 = height2 + 23.0f;
            float max3 = Math.max(0.0f, (height - m152f) - 8.0f);
            if (f4 > max3) {
                f4 = max3;
            }
            float f5 = max2;
            int m151e = AbstractC0062j.m151e(m149c, f5, m4022p1, f5);
            float f6 = m4298b;
            int m151e2 = AbstractC0062j.m151e(f4, f6, m4022p1, f6);
            int max4 = Math.max(0, Math.min(m151e, Math.max(0, i3)));
            int max5 = Math.max(0, m151e2);
            i = max4;
            i2 = max5;
        }
        m4023q(this.f7842i0, m152f, i, i2, max * 40.0f, z2);
        this.f7842i0.setAlpha(1.0f - max);
        this.f7842i0.bringToFront();
        View view3 = this.f7845j0;
        if (view3 != null) {
            view3.bringToFront();
        }
    }

    /* renamed from: p0 */
    public final float m4021p0(View view) {
        if (view == this.f7801S) {
            return this.f7814Y0;
        }
        return 0.0f;
    }

    /* renamed from: p1 */
    public final float m4022p1() {
        float m4019o1 = m4019o1();
        if (Math.abs(m4019o1 - 1.0f) < 0.001f) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (1.0f - this.f7816Z0) / (1.0f - m4019o1)));
    }

    /* renamed from: q */
    public final void m4023q(View view, int i, int i2, int i3, float f2, boolean z2) {
        float f3 = this.f7876x0;
        if (f3 < 0.0f) {
            f3 = i2;
        }
        float f4 = f3 + 0.0f;
        float f5 = this.f7878y0;
        float f6 = f5 >= 0.0f ? f5 + this.f7880z0 : i3 + f2;
        float f7 = i2;
        float f8 = i3;
        float f9 = f8 + f2;
        C1592d c1592d = new C1592d(470, i);
        c1592d.f9046i = 0;
        c1592d.f9065t = 0;
        c1592d.f9067v = -1;
        c1592d.f9052l = -1;
        c1592d.setMarginStart(i2);
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = i3;
        view.setLayoutParams(c1592d);
        boolean z3 = Math.abs(f4 - (f7 + 0.0f)) > 0.5f || Math.abs(f6 - f9) > 0.5f;
        if (z2 && this.f7878y0 >= 0.0f && z3) {
            view.animate().cancel();
            view.setTranslationX(f4 - f7);
            view.setTranslationY(f6 - f8);
            view.animate().translationX(0.0f).translationY(f2).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            view.animate().cancel();
            view.setTranslationX(0.0f);
            view.setTranslationY(f2);
        }
        this.f7876x0 = f7;
        this.f7878y0 = f8;
        this.f7880z0 = f2;
    }

    /* renamed from: q0 */
    public final RectF m4024q0() {
        Rect m4239u = AbstractC1539g1.m4239u();
        ViewGroup viewGroup = this.f7835g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7835g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4208b0(m4239u, this.f7835g.getWidth(), this.f7835g.getHeight());
    }

    /* renamed from: q1 */
    public final void m4025q1(boolean z2) {
        this.f7832f.removeCallbacks(this.f7792N0);
        if (z2 && AbstractC1372y1.m3272C()) {
            m3955H0();
            return;
        }
        if (!m3998h0()) {
            m3955H0();
            return;
        }
        m3961L();
        if (z2) {
            AbstractC1372y1.m3287R(true, true);
            m3963M();
            this.f7784J0 = false;
            this.f7796P0 = 0.0f;
            if (m3995g0()) {
                m4031s1();
            } else {
                m4033t0();
            }
            m4038v();
            m3999h1(0.0f, 1.0f, new RunnableC1493M0(this, 6));
            return;
        }
        if (m3993f1() && this.f7796P0 > 0.0f) {
            m4038v();
            m3999h1(this.f7796P0, 0.0f, new RunnableC1493M0(this, 8));
        } else {
            this.f7784J0 = true;
            this.f7796P0 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m3956I();
        }
    }

    /* renamed from: r */
    public final void m4026r(long j2) {
        boolean z2 = this.f7870u0 > 0;
        ProgressBar progressBar = this.f7866s0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7866s0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7870u0)));
            }
        }
        TextView textView = this.f7862q0;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7862q0.setText(m3933W(j2));
            }
        }
        TextView textView2 = this.f7864r0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7864r0.setText(m3933W(this.f7870u0));
            }
        }
    }

    /* renamed from: r0 */
    public final void m4027r0() {
        float f2 = this.f7823c.getResources().getDisplayMetrics().density * 6.0f;
        m3930T0(this.f7859p, f2);
        m3930T0(this.f7861q, f2);
        m3930T0(this.f7863r, f2);
        m3930T0(this.f7865s, f2);
        m3930T0(this.f7867t, f2);
        m3930T0(this.f7869u, f2);
        m3930T0(this.f7813Y, f2);
        m3930T0(this.f7815Z, f2);
        m3930T0(this.f7779H, f2);
        m3930T0(this.f7799R, f2);
        m3930T0(this.f7781I, f2);
        m3930T0(this.f7783J, f2);
        m3930T0(this.f7795P, f2);
        m3930T0(this.f7845j0, f2);
        m3930T0(this.f7842i0, f2);
        m3930T0(this.f7777G, f2);
        m3930T0(this.f7801S, f2);
        m3930T0(this.f7847k, 2.0f);
        m3930T0(this.f7850l, 2.0f);
        m3930T0(this.f7853m, 2.0f);
        m3930T0(this.f7857o, 0.0f);
    }

    /* renamed from: r1 */
    public final void m4028r1() {
        cfgData cfgdata = this.f7826d;
        int i = (cfgdata.f2537K2 && cfgdata.f2589X2 && m3977Y() && !AbstractC1539g1.m4194P(cfgdata, this.f7829e)) ? 0 : 8;
        ImageView imageView = this.f7836g0;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.f7839h0;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
    }

    /* renamed from: s */
    public final void m4029s() {
        ViewGroup viewGroup;
        if (this.f7838h == null || (viewGroup = this.f7835g) == null) {
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7835g.getHeight() <= 0) {
            this.f7835g.post(new RunnableC1493M0(this, 19));
            return;
        }
        if (this.f7838h.getLayoutParams() instanceof C1592d) {
            RectF m4015n0 = m3988d1() ? m4015n0() : m3965N();
            C1592d c1592d = (C1592d) this.f7838h.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m4015n0.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m4015n0.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m4015n0.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m4015n0.top);
            this.f7838h.setLayoutParams(c1592d);
            if (m4034t1() || m4040v1()) {
                this.f7838h.setVisibility(4);
            }
            if (m4040v1() || m3990e1()) {
                float f2 = this.f7823c.getResources().getDisplayMetrics().density * 14.0f;
                View view = this.f7850l;
                if (view == null) {
                    return;
                }
                m3940e(view, 25.0f + f2 + 10.0f);
                C1528d c1528d = this.f7855n;
                if (c1528d != null) {
                    c1528d.m4167b(f2);
                }
            }
        }
    }

    /* renamed from: s0 */
    public final void m4030s0() {
        float f2;
        float m1789h;
        float f3;
        int i;
        AbstractC1539g1.m4228l0(this.f7835g, !this.f7782I0);
        float m3962L0 = m3962L0();
        float m3960K0 = m3960K0();
        C1504S0 c1504s0 = this.f7770C0;
        if (c1504s0 != null) {
            float max = Math.max(c1504s0.f7756a, Math.min(c1504s0.f7757b, m3962L0));
            c1504s0.f7758c = max;
            c1504s0.f7759d = max;
            c1504s0.m3922c(max);
            this.f7770C0.m3920a(this.f7863r);
        }
        C1504S0 c1504s02 = this.f7772D0;
        if (c1504s02 != null) {
            c1504s02.f7759d = Math.max(c1504s02.f7756a, Math.min(c1504s02.f7757b, m3960K0));
        }
        m4046y();
        m3944B0();
        cfgData cfgdata = this.f7826d;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f7829e;
        if (z2) {
            float f4 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            float m1776v = cardata.m1776v();
            m1789h = cfgdata.m1786e(m1775u, m1776v, f4);
            f3 = cfgdata.m1787f(m1775u, m1776v, f4);
            f2 = m1789h;
        } else {
            float max2 = Math.max(0.0f, cardata.m1774t());
            f2 = max2;
            m1789h = cfgdata.m1789h() * max2;
            f3 = f2;
        }
        C1504S0 c1504s03 = this.f7774E0;
        if (c1504s03 != null) {
            c1504s03.f7759d = Math.max(c1504s03.f7756a, Math.min(c1504s03.f7757b, f3));
        }
        TextView textView = this.f7779H;
        if (textView != null) {
            m3929S0(textView, m1789h, "L", f2 < 15.0f ? -65536 : f2 < 30.0f ? -256 : -10556716, "%.0f");
        }
        int i2 = f2 < 15.0f ? -65536 : f2 < 30.0f ? -256 : -10556716;
        if (this.f7781I != null) {
            if (!m3977Y() || cfgdata.f2543M0.f7147f) {
                this.f7781I.setVisibility(4);
            } else {
                this.f7781I.setVisibility(0);
                float m1777w = cardata.m1777w();
                if (m1777w < 0.0f) {
                    SpannableString spannableString = new SpannableString("--km");
                    spannableString.setSpan(AbstractC0062j.m155i(this.f7781I, -7829368, i2), 0, 2, 33);
                    this.f7781I.setText(spannableString);
                } else {
                    m3929S0(this.f7781I, m1777w, "km", i2, "%.0f");
                }
            }
        }
        float m1743d = cardata.m1743d();
        C1504S0 c1504s04 = this.f7776F0;
        if (c1504s04 != null) {
            float f5 = c1504s04.f7756a;
            float f6 = c1504s04.f7757b;
            if (m1743d < -90.0f) {
                c1504s04.f7759d = Math.max(f5, Math.min(f6, 40.0f));
            } else {
                c1504s04.f7759d = Math.max(f5, Math.min(f6, m1743d));
            }
        }
        TextView textView2 = this.f7799R;
        if (textView2 != null) {
            if (m1743d < -90.0f) {
                textView2.setText("--°C");
                this.f7799R.setTextColor(-7829368);
            } else {
                m3929S0(textView2, m1743d, "°C", m1743d < 40.0f ? -16776961 : m1743d > 112.0f ? -65536 : m1743d > 107.0f ? -256 : -10556716, "%.0f");
                m4009l0();
            }
        }
        float m1765o = cardata.m1765o();
        TextView textView3 = this.f7875x;
        if (textView3 != null) {
            textView3.setTextColor(-10556716);
            this.f7875x.setText(m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L");
        }
        TextView textView4 = this.f7877y;
        if (textView4 != null) {
            textView4.setTextColor(-10839404);
            this.f7877y.setText(this.f7820b.getContext().getString((cardata.m1780z() > 0.0f ? 1 : (cardata.m1780z() == 0.0f ? 0 : -1)) > 0 ? R.string.ip_theme_41_inst_fuel_unit_l100 : R.string.ip_theme_41_inst_fuel_unit_lph));
        }
        m3934W0(this.f7765A, cardata.m1739b());
        m3934W0(this.f7771D, cardata.m1737a());
        TextView textView5 = this.f7801S;
        if (textView5 != null) {
            m3929S0(textView5, cardata.m1741c(), "V", -10556716, "%.1f");
            m4009l0();
        }
        m4049z0();
        if (this.f7797Q != null) {
            String str = ((double) cardata.m1715C()) <= 10.0d ? "%.1f" : "%.0f";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float[] fArr = {cardata.m1715C(), cardata.m1716D(), cardata.m1717E(), cardata.m1718F()};
            String[] strArr = {"       ", "\n", "       ", ""};
            for (int i3 = 0; i3 < 4; i3++) {
                float f7 = fArr[i3];
                String replace = (f7 == -99.0f || f7 == 3.5f) ? "--" : String.format(Locale.ENGLISH, str, Float.valueOf(f7)).replace(",", ".");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) replace);
                if (f7 == -99.0f) {
                    i = -16776961;
                } else {
                    float f8 = cfgdata.f2580V1;
                    i = f7 < 0.95f * f8 ? -65536 : f7 < f8 ? -256 : -10556716;
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 33);
                if (i3 < 3) {
                    spannableStringBuilder.append((CharSequence) strArr[i3]);
                }
            }
            this.f7797Q.setText(spannableStringBuilder);
        }
        m3942A0();
        m4047y0();
        m4042w0();
        TextView textView6 = this.f7805U;
        if (textView6 == null) {
            return;
        }
        textView6.setText(AbstractC1372y1.m3307m(this.f7823c));
    }

    /* renamed from: s1 */
    public final void m4031s1() {
        float f2;
        float f3;
        if (this.f7835g == null || this.f7843i1 == null || !m4034t1()) {
            ViewGroup viewGroup = this.f7835g;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
                return;
            }
            return;
        }
        if (this.f7835g.getWidth() <= 0 || this.f7835g.getHeight() <= 0) {
            this.f7835g.post(new RunnableC1493M0(this, 5));
            return;
        }
        float f4 = this.f7823c.getResources().getDisplayMetrics().density;
        float f5 = 14.0f * f4;
        float f6 = f4 * 1.0f;
        if (m3988d1()) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f2 = f6;
            f3 = f5;
        }
        this.f7843i1.m4160b();
        if (!this.f7843i1.m4161c()) {
            this.f7843i1.m4162d(m3988d1() ? -15856632 : -15988218);
        }
        if (m3988d1()) {
            ViewGroup viewGroup2 = this.f7835g;
            if (viewGroup2 != null) {
                viewGroup2.getOverlay().clear();
            }
            RectF m4015n0 = m4015n0();
            if (m4015n0.width() > 0.0f && m4015n0.height() > 0.0f) {
                this.f7843i1.m4159a(m4015n0.left, m4015n0.top, m4015n0.right, m4015n0.bottom, f3, f2);
            }
        } else if (m4040v1() || m3990e1()) {
            RectF m3965N = m3965N();
            if (m4040v1() && !m3990e1()) {
                m3965N = m3926P0(m3965N, this.f7819a1);
            }
            if (m3965N.width() <= 0.0f || m3965N.height() <= 0.0f) {
                ViewGroup viewGroup3 = this.f7835g;
                if (viewGroup3 != null) {
                    viewGroup3.getOverlay().clear();
                }
            } else {
                this.f7843i1.m4159a(m3965N.left, m3965N.top, m3965N.right, m3965N.bottom, f5, 0.0f);
                ViewGroup viewGroup4 = this.f7835g;
                if (viewGroup4 != null) {
                    viewGroup4.getOverlay().clear();
                }
            }
        } else {
            ViewGroup viewGroup5 = this.f7835g;
            if (viewGroup5 != null) {
                viewGroup5.getOverlay().clear();
            }
        }
        if (m3993f1()) {
            RectF m3926P0 = m3926P0(m4024q0(), this.f7796P0);
            if (m3926P0.width() > 0.0f && m3926P0.height() > 0.0f) {
                this.f7843i1.m4159a(m3926P0.left, m3926P0.top, m3926P0.right, m3926P0.bottom, f5, 0.0f);
            }
        }
        ImageView imageView = this.f7857o;
        if (imageView != null && imageView.getBackground() == this.f7843i1) {
            this.f7857o.invalidate();
        } else if (this.f7835g.getBackground() == this.f7843i1) {
            this.f7835g.invalidate();
        }
    }

    /* renamed from: t */
    public final void m4032t(Theme51GaugeArcView theme51GaugeArcView, ImageView imageView, float f2, float f3, float f4, float f5, float f6) {
        if (theme51GaugeArcView == null || imageView == null) {
            return;
        }
        if (theme51GaugeArcView.getWidth() <= 0 || theme51GaugeArcView.getHeight() <= 0) {
            theme51GaugeArcView.post(new RunnableC1493M0(this, 22));
            return;
        }
        float width = (imageView.getWidth() * 0.5f) + imageView.getLeft();
        float m149c = AbstractC0062j.m149c(width, f3, f2, f3);
        float m149c2 = AbstractC0062j.m149c((imageView.getHeight() * 0.5f) + imageView.getTop(), f4, f2, f4);
        float height = (theme51GaugeArcView.getHeight() * 0.5f) + theme51GaugeArcView.getTop();
        theme51GaugeArcView.setPivotX(theme51GaugeArcView.getWidth() * 0.5f);
        theme51GaugeArcView.setPivotY(theme51GaugeArcView.getHeight() * 0.5f);
        theme51GaugeArcView.setScaleX(f2);
        theme51GaugeArcView.setScaleY(f2);
        theme51GaugeArcView.setTranslationX((m149c - ((theme51GaugeArcView.getWidth() * 0.5f) + theme51GaugeArcView.getLeft())) + f5);
        theme51GaugeArcView.setTranslationY((m149c2 - height) + f6 + 0.0f + ((theme51GaugeArcView == this.f7867t || theme51GaugeArcView == this.f7869u) ? 15.0f : 0.0f));
        Theme51GaugeArcView theme51GaugeArcView2 = this.f7863r;
        if (theme51GaugeArcView == theme51GaugeArcView2 || theme51GaugeArcView == this.f7865s) {
            C1504S0 c1504s0 = theme51GaugeArcView == theme51GaugeArcView2 ? this.f7770C0 : this.f7772D0;
            if (c1504s0 != null) {
                c1504s0.m3920a(theme51GaugeArcView);
            }
        }
    }

    /* renamed from: t0 */
    public final void m4033t0() {
        C1525c c1525c;
        if (this.f7835g == null) {
            return;
        }
        try {
            if (!this.f7826d.f2561Q2 && !m4001i0()) {
                m3969P();
                return;
            }
            if (!m4034t1()) {
                if (m3995g0()) {
                    m3970Q();
                }
                ViewGroup viewGroup = this.f7835g;
                if (viewGroup != null) {
                    viewGroup.setLayerType(0, null);
                }
                View view = this.f7838h;
                if (view != null) {
                    view.setVisibility(8);
                }
                m4048z();
                return;
            }
            if (!m3995g0()) {
                m4011m();
                m4029s();
                return;
            }
            C1574t m3964M0 = m3964M0();
            if (m4005j1()) {
                C1525c c1525c2 = this.f7843i1;
                if (c1525c2 != null && c1525c2.m4161c()) {
                    m3992f0();
                    m4014n();
                }
            } else if (m3964M0.m4472a() && (c1525c = this.f7843i1) != null && !c1525c.m4161c()) {
                m4011m();
                return;
            }
            m4029s();
            m4031s1();
        } finally {
            m3949E();
        }
    }

    /* renamed from: t1 */
    public final boolean m4034t1() {
        return this.f7826d.f2537K2 && (m3993f1() || m4004j0() || m4001i0() || m4040v1());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0216  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4035u(int i, int i2, int i3, float f2) {
        ViewGroup viewGroup;
        int max;
        View view;
        int i4;
        float f3;
        float f4;
        View view2;
        float f5;
        View view3;
        float f6;
        int i5;
        int i6;
        int i7;
        View view4 = this.f7845j0;
        if (view4 == null || view4.getVisibility() != 0) {
            return;
        }
        View view5 = this.f7785K;
        boolean z2 = view5 != null && view5.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f7795P;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = (z2 ^ z3) && !(m4037u1() || (m4022p1() > 0.001f ? 1 : (m4022p1() == 0.001f ? 0 : -1)) > 0);
        int m3973T = m3973T();
        if (m3973T <= 0 || (!z2 && !z3)) {
            if (!z2 || (view = this.f7785K) == null) {
                m3973T = 0;
            } else if (view.getHeight() > 0) {
                m3973T = Math.max(0, this.f7785K.getHeight());
            } else {
                this.f7785K.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                m3973T = Math.max(0, this.f7785K.getMeasuredHeight());
            }
            if (z3 && (viewGroup = this.f7795P) != null) {
                if (viewGroup.getHeight() > 0) {
                    max = Math.max(m3973T, this.f7795P.getHeight());
                } else {
                    this.f7795P.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    max = Math.max(m3973T, this.f7795P.getMeasuredHeight());
                }
                m3973T = max;
            }
        }
        if (m3973T <= 0) {
            View view6 = this.f7848k0;
            if (view6 != null && view6.getVisibility() == 0 && this.f7848k0.getHeight() > 0) {
                m3973T = this.f7848k0.getHeight();
            } else if (this.f7845j0.getHeight() > 0) {
                m3973T = this.f7845j0.getHeight();
            }
        }
        if (m3973T <= 0) {
            this.f7845j0.post(new RunnableC1493M0(this, 9));
            return;
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float max3 = Math.max(0.0f, Math.min(1.0f, this.f7822b1));
        float f7 = (max2 * (-0.19999999f)) + 1.0f;
        if (z4) {
            View view7 = z2 ? this.f7785K : this.f7795P;
            if (view7 != null) {
                view7.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(m3973T, 1073741824));
                if (view7.getMeasuredWidth() > 0) {
                    i4 = view7.getMeasuredWidth();
                    float f8 = i4;
                    float f9 = f8 * f7;
                    float f10 = m3973T * f7;
                    int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
                    int i8 = i - i4;
                    int m152f = AbstractC0062j.m152f(i8, 0.5f, 0);
                    float f11 = m4298b - m3973T;
                    float f12 = 1.0f - max2;
                    int max4 = Math.max(0, Math.round(f11 - (27.0f * f12)));
                    if (max2 <= 0.001f) {
                        ImageView m3968O0 = m3968O0();
                        if (m3968O0 == null || m3968O0.getWidth() <= 0 || m3968O0.getHeight() <= 0) {
                            f3 = f12;
                            f4 = f8;
                            int m150d = AbstractC0062j.m150d(max2, 110.0f, m152f);
                            float f13 = max4;
                            float f14 = f13 + 70.0f;
                            float max5 = Math.max(0.0f, (i2 - f10) - 4.0f);
                            if (f14 <= max5) {
                                max5 = f14;
                            }
                            int m151e = AbstractC0062j.m151e(max5, f13, max2, f13);
                            i5 = 0;
                            i6 = m151e;
                            i7 = m150d;
                        } else {
                            float m4019o1 = m4019o1();
                            float f15 = this.f7816Z0;
                            float m149c = AbstractC0062j.m149c(m4019o1, f15, max3, f15);
                            f3 = f12;
                            f4 = f8;
                            float width = (((m3968O0.getWidth() * m149c) - f9) * 0.5f) + AbstractC0062j.m149c(1.0f, m149c, m3968O0.getWidth(), m3968O0.getLeft()) + 110.0f;
                            float height = (m3968O0.getHeight() * m149c) + m3968O0.getTop() + 23.0f + 70.0f;
                            float max6 = Math.max(0.0f, (i2 - f10) - 4.0f);
                            if (height > max6) {
                                height = max6;
                            }
                            float f16 = m152f;
                            i7 = AbstractC0062j.m151e(width, f16, max2, f16);
                            float f17 = max4;
                            i6 = AbstractC0062j.m151e(height, f17, max2, f17);
                            i5 = 0;
                        }
                        m152f = Math.max(i5, Math.min(i7, Math.max(i5, i8)));
                        max4 = Math.max(i5, i6);
                    } else {
                        f3 = f12;
                        f4 = f8;
                    }
                    int round = m152f - Math.round(550.0f * max3);
                    view2 = this.f7845j0;
                    if (view2 != null) {
                        f5 = 0.0f;
                    } else {
                        view2.animate().cancel();
                        C1592d c1592d = new C1592d(i4, -2);
                        c1592d.f9046i = 0;
                        c1592d.f9065t = -1;
                        c1592d.f9038e = 0;
                        c1592d.f9067v = -1;
                        c1592d.f9044h = -1;
                        c1592d.f9052l = -1;
                        ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = round;
                        c1592d.setMarginStart(0);
                        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max4;
                        this.f7845j0.setLayoutParams(c1592d);
                        f5 = 0.0f;
                        float max7 = (Math.max(0.0f, Math.min(1.0f, max2)) * (-0.19999999f)) + 1.0f;
                        this.f7845j0.setPivotX(z4 ? 0.5f * f4 : 0.0f);
                        this.f7845j0.setPivotY(0.0f);
                        this.f7845j0.setScaleX(max7);
                        this.f7845j0.setScaleY(max7);
                        this.f7845j0.setTranslationX(0.0f);
                        this.f7845j0.setTranslationY(0.0f);
                    }
                    view3 = this.f7845j0;
                    if (view3 != null) {
                        view3.setTranslationX((-15.0f) * max2);
                        this.f7845j0.setTranslationY(f5);
                    }
                    if (this.f7785K != null) {
                        this.f7785K.setTranslationX((m4037u1() ? -50.0f : (-20.0f) * f3) - (7.0f * max3));
                        this.f7785K.setTranslationY(max3 * (-40.0f));
                    }
                    if (this.f7795P == null) {
                        if (m4037u1()) {
                            f6 = m4001i0() ? -235.0f : -215.0f;
                        } else {
                            f6 = ((z4 ? f5 : max2 * (-10.0f)) - (max2 * 15.0f)) - (f3 * 10.0f);
                        }
                        this.f7795P.setTranslationX(f6 - (20.0f * max3));
                        this.f7795P.setTranslationY(max3 * (-40.0f));
                        this.f7795P.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
        }
        i4 = 470;
        float f82 = i4;
        float f92 = f82 * f7;
        float f102 = m3973T * f7;
        int m4298b2 = AbstractC1561o.m4298b(i2, i3, 40, 0);
        int i82 = i - i4;
        int m152f2 = AbstractC0062j.m152f(i82, 0.5f, 0);
        float f112 = m4298b2 - m3973T;
        float f122 = 1.0f - max2;
        int max42 = Math.max(0, Math.round(f112 - (27.0f * f122)));
        if (max2 <= 0.001f) {
        }
        int round2 = m152f2 - Math.round(550.0f * max3);
        view2 = this.f7845j0;
        if (view2 != null) {
        }
        view3 = this.f7845j0;
        if (view3 != null) {
        }
        if (this.f7785K != null) {
        }
        if (this.f7795P == null) {
        }
    }

    /* renamed from: u0 */
    public final void m4036u0(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f7826d;
        if (cfgdata.f2537K2 && cfgdata.f2589X2) {
            boolean m3977Y = m3977Y();
            carData cardata = this.f7829e;
            if (m3977Y || AbstractC1539g1.m4194P(cfgdata, cardata)) {
                byte b2 = (byte) (i & 15);
                byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
                EnumC1457c enumC1457c = cfgdata.f2543M0;
                if (!AbstractC1539g1.m4194P(cfgdata, cardata) && (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite)) {
                    b3 = 1;
                    b2 = 1;
                }
                if (b2 == 1) {
                    ImageView imageView2 = this.f7827d0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView2 = this.f7830e0;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                    }
                } else if (b2 == 2) {
                    ImageView imageView3 = this.f7827d0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        this.f7827d0.setColorFilter(-7829368);
                    }
                    TextView textView3 = this.f7830e0;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    ImageView imageView4 = this.f7827d0;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        this.f7827d0.setColorFilter(-16711936);
                    }
                    TextView textView4 = this.f7830e0;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
                if (cardata.m1747f() < 20 && (textView = this.f7830e0) != null) {
                    textView.setVisibility(4);
                }
                if (b3 == 1) {
                    ImageView imageView5 = this.f7833f0;
                    if (imageView5 != null) {
                        imageView5.setVisibility(4);
                    }
                } else if (b3 == 2) {
                    ImageView imageView6 = this.f7833f0;
                    if (imageView6 != null) {
                        imageView6.setVisibility(0);
                        this.f7833f0.setColorFilter(-7829368);
                    }
                } else if (b3 == 3 && (imageView = this.f7833f0) != null) {
                    imageView.setVisibility(0);
                    this.f7833f0.setColorFilter(-16711936);
                }
                m4028r1();
                m3959K();
                return;
            }
        }
        m3975V();
    }

    /* renamed from: u1 */
    public final boolean m4037u1() {
        return m4001i0() || m4004j0() || m4006k0() || this.f7826d.f2635h1 == 2;
    }

    /* renamed from: v */
    public final void m4038v() {
        m4044x();
        boolean m3977Y = m3977Y();
        ImageView m4012m0 = m4012m0();
        boolean z2 = this.f7826d.f2636h2;
        Theme51GaugeArcView theme51GaugeArcView = z2 ? this.f7865s : this.f7863r;
        Theme51SevenSegView theme51SevenSegView = z2 ? this.f7815Z : this.f7813Y;
        m3938b1(m4012m0, m3977Y);
        m3938b1(theme51GaugeArcView, m3977Y);
        m3938b1(theme51SevenSegView, m3977Y);
        m3938b1(m4012m0 == this.f7859p ? this.f7867t : m4012m0 == this.f7861q ? this.f7869u : null, m3977Y);
        m3978Y0(m4012m0, m3977Y);
        if (!m3977Y) {
            m3952F0();
        } else if (m4006k0()) {
            m4003j(m4012m0, theme51GaugeArcView, theme51SevenSegView, m3985c0(), false, this.f7816Z0, 0.0f, 0.0f);
            m4010l1(m4012m0, this.f7816Z0, false, 0.0f, 0.0f);
        } else {
            m3952F0();
            m4010l1(m4012m0, 1.0f, false, 0.0f, 0.0f);
        }
        m4020p(false);
        m3945C();
        m3989e0();
        m4041w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0024, code lost:
    
        if (r12 == 2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4039v0(int i) {
        Bitmap bitmap;
        int i2;
        ImageView imageView = this.f7859p;
        if (imageView == null || this.f7861q == null || (bitmap = this.f7871v) == null || this.f7873w == null) {
            return;
        }
        cfgData cfgdata = this.f7826d;
        if (cfgdata.f2641i2 && cfgdata.f2615d1.f7096F) {
            i2 = i == 1 ? 1 : 2;
            if (i2 != this.f7806U0) {
                return;
            }
            this.f7806U0 = i2;
            if (i2 == 0) {
                imageView.setImageBitmap(bitmap);
                this.f7861q.setImageBitmap(this.f7873w);
                return;
            } else {
                int i3 = i2 == 1 ? -65536 : f7763n1;
                EnumC1456b enumC1456b = cfgdata.f2615d1;
                AbstractC1261H.m3037b(this.f7823c, imageView, bitmap, "themes/51/theme_51_spd.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                AbstractC1261H.m3037b(this.f7823c, this.f7861q, this.f7873w, "themes/51/theme_51_rpm.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                return;
            }
        }
        i2 = 0;
        if (i2 != this.f7806U0) {
        }
    }

    /* renamed from: v1 */
    public final boolean m4040v1() {
        return m4006k0() || this.f7826d.f2635h1 == 2 || this.f7819a1 > 0.001f || this.f7822b1 > 0.001f || this.f7816Z0 < 0.999f;
    }

    /* renamed from: w */
    public final void m4041w() {
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f7781I == null || (imageView = this.f7859p) == null) {
            return;
        }
        if (imageView.getWidth() <= 0) {
            this.f7859p.post(new RunnableC1493M0(this, 18));
            return;
        }
        ImageView imageView2 = this.f7859p;
        boolean z2 = imageView2 == m3968O0();
        float f5 = this.f7816Z0;
        if (z2 && m3993f1()) {
            float[] fArr = new float[2];
            m3982a0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m4006k0()) {
                f5 = this.f7816Z0 * (1.0f - this.f7796P0);
            }
            f2 = f5;
            f4 = f7;
            f3 = f6;
        } else {
            f2 = f5;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        float m3948D0 = m3948D0(f2);
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m3925J0(this.f7781I, m3948D0, 0.0f);
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m3937b0(imageView2, f2, z2, fArr2, fArr3);
        m3924H(this.f7781I, f2, fArr2[0], fArr2[1], f3, f4, m3948D0 + fArr3[0], fArr3[1]);
    }

    /* renamed from: w0 */
    public final void m4042w0() {
        TextView textView = this.f7803T;
        if (textView == null) {
            return;
        }
        if (!this.f7826d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f7829e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f7803T.setVisibility(4);
            return;
        }
        this.f7803T.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f7803T, -7829368, -1), 0, replace.length(), 33);
        this.f7803T.setText(spannableString);
    }

    /* renamed from: w1 */
    public final boolean m4043w1() {
        cfgData cfgdata = this.f7826d;
        int i = cfgdata.f2635h1;
        if (i == 0) {
            return true;
        }
        return i == 2 && AbstractC1539g1.m4194P(cfgdata, this.f7829e);
    }

    /* renamed from: x */
    public final void m4044x() {
        boolean z2;
        boolean z3 = m3977Y() && (((z2 = this.f7784J0) && this.f7796P0 <= 0.0f) || z2 || this.f7796P0 < 1.0f);
        ImageView m3968O0 = m3968O0();
        cfgData cfgdata = this.f7826d;
        boolean z4 = cfgdata.f2636h2;
        Theme51GaugeArcView theme51GaugeArcView = z4 ? this.f7863r : this.f7865s;
        Theme51SevenSegView theme51SevenSegView = z4 ? this.f7813Y : this.f7815Z;
        m3938b1(m3968O0, z3);
        m3938b1(theme51GaugeArcView, z3);
        m3938b1(theme51SevenSegView, z3);
        m3938b1(m3968O0 == this.f7859p ? this.f7867t : m3968O0 == this.f7861q ? this.f7869u : null, z3);
        m3978Y0(m3968O0, z3);
        if (!z3) {
            m3957I0();
            return;
        }
        if (m4006k0()) {
            float[] fArr = new float[2];
            m3982a0(fArr);
            float f2 = (1.0f - this.f7796P0) * this.f7816Z0;
            m4003j(m3968O0, theme51GaugeArcView, theme51SevenSegView, m3985c0(), true, f2, fArr[0], fArr[1]);
            m4010l1(m3968O0, f2, true, fArr[0], fArr[1]);
            return;
        }
        boolean z5 = this.f7784J0;
        float f3 = (!z5 || this.f7796P0 > 0.0f) ? this.f7796P0 : 0.0f;
        float max = (!z5 || this.f7796P0 > 0.0f) ? Math.max(0.0f, 1.0f - this.f7796P0) : 1.0f;
        if (f3 <= 0.0f && Math.abs(max - 1.0f) < 0.001f) {
            m3957I0();
            m4010l1(m3968O0, 1.0f, true, 0.0f, 0.0f);
            return;
        }
        ImageView m3968O02 = m3968O0();
        if (m3968O02 != null) {
            if (m3968O02.getWidth() <= 0 || m3968O02.getHeight() <= 0) {
                m3968O02.post(new RunnableC1493M0(this, 22));
            } else {
                float[] fArr2 = {this.f7802S0 ? this.f7798Q0 : m3968O02.getLeft() + (m3968O02.getWidth() * 0.5f), this.f7802S0 ? this.f7800R0 : (m3968O02.getHeight() * 0.5f) + m3968O02.getTop()};
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float[] fArr3 = new float[2];
                m3982a0(fArr3);
                boolean z6 = cfgdata.f2636h2;
                Theme51GaugeArcView theme51GaugeArcView2 = z6 ? this.f7863r : this.f7865s;
                Theme51SevenSegView theme51SevenSegView2 = z6 ? this.f7813Y : this.f7815Z;
                float m3985c0 = m3985c0();
                float f6 = max;
                m3924H(m3968O02, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
                m4032t(theme51GaugeArcView2, m3968O02, max, f4, f5, fArr3[0], fArr3[1]);
                m3924H(theme51SevenSegView2, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, m3985c0);
                m4016n1(m3968O02, max, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
            }
        }
        m4010l1(m3968O0, max, true, 0.0f, 0.0f);
    }

    /* renamed from: x0 */
    public final void m4045x0(C0636d c0636d) {
        View view = this.f7842i0;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        if (!this.f7826d.f2585W2 || m3987d0() || m4001i0() || c0636d == null || !c0636d.m1851a()) {
            this.f7842i0.setVisibility(8);
            this.f7842i0.setAlpha(1.0f);
            m4007k1();
            m4020p(false);
            return;
        }
        this.f7842i0.setVisibility(this.f7822b1 >= 0.999f ? 4 : 0);
        if (this.f7822b1 >= 0.999f) {
            this.f7842i0.setAlpha(0.0f);
        }
        TextView textView = this.f7858o0;
        if (textView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f7860p0;
        if (textView2 != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            this.f7860p0.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f7856n0;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f7856n0.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f7856n0.setVisibility(8);
            }
        }
        this.f7870u0 = c0636d.f3002h;
        this.f7868t0 = c0636d.f3001g;
        this.f7872v0 = c0636d.f3000f;
        this.f7874w0 = SystemClock.elapsedRealtime();
        m4026r(this.f7868t0);
        m4007k1();
        m4020p(false);
    }

    /* renamed from: y */
    public final void m4046y() {
        C1504S0 c1504s0 = this.f7770C0;
        float m3962L0 = c1504s0 != null ? c1504s0.f7758c : m3962L0();
        C1504S0 c1504s02 = this.f7772D0;
        float m3015h = AbstractC1256E0.m3015h(c1504s02 != null ? c1504s02.f7758c : m3960K0());
        Theme51SevenSegView theme51SevenSegView = this.f7813Y;
        int i = -10556716;
        cfgData cfgdata = this.f7826d;
        if (theme51SevenSegView != null) {
            theme51SevenSegView.setOnColor(m3962L0 > cfgdata.f2568S1 ? -65536 : m3962L0 > cfgdata.f2564R1 ? -256 : -10556716);
            Theme51SevenSegView theme51SevenSegView2 = this.f7813Y;
            if (m3962L0 < 0.0f) {
                m3962L0 = 0.0f;
            }
            theme51SevenSegView2.setIntValue(Math.round(m3962L0));
        }
        Theme51SevenSegView theme51SevenSegView3 = this.f7815Z;
        if (theme51SevenSegView3 != null) {
            if (m3015h > cfgdata.f2576U1) {
                i = -65536;
            } else if (m3015h > cfgdata.f2572T1) {
                i = -256;
            }
            theme51SevenSegView3.setOnColor(i);
            this.f7815Z.setFixed1(m3015h);
        }
    }

    /* renamed from: y0 */
    public final void m4047y0() {
        ImageView imageView = this.f7809W;
        carData cardata = this.f7829e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f7811X != null) {
            this.f7811X.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f7811X.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
    }

    /* renamed from: z */
    public final void m4048z() {
        ViewGroup viewGroup = this.f7835g;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        if (this.f7857o == null) {
            ViewGroup viewGroup2 = this.f7835g;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(m3988d1() ? -15856632 : -15988218);
                return;
            }
            return;
        }
        C1574t m3964M0 = m3964M0();
        this.f7857o.setVisibility(0);
        this.f7857o.setLayerType(0, null);
        this.f7857o.setTranslationY(0.0f);
        this.f7857o.setBackground(null);
        if (!m3964M0.m4472a()) {
            this.f7857o.setImageDrawable(null);
            this.f7857o.setBackgroundResource(R.drawable.ip_theme_51_bg);
            return;
        }
        int i = m3964M0.f8687b;
        if (i != 0) {
            this.f7857o.setImageResource(i);
            return;
        }
        Uri uri = m3964M0.f8688c;
        if (uri != null) {
            this.f7857o.setImageURI(uri);
        }
    }

    /* renamed from: z0 */
    public final void m4049z0() {
        if (this.f7783J == null) {
            return;
        }
        cfgData cfgdata = this.f7826d;
        if (!cfgdata.f2537K2 || m3987d0() || ((!m3977Y() && !m4001i0()) || (!cfgdata.f2569S2 && !cfgdata.f2577U2 && !cfgdata.f2573T2))) {
            this.f7783J.setVisibility(8);
            m4007k1();
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = cfgdata.f2569S2;
        carData cardata = this.f7829e;
        if (z2) {
            sb.append("ODO: ");
            sb.append(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1771r())).replace(",", "."));
        }
        if (cfgdata.f2577U2) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Day: ");
            sb.append(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(",", "."));
        }
        if (cfgdata.f2573T2) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Trip: ");
            sb.append(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1767p())).replace(",", "."));
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            this.f7783J.setVisibility(8);
            m4007k1();
            return;
        }
        SpannableString spannableString = new SpannableString(sb2);
        this.f7783J.setTextColor(-10556716);
        int indexOf = sb2.indexOf("ODO:");
        if (indexOf >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(-7829368), indexOf, indexOf + 4, 0);
        }
        int indexOf2 = sb2.indexOf("Day:");
        if (indexOf2 >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(-7829368), indexOf2, indexOf2 + 4, 0);
        }
        int indexOf3 = sb2.indexOf("Trip:");
        if (indexOf3 >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(-7829368), indexOf3, indexOf3 + 5, 0);
        }
        this.f7783J.setText(spannableString, TextView.BufferType.SPANNABLE);
        this.f7783J.setVisibility(0);
        m4007k1();
    }
}
