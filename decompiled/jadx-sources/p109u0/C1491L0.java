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
import androidx.constraintlayout.widget.ConstraintLayout;
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

/* renamed from: u0.L0 */
/* loaded from: classes.dex */
public final class C1491L0 {

    /* renamed from: s1 */
    public static final int f7527s1 = Color.rgb(232, 244, 252);

    /* renamed from: t1 */
    public static final int f7528t1 = Color.rgb(74, 168, 232);

    /* renamed from: u1 */
    public static final int f7529u1 = R.drawable.ip_theme_50_media_frame;

    /* renamed from: A0 */
    public long f7531A0;

    /* renamed from: B */
    public TextView f7532B;

    /* renamed from: C */
    public TextView f7534C;

    /* renamed from: D */
    public TextView f7536D;

    /* renamed from: D0 */
    public float f7537D0;

    /* renamed from: E */
    public TextView f7538E;

    /* renamed from: E0 */
    public boolean f7539E0;

    /* renamed from: F */
    public TextView f7540F;

    /* renamed from: F0 */
    public C1531e f7541F0;

    /* renamed from: G */
    public TextView f7542G;

    /* renamed from: G0 */
    public C1572s f7543G0;

    /* renamed from: H */
    public TextView f7544H;

    /* renamed from: H0 */
    public C1572s f7545H0;

    /* renamed from: I */
    public TextView f7546I;

    /* renamed from: I0 */
    public C1572s f7547I0;

    /* renamed from: J */
    public TextView f7548J;

    /* renamed from: J0 */
    public C1572s f7549J0;

    /* renamed from: K */
    public View f7550K;

    /* renamed from: K0 */
    public boolean f7551K0;

    /* renamed from: L */
    public TextView f7552L;

    /* renamed from: L0 */
    public boolean f7553L0;

    /* renamed from: M */
    public TextView f7554M;

    /* renamed from: N */
    public TextView f7556N;

    /* renamed from: O */
    public View f7558O;

    /* renamed from: O0 */
    public ValueAnimator f7559O0;

    /* renamed from: P */
    public ViewGroup f7560P;

    /* renamed from: P0 */
    public ValueAnimator f7561P0;

    /* renamed from: Q */
    public TextView f7562Q;

    /* renamed from: Q0 */
    public boolean f7563Q0;

    /* renamed from: R */
    public TextView f7564R;

    /* renamed from: S */
    public TextView f7566S;

    /* renamed from: T */
    public ViewGroup f7568T;

    /* renamed from: U */
    public TextView f7570U;

    /* renamed from: U0 */
    public float f7571U0;

    /* renamed from: V */
    public TextView f7572V;

    /* renamed from: V0 */
    public float f7573V0;

    /* renamed from: W */
    public TextView f7574W;

    /* renamed from: W0 */
    public boolean f7575W0;

    /* renamed from: X */
    public TextView f7576X;

    /* renamed from: X0 */
    public Boolean f7577X0;

    /* renamed from: Y */
    public TextView f7578Y;

    /* renamed from: Z */
    public TextView f7580Z;

    /* renamed from: Z0 */
    public Boolean f7581Z0;

    /* renamed from: a */
    public final C1537g f7582a;

    /* renamed from: a0 */
    public ImageView f7583a0;

    /* renamed from: a1 */
    public float f7584a1;

    /* renamed from: b */
    public final View f7585b;

    /* renamed from: b0 */
    public ImageView f7586b0;

    /* renamed from: b1 */
    public float f7587b1;

    /* renamed from: c */
    public final Context f7588c;

    /* renamed from: c0 */
    public TextView f7589c0;

    /* renamed from: c1 */
    public float f7590c1;

    /* renamed from: d0 */
    public TextView f7592d0;

    /* renamed from: d1 */
    public float f7593d1;

    /* renamed from: e0 */
    public TextView f7595e0;

    /* renamed from: e1 */
    public float f7596e1;

    /* renamed from: f0 */
    public TextView f7598f0;

    /* renamed from: g */
    public ViewGroup f7600g;

    /* renamed from: g0 */
    public View f7601g0;

    /* renamed from: h */
    public View f7603h;

    /* renamed from: h0 */
    public ImageView f7604h0;

    /* renamed from: i */
    public View f7606i;

    /* renamed from: i0 */
    public TextView f7607i0;

    /* renamed from: i1 */
    public ValueAnimator f7608i1;

    /* renamed from: j */
    public View f7609j;

    /* renamed from: j0 */
    public ImageView f7610j0;

    /* renamed from: j1 */
    public boolean f7611j1;

    /* renamed from: k */
    public View f7612k;

    /* renamed from: k0 */
    public ImageView f7613k0;

    /* renamed from: l */
    public View f7615l;

    /* renamed from: l0 */
    public ImageView f7616l0;

    /* renamed from: l1 */
    public Boolean f7617l1;

    /* renamed from: m */
    public View f7618m;

    /* renamed from: m0 */
    public View f7619m0;

    /* renamed from: m1 */
    public float f7620m1;

    /* renamed from: n */
    public C1528d f7621n;

    /* renamed from: n0 */
    public View f7622n0;

    /* renamed from: o */
    public ImageView f7624o;

    /* renamed from: o0 */
    public View f7625o0;

    /* renamed from: o1 */
    public C1525c f7626o1;

    /* renamed from: p */
    public ImageView f7627p;

    /* renamed from: p0 */
    public View f7628p0;

    /* renamed from: q */
    public ImageView f7630q;

    /* renamed from: q0 */
    public int f7631q0;

    /* renamed from: r */
    public ImageView f7633r;

    /* renamed from: r0 */
    public ImageView f7634r0;

    /* renamed from: s */
    public ImageView f7636s;

    /* renamed from: s0 */
    public TextView f7637s0;

    /* renamed from: t */
    public ImageView f7638t;

    /* renamed from: t0 */
    public TextView f7639t0;

    /* renamed from: u */
    public ImageView f7640u;

    /* renamed from: u0 */
    public TextView f7641u0;

    /* renamed from: v */
    public Bitmap f7642v;

    /* renamed from: v0 */
    public TextView f7643v0;

    /* renamed from: w */
    public Bitmap f7644w;

    /* renamed from: w0 */
    public ProgressBar f7645w0;

    /* renamed from: x0 */
    public long f7647x0;

    /* renamed from: y0 */
    public long f7649y0;

    /* renamed from: z0 */
    public boolean f7651z0;

    /* renamed from: d */
    public final cfgData f7591d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f7594e = carData.getInstance();

    /* renamed from: f */
    public final Handler f7597f = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    public ImageView[] f7646x = new ImageView[0];

    /* renamed from: y */
    public ImageView[] f7648y = new ImageView[0];

    /* renamed from: z */
    public final float[] f7650z = new float[0];

    /* renamed from: A */
    public final float[] f7530A = new float[0];

    /* renamed from: B0 */
    public float f7533B0 = -1.0f;

    /* renamed from: C0 */
    public float f7535C0 = -1.0f;

    /* renamed from: M0 */
    public boolean f7555M0 = true;

    /* renamed from: N0 */
    public boolean f7557N0 = true;

    /* renamed from: R0 */
    public final RunnableC1479F0 f7565R0 = new RunnableC1479F0(this, 3);

    /* renamed from: S0 */
    public boolean f7567S0 = false;

    /* renamed from: T0 */
    public float f7569T0 = 0.0f;

    /* renamed from: Y0 */
    public int f7579Y0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: f1 */
    public float f7599f1 = 1.0f;

    /* renamed from: g1 */
    public float f7602g1 = 0.0f;

    /* renamed from: h1 */
    public float f7605h1 = 0.0f;

    /* renamed from: k1 */
    public int f7614k1 = -1;

    /* renamed from: n1 */
    public int f7623n1 = 999;

    /* renamed from: p1 */
    public final RunnableC1489K0 f7629p1 = new RunnableC1489K0(this, 0);

    /* renamed from: q1 */
    public final RunnableC1489K0 f7632q1 = new RunnableC1489K0(this, 1);

    /* renamed from: r1 */
    public final RunnableC1489K0 f7635r1 = new RunnableC1489K0(this, 2);

    public C1491L0(C1537g c1537g, View view) {
        this.f7582a = c1537g;
        this.f7585b = view;
        this.f7588c = view.getContext();
    }

