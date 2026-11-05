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

/* renamed from: u0.x0 */
/* loaded from: classes.dex */
public final class C1583x0 {

    /* renamed from: s1 */
    public static final int f8844s1 = Color.rgb(244, 246, 248);

    /* renamed from: t1 */
    public static final int f8845t1 = Color.rgb(200, 204, 212);

    /* renamed from: u1 */
    public static final int f8846u1 = R.drawable.ip_theme_48_media_frame;

    /* renamed from: A0 */
    public long f8848A0;

    /* renamed from: B */
    public TextView f8849B;

    /* renamed from: C */
    public TextView f8851C;

    /* renamed from: D */
    public TextView f8853D;

    /* renamed from: D0 */
    public float f8854D0;

    /* renamed from: E */
    public TextView f8855E;

    /* renamed from: E0 */
    public boolean f8856E0;

    /* renamed from: F */
    public TextView f8857F;

    /* renamed from: F0 */
    public C1531e f8858F0;

    /* renamed from: G */
    public TextView f8859G;

    /* renamed from: G0 */
    public C1572s f8860G0;

    /* renamed from: H */
    public TextView f8861H;

    /* renamed from: H0 */
    public C1572s f8862H0;

    /* renamed from: I */
    public TextView f8863I;

    /* renamed from: I0 */
    public C1572s f8864I0;

    /* renamed from: J */
    public TextView f8865J;

    /* renamed from: J0 */
    public C1572s f8866J0;

    /* renamed from: K */
    public View f8867K;

    /* renamed from: K0 */
    public boolean f8868K0;

    /* renamed from: L */
    public TextView f8869L;

    /* renamed from: L0 */
    public boolean f8870L0;

    /* renamed from: M */
    public TextView f8871M;

    /* renamed from: N */
    public TextView f8873N;

    /* renamed from: O */
    public View f8875O;

    /* renamed from: O0 */
    public ValueAnimator f8876O0;

    /* renamed from: P */
    public ViewGroup f8877P;

    /* renamed from: P0 */
    public ValueAnimator f8878P0;

    /* renamed from: Q */
    public TextView f8879Q;

    /* renamed from: Q0 */
    public boolean f8880Q0;

    /* renamed from: R */
    public TextView f8881R;

    /* renamed from: S */
    public TextView f8883S;

    /* renamed from: T */
    public ViewGroup f8885T;

    /* renamed from: U */
    public TextView f8887U;

    /* renamed from: U0 */
    public float f8888U0;

    /* renamed from: V */
    public TextView f8889V;

    /* renamed from: V0 */
    public float f8890V0;

    /* renamed from: W */
    public TextView f8891W;

    /* renamed from: W0 */
    public boolean f8892W0;

    /* renamed from: X */
    public TextView f8893X;

    /* renamed from: X0 */
    public Boolean f8894X0;

    /* renamed from: Y */
    public TextView f8895Y;

    /* renamed from: Z */
    public TextView f8897Z;

    /* renamed from: Z0 */
    public Boolean f8898Z0;

    /* renamed from: a */
    public final C1537g f8899a;

    /* renamed from: a0 */
    public ImageView f8900a0;

    /* renamed from: a1 */
    public float f8901a1;

    /* renamed from: b */
    public final View f8902b;

    /* renamed from: b0 */
    public ImageView f8903b0;

    /* renamed from: b1 */
    public float f8904b1;

    /* renamed from: c */
    public final Context f8905c;

    /* renamed from: c0 */
    public TextView f8906c0;

    /* renamed from: c1 */
    public float f8907c1;

    /* renamed from: d0 */
    public TextView f8909d0;

    /* renamed from: d1 */
    public float f8910d1;

    /* renamed from: e0 */
    public TextView f8912e0;

    /* renamed from: e1 */
    public float f8913e1;

    /* renamed from: f0 */
    public TextView f8915f0;

    /* renamed from: g */
    public ViewGroup f8917g;

    /* renamed from: g0 */
    public View f8918g0;

    /* renamed from: h */
    public View f8920h;

    /* renamed from: h0 */
    public ImageView f8921h0;

    /* renamed from: i */
    public View f8923i;

    /* renamed from: i0 */
    public TextView f8924i0;

    /* renamed from: i1 */
    public ValueAnimator f8925i1;

    /* renamed from: j */
    public View f8926j;

    /* renamed from: j0 */
    public ImageView f8927j0;

    /* renamed from: j1 */
    public boolean f8928j1;

    /* renamed from: k */
    public View f8929k;

    /* renamed from: k0 */
    public ImageView f8930k0;

    /* renamed from: l */
    public View f8932l;

    /* renamed from: l0 */
    public ImageView f8933l0;

    /* renamed from: l1 */
    public Boolean f8934l1;

    /* renamed from: m */
    public View f8935m;

    /* renamed from: m0 */
    public View f8936m0;

    /* renamed from: m1 */
    public float f8937m1;

    /* renamed from: n */
    public C1528d f8938n;

    /* renamed from: n0 */
    public View f8939n0;

    /* renamed from: o */
    public ImageView f8941o;

    /* renamed from: o0 */
    public View f8942o0;

    /* renamed from: o1 */
    public C1525c f8943o1;

    /* renamed from: p */
    public ImageView f8944p;

    /* renamed from: p0 */
    public View f8945p0;

    /* renamed from: q */
    public ImageView f8947q;

    /* renamed from: q0 */
    public int f8948q0;

    /* renamed from: r */
    public ImageView f8950r;

    /* renamed from: r0 */
    public ImageView f8951r0;

    /* renamed from: s */
    public ImageView f8953s;

    /* renamed from: s0 */
    public TextView f8954s0;

    /* renamed from: t */
    public ImageView f8955t;

    /* renamed from: t0 */
    public TextView f8956t0;

    /* renamed from: u */
    public ImageView f8957u;

    /* renamed from: u0 */
    public TextView f8958u0;

    /* renamed from: v */
    public Bitmap f8959v;

    /* renamed from: v0 */
    public TextView f8960v0;

    /* renamed from: w */
    public Bitmap f8961w;

    /* renamed from: w0 */
    public ProgressBar f8962w0;

    /* renamed from: x0 */
    public long f8964x0;

    /* renamed from: y0 */
    public long f8966y0;

    /* renamed from: z0 */
    public boolean f8968z0;

    /* renamed from: d */
    public final cfgData f8908d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f8911e = carData.getInstance();

    /* renamed from: f */
    public final Handler f8914f = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    public ImageView[] f8963x = new ImageView[0];

    /* renamed from: y */
    public ImageView[] f8965y = new ImageView[0];

    /* renamed from: z */
    public final float[] f8967z = new float[0];

    /* renamed from: A */
    public final float[] f8847A = new float[0];

    /* renamed from: B0 */
    public float f8850B0 = -1.0f;

    /* renamed from: C0 */
    public float f8852C0 = -1.0f;

    /* renamed from: M0 */
    public boolean f8872M0 = true;

    /* renamed from: N0 */
    public boolean f8874N0 = true;

    /* renamed from: R0 */
    public final RunnableC1571r0 f8882R0 = new RunnableC1571r0(this, 17);

    /* renamed from: S0 */
    public boolean f8884S0 = false;

    /* renamed from: T0 */
    public float f8886T0 = 0.0f;

    /* renamed from: Y0 */
    public int f8896Y0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: f1 */
    public float f8916f1 = 1.0f;

    /* renamed from: g1 */
    public float f8919g1 = 0.0f;

    /* renamed from: h1 */
    public float f8922h1 = 0.0f;

    /* renamed from: k1 */
    public int f8931k1 = -1;

    /* renamed from: n1 */
    public int f8940n1 = 999;

    /* renamed from: p1 */
    public final RunnableC1581w0 f8946p1 = new RunnableC1581w0(this, 0);

    /* renamed from: q1 */
    public final RunnableC1581w0 f8949q1 = new RunnableC1581w0(this, 1);

    /* renamed from: r1 */
    public final RunnableC1581w0 f8952r1 = new RunnableC1581w0(this, 2);

    public C1583x0(C1537g c1537g, View view) {
        this.f8899a = c1537g;
        this.f8902b = view;
        this.f8905c = view.getContext();
    }

    /* renamed from: A */
    public static void m4606A(View view, float f2, float f3) {
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
    public static void m4607I(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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

    /* renamed from: N0 */
    public static void m4608N0(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    /* renamed from: R */
    public static ImageView[] m4609R(ImageView imageView) {
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

    /* renamed from: S0 */
    public static RectF m4610S0(RectF rectF, float f2) {
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

    /* renamed from: T0 */
    public static void m4611T0(View view, boolean z2, float f2, boolean z3) {
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

    /* renamed from: U0 */
    public static void m4612U0(View view, int i) {
        if (view == null || !(view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: V0 */
    public static void m4613V0(TextView textView, float f2, String str, int i) {
        if (textView == null) {
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, str));
        spannableString.setSpan(AbstractC0062j.m155i(textView, -7829368, i), 0, replace.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: W0 */
    public static void m4614W0(View view, float f2) {
        if (view != null) {
            view.setElevation(f2);
        }
    }

    /* renamed from: X0 */
    public static void m4615X0(View view, int i) {
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

    /* renamed from: Y */
    public static String m4616Y(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: Y0 */
    public static void m4617Y0(View view, float f2) {
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

    /* renamed from: Z0 */
    public static void m4618Z0(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(-1);
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: a */
    public static void m4619a(C1583x0 c1583x0, ImageView[] imageViewArr, float[] fArr, float f2, float f3) {
        c1583x0.getClass();
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
    public static void m4620a1(TextView textView, float f2, float f3) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, f2 * f3);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(0.0f, 1.0f);
    }

    /* renamed from: b1 */
    public static void m4621b1(View view, int i) {
        if (view != null) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: d0 */
    public static void m4622d0(ImageView imageView, float f2, boolean z2, float[] fArr, float[] fArr2) {
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4623f(View view, float f2) {
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

    /* renamed from: f1 */
    public static void m4624f1(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: g1 */
    public static void m4625g1(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: h1 */
    public static void m4626h1(ImageView imageView, C1572s c1572s) {
        if (imageView == null || c1572s == null) {
            return;
        }
        imageView.post(new RunnableC1559n0(imageView, 1, c1572s));
    }

    /* renamed from: l */
    public static void m4627l(ImageView imageView, boolean z2) {
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
    public final void m4628A0() {
        TextView textView = this.f8893X;
        if (textView == null) {
            return;
        }
        if (!this.f8908d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f8911e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f8893X.setVisibility(4);
            return;
        }
        this.f8893X.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f8893X, -7829368, -1), 0, replace.length(), 33);
        this.f8893X.setText(spannableString);
    }

    /* renamed from: A1 */
    public final boolean m4629A1() {
        return m4690j0() || m4693k0() || m4695l0() || this.f8908d.f2635h1 == 2;
    }

    /* renamed from: B */
    public final void m4630B(float f2) {
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, f2));
        if (m4690j0()) {
            max = 1.0f;
        }
        m4617Y0(this.f8936m0, max);
        m4617Y0(this.f8867K, max);
        float max2 = Math.max(0.0f, Math.min(1.0f, this.f8922h1));
        if (max2 > 0.001f) {
            m4680e1(this.f8875O, max2);
            m4680e1(this.f8885T, max2);
        } else {
            m4617Y0(this.f8875O, max);
            m4617Y0(this.f8885T, max);
        }
    }

    /* renamed from: B0 */
    public final void m4631B0(C0636d c0636d) {
        View view = this.f8936m0;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        if (!this.f8908d.f2585W2 || m4679e0() || m4690j0() || c0636d == null || !c0636d.m1851a()) {
            this.f8936m0.setVisibility(8);
            this.f8936m0.setAlpha(1.0f);
            m4708p1();
            m4709q(false);
            return;
        }
        this.f8936m0.setVisibility(this.f8922h1 >= 0.999f ? 4 : 0);
        if (this.f8922h1 >= 0.999f) {
            this.f8936m0.setAlpha(0.0f);
        }
        TextView textView = this.f8954s0;
        if (textView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f8956t0;
        if (textView2 != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            this.f8956t0.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f8951r0;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f8951r0.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f8951r0.setVisibility(8);
            }
        }
        this.f8966y0 = c0636d.f3002h;
        this.f8964x0 = c0636d.f3001g;
        this.f8968z0 = c0636d.f3000f;
        this.f8848A0 = SystemClock.elapsedRealtime();
        m4715s(this.f8964x0);
        m4708p1();
        m4709q(false);
    }

    /* renamed from: B1 */
    public final boolean m4632B1() {
        return m4695l0() || this.f8908d.f2635h1 == 2 || this.f8919g1 > 0.001f || this.f8922h1 > 0.001f || this.f8916f1 < 0.999f;
    }

    /* renamed from: C */
    public final void m4633C() {
        if (this.f8916f1 < 0.999f) {
            return;
        }
        m4701n0();
        m4704o0();
        m4669Z(this.f8916f1);
        m4661Q0();
        m4662R0();
        m4669Z(this.f8916f1);
        m4698m0();
    }

    /* renamed from: C0 */
    public final void m4634C0() {
        ImageView imageView = this.f8900a0;
        carData cardata = this.f8911e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f8903b0 != null) {
            this.f8903b0.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f8903b0.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
    }

    /* renamed from: C1 */
    public final boolean m4635C1() {
        cfgData cfgdata = this.f8908d;
        int i = cfgdata.f2635h1;
        if (i == 0) {
            return true;
        }
        return i == 2 && AbstractC1539g1.m4194P(cfgdata, this.f8911e);
    }

    /* renamed from: D */
    public final void m4636D() {
        boolean m4632B1 = m4632B1();
        Boolean bool = this.f8934l1;
        if (bool == null || bool.booleanValue() != m4632B1) {
            this.f8934l1 = Boolean.valueOf(m4632B1);
            m4728w0();
        }
        if (m4632B1 && m4738z1()) {
            m4718t();
            m4735y1();
        } else if (!m4693k0() && !m4690j0() && !m4694k1()) {
            m4667W();
        }
        float m4297a = m4632B1 ? AbstractC1561o.m4297a(1.0f, this.f8922h1, 0.0f, this.f8919g1) : 0.0f;
        if (m4690j0() || m4679e0()) {
            m4624f1(this.f8929k);
            m4624f1(this.f8932l);
            m4624f1(this.f8935m);
        } else {
            float f2 = this.f8905c.getResources().getDisplayMetrics().density;
            float f3 = (80.0f * f2) + 10.0f;
            float f4 = f2 * 14.0f;
            boolean z2 = (!m4632B1() || m4691j1() || m4690j0()) ? false : true;
            float f5 = z2 ? 0.0f : f4;
            m4623f(this.f8929k, f3);
            m4623f(this.f8935m, f3);
            View view = this.f8932l;
            if (view != null) {
                m4623f(view, f5 + 25.0f + 10.0f);
                C1528d c1528d = this.f8938n;
                if (c1528d != null) {
                    c1528d.m4167b(f5);
                }
            }
            m4606A(this.f8929k, m4297a, f3);
            m4606A(this.f8932l, m4297a, f5 + 25.0f + 10.0f);
            m4606A(this.f8935m, m4297a, f3);
            float max = z2 ? Math.max(14.0f, (f3 - 10.0f) - 25.0f) : 14.0f;
            m4611T0(this.f8929k, true, max, z2);
            m4611T0(this.f8935m, false, max, z2);
        }
        if (m4632B1) {
            View view2 = this.f8929k;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.f8932l;
            if (view3 != null) {
                view3.bringToFront();
            }
            View view4 = this.f8935m;
            if (view4 != null) {
                view4.bringToFront();
            }
        }
        View view5 = this.f8939n0;
        if (view5 != null) {
            view5.bringToFront();
        }
        View view6 = this.f8936m0;
        if (view6 != null && view6.getVisibility() == 0) {
            this.f8936m0.bringToFront();
            View view7 = this.f8939n0;
            if (view7 != null) {
                view7.bringToFront();
            }
        }
        View view8 = this.f8867K;
        if (view8 != null && view8.getVisibility() == 0) {
            this.f8867K.bringToFront();
        }
        m4709q(false);
        m4633C();
        m4681f0();
        if (m4670a0()) {
            ImageView m4701n0 = m4701n0();
            cfgData cfgdata = this.f8908d;
            boolean z3 = cfgdata.f2636h2;
            m4692k(m4701n0, z3 ? this.f8953s : this.f8950r, z3 ? this.f8909d0 : this.f8906c0, m4704o0(), false, this.f8916f1, 0.0f, 0.0f);
            m4711q1(m4701n0(), this.f8916f1, false, 0.0f, 0.0f);
            if (m4694k1()) {
                m4733y();
            } else {
                ImageView m4661Q0 = m4661Q0();
                boolean z4 = cfgdata.f2636h2;
                m4692k(m4661Q0, z4 ? this.f8950r : this.f8953s, z4 ? this.f8906c0 : this.f8909d0, m4662R0(), true, this.f8916f1, 0.0f, 0.0f);
                m4711q1(m4661Q0(), this.f8916f1, true, 0.0f, 0.0f);
            }
            m4730x();
        }
    }

    /* renamed from: D0 */
    public final void m4637D0() {
        if (this.f8873N == null) {
            return;
        }
        cfgData cfgdata = this.f8908d;
        if (!cfgdata.f2537K2 || m4679e0() || ((!m4670a0() && !m4690j0()) || (!cfgdata.f2569S2 && !cfgdata.f2577U2 && !cfgdata.f2573T2))) {
            this.f8873N.setVisibility(8);
            m4708p1();
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = cfgdata.f2569S2;
        carData cardata = this.f8911e;
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
            this.f8873N.setVisibility(8);
            m4708p1();
            return;
        }
        SpannableString spannableString = new SpannableString(sb2);
        this.f8873N.setTextColor(-1);
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
        this.f8873N.setText(spannableString, TextView.BufferType.SPANNABLE);
        this.f8873N.setVisibility(0);
        m4708p1();
    }

    /* renamed from: E */
    public final void m4638E() {
        View view = this.f8923i;
        if (view == null) {
            return;
        }
        cfgData cfgdata = this.f8908d;
        boolean z2 = cfgdata.f2625f1 != EnumC1455a.f6981n;
        boolean z3 = view.getVisibility() == 0;
        this.f8923i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            AbstractC1539g1.m4215f(R.drawable.ip_theme_48_top_bar, this.f8923i, AbstractC1539g1.m4230m0(cfgdata, this.f8911e));
            AbstractC1539g1.m4221i(this.f8895Y, this.f8897Z, cfgdata, m4670a0());
        }
        if (z3 == z2 || !m4685h0()) {
            return;
        }
        m4718t();
        m4735y1();
    }

    /* renamed from: E0 */
    public final void m4639E0() {
        if (this.f8897Z == null) {
            return;
        }
        float m1773s = this.f8911e.m1773s();
        if (m1773s < -90.0f) {
            this.f8897Z.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        this.f8897Z.setTextColor(-7829368);
        spannableString.setSpan(new ForegroundColorSpan(f8844s1), 0, replace.length(), 33);
        this.f8897Z.setText(spannableString);
    }

    /* renamed from: F */
    public final void m4640F(ImageView imageView) {
        ImageView[] m4729w1 = m4729w1(imageView);
        if (m4729w1 == null || imageView == null) {
            return;
        }
        float pivotX = imageView.getPivotX();
        float pivotY = imageView.getPivotY();
        float scaleX = imageView.getScaleX();
        float scaleY = imageView.getScaleY();
        float translationX = imageView.getTranslationX();
        float translationY = imageView.getTranslationY();
        for (ImageView imageView2 : m4729w1) {
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
    public final void m4641F0() {
        cfgData cfgdata = this.f8908d;
        if (cfgdata.f2537K2 && m4690j0() && !m4670a0()) {
            carData cardata = this.f8911e;
            float m1780z = cardata.m1780z();
            float f2 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
            float m1779y = cardata.m1779y() / 1000.0f;
            float f3 = m1779y >= 0.0f ? m1779y : 0.0f;
            TextView textView = this.f8912e0;
            int i = -1;
            if (textView != null) {
                textView.setTextColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : -1);
                this.f8912e0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", "."));
            }
            TextView textView2 = this.f8915f0;
            if (textView2 != null) {
                if (f3 > cfgdata.f2576U1) {
                    i = -65536;
                } else if (f3 > cfgdata.f2572T1) {
                    i = -256;
                }
                textView2.setTextColor(i);
                this.f8915f0.setText(AbstractC1256E0.m2986A(f3));
            }
        }
    }

    /* renamed from: G */
    public final void m4642G(TextView textView) {
        if (textView == null) {
            return;
        }
        if (Math.abs(0.0f) < 0.001f) {
            m4608N0(textView, 0.0f, 0.0f);
        } else if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.post(new RunnableC1559n0(this, 2, textView));
        } else {
            m4607I(textView, 1.0f, textView.getLeft(), textView.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: G0 */
    public final void m4643G0() {
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup == null || this.f8880Q0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8917g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8917g.post(new RunnableC1571r0(this, 7));
            return;
        }
        int round = Math.round(this.f8905c.getResources().getDisplayMetrics().density * 96.0f);
        float m4723u1 = m4723u1();
        m4630B(m4723u1);
        m4724v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f8922h1, 0.0f, m4723u1()));
        m4689j(width, height, round, m4723u1);
    }

    /* renamed from: H */
    public final void m4644H() {
        boolean z2 = this.f8908d.f2537K2 && m4690j0() && !m4670a0();
        m4625g1(this.f8918g0, z2);
        m4625g1(this.f8912e0, z2);
        m4625g1(this.f8915f0, z2);
        m4642G(this.f8912e0);
        m4642G(this.f8915f0);
    }

    /* renamed from: H0 */
    public final float m4645H0(float f2) {
        float f3 = this.f8907c1;
        return f2 >= 0.999f ? f3 - (-21.0f) : f3;
    }

    /* renamed from: I0 */
    public final void m4646I0(ImageView imageView) {
        View[] m4672b0 = m4672b0(imageView);
        int length = m4672b0.length;
        for (int i = 0; i < length; i++) {
            View view = m4672b0[i];
            m4608N0(view, view == this.f8871M ? m4645H0(this.f8916f1) : m4713r0(view), m4716s0(view));
        }
    }

    /* renamed from: J */
    public final void m4647J() {
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f8872M0);
        cfgData cfgdata = this.f8908d;
        if (!cfgdata.f2537K2) {
            m4652L0();
            this.f8917g.setVisibility(4);
            m4660Q();
            m4638E();
            m4668X();
            m4684h();
            View view = this.f8920h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        boolean m4670a0 = m4670a0();
        carData cardata = this.f8911e;
        if (m4670a0) {
            this.f8917g.setVisibility(0);
            boolean m4693k0 = m4693k0();
            Boolean bool = this.f8894X0;
            if (bool == null || bool.booleanValue() != m4693k0) {
                this.f8894X0 = Boolean.valueOf(m4693k0);
            }
            m4728w0();
            m4682g();
            m4734y0(cardata.m1745e());
            m4727w();
            m4644H();
            m4684h();
            View view2 = this.f8920h;
            if (view2 != null) {
                view2.setVisibility(m4738z1() ? 4 : 8);
            }
            if (m4738z1()) {
                m4718t();
                m4735y1();
                return;
            }
            return;
        }
        m4652L0();
        this.f8917g.setVisibility(0);
        if (m4679e0()) {
            m4660Q();
            View view3 = this.f8920h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else if (cfgdata.f2561Q2) {
            m4728w0();
            View view4 = this.f8920h;
            if (view4 != null) {
                view4.setVisibility(4);
            }
            if (m4738z1()) {
                m4718t();
                m4735y1();
            }
        } else {
            if (m4690j0()) {
                m4728w0();
                if (m4738z1()) {
                    m4735y1();
                }
            } else {
                m4660Q();
            }
            View view5 = this.f8920h;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        m4625g1(this.f8944p, false);
        m4625g1(this.f8947q, false);
        m4625g1(this.f8950r, false);
        m4625g1(this.f8953s, false);
        m4677d1(this.f8950r, false);
        m4677d1(this.f8953s, false);
        m4625g1(this.f8955t, false);
        m4625g1(this.f8957u, false);
        m4625g1(this.f8906c0, false);
        m4625g1(this.f8909d0, false);
        m4625g1(this.f8869L, false);
        m4625g1(this.f8871M, false);
        m4625g1(this.f8889V, false);
        m4625g1(this.f8891W, false);
        if (m4670a0() || AbstractC1539g1.m4194P(cfgdata, cardata)) {
            m4732x1();
        } else {
            m4668X();
        }
        if (!m4690j0()) {
            m4625g1(this.f8873N, false);
            m4625g1(this.f8885T, false);
            m4708p1();
        }
        m4654M0();
        m4648J0();
        m4682g();
        m4734y0(cardata.m1745e());
        m4644H();
        m4641F0();
        m4684h();
        m4631B0(C0639g.m1872x().m1880u());
        m4709q(false);
        m4633C();
        m4681f0();
        m4638E();
    }

    /* renamed from: J0 */
    public final void m4648J0() {
        ImageView m4701n0 = m4701n0();
        boolean z2 = this.f8908d.f2636h2;
        ImageView imageView = z2 ? this.f8953s : this.f8950r;
        TextView textView = z2 ? this.f8909d0 : this.f8906c0;
        m4608N0(m4701n0, 0.0f, 0.0f);
        m4650K0(imageView);
        m4608N0(textView, 0.0f, m4704o0());
        m4646I0(m4701n0);
    }

    /* renamed from: K */
    public final void m4649K() {
        final RunnableC1571r0 runnableC1571r0 = new RunnableC1571r0(this, 23);
        final int i = 9;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        };
        carData cardata = this.f8911e;
        C1537g c1537g = this.f8899a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 10;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i3 = 11;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i4 = 12;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i5 = 13;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i6 = 14;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i7 = 15;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i8 = 16;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i9 = 17;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i10 = 18;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i11 = 0;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i12 = 1;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i13 = 2;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i14 = 3;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i15 = 4;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i16 = 5;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i17 = 6;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i18 = 7;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i19 = 8;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.s0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1571r0.run();
                        break;
                    case 1:
                        runnableC1571r0.run();
                        break;
                    case 2:
                        runnableC1571r0.run();
                        break;
                    case 3:
                        runnableC1571r0.run();
                        break;
                    case 4:
                        runnableC1571r0.run();
                        break;
                    case 5:
                        runnableC1571r0.run();
                        break;
                    case 6:
                        runnableC1571r0.run();
                        break;
                    case 7:
                        runnableC1571r0.run();
                        break;
                    case 8:
                        runnableC1571r0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1571r0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1571r0.run();
                        break;
                    case 13:
                        runnableC1571r0.run();
                        break;
                    case 14:
                        runnableC1571r0.run();
                        break;
                    case 15:
                        runnableC1571r0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1571r0.run();
                        break;
                    case 17:
                        runnableC1571r0.run();
                        break;
                    default:
                        runnableC1571r0.run();
                        break;
                }
            }
        });
        final int i20 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i21 = cfgdata4.f2635h1;
                                                    if (i21 >= 0 && i21 <= 2) {
                                                        r4 = i21;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f8905c);
        final int i26 = 6;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 8;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 9;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 10;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 11;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 12;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 13;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 14;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 15;
        cardata.m1756j0(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i36 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.t0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8690b;

            {
                this.f8690b = this;
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
                        this.f8690b.m4639E0();
                        break;
                    case 1:
                        this.f8690b.m4634C0();
                        break;
                    case 2:
                        this.f8690b.m4634C0();
                        break;
                    case 3:
                        this.f8690b.m4634C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1583x0 c1583x0 = this.f8690b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1583x0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1583x0.f8940n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1583x0.f8905c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1583x0.f8908d;
                            if (cfgdata.f2537K2) {
                                c1583x0.f8937m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1583x0.f8940n1 == -1 && intValue > -1) {
                            c1583x0.f8937m1 = 0.0f;
                            ViewGroup viewGroup = c1583x0.f8917g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1583x0.f8917g.setAlpha(1.0f);
                            }
                            c1583x0.m4702n1("ip");
                        }
                        c1583x0.f8940n1 = intValue;
                        c1583x0.m4628A0();
                        break;
                    case 5:
                        this.f8690b.m4628A0();
                        break;
                    case 6:
                        C1583x0 c1583x02 = this.f8690b;
                        Integer num2 = (Integer) obj;
                        c1583x02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1583x02.f8905c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1583x02.f8908d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1583x02.f8884S0 || !c1583x02.m4694k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1583x02.f8908d, c1583x02.f8911e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1583x02.f8908d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1583x02.f8905c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1583x02.m4702n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1583x02.f8911e)) {
                                                                        cfgData cfgdata3 = c1583x02.f8908d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1583x02.f8911e.m1760l0(z2);
                                                                        c1583x02.f8908d.m1795o(c1583x02.f8905c);
                                                                        Context context2 = c1583x02.f8905c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1583x02.f8908d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1583x02.f8908d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1583x02.f8905c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1583x02.m4702n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r02 = c1583x02.f8882R0;
                                                                    handler.removeCallbacks(runnableC1571r02);
                                                                    handler.postDelayed(runnableC1571r02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1583x02.m4694k1()) {
                                                                    c1583x02.f8884S0 = true;
                                                                    if (c1583x02.m4687i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1583x02.f8874N0 && ((valueAnimator = c1583x02.f8876O0) == null || !valueAnimator.isRunning())) {
                                                                            c1583x02.m4726v1(true);
                                                                        }
                                                                        Handler handler2 = c1583x02.f8914f;
                                                                        RunnableC1571r0 runnableC1571r03 = c1583x02.f8882R0;
                                                                        handler2.removeCallbacks(runnableC1571r03);
                                                                        handler2.postDelayed(runnableC1571r03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1583x02.f8884S0) {
                                                                    Handler handler3 = c1583x02.f8914f;
                                                                    RunnableC1571r0 runnableC1571r04 = c1583x02.f8882R0;
                                                                    handler3.removeCallbacks(runnableC1571r04);
                                                                    handler3.postDelayed(runnableC1571r04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1583x02.f8880Q0) {
                                                        ValueAnimator valueAnimator2 = c1583x02.f8925i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1583x02.f8872M0;
                                                            if (!z3 || !c1583x02.m4695l0()) {
                                                                boolean z4 = !c1583x02.f8872M0;
                                                                c1583x02.f8872M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1583x02.m4671b(z3);
                                                                break;
                                                            } else {
                                                                c1583x02.f8931k1 = 0;
                                                                RunnableC1571r0 runnableC1571r05 = new RunnableC1571r0(c1583x02, 19);
                                                                if (!c1583x02.m4695l0() && Math.abs(c1583x02.f8916f1 - 1.0f) < 0.001f) {
                                                                    runnableC1571r05.run();
                                                                    break;
                                                                } else {
                                                                    c1583x02.f8928j1 = true;
                                                                    c1583x02.m4673c(runnableC1571r05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1583x02.f8908d.f2672o3) {
                                                        Context context3 = c1583x02.f8905c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1583x02.m4702n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1583x02.m4702n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1583x02.f8911e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1583x02.f8905c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1583x02.f8908d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1583x02.f8905c, m3282M[0], m3282M[1], 0.7019608f, c1583x02.f8908d.f2657l3);
                                                }
                                                c1583x02.f8856E0 = AbstractC1372y1.f6437g;
                                                c1583x02.m4709q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1583x02.m4687i0()) {
                                            ValueAnimator valueAnimator3 = c1583x02.f8876O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1583x02.f8884S0 = false;
                                                c1583x02.m4726v1(c1583x02.f8874N0);
                                                break;
                                            }
                                        }
                                    } else if (c1583x02.f8908d.f2561Q2 && !c1583x02.f8880Q0) {
                                        ValueAnimator valueAnimator4 = c1583x02.f8925i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1583x02.f8908d;
                                            if (cfgdata4.f2561Q2 && !c1583x02.m4690j0()) {
                                                if (c1583x02.m4693k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1583x02.f8905c);
                                                c1583x02.m4673c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1583x02.f8905c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1583x0 c1583x03 = this.f8690b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1583x03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1583x03.m4737z0(intValue2);
                        break;
                    case 8:
                        C1583x0 c1583x04 = this.f8690b;
                        c1583x04.m4664T();
                        c1583x04.m4647J();
                        c1583x04.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1583x0 c1583x05 = this.f8690b;
                        c1583x05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1583x05.m4652L0();
                        }
                        c1583x05.m4664T();
                        c1583x05.m4647J();
                        c1583x05.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1583x0 c1583x06 = this.f8690b;
                        c1583x06.m4647J();
                        c1583x06.m4631B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1583x0 c1583x07 = this.f8690b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1583x07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1583x07.m4734y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1583x0 c1583x08 = this.f8690b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1583x08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1583x08.f8924i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1583x08.m4734y0(c1583x08.f8911e.m1745e());
                        break;
                    case 13:
                        C1583x0 c1583x09 = this.f8690b;
                        AbstractC1539g1.m4225k(c1583x09.f8905c);
                        c1583x09.m4664T();
                        c1583x09.m4647J();
                        break;
                    case 14:
                        C1583x0 c1583x010 = this.f8690b;
                        c1583x010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1583x010.f8872M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1583x010.f8872M0;
                        Context context4 = c1583x010.f8905c;
                        if (!z5) {
                            c1583x010.f8931k1 = -1;
                            cfgData cfgdata5 = c1583x010.f8908d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1583x010.f8925i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1583x010.f8925i1 = null;
                            }
                            c1583x010.f8916f1 = c1583x010.m4720t1();
                            c1583x010.f8919g1 = 1.0f;
                            c1583x010.f8922h1 = 0.0f;
                            c1583x010.m4636D();
                        }
                        c1583x010.m4647J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1583x010.f8872M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1583x0 c1583x011 = this.f8690b;
                        if (bool == null) {
                            c1583x011.getClass();
                            break;
                        } else {
                            c1583x011.m4697m(false);
                            break;
                        }
                    default:
                        this.f8690b.m4631B0((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: K0 */
    public final void m4650K0(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        m4608N0(imageView, 0.0f, 0.0f);
        if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        }
        ImageView imageView2 = this.f8950r;
        if (imageView == imageView2 || imageView == this.f8953s) {
            C1572s c1572s = imageView == imageView2 ? this.f8860G0 : this.f8862H0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m4640F(imageView);
        }
    }

    /* renamed from: L */
    public final void m4651L() {
        if (this.f8917g == null) {
            return;
        }
        TextView textView = this.f8924i0;
        if (textView != null) {
            textView.bringToFront();
        }
        ImageView imageView = this.f8921h0;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.f8927j0;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        this.f8917g.invalidate();
    }

    /* renamed from: L0 */
    public final void m4652L0() {
        this.f8914f.removeCallbacks(this.f8882R0);
        m4653M();
        this.f8874N0 = true;
        this.f8886T0 = 0.0f;
        this.f8892W0 = false;
        AbstractC1372y1.m3287R(false, false);
    }

    /* renamed from: M */
    public final void m4653M() {
        ValueAnimator valueAnimator = this.f8876O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8876O0 = null;
        }
    }

    /* renamed from: M0 */
    public final void m4654M0() {
        ImageView m4661Q0 = m4661Q0();
        boolean z2 = this.f8908d.f2636h2;
        ImageView imageView = z2 ? this.f8950r : this.f8953s;
        TextView textView = z2 ? this.f8906c0 : this.f8909d0;
        m4608N0(m4661Q0, 0.0f, 0.0f);
        m4650K0(imageView);
        m4608N0(textView, 0.0f, m4662R0());
        m4646I0(m4661Q0);
    }

    /* renamed from: N */
    public final void m4655N() {
        ImageView m4661Q0 = m4661Q0();
        if (m4661Q0 == null) {
            this.f8892W0 = false;
            return;
        }
        RunnableC1559n0 runnableC1559n0 = new RunnableC1559n0(this, m4661Q0, 4);
        if (m4661Q0.getWidth() <= 0 || m4661Q0.getHeight() <= 0) {
            m4661Q0.post(runnableC1559n0);
        } else {
            runnableC1559n0.run();
        }
    }

    /* renamed from: O */
    public final RectF m4656O() {
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup == null || viewGroup.getWidth() <= 0 || this.f8917g.getHeight() <= 0) {
            return new RectF();
        }
        int width = this.f8917g.getWidth();
        int height = this.f8917g.getHeight();
        float f2 = height - 25.0f;
        if (!m4632B1() && !m4691j1()) {
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
    public final C1574t m4657O0() {
        int i;
        cfgData cfgdata = this.f8908d;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        if (enumC1455a == EnumC1455a.f6949f) {
            return new C1574t(0, null, 3);
        }
        int i2 = cfgdata.f2630g1;
        if (i2 < 31) {
            int i3 = enumC1455a.f7036d;
            return i3 != 0 ? new C1574t(i3, null, 3) : new C1574t(0, null, 3);
        }
        String[] strArr = cfgdata.f2603b;
        if (strArr != null && i2 >= 31 && (i = i2 - 31) >= 0 && i < strArr.length) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata.f2603b[i]);
            if (file.exists()) {
                return new C1574t(0, Uri.fromFile(file), 3);
            }
        }
        return new C1574t(0, null, 3);
    }

    /* renamed from: P */
    public final void m4658P(ImageView imageView, ImageView imageView2, TextView textView, float f2) {
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        ImageView imageView3 = null;
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            imageView2.setRotation(0.0f);
            m4640F(imageView2);
            C1572s c1572s = imageView2 == this.f8950r ? this.f8860G0 : imageView2 == this.f8953s ? this.f8862H0 : null;
            if (c1572s != null) {
                c1572s.m4470a(imageView2);
                ImageView[] m4729w1 = m4729w1(imageView2);
                if (m4729w1 != null) {
                    float f3 = c1572s.f8682h;
                    for (ImageView imageView4 : m4729w1) {
                        if (imageView4 != null) {
                            imageView4.setRotation(f3);
                        }
                    }
                }
            }
        }
        if (imageView == this.f8944p) {
            imageView3 = this.f8955t;
        } else if (imageView == this.f8947q) {
            imageView3 = this.f8957u;
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
        View[] m4672b0 = m4672b0(imageView);
        int length = m4672b0.length;
        for (int i = 0; i < length; i++) {
            View view = m4672b0[i];
            if (view != null) {
                view.setTranslationX(view == this.f8871M ? m4645H0(this.f8916f1) : m4713r0(view));
                view.setTranslationY(m4716s0(view));
            }
        }
    }

    /* renamed from: P0 */
    public final void m4659P0() {
        ViewGroup viewGroup;
        if (!this.f8870L0) {
            m4649K();
            this.f8870L0 = true;
        }
        C1531e c1531e = this.f8858F0;
        if (c1531e != null) {
            c1531e.m4170a();
        }
        boolean z2 = this.f8908d.f2561Q2;
        this.f8872M0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4714r1();
        ValueAnimator valueAnimator = this.f8878P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8878P0 = null;
        }
        this.f8880Q0 = false;
        ImageView imageView = this.f8941o;
        if (imageView != null) {
            imageView.setTranslationY(0.0f);
        }
        m4653M();
        this.f8874N0 = true;
        this.f8886T0 = 0.0f;
        this.f8892W0 = false;
        this.f8894X0 = Boolean.valueOf(m4693k0());
        m4722u0();
        m4697m(false);
        if (this.f8937m1 <= 0.0f && (viewGroup = this.f8917g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        m4725v0();
        m4631B0(C0639g.m1872x().m1880u());
        this.f8856E0 = AbstractC1372y1.f6437g;
        m4647J();
        View view = this.f8939n0;
        if (view != null) {
            view.post(new RunnableC1571r0(this, 3));
            return;
        }
        View view2 = this.f8936m0;
        if (view2 != null) {
            view2.post(new RunnableC1571r0(this, 8));
        }
    }

    /* renamed from: Q */
    public final void m4660Q() {
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f8917g;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(android.R.color.transparent);
        }
        m4683g0();
        ViewGroup viewGroup3 = this.f8917g;
        if (viewGroup3 != null) {
            viewGroup3.getOverlay().clear();
        }
        C1525c c1525c = this.f8943o1;
        if (c1525c != null) {
            c1525c.m4163e(null);
        }
    }

    /* renamed from: Q0 */
    public final ImageView m4661Q0() {
        return this.f8908d.f2636h2 ? this.f8944p : this.f8947q;
    }

    /* renamed from: R0 */
    public final float m4662R0() {
        return this.f8908d.f2636h2 ? this.f8901a1 : this.f8904b1;
    }

    /* renamed from: S */
    public final void m4663S() {
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup != null) {
            viewGroup.getOverlay().clear();
        }
        ImageView imageView = this.f8941o;
        if (imageView != null && imageView.getBackground() == this.f8943o1) {
            this.f8941o.setBackground(null);
            this.f8941o.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f8917g;
        if (viewGroup2 != null && viewGroup2.getBackground() == this.f8943o1) {
            this.f8917g.setBackgroundResource(android.R.color.transparent);
            this.f8917g.setLayerType(0, null);
        }
        C1525c c1525c = this.f8943o1;
        if (c1525c != null) {
            c1525c.m4160b();
            this.f8943o1.m4163e(null);
        }
    }

    /* renamed from: T */
    public final void m4664T() {
        cfgData cfgdata = this.f8908d;
        if (cfgdata.f2561Q2) {
            boolean m4690j0 = m4690j0();
            Context context = this.f8905c;
            if (m4690j0) {
                if (cfgdata.f2635h1 != 0 || Math.abs(this.f8916f1 - m4720t1()) >= 0.001f || this.f8922h1 >= 0.001f) {
                    cfgdata.f2635h1 = 0;
                    cfgdata.m1795o(context);
                    m4673c(null);
                    return;
                }
                return;
            }
            if (m4693k0() && cfgdata.f2635h1 == 1) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
                m4673c(null);
            } else {
                if (Math.abs(this.f8919g1 - (m4635C1() ? 1.0f : 0.0f)) < 0.001f) {
                    return;
                }
                m4673c(null);
            }
        }
    }

    /* renamed from: U */
    public final void m4665U() {
        View view = this.f8936m0;
        if (view == null || this.f8917g == null) {
            return;
        }
        if (this.f8939n0 != null && view.getParent() == this.f8939n0) {
            int round = Math.round(this.f8905c.getResources().getDisplayMetrics().density * 96.0f);
            ((ViewGroup) this.f8939n0).removeView(this.f8936m0);
            C1592d c1592d = new C1592d(470, round);
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            this.f8917g.addView(this.f8936m0, c1592d);
            this.f8850B0 = -1.0f;
            this.f8852C0 = -1.0f;
            this.f8936m0.setTranslationX(0.0f);
            this.f8936m0.setTranslationY(0.0f);
        }
        this.f8936m0.getParent();
    }

    /* renamed from: V */
    public final int m4666V() {
        int i = this.f8948q0;
        if (i > 0) {
            return i;
        }
        TextView textView = this.f8873N;
        if (textView == null || this.f8875O == null) {
            return 0;
        }
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        int paddingBottom = this.f8875O.getPaddingBottom() + this.f8875O.getPaddingTop() + Math.round((this.f8873N.getLineSpacingExtra() + (fontMetrics.descent - fontMetrics.ascent)) * 3.0f);
        this.f8948q0 = paddingBottom;
        if (paddingBottom <= 0) {
            float f2 = this.f8905c.getResources().getDisplayMetrics().density;
            this.f8948q0 = AbstractC0062j.m150d(f2, 20.0f, 22.0f * f2 * 3.2f);
        }
        return this.f8948q0;
    }

    /* renamed from: W */
    public final void m4667W() {
        m4624f1(this.f8929k);
        m4624f1(this.f8932l);
        m4624f1(this.f8935m);
        if (this.f8920h == null || m4738z1()) {
            return;
        }
        this.f8920h.setVisibility(8);
    }

    /* renamed from: X */
    public final void m4668X() {
        ImageView imageView = this.f8921h0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.f8924i0;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView2 = this.f8927j0;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        ImageView imageView3 = this.f8930k0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f8933l0;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
    }

    /* renamed from: Z */
    public final float m4669Z(float f2) {
        float m4720t1 = m4720t1();
        float f3 = f2 - 1.0f;
        if (Math.abs(f3) < 0.001f) {
            return 0.0f;
        }
        float f4 = m4720t1 - 1.0f;
        if (Math.abs(f4) < 0.001f) {
            return 0.0f;
        }
        return f3 / f4;
    }

    /* renamed from: a0 */
    public final boolean m4670a0() {
        return this.f8908d.f2561Q2 && this.f8872M0;
    }

    /* renamed from: b */
    public final void m4671b(boolean z2) {
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup == null) {
            m4647J();
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f8917g.getHeight() <= 0) {
            this.f8917g.post(new RunnableC1577u0(this, z2, 1));
            return;
        }
        ValueAnimator valueAnimator = this.f8878P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8878P0 = null;
        }
        this.f8880Q0 = false;
        m4653M();
        m4652L0();
        ImageView m4701n0 = m4701n0();
        ImageView m4661Q0 = m4661Q0();
        boolean z3 = this.f8908d.f2636h2;
        ImageView imageView = z3 ? this.f8953s : this.f8950r;
        ImageView imageView2 = z3 ? this.f8950r : this.f8953s;
        TextView textView = z3 ? this.f8909d0 : this.f8906c0;
        TextView textView2 = z3 ? this.f8906c0 : this.f8909d0;
        float m4704o0 = m4704o0();
        float m4662R0 = m4662R0();
        float width = this.f8917g.getWidth();
        float height = this.f8917g.getHeight();
        float f2 = this.f8905c.getResources().getDisplayMetrics().density * 80.0f;
        float f3 = m4701n0 != null ? -(m4701n0.getRight() + f2) : -width;
        if (m4661Q0 != null) {
            width = (width - m4661Q0.getLeft()) + f2;
        }
        float f4 = width;
        if (!z2) {
            m4625g1(m4701n0, true);
            m4625g1(m4661Q0, true);
            m4625g1(imageView, true);
            m4625g1(imageView2, true);
            m4677d1(imageView, true);
            m4677d1(imageView2, true);
            m4625g1(textView, true);
            m4625g1(textView2, true);
            m4625g1(this.f8955t, true);
            m4625g1(this.f8957u, true);
            m4625g1(this.f8869L, true);
            m4625g1(this.f8889V, true);
            m4625g1(this.f8891W, true);
            m4625g1(this.f8871M, !r3.f2543M0.f7147f);
            m4637D0();
            m4631B0(C0639g.m1872x().m1880u());
        }
        View view = this.f8936m0;
        boolean z4 = view != null && view.getVisibility() == 0;
        float top = this.f8936m0 != null ? (height - r3.getTop()) + f2 : 0.0f;
        if (m4685h0()) {
            m4663S();
        }
        ViewGroup viewGroup2 = this.f8917g;
        if (viewGroup2 != null) {
            viewGroup2.setLayerType(0, null);
        }
        m4736z();
        float f5 = this.f8941o != null ? -(r1.getHeight() + f2) : -height;
        int[] m3297c = AbstractC1372y1.m3297c();
        this.f8880Q0 = true;
        m4676d(z2 ? 0.0f : 1.0f, m4701n0, imageView, textView, m4704o0, f3, m4661Q0, imageView2, textView2, m4662R0, f4, z4, top, f5);
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8878P0 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f8878P0);
        this.f8878P0.addUpdateListener(new C1558n(this, z2, m4701n0, imageView, textView, m4704o0, f3, m4661Q0, imageView2, textView2, m4662R0, f4, z4, top, f5, m3297c, 3));
        this.f8878P0.addListener(new C1564p(this, m3297c, m4701n0, imageView, textView, m4704o0, m4661Q0, imageView2, textView2, m4662R0, z4, z2, 2));
        this.f8878P0.start();
    }

    /* renamed from: b0 */
    public final View[] m4672b0(ImageView imageView) {
        return imageView == this.f8944p ? new View[]{this.f8869L, this.f8871M} : imageView == this.f8947q ? new View[]{this.f8889V, this.f8891W} : new View[0];
    }

    /* renamed from: c */
    public final void m4673c(RunnableC1571r0 runnableC1571r0) {
        ImageView m4701n0 = m4701n0();
        if (m4695l0() && (m4701n0 == null || m4701n0.getWidth() <= 0)) {
            if (m4701n0 != null) {
                m4701n0.post(new RunnableC1559n0(this, 3, runnableC1571r0));
                return;
            } else {
                if (runnableC1571r0 != null) {
                    runnableC1571r0.run();
                    return;
                }
                return;
            }
        }
        float m4720t1 = m4695l0() ? m4720t1() : 1.0f;
        float f2 = m4635C1() ? 1.0f : 0.0f;
        float f3 = this.f8908d.f2635h1 != 2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = this.f8925i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.f8916f1 - m4720t1) < 0.001f && Math.abs(this.f8919g1 - f2) < 0.001f && Math.abs(this.f8922h1 - f3) < 0.001f) {
            this.f8925i1 = null;
            this.f8916f1 = m4720t1;
            this.f8919g1 = f2;
            this.f8922h1 = f3;
            m4636D();
            if (runnableC1571r0 != null) {
                runnableC1571r0.run();
                return;
            }
            return;
        }
        float f4 = this.f8916f1;
        float f5 = this.f8919g1;
        float f6 = this.f8922h1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8925i1 = ofFloat;
        ofFloat.setDuration(260L);
        AbstractC0062j.m166t(this.f8925i1);
        this.f8925i1.addUpdateListener(new C1555m(this, f4, m4720t1, f5, f2, f6, f3, 2));
        this.f8925i1.addListener(new C1567q(this, m4720t1, f2, f3, runnableC1571r0, 2));
        this.f8925i1.start();
    }

    /* renamed from: c0 */
    public final void m4674c0(float[] fArr) {
        float f2 = (!this.f8874N0 || this.f8886T0 > 0.0f) ? this.f8886T0 : 0.0f;
        if (f2 <= 0.0f || !this.f8892W0) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        RectF m4719t0 = m4719t0();
        if (m4719t0.width() <= 0.0f || m4719t0.height() <= 0.0f) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = (m4719t0.centerX() - this.f8888U0) * f2;
            fArr[1] = (m4719t0.centerY() - this.f8890V0) * f2;
        }
    }

    /* renamed from: c1 */
    public final void m4675c1(ImageView imageView, boolean z2) {
        for (View view : m4672b0(imageView)) {
            if (view == this.f8871M) {
                m4625g1(view, z2 && !this.f8908d.f2543M0.f7147f);
            } else {
                m4625g1(view, z2);
            }
        }
    }

    /* renamed from: d */
    public final void m4676d(float f2, ImageView imageView, ImageView imageView2, TextView textView, float f3, float f4, ImageView imageView3, ImageView imageView4, TextView textView2, float f5, float f6, boolean z2, float f7, float f8) {
        View view;
        m4678e(imageView, imageView2, textView, f3, f4, -540.0f, f2);
        m4678e(imageView3, imageView4, textView2, f5, f6, 540.0f, f2);
        if (z2 && (view = this.f8936m0) != null) {
            view.setTranslationY((f7 * f2) + this.f8854D0);
        }
        ImageView imageView5 = this.f8941o;
        if (imageView5 != null) {
            imageView5.setTranslationY(f8 * f2);
        }
    }

    /* renamed from: d1 */
    public final void m4677d1(ImageView imageView, boolean z2) {
        ImageView[] m4729w1 = m4729w1(imageView);
        if (m4729w1 == null) {
            return;
        }
        for (ImageView imageView2 : m4729w1) {
            m4625g1(imageView2, z2);
        }
    }

    /* renamed from: e */
    public final void m4678e(ImageView imageView, ImageView imageView2, TextView textView, float f2, float f3, float f4, float f5) {
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
            ImageView[] m4729w1 = m4729w1(imageView2);
            if (m4729w1 != null) {
                for (ImageView imageView3 : m4729w1) {
                    if (imageView3 != null) {
                        imageView3.setPivotY(AbstractC0062j.m153g(imageView3.getWidth(), 0.5f, imageView3) * 0.5f);
                        imageView3.setTranslationX(f6);
                        imageView3.setTranslationY(0.0f);
                        imageView3.setRotation(f7);
                    }
                }
            }
        }
        ImageView imageView4 = imageView == this.f8944p ? this.f8955t : imageView == this.f8947q ? this.f8957u : null;
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
        View[] m4672b0 = m4672b0(imageView);
        int length = m4672b0.length;
        for (int i = 0; i < length; i++) {
            View view = m4672b0[i];
            if (view != null) {
                view.setTranslationX((f3 * f5) + (view == this.f8871M ? m4645H0(this.f8916f1) : m4713r0(view)));
                view.setTranslationY(m4716s0(view));
            }
        }
    }

    /* renamed from: e0 */
    public final boolean m4679e0() {
        return this.f8908d.f2561Q2 && !this.f8872M0;
    }

    /* renamed from: e1 */
    public final void m4680e1(View view, float f2) {
        Context context;
        Drawable m1b;
        if (view == null || (context = this.f8905c) == null || (m1b = AbstractC0000a.m1b(context, f8846u1)) == null) {
            return;
        }
        Drawable mutate = m1b.mutate();
        int round = Math.round((Math.max(0.0f, Math.min(1.0f, f2)) * (Color.alpha(-535290846) - 128)) + 128);
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(Color.argb(round, 24, 28, 34));
        }
        view.setBackground(mutate);
    }

    /* renamed from: f0 */
    public final void m4681f0() {
        m4624f1(this.f8926j);
        m4624f1(this.f8877P);
        if (m4690j0() || m4679e0() || !m4632B1()) {
            m4624f1(this.f8929k);
            m4624f1(this.f8932l);
            m4624f1(this.f8935m);
        }
        if (m4690j0() || this.f8908d.f2585W2) {
            m4624f1(this.f8867K);
            m4624f1(this.f8853D);
            m4624f1(this.f8849B);
            m4624f1(this.f8851C);
            m4624f1(this.f8857F);
            m4624f1(this.f8855E);
            m4624f1(this.f8859G);
            m4624f1(this.f8863I);
            m4624f1(this.f8861H);
            m4624f1(this.f8865J);
        }
    }

    /* renamed from: g */
    public final void m4682g() {
        ImageView imageView = this.f8921h0;
        if (imageView == null || this.f8927j0 == null) {
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
        ImageView imageView2 = this.f8927j0;
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
        TextView textView = this.f8924i0;
        if (textView != null) {
            textView.setTextSize(2, 32.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f8924i0.getLayoutParams();
            if (layoutParams3 instanceof C1592d) {
                C1592d c1592d3 = (C1592d) layoutParams3;
                ((ViewGroup.MarginLayoutParams) c1592d3).topMargin = -7;
                this.f8924i0.setLayoutParams(c1592d3);
            }
            this.f8924i0.setTranslationX(13.0f);
            this.f8924i0.setTranslationY(12.0f);
        }
        ImageView imageView3 = this.f8921h0;
        if (imageView3 != null) {
            imageView3.setBackgroundResource(R.drawable.ip_theme_48_cruise_icon_bg);
            this.f8921h0.setPadding(6, 6, 6, 6);
        }
        ImageView imageView4 = this.f8927j0;
        if (imageView4 != null) {
            imageView4.setBackgroundResource(R.drawable.ip_theme_48_cruise_icon_bg);
            this.f8927j0.setPadding(6, 6, 6, 6);
        }
        TextView textView2 = this.f8924i0;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.ip_theme_48_cruise_icon_bg);
        }
        m4732x1();
        m4651L();
    }

    /* renamed from: g0 */
    public final void m4683g0() {
        ImageView imageView = this.f8941o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        this.f8941o.setLayerType(0, null);
        this.f8941o.setBackground(null);
        this.f8941o.setImageDrawable(null);
    }

    /* renamed from: h */
    public final void m4684h() {
        cfgData cfgdata = this.f8908d;
        if (!cfgdata.f2537K2) {
            ViewGroup viewGroup = this.f8877P;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            m4625g1(this.f8873N, false);
            m4625g1(this.f8885T, false);
            View view = this.f8867K;
            if (view != null) {
                view.setVisibility(8);
            }
            m4624f1(this.f8891W);
            m4708p1();
            return;
        }
        m4625g1(this.f8885T, cfgdata.f2581V2 && (!m4679e0() && (m4670a0() || m4690j0())));
        m4637D0();
        if (m4690j0()) {
            m4686i(false);
        } else if (cfgdata.f2585W2 || m4690j0() || m4679e0() || !m4670a0() || this.f8922h1 >= 0.999f) {
            m4686i(false);
        } else {
            m4686i(true);
        }
        m4731x0();
        m4708p1();
        if (!m4632B1() && !m4693k0() && !m4690j0() && !m4694k1()) {
            m4667W();
            if (m4685h0()) {
                m4728w0();
            }
        }
        m4643G0();
    }

    /* renamed from: h0 */
    public final boolean m4685h0() {
        if (this.f8943o1 == null) {
            return false;
        }
        ImageView imageView = this.f8941o;
        if (imageView != null && imageView.getVisibility() == 0 && this.f8941o.getBackground() == this.f8943o1) {
            return true;
        }
        ViewGroup viewGroup = this.f8917g;
        return viewGroup != null && viewGroup.getBackground() == this.f8943o1;
    }

    /* renamed from: i */
    public final void m4686i(boolean z2) {
        if (!z2) {
            View view = this.f8867K;
            if (view != null) {
                view.setVisibility(8);
            }
            m4624f1(this.f8857F);
            m4624f1(this.f8855E);
            m4624f1(this.f8859G);
            m4624f1(this.f8853D);
            m4624f1(this.f8849B);
            m4624f1(this.f8851C);
            m4624f1(this.f8863I);
            m4624f1(this.f8861H);
            m4624f1(this.f8865J);
            return;
        }
        View view2 = this.f8867K;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        boolean z3 = this.f8908d.useJourneyFuel;
        m4625g1(this.f8857F, z3);
        m4625g1(this.f8855E, z3);
        m4625g1(this.f8859G, z3);
        m4625g1(this.f8853D, true);
        m4625g1(this.f8849B, true);
        m4625g1(this.f8851C, true);
        m4625g1(this.f8863I, true);
        m4625g1(this.f8861H, true);
        m4625g1(this.f8865J, true);
    }

    /* renamed from: i0 */
    public final boolean m4687i0() {
        return this.f8908d.f2537K2 && m4670a0();
    }

    /* renamed from: i1 */
    public final boolean m4688i1() {
        return m4690j0() && !m4679e0();
    }

    /* renamed from: j */
    public final void m4689j(int i, int i2, int i3, float f2) {
        ImageView m4701n0;
        if (this.f8867K == null || m4690j0()) {
            return;
        }
        boolean z2 = (this.f8908d.f2585W2 || m4679e0() || !m4670a0()) ? false : true;
        float max = Math.max(0.0f, Math.min(1.0f, this.f8922h1));
        if (!z2) {
            this.f8867K.setAlpha(1.0f);
            this.f8867K.setTranslationY(0.0f);
            return;
        }
        if (max >= 0.999f) {
            this.f8867K.setAlpha(0.0f);
            this.f8867K.setVisibility(4);
            return;
        }
        if (this.f8867K.getVisibility() != 0) {
            m4686i(true);
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float f3 = ((-0.19999999f) * max2) + 1.0f;
        if (this.f8867K != null) {
            Context context = this.f8905c;
            float f4 = context.getResources().getDisplayMetrics().density;
            float f5 = context.getResources().getDisplayMetrics().scaledDensity;
            float max3 = Math.max(0.5f, Math.min(1.2f, f3));
            float f6 = 10.0f * f4 * max3;
            this.f8867K.setPadding(AbstractC0062j.m168v(f4, 14.0f, max3), Math.round(f6), AbstractC0062j.m168v(f4, 16.0f, max3), Math.round(f6));
            View view = this.f8867K;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(true);
                ((ViewGroup) this.f8867K).setClipChildren(true);
            }
            float f7 = 15.0f * max3;
            m4620a1(this.f8863I, f7, f5);
            float f8 = 30.0f * max3;
            m4620a1(this.f8861H, f8, f5);
            float f9 = 16.0f * max3;
            m4620a1(this.f8865J, f9, f5);
            m4620a1(this.f8857F, f7, f5);
            m4620a1(this.f8855E, f8, f5);
            m4620a1(this.f8859G, f9, f5);
            m4620a1(this.f8853D, f7, f5);
            m4620a1(this.f8849B, f8, f5);
            m4620a1(this.f8851C, f9, f5);
            AbstractC1539g1.m4202X(this.f8861H, this.f8855E, this.f8849B);
            TextView textView = this.f8857F;
            View view2 = textView != null ? (View) textView.getParent() : null;
            float f10 = 22.0f * f4 * max3;
            if (view2 != null && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMarginStart(Math.round(f10));
                view2.setLayoutParams(marginLayoutParams);
            }
            TextView textView2 = this.f8853D;
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
        if (max2 > 0.001f && (m4701n0 = m4701n0()) != null && m4701n0.getWidth() > 0 && m4701n0.getHeight() > 0) {
            float f12 = this.f8916f1;
            float left = m4701n0.getLeft();
            float width = m4701n0.getWidth() * f12;
            float height = (m4701n0.getHeight() * f12) + m4701n0.getTop();
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
        View view4 = this.f8867K;
        if (view4 != null && this.f8917g != null && (view4.getLayoutParams() instanceof C1592d)) {
            C1592d c1592d = (C1592d) this.f8867K.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = 470;
            ((ViewGroup.MarginLayoutParams) c1592d).height = m152f;
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(max6);
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max7;
            this.f8867K.setLayoutParams(c1592d);
            this.f8867K.setTranslationX(0.0f);
            this.f8867K.setTranslationY(0.0f);
        }
        this.f8867K.setAlpha(1.0f - max);
        this.f8867K.setTranslationY(max * 40.0f);
        this.f8867K.bringToFront();
        View view5 = this.f8939n0;
        if (view5 != null) {
            view5.bringToFront();
        }
    }

    /* renamed from: j0 */
    public final boolean m4690j0() {
        cfgData cfgdata = this.f8908d;
        return AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
    }

    /* renamed from: j1 */
    public final boolean m4691j1() {
        return m4693k0() && !m4679e0();
    }

    /* renamed from: k */
    public final void m4692k(ImageView imageView, ImageView imageView2, TextView textView, float f2, boolean z2, float f3, float f4, float f5) {
        float f6;
        float f7;
        if (imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1571r0(this, 12));
            return;
        }
        float f8 = f3 - 1.0f;
        if (Math.abs(f8) < 0.001f) {
            m4608N0(imageView, f4, f5);
            m4650K0(imageView2);
            m4608N0(textView, f4, f2 + f5);
            m4717s1(imageView, 1.0f, 0.0f, 0.0f, f4, f5, 0.0f, 0.0f);
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m4622d0(imageView, f3, z2, fArr, fArr2);
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        if (f3 < 0.999f) {
            f7 = m4723u1() * (-20.0f);
        } else {
            if (f3 <= 1.001f) {
                f6 = 0.0f;
                m4607I(imageView, f3, f9, f10, f4, f5, f11, f12);
                m4721u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
                m4607I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
                m4717s1(imageView, f3, f9, f10, f4, f5, f11, f12);
            }
            if (Math.abs(f8) < 0.001f || f3 < 1.0f) {
                f7 = 0.0f;
            } else {
                float m4669Z = m4669Z(f3);
                f7 = (((-imageView.getHeight()) * 0.16f) * m4669Z) - (m4669Z * 120.0f);
            }
        }
        f6 = f7;
        m4607I(imageView, f3, f9, f10, f4, f5, f11, f12);
        m4721u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
        m4607I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
        m4717s1(imageView, f3, f9, f10, f4, f5, f11, f12);
    }

    /* renamed from: k0 */
    public final boolean m4693k0() {
        return AbstractC1539g1.m4195Q(this.f8908d, this.f8911e);
    }

    /* renamed from: k1 */
    public final boolean m4694k1() {
        if (m4687i0()) {
            return !this.f8874N0 || this.f8886T0 > 0.0f;
        }
        return false;
    }

    /* renamed from: l0 */
    public final boolean m4695l0() {
        return this.f8908d.f2635h1 == 0 && !this.f8928j1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v242, types: [android.view.View] */
    /* renamed from: l1 */
    public final void m4696l1() {
        int i;
        View view = this.f8902b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_48_root);
        this.f8917g = viewGroup;
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
        this.f8941o = (ImageView) view.findViewById(R.id.theme_48_style_bg);
        this.f8920h = view.findViewById(R.id.theme_48_navi_hole);
        this.f8923i = view.findViewById(R.id.theme_48_top_panel);
        this.f8926j = view.findViewById(R.id.theme_48_bottom_panel);
        this.f8929k = view.findViewById(R.id.theme_48_bottom_panel_left);
        this.f8932l = view.findViewById(R.id.theme_48_bottom_panel_center);
        this.f8935m = view.findViewById(R.id.theme_48_bottom_panel_right);
        if (this.f8932l != null) {
            C1528d c1528d = new C1528d(-15197150);
            this.f8938n = c1528d;
            this.f8932l.setBackground(c1528d);
        }
        this.f8944p = (ImageView) view.findViewById(R.id.theme_48_spd_face);
        this.f8947q = (ImageView) view.findViewById(R.id.theme_48_rpm_face);
        this.f8950r = (ImageView) view.findViewById(R.id.theme_48_spd_needle);
        this.f8953s = (ImageView) view.findViewById(R.id.theme_48_rpm_needle);
        this.f8955t = (ImageView) view.findViewById(R.id.theme_48_fuel_needle);
        this.f8957u = (ImageView) view.findViewById(R.id.theme_48_temp_needle);
        this.f8849B = (TextView) view.findViewById(R.id.theme_48_inst_fuel);
        this.f8851C = (TextView) view.findViewById(R.id.theme_48_inst_fuel_sub);
        this.f8853D = (TextView) view.findViewById(R.id.theme_48_lbl_inst);
        this.f8855E = (TextView) view.findViewById(R.id.theme_48_avg_jour);
        this.f8857F = (TextView) view.findViewById(R.id.theme_48_lbl_avg_jour);
        this.f8859G = (TextView) view.findViewById(R.id.theme_48_avg_jour_sub);
        this.f8861H = (TextView) view.findViewById(R.id.theme_48_avg_total);
        this.f8863I = (TextView) view.findViewById(R.id.theme_48_lbl_avg_total);
        this.f8865J = (TextView) view.findViewById(R.id.theme_48_avg_total_sub);
        this.f8867K = view.findViewById(R.id.theme_48_fuel_cons_wrap);
        this.f8877P = (ViewGroup) view.findViewById(R.id.theme_48_odo_wrap);
        this.f8879Q = (TextView) view.findViewById(R.id.theme_48_odo_total);
        this.f8881R = (TextView) view.findViewById(R.id.theme_48_odo_day);
        this.f8883S = (TextView) view.findViewById(R.id.theme_48_odo_trip);
        this.f8885T = (ViewGroup) view.findViewById(R.id.theme_48_tires_wrap);
        this.f8887U = (TextView) view.findViewById(R.id.theme_48_tires_up);
        this.f8891W = (TextView) view.findViewById(R.id.theme_48_battery);
        this.f8893X = (TextView) view.findViewById(R.id.theme_48_gear);
        this.f8895Y = (TextView) view.findViewById(R.id.theme_48_clock);
        this.f8897Z = (TextView) view.findViewById(R.id.theme_48_out_temp);
        this.f8900a0 = (ImageView) view.findViewById(R.id.theme_48_wifi);
        this.f8903b0 = (ImageView) view.findViewById(R.id.theme_48_inet);
        this.f8906c0 = (TextView) view.findViewById(R.id.theme_48_spd_value);
        this.f8909d0 = (TextView) view.findViewById(R.id.theme_48_rpm_value);
        this.f8869L = (TextView) view.findViewById(R.id.theme_48_fuel_up);
        this.f8889V = (TextView) view.findViewById(R.id.theme_48_temp_up);
        TextView textView = (TextView) view.findViewById(R.id.theme_48_remain);
        this.f8871M = textView;
        if (textView != null) {
            this.f8907c1 = textView.getTranslationX();
        }
        this.f8873N = (TextView) view.findViewById(R.id.theme_48_odo_up);
        View findViewById = view.findViewById(R.id.theme_48_odo_frame);
        this.f8875O = findViewById;
        AbstractC1539g1.m4223j(this.f8873N, findViewById);
        AbstractC1539g1.m4204Z(this.f8879Q, this.f8881R, this.f8883S);
        AbstractC1539g1.m4202X(this.f8861H, this.f8855E, this.f8849B);
        this.f8912e0 = (TextView) view.findViewById(R.id.theme_48_txt_speed);
        this.f8918g0 = view.findViewById(R.id.theme_48_txt_speed_scrim);
        this.f8915f0 = (TextView) view.findViewById(R.id.theme_48_txt_rpm);
        TextView textView2 = this.f8906c0;
        TextView textView3 = this.f8909d0;
        this.f8901a1 = textView2 != null ? textView2.getTranslationY() : 0.0f;
        this.f8904b1 = textView3 != null ? textView3.getTranslationY() : 0.0f;
        if (Math.abs(this.f8901a1) < 0.5f && Math.abs(this.f8904b1) < 0.5f) {
            float f2 = this.f8905c.getResources().getDisplayMetrics().scaledDensity * 60.0f;
            this.f8901a1 = f2;
            this.f8904b1 = f2;
            if (textView2 != null) {
                textView2.setTranslationY(f2);
            }
            if (textView3 != null) {
                textView3.setTranslationY(f2);
            }
        }
        this.f8921h0 = (ImageView) view.findViewById(R.id.theme_48_cruise);
        this.f8924i0 = (TextView) view.findViewById(R.id.theme_48_cruise_speed);
        this.f8927j0 = (ImageView) view.findViewById(R.id.theme_48_lane);
        this.f8930k0 = (ImageView) view.findViewById(R.id.theme_48_hide_cruise);
        this.f8933l0 = (ImageView) view.findViewById(R.id.theme_48_hide_la);
        this.f8945p0 = view.findViewById(R.id.theme_48_ext_spacer);
        View findViewById2 = view.findViewById(R.id.theme_48_media_wrap);
        this.f8936m0 = findViewById2;
        AbstractC0641i.m1886c(findViewById2);
        this.f8939n0 = view.findViewById(R.id.theme_48_center_float);
        this.f8942o0 = view.findViewById(R.id.theme_48_ext_row);
        View view2 = this.f8939n0;
        if (view2 instanceof ViewGroup) {
            ((ViewGroup) view2).setClipChildren(false);
            ((ViewGroup) this.f8939n0).setClipToPadding(false);
        }
        ViewGroup viewGroup4 = this.f8917g;
        if (viewGroup4 != null) {
            viewGroup4.setClipChildren(false);
            this.f8917g.setClipToPadding(false);
        }
        View view3 = this.f8942o0;
        if (view3 != null) {
            if (view3 instanceof ViewGroup) {
                ((ViewGroup) view3).setClipChildren(false);
                ((ViewGroup) this.f8942o0).setClipToPadding(false);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8942o0.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin += 15;
                this.f8942o0.setLayoutParams(marginLayoutParams);
            }
        }
        m4665U();
        this.f8951r0 = (ImageView) view.findViewById(R.id.theme_48_media_art);
        this.f8954s0 = (TextView) view.findViewById(R.id.theme_48_media_title);
        this.f8956t0 = (TextView) view.findViewById(R.id.theme_48_media_artist);
        this.f8958u0 = (TextView) view.findViewById(R.id.theme_48_media_elapsed);
        this.f8960v0 = (TextView) view.findViewById(R.id.theme_48_media_total);
        this.f8962w0 = (ProgressBar) view.findViewById(R.id.theme_48_media_bar);
        TextView textView4 = (TextView) view.findViewById(R.id.theme_48_free_mem);
        Handler handler = this.f8914f;
        this.f8858F0 = new C1531e(handler, textView4);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f8899a);
        }
        m4681f0();
        m4697m(true);
        m4682g();
        carData cardata = this.f8911e;
        m4734y0(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView5 = this.f8924i0;
        if (textView5 != null) {
            textView5.setText(String.valueOf(m1747f));
        }
        m4734y0(cardata.m1745e());
        float m1780z = cardata.m1780z();
        cfgData cfgdata = this.f8908d;
        float f3 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        float max = Math.max(0.0f, cardata.m1779y() / 1000.0f);
        this.f8860G0 = new C1572s(0.0f, 220.0f, -135.5f, 136.5f, f3, 2);
        this.f8862H0 = new C1572s(0.0f, 8.0f, -135.5f, 136.5f, max, 2);
        float max2 = Math.max(0.0f, cardata.m1774t());
        float m1743d = cardata.m1743d();
        float f4 = m1743d < 40.0f ? 40.0f : m1743d;
        this.f8864I0 = new C1572s(0.0f, 100.0f, 32.5f, -32.5f, max2, 2);
        this.f8866J0 = new C1572s(40.0f, 130.0f, 32.5f, -32.5f, f4, 2);
        m4626h1(this.f8950r, this.f8860G0);
        m4626h1(this.f8953s, this.f8862H0);
        m4626h1(this.f8955t, this.f8864I0);
        m4626h1(this.f8957u, this.f8866J0);
        ImageView imageView = this.f8944p;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ImageView imageView2 = this.f8947q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        ImageView imageView3 = this.f8950r;
        if (imageView3 != null) {
            imageView3.setImageDrawable(null);
        }
        ImageView imageView4 = this.f8953s;
        if (imageView4 != null) {
            imageView4.setImageDrawable(null);
        }
        ImageView imageView5 = this.f8955t;
        if (imageView5 != null) {
            imageView5.setImageDrawable(null);
        }
        ImageView imageView6 = this.f8957u;
        if (imageView6 != null) {
            imageView6.setImageDrawable(null);
        }
        this.f8963x = m4609R(this.f8950r);
        this.f8965y = m4609R(this.f8953s);
        C1572s c1572s = this.f8860G0;
        if (c1572s != null) {
            float f5 = c1572s.f8682h;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f8967z;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = f5;
                i2++;
            }
        }
        C1572s c1572s2 = this.f8862H0;
        if (c1572s2 != null) {
            float f6 = c1572s2.f8682h;
            while (true) {
                float[] fArr2 = this.f8847A;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = f6;
                i++;
            }
        }
        m4722u0();
        final int i3 = 0;
        m4707p0("themes/48/theme_48_spd.bin", new Consumer(this) { // from class: u0.v0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8837b;

            {
                this.f8837b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i3) {
                    case 0:
                        C1583x0 c1583x0 = this.f8837b;
                        c1583x0.f8959v = bitmap;
                        c1583x0.f8896Y0 = -1;
                        c1583x0.m4737z0(c1583x0.f8911e.m1753i());
                        break;
                    case 1:
                        C1583x0 c1583x02 = this.f8837b;
                        c1583x02.f8961w = bitmap;
                        c1583x02.f8896Y0 = -1;
                        c1583x02.m4737z0(c1583x02.f8911e.m1753i());
                        break;
                    case 2:
                        C1583x0 c1583x03 = this.f8837b;
                        ImageView imageView7 = c1583x03.f8950r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1583x03.f8953s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1583x03.f8963x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1583x03.f8965y;
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
                        C1583x0 c1583x04 = this.f8837b;
                        ImageView imageView11 = c1583x04.f8955t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1583x04.f8957u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        m4707p0("themes/48/theme_48_rpm.bin", new Consumer(this) { // from class: u0.v0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8837b;

            {
                this.f8837b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i4) {
                    case 0:
                        C1583x0 c1583x0 = this.f8837b;
                        c1583x0.f8959v = bitmap;
                        c1583x0.f8896Y0 = -1;
                        c1583x0.m4737z0(c1583x0.f8911e.m1753i());
                        break;
                    case 1:
                        C1583x0 c1583x02 = this.f8837b;
                        c1583x02.f8961w = bitmap;
                        c1583x02.f8896Y0 = -1;
                        c1583x02.m4737z0(c1583x02.f8911e.m1753i());
                        break;
                    case 2:
                        C1583x0 c1583x03 = this.f8837b;
                        ImageView imageView7 = c1583x03.f8950r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1583x03.f8953s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1583x03.f8963x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1583x03.f8965y;
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
                        C1583x0 c1583x04 = this.f8837b;
                        ImageView imageView11 = c1583x04.f8955t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1583x04.f8957u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 2;
        m4707p0("themes/48/theme_48_needle.bin", new Consumer(this) { // from class: u0.v0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8837b;

            {
                this.f8837b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i5) {
                    case 0:
                        C1583x0 c1583x0 = this.f8837b;
                        c1583x0.f8959v = bitmap;
                        c1583x0.f8896Y0 = -1;
                        c1583x0.m4737z0(c1583x0.f8911e.m1753i());
                        break;
                    case 1:
                        C1583x0 c1583x02 = this.f8837b;
                        c1583x02.f8961w = bitmap;
                        c1583x02.f8896Y0 = -1;
                        c1583x02.m4737z0(c1583x02.f8911e.m1753i());
                        break;
                    case 2:
                        C1583x0 c1583x03 = this.f8837b;
                        ImageView imageView7 = c1583x03.f8950r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1583x03.f8953s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1583x03.f8963x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1583x03.f8965y;
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
                        C1583x0 c1583x04 = this.f8837b;
                        ImageView imageView11 = c1583x04.f8955t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1583x04.f8957u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 3;
        m4707p0("themes/48/theme_48_needle_small.bin", new Consumer(this) { // from class: u0.v0

            /* renamed from: b */
            public final /* synthetic */ C1583x0 f8837b;

            {
                this.f8837b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i6) {
                    case 0:
                        C1583x0 c1583x0 = this.f8837b;
                        c1583x0.f8959v = bitmap;
                        c1583x0.f8896Y0 = -1;
                        c1583x0.m4737z0(c1583x0.f8911e.m1753i());
                        break;
                    case 1:
                        C1583x0 c1583x02 = this.f8837b;
                        c1583x02.f8961w = bitmap;
                        c1583x02.f8896Y0 = -1;
                        c1583x02.m4737z0(c1583x02.f8911e.m1753i());
                        break;
                    case 2:
                        C1583x0 c1583x03 = this.f8837b;
                        ImageView imageView7 = c1583x03.f8950r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1583x03.f8953s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1583x03.f8963x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1583x03.f8965y;
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
                        C1583x0 c1583x04 = this.f8837b;
                        ImageView imageView11 = c1583x04.f8955t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1583x04.f8957u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView7 = this.f8944p;
        if (imageView7 != null) {
            imageView7.post(new RunnableC1571r0(this, 0));
        }
        if (!this.f8870L0) {
            m4649K();
            this.f8870L0 = true;
        }
        ViewGroup viewGroup5 = this.f8917g;
        if (viewGroup5 != null) {
            viewGroup5.setAlpha(1.0f);
        }
        this.f8937m1 = 0.0f;
        this.f8874N0 = true;
        this.f8886T0 = 0.0f;
        boolean z2 = cfgdata.f2561Q2;
        this.f8872M0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4714r1();
        this.f8894X0 = Boolean.valueOf(m4693k0());
        m4647J();
        this.f8868K0 = true;
        handler.post(this.f8946p1);
        handler.post(this.f8952r1);
        this.f8856E0 = AbstractC1372y1.f6437g;
        handler.post(this.f8949q1);
        this.f8858F0.m4171b();
        View view4 = this.f8939n0;
        if (view4 != null) {
            view4.post(new RunnableC1571r0(this, 1));
            return;
        }
        View view5 = this.f8936m0;
        if (view5 != null) {
            view5.post(new RunnableC1571r0(this, 2));
        }
    }

    /* renamed from: m */
    public final void m4697m(boolean z2) {
        boolean z3 = this.f8908d.f2636h2;
        if (z2 || !Boolean.valueOf(z3).equals(this.f8898Z0)) {
            this.f8898Z0 = Boolean.valueOf(z3);
            this.f8892W0 = false;
            m4621b1(this.f8944p, z3 ? 1 : 0);
            m4621b1(this.f8947q, z3 ? 1 : 0);
            m4621b1(this.f8950r, z3 ? 1 : 0);
            m4621b1(this.f8953s, z3 ? 1 : 0);
            for (ImageView imageView : this.f8963x) {
                m4621b1(imageView, z3 ? 1 : 0);
            }
            for (ImageView imageView2 : this.f8965y) {
                m4621b1(imageView2, z3 ? 1 : 0);
            }
            m4627l(this.f8944p, z3);
            m4627l(this.f8947q, !z3);
            ImageView imageView3 = this.f8950r;
            if (imageView3 != null && this.f8860G0 != null) {
                imageView3.post(new RunnableC1571r0(this, 13));
            }
            ImageView imageView4 = this.f8953s;
            if (imageView4 != null && this.f8862H0 != null) {
                imageView4.post(new RunnableC1571r0(this, 14));
            }
            ImageView imageView5 = this.f8955t;
            if (imageView5 != null && this.f8864I0 != null) {
                imageView5.post(new RunnableC1571r0(this, 15));
            }
            ImageView imageView6 = this.f8957u;
            if (imageView6 != null && this.f8866J0 != null) {
                imageView6.post(new RunnableC1571r0(this, 16));
            }
            m4727w();
            carData cardata = this.f8911e;
            m4737z0(cardata.m1753i());
            m4734y0(cardata.m1745e());
        }
    }

    /* renamed from: m0 */
    public final void m4698m0() {
        TextView textView;
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f8891W == null || (textView = this.f8889V) == null || this.f8947q == null) {
            return;
        }
        if (textView.getVisibility() != 0) {
            this.f8891W.setVisibility(8);
            return;
        }
        if (this.f8947q.getWidth() <= 0 || this.f8889V.getWidth() <= 0 || this.f8891W.getWidth() <= 0) {
            this.f8891W.setVisibility(0);
            this.f8947q.post(new RunnableC1571r0(this, 22));
            return;
        }
        this.f8891W.setVisibility(0);
        float width = (this.f8889V.getWidth() * 0.5f) + this.f8889V.getLeft();
        this.f8910d1 = (((((this.f8947q.getWidth() * 0.5f) + this.f8947q.getLeft()) * 2.0f) - width) - 5.0f) - ((this.f8891W.getWidth() * 0.5f) + this.f8891W.getLeft());
        this.f8913e1 = ((this.f8889V.getHeight() * 0.5f) + this.f8889V.getTop()) - ((this.f8891W.getHeight() * 0.5f) + this.f8891W.getTop());
        if (this.f8891W == null || (imageView = this.f8947q) == null || imageView.getWidth() <= 0) {
            return;
        }
        ImageView imageView2 = this.f8947q;
        boolean z2 = imageView2 == m4661Q0();
        float f5 = this.f8916f1;
        if (z2 && m4694k1()) {
            float[] fArr = new float[2];
            m4674c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m4695l0()) {
                f5 = this.f8916f1 * (1.0f - this.f8886T0);
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
            TextView textView2 = this.f8891W;
            m4608N0(textView2, m4713r0(textView2), m4716s0(this.f8891W));
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m4622d0(imageView2, f2, z2, fArr2, fArr3);
        TextView textView3 = this.f8891W;
        m4607I(textView3, f2, fArr2[0], fArr2[1], f3, f4, m4713r0(textView3) + fArr3[0], m4716s0(this.f8891W) + fArr3[1]);
    }

    /* renamed from: m1 */
    public final void m4699m1(float f2, float f3, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f8876O0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f8876O0);
        this.f8876O0.addUpdateListener(new C0174W(12, this));
        this.f8876O0.addListener(new C0181b0(this, 10, runnable));
        this.f8876O0.start();
    }

    /* renamed from: n */
    public final void m4700n() {
        if (this.f8943o1 == null) {
            C1525c c1525c = new C1525c(-16777216);
            this.f8943o1 = c1525c;
            c1525c.m4164f(1720508584);
        }
        C1574t m4657O0 = m4657O0();
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        this.f8917g.setBackgroundResource(android.R.color.transparent);
        if (!m4657O0.m4472a() || m4705o1()) {
            if (m4657O0.m4472a()) {
                m4683g0();
            }
            m4703o();
        } else if (m4705o1()) {
            m4683g0();
            m4703o();
            m4735y1();
        } else if (this.f8941o == null) {
            m4683g0();
            this.f8943o1.m4163e(null);
            this.f8943o1.m4162d(m4688i1() ? -15197150 : -16777216);
            this.f8917g.setLayerType(1, null);
            this.f8917g.setBackground(this.f8943o1);
        } else if (m4685h0() && this.f8941o.getBackground() == this.f8943o1) {
            this.f8941o.setLayerType(1, null);
            m4735y1();
        } else {
            this.f8941o.setVisibility(0);
            this.f8941o.setLayerType(1, null);
            this.f8941o.setBackground(null);
            RunnableC0123b runnableC0123b = new RunnableC0123b(this, 5, m4657O0);
            if (m4657O0.f8687b != 0) {
                runnableC0123b.run();
            } else {
                Uri uri = m4657O0.f8688c;
                if (uri != null) {
                    this.f8941o.setImageURI(uri);
                    this.f8941o.post(runnableC0123b);
                }
            }
        }
        m4735y1();
    }

    /* renamed from: n0 */
    public final ImageView m4701n0() {
        return this.f8908d.f2636h2 ? this.f8947q : this.f8944p;
    }

    /* renamed from: n1 */
    public final void m4702n1(String str) {
        Context context = this.f8905c;
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

    /* renamed from: o */
    public final void m4703o() {
        if (this.f8941o == null) {
            m4683g0();
            this.f8943o1.m4163e(null);
            this.f8943o1.m4162d(m4688i1() ? -15197150 : -16777216);
            this.f8917g.setLayerType(1, null);
            this.f8917g.setBackground(this.f8943o1);
            return;
        }
        if (m4685h0()) {
            Drawable background = this.f8941o.getBackground();
            C1525c c1525c = this.f8943o1;
            if (background == c1525c) {
                c1525c.m4163e(null);
                this.f8943o1.m4162d(m4688i1() ? -15197150 : -16777216);
                this.f8941o.setLayerType(1, null);
                return;
            }
        }
        this.f8941o.setVisibility(0);
        this.f8941o.setLayerType(1, null);
        this.f8941o.setImageDrawable(null);
        this.f8941o.setBackground(null);
        this.f8943o1.m4163e(null);
        this.f8943o1.m4162d(m4688i1() ? -15197150 : -16777216);
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
            this.f8917g.setBackgroundResource(android.R.color.transparent);
        }
        this.f8941o.setBackground(this.f8943o1);
    }

    /* renamed from: o0 */
    public final float m4704o0() {
        return this.f8908d.f2636h2 ? this.f8904b1 : this.f8901a1;
    }

    /* renamed from: o1 */
    public final boolean m4705o1() {
        return m4688i1() && m4657O0().m4472a();
    }

    /* renamed from: p */
    public final void m4706p(float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f8936m0 == null) {
            return;
        }
        Context context = this.f8905c;
        float f3 = context.getResources().getDisplayMetrics().density;
        float f4 = context.getResources().getDisplayMetrics().scaledDensity;
        float f5 = f3 * 14.0f * f2;
        float f6 = 10.0f * f3 * f2;
        this.f8936m0.setPadding(Math.round(f5), Math.round(f6), AbstractC0062j.m168v(f3, 16.0f, f2), Math.round(f6));
        if (this.f8951r0 != null) {
            int max = Math.max(1, Math.round(72.0f * f3 * f2));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f8951r0.getLayoutParams();
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = max;
                marginLayoutParams2.height = max;
                marginLayoutParams2.setMarginEnd(Math.round(f5));
                this.f8951r0.setLayoutParams(marginLayoutParams2);
            }
        }
        TextView textView = this.f8954s0;
        if (textView != null) {
            AbstractC0062j.m164r(f4, 22.0f, f2, textView, 0);
        }
        TextView textView2 = this.f8956t0;
        if (textView2 != null) {
            AbstractC0062j.m164r(f4, 16.0f, f2, textView2, 0);
        }
        TextView textView3 = this.f8958u0;
        if (textView3 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView3, 0);
            this.f8958u0.setMinWidth(Math.round(f3 * 46.0f * f2));
        }
        TextView textView4 = this.f8960v0;
        if (textView4 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView4, 0);
            this.f8960v0.setMinWidth(Math.round(46.0f * f3 * f2));
        }
        ProgressBar progressBar = this.f8962w0;
        if (progressBar != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar.getLayoutParams()) != null) {
            marginLayoutParams.height = Math.max(1, Math.round(6.0f * f3 * f2));
            int round = Math.round(f3 * 8.0f * f2);
            marginLayoutParams.setMarginStart(round);
            marginLayoutParams.setMarginEnd(round);
            this.f8962w0.setLayoutParams(marginLayoutParams);
        }
        View view = this.f8936m0;
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
    public final void m4707p0(String str, Consumer consumer) {
        AbstractC1354s1.m3252a(this.f8905c, str, new C1562o0(consumer, 1), this.f8914f, 0);
    }

    /* renamed from: p1 */
    public final void m4708p1() {
        View view;
        ViewGroup viewGroup;
        View view2;
        TextView textView = this.f8873N;
        boolean z2 = textView != null && textView.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f8885T;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = z2 || z3;
        View view3 = this.f8875O;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        int m4666V = m4666V();
        View view4 = this.f8875O;
        if (view4 != null) {
            if (!z2 || m4666V <= 0) {
                view4.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    view4.setLayoutParams(layoutParams);
                }
            } else {
                m4615X0(view4, m4666V);
                View view5 = this.f8875O;
                if (view5 instanceof LinearLayout) {
                    ((LinearLayout) view5).setGravity(17);
                }
                TextView textView2 = this.f8873N;
                if (textView2 != null) {
                    AbstractC1539g1.m4223j(textView2, this.f8875O);
                }
            }
        }
        ViewGroup viewGroup3 = this.f8885T;
        if (viewGroup3 != null) {
            if (z3 && m4666V > 0) {
                TextView textView3 = this.f8887U;
                if (textView3 != null) {
                    int round = Math.round(textView3.getPaint().measureText("000       000")) + this.f8885T.getPaddingEnd() + this.f8885T.getPaddingStart();
                    if (round > 0) {
                        this.f8885T.setMinimumWidth(round);
                    }
                }
                m4615X0(this.f8885T, m4666V);
            } else if (z3 && z2 && (view2 = this.f8875O) != null) {
                view2.post(new RunnableC1571r0(this, 11));
            } else {
                viewGroup3.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    viewGroup3.setLayoutParams(layoutParams2);
                }
            }
        }
        boolean z5 = (z2 && z3) || m4629A1() || m4723u1() > 0.001f;
        View view6 = this.f8945p0;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams3 = view6.getLayoutParams() instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) this.f8945p0.getLayoutParams() : null;
            if (z5) {
                this.f8945p0.setVisibility(0);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 1.0f;
                    this.f8945p0.setLayoutParams(layoutParams3);
                }
            } else {
                this.f8945p0.setVisibility(8);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 0.0f;
                    this.f8945p0.setLayoutParams(layoutParams3);
                }
            }
        }
        View view7 = this.f8942o0;
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
        boolean m4629A1 = m4629A1();
        View view8 = this.f8942o0;
        if ((view8 instanceof ViewGroup) && (view = this.f8875O) != null && (viewGroup = this.f8885T) != null && this.f8945p0 != null) {
            ViewGroup viewGroup4 = (ViewGroup) view8;
            if (m4629A1) {
                view = viewGroup;
            }
            if (viewGroup4.getChildCount() < 1 || viewGroup4.getChildAt(0) != view) {
                viewGroup4.removeView(this.f8875O);
                viewGroup4.removeView(this.f8945p0);
                viewGroup4.removeView(this.f8885T);
                if (m4629A1) {
                    viewGroup4.addView(this.f8885T);
                    viewGroup4.addView(this.f8945p0);
                    viewGroup4.addView(this.f8875O);
                } else {
                    viewGroup4.addView(this.f8875O);
                    viewGroup4.addView(this.f8945p0);
                    viewGroup4.addView(this.f8885T);
                }
            }
        }
        if (m4629A1) {
            m4612U0(this.f8885T, 48);
            m4612U0(this.f8875O, 8388661);
        } else {
            m4612U0(this.f8875O, 48);
            m4612U0(this.f8885T, 8388661);
        }
        View view9 = this.f8942o0;
        if (view9 != null) {
            view9.setVisibility(z4 ? 0 : 8);
        }
        View view10 = this.f8939n0;
        if (view10 != null) {
            view10.setVisibility(z4 ? 0 : 8);
        }
    }

    /* renamed from: q */
    public final void m4709q(boolean z2) {
        int i;
        int i2;
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup == null || this.f8880Q0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8917g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8917g.post(new RunnableC1577u0(this, z2, 0));
            return;
        }
        m4665U();
        m4708p1();
        int round = Math.round(this.f8905c.getResources().getDisplayMetrics().density * 96.0f);
        float m4723u1 = m4723u1();
        float max = Math.max(0.0f, Math.min(1.0f, this.f8922h1));
        m4630B(m4723u1);
        m4724v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f8922h1, 0.0f, m4723u1()));
        m4689j(width, height, round, m4723u1);
        boolean z3 = m4723u1 > 0.001f;
        if (this.f8936m0 != null && this.f8908d.f2585W2 && !m4679e0() && !m4690j0()) {
            C0639g.m1872x().m1880u();
            if (C0639g.m1872x().m1880u().m1851a()) {
                if (max >= 0.999f) {
                    this.f8936m0.setAlpha(0.0f);
                    this.f8936m0.setVisibility(4);
                } else if (this.f8936m0.getVisibility() != 0) {
                    this.f8936m0.setVisibility(0);
                }
            }
        }
        View view = this.f8936m0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int i3 = width - 470;
        int max2 = Math.max(0, i3 / 2);
        int m4298b = AbstractC1561o.m4298b(height, round, 40, 0);
        if (!z3) {
            m4706p(1.0f);
            m4712r(this.f8936m0, round, max2, m4298b, max * 40.0f, z2);
            this.f8936m0.setAlpha(1.0f - max);
            this.f8936m0.bringToFront();
            View view2 = this.f8939n0;
            if (view2 != null) {
                view2.bringToFront();
                return;
            }
            return;
        }
        float f2 = ((-0.19999999f) * m4723u1) + 1.0f;
        m4706p(f2);
        int m152f = AbstractC0062j.m152f(round, f2, 1);
        ImageView m4701n0 = m4701n0();
        if (m4701n0 == null || m4701n0.getWidth() <= 0 || m4701n0.getHeight() <= 0) {
            i = max2;
            i2 = m4298b;
        } else {
            float f3 = this.f8916f1;
            float left = m4701n0.getLeft();
            float width2 = m4701n0.getWidth() * f3;
            float height2 = (m4701n0.getHeight() * f3) + m4701n0.getTop();
            float m149c = AbstractC0062j.m149c(width2, 470, 0.5f, left);
            float f4 = height2 + 23.0f;
            float max3 = Math.max(0.0f, (height - m152f) - 8.0f);
            if (f4 > max3) {
                f4 = max3;
            }
            float f5 = max2;
            int m151e = AbstractC0062j.m151e(m149c, f5, m4723u1, f5);
            float f6 = m4298b;
            int m151e2 = AbstractC0062j.m151e(f4, f6, m4723u1, f6);
            int max4 = Math.max(0, Math.min(m151e, Math.max(0, i3)));
            int max5 = Math.max(0, m151e2);
            i = max4;
            i2 = max5;
        }
        m4712r(this.f8936m0, m152f, i, i2, max * 40.0f, z2);
        this.f8936m0.setAlpha(1.0f - max);
        this.f8936m0.bringToFront();
        View view3 = this.f8939n0;
        if (view3 != null) {
            view3.bringToFront();
        }
    }

    /* renamed from: q0 */
    public final RectF m4710q0() {
        RectF rectF = new RectF();
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup != null && viewGroup.getWidth() > 0 && this.f8917g.getHeight() > 0) {
            float width = this.f8917g.getWidth() - 0.0f;
            float height = this.f8917g.getHeight();
            if (width > 0.0f && height > 0.0f) {
                rectF.set(0.0f, 0.0f, width, height);
            }
        }
        return rectF;
    }

    /* renamed from: q1 */
    public final void m4711q1(ImageView imageView, float f2, boolean z2, float f3, float f4) {
        ImageView imageView2 = imageView == this.f8944p ? this.f8955t : imageView == this.f8947q ? this.f8957u : null;
        if (imageView2 == null || imageView == null) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m4650K0(imageView2);
            C1572s c1572s = imageView2 == this.f8955t ? this.f8864I0 : this.f8866J0;
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
        m4622d0(imageView, f2, z2, fArr, fArr2);
        m4721u(imageView2, imageView, f2, fArr[0], fArr[1], fArr2[0] + f3, fArr2[1] + f4);
        C1572s c1572s2 = imageView2 == this.f8955t ? this.f8864I0 : this.f8866J0;
        if (c1572s2 != null) {
            c1572s2.m4470a(imageView2);
        }
    }

    /* renamed from: r */
    public final void m4712r(View view, int i, int i2, int i3, float f2, boolean z2) {
        float f3 = this.f8850B0;
        if (f3 < 0.0f) {
            f3 = i2;
        }
        float f4 = f3 + 0.0f;
        float f5 = this.f8852C0;
        float f6 = f5 >= 0.0f ? f5 + this.f8854D0 : i3 + f2;
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
        if (z2 && this.f8852C0 >= 0.0f && z3) {
            view.animate().cancel();
            view.setTranslationX(f4 - f7);
            view.setTranslationY(f6 - f8);
            view.animate().translationX(0.0f).translationY(f2).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            view.animate().cancel();
            view.setTranslationX(0.0f);
            view.setTranslationY(f2);
        }
        this.f8850B0 = f7;
        this.f8852C0 = f8;
        this.f8854D0 = f2;
    }

    /* renamed from: r0 */
    public final float m4713r0(View view) {
        if (view == this.f8871M) {
            return this.f8907c1;
        }
        if (view == this.f8891W) {
            return this.f8910d1;
        }
        return 0.0f;
    }

    /* renamed from: r1 */
    public final void m4714r1() {
        ValueAnimator valueAnimator = this.f8925i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8925i1 = null;
        }
        this.f8928j1 = false;
        this.f8931k1 = -1;
        cfgData cfgdata = this.f8908d;
        boolean z2 = cfgdata.f2561Q2;
        Context context = this.f8905c;
        if (!z2) {
            if (cfgdata.f2635h1 != 0) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
            }
            this.f8916f1 = m4720t1();
            this.f8919g1 = 1.0f;
            this.f8922h1 = 0.0f;
            m4636D();
            return;
        }
        if (m4693k0() && cfgdata.f2635h1 == 1) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        if (m4690j0() && cfgdata.f2635h1 != 0) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        this.f8916f1 = m4695l0() ? m4720t1() : 1.0f;
        this.f8919g1 = m4635C1() ? 1.0f : 0.0f;
        this.f8922h1 = cfgdata.f2635h1 == 2 ? 1.0f : 0.0f;
        m4636D();
        if (m4695l0()) {
            ImageView m4701n0 = m4701n0();
            if (m4701n0 == null) {
                m4701n0 = m4661Q0();
            }
            if (m4701n0 == null || m4701n0.getWidth() > 0) {
                return;
            }
            m4701n0.post(new RunnableC1571r0(this, 18));
        }
    }

    /* renamed from: s */
    public final void m4715s(long j2) {
        boolean z2 = this.f8966y0 > 0;
        ProgressBar progressBar = this.f8962w0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8962w0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f8966y0)));
            }
        }
        TextView textView = this.f8958u0;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8958u0.setText(m4616Y(j2));
            }
        }
        TextView textView2 = this.f8960v0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8960v0.setText(m4616Y(this.f8966y0));
            }
        }
    }

    /* renamed from: s0 */
    public final float m4716s0(View view) {
        if (view == this.f8891W) {
            return this.f8913e1;
        }
        return 0.0f;
    }

    /* renamed from: s1 */
    public final void m4717s1(ImageView imageView, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (Math.abs(f2 - 1.0f) < 0.001f) {
            View[] m4672b0 = m4672b0(imageView);
            int length = m4672b0.length;
            for (int i = 0; i < length; i++) {
                View view = m4672b0[i];
                m4608N0(view, (view == this.f8871M ? m4645H0(f2) : m4713r0(view)) + f5 + f7, m4716s0(view) + f6 + f8);
            }
            return;
        }
        View[] m4672b02 = m4672b0(imageView);
        int length2 = m4672b02.length;
        for (int i2 = 0; i2 < length2; i2++) {
            View view2 = m4672b02[i2];
            m4607I(view2, f2, f3, f4, f5, f6, (view2 == this.f8871M ? m4645H0(f2) : m4713r0(view2)) + f7, m4716s0(view2) + f8);
        }
    }

    /* renamed from: t */
    public final void m4718t() {
        ViewGroup viewGroup;
        if (this.f8920h == null || (viewGroup = this.f8917g) == null) {
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f8917g.getHeight() <= 0) {
            this.f8917g.post(new RunnableC1571r0(this, 4));
            return;
        }
        if (this.f8920h.getLayoutParams() instanceof C1592d) {
            RectF m4710q0 = m4688i1() ? m4710q0() : m4656O();
            C1592d c1592d = (C1592d) this.f8920h.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m4710q0.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m4710q0.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m4710q0.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m4710q0.top);
            this.f8920h.setLayoutParams(c1592d);
            if (m4738z1() || m4632B1()) {
                this.f8920h.setVisibility(4);
            }
            if (m4632B1() || m4691j1()) {
                float f2 = this.f8905c.getResources().getDisplayMetrics().density * 14.0f;
                View view = this.f8932l;
                if (view == null) {
                    return;
                }
                m4623f(view, 25.0f + f2 + 10.0f);
                C1528d c1528d = this.f8938n;
                if (c1528d != null) {
                    c1528d.m4167b(f2);
                }
            }
        }
    }

    /* renamed from: t0 */
    public final RectF m4719t0() {
        Rect m4239u = AbstractC1539g1.m4239u();
        ViewGroup viewGroup = this.f8917g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f8917g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4208b0(m4239u, this.f8917g.getWidth(), this.f8917g.getHeight());
    }

    /* renamed from: t1 */
    public final float m4720t1() {
        ImageView m4701n0 = m4701n0();
        if (m4701n0 == null) {
            m4701n0 = m4661Q0();
        }
        float f2 = this.f8905c.getResources().getDisplayMetrics().density * 87.0f;
        float width = (m4701n0 == null || m4701n0.getWidth() <= 0) ? 730.0f : m4701n0.getWidth();
        return Math.max(0.2f, (width - f2) / width);
    }

    /* renamed from: u */
    public final void m4721u(ImageView imageView, ImageView imageView2, float f2, float f3, float f4, float f5, float f6) {
        if (imageView == null || imageView2 == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1571r0(this, 20));
            return;
        }
        float width = (imageView2.getWidth() * 0.5f) + imageView2.getLeft();
        float m149c = AbstractC0062j.m149c(width, f3, f2, f3);
        imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setTranslationX((m149c - ((imageView.getWidth() * 0.5f) + imageView.getLeft())) + f5);
        imageView.setTranslationY((AbstractC0062j.m149c((imageView2.getHeight() * 0.5f) + imageView2.getTop(), f4, f2, f4) - ((imageView.getHeight() * 0.5f) + imageView.getTop())) + f6 + 0.0f);
        ImageView imageView3 = this.f8950r;
        if (imageView == imageView3 || imageView == this.f8953s) {
            C1572s c1572s = imageView == imageView3 ? this.f8860G0 : this.f8862H0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m4640F(imageView);
        }
    }

    /* renamed from: u0 */
    public final void m4722u0() {
        float f2 = this.f8905c.getResources().getDisplayMetrics().density * 6.0f;
        m4614W0(this.f8944p, f2);
        m4614W0(this.f8947q, f2);
        m4614W0(this.f8950r, f2);
        m4614W0(this.f8953s, f2);
        for (ImageView imageView : this.f8963x) {
            m4614W0(imageView, f2);
        }
        for (ImageView imageView2 : this.f8965y) {
            m4614W0(imageView2, f2);
        }
        m4614W0(this.f8955t, f2);
        m4614W0(this.f8957u, f2);
        m4614W0(this.f8906c0, f2);
        m4614W0(this.f8909d0, f2);
        m4614W0(this.f8869L, f2);
        m4614W0(this.f8889V, f2);
        m4614W0(this.f8871M, f2);
        m4614W0(this.f8873N, f2);
        m4614W0(this.f8885T, f2);
        m4614W0(this.f8939n0, f2);
        m4614W0(this.f8936m0, f2);
        m4614W0(this.f8867K, f2);
        m4614W0(this.f8891W, f2);
        m4614W0(this.f8929k, 2.0f);
        m4614W0(this.f8932l, 2.0f);
        m4614W0(this.f8935m, 2.0f);
        m4614W0(this.f8941o, 0.0f);
    }

    /* renamed from: u1 */
    public final float m4723u1() {
        float m4720t1 = m4720t1();
        if (Math.abs(m4720t1 - 1.0f) < 0.001f) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (1.0f - this.f8916f1) / (1.0f - m4720t1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4724v(int i, int i2, int i3, float f2) {
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
        View view4 = this.f8939n0;
        if (view4 == null || view4.getVisibility() != 0) {
            return;
        }
        View view5 = this.f8875O;
        boolean z2 = view5 != null && view5.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f8885T;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = (z2 ^ z3) && !(m4629A1() || (m4723u1() > 0.001f ? 1 : (m4723u1() == 0.001f ? 0 : -1)) > 0);
        int m4666V = m4666V();
        if (m4666V <= 0 || (!z2 && !z3)) {
            if (!z2 || (view = this.f8875O) == null) {
                m4666V = 0;
            } else if (view.getHeight() > 0) {
                m4666V = Math.max(0, this.f8875O.getHeight());
            } else {
                this.f8875O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                m4666V = Math.max(0, this.f8875O.getMeasuredHeight());
            }
            if (z3 && (viewGroup = this.f8885T) != null) {
                if (viewGroup.getHeight() > 0) {
                    max = Math.max(m4666V, this.f8885T.getHeight());
                } else {
                    this.f8885T.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    max = Math.max(m4666V, this.f8885T.getMeasuredHeight());
                }
                m4666V = max;
            }
        }
        if (m4666V <= 0) {
            View view6 = this.f8942o0;
            if (view6 != null && view6.getVisibility() == 0 && this.f8942o0.getHeight() > 0) {
                m4666V = this.f8942o0.getHeight();
            } else if (this.f8939n0.getHeight() > 0) {
                m4666V = this.f8939n0.getHeight();
            }
        }
        if (m4666V <= 0) {
            this.f8939n0.post(new RunnableC1571r0(this, 7));
            return;
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float max3 = Math.max(0.0f, Math.min(1.0f, this.f8922h1));
        float f7 = (max2 * (-0.19999999f)) + 1.0f;
        if (z4) {
            View view7 = z2 ? this.f8875O : this.f8885T;
            if (view7 != null) {
                view7.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(m4666V, 1073741824));
                if (view7.getMeasuredWidth() > 0) {
                    i4 = view7.getMeasuredWidth();
                    float f8 = i4;
                    float f9 = f8 * f7;
                    float f10 = m4666V * f7;
                    int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
                    int i8 = i - i4;
                    int m152f = AbstractC0062j.m152f(i8, 0.5f, 0);
                    float f11 = m4298b - m4666V;
                    float f12 = 1.0f - max2;
                    int max4 = Math.max(0, Math.round(f11 - (27.0f * f12)));
                    if (max2 <= 0.001f) {
                        ImageView m4661Q0 = m4661Q0();
                        if (m4661Q0 == null || m4661Q0.getWidth() <= 0 || m4661Q0.getHeight() <= 0) {
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
                            float m4720t1 = m4720t1();
                            float f15 = this.f8916f1;
                            float m149c = AbstractC0062j.m149c(m4720t1, f15, max3, f15);
                            f3 = f12;
                            f4 = f8;
                            float width = (((m4661Q0.getWidth() * m149c) - f9) * 0.5f) + AbstractC0062j.m149c(1.0f, m149c, m4661Q0.getWidth(), m4661Q0.getLeft()) + 110.0f;
                            float height = (m4661Q0.getHeight() * m149c) + m4661Q0.getTop() + 23.0f + 70.0f;
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
                    view2 = this.f8939n0;
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
                        this.f8939n0.setLayoutParams(c1592d);
                        f5 = 0.0f;
                        float max7 = (Math.max(0.0f, Math.min(1.0f, max2)) * (-0.19999999f)) + 1.0f;
                        this.f8939n0.setPivotX(z4 ? 0.5f * f4 : 0.0f);
                        this.f8939n0.setPivotY(0.0f);
                        this.f8939n0.setScaleX(max7);
                        this.f8939n0.setScaleY(max7);
                        this.f8939n0.setTranslationX(0.0f);
                        this.f8939n0.setTranslationY(0.0f);
                    }
                    view3 = this.f8939n0;
                    if (view3 != null) {
                        view3.setTranslationX((-15.0f) * max2);
                        this.f8939n0.setTranslationY(f5);
                    }
                    if (this.f8875O != null) {
                        this.f8875O.setTranslationX((m4629A1() ? -50.0f : (-20.0f) * f3) - (7.0f * max3));
                        this.f8875O.setTranslationY(max3 * (-40.0f));
                    }
                    if (this.f8885T == null) {
                        if (m4629A1()) {
                            f6 = m4690j0() ? -235.0f : -215.0f;
                        } else {
                            f6 = ((z4 ? f5 : max2 * (-10.0f)) - (max2 * 15.0f)) - (f3 * 10.0f);
                        }
                        this.f8885T.setTranslationX(f6 - (20.0f * max3));
                        this.f8885T.setTranslationY(max3 * (-40.0f));
                        this.f8885T.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
        }
        i4 = 470;
        float f82 = i4;
        float f92 = f82 * f7;
        float f102 = m4666V * f7;
        int m4298b2 = AbstractC1561o.m4298b(i2, i3, 40, 0);
        int i82 = i - i4;
        int m152f2 = AbstractC0062j.m152f(i82, 0.5f, 0);
        float f112 = m4298b2 - m4666V;
        float f122 = 1.0f - max2;
        int max42 = Math.max(0, Math.round(f112 - (27.0f * f122)));
        if (max2 <= 0.001f) {
        }
        int round2 = m152f2 - Math.round(550.0f * max3);
        view2 = this.f8939n0;
        if (view2 != null) {
        }
        view3 = this.f8939n0;
        if (view3 != null) {
        }
        if (this.f8875O != null) {
        }
        if (this.f8885T == null) {
        }
    }

    /* renamed from: v0 */
    public final void m4725v0() {
        float f2;
        float m1789h;
        float f3;
        int i;
        AbstractC1539g1.m4228l0(this.f8917g, !this.f8872M0);
        carData cardata = this.f8911e;
        float m1780z = cardata.m1780z();
        cfgData cfgdata = this.f8908d;
        float f4 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        C1572s c1572s = this.f8860G0;
        c1572s.f8681g = Math.max(c1572s.f8676b, Math.min(c1572s.f8677c, f4));
        C1572s c1572s2 = this.f8862H0;
        c1572s2.f8681g = Math.max(c1572s2.f8676b, Math.min(c1572s2.f8677c, Math.max(0.0f, cardata.m1779y() / 1000.0f)));
        float m1780z2 = cardata.m1780z();
        float f5 = m1780z2 < 0.0f ? 0.0f : m1780z2 * cfgdata.f2702u3;
        float m1779y = cardata.m1779y() / 1000.0f;
        if (m1779y < 0.0f) {
            m1779y = 0.0f;
        }
        TextView textView = this.f8906c0;
        int i2 = f8844s1;
        if (textView != null) {
            textView.setTextColor(f5 > cfgdata.f2568S1 ? -65536 : f5 > cfgdata.f2564R1 ? -256 : i2);
            this.f8906c0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f5)).replace(",", "."));
        }
        TextView textView2 = this.f8909d0;
        if (textView2 != null) {
            textView2.setTextColor(m1779y > cfgdata.f2576U1 ? -65536 : m1779y > cfgdata.f2572T1 ? -256 : i2);
            this.f8909d0.setText(AbstractC1256E0.m2986A(m1779y));
        }
        m4641F0();
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c.f7147f) {
            float f6 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            float m1776v = cardata.m1776v();
            m1789h = cfgdata.m1786e(m1775u, m1776v, f6);
            f3 = cfgdata.m1787f(m1775u, m1776v, f6);
            f2 = m1789h;
        } else {
            float max = Math.max(0.0f, cardata.m1774t());
            f2 = max;
            m1789h = cfgdata.m1789h() * max;
            f3 = f2;
        }
        C1572s c1572s3 = this.f8864I0;
        if (c1572s3 != null) {
            c1572s3.f8681g = Math.max(c1572s3.f8676b, Math.min(c1572s3.f8677c, f3));
        }
        TextView textView3 = this.f8869L;
        if (textView3 != null) {
            m4613V0(textView3, m1789h, "L", f2 < 15.0f ? -65536 : f2 < 30.0f ? -256 : i2);
        }
        int i3 = f2 < 15.0f ? -65536 : f2 < 30.0f ? -256 : i2;
        if (this.f8871M != null) {
            if (!m4670a0() || cfgdata.f2543M0.f7147f) {
                this.f8871M.setVisibility(4);
            } else {
                this.f8871M.setVisibility(0);
                float m1777w = cardata.m1777w();
                if (m1777w < 0.0f) {
                    SpannableString spannableString = new SpannableString("--km");
                    spannableString.setSpan(AbstractC0062j.m155i(this.f8871M, -7829368, i3), 0, 2, 33);
                    this.f8871M.setText(spannableString);
                } else {
                    m4613V0(this.f8871M, m1777w, "km", i3);
                }
            }
        }
        float m1743d = cardata.m1743d();
        C1572s c1572s4 = this.f8866J0;
        if (c1572s4 != null) {
            float f7 = c1572s4.f8676b;
            float f8 = c1572s4.f8677c;
            if (m1743d < -90.0f) {
                c1572s4.f8681g = Math.max(f7, Math.min(f8, 40.0f));
            } else {
                c1572s4.f8681g = Math.max(f7, Math.min(f8, m1743d));
            }
        }
        TextView textView4 = this.f8889V;
        if (textView4 != null) {
            if (m1743d < -90.0f) {
                textView4.setText("--°C");
                this.f8889V.setTextColor(-7829368);
            } else {
                m4613V0(textView4, m1743d, "°C", m1743d < 40.0f ? -16776961 : m1743d > 112.0f ? -65536 : m1743d > 107.0f ? -256 : i2);
                m4698m0();
            }
        }
        float m1765o = cardata.m1765o();
        TextView textView5 = this.f8849B;
        if (textView5 != null) {
            textView5.setTextColor(-1);
            this.f8849B.setText(m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L");
        }
        if (this.f8851C != null) {
            this.f8851C.setText(this.f8902b.getContext().getString((cardata.m1780z() > 0.0f ? 1 : (cardata.m1780z() == 0.0f ? 0 : -1)) > 0 ? R.string.ip_theme_41_inst_fuel_unit_l100 : R.string.ip_theme_41_inst_fuel_unit_lph));
        }
        m4618Z0(this.f8855E, cardata.m1739b());
        m4618Z0(this.f8861H, cardata.m1737a());
        m4731x0();
        m4637D0();
        if (this.f8887U != null) {
            String str = ((double) cardata.m1715C()) <= 10.0d ? "%.1f" : "%.0f";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float[] fArr = {cardata.m1715C(), cardata.m1716D(), cardata.m1717E(), cardata.m1718F()};
            String[] strArr = {"       ", "\n", "       ", ""};
            for (int i4 = 0; i4 < 4; i4++) {
                float f9 = fArr[i4];
                String replace = (f9 == -99.0f || f9 == 3.5f) ? "--" : String.format(Locale.ENGLISH, str, Float.valueOf(f9)).replace(",", ".");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) replace);
                if (f9 == -99.0f) {
                    i = -16776961;
                } else {
                    float f10 = cfgdata.f2580V1;
                    i = f9 < 0.95f * f10 ? -65536 : f9 < f10 ? -256 : -1;
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 33);
                if (i4 < 3) {
                    spannableStringBuilder.append((CharSequence) strArr[i4]);
                }
            }
            this.f8887U.setText(spannableStringBuilder);
        }
        m4639E0();
        m4634C0();
        m4628A0();
        TextView textView6 = this.f8895Y;
        if (textView6 == null) {
            return;
        }
        textView6.setText(AbstractC1372y1.m3307m(this.f8905c));
    }

    /* renamed from: v1 */
    public final void m4726v1(boolean z2) {
        this.f8914f.removeCallbacks(this.f8882R0);
        if (z2 && AbstractC1372y1.m3272C()) {
            m4652L0();
            return;
        }
        if (!m4687i0()) {
            m4652L0();
            return;
        }
        m4653M();
        if (z2) {
            AbstractC1372y1.m3287R(true, true);
            m4655N();
            this.f8874N0 = false;
            this.f8886T0 = 0.0f;
            if (m4685h0()) {
                m4735y1();
            } else {
                m4728w0();
            }
            m4727w();
            m4699m1(0.0f, 1.0f, new RunnableC1571r0(this, 9));
            return;
        }
        if (m4694k1() && this.f8886T0 > 0.0f) {
            m4727w();
            m4699m1(this.f8886T0, 0.0f, new RunnableC1571r0(this, 10));
        } else {
            this.f8874N0 = true;
            this.f8886T0 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m4647J();
        }
    }

    /* renamed from: w */
    public final void m4727w() {
        m4733y();
        boolean m4670a0 = m4670a0();
        ImageView m4701n0 = m4701n0();
        cfgData cfgdata = this.f8908d;
        boolean z2 = cfgdata.f2636h2;
        ImageView imageView = z2 ? this.f8953s : this.f8950r;
        TextView textView = z2 ? this.f8909d0 : this.f8906c0;
        m4625g1(m4701n0, m4670a0);
        m4625g1(imageView, m4670a0);
        m4677d1(imageView, m4670a0);
        ImageView imageView2 = null;
        m4625g1(textView, m4670a0 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m4701n0 == this.f8944p) {
            imageView2 = this.f8955t;
        } else if (m4701n0 == this.f8947q) {
            imageView2 = this.f8957u;
        }
        m4625g1(imageView2, m4670a0);
        m4675c1(m4701n0, m4670a0);
        if (!m4670a0) {
            m4648J0();
        } else if (m4695l0()) {
            m4692k(m4701n0, imageView, textView, m4704o0(), false, this.f8916f1, 0.0f, 0.0f);
            m4711q1(m4701n0, this.f8916f1, false, 0.0f, 0.0f);
        } else {
            m4648J0();
            m4711q1(m4701n0, 1.0f, false, 0.0f, 0.0f);
        }
        m4709q(false);
        m4633C();
        m4681f0();
        m4730x();
    }

    /* renamed from: w0 */
    public final void m4728w0() {
        C1525c c1525c;
        if (this.f8917g == null) {
            return;
        }
        try {
            if (!this.f8908d.f2561Q2 && !m4690j0()) {
                m4660Q();
                return;
            }
            if (!m4738z1()) {
                if (m4685h0()) {
                    m4663S();
                }
                ViewGroup viewGroup = this.f8917g;
                if (viewGroup != null) {
                    viewGroup.setLayerType(0, null);
                }
                View view = this.f8920h;
                if (view != null) {
                    view.setVisibility(8);
                }
                m4736z();
                return;
            }
            if (!m4685h0()) {
                m4700n();
                m4718t();
                return;
            }
            C1574t m4657O0 = m4657O0();
            if (m4705o1()) {
                C1525c c1525c2 = this.f8943o1;
                if (c1525c2 != null && c1525c2.m4161c()) {
                    m4683g0();
                    m4703o();
                }
            } else if (m4657O0.m4472a() && (c1525c = this.f8943o1) != null && !c1525c.m4161c()) {
                m4700n();
                return;
            }
            m4718t();
            m4735y1();
        } finally {
            m4638E();
        }
    }

    /* renamed from: w1 */
    public final ImageView[] m4729w1(ImageView imageView) {
        if (imageView == this.f8950r) {
            return this.f8963x;
        }
        if (imageView == this.f8953s) {
            return this.f8965y;
        }
        return null;
    }

    /* renamed from: x */
    public final void m4730x() {
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f8871M == null || (imageView = this.f8944p) == null) {
            return;
        }
        if (imageView.getWidth() <= 0) {
            this.f8944p.post(new RunnableC1571r0(this, 6));
            return;
        }
        ImageView imageView2 = this.f8944p;
        boolean z2 = imageView2 == m4661Q0();
        float f5 = this.f8916f1;
        if (z2 && m4694k1()) {
            float[] fArr = new float[2];
            m4674c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m4695l0()) {
                f5 = this.f8916f1 * (1.0f - this.f8886T0);
            }
            f2 = f5;
            f4 = f7;
            f3 = f6;
        } else {
            f2 = f5;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        float m4645H0 = m4645H0(f2);
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m4608N0(this.f8871M, m4645H0, 0.0f);
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m4622d0(imageView2, f2, z2, fArr2, fArr3);
        m4607I(this.f8871M, f2, fArr2[0], fArr2[1], f3, f4, m4645H0 + fArr3[0], fArr3[1]);
    }

    /* renamed from: x0 */
    public final void m4731x0() {
        TextView textView = this.f8891W;
        if (textView == null) {
            return;
        }
        textView.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(this.f8911e.m1741c())));
        m4698m0();
    }

    /* renamed from: x1 */
    public final void m4732x1() {
        cfgData cfgdata = this.f8908d;
        int i = (cfgdata.f2537K2 && cfgdata.f2589X2 && m4670a0() && !AbstractC1539g1.m4194P(cfgdata, this.f8911e)) ? 0 : 8;
        ImageView imageView = this.f8930k0;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.f8933l0;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
    }

    /* renamed from: y */
    public final void m4733y() {
        boolean z2;
        boolean z3 = m4670a0() && (((z2 = this.f8874N0) && this.f8886T0 <= 0.0f) || z2 || this.f8886T0 < 1.0f);
        ImageView m4661Q0 = m4661Q0();
        cfgData cfgdata = this.f8908d;
        boolean z4 = cfgdata.f2636h2;
        ImageView imageView = z4 ? this.f8950r : this.f8953s;
        TextView textView = z4 ? this.f8906c0 : this.f8909d0;
        m4625g1(m4661Q0, z3);
        m4625g1(imageView, z3);
        m4677d1(imageView, z3);
        ImageView imageView2 = null;
        m4625g1(textView, z3 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m4661Q0 == this.f8944p) {
            imageView2 = this.f8955t;
        } else if (m4661Q0 == this.f8947q) {
            imageView2 = this.f8957u;
        }
        m4625g1(imageView2, z3);
        m4675c1(m4661Q0, z3);
        if (!z3) {
            m4654M0();
            return;
        }
        if (m4695l0()) {
            float[] fArr = new float[2];
            m4674c0(fArr);
            float f2 = (1.0f - this.f8886T0) * this.f8916f1;
            m4692k(m4661Q0, imageView, textView, m4662R0(), true, f2, fArr[0], fArr[1]);
            m4711q1(m4661Q0, f2, true, fArr[0], fArr[1]);
            return;
        }
        boolean z5 = this.f8874N0;
        float f3 = (!z5 || this.f8886T0 > 0.0f) ? this.f8886T0 : 0.0f;
        float max = (!z5 || this.f8886T0 > 0.0f) ? Math.max(0.0f, 1.0f - this.f8886T0) : 1.0f;
        if (f3 <= 0.0f && Math.abs(max - 1.0f) < 0.001f) {
            m4654M0();
            m4711q1(m4661Q0, 1.0f, true, 0.0f, 0.0f);
            return;
        }
        ImageView m4661Q02 = m4661Q0();
        if (m4661Q02 != null) {
            if (m4661Q02.getWidth() <= 0 || m4661Q02.getHeight() <= 0) {
                m4661Q02.post(new RunnableC1571r0(this, 20));
            } else {
                float[] fArr2 = {this.f8892W0 ? this.f8888U0 : m4661Q02.getLeft() + (m4661Q02.getWidth() * 0.5f), this.f8892W0 ? this.f8890V0 : (m4661Q02.getHeight() * 0.5f) + m4661Q02.getTop()};
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float[] fArr3 = new float[2];
                m4674c0(fArr3);
                boolean z6 = cfgdata.f2636h2;
                ImageView imageView3 = z6 ? this.f8950r : this.f8953s;
                TextView textView2 = z6 ? this.f8906c0 : this.f8909d0;
                float m4662R0 = m4662R0();
                float f6 = max;
                m4607I(m4661Q02, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
                m4721u(imageView3, m4661Q02, max, f4, f5, fArr3[0], fArr3[1]);
                m4607I(textView2, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, m4662R0);
                m4717s1(m4661Q02, max, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
            }
        }
        m4711q1(m4661Q0, max, true, 0.0f, 0.0f);
    }

    /* renamed from: y0 */
    public final void m4734y0(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f8908d;
        if (cfgdata.f2537K2 && cfgdata.f2589X2) {
            boolean m4670a0 = m4670a0();
            carData cardata = this.f8911e;
            if (m4670a0 || AbstractC1539g1.m4194P(cfgdata, cardata)) {
                byte b2 = (byte) (i & 15);
                byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
                EnumC1457c enumC1457c = cfgdata.f2543M0;
                if (!AbstractC1539g1.m4194P(cfgdata, cardata) && (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite)) {
                    b3 = 1;
                    b2 = 1;
                }
                if (b2 == 1) {
                    ImageView imageView2 = this.f8921h0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView2 = this.f8924i0;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                    }
                } else if (b2 == 2) {
                    ImageView imageView3 = this.f8921h0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        this.f8921h0.setColorFilter(-7829368);
                    }
                    TextView textView3 = this.f8924i0;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    ImageView imageView4 = this.f8921h0;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        this.f8921h0.setColorFilter(-16711936);
                    }
                    TextView textView4 = this.f8924i0;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
                if (cardata.m1747f() < 20 && (textView = this.f8924i0) != null) {
                    textView.setVisibility(4);
                }
                if (b3 == 1) {
                    ImageView imageView5 = this.f8927j0;
                    if (imageView5 != null) {
                        imageView5.setVisibility(4);
                    }
                } else if (b3 == 2) {
                    ImageView imageView6 = this.f8927j0;
                    if (imageView6 != null) {
                        imageView6.setVisibility(0);
                        this.f8927j0.setColorFilter(-7829368);
                    }
                } else if (b3 == 3 && (imageView = this.f8927j0) != null) {
                    imageView.setVisibility(0);
                    this.f8927j0.setColorFilter(-16711936);
                }
                m4732x1();
                m4651L();
                return;
            }
        }
        m4668X();
    }

    /* renamed from: y1 */
    public final void m4735y1() {
        float f2;
        float f3;
        if (this.f8917g == null || this.f8943o1 == null || !m4738z1()) {
            ViewGroup viewGroup = this.f8917g;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
                return;
            }
            return;
        }
        if (this.f8917g.getWidth() <= 0 || this.f8917g.getHeight() <= 0) {
            this.f8917g.post(new RunnableC1571r0(this, 5));
            return;
        }
        float f4 = this.f8905c.getResources().getDisplayMetrics().density;
        float f5 = 14.0f * f4;
        float f6 = f4 * 1.0f;
        if (m4688i1()) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f2 = f6;
            f3 = f5;
        }
        this.f8943o1.m4160b();
        if (!this.f8943o1.m4161c()) {
            this.f8943o1.m4162d(m4688i1() ? -15197150 : -16777216);
        }
        if (m4688i1()) {
            ViewGroup viewGroup2 = this.f8917g;
            if (viewGroup2 != null) {
                viewGroup2.getOverlay().clear();
            }
            RectF m4710q0 = m4710q0();
            if (m4710q0.width() > 0.0f && m4710q0.height() > 0.0f) {
                this.f8943o1.m4159a(m4710q0.left, m4710q0.top, m4710q0.right, m4710q0.bottom, f3, f2);
            }
        } else if (m4632B1() || m4691j1()) {
            RectF m4656O = m4656O();
            if (m4632B1() && !m4691j1()) {
                m4656O = m4610S0(m4656O, this.f8919g1);
            }
            if (m4656O.width() <= 0.0f || m4656O.height() <= 0.0f) {
                ViewGroup viewGroup3 = this.f8917g;
                if (viewGroup3 != null) {
                    viewGroup3.getOverlay().clear();
                }
            } else {
                this.f8943o1.m4159a(m4656O.left, m4656O.top, m4656O.right, m4656O.bottom, f5, 0.0f);
                ViewGroup viewGroup4 = this.f8917g;
                if (viewGroup4 != null) {
                    viewGroup4.getOverlay().clear();
                }
            }
        } else {
            ViewGroup viewGroup5 = this.f8917g;
            if (viewGroup5 != null) {
                viewGroup5.getOverlay().clear();
            }
        }
        if (m4694k1()) {
            RectF m4610S0 = m4610S0(m4719t0(), this.f8886T0);
            if (m4610S0.width() > 0.0f && m4610S0.height() > 0.0f) {
                this.f8943o1.m4159a(m4610S0.left, m4610S0.top, m4610S0.right, m4610S0.bottom, f5, 0.0f);
            }
        }
        ImageView imageView = this.f8941o;
        if (imageView != null && imageView.getBackground() == this.f8943o1) {
            this.f8941o.invalidate();
        } else if (this.f8917g.getBackground() == this.f8943o1) {
            this.f8917g.invalidate();
        }
    }

    /* renamed from: z */
    public final void m4736z() {
        ViewGroup viewGroup = this.f8917g;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        if (this.f8941o == null) {
            ViewGroup viewGroup2 = this.f8917g;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(m4688i1() ? -15197150 : -16777216);
                return;
            }
            return;
        }
        C1574t m4657O0 = m4657O0();
        this.f8941o.setVisibility(0);
        this.f8941o.setLayerType(0, null);
        this.f8941o.setTranslationY(0.0f);
        this.f8941o.setBackground(null);
        if (!m4657O0.m4472a()) {
            this.f8941o.setImageDrawable(null);
            this.f8941o.setBackgroundResource(R.drawable.ip_theme_48_bg);
            return;
        }
        int i = m4657O0.f8687b;
        if (i != 0) {
            this.f8941o.setImageResource(i);
            return;
        }
        Uri uri = m4657O0.f8688c;
        if (uri != null) {
            this.f8941o.setImageURI(uri);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0024, code lost:
    
        if (r12 == 2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4737z0(int i) {
        Bitmap bitmap;
        int i2;
        ImageView imageView = this.f8944p;
        if (imageView == null || this.f8947q == null || (bitmap = this.f8959v) == null || this.f8961w == null) {
            return;
        }
        cfgData cfgdata = this.f8908d;
        if (cfgdata.f2641i2 && cfgdata.f2615d1.f7096F) {
            i2 = i == 1 ? 1 : 2;
            if (i2 != this.f8896Y0) {
                return;
            }
            this.f8896Y0 = i2;
            if (i2 == 0) {
                imageView.setImageBitmap(bitmap);
                this.f8947q.setImageBitmap(this.f8961w);
                return;
            } else {
                int i3 = i2 == 1 ? -65536 : f8845t1;
                EnumC1456b enumC1456b = cfgdata.f2615d1;
                AbstractC1261H.m3037b(this.f8905c, imageView, bitmap, "themes/48/theme_48_spd.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                AbstractC1261H.m3037b(this.f8905c, this.f8947q, this.f8961w, "themes/48/theme_48_rpm.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                return;
            }
        }
        i2 = 0;
        if (i2 != this.f8896Y0) {
        }
    }

    /* renamed from: z1 */
    public final boolean m4738z1() {
        return this.f8908d.f2537K2 && (m4694k1() || m4693k0() || m4690j0() || m4632B1());
    }
}