    /* renamed from: A */
    public static void m3753A(View view, float f2, float f3) {
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

    /* renamed from: I */
    public static void m3754I(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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

    /* renamed from: P0 */
    public static void m3755P0(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    /* renamed from: R */
    public static ImageView[] m3756R(ImageView imageView) {
        if (imageView == null || !(imageView.getParent() instanceof ConstraintLayout)) {
            return new ImageView[0];
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) imageView.getParent();
        if (!(imageView.getLayoutParams() instanceof C1592d)) {
            return new ImageView[0];
        }
        constraintLayout.indexOfChild(imageView);
        return new ImageView[0];
    }

    /* renamed from: U0 */
    public static RectF m3757U0(RectF rectF, float f2) {
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

    /* renamed from: V0 */
    public static void m3758V0(View view, boolean z2, float f2, boolean z3) {
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

    /* renamed from: W0 */
    public static void m3759W0(View view, int i) {
        if (view == null || !(view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: X0 */
    public static void m3760X0(TextView textView, float f2, String str, int i) {
        if (textView == null) {
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, str));
        spannableString.setSpan(AbstractC0062j.m155i(textView, -7829368, i), 0, replace.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: Y */
    public static String m3761Y(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: Y0 */
    public static void m3762Y0(View view, float f2) {
        if (view != null) {
            view.setElevation(f2);
        }
    }

    /* renamed from: Z0 */
    public static void m3763Z0(View view, int i) {
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

    /* renamed from: a */
    public static void m3764a(C1491L0 c1491l0, ImageView[] imageViewArr, float[] fArr, float f2, float f3) {
        c1491l0.getClass();
        if (imageViewArr == null || imageViewArr.length == 0) {
            return;
        }
        float abs = Math.abs(f3 - f2);
        float abs2 = Math.abs(f2 - fArr[fArr.length - 1]);
        if (abs < 0.25f && abs2 < 0.25f) {
            for (int i = 0; i < fArr.length; i++) {
                fArr[i] = f3;
            }
        } else if (abs2 >= 0.25f) {
            System.arraycopy(fArr, 1, fArr, 0, fArr.length - 1);
            fArr[fArr.length - 1] = f2;
        }
        for (int i2 = 0; i2 < imageViewArr.length; i2++) {
            ImageView imageView = imageViewArr[i2];
            if (imageView != null) {
                imageView.setRotation(fArr[i2]);
                imageView.setAlpha(Math.min(1.0f, Math.abs(fArr[i2] - f3) / 2.2f) * 0.1f);
            }
        }
    }

    /* renamed from: a1 */
    public static void m3765a1(View view, float f2) {
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

    /* renamed from: b1 */
    public static void m3766b1(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(-1);
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: c1 */
    public static void m3767c1(TextView textView, float f2, float f3) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, f2 * f3);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(0.0f, 1.0f);
    }

    /* renamed from: d1 */
    public static void m3768d1(View view, int i) {
        if (view != null) {
            view.setLayoutDirection(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3769f(View view, float f2) {
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

    /* renamed from: f0 */
    public static void m3770f0(ImageView imageView, float f2, boolean z2, float[] fArr, float[] fArr2) {
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

    /* renamed from: h1 */
    public static void m3771h1(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: i1 */
    public static void m3772i1(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: j1 */
    public static void m3773j1(ImageView imageView, C1572s c1572s) {
        if (imageView == null || c1572s == null) {
            return;
        }
        imageView.post(new RunnableC1559n0(imageView, 12, c1572s));
    }

    /* renamed from: l */
    public static void m3774l(ImageView imageView, boolean z2) {
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
    public final void m3775A0(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f7591d;
        if (cfgdata.f2537K2 && cfgdata.f2589X2) {
            boolean m3821a0 = m3821a0();
            carData cardata = this.f7594e;
            if (m3821a0 || AbstractC1539g1.m4194P(cfgdata, cardata)) {
                byte b2 = (byte) (i & 15);
                byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
                EnumC1457c enumC1457c = cfgdata.f2543M0;
                if (!AbstractC1539g1.m4194P(cfgdata, cardata) && (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite)) {
                    b3 = 1;
                    b2 = 1;
                }
                if (b2 == 1) {
                    ImageView imageView2 = this.f7604h0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView2 = this.f7607i0;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                    }
                } else if (b2 == 2) {
                    ImageView imageView3 = this.f7604h0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        this.f7604h0.setColorFilter(-7829368);
                    }
                    TextView textView3 = this.f7607i0;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    ImageView imageView4 = this.f7604h0;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        this.f7604h0.setColorFilter(-16711936);
                    }
                    TextView textView4 = this.f7607i0;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
                if (cardata.m1747f() < 20 && (textView = this.f7607i0) != null) {
                    textView.setVisibility(4);
                }
                if (b3 == 1) {
                    ImageView imageView5 = this.f7610j0;
                    if (imageView5 != null) {
                        imageView5.setVisibility(4);
                    }
                } else if (b3 == 2) {
                    ImageView imageView6 = this.f7610j0;
                    if (imageView6 != null) {
                        imageView6.setVisibility(0);
                        this.f7610j0.setColorFilter(-7829368);
                    }
                } else if (b3 == 3 && (imageView = this.f7610j0) != null) {
                    imageView.setVisibility(0);
                    this.f7610j0.setColorFilter(-16711936);
                }
                m3887z1();
                m3800L();
                return;
            }
        }
        m3819X();
    }

    /* renamed from: A1 */
    public final void m3776A1() {
        float f2;
        float f3;
        if (this.f7600g == null || this.f7626o1 == null || !m3779B1()) {
            ViewGroup viewGroup = this.f7600g;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
                return;
            }
            return;
        }
        if (this.f7600g.getWidth() <= 0 || this.f7600g.getHeight() <= 0) {
            this.f7600g.post(new RunnableC1479F0(this, 18));
            return;
        }
        float f4 = this.f7588c.getResources().getDisplayMetrics().density;
        float f5 = 14.0f * f4;
        float f6 = f4 * 1.0f;
        if (m3843k1()) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f2 = f6;
            f3 = f5;
        }
        this.f7626o1.m4160b();
        if (!this.f7626o1.m4161c()) {
            this.f7626o1.m4162d(m3843k1() ? -15985376 : -16777216);
        }
        if (m3843k1()) {
            ViewGroup viewGroup2 = this.f7600g;
            if (viewGroup2 != null) {
                viewGroup2.getOverlay().clear();
            }
            RectF m3865s0 = m3865s0();
            if (m3865s0.width() > 0.0f && m3865s0.height() > 0.0f) {
                this.f7626o1.m4159a(m3865s0.left, m3865s0.top, m3865s0.right, m3865s0.bottom, f3, f2);
            }
        } else if (m3785D1() || m3845l1()) {
            RectF m3806O = m3806O();
            if (m3785D1() && !m3845l1()) {
                m3806O = m3757U0(m3806O, this.f7602g1);
            }
            if (m3806O.width() <= 0.0f || m3806O.height() <= 0.0f) {
                ViewGroup viewGroup3 = this.f7600g;
                if (viewGroup3 != null) {
                    viewGroup3.getOverlay().clear();
                }
            } else {
                this.f7626o1.m4159a(m3806O.left, m3806O.top, m3806O.right, m3806O.bottom, f5, 0.0f);
                ViewGroup viewGroup4 = this.f7600g;
                if (viewGroup4 != null) {
                    viewGroup4.getOverlay().clear();
                }
            }
        } else {
            ViewGroup viewGroup5 = this.f7600g;
            if (viewGroup5 != null) {
                viewGroup5.getOverlay().clear();
            }
        }
        if (m3848m1()) {
            RectF m3757U0 = m3757U0(m3874v0(), this.f7569T0);
            if (m3757U0.width() > 0.0f && m3757U0.height() > 0.0f) {
                this.f7626o1.m4159a(m3757U0.left, m3757U0.top, m3757U0.right, m3757U0.bottom, f5, 0.0f);
            }
        }
        ImageView imageView = this.f7624o;
        if (imageView != null && imageView.getBackground() == this.f7626o1) {
            this.f7624o.invalidate();
        } else if (this.f7600g.getBackground() == this.f7626o1) {
            this.f7600g.invalidate();
        }
    }

    /* renamed from: B */
    public final void m3777B(float f2) {
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, f2));
        if (m3844l0()) {
            max = 1.0f;
        }
        m3765a1(this.f7619m0, max);
        m3765a1(this.f7550K, max);
        float max2 = Math.max(0.0f, Math.min(1.0f, this.f7605h1));
        if (max2 > 0.001f) {
            m3834g1(this.f7558O, max2);
            m3834g1(this.f7568T, max2);
        } else {
            m3765a1(this.f7558O, max);
            m3765a1(this.f7568T, max);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0024, code lost:
    
        if (r12 == 2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3778B0(int i) {
        Bitmap bitmap;
        int i2;
        ImageView imageView = this.f7627p;
        if (imageView == null || this.f7630q == null || (bitmap = this.f7642v) == null || this.f7644w == null) {
            return;
        }
        cfgData cfgdata = this.f7591d;
        if (cfgdata.f2641i2 && cfgdata.f2615d1.f7096F) {
            i2 = i == 1 ? 1 : 2;
            if (i2 != this.f7579Y0) {
                return;
            }
            this.f7579Y0 = i2;
            if (i2 == 0) {
                imageView.setImageBitmap(bitmap);
                this.f7630q.setImageBitmap(this.f7644w);
                return;
            } else {
                int i3 = i2 == 1 ? -65536 : f7528t1;
                EnumC1456b enumC1456b = cfgdata.f2615d1;
                AbstractC1261H.m3037b(this.f7588c, imageView, bitmap, "themes/50/theme_50_spd.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                AbstractC1261H.m3037b(this.f7588c, this.f7630q, this.f7644w, "themes/50/theme_50_rpm.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                return;
            }
        }
        i2 = 0;
        if (i2 != this.f7579Y0) {
        }
    }

    /* renamed from: B1 */
    public final boolean m3779B1() {
        return this.f7591d.f2537K2 && (m3848m1() || m3847m0() || m3844l0() || m3785D1());
    }

    /* renamed from: C */
    public final void m3780C() {
        if (this.f7599f1 < 0.999f) {
            return;
        }
        m3856p0();
        m3859q0();
        m3820Z(this.f7599f1);
        m3813S0();
        m3815T0();
        m3820Z(this.f7599f1);
        m3853o0();
    }

    /* renamed from: C0 */
    public final void m3781C0() {
        TextView textView = this.f7576X;
        if (textView == null) {
            return;
        }
        if (!this.f7591d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f7594e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f7576X.setVisibility(4);
            return;
        }
        this.f7576X.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f7576X, -7829368, -1), 0, replace.length(), 33);
        this.f7576X.setText(spannableString);
    }

    /* renamed from: C1 */
    public final boolean m3782C1() {
        return m3844l0() || m3847m0() || m3850n0() || this.f7591d.f2635h1 == 2;
    }

    /* renamed from: D */
    public final void m3783D() {
        boolean m3785D1 = m3785D1();
        Boolean bool = this.f7617l1;
        if (bool == null || bool.booleanValue() != m3785D1) {
            this.f7617l1 = Boolean.valueOf(m3785D1);
            m3883y0();
        }
        if (m3785D1 && m3779B1()) {
            m3867t();
            m3776A1();
        } else if (!m3847m0() && !m3844l0() && !m3848m1()) {
            m3818W();
        }
        float m4297a = m3785D1 ? AbstractC1561o.m4297a(1.0f, this.f7605h1, 0.0f, this.f7602g1) : 0.0f;
        if (m3844l0() || m3833g0()) {
            m3771h1(this.f7612k);
            m3771h1(this.f7615l);
            m3771h1(this.f7618m);
        } else {
            float f2 = this.f7588c.getResources().getDisplayMetrics().density;
            float f3 = (80.0f * f2) + 10.0f;
            float f4 = f2 * 14.0f;
            boolean z2 = (!m3785D1() || m3845l1() || m3844l0()) ? false : true;
            float f5 = z2 ? 0.0f : f4;
            m3769f(this.f7612k, f3);
            m3769f(this.f7618m, f3);
            View view = this.f7615l;
            if (view != null) {
                m3769f(view, f5 + 25.0f + 10.0f);
                C1528d c1528d = this.f7621n;
                if (c1528d != null) {
                    c1528d.m4167b(f5);
                }
            }
            m3753A(this.f7612k, m4297a, f3);
            m3753A(this.f7615l, m4297a, f5 + 25.0f + 10.0f);
            m3753A(this.f7618m, m4297a, f3);
            float max = z2 ? Math.max(14.0f, (f3 - 10.0f) - 25.0f) : 14.0f;
            m3758V0(this.f7612k, true, max, z2);
            m3758V0(this.f7618m, false, max, z2);
        }
        if (m3785D1) {
            View view2 = this.f7612k;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.f7615l;
            if (view3 != null) {
                view3.bringToFront();
            }
            View view4 = this.f7618m;
            if (view4 != null) {
                view4.bringToFront();
            }
        }
        View view5 = this.f7622n0;
        if (view5 != null) {
            view5.bringToFront();
        }
        View view6 = this.f7619m0;
        if (view6 != null && view6.getVisibility() == 0) {
            this.f7619m0.bringToFront();
            View view7 = this.f7622n0;
            if (view7 != null) {
                view7.bringToFront();
            }
        }
        View view8 = this.f7550K;
        if (view8 != null && view8.getVisibility() == 0) {
            this.f7550K.bringToFront();
        }
        m3858q(false);
        m3780C();
        m3836h0();
        if (m3821a0()) {
            ImageView m3856p0 = m3856p0();
            cfgData cfgdata = this.f7591d;
            boolean z3 = cfgdata.f2636h2;
            m3841k(m3856p0, z3 ? this.f7636s : this.f7633r, z3 ? this.f7592d0 : this.f7589c0, m3859q0(), false, this.f7599f1, 0.0f, 0.0f);
            m3866s1(m3856p0(), this.f7599f1, false, 0.0f, 0.0f);
            if (m3848m1()) {
                m3882y();
            } else {
                ImageView m3813S0 = m3813S0();
                boolean z4 = cfgdata.f2636h2;
                m3841k(m3813S0, z4 ? this.f7633r : this.f7636s, z4 ? this.f7589c0 : this.f7592d0, m3815T0(), true, this.f7599f1, 0.0f, 0.0f);
                m3866s1(m3813S0(), this.f7599f1, true, 0.0f, 0.0f);
            }
            m3879x();
        }
    }

    /* renamed from: D0 */
    public final void m3784D0(C0636d c0636d) {
        View view = this.f7619m0;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        if (!this.f7591d.f2585W2 || m3833g0() || m3844l0() || c0636d == null || !c0636d.m1851a()) {
            this.f7619m0.setVisibility(8);
            this.f7619m0.setAlpha(1.0f);
            m3863r1();
            m3858q(false);
            return;
        }
        this.f7619m0.setVisibility(this.f7605h1 >= 0.999f ? 4 : 0);
        if (this.f7605h1 >= 0.999f) {
            this.f7619m0.setAlpha(0.0f);
        }
        TextView textView = this.f7637s0;
        if (textView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f7639t0;
        if (textView2 != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            this.f7639t0.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f7634r0;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f7634r0.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f7634r0.setVisibility(8);
            }
        }
        this.f7649y0 = c0636d.f3002h;
        this.f7647x0 = c0636d.f3001g;
        this.f7651z0 = c0636d.f3000f;
        this.f7531A0 = SystemClock.elapsedRealtime();
        m3864s(this.f7647x0);
        m3863r1();
        m3858q(false);
    }

    /* renamed from: D1 */
    public final boolean m3785D1() {
        return m3850n0() || this.f7591d.f2635h1 == 2 || this.f7602g1 > 0.001f || this.f7605h1 > 0.001f || this.f7599f1 < 0.999f;
    }

    /* renamed from: E */
    public final void m3786E() {
        View view = this.f7606i;
        if (view == null) {
            return;
        }
        cfgData cfgdata = this.f7591d;
        boolean z2 = cfgdata.f2625f1 != EnumC1455a.f6981n;
        boolean z3 = view.getVisibility() == 0;
        this.f7606i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            AbstractC1539g1.m4215f(R.drawable.ip_theme_50_top_bar, this.f7606i, AbstractC1539g1.m4230m0(cfgdata, this.f7594e));
            AbstractC1539g1.m4221i(this.f7578Y, this.f7580Z, cfgdata, m3821a0());
        }
        if (z3 == z2 || !m3840j0()) {
            return;
        }
        m3867t();
        m3776A1();
    }

    /* renamed from: E0 */
    public final void m3787E0() {
        ImageView imageView = this.f7583a0;
        carData cardata = this.f7594e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f7586b0 != null) {
            this.f7586b0.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f7586b0.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
    }

    /* renamed from: E1 */
    public final boolean m3788E1() {
        cfgData cfgdata = this.f7591d;
        int i = cfgdata.f2635h1;
        if (i == 0) {
            return true;
        }
        return i == 2 && AbstractC1539g1.m4194P(cfgdata, this.f7594e);
    }

    /* renamed from: F */
    public final void m3789F(ImageView imageView) {
        ImageView[] m3884y1 = m3884y1(imageView);
        if (m3884y1 == null || imageView == null) {
            return;
        }
        float pivotX = imageView.getPivotX();
        float pivotY = imageView.getPivotY();
        float scaleX = imageView.getScaleX();
        float scaleY = imageView.getScaleY();
        float translationX = imageView.getTranslationX();
        float translationY = imageView.getTranslationY();
        for (ImageView imageView2 : m3884y1) {
            if (imageView2 != null) {
                if (imageView2.getWidth() > 0) {
                    imageView2.setPivotY(AbstractC0062j.m153g(imageView2.getWidth(), 0.5f, imageView2) * 0.5f);
                } else {
                    imageView2.setPivotX(pivotX);
                    imageView2.setPivotY(pivotY);
                }
                imageView2.setScaleX(scaleX);
                imageView2.setScaleY(scaleY);
                imageView2.setTranslationX(translationX);
                imageView2.setTranslationY(translationY);
            }
        }
    }

    /* renamed from: F0 */
    public final void m3790F0() {
        if (this.f7556N == null) {
            return;
        }
        cfgData cfgdata = this.f7591d;
        if (!cfgdata.f2537K2 || m3833g0() || ((!m3821a0() && !m3844l0()) || (!cfgdata.f2569S2 && !cfgdata.f2577U2 && !cfgdata.f2573T2))) {
            this.f7556N.setVisibility(8);
            m3863r1();
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = cfgdata.f2569S2;
        carData cardata = this.f7594e;
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
            this.f7556N.setVisibility(8);
            m3863r1();
            return;
        }
        SpannableString spannableString = new SpannableString(sb2);
        this.f7556N.setTextColor(-1);
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
        this.f7556N.setText(spannableString, TextView.BufferType.SPANNABLE);
        this.f7556N.setVisibility(0);
        m3863r1();
    }

    /* renamed from: G */
    public final void m3791G(TextView textView) {
        if (textView == null) {
            return;
        }
        if (Math.abs(0.0f) < 0.001f) {
            m3755P0(textView, 0.0f, 0.0f);
        } else if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.post(new RunnableC1559n0(this, 9, textView));
        } else {
            m3754I(textView, 1.0f, textView.getLeft(), textView.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: G0 */
    public final void m3792G0() {
        if (this.f7580Z == null) {
            return;
        }
        float m1773s = this.f7594e.m1773s();
        if (m1773s < -90.0f) {
            this.f7580Z.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        this.f7580Z.setTextColor(-7829368);
        spannableString.setSpan(new ForegroundColorSpan(f7527s1), 0, replace.length(), 33);
        this.f7580Z.setText(spannableString);
    }

    /* renamed from: H */
    public final void m3793H() {
        boolean z2 = this.f7591d.f2537K2 && m3844l0() && !m3821a0();
        m3772i1(this.f7601g0, z2);
        m3772i1(this.f7595e0, z2);
        m3772i1(this.f7598f0, z2);
        m3791G(this.f7595e0);
        m3791G(this.f7598f0);
    }

    /* renamed from: H0 */
    public final void m3794H0() {
        cfgData cfgdata = this.f7591d;
        if (cfgdata.f2537K2 && m3844l0() && !m3821a0()) {
            float m3829e0 = m3829e0();
            float m3827d0 = m3827d0();
            TextView textView = this.f7595e0;
            int i = -1;
            if (textView != null) {
                textView.setTextColor(m3829e0 > cfgdata.f2568S1 ? -65536 : m3829e0 > cfgdata.f2564R1 ? -256 : -1);
                this.f7595e0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m3829e0)).replace(",", "."));
            }
            TextView textView2 = this.f7598f0;
            if (textView2 != null) {
                if (m3827d0 > cfgdata.f2576U1) {
                    i = -65536;
                } else if (m3827d0 > cfgdata.f2572T1) {
                    i = -256;
                }
                textView2.setTextColor(i);
                this.f7598f0.setText(AbstractC1256E0.m2986A(m3827d0));
            }
        }
    }

    /* renamed from: I0 */
    public final void m3795I0() {
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup == null || this.f7563Q0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7600g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7600g.post(new RunnableC1479F0(this, 8));
            return;
        }
        int round = Math.round(this.f7588c.getResources().getDisplayMetrics().density * 96.0f);
        float m3878w1 = m3878w1();
        m3777B(m3878w1);
        m3873v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f7605h1, 0.0f, m3878w1()));
        m3839j(width, height, round, m3878w1);
    }

    /* renamed from: J */
    public final void m3796J() {
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f7555M0);
        cfgData cfgdata = this.f7591d;
        if (!cfgdata.f2537K2) {
            m3805N0();
            this.f7600g.setVisibility(4);
            m3809Q();
            m3786E();
            m3819X();
            m3835h();
            View view = this.f7603h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        boolean m3821a0 = m3821a0();
        carData cardata = this.f7594e;
        if (m3821a0) {
            this.f7600g.setVisibility(0);
            boolean m3847m0 = m3847m0();
            Boolean bool = this.f7577X0;
            if (bool == null || bool.booleanValue() != m3847m0) {
                this.f7577X0 = Boolean.valueOf(m3847m0);
            }
            m3883y0();
            m3832g();
            m3775A0(cardata.m1745e());
            m3876w();
            m3793H();
            m3835h();
            View view2 = this.f7603h;
            if (view2 != null) {
                view2.setVisibility(m3779B1() ? 4 : 8);
            }
            if (m3779B1()) {
                m3867t();
                m3776A1();
                return;
            }
            return;
        }
        m3805N0();
        this.f7600g.setVisibility(0);
        if (m3833g0()) {
            m3809Q();
            View view3 = this.f7603h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else if (cfgdata.f2561Q2) {
            m3883y0();
            View view4 = this.f7603h;
            if (view4 != null) {
                view4.setVisibility(4);
            }
            if (m3779B1()) {
                m3867t();
                m3776A1();
            }
        } else {
            if (m3844l0()) {
                m3883y0();
                if (m3779B1()) {
                    m3776A1();
                }
            } else {
                m3809Q();
            }
            View view5 = this.f7603h;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        m3772i1(this.f7627p, false);
        m3772i1(this.f7630q, false);
        m3772i1(this.f7633r, false);
        m3772i1(this.f7636s, false);
        m3831f1(this.f7633r, false);
        m3831f1(this.f7636s, false);
        m3772i1(this.f7638t, false);
        m3772i1(this.f7640u, false);
        m3772i1(this.f7589c0, false);
        m3772i1(this.f7592d0, false);
        m3772i1(this.f7552L, false);
        m3772i1(this.f7554M, false);
        m3772i1(this.f7572V, false);
        m3772i1(this.f7574W, false);
        if (m3821a0() || AbstractC1539g1.m4194P(cfgdata, cardata)) {
            m3887z1();
        } else {
            m3819X();
        }
        if (!m3844l0()) {
            m3772i1(this.f7556N, false);
            m3772i1(this.f7568T, false);
            m3863r1();
        }
        m3807O0();
        m3801L0();
        m3832g();
        m3775A0(cardata.m1745e());
        m3793H();
        m3794H0();
        m3835h();
        m3784D0(C0639g.m1872x().m1880u());
        m3858q(false);
        m3780C();
        m3836h0();
        m3786E();
    }

    /* renamed from: J0 */
    public final float m3797J0(float f2) {
        float f3 = this.f7590c1;
        return f2 >= 0.999f ? f3 - (-21.0f) : f3;
    }

    /* renamed from: K */
    public final void m3798K() {
        final RunnableC1479F0 runnableC1479F0 = new RunnableC1479F0(this, 23);
        final int i = 10;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        };
        carData cardata = this.f7594e;
        C1537g c1537g = this.f7582a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 11;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i3 = 12;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i4 = 13;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i5 = 14;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i6 = 15;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i7 = 16;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i8 = 17;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i9 = 18;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i10 = 0;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i12 = 2;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i13 = 3;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i14 = 4;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i15 = 5;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i16 = 6;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i17 = 7;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i18 = 8;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i19 = 9;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.G0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1479F0.run();
                        break;
                    case 1:
                        runnableC1479F0.run();
                        break;
                    case 2:
                        runnableC1479F0.run();
                        break;
                    case 3:
                        runnableC1479F0.run();
                        break;
                    case 4:
                        runnableC1479F0.run();
                        break;
                    case 5:
                        runnableC1479F0.run();
                        break;
                    case 6:
                        runnableC1479F0.run();
                        break;
                    case 7:
                        runnableC1479F0.run();
                        break;
                    case 8:
                        runnableC1479F0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1479F0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1479F0.run();
                        break;
                    case 13:
                        runnableC1479F0.run();
                        break;
                    case 14:
                        runnableC1479F0.run();
                        break;
                    case 15:
                        runnableC1479F0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1479F0.run();
                        break;
                    case 17:
                        runnableC1479F0.run();
                        break;
                    default:
                        runnableC1479F0.run();
                        break;
                }
            }
        });
        final int i20 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i21 = cfgdata4.f2635h1;
                                                    if (i21 >= 0 && i21 <= 2) {
                                                        r4 = i21;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f7588c);
        final int i26 = 6;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 8;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 9;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 10;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 11;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 12;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 13;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 14;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 15;
        cardata.m1756j0(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i36 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.H0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7437b;

            {
                this.f7437b = this;
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
                        this.f7437b.m3792G0();
                        break;
                    case 1:
                        this.f7437b.m3787E0();
                        break;
                    case 2:
                        this.f7437b.m3787E0();
                        break;
                    case 3:
                        this.f7437b.m3787E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1491L0 c1491l0 = this.f7437b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1491l0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1491l0.f7623n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1491l0.f7588c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1491l0.f7591d;
                            if (cfgdata.f2537K2) {
                                c1491l0.f7620m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1491l0.f7623n1 == -1 && intValue > -1) {
                            c1491l0.f7620m1 = 0.0f;
                            ViewGroup viewGroup = c1491l0.f7600g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1491l0.f7600g.setAlpha(1.0f);
                            }
                            c1491l0.m3857p1("ip");
                        }
                        c1491l0.f7623n1 = intValue;
                        c1491l0.m3781C0();
                        break;
                    case 5:
                        this.f7437b.m3781C0();
                        break;
                    case 6:
                        C1491L0 c1491l02 = this.f7437b;
                        Integer num2 = (Integer) obj;
                        c1491l02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1491l02.f7588c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1491l02.f7591d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1491l02.f7567S0 || !c1491l02.m3848m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1491l02.f7591d, c1491l02.f7594e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1491l02.f7591d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1491l02.f7588c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1491l02.m3857p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1491l02.f7594e)) {
                                                                        cfgData cfgdata3 = c1491l02.f7591d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1491l02.f7594e.m1760l0(z2);
                                                                        c1491l02.f7591d.m1795o(c1491l02.f7588c);
                                                                        Context context2 = c1491l02.f7588c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1491l02.f7591d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1491l02.f7591d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1491l02.f7588c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1491l02.m3857p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F02 = c1491l02.f7565R0;
                                                                    handler.removeCallbacks(runnableC1479F02);
                                                                    handler.postDelayed(runnableC1479F02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1491l02.m3848m1()) {
                                                                    c1491l02.f7567S0 = true;
                                                                    if (c1491l02.m3842k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1491l02.f7557N0 && ((valueAnimator = c1491l02.f7559O0) == null || !valueAnimator.isRunning())) {
                                                                            c1491l02.m3881x1(true);
                                                                        }
                                                                        Handler handler2 = c1491l02.f7597f;
                                                                        RunnableC1479F0 runnableC1479F03 = c1491l02.f7565R0;
                                                                        handler2.removeCallbacks(runnableC1479F03);
                                                                        handler2.postDelayed(runnableC1479F03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1491l02.f7567S0) {
                                                                    Handler handler3 = c1491l02.f7597f;
                                                                    RunnableC1479F0 runnableC1479F04 = c1491l02.f7565R0;
                                                                    handler3.removeCallbacks(runnableC1479F04);
                                                                    handler3.postDelayed(runnableC1479F04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1491l02.f7563Q0) {
                                                        ValueAnimator valueAnimator2 = c1491l02.f7608i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1491l02.f7555M0;
                                                            if (!z3 || !c1491l02.m3850n0()) {
                                                                boolean z4 = !c1491l02.f7555M0;
                                                                c1491l02.f7555M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1491l02.m3822b(z3);
                                                                break;
                                                            } else {
                                                                c1491l02.f7614k1 = 0;
                                                                RunnableC1479F0 runnableC1479F05 = new RunnableC1479F0(c1491l02, 19);
                                                                if (!c1491l02.m3850n0() && Math.abs(c1491l02.f7599f1 - 1.0f) < 0.001f) {
                                                                    runnableC1479F05.run();
                                                                    break;
                                                                } else {
                                                                    c1491l02.f7611j1 = true;
                                                                    c1491l02.m3824c(runnableC1479F05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1491l02.f7591d.f2672o3) {
                                                        Context context3 = c1491l02.f7588c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1491l02.m3857p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1491l02.m3857p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1491l02.f7594e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1491l02.f7588c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1491l02.f7591d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1491l02.f7588c, m3282M[0], m3282M[1], 0.7019608f, c1491l02.f7591d.f2657l3);
                                                }
                                                c1491l02.f7539E0 = AbstractC1372y1.f6437g;
                                                c1491l02.m3858q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1491l02.m3842k0()) {
                                            ValueAnimator valueAnimator3 = c1491l02.f7559O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1491l02.f7567S0 = false;
                                                c1491l02.m3881x1(c1491l02.f7557N0);
                                                break;
                                            }
                                        }
                                    } else if (c1491l02.f7591d.f2561Q2 && !c1491l02.f7563Q0) {
                                        ValueAnimator valueAnimator4 = c1491l02.f7608i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1491l02.f7591d;
                                            if (cfgdata4.f2561Q2 && !c1491l02.m3844l0()) {
                                                if (c1491l02.m3847m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1491l02.f7588c);
                                                c1491l02.m3824c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1491l02.f7588c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1491L0 c1491l03 = this.f7437b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1491l03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1491l03.m3778B0(intValue2);
                        break;
                    case 8:
                        C1491L0 c1491l04 = this.f7437b;
                        c1491l04.m3814T();
                        c1491l04.m3796J();
                        c1491l04.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1491L0 c1491l05 = this.f7437b;
                        c1491l05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1491l05.m3805N0();
                        }
                        c1491l05.m3814T();
                        c1491l05.m3796J();
                        c1491l05.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1491L0 c1491l06 = this.f7437b;
                        c1491l06.m3796J();
                        c1491l06.m3784D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1491L0 c1491l07 = this.f7437b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1491l07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1491l07.m3775A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1491L0 c1491l08 = this.f7437b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1491l08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1491l08.f7607i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1491l08.m3775A0(c1491l08.f7594e.m1745e());
                        break;
                    case 13:
                        C1491L0 c1491l09 = this.f7437b;
                        AbstractC1539g1.m4225k(c1491l09.f7588c);
                        c1491l09.m3814T();
                        c1491l09.m3796J();
                        break;
                    case 14:
                        C1491L0 c1491l010 = this.f7437b;
                        c1491l010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1491l010.f7555M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1491l010.f7555M0;
                        Context context4 = c1491l010.f7588c;
                        if (!z5) {
                            c1491l010.f7614k1 = -1;
                            cfgData cfgdata5 = c1491l010.f7591d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1491l010.f7608i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1491l010.f7608i1 = null;
                            }
                            c1491l010.f7599f1 = c1491l010.m3875v1();
                            c1491l010.f7602g1 = 1.0f;
                            c1491l010.f7605h1 = 0.0f;
                            c1491l010.m3783D();
                        }
                        c1491l010.m3796J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1491l010.f7555M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1491L0 c1491l011 = this.f7437b;
                        if (bool == null) {
                            c1491l011.getClass();
                            break;
                        } else {
                            c1491l011.m3846m(false);
                            break;
                        }
                    default:
                        this.f7437b.m3784D0((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: K0 */
    public final void m3799K0(ImageView imageView) {
        View[] m3823b0 = m3823b0(imageView);
        int length = m3823b0.length;
        for (int i = 0; i < length; i++) {
            View view = m3823b0[i];
            m3755P0(view, view == this.f7554M ? m3797J0(this.f7599f1) : m3868t0(view), m3871u0(view));
        }
    }

    /* renamed from: L */
    public final void m3800L() {
        if (this.f7600g == null) {
            return;
        }
        TextView textView = this.f7607i0;
        if (textView != null) {
            textView.bringToFront();
        }
        ImageView imageView = this.f7604h0;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.f7610j0;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        this.f7600g.invalidate();
    }

    /* renamed from: L0 */
    public final void m3801L0() {
        ImageView m3856p0 = m3856p0();
        boolean z2 = this.f7591d.f2636h2;
        ImageView imageView = z2 ? this.f7636s : this.f7633r;
        TextView textView = z2 ? this.f7592d0 : this.f7589c0;
        m3755P0(m3856p0, 0.0f, 0.0f);
        m3803M0(imageView);
        m3755P0(textView, 0.0f, m3859q0());
        m3799K0(m3856p0);
    }

    /* renamed from: M */
    public final void m3802M() {
        ValueAnimator valueAnimator = this.f7559O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7559O0 = null;
        }
    }

    /* renamed from: M0 */
    public final void m3803M0(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        m3755P0(imageView, 0.0f, 0.0f);
        if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        }
        ImageView imageView2 = this.f7633r;
        if (imageView == imageView2 || imageView == this.f7636s) {
            C1572s c1572s = imageView == imageView2 ? this.f7543G0 : this.f7545H0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m3789F(imageView);
        }
    }

    /* renamed from: N */
    public final void m3804N() {
        ImageView m3813S0 = m3813S0();
        if (m3813S0 == null) {
            this.f7575W0 = false;
            return;
        }
        RunnableC1559n0 runnableC1559n0 = new RunnableC1559n0(this, m3813S0, 10);
        if (m3813S0.getWidth() <= 0 || m3813S0.getHeight() <= 0) {
            m3813S0.post(runnableC1559n0);
        } else {
            runnableC1559n0.run();
        }
    }

    /* renamed from: N0 */
    public final void m3805N0() {
        this.f7597f.removeCallbacks(this.f7565R0);
        m3802M();
        this.f7557N0 = true;
        this.f7569T0 = 0.0f;
        this.f7575W0 = false;
        AbstractC1372y1.m3287R(false, false);
    }

    /* renamed from: O */
    public final RectF m3806O() {
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7600g.getHeight() <= 0) {
            return new RectF();
        }
        int width = this.f7600g.getWidth();
        int height = this.f7600g.getHeight();
        float f2 = height - 25.0f;
        if (!m3785D1() && !m3845l1()) {
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
        RectF m4206a02 = AbstractC1539g1.m4206a0(new Rect(m4238t.left + 17, 99, m4238t.right - 17, round), width, height);
        if (m4206a02.width() > 0.0f && m4206a02.height() > 0.0f) {
            m4206a02.set(m4206a02.left, m4206a02.top, m4206a02.right, f2);
        }
        return m4206a02;
    }

    /* renamed from: O0 */
    public final void m3807O0() {
        ImageView m3813S0 = m3813S0();
        boolean z2 = this.f7591d.f2636h2;
        ImageView imageView = z2 ? this.f7633r : this.f7636s;
        TextView textView = z2 ? this.f7589c0 : this.f7592d0;
        m3755P0(m3813S0, 0.0f, 0.0f);
        m3803M0(imageView);
        m3755P0(textView, 0.0f, m3815T0());
        m3799K0(m3813S0);
    }

    /* renamed from: P */
    public final void m3808P(ImageView imageView, ImageView imageView2, TextView textView, float f2) {
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        ImageView imageView3 = null;
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            imageView2.setRotation(0.0f);
            m3789F(imageView2);
            C1572s c1572s = imageView2 == this.f7633r ? this.f7543G0 : imageView2 == this.f7636s ? this.f7545H0 : null;
            if (c1572s != null) {
                c1572s.m4470a(imageView2);
                ImageView[] m3884y1 = m3884y1(imageView2);
                if (m3884y1 != null) {
                    float f3 = c1572s.f8682h;
                    for (ImageView imageView4 : m3884y1) {
                        if (imageView4 != null) {
                            imageView4.setRotation(f3);
                        }
                    }
                }
            }
        }
        if (imageView == this.f7627p) {
            imageView3 = this.f7638t;
        } else if (imageView == this.f7630q) {
            imageView3 = this.f7640u;
        }
        if (imageView3 != null) {
            imageView3.setTranslationX(0.0f);
            imageView3.setTranslationY(0.0f);
            imageView3.setRotation(0.0f);
        }
        if (textView != null) {
            textView.setTranslationX(0.0f);
            textView.setTranslationY(f2);
        }
        View[] m3823b0 = m3823b0(imageView);
        int length = m3823b0.length;
        for (int i = 0; i < length; i++) {
            View view = m3823b0[i];
            if (view != null) {
                view.setTranslationX(view == this.f7554M ? m3797J0(this.f7599f1) : m3868t0(view));
                view.setTranslationY(m3871u0(view));
            }
        }
    }

    /* renamed from: Q */
    public final void m3809Q() {
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f7600g;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(android.R.color.transparent);
        }
        m3838i0();
        ViewGroup viewGroup3 = this.f7600g;
        if (viewGroup3 != null) {
            viewGroup3.getOverlay().clear();
        }
        C1525c c1525c = this.f7626o1;
        if (c1525c != null) {
            c1525c.m4163e(null);
        }
    }

    /* renamed from: Q0 */
    public final C1574t m3810Q0() {
        int i;
        cfgData cfgdata = this.f7591d;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        if (enumC1455a == EnumC1455a.f6949f) {
            return new C1574t(0, null, 5);
        }
        int i2 = cfgdata.f2630g1;
        if (i2 < 31) {
            int i3 = enumC1455a.f7036d;
            return i3 != 0 ? new C1574t(i3, null, 5) : new C1574t(0, null, 5);
        }
        String[] strArr = cfgdata.f2603b;
        if (strArr != null && i2 >= 31 && (i = i2 - 31) >= 0 && i < strArr.length) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata.f2603b[i]);
            if (file.exists()) {
                return new C1574t(0, Uri.fromFile(file), 5);
            }
        }
        return new C1574t(0, null, 5);
    }

    /* renamed from: R0 */
    public final void m3811R0() {
        ViewGroup viewGroup;
        if (!this.f7553L0) {
            m3798K();
            this.f7553L0 = true;
        }
        C1531e c1531e = this.f7541F0;
        if (c1531e != null) {
            c1531e.m4170a();
        }
        boolean z2 = this.f7591d.f2561Q2;
        this.f7555M0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m3869t1();
        ValueAnimator valueAnimator = this.f7561P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7561P0 = null;
        }
        this.f7563Q0 = false;
        ImageView imageView = this.f7624o;
        if (imageView != null) {
            imageView.setTranslationY(0.0f);
        }
        m3802M();
        this.f7557N0 = true;
        this.f7569T0 = 0.0f;
        this.f7575W0 = false;
        this.f7577X0 = Boolean.valueOf(m3847m0());
        m3877w0();
        m3846m(false);
        if (this.f7620m1 <= 0.0f && (viewGroup = this.f7600g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        m3880x0();
        m3784D0(C0639g.m1872x().m1880u());
        this.f7539E0 = AbstractC1372y1.f6437g;
        m3796J();
        View view = this.f7622n0;
        if (view != null) {
            view.post(new RunnableC1479F0(this, 5));
            return;
        }
        View view2 = this.f7619m0;
        if (view2 != null) {
            view2.post(new RunnableC1479F0(this, 13));
        }
    }

    /* renamed from: S */
    public final void m3812S() {
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup != null) {
            viewGroup.getOverlay().clear();
        }
        ImageView imageView = this.f7624o;
        if (imageView != null && imageView.getBackground() == this.f7626o1) {
            this.f7624o.setBackground(null);
            this.f7624o.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f7600g;
        if (viewGroup2 != null && viewGroup2.getBackground() == this.f7626o1) {
            this.f7600g.setBackgroundResource(android.R.color.transparent);
            this.f7600g.setLayerType(0, null);
        }
        C1525c c1525c = this.f7626o1;
        if (c1525c != null) {
            c1525c.m4160b();
            this.f7626o1.m4163e(null);
        }
    }

    /* renamed from: S0 */
    public final ImageView m3813S0() {
        return this.f7591d.f2636h2 ? this.f7627p : this.f7630q;
    }

    /* renamed from: T */
    public final void m3814T() {
        cfgData cfgdata = this.f7591d;
        if (cfgdata.f2561Q2) {
            boolean m3844l0 = m3844l0();
            Context context = this.f7588c;
            if (m3844l0) {
                if (cfgdata.f2635h1 != 0 || Math.abs(this.f7599f1 - m3875v1()) >= 0.001f || this.f7605h1 >= 0.001f) {
                    cfgdata.f2635h1 = 0;
                    cfgdata.m1795o(context);
                    m3824c(null);
                    return;
                }
                return;
            }
            if (m3847m0() && cfgdata.f2635h1 == 1) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
                m3824c(null);
            } else {
                if (Math.abs(this.f7602g1 - (m3788E1() ? 1.0f : 0.0f)) < 0.001f) {
                    return;
                }
                m3824c(null);
            }
        }
    }

    /* renamed from: T0 */
    public final float m3815T0() {
        return this.f7591d.f2636h2 ? this.f7584a1 : this.f7587b1;
    }

    /* renamed from: U */
    public final void m3816U() {
        View view = this.f7619m0;
        if (view == null || this.f7600g == null) {
            return;
        }
        if (this.f7622n0 != null && view.getParent() == this.f7622n0) {
            int round = Math.round(this.f7588c.getResources().getDisplayMetrics().density * 96.0f);
            ((ViewGroup) this.f7622n0).removeView(this.f7619m0);
            C1592d c1592d = new C1592d(470, round);
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            this.f7600g.addView(this.f7619m0, c1592d);
            this.f7533B0 = -1.0f;
            this.f7535C0 = -1.0f;
            this.f7619m0.setTranslationX(0.0f);
            this.f7619m0.setTranslationY(0.0f);
        }
        this.f7619m0.getParent();
    }

    /* renamed from: V */
    public final int m3817V() {
        int i = this.f7631q0;
        if (i > 0) {
            return i;
        }
        TextView textView = this.f7556N;
        if (textView == null || this.f7558O == null) {
            return 0;
        }
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        int paddingBottom = this.f7558O.getPaddingBottom() + this.f7558O.getPaddingTop() + Math.round((this.f7556N.getLineSpacingExtra() + (fontMetrics.descent - fontMetrics.ascent)) * 3.0f);
        this.f7631q0 = paddingBottom;
        if (paddingBottom <= 0) {
            float f2 = this.f7588c.getResources().getDisplayMetrics().density;
            this.f7631q0 = AbstractC0062j.m150d(f2, 20.0f, 22.0f * f2 * 3.2f);
        }
        return this.f7631q0;
    }

    /* renamed from: W */
    public final void m3818W() {
        m3771h1(this.f7612k);
        m3771h1(this.f7615l);
        m3771h1(this.f7618m);
        if (this.f7603h == null || m3779B1()) {
            return;
        }
        this.f7603h.setVisibility(8);
    }

    /* renamed from: X */
    public final void m3819X() {
        ImageView imageView = this.f7604h0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.f7607i0;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView2 = this.f7610j0;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        ImageView imageView3 = this.f7613k0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f7616l0;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
    }

    /* renamed from: Z */
    public final float m3820Z(float f2) {
        float m3875v1 = m3875v1();
        float f3 = f2 - 1.0f;
        if (Math.abs(f3) < 0.001f) {
            return 0.0f;
        }
        float f4 = m3875v1 - 1.0f;
        if (Math.abs(f4) < 0.001f) {
            return 0.0f;
        }
        return f3 / f4;
    }

    /* renamed from: a0 */
    public final boolean m3821a0() {
        return this.f7591d.f2561Q2 && this.f7555M0;
    }

    /* renamed from: b */
    public final void m3822b(boolean z2) {
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup == null) {
            m3796J();
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7600g.getHeight() <= 0) {
            this.f7600g.post(new RunnableC1487J0(this, z2, 1));
            return;
        }
        ValueAnimator valueAnimator = this.f7561P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7561P0 = null;
        }
        this.f7563Q0 = false;
        m3802M();
        m3805N0();
        ImageView m3856p0 = m3856p0();
        ImageView m3813S0 = m3813S0();
        boolean z3 = this.f7591d.f2636h2;
        ImageView imageView = z3 ? this.f7636s : this.f7633r;
        ImageView imageView2 = z3 ? this.f7633r : this.f7636s;
        TextView textView = z3 ? this.f7592d0 : this.f7589c0;
        TextView textView2 = z3 ? this.f7589c0 : this.f7592d0;
        float m3859q0 = m3859q0();
        float m3815T0 = m3815T0();
        float width = this.f7600g.getWidth();
        float height = this.f7600g.getHeight();
        float f2 = this.f7588c.getResources().getDisplayMetrics().density * 80.0f;
        float f3 = m3856p0 != null ? -(m3856p0.getRight() + f2) : -width;
        if (m3813S0 != null) {
            width = (width - m3813S0.getLeft()) + f2;
        }
        float f4 = width;
        if (!z2) {
            m3772i1(m3856p0, true);
            m3772i1(m3813S0, true);
            m3772i1(imageView, true);
            m3772i1(imageView2, true);
            m3831f1(imageView, true);
            m3831f1(imageView2, true);
            m3772i1(textView, true);
            m3772i1(textView2, true);
            m3772i1(this.f7638t, true);
            m3772i1(this.f7640u, true);
            m3772i1(this.f7552L, true);
            m3772i1(this.f7572V, true);
            m3772i1(this.f7574W, true);
            m3772i1(this.f7554M, !r3.f2543M0.f7147f);
            m3790F0();
            m3784D0(C0639g.m1872x().m1880u());
        }
        View view = this.f7619m0;
        boolean z4 = view != null && view.getVisibility() == 0;
        float top = this.f7619m0 != null ? (height - r3.getTop()) + f2 : 0.0f;
        if (m3840j0()) {
            m3812S();
        }
        ViewGroup viewGroup2 = this.f7600g;
        if (viewGroup2 != null) {
            viewGroup2.setLayerType(0, null);
        }
        m3885z();
        float f5 = this.f7624o != null ? -(r1.getHeight() + f2) : -height;
        int[] m3297c = AbstractC1372y1.m3297c();
        this.f7563Q0 = true;
        m3826d(z2 ? 0.0f : 1.0f, m3856p0, imageView, textView, m3859q0, f3, m3813S0, imageView2, textView2, m3815T0, f4, z4, top, f5);
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7561P0 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f7561P0);
        this.f7561P0.addUpdateListener(new C1558n(this, z2, m3856p0, imageView, textView, m3859q0, f3, m3813S0, imageView2, textView2, m3815T0, f4, z4, top, f5, m3297c, 5));
        this.f7561P0.addListener(new C1564p(this, m3297c, m3856p0, imageView, textView, m3859q0, m3813S0, imageView2, textView2, m3815T0, z4, z2, 4));
        this.f7561P0.start();
    }

    /* renamed from: b0 */
    public final View[] m3823b0(ImageView imageView) {
        return imageView == this.f7627p ? new View[]{this.f7552L, this.f7554M} : imageView == this.f7630q ? new View[]{this.f7572V, this.f7574W} : new View[0];
    }

    /* renamed from: c */
    public final void m3824c(RunnableC1479F0 runnableC1479F0) {
        ImageView m3856p0 = m3856p0();
        if (m3850n0() && (m3856p0 == null || m3856p0.getWidth() <= 0)) {
            if (m3856p0 != null) {
                m3856p0.post(new RunnableC1559n0(this, 11, runnableC1479F0));
                return;
            } else {
                if (runnableC1479F0 != null) {
                    runnableC1479F0.run();
                    return;
                }
                return;
            }
        }
        float m3875v1 = m3850n0() ? m3875v1() : 1.0f;
        float f2 = m3788E1() ? 1.0f : 0.0f;
        float f3 = this.f7591d.f2635h1 != 2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = this.f7608i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.f7599f1 - m3875v1) < 0.001f && Math.abs(this.f7602g1 - f2) < 0.001f && Math.abs(this.f7605h1 - f3) < 0.001f) {
            this.f7608i1 = null;
            this.f7599f1 = m3875v1;
            this.f7602g1 = f2;
            this.f7605h1 = f3;
            m3783D();
            if (runnableC1479F0 != null) {
                runnableC1479F0.run();
                return;
            }
            return;
        }
        float f4 = this.f7599f1;
        float f5 = this.f7602g1;
        float f6 = this.f7605h1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7608i1 = ofFloat;
        ofFloat.setDuration(260L);
        AbstractC0062j.m166t(this.f7608i1);
        this.f7608i1.addUpdateListener(new C1555m(this, f4, m3875v1, f5, f2, f6, f3, 4));
        this.f7608i1.addListener(new C1567q(this, m3875v1, f2, f3, runnableC1479F0, 4));
        this.f7608i1.start();
    }

    /* renamed from: c0 */
    public final void m3825c0(float[] fArr) {
        float f2 = (!this.f7557N0 || this.f7569T0 > 0.0f) ? this.f7569T0 : 0.0f;
        if (f2 <= 0.0f || !this.f7575W0) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        RectF m3874v0 = m3874v0();
        if (m3874v0.width() <= 0.0f || m3874v0.height() <= 0.0f) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = (m3874v0.centerX() - this.f7571U0) * f2;
            fArr[1] = (m3874v0.centerY() - this.f7573V0) * f2;
        }
    }

    /* renamed from: d */
    public final void m3826d(float f2, ImageView imageView, ImageView imageView2, TextView textView, float f3, float f4, ImageView imageView3, ImageView imageView4, TextView textView2, float f5, float f6, boolean z2, float f7, float f8) {
        View view;
        m3828e(imageView, imageView2, textView, f3, f4, -540.0f, f2);
        m3828e(imageView3, imageView4, textView2, f5, f6, 540.0f, f2);
        if (z2 && (view = this.f7619m0) != null) {
            view.setTranslationY((f7 * f2) + this.f7537D0);
        }
        ImageView imageView5 = this.f7624o;
        if (imageView5 != null) {
            imageView5.setTranslationY(f8 * f2);
        }
    }

    /* renamed from: d0 */
    public final float m3827d0() {
        return Math.max(0.0f, this.f7594e.m1779y() / 1000.0f);
    }

    /* renamed from: e */
    public final void m3828e(ImageView imageView, ImageView imageView2, TextView textView, float f2, float f3, float f4, float f5) {
        if (imageView != null) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
            imageView.setTranslationX(f3 * f5);
            imageView.setRotation(f4 * f5);
        }
        if (imageView2 != null) {
            imageView2.setPivotY(AbstractC0062j.m153g(imageView2.getWidth(), 0.5f, imageView2) * 0.5f);
            float f6 = f3 * f5;
            imageView2.setTranslationX(f6);
            imageView2.setTranslationY(0.0f);
            float f7 = f4 * f5;
            imageView2.setRotation(f7);
            ImageView[] m3884y1 = m3884y1(imageView2);
            if (m3884y1 != null) {
                for (ImageView imageView3 : m3884y1) {
                    if (imageView3 != null) {
                        imageView3.setPivotY(AbstractC0062j.m153g(imageView3.getWidth(), 0.5f, imageView3) * 0.5f);
                        imageView3.setTranslationX(f6);
                        imageView3.setTranslationY(0.0f);
                        imageView3.setRotation(f7);
                    }
                }
            }
        }
        ImageView imageView4 = imageView == this.f7627p ? this.f7638t : imageView == this.f7630q ? this.f7640u : null;
        if (imageView4 != null) {
            imageView4.setPivotY(AbstractC0062j.m153g(imageView4.getWidth(), 0.5f, imageView4) * 0.5f);
            imageView4.setTranslationX(f3 * f5);
            imageView4.setTranslationY(0.0f);
            imageView4.setRotation(f4 * f5);
        }
        if (textView != null) {
            textView.setTranslationX(f3 * f5);
            textView.setTranslationY(f2);
        }
        View[] m3823b0 = m3823b0(imageView);
        int length = m3823b0.length;
        for (int i = 0; i < length; i++) {
            View view = m3823b0[i];
            if (view != null) {
                view.setTranslationX((f3 * f5) + (view == this.f7554M ? m3797J0(this.f7599f1) : m3868t0(view)));
                view.setTranslationY(m3871u0(view));
            }
        }
    }

    /* renamed from: e0 */
    public final float m3829e0() {
        float m1780z = this.f7594e.m1780z();
        if (m1780z < 0.0f) {
            return 0.0f;
        }
        return m1780z * this.f7591d.f2702u3;
    }

    /* renamed from: e1 */
    public final void m3830e1(ImageView imageView, boolean z2) {
        for (View view : m3823b0(imageView)) {
            if (view == this.f7554M) {
                m3772i1(view, z2 && !this.f7591d.f2543M0.f7147f);
            } else {
                m3772i1(view, z2);
            }
        }
    }

    /* renamed from: f1 */
    public final void m3831f1(ImageView imageView, boolean z2) {
        ImageView[] m3884y1 = m3884y1(imageView);
        if (m3884y1 == null) {
            return;
        }
        for (ImageView imageView2 : m3884y1) {
            m3772i1(imageView2, z2);
        }
    }

    /* renamed from: g */
    public final void m3832g() {
        ImageView imageView = this.f7604h0;
        if (imageView == null || this.f7610j0 == null) {
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
        ImageView imageView2 = this.f7610j0;
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
        TextView textView = this.f7607i0;
        if (textView != null) {
            textView.setTextSize(2, 32.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f7607i0.getLayoutParams();
            if (layoutParams3 instanceof C1592d) {
                C1592d c1592d3 = (C1592d) layoutParams3;
                ((ViewGroup.MarginLayoutParams) c1592d3).topMargin = -7;
                this.f7607i0.setLayoutParams(c1592d3);
            }
            this.f7607i0.setTranslationX(13.0f);
            this.f7607i0.setTranslationY(12.0f);
        }
        ImageView imageView3 = this.f7604h0;
        if (imageView3 != null) {
            imageView3.setBackgroundResource(R.drawable.ip_theme_50_cruise_icon_bg);
            this.f7604h0.setPadding(6, 6, 6, 6);
        }
        ImageView imageView4 = this.f7610j0;
        if (imageView4 != null) {
            imageView4.setBackgroundResource(R.drawable.ip_theme_50_cruise_icon_bg);
            this.f7610j0.setPadding(6, 6, 6, 6);
        }
        TextView textView2 = this.f7607i0;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.ip_theme_50_cruise_icon_bg);
        }
        m3887z1();
        m3800L();
    }

    /* renamed from: g0 */
    public final boolean m3833g0() {
        return this.f7591d.f2561Q2 && !this.f7555M0;
    }

    /* renamed from: g1 */
    public final void m3834g1(View view, float f2) {
        Context context;
        Drawable m1b;
        if (view == null || (context = this.f7588c) == null || (m1b = AbstractC0000a.m1b(context, f7529u1)) == null) {
            return;
        }
        Drawable mutate = m1b.mutate();
        int round = Math.round((Math.max(0.0f, Math.min(1.0f, f2)) * (Color.alpha(-536079072) - 128)) + 128);
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(Color.argb(round, 12, 21, 32));
        }
        view.setBackground(mutate);
    }

    /* renamed from: h */
    public final void m3835h() {
        cfgData cfgdata = this.f7591d;
        if (!cfgdata.f2537K2) {
            ViewGroup viewGroup = this.f7560P;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            m3772i1(this.f7556N, false);
            m3772i1(this.f7568T, false);
            View view = this.f7550K;
            if (view != null) {
                view.setVisibility(8);
            }
            m3771h1(this.f7574W);
            m3863r1();
            return;
        }
        m3772i1(this.f7568T, cfgdata.f2581V2 && (!m3833g0() && (m3821a0() || m3844l0())));
        m3790F0();
        if (m3844l0()) {
            m3837i(false);
        } else if (cfgdata.f2585W2 || m3844l0() || m3833g0() || !m3821a0() || this.f7605h1 >= 0.999f) {
            m3837i(false);
        } else {
            m3837i(true);
        }
        m3886z0();
        m3863r1();
        if (!m3785D1() && !m3847m0() && !m3844l0() && !m3848m1()) {
            m3818W();
            if (m3840j0()) {
                m3883y0();
            }
        }
        m3795I0();
    }

    /* renamed from: h0 */
    public final void m3836h0() {
        m3771h1(this.f7609j);
        m3771h1(this.f7560P);
        if (m3844l0() || m3833g0() || !m3785D1()) {
            m3771h1(this.f7612k);
            m3771h1(this.f7615l);
            m3771h1(this.f7618m);
        }
        if (m3844l0() || this.f7591d.f2585W2) {
            m3771h1(this.f7550K);
            m3771h1(this.f7536D);
            m3771h1(this.f7532B);
            m3771h1(this.f7534C);
            m3771h1(this.f7540F);
            m3771h1(this.f7538E);
            m3771h1(this.f7542G);
            m3771h1(this.f7546I);
            m3771h1(this.f7544H);
            m3771h1(this.f7548J);
        }
    }

    /* renamed from: i */
    public final void m3837i(boolean z2) {
        if (!z2) {
            View view = this.f7550K;
            if (view != null) {
                view.setVisibility(8);
            }
            m3771h1(this.f7540F);
            m3771h1(this.f7538E);
            m3771h1(this.f7542G);
            m3771h1(this.f7536D);
            m3771h1(this.f7532B);
            m3771h1(this.f7534C);
            m3771h1(this.f7546I);
            m3771h1(this.f7544H);
            m3771h1(this.f7548J);
            return;
        }
        View view2 = this.f7550K;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        boolean z3 = this.f7591d.useJourneyFuel;
        m3772i1(this.f7540F, z3);
        m3772i1(this.f7538E, z3);
        m3772i1(this.f7542G, z3);
        m3772i1(this.f7536D, true);
        m3772i1(this.f7532B, true);
        m3772i1(this.f7534C, true);
        m3772i1(this.f7546I, true);
        m3772i1(this.f7544H, true);
        m3772i1(this.f7548J, true);
    }

    /* renamed from: i0 */
    public final void m3838i0() {
        ImageView imageView = this.f7624o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        this.f7624o.setLayerType(0, null);
        this.f7624o.setBackground(null);
        this.f7624o.setImageDrawable(null);
    }

    /* renamed from: j */
    public final void m3839j(int i, int i2, int i3, float f2) {
        ImageView m3856p0;
        if (this.f7550K == null || m3844l0()) {
            return;
        }
        boolean z2 = (this.f7591d.f2585W2 || m3833g0() || !m3821a0()) ? false : true;
        float max = Math.max(0.0f, Math.min(1.0f, this.f7605h1));
        if (!z2) {
            this.f7550K.setAlpha(1.0f);
            this.f7550K.setTranslationY(0.0f);
            return;
        }
        if (max >= 0.999f) {
            this.f7550K.setAlpha(0.0f);
            this.f7550K.setVisibility(4);
            return;
        }
        if (this.f7550K.getVisibility() != 0) {
            m3837i(true);
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float f3 = ((-0.19999999f) * max2) + 1.0f;
        if (this.f7550K != null) {
            Context context = this.f7588c;
            float f4 = context.getResources().getDisplayMetrics().density;
            float f5 = context.getResources().getDisplayMetrics().scaledDensity;
            float max3 = Math.max(0.5f, Math.min(1.2f, f3));
            float f6 = 10.0f * f4 * max3;
            this.f7550K.setPadding(AbstractC0062j.m168v(f4, 14.0f, max3), Math.round(f6), AbstractC0062j.m168v(f4, 16.0f, max3), Math.round(f6));
            View view = this.f7550K;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(true);
                ((ViewGroup) this.f7550K).setClipChildren(true);
            }
            float f7 = 15.0f * max3;
            m3767c1(this.f7546I, f7, f5);
            float f8 = 30.0f * max3;
            m3767c1(this.f7544H, f8, f5);
            float f9 = 16.0f * max3;
            m3767c1(this.f7548J, f9, f5);
            m3767c1(this.f7540F, f7, f5);
            m3767c1(this.f7538E, f8, f5);
            m3767c1(this.f7542G, f9, f5);
            m3767c1(this.f7536D, f7, f5);
            m3767c1(this.f7532B, f8, f5);
            m3767c1(this.f7534C, f9, f5);
            AbstractC1539g1.m4202X(this.f7544H, this.f7538E, this.f7532B);
            TextView textView = this.f7540F;
            View view2 = textView != null ? (View) textView.getParent() : null;
            float f10 = 22.0f * f4 * max3;
            if (view2 != null && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMarginStart(Math.round(f10));
                view2.setLayoutParams(marginLayoutParams);
            }
            TextView textView2 = this.f7536D;
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
        if (max2 > 0.001f && (m3856p0 = m3856p0()) != null && m3856p0.getWidth() > 0 && m3856p0.getHeight() > 0) {
            float f12 = this.f7599f1;
            float left = m3856p0.getLeft();
            float width = m3856p0.getWidth() * f12;
            float height = (m3856p0.getHeight() * f12) + m3856p0.getTop();
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
        View view4 = this.f7550K;
        if (view4 != null && this.f7600g != null && (view4.getLayoutParams() instanceof C1592d)) {
            C1592d c1592d = (C1592d) this.f7550K.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = 470;
            ((ViewGroup.MarginLayoutParams) c1592d).height = m152f;
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(max6);
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max7;
            this.f7550K.setLayoutParams(c1592d);
            this.f7550K.setTranslationX(0.0f);
            this.f7550K.setTranslationY(0.0f);
        }
        this.f7550K.setAlpha(1.0f - max);
        this.f7550K.setTranslationY(max * 40.0f);
        this.f7550K.bringToFront();
        View view5 = this.f7622n0;
        if (view5 != null) {
            view5.bringToFront();
        }
    }

    /* renamed from: j0 */
    public final boolean m3840j0() {
        if (this.f7626o1 == null) {
            return false;
        }
        ImageView imageView = this.f7624o;
        if (imageView != null && imageView.getVisibility() == 0 && this.f7624o.getBackground() == this.f7626o1) {
            return true;
        }
        ViewGroup viewGroup = this.f7600g;
        return viewGroup != null && viewGroup.getBackground() == this.f7626o1;
    }

    /* renamed from: k */
    public final void m3841k(ImageView imageView, ImageView imageView2, TextView textView, float f2, boolean z2, float f3, float f4, float f5) {
        float f6;
        float f7;
        if (imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1479F0(this, 20));
            return;
        }
        float f8 = f3 - 1.0f;
        if (Math.abs(f8) < 0.001f) {
            m3755P0(imageView, f4, f5);
            m3803M0(imageView2);
            m3755P0(textView, f4, f2 + f5);
            m3872u1(imageView, 1.0f, 0.0f, 0.0f, f4, f5, 0.0f, 0.0f);
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m3770f0(imageView, f3, z2, fArr, fArr2);
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        if (f3 < 0.999f) {
            f7 = m3878w1() * (-20.0f);
        } else {
            if (f3 <= 1.001f) {
                f6 = 0.0f;
                m3754I(imageView, f3, f9, f10, f4, f5, f11, f12);
                m3870u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
                m3754I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
                m3872u1(imageView, f3, f9, f10, f4, f5, f11, f12);
            }
            if (Math.abs(f8) < 0.001f || f3 < 1.0f) {
                f7 = 0.0f;
            } else {
                float m3820Z = m3820Z(f3);
                f7 = (((-imageView.getHeight()) * 0.16f) * m3820Z) - (m3820Z * 120.0f);
            }
        }
        f6 = f7;
        m3754I(imageView, f3, f9, f10, f4, f5, f11, f12);
        m3870u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
        m3754I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
        m3872u1(imageView, f3, f9, f10, f4, f5, f11, f12);
    }

    /* renamed from: k0 */
    public final boolean m3842k0() {
        return this.f7591d.f2537K2 && m3821a0();
    }

    /* renamed from: k1 */
    public final boolean m3843k1() {
        return m3844l0() && !m3833g0();
    }

    /* renamed from: l0 */
    public final boolean m3844l0() {
        cfgData cfgdata = this.f7591d;
        return AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
    }

    /* renamed from: l1 */
    public final boolean m3845l1() {
        return m3847m0() && !m3833g0();
    }

    /* renamed from: m */
    public final void m3846m(boolean z2) {
        boolean z3 = this.f7591d.f2636h2;
        if (z2 || !Boolean.valueOf(z3).equals(this.f7581Z0)) {
            this.f7581Z0 = Boolean.valueOf(z3);
            this.f7575W0 = false;
            m3768d1(this.f7627p, z3 ? 1 : 0);
            m3768d1(this.f7630q, z3 ? 1 : 0);
            m3768d1(this.f7633r, z3 ? 1 : 0);
            m3768d1(this.f7636s, z3 ? 1 : 0);
            for (ImageView imageView : this.f7646x) {
                m3768d1(imageView, z3 ? 1 : 0);
            }
            for (ImageView imageView2 : this.f7648y) {
                m3768d1(imageView2, z3 ? 1 : 0);
            }
            m3774l(this.f7627p, z3);
            m3774l(this.f7630q, !z3);
            ImageView imageView3 = this.f7633r;
            if (imageView3 != null && this.f7543G0 != null) {
                imageView3.post(new RunnableC1479F0(this, 14));
            }
            ImageView imageView4 = this.f7636s;
            if (imageView4 != null && this.f7545H0 != null) {
                imageView4.post(new RunnableC1479F0(this, 15));
            }
            ImageView imageView5 = this.f7638t;
            if (imageView5 != null && this.f7547I0 != null) {
                imageView5.post(new RunnableC1479F0(this, 16));
            }
            ImageView imageView6 = this.f7640u;
            if (imageView6 != null && this.f7549J0 != null) {
                imageView6.post(new RunnableC1479F0(this, 17));
            }
            m3876w();
            carData cardata = this.f7594e;
            m3778B0(cardata.m1753i());
            m3775A0(cardata.m1745e());
        }
    }

    /* renamed from: m0 */
    public final boolean m3847m0() {
        return AbstractC1539g1.m4195Q(this.f7591d, this.f7594e);
    }

    /* renamed from: m1 */
    public final boolean m3848m1() {
        if (m3842k0()) {
            return !this.f7557N0 || this.f7569T0 > 0.0f;
        }
        return false;
    }

    /* renamed from: n */
    public final void m3849n() {
        if (this.f7626o1 == null) {
            C1525c c1525c = new C1525c(-16777216);
            this.f7626o1 = c1525c;
            c1525c.m4164f(1720508584);
        }
        C1574t m3810Q0 = m3810Q0();
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        this.f7600g.setBackgroundResource(android.R.color.transparent);
        if (!m3810Q0.m4472a() || m3860q1()) {
            if (m3810Q0.m4472a()) {
                m3838i0();
            }
            m3852o();
        } else if (m3860q1()) {
            m3838i0();
            m3852o();
            m3776A1();
        } else if (this.f7624o == null) {
            m3838i0();
            this.f7626o1.m4163e(null);
            this.f7626o1.m4162d(m3843k1() ? -15985376 : -16777216);
            this.f7600g.setLayerType(1, null);
            this.f7600g.setBackground(this.f7626o1);
        } else if (m3840j0() && this.f7624o.getBackground() == this.f7626o1) {
            this.f7624o.setLayerType(1, null);
            m3776A1();
        } else {
            this.f7624o.setVisibility(0);
            this.f7624o.setLayerType(1, null);
            this.f7624o.setBackground(null);
            RunnableC0123b runnableC0123b = new RunnableC0123b(this, 7, m3810Q0);
            if (m3810Q0.f8687b != 0) {
                runnableC0123b.run();
            } else {
                Uri uri = m3810Q0.f8688c;
                if (uri != null) {
                    this.f7624o.setImageURI(uri);
                    this.f7624o.post(runnableC0123b);
                }
            }
        }
        m3776A1();
    }

    /* renamed from: n0 */
    public final boolean m3850n0() {
        return this.f7591d.f2635h1 == 0 && !this.f7611j1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v243, types: [android.view.View] */
    /* renamed from: n1 */
    public final void m3851n1() {
        int i;
        View view = this.f7585b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_50_root);
        this.f7600g = viewGroup;
        ViewGroup viewGroup2 = viewGroup;
        while (true) {
            i = 0;
            if (!(viewGroup2 instanceof ViewGroup)) {
                break;
            }
            ViewGroup viewGroup3 = viewGroup2;
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
            if (!(viewGroup2.getParent() instanceof View)) {
                break;
            } else {
                viewGroup2 = (View) viewGroup2.getParent();
            }
        }
        this.f7624o = (ImageView) view.findViewById(R.id.theme_50_style_bg);
        this.f7603h = view.findViewById(R.id.theme_50_navi_hole);
        this.f7606i = view.findViewById(R.id.theme_50_top_panel);
        this.f7609j = view.findViewById(R.id.theme_50_bottom_panel);
        this.f7612k = view.findViewById(R.id.theme_50_bottom_panel_left);
        this.f7615l = view.findViewById(R.id.theme_50_bottom_panel_center);
        this.f7618m = view.findViewById(R.id.theme_50_bottom_panel_right);
        if (this.f7615l != null) {
            C1528d c1528d = new C1528d(-15985376);
            this.f7621n = c1528d;
            this.f7615l.setBackground(c1528d);
        }
        this.f7627p = (ImageView) view.findViewById(R.id.theme_50_spd_face);
        this.f7630q = (ImageView) view.findViewById(R.id.theme_50_rpm_face);
        this.f7633r = (ImageView) view.findViewById(R.id.theme_50_spd_needle);
        this.f7636s = (ImageView) view.findViewById(R.id.theme_50_rpm_needle);
        this.f7638t = (ImageView) view.findViewById(R.id.theme_50_fuel_needle);
        this.f7640u = (ImageView) view.findViewById(R.id.theme_50_temp_needle);
        this.f7532B = (TextView) view.findViewById(R.id.theme_50_inst_fuel);
        this.f7534C = (TextView) view.findViewById(R.id.theme_50_inst_fuel_sub);
        this.f7536D = (TextView) view.findViewById(R.id.theme_50_lbl_inst);
        this.f7538E = (TextView) view.findViewById(R.id.theme_50_avg_jour);
        this.f7540F = (TextView) view.findViewById(R.id.theme_50_lbl_avg_jour);
        this.f7542G = (TextView) view.findViewById(R.id.theme_50_avg_jour_sub);
        this.f7544H = (TextView) view.findViewById(R.id.theme_50_avg_total);
        this.f7546I = (TextView) view.findViewById(R.id.theme_50_lbl_avg_total);
        this.f7548J = (TextView) view.findViewById(R.id.theme_50_avg_total_sub);
        this.f7550K = view.findViewById(R.id.theme_50_fuel_cons_wrap);
        this.f7560P = (ViewGroup) view.findViewById(R.id.theme_50_odo_wrap);
        this.f7562Q = (TextView) view.findViewById(R.id.theme_50_odo_total);
        this.f7564R = (TextView) view.findViewById(R.id.theme_50_odo_day);
        this.f7566S = (TextView) view.findViewById(R.id.theme_50_odo_trip);
        this.f7568T = (ViewGroup) view.findViewById(R.id.theme_50_tires_wrap);
        this.f7570U = (TextView) view.findViewById(R.id.theme_50_tires_up);
        this.f7574W = (TextView) view.findViewById(R.id.theme_50_battery);
        this.f7576X = (TextView) view.findViewById(R.id.theme_50_gear);
        this.f7578Y = (TextView) view.findViewById(R.id.theme_50_clock);
        this.f7580Z = (TextView) view.findViewById(R.id.theme_50_out_temp);
        this.f7583a0 = (ImageView) view.findViewById(R.id.theme_50_wifi);
        this.f7586b0 = (ImageView) view.findViewById(R.id.theme_50_inet);
        this.f7589c0 = (TextView) view.findViewById(R.id.theme_50_spd_value);
        this.f7592d0 = (TextView) view.findViewById(R.id.theme_50_rpm_value);
        this.f7552L = (TextView) view.findViewById(R.id.theme_50_fuel_up);
        this.f7572V = (TextView) view.findViewById(R.id.theme_50_temp_up);
        TextView textView = (TextView) view.findViewById(R.id.theme_50_remain);
        this.f7554M = textView;
        if (textView != null) {
            this.f7590c1 = textView.getTranslationX();
        }
        this.f7556N = (TextView) view.findViewById(R.id.theme_50_odo_up);
        View findViewById = view.findViewById(R.id.theme_50_odo_frame);
        this.f7558O = findViewById;
        AbstractC1539g1.m4223j(this.f7556N, findViewById);
        AbstractC1539g1.m4204Z(this.f7562Q, this.f7564R, this.f7566S);
        AbstractC1539g1.m4202X(this.f7544H, this.f7538E, this.f7532B);
        this.f7595e0 = (TextView) view.findViewById(R.id.theme_50_txt_speed);
        this.f7601g0 = view.findViewById(R.id.theme_50_txt_speed_scrim);
        this.f7598f0 = (TextView) view.findViewById(R.id.theme_50_txt_rpm);
        TextView textView2 = this.f7589c0;
        TextView textView3 = this.f7592d0;
        this.f7584a1 = textView2 != null ? textView2.getTranslationY() : 0.0f;
        this.f7587b1 = textView3 != null ? textView3.getTranslationY() : 0.0f;
        if (Math.abs(this.f7584a1) < 0.5f && Math.abs(this.f7587b1) < 0.5f) {
            float f2 = this.f7588c.getResources().getDisplayMetrics().scaledDensity * 60.0f;
            this.f7584a1 = f2;
            this.f7587b1 = f2;
            if (textView2 != null) {
                textView2.setTranslationY(f2);
            }
            if (textView3 != null) {
                textView3.setTranslationY(f2);
            }
        }
        this.f7604h0 = (ImageView) view.findViewById(R.id.theme_50_cruise);
        this.f7607i0 = (TextView) view.findViewById(R.id.theme_50_cruise_speed);
        this.f7610j0 = (ImageView) view.findViewById(R.id.theme_50_lane);
        this.f7613k0 = (ImageView) view.findViewById(R.id.theme_50_hide_cruise);
        this.f7616l0 = (ImageView) view.findViewById(R.id.theme_50_hide_la);
        this.f7628p0 = view.findViewById(R.id.theme_50_ext_spacer);
        View findViewById2 = view.findViewById(R.id.theme_50_media_wrap);
        this.f7619m0 = findViewById2;
        AbstractC0641i.m1886c(findViewById2);
        this.f7622n0 = view.findViewById(R.id.theme_50_center_float);
        this.f7625o0 = view.findViewById(R.id.theme_50_ext_row);
        View view2 = this.f7622n0;
        if (view2 instanceof ViewGroup) {
            ((ViewGroup) view2).setClipChildren(false);
            ((ViewGroup) this.f7622n0).setClipToPadding(false);
        }
        ViewGroup viewGroup4 = this.f7600g;
        if (viewGroup4 != null) {
            viewGroup4.setClipChildren(false);
            this.f7600g.setClipToPadding(false);
        }
        View view3 = this.f7625o0;
        if (view3 != null) {
            if (view3 instanceof ViewGroup) {
                ((ViewGroup) view3).setClipChildren(false);
                ((ViewGroup) this.f7625o0).setClipToPadding(false);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7625o0.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin += 15;
                this.f7625o0.setLayoutParams(marginLayoutParams);
            }
        }
        m3816U();
        this.f7634r0 = (ImageView) view.findViewById(R.id.theme_50_media_art);
        this.f7637s0 = (TextView) view.findViewById(R.id.theme_50_media_title);
        this.f7639t0 = (TextView) view.findViewById(R.id.theme_50_media_artist);
        this.f7641u0 = (TextView) view.findViewById(R.id.theme_50_media_elapsed);
        this.f7643v0 = (TextView) view.findViewById(R.id.theme_50_media_total);
        this.f7645w0 = (ProgressBar) view.findViewById(R.id.theme_50_media_bar);
        TextView textView4 = (TextView) view.findViewById(R.id.theme_50_free_mem);
        Handler handler = this.f7597f;
        this.f7541F0 = new C1531e(handler, textView4);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f7582a);
        }
        m3836h0();
        m3846m(true);
        m3832g();
        carData cardata = this.f7594e;
        m3775A0(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView5 = this.f7607i0;
        if (textView5 != null) {
            textView5.setText(String.valueOf(m1747f));
        }
        m3775A0(cardata.m1745e());
        float m3829e0 = m3829e0();
        float m3827d0 = m3827d0();
        this.f7543G0 = new C1572s(0.0f, 220.0f, -135.5f, 136.5f, m3829e0, 4);
        this.f7545H0 = new C1572s(0.0f, 8.0f, -135.5f, 136.5f, m3827d0, 4);
        float max = Math.max(0.0f, cardata.m1774t());
        float m1743d = cardata.m1743d();
        float f3 = m1743d < 40.0f ? 40.0f : m1743d;
        this.f7547I0 = new C1572s(0.0f, 100.0f, 32.5f, -32.5f, max, 4);
        this.f7549J0 = new C1572s(40.0f, 130.0f, 32.5f, -32.5f, f3, 4);
        m3773j1(this.f7633r, this.f7543G0);
        m3773j1(this.f7636s, this.f7545H0);
        m3773j1(this.f7638t, this.f7547I0);
        m3773j1(this.f7640u, this.f7549J0);
        ImageView imageView = this.f7627p;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ImageView imageView2 = this.f7630q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        ImageView imageView3 = this.f7633r;
        if (imageView3 != null) {
            imageView3.setImageDrawable(null);
        }
        ImageView imageView4 = this.f7636s;
        if (imageView4 != null) {
            imageView4.setImageDrawable(null);
        }
        ImageView imageView5 = this.f7638t;
        if (imageView5 != null) {
            imageView5.setImageDrawable(null);
        }
        ImageView imageView6 = this.f7640u;
        if (imageView6 != null) {
            imageView6.setImageDrawable(null);
        }
        this.f7646x = m3756R(this.f7633r);
        this.f7648y = m3756R(this.f7636s);
        C1572s c1572s = this.f7543G0;
        if (c1572s != null) {
            float f4 = c1572s.f8682h;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f7650z;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = f4;
                i2++;
            }
        }
        C1572s c1572s2 = this.f7545H0;
        if (c1572s2 != null) {
            float f5 = c1572s2.f8682h;
            while (true) {
                float[] fArr2 = this.f7530A;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = f5;
                i++;
            }
        }
        m3877w0();
        final int i3 = 0;
        m3862r0("themes/50/theme_50_spd.bin", new Consumer(this) { // from class: u0.I0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7441b;

            {
                this.f7441b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i3) {
                    case 0:
                        C1491L0 c1491l0 = this.f7441b;
                        c1491l0.f7642v = bitmap;
                        c1491l0.f7579Y0 = -1;
                        c1491l0.m3778B0(c1491l0.f7594e.m1753i());
                        break;
                    case 1:
                        C1491L0 c1491l02 = this.f7441b;
                        c1491l02.f7644w = bitmap;
                        c1491l02.f7579Y0 = -1;
                        c1491l02.m3778B0(c1491l02.f7594e.m1753i());
                        break;
                    case 2:
                        C1491L0 c1491l03 = this.f7441b;
                        ImageView imageView7 = c1491l03.f7633r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1491l03.f7636s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1491l03.f7646x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1491l03.f7648y;
                        if (imageViewArr2 != null && bitmap != null) {
                            for (ImageView imageView10 : imageViewArr2) {
                                if (imageView10 != null) {
                                    imageView10.setImageBitmap(bitmap);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        C1491L0 c1491l04 = this.f7441b;
                        ImageView imageView11 = c1491l04.f7638t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1491l04.f7640u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        m3862r0("themes/50/theme_50_rpm.bin", new Consumer(this) { // from class: u0.I0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7441b;

            {
                this.f7441b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i4) {
                    case 0:
                        C1491L0 c1491l0 = this.f7441b;
                        c1491l0.f7642v = bitmap;
                        c1491l0.f7579Y0 = -1;
                        c1491l0.m3778B0(c1491l0.f7594e.m1753i());
                        break;
                    case 1:
                        C1491L0 c1491l02 = this.f7441b;
                        c1491l02.f7644w = bitmap;
                        c1491l02.f7579Y0 = -1;
                        c1491l02.m3778B0(c1491l02.f7594e.m1753i());
                        break;
                    case 2:
                        C1491L0 c1491l03 = this.f7441b;
                        ImageView imageView7 = c1491l03.f7633r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1491l03.f7636s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1491l03.f7646x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1491l03.f7648y;
                        if (imageViewArr2 != null && bitmap != null) {
                            for (ImageView imageView10 : imageViewArr2) {
                                if (imageView10 != null) {
                                    imageView10.setImageBitmap(bitmap);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        C1491L0 c1491l04 = this.f7441b;
                        ImageView imageView11 = c1491l04.f7638t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1491l04.f7640u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 2;
        m3862r0("themes/50/theme_50_needle.bin", new Consumer(this) { // from class: u0.I0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7441b;

            {
                this.f7441b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i5) {
                    case 0:
                        C1491L0 c1491l0 = this.f7441b;
                        c1491l0.f7642v = bitmap;
                        c1491l0.f7579Y0 = -1;
                        c1491l0.m3778B0(c1491l0.f7594e.m1753i());
                        break;
                    case 1:
                        C1491L0 c1491l02 = this.f7441b;
                        c1491l02.f7644w = bitmap;
                        c1491l02.f7579Y0 = -1;
                        c1491l02.m3778B0(c1491l02.f7594e.m1753i());
                        break;
                    case 2:
                        C1491L0 c1491l03 = this.f7441b;
                        ImageView imageView7 = c1491l03.f7633r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1491l03.f7636s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1491l03.f7646x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1491l03.f7648y;
                        if (imageViewArr2 != null && bitmap != null) {
                            for (ImageView imageView10 : imageViewArr2) {
                                if (imageView10 != null) {
                                    imageView10.setImageBitmap(bitmap);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        C1491L0 c1491l04 = this.f7441b;
                        ImageView imageView11 = c1491l04.f7638t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1491l04.f7640u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 3;
        m3862r0("themes/50/theme_50_needle_small.bin", new Consumer(this) { // from class: u0.I0

            /* renamed from: b */
            public final /* synthetic */ C1491L0 f7441b;

            {
                this.f7441b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i6) {
                    case 0:
                        C1491L0 c1491l0 = this.f7441b;
                        c1491l0.f7642v = bitmap;
                        c1491l0.f7579Y0 = -1;
                        c1491l0.m3778B0(c1491l0.f7594e.m1753i());
                        break;
                    case 1:
                        C1491L0 c1491l02 = this.f7441b;
                        c1491l02.f7644w = bitmap;
                        c1491l02.f7579Y0 = -1;
                        c1491l02.m3778B0(c1491l02.f7594e.m1753i());
                        break;
                    case 2:
                        C1491L0 c1491l03 = this.f7441b;
                        ImageView imageView7 = c1491l03.f7633r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1491l03.f7636s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1491l03.f7646x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1491l03.f7648y;
                        if (imageViewArr2 != null && bitmap != null) {
                            for (ImageView imageView10 : imageViewArr2) {
                                if (imageView10 != null) {
                                    imageView10.setImageBitmap(bitmap);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        C1491L0 c1491l04 = this.f7441b;
                        ImageView imageView11 = c1491l04.f7638t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1491l04.f7640u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView7 = this.f7627p;
        if (imageView7 != null) {
            imageView7.post(new RunnableC1479F0(this, 0));
        }
        if (!this.f7553L0) {
            m3798K();
            this.f7553L0 = true;
        }
        ViewGroup viewGroup5 = this.f7600g;
        if (viewGroup5 != null) {
            viewGroup5.setAlpha(1.0f);
        }
        this.f7620m1 = 0.0f;
        this.f7557N0 = true;
        this.f7569T0 = 0.0f;
        boolean z2 = this.f7591d.f2561Q2;
        this.f7555M0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m3869t1();
        this.f7577X0 = Boolean.valueOf(m3847m0());
        m3796J();
        this.f7551K0 = true;
        handler.post(this.f7629p1);
        handler.post(this.f7635r1);
        this.f7539E0 = AbstractC1372y1.f6437g;
        handler.post(this.f7632q1);
        this.f7541F0.m4171b();
        View view4 = this.f7622n0;
        if (view4 != null) {
            view4.post(new RunnableC1479F0(this, 1));
            return;
        }
        View view5 = this.f7619m0;
        if (view5 != null) {
            view5.post(new RunnableC1479F0(this, 2));
        }
    }

    /* renamed from: o */
    public final void m3852o() {
        if (this.f7624o == null) {
            m3838i0();
            this.f7626o1.m4163e(null);
            this.f7626o1.m4162d(m3843k1() ? -15985376 : -16777216);
            this.f7600g.setLayerType(1, null);
            this.f7600g.setBackground(this.f7626o1);
            return;
        }
        if (m3840j0()) {
            Drawable background = this.f7624o.getBackground();
            C1525c c1525c = this.f7626o1;
            if (background == c1525c) {
                c1525c.m4163e(null);
                this.f7626o1.m4162d(m3843k1() ? -15985376 : -16777216);
                this.f7624o.setLayerType(1, null);
                return;
            }
        }
        this.f7624o.setVisibility(0);
        this.f7624o.setLayerType(1, null);
        this.f7624o.setImageDrawable(null);
        this.f7624o.setBackground(null);
        this.f7626o1.m4163e(null);
        this.f7626o1.m4162d(m3843k1() ? -15985376 : -16777216);
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
            this.f7600g.setBackgroundResource(android.R.color.transparent);
        }
        this.f7624o.setBackground(this.f7626o1);
    }

    /* renamed from: o0 */
    public final void m3853o0() {
        TextView textView;
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f7574W == null || (textView = this.f7572V) == null || this.f7630q == null) {
            return;
        }
        if (textView.getVisibility() != 0) {
            this.f7574W.setVisibility(8);
            return;
        }
        if (this.f7630q.getWidth() <= 0 || this.f7572V.getWidth() <= 0 || this.f7574W.getWidth() <= 0) {
            this.f7574W.setVisibility(0);
            this.f7630q.post(new RunnableC1479F0(this, 9));
            return;
        }
        this.f7574W.setVisibility(0);
        float width = (this.f7572V.getWidth() * 0.5f) + this.f7572V.getLeft();
        this.f7593d1 = (((((this.f7630q.getWidth() * 0.5f) + this.f7630q.getLeft()) * 2.0f) - width) - 5.0f) - ((this.f7574W.getWidth() * 0.5f) + this.f7574W.getLeft());
        this.f7596e1 = ((this.f7572V.getHeight() * 0.5f) + this.f7572V.getTop()) - ((this.f7574W.getHeight() * 0.5f) + this.f7574W.getTop());
        if (this.f7574W == null || (imageView = this.f7630q) == null || imageView.getWidth() <= 0) {
            return;
        }
        ImageView imageView2 = this.f7630q;
        boolean z2 = imageView2 == m3813S0();
        float f5 = this.f7599f1;
        if (z2 && m3848m1()) {
            float[] fArr = new float[2];
            m3825c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m3850n0()) {
                f5 = this.f7599f1 * (1.0f - this.f7569T0);
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
            TextView textView2 = this.f7574W;
            m3755P0(textView2, m3868t0(textView2), m3871u0(this.f7574W));
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m3770f0(imageView2, f2, z2, fArr2, fArr3);
        TextView textView3 = this.f7574W;
        m3754I(textView3, f2, fArr2[0], fArr2[1], f3, f4, m3868t0(textView3) + fArr3[0], m3871u0(this.f7574W) + fArr3[1]);
    }

    /* renamed from: o1 */
    public final void m3854o1(float f2, float f3, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f7559O0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f7559O0);
        this.f7559O0.addUpdateListener(new C0174W(14, this));
        this.f7559O0.addListener(new C0181b0(this, 12, runnable));
        this.f7559O0.start();
    }

    /* renamed from: p */
    public final void m3855p(float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f7619m0 == null) {
            return;
        }
        Context context = this.f7588c;
        float f3 = context.getResources().getDisplayMetrics().density;
        float f4 = context.getResources().getDisplayMetrics().scaledDensity;
        float f5 = f3 * 14.0f * f2;
        float f6 = 10.0f * f3 * f2;
        this.f7619m0.setPadding(Math.round(f5), Math.round(f6), AbstractC0062j.m168v(f3, 16.0f, f2), Math.round(f6));
        if (this.f7634r0 != null) {
            int max = Math.max(1, Math.round(72.0f * f3 * f2));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7634r0.getLayoutParams();
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = max;
                marginLayoutParams2.height = max;
                marginLayoutParams2.setMarginEnd(Math.round(f5));
                this.f7634r0.setLayoutParams(marginLayoutParams2);
            }
        }
        TextView textView = this.f7637s0;
        if (textView != null) {
            AbstractC0062j.m164r(f4, 22.0f, f2, textView, 0);
        }
        TextView textView2 = this.f7639t0;
        if (textView2 != null) {
            AbstractC0062j.m164r(f4, 16.0f, f2, textView2, 0);
        }
        TextView textView3 = this.f7641u0;
        if (textView3 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView3, 0);
            this.f7641u0.setMinWidth(Math.round(f3 * 46.0f * f2));
        }
        TextView textView4 = this.f7643v0;
        if (textView4 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView4, 0);
            this.f7643v0.setMinWidth(Math.round(46.0f * f3 * f2));
        }
        ProgressBar progressBar = this.f7645w0;
        if (progressBar != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar.getLayoutParams()) != null) {
            marginLayoutParams.height = Math.max(1, Math.round(6.0f * f3 * f2));
            int round = Math.round(f3 * 8.0f * f2);
            marginLayoutParams.setMarginStart(round);
            marginLayoutParams.setMarginEnd(round);
            this.f7645w0.setLayoutParams(marginLayoutParams);
        }
        View view = this.f7619m0;
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

    /* renamed from: p0 */
    public final ImageView m3856p0() {
        return this.f7591d.f2636h2 ? this.f7630q : this.f7627p;
    }

    /* renamed from: p1 */
    public final void m3857p1(String str) {
        Context context = this.f7588c;
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

    /* renamed from: q */
    public final void m3858q(boolean z2) {
        int i;
        int i2;
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup == null || this.f7563Q0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7600g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7600g.post(new RunnableC1487J0(this, z2, 0));
            return;
        }
        m3816U();
        m3863r1();
        int round = Math.round(this.f7588c.getResources().getDisplayMetrics().density * 96.0f);
        float m3878w1 = m3878w1();
        float max = Math.max(0.0f, Math.min(1.0f, this.f7605h1));
        m3777B(m3878w1);
        m3873v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f7605h1, 0.0f, m3878w1()));
        m3839j(width, height, round, m3878w1);
        boolean z3 = m3878w1 > 0.001f;
        if (this.f7619m0 != null && this.f7591d.f2585W2 && !m3833g0() && !m3844l0()) {
            C0639g.m1872x().m1880u();
            if (C0639g.m1872x().m1880u().m1851a()) {
                if (max >= 0.999f) {
                    this.f7619m0.setAlpha(0.0f);
                    this.f7619m0.setVisibility(4);
                } else if (this.f7619m0.getVisibility() != 0) {
                    this.f7619m0.setVisibility(0);
                }
            }
        }
        View view = this.f7619m0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int i3 = width - 470;
        int max2 = Math.max(0, i3 / 2);
        int m4298b = AbstractC1561o.m4298b(height, round, 40, 0);
        if (!z3) {
            m3855p(1.0f);
            m3861r(this.f7619m0, round, max2, m4298b, max * 40.0f, z2);
            this.f7619m0.setAlpha(1.0f - max);
            this.f7619m0.bringToFront();
            View view2 = this.f7622n0;
            if (view2 != null) {
                view2.bringToFront();
                return;
            }
            return;
        }
        float f2 = ((-0.19999999f) * m3878w1) + 1.0f;
        m3855p(f2);
        int m152f = AbstractC0062j.m152f(round, f2, 1);
        ImageView m3856p0 = m3856p0();
        if (m3856p0 == null || m3856p0.getWidth() <= 0 || m3856p0.getHeight() <= 0) {
            i = max2;
            i2 = m4298b;
        } else {
            float f3 = this.f7599f1;
            float left = m3856p0.getLeft();
            float width2 = m3856p0.getWidth() * f3;
            float height2 = (m3856p0.getHeight() * f3) + m3856p0.getTop();
            float m149c = AbstractC0062j.m149c(width2, 470, 0.5f, left);
            float f4 = height2 + 23.0f;
            float max3 = Math.max(0.0f, (height - m152f) - 8.0f);
            if (f4 > max3) {
                f4 = max3;
            }
            float f5 = max2;
            int m151e = AbstractC0062j.m151e(m149c, f5, m3878w1, f5);
            float f6 = m4298b;
            int m151e2 = AbstractC0062j.m151e(f4, f6, m3878w1, f6);
            int max4 = Math.max(0, Math.min(m151e, Math.max(0, i3)));
            int max5 = Math.max(0, m151e2);
            i = max4;
            i2 = max5;
        }
        m3861r(this.f7619m0, m152f, i, i2, max * 40.0f, z2);
        this.f7619m0.setAlpha(1.0f - max);
        this.f7619m0.bringToFront();
        View view3 = this.f7622n0;
        if (view3 != null) {
            view3.bringToFront();
        }
    }

    /* renamed from: q0 */
    public final float m3859q0() {
        return this.f7591d.f2636h2 ? this.f7587b1 : this.f7584a1;
    }

    /* renamed from: q1 */
    public final boolean m3860q1() {
        return m3843k1() && m3810Q0().m4472a();
    }

    /* renamed from: r */
    public final void m3861r(View view, int i, int i2, int i3, float f2, boolean z2) {
        float f3 = this.f7533B0;
        if (f3 < 0.0f) {
            f3 = i2;
        }
        float f4 = f3 + 0.0f;
        float f5 = this.f7535C0;
        float f6 = f5 >= 0.0f ? f5 + this.f7537D0 : i3 + f2;
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
        if (z2 && this.f7535C0 >= 0.0f && z3) {
            view.animate().cancel();
            view.setTranslationX(f4 - f7);
            view.setTranslationY(f6 - f8);
            view.animate().translationX(0.0f).translationY(f2).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            view.animate().cancel();
            view.setTranslationX(0.0f);
            view.setTranslationY(f2);
        }
        this.f7533B0 = f7;
        this.f7535C0 = f8;
        this.f7537D0 = f2;
    }

    /* renamed from: r0 */
    public final void m3862r0(String str, Consumer consumer) {
        AbstractC1354s1.m3252a(this.f7588c, str, new C1562o0(consumer, 3), this.f7597f, 0);
    }

    /* renamed from: r1 */
    public final void m3863r1() {
        View view;
        ViewGroup viewGroup;
        View view2;
        TextView textView = this.f7556N;
        boolean z2 = textView != null && textView.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f7568T;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = z2 || z3;
        View view3 = this.f7558O;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        int m3817V = m3817V();
        View view4 = this.f7558O;
        if (view4 != null) {
            if (!z2 || m3817V <= 0) {
                view4.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    view4.setLayoutParams(layoutParams);
                }
            } else {
                m3763Z0(view4, m3817V);
                View view5 = this.f7558O;
                if (view5 instanceof LinearLayout) {
                    ((LinearLayout) view5).setGravity(17);
                }
                TextView textView2 = this.f7556N;
                if (textView2 != null) {
                    AbstractC1539g1.m4223j(textView2, this.f7558O);
                }
            }
        }
        ViewGroup viewGroup3 = this.f7568T;
        if (viewGroup3 != null) {
            if (z3 && m3817V > 0) {
                TextView textView3 = this.f7570U;
                if (textView3 != null) {
                    int round = Math.round(textView3.getPaint().measureText("000       000")) + this.f7568T.getPaddingEnd() + this.f7568T.getPaddingStart();
                    if (round > 0) {
                        this.f7568T.setMinimumWidth(round);
                    }
                }
                m3763Z0(this.f7568T, m3817V);
            } else if (z3 && z2 && (view2 = this.f7558O) != null) {
                view2.post(new RunnableC1479F0(this, 7));
            } else {
                viewGroup3.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    viewGroup3.setLayoutParams(layoutParams2);
                }
            }
        }
        boolean z5 = (z2 && z3) || m3782C1() || m3878w1() > 0.001f;
        View view6 = this.f7628p0;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams3 = view6.getLayoutParams() instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) this.f7628p0.getLayoutParams() : null;
            if (z5) {
                this.f7628p0.setVisibility(0);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 1.0f;
                    this.f7628p0.setLayoutParams(layoutParams3);
                }
            } else {
                this.f7628p0.setVisibility(8);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 0.0f;
                    this.f7628p0.setLayoutParams(layoutParams3);
                }
            }
        }
        View view7 = this.f7625o0;
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
        boolean m3782C1 = m3782C1();
        View view8 = this.f7625o0;
        if ((view8 instanceof ViewGroup) && (view = this.f7558O) != null && (viewGroup = this.f7568T) != null && this.f7628p0 != null) {
            ViewGroup viewGroup4 = (ViewGroup) view8;
            if (m3782C1) {
                view = viewGroup;
            }
            if (viewGroup4.getChildCount() < 1 || viewGroup4.getChildAt(0) != view) {
                viewGroup4.removeView(this.f7558O);
                viewGroup4.removeView(this.f7628p0);
                viewGroup4.removeView(this.f7568T);
                if (m3782C1) {
                    viewGroup4.addView(this.f7568T);
                    viewGroup4.addView(this.f7628p0);
                    viewGroup4.addView(this.f7558O);
                } else {
                    viewGroup4.addView(this.f7558O);
                    viewGroup4.addView(this.f7628p0);
                    viewGroup4.addView(this.f7568T);
                }
            }
        }
        if (m3782C1) {
            m3759W0(this.f7568T, 48);
            m3759W0(this.f7558O, 8388661);
        } else {
            m3759W0(this.f7558O, 48);
            m3759W0(this.f7568T, 8388661);
        }
        View view9 = this.f7625o0;
        if (view9 != null) {
            view9.setVisibility(z4 ? 0 : 8);
        }
        View view10 = this.f7622n0;
        if (view10 != null) {
            view10.setVisibility(z4 ? 0 : 8);
        }
    }

    /* renamed from: s */
    public final void m3864s(long j2) {
        boolean z2 = this.f7649y0 > 0;
        ProgressBar progressBar = this.f7645w0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7645w0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7649y0)));
            }
        }
        TextView textView = this.f7641u0;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7641u0.setText(m3761Y(j2));
            }
        }
        TextView textView2 = this.f7643v0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7643v0.setText(m3761Y(this.f7649y0));
            }
        }
    }

    /* renamed from: s0 */
    public final RectF m3865s0() {
        RectF rectF = new RectF();
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup != null && viewGroup.getWidth() > 0 && this.f7600g.getHeight() > 0) {
            float width = this.f7600g.getWidth() - 0.0f;
            float height = this.f7600g.getHeight();
            if (width > 0.0f && height > 0.0f) {
                rectF.set(0.0f, 0.0f, width, height);
            }
        }
        return rectF;
    }

    /* renamed from: s1 */
    public final void m3866s1(ImageView imageView, float f2, boolean z2, float f3, float f4) {
        ImageView imageView2 = imageView == this.f7627p ? this.f7638t : imageView == this.f7630q ? this.f7640u : null;
        if (imageView2 == null || imageView == null) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m3803M0(imageView2);
            C1572s c1572s = imageView2 == this.f7638t ? this.f7547I0 : this.f7549J0;
            if (c1572s != null) {
                c1572s.m4470a(imageView2);
                return;
            }
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m3770f0(imageView, f2, z2, fArr, fArr2);
        m3870u(imageView2, imageView, f2, fArr[0], fArr[1], fArr2[0] + f3, fArr2[1] + f4);
        C1572s c1572s2 = imageView2 == this.f7638t ? this.f7547I0 : this.f7549J0;
        if (c1572s2 != null) {
            c1572s2.m4470a(imageView2);
        }
    }

    /* renamed from: t */
    public final void m3867t() {
        ViewGroup viewGroup;
        if (this.f7603h == null || (viewGroup = this.f7600g) == null) {
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7600g.getHeight() <= 0) {
            this.f7600g.post(new RunnableC1479F0(this, 22));
            return;
        }
        if (this.f7603h.getLayoutParams() instanceof C1592d) {
            RectF m3865s0 = m3843k1() ? m3865s0() : m3806O();
            C1592d c1592d = (C1592d) this.f7603h.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m3865s0.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m3865s0.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m3865s0.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m3865s0.top);
            this.f7603h.setLayoutParams(c1592d);
            if (m3779B1() || m3785D1()) {
                this.f7603h.setVisibility(4);
            }
            if (m3785D1() || m3845l1()) {
                float f2 = this.f7588c.getResources().getDisplayMetrics().density * 14.0f;
                View view = this.f7615l;
                if (view == null) {
                    return;
                }
                m3769f(view, 25.0f + f2 + 10.0f);
                C1528d c1528d = this.f7621n;
                if (c1528d != null) {
                    c1528d.m4167b(f2);
                }
            }
        }
    }

    /* renamed from: t0 */
    public final float m3868t0(View view) {
        if (view == this.f7554M) {
            return this.f7590c1;
        }
        if (view == this.f7574W) {
            return this.f7593d1;
        }
        return 0.0f;
    }

    /* renamed from: t1 */
    public final void m3869t1() {
        ValueAnimator valueAnimator = this.f7608i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7608i1 = null;
        }
        this.f7611j1 = false;
        this.f7614k1 = -1;
        cfgData cfgdata = this.f7591d;
        boolean z2 = cfgdata.f2561Q2;
        Context context = this.f7588c;
        if (!z2) {
            if (cfgdata.f2635h1 != 0) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
            }
            this.f7599f1 = m3875v1();
            this.f7602g1 = 1.0f;
            this.f7605h1 = 0.0f;
            m3783D();
            return;
        }
        if (m3847m0() && cfgdata.f2635h1 == 1) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        if (m3844l0() && cfgdata.f2635h1 != 0) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        this.f7599f1 = m3850n0() ? m3875v1() : 1.0f;
        this.f7602g1 = m3788E1() ? 1.0f : 0.0f;
        this.f7605h1 = cfgdata.f2635h1 == 2 ? 1.0f : 0.0f;
        m3783D();
        if (m3850n0()) {
            ImageView m3856p0 = m3856p0();
            if (m3856p0 == null) {
                m3856p0 = m3813S0();
            }
            if (m3856p0 == null || m3856p0.getWidth() > 0) {
                return;
            }
            m3856p0.post(new RunnableC1479F0(this, 12));
        }
    }

    /* renamed from: u */
    public final void m3870u(ImageView imageView, ImageView imageView2, float f2, float f3, float f4, float f5, float f6) {
        if (imageView == null || imageView2 == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1479F0(this, 4));
            return;
        }
        float width = (imageView2.getWidth() * 0.5f) + imageView2.getLeft();
        float m149c = AbstractC0062j.m149c(width, f3, f2, f3);
        imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setTranslationX((m149c - ((imageView.getWidth() * 0.5f) + imageView.getLeft())) + f5);
        imageView.setTranslationY((AbstractC0062j.m149c((imageView2.getHeight() * 0.5f) + imageView2.getTop(), f4, f2, f4) - ((imageView.getHeight() * 0.5f) + imageView.getTop())) + f6 + 0.0f);
        ImageView imageView3 = this.f7633r;
        if (imageView == imageView3 || imageView == this.f7636s) {
            C1572s c1572s = imageView == imageView3 ? this.f7543G0 : this.f7545H0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m3789F(imageView);
        }
    }

    /* renamed from: u0 */
    public final float m3871u0(View view) {
        if (view == this.f7574W) {
            return this.f7596e1;
        }
        return 0.0f;
    }

    /* renamed from: u1 */
    public final void m3872u1(ImageView imageView, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (Math.abs(f2 - 1.0f) < 0.001f) {
            View[] m3823b0 = m3823b0(imageView);
            int length = m3823b0.length;
            for (int i = 0; i < length; i++) {
                View view = m3823b0[i];
                m3755P0(view, (view == this.f7554M ? m3797J0(f2) : m3868t0(view)) + f5 + f7, m3871u0(view) + f6 + f8);
            }
            return;
        }
        View[] m3823b02 = m3823b0(imageView);
        int length2 = m3823b02.length;
        for (int i2 = 0; i2 < length2; i2++) {
            View view2 = m3823b02[i2];
            m3754I(view2, f2, f3, f4, f5, f6, (view2 == this.f7554M ? m3797J0(f2) : m3868t0(view2)) + f7, m3871u0(view2) + f8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0216  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3873v(int i, int i2, int i3, float f2) {
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
        View view4 = this.f7622n0;
        if (view4 == null || view4.getVisibility() != 0) {
            return;
        }
        View view5 = this.f7558O;
        boolean z2 = view5 != null && view5.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f7568T;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = (z2 ^ z3) && !(m3782C1() || (m3878w1() > 0.001f ? 1 : (m3878w1() == 0.001f ? 0 : -1)) > 0);
        int m3817V = m3817V();
        if (m3817V <= 0 || (!z2 && !z3)) {
            if (!z2 || (view = this.f7558O) == null) {
                m3817V = 0;
            } else if (view.getHeight() > 0) {
                m3817V = Math.max(0, this.f7558O.getHeight());
            } else {
                this.f7558O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                m3817V = Math.max(0, this.f7558O.getMeasuredHeight());
            }
            if (z3 && (viewGroup = this.f7568T) != null) {
                if (viewGroup.getHeight() > 0) {
                    max = Math.max(m3817V, this.f7568T.getHeight());
                } else {
                    this.f7568T.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    max = Math.max(m3817V, this.f7568T.getMeasuredHeight());
                }
                m3817V = max;
            }
        }
        if (m3817V <= 0) {
            View view6 = this.f7625o0;
            if (view6 != null && view6.getVisibility() == 0 && this.f7625o0.getHeight() > 0) {
                m3817V = this.f7625o0.getHeight();
            } else if (this.f7622n0.getHeight() > 0) {
                m3817V = this.f7622n0.getHeight();
            }
        }
        if (m3817V <= 0) {
            this.f7622n0.post(new RunnableC1479F0(this, 8));
            return;
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float max3 = Math.max(0.0f, Math.min(1.0f, this.f7605h1));
        float f7 = (max2 * (-0.19999999f)) + 1.0f;
        if (z4) {
            View view7 = z2 ? this.f7558O : this.f7568T;
            if (view7 != null) {
                view7.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(m3817V, 1073741824));
                if (view7.getMeasuredWidth() > 0) {
                    i4 = view7.getMeasuredWidth();
                    float f8 = i4;
                    float f9 = f8 * f7;
                    float f10 = m3817V * f7;
                    int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
                    int i8 = i - i4;
                    int m152f = AbstractC0062j.m152f(i8, 0.5f, 0);
                    float f11 = m4298b - m3817V;
                    float f12 = 1.0f - max2;
                    int max4 = Math.max(0, Math.round(f11 - (27.0f * f12)));
                    if (max2 <= 0.001f) {
                        ImageView m3813S0 = m3813S0();
                        if (m3813S0 == null || m3813S0.getWidth() <= 0 || m3813S0.getHeight() <= 0) {
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
                            float m3875v1 = m3875v1();
                            float f15 = this.f7599f1;
                            float m149c = AbstractC0062j.m149c(m3875v1, f15, max3, f15);
                            f3 = f12;
                            f4 = f8;
                            float width = (((m3813S0.getWidth() * m149c) - f9) * 0.5f) + AbstractC0062j.m149c(1.0f, m149c, m3813S0.getWidth(), m3813S0.getLeft()) + 110.0f;
                            float height = (m3813S0.getHeight() * m149c) + m3813S0.getTop() + 23.0f + 70.0f;
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
                    view2 = this.f7622n0;
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
                        this.f7622n0.setLayoutParams(c1592d);
                        f5 = 0.0f;
                        float max7 = (Math.max(0.0f, Math.min(1.0f, max2)) * (-0.19999999f)) + 1.0f;
                        this.f7622n0.setPivotX(z4 ? 0.5f * f4 : 0.0f);
                        this.f7622n0.setPivotY(0.0f);
                        this.f7622n0.setScaleX(max7);
                        this.f7622n0.setScaleY(max7);
                        this.f7622n0.setTranslationX(0.0f);
                        this.f7622n0.setTranslationY(0.0f);
                    }
                    view3 = this.f7622n0;
                    if (view3 != null) {
                        view3.setTranslationX((-15.0f) * max2);
                        this.f7622n0.setTranslationY(f5);
                    }
                    if (this.f7558O != null) {
                        this.f7558O.setTranslationX((m3782C1() ? -50.0f : (-20.0f) * f3) - (7.0f * max3));
                        this.f7558O.setTranslationY(max3 * (-40.0f));
                    }
                    if (this.f7568T == null) {
                        if (m3782C1()) {
                            f6 = m3844l0() ? -235.0f : -215.0f;
                        } else {
                            f6 = ((z4 ? f5 : max2 * (-10.0f)) - (max2 * 15.0f)) - (f3 * 10.0f);
                        }
                        this.f7568T.setTranslationX(f6 - (20.0f * max3));
                        this.f7568T.setTranslationY(max3 * (-40.0f));
                        this.f7568T.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
        }
        i4 = 470;
        float f82 = i4;
        float f92 = f82 * f7;
        float f102 = m3817V * f7;
        int m4298b2 = AbstractC1561o.m4298b(i2, i3, 40, 0);
        int i82 = i - i4;
        int m152f2 = AbstractC0062j.m152f(i82, 0.5f, 0);
        float f112 = m4298b2 - m3817V;
        float f122 = 1.0f - max2;
        int max42 = Math.max(0, Math.round(f112 - (27.0f * f122)));
        if (max2 <= 0.001f) {
        }
        int round2 = m152f2 - Math.round(550.0f * max3);
        view2 = this.f7622n0;
        if (view2 != null) {
        }
        view3 = this.f7622n0;
        if (view3 != null) {
        }
        if (this.f7558O != null) {
        }
        if (this.f7568T == null) {
        }
    }

    /* renamed from: v0 */
    public final RectF m3874v0() {
        Rect m4239u = AbstractC1539g1.m4239u();
        ViewGroup viewGroup = this.f7600g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7600g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4208b0(m4239u, this.f7600g.getWidth(), this.f7600g.getHeight());
    }

    /* renamed from: v1 */
    public final float m3875v1() {
        ImageView m3856p0 = m3856p0();
        if (m3856p0 == null) {
            m3856p0 = m3813S0();
        }
        float f2 = this.f7588c.getResources().getDisplayMetrics().density * 87.0f;
        float width = (m3856p0 == null || m3856p0.getWidth() <= 0) ? 730.0f : m3856p0.getWidth();
        return Math.max(0.2f, (width - f2) / width);
    }

    /* renamed from: w */
    public final void m3876w() {
        m3882y();
        boolean m3821a0 = m3821a0();
        ImageView m3856p0 = m3856p0();
        cfgData cfgdata = this.f7591d;
        boolean z2 = cfgdata.f2636h2;
        ImageView imageView = z2 ? this.f7636s : this.f7633r;
        TextView textView = z2 ? this.f7592d0 : this.f7589c0;
        m3772i1(m3856p0, m3821a0);
        m3772i1(imageView, m3821a0);
        m3831f1(imageView, m3821a0);
        ImageView imageView2 = null;
        m3772i1(textView, m3821a0 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m3856p0 == this.f7627p) {
            imageView2 = this.f7638t;
        } else if (m3856p0 == this.f7630q) {
            imageView2 = this.f7640u;
        }
        m3772i1(imageView2, m3821a0);
        m3830e1(m3856p0, m3821a0);
        if (!m3821a0) {
            m3801L0();
        } else if (m3850n0()) {
            m3841k(m3856p0, imageView, textView, m3859q0(), false, this.f7599f1, 0.0f, 0.0f);
            m3866s1(m3856p0, this.f7599f1, false, 0.0f, 0.0f);
        } else {
            m3801L0();
            m3866s1(m3856p0, 1.0f, false, 0.0f, 0.0f);
        }
        m3858q(false);
        m3780C();
        m3836h0();
        m3879x();
    }

    /* renamed from: w0 */
    public final void m3877w0() {
        float f2 = this.f7588c.getResources().getDisplayMetrics().density * 6.0f;
        m3762Y0(this.f7627p, f2);
        m3762Y0(this.f7630q, f2);
        m3762Y0(this.f7633r, f2);
        m3762Y0(this.f7636s, f2);
        for (ImageView imageView : this.f7646x) {
            m3762Y0(imageView, f2);
        }
        for (ImageView imageView2 : this.f7648y) {
            m3762Y0(imageView2, f2);
        }
        m3762Y0(this.f7638t, f2);
        m3762Y0(this.f7640u, f2);
        m3762Y0(this.f7589c0, f2);
        m3762Y0(this.f7592d0, f2);
        m3762Y0(this.f7552L, f2);
        m3762Y0(this.f7572V, f2);
        m3762Y0(this.f7554M, f2);
        m3762Y0(this.f7556N, f2);
        m3762Y0(this.f7568T, f2);
        m3762Y0(this.f7622n0, f2);
        m3762Y0(this.f7619m0, f2);
        m3762Y0(this.f7550K, f2);
        m3762Y0(this.f7574W, f2);
        m3762Y0(this.f7612k, 2.0f);
        m3762Y0(this.f7615l, 2.0f);
        m3762Y0(this.f7618m, 2.0f);
        m3762Y0(this.f7624o, 0.0f);
    }

    /* renamed from: w1 */
    public final float m3878w1() {
        float m3875v1 = m3875v1();
        if (Math.abs(m3875v1 - 1.0f) < 0.001f) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (1.0f - this.f7599f1) / (1.0f - m3875v1)));
    }

    /* renamed from: x */
    public final void m3879x() {
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f7554M == null || (imageView = this.f7627p) == null) {
            return;
        }
        if (imageView.getWidth() <= 0) {
            this.f7627p.post(new RunnableC1479F0(this, 6));
            return;
        }
        ImageView imageView2 = this.f7627p;
        boolean z2 = imageView2 == m3813S0();
        float f5 = this.f7599f1;
        if (z2 && m3848m1()) {
            float[] fArr = new float[2];
            m3825c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m3850n0()) {
                f5 = this.f7599f1 * (1.0f - this.f7569T0);
            }
            f2 = f5;
            f4 = f7;
            f3 = f6;
        } else {
            f2 = f5;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        float m3797J0 = m3797J0(f2);
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m3755P0(this.f7554M, m3797J0, 0.0f);
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m3770f0(imageView2, f2, z2, fArr2, fArr3);
        m3754I(this.f7554M, f2, fArr2[0], fArr2[1], f3, f4, m3797J0 + fArr3[0], fArr3[1]);
    }

    /* renamed from: x0 */
    public final void m3880x0() {
        float max;
        float m1789h;
        float f2;
        int i;
        AbstractC1539g1.m4228l0(this.f7600g, !this.f7555M0);
        C1572s c1572s = this.f7543G0;
        c1572s.f8681g = Math.max(c1572s.f8676b, Math.min(c1572s.f8677c, m3829e0()));
        C1572s c1572s2 = this.f7545H0;
        c1572s2.f8681g = Math.max(c1572s2.f8676b, Math.min(c1572s2.f8677c, m3827d0()));
        float m3829e0 = m3829e0();
        float m3827d0 = m3827d0();
        TextView textView = this.f7589c0;
        cfgData cfgdata = this.f7591d;
        int i2 = f7527s1;
        if (textView != null) {
            textView.setTextColor(m3829e0 > cfgdata.f2568S1 ? -65536 : m3829e0 > cfgdata.f2564R1 ? -256 : i2);
            this.f7589c0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m3829e0)).replace(",", "."));
        }
        TextView textView2 = this.f7592d0;
        if (textView2 != null) {
            textView2.setTextColor(m3827d0 > cfgdata.f2576U1 ? -65536 : m3827d0 > cfgdata.f2572T1 ? -256 : i2);
            this.f7592d0.setText(AbstractC1256E0.m2986A(m3827d0));
        }
        m3794H0();
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f7594e;
        if (z2) {
            float f3 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            float m1776v = cardata.m1776v();
            max = cfgdata.m1786e(m1775u, m1776v, f3);
            f2 = cfgdata.m1787f(m1775u, m1776v, f3);
            m1789h = max;
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            m1789h = cfgdata.m1789h() * max;
            f2 = max;
        }
        C1572s c1572s3 = this.f7547I0;
        if (c1572s3 != null) {
            c1572s3.f8681g = Math.max(c1572s3.f8676b, Math.min(c1572s3.f8677c, f2));
        }
        TextView textView3 = this.f7552L;
        if (textView3 != null) {
            m3760X0(textView3, m1789h, "L", max < 15.0f ? -65536 : max < 30.0f ? -256 : i2);
        }
        int i3 = max < 15.0f ? -65536 : max < 30.0f ? -256 : i2;
        if (this.f7554M != null) {
            if (!m3821a0() || cfgdata.f2543M0.f7147f) {
                this.f7554M.setVisibility(4);
            } else {
                this.f7554M.setVisibility(0);
                float m1777w = cardata.m1777w();
                if (m1777w < 0.0f) {
                    SpannableString spannableString = new SpannableString("--km");
                    spannableString.setSpan(AbstractC0062j.m155i(this.f7554M, -7829368, i3), 0, 2, 33);
                    this.f7554M.setText(spannableString);
                } else {
                    m3760X0(this.f7554M, m1777w, "km", i3);
                }
            }
        }
        float m1743d = cardata.m1743d();
        C1572s c1572s4 = this.f7549J0;
        if (c1572s4 != null) {
            float f4 = c1572s4.f8676b;
            float f5 = c1572s4.f8677c;
            if (m1743d < -90.0f) {
                c1572s4.f8681g = Math.max(f4, Math.min(f5, 40.0f));
            } else {
                c1572s4.f8681g = Math.max(f4, Math.min(f5, m1743d));
            }
        }
        TextView textView4 = this.f7572V;
        if (textView4 != null) {
            if (m1743d < -90.0f) {
                textView4.setText("--°C");
                this.f7572V.setTextColor(-7829368);
            } else {
                if (m1743d < 40.0f) {
                    i2 = -16776961;
                } else if (m1743d > 112.0f) {
                    i2 = -65536;
                } else if (m1743d > 107.0f) {
                    i2 = -256;
                }
                m3760X0(textView4, m1743d, "°C", i2);
                m3853o0();
            }
        }
        float m1765o = cardata.m1765o();
        TextView textView5 = this.f7532B;
        if (textView5 != null) {
            textView5.setTextColor(-1);
            this.f7532B.setText(m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L");
        }
        if (this.f7534C != null) {
            this.f7534C.setText(this.f7585b.getContext().getString((cardata.m1780z() > 0.0f ? 1 : (cardata.m1780z() == 0.0f ? 0 : -1)) > 0 ? R.string.ip_theme_41_inst_fuel_unit_l100 : R.string.ip_theme_41_inst_fuel_unit_lph));
        }
        m3766b1(this.f7538E, cardata.m1739b());
        m3766b1(this.f7544H, cardata.m1737a());
        m3886z0();
        m3790F0();
        if (this.f7570U != null) {
            String str = ((double) cardata.m1715C()) <= 10.0d ? "%.1f" : "%.0f";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float[] fArr = {cardata.m1715C(), cardata.m1716D(), cardata.m1717E(), cardata.m1718F()};
            String[] strArr = {"       ", "\n", "       ", ""};
            for (int i4 = 0; i4 < 4; i4++) {
                float f6 = fArr[i4];
                String replace = (f6 == -99.0f || f6 == 3.5f) ? "--" : String.format(Locale.ENGLISH, str, Float.valueOf(f6)).replace(",", ".");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) replace);
                if (f6 == -99.0f) {
                    i = -16776961;
                } else {
                    float f7 = cfgdata.f2580V1;
                    i = f6 < 0.95f * f7 ? -65536 : f6 < f7 ? -256 : -1;
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 33);
                if (i4 < 3) {
                    spannableStringBuilder.append((CharSequence) strArr[i4]);
                }
            }
            this.f7570U.setText(spannableStringBuilder);
        }
        m3792G0();
        m3787E0();
        m3781C0();
        TextView textView6 = this.f7578Y;
        if (textView6 == null) {
            return;
        }
        textView6.setText(AbstractC1372y1.m3307m(this.f7588c));
    }

    /* renamed from: x1 */
    public final void m3881x1(boolean z2) {
        this.f7597f.removeCallbacks(this.f7565R0);
        if (z2 && AbstractC1372y1.m3272C()) {
            m3805N0();
            return;
        }
        if (!m3842k0()) {
            m3805N0();
            return;
        }
        m3802M();
        if (z2) {
            AbstractC1372y1.m3287R(true, true);
            m3804N();
            this.f7557N0 = false;
            this.f7569T0 = 0.0f;
            if (m3840j0()) {
                m3776A1();
            } else {
                m3883y0();
            }
            m3876w();
            m3854o1(0.0f, 1.0f, new RunnableC1479F0(this, 10));
            return;
        }
        if (m3848m1() && this.f7569T0 > 0.0f) {
            m3876w();
            m3854o1(this.f7569T0, 0.0f, new RunnableC1479F0(this, 11));
        } else {
            this.f7557N0 = true;
            this.f7569T0 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m3796J();
        }
    }

    /* renamed from: y */
    public final void m3882y() {
        boolean z2;
        boolean z3 = m3821a0() && (((z2 = this.f7557N0) && this.f7569T0 <= 0.0f) || z2 || this.f7569T0 < 1.0f);
        ImageView m3813S0 = m3813S0();
        cfgData cfgdata = this.f7591d;
        boolean z4 = cfgdata.f2636h2;
        ImageView imageView = z4 ? this.f7633r : this.f7636s;
        TextView textView = z4 ? this.f7589c0 : this.f7592d0;
        m3772i1(m3813S0, z3);
        m3772i1(imageView, z3);
        m3831f1(imageView, z3);
        ImageView imageView2 = null;
        m3772i1(textView, z3 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m3813S0 == this.f7627p) {
            imageView2 = this.f7638t;
        } else if (m3813S0 == this.f7630q) {
            imageView2 = this.f7640u;
        }
        m3772i1(imageView2, z3);
        m3830e1(m3813S0, z3);
        if (!z3) {
            m3807O0();
            return;
        }
        if (m3850n0()) {
            float[] fArr = new float[2];
            m3825c0(fArr);
            float f2 = (1.0f - this.f7569T0) * this.f7599f1;
            m3841k(m3813S0, imageView, textView, m3815T0(), true, f2, fArr[0], fArr[1]);
            m3866s1(m3813S0, f2, true, fArr[0], fArr[1]);
            return;
        }
        boolean z5 = this.f7557N0;
        float f3 = (!z5 || this.f7569T0 > 0.0f) ? this.f7569T0 : 0.0f;
        float max = (!z5 || this.f7569T0 > 0.0f) ? Math.max(0.0f, 1.0f - this.f7569T0) : 1.0f;
        if (f3 <= 0.0f && Math.abs(max - 1.0f) < 0.001f) {
            m3807O0();
            m3866s1(m3813S0, 1.0f, true, 0.0f, 0.0f);
            return;
        }
        ImageView m3813S02 = m3813S0();
        if (m3813S02 != null) {
            if (m3813S02.getWidth() <= 0 || m3813S02.getHeight() <= 0) {
                m3813S02.post(new RunnableC1479F0(this, 4));
            } else {
                float[] fArr2 = {this.f7575W0 ? this.f7571U0 : m3813S02.getLeft() + (m3813S02.getWidth() * 0.5f), this.f7575W0 ? this.f7573V0 : (m3813S02.getHeight() * 0.5f) + m3813S02.getTop()};
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float[] fArr3 = new float[2];
                m3825c0(fArr3);
                boolean z6 = cfgdata.f2636h2;
                ImageView imageView3 = z6 ? this.f7633r : this.f7636s;
                TextView textView2 = z6 ? this.f7589c0 : this.f7592d0;
                float m3815T0 = m3815T0();
                float f6 = max;
                m3754I(m3813S02, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
                m3870u(imageView3, m3813S02, max, f4, f5, fArr3[0], fArr3[1]);
                m3754I(textView2, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, m3815T0);
                m3872u1(m3813S02, max, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
            }
        }
        m3866s1(m3813S0, max, true, 0.0f, 0.0f);
    }

    /* renamed from: y0 */
    public final void m3883y0() {
        C1525c c1525c;
        if (this.f7600g == null) {
            return;
        }
        try {
            if (!this.f7591d.f2561Q2 && !m3844l0()) {
                m3809Q();
                return;
            }
            if (!m3779B1()) {
                if (m3840j0()) {
                    m3812S();
                }
                ViewGroup viewGroup = this.f7600g;
                if (viewGroup != null) {
                    viewGroup.setLayerType(0, null);
                }
                View view = this.f7603h;
                if (view != null) {
                    view.setVisibility(8);
                }
                m3885z();
                return;
            }
            if (!m3840j0()) {
                m3849n();
                m3867t();
                return;
            }
            C1574t m3810Q0 = m3810Q0();
            if (m3860q1()) {
                C1525c c1525c2 = this.f7626o1;
                if (c1525c2 != null && c1525c2.m4161c()) {
                    m3838i0();
                    m3852o();
                }
            } else if (m3810Q0.m4472a() && (c1525c = this.f7626o1) != null && !c1525c.m4161c()) {
                m3849n();
                return;
            }
            m3867t();
            m3776A1();
        } finally {
            m3786E();
        }
    }

    /* renamed from: y1 */
    public final ImageView[] m3884y1(ImageView imageView) {
        if (imageView == this.f7633r) {
            return this.f7646x;
        }
        if (imageView == this.f7636s) {
            return this.f7648y;
        }
        return null;
    }

    /* renamed from: z */
    public final void m3885z() {
        ViewGroup viewGroup = this.f7600g;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        if (this.f7624o == null) {
            ViewGroup viewGroup2 = this.f7600g;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(m3843k1() ? -15985376 : -16777216);
                return;
            }
            return;
        }
        C1574t m3810Q0 = m3810Q0();
        this.f7624o.setVisibility(0);
        this.f7624o.setLayerType(0, null);
        this.f7624o.setTranslationY(0.0f);
        this.f7624o.setBackground(null);
        if (!m3810Q0.m4472a()) {
            this.f7624o.setImageDrawable(null);
            this.f7624o.setBackgroundResource(R.drawable.ip_theme_50_bg);
            return;
        }
        int i = m3810Q0.f8687b;
        if (i != 0) {
            this.f7624o.setImageResource(i);
            return;
        }
        Uri uri = m3810Q0.f8688c;
        if (uri != null) {
            this.f7624o.setImageURI(uri);
        }
    }

    /* renamed from: z0 */
    public final void m3886z0() {
        TextView textView = this.f7574W;
        if (textView == null) {
            return;
        }
        textView.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(this.f7594e.m1741c())));
        m3853o0();
    }

    /* renamed from: z1 */
    public final void m3887z1() {
        cfgData cfgdata = this.f7591d;
        int i = (cfgdata.f2537K2 && cfgdata.f2589X2 && m3821a0() && !AbstractC1539g1.m4194P(cfgdata, this.f7594e)) ? 0 : 8;
        ImageView imageView = this.f7613k0;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.f7616l0;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
    }
}
