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

/* renamed from: u0.E0 */
/* loaded from: classes.dex */
public final class C1477E0 {

    /* renamed from: s1 */
    public static final int f7300s1 = Color.rgb(248, 240, 224);

    /* renamed from: t1 */
    public static final int f7301t1 = Color.rgb(224, 156, 24);

    /* renamed from: u1 */
    public static final int f7302u1 = R.drawable.ip_theme_49_media_frame;

    /* renamed from: A0 */
    public long f7304A0;

    /* renamed from: B */
    public TextView f7305B;

    /* renamed from: C */
    public TextView f7307C;

    /* renamed from: D */
    public TextView f7309D;

    /* renamed from: D0 */
    public float f7310D0;

    /* renamed from: E */
    public TextView f7311E;

    /* renamed from: E0 */
    public boolean f7312E0;

    /* renamed from: F */
    public TextView f7313F;

    /* renamed from: F0 */
    public C1531e f7314F0;

    /* renamed from: G */
    public TextView f7315G;

    /* renamed from: G0 */
    public C1572s f7316G0;

    /* renamed from: H */
    public TextView f7317H;

    /* renamed from: H0 */
    public C1572s f7318H0;

    /* renamed from: I */
    public TextView f7319I;

    /* renamed from: I0 */
    public C1572s f7320I0;

    /* renamed from: J */
    public TextView f7321J;

    /* renamed from: J0 */
    public C1572s f7322J0;

    /* renamed from: K */
    public View f7323K;

    /* renamed from: K0 */
    public boolean f7324K0;

    /* renamed from: L */
    public TextView f7325L;

    /* renamed from: L0 */
    public boolean f7326L0;

    /* renamed from: M */
    public TextView f7327M;

    /* renamed from: N */
    public TextView f7329N;

    /* renamed from: O */
    public View f7331O;

    /* renamed from: O0 */
    public ValueAnimator f7332O0;

    /* renamed from: P */
    public ViewGroup f7333P;

    /* renamed from: P0 */
    public ValueAnimator f7334P0;

    /* renamed from: Q */
    public TextView f7335Q;

    /* renamed from: Q0 */
    public boolean f7336Q0;

    /* renamed from: R */
    public TextView f7337R;

    /* renamed from: S */
    public TextView f7339S;

    /* renamed from: T */
    public ViewGroup f7341T;

    /* renamed from: U */
    public TextView f7343U;

    /* renamed from: U0 */
    public float f7344U0;

    /* renamed from: V */
    public TextView f7345V;

    /* renamed from: V0 */
    public float f7346V0;

    /* renamed from: W */
    public TextView f7347W;

    /* renamed from: W0 */
    public boolean f7348W0;

    /* renamed from: X */
    public TextView f7349X;

    /* renamed from: X0 */
    public Boolean f7350X0;

    /* renamed from: Y */
    public TextView f7351Y;

    /* renamed from: Z */
    public TextView f7353Z;

    /* renamed from: Z0 */
    public Boolean f7354Z0;

    /* renamed from: a */
    public final C1537g f7355a;

    /* renamed from: a0 */
    public ImageView f7356a0;

    /* renamed from: a1 */
    public float f7357a1;

    /* renamed from: b */
    public final View f7358b;

    /* renamed from: b0 */
    public ImageView f7359b0;

    /* renamed from: b1 */
    public float f7360b1;

    /* renamed from: c */
    public final Context f7361c;

    /* renamed from: c0 */
    public TextView f7362c0;

    /* renamed from: c1 */
    public float f7363c1;

    /* renamed from: d0 */
    public TextView f7365d0;

    /* renamed from: d1 */
    public float f7366d1;

    /* renamed from: e0 */
    public TextView f7368e0;

    /* renamed from: e1 */
    public float f7369e1;

    /* renamed from: f0 */
    public TextView f7371f0;

    /* renamed from: g */
    public ViewGroup f7373g;

    /* renamed from: g0 */
    public View f7374g0;

    /* renamed from: h */
    public View f7376h;

    /* renamed from: h0 */
    public ImageView f7377h0;

    /* renamed from: i */
    public View f7379i;

    /* renamed from: i0 */
    public TextView f7380i0;

    /* renamed from: i1 */
    public ValueAnimator f7381i1;

    /* renamed from: j */
    public View f7382j;

    /* renamed from: j0 */
    public ImageView f7383j0;

    /* renamed from: j1 */
    public boolean f7384j1;

    /* renamed from: k */
    public View f7385k;

    /* renamed from: k0 */
    public ImageView f7386k0;

    /* renamed from: l */
    public View f7388l;

    /* renamed from: l0 */
    public ImageView f7389l0;

    /* renamed from: l1 */
    public Boolean f7390l1;

    /* renamed from: m */
    public View f7391m;

    /* renamed from: m0 */
    public View f7392m0;

    /* renamed from: m1 */
    public float f7393m1;

    /* renamed from: n */
    public C1528d f7394n;

    /* renamed from: n0 */
    public View f7395n0;

    /* renamed from: o */
    public ImageView f7397o;

    /* renamed from: o0 */
    public View f7398o0;

    /* renamed from: o1 */
    public C1525c f7399o1;

    /* renamed from: p */
    public ImageView f7400p;

    /* renamed from: p0 */
    public View f7401p0;

    /* renamed from: q */
    public ImageView f7403q;

    /* renamed from: q0 */
    public int f7404q0;

    /* renamed from: r */
    public ImageView f7406r;

    /* renamed from: r0 */
    public ImageView f7407r0;

    /* renamed from: s */
    public ImageView f7409s;

    /* renamed from: s0 */
    public TextView f7410s0;

    /* renamed from: t */
    public ImageView f7411t;

    /* renamed from: t0 */
    public TextView f7412t0;

    /* renamed from: u */
    public ImageView f7413u;

    /* renamed from: u0 */
    public TextView f7414u0;

    /* renamed from: v */
    public Bitmap f7415v;

    /* renamed from: v0 */
    public TextView f7416v0;

    /* renamed from: w */
    public Bitmap f7417w;

    /* renamed from: w0 */
    public ProgressBar f7418w0;

    /* renamed from: x0 */
    public long f7420x0;

    /* renamed from: y0 */
    public long f7422y0;

    /* renamed from: z0 */
    public boolean f7424z0;

    /* renamed from: d */
    public final cfgData f7364d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f7367e = carData.getInstance();

    /* renamed from: f */
    public final Handler f7370f = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    public ImageView[] f7419x = new ImageView[0];

    /* renamed from: y */
    public ImageView[] f7421y = new ImageView[0];

    /* renamed from: z */
    public final float[] f7423z = new float[0];

    /* renamed from: A */
    public final float[] f7303A = new float[0];

    /* renamed from: B0 */
    public float f7306B0 = -1.0f;

    /* renamed from: C0 */
    public float f7308C0 = -1.0f;

    /* renamed from: M0 */
    public boolean f7328M0 = true;

    /* renamed from: N0 */
    public boolean f7330N0 = true;

    /* renamed from: R0 */
    public final RunnableC1585y0 f7338R0 = new RunnableC1585y0(this, 4);

    /* renamed from: S0 */
    public boolean f7340S0 = false;

    /* renamed from: T0 */
    public float f7342T0 = 0.0f;

    /* renamed from: Y0 */
    public int f7352Y0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: f1 */
    public float f7372f1 = 1.0f;

    /* renamed from: g1 */
    public float f7375g1 = 0.0f;

    /* renamed from: h1 */
    public float f7378h1 = 0.0f;

    /* renamed from: k1 */
    public int f7387k1 = -1;

    /* renamed from: n1 */
    public int f7396n1 = 999;

    /* renamed from: p1 */
    public final RunnableC1475D0 f7402p1 = new RunnableC1475D0(this, 0);

    /* renamed from: q1 */
    public final RunnableC1475D0 f7405q1 = new RunnableC1475D0(this, 1);

    /* renamed from: r1 */
    public final RunnableC1475D0 f7408r1 = new RunnableC1475D0(this, 2);

    public C1477E0(C1537g c1537g, View view) {
        this.f7355a = c1537g;
        this.f7358b = view;
        this.f7361c = view.getContext();
    }

    /* renamed from: A */
    public static void m3587A(View view, float f2, float f3) {
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
    public static void m3588I(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    public static void m3589P0(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    /* renamed from: R */
    public static ImageView[] m3590R(ImageView imageView) {
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
    public static RectF m3591U0(RectF rectF, float f2) {
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
    public static void m3592V0(View view, boolean z2, float f2, boolean z3) {
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
    public static void m3593W0(View view, int i) {
        if (view == null || !(view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: X0 */
    public static void m3594X0(TextView textView, float f2, String str, int i) {
        if (textView == null) {
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, str));
        spannableString.setSpan(AbstractC0062j.m155i(textView, -7829368, i), 0, replace.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: Y */
    public static String m3595Y(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: Y0 */
    public static void m3596Y0(View view, float f2) {
        if (view != null) {
            view.setElevation(f2);
        }
    }

    /* renamed from: Z0 */
    public static void m3597Z0(View view, int i) {
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
    public static void m3598a(C1477E0 c1477e0, ImageView[] imageViewArr, float[] fArr, float f2, float f3) {
        c1477e0.getClass();
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
    public static void m3599a1(View view, float f2) {
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
    public static void m3600b1(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(-1);
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: c1 */
    public static void m3601c1(TextView textView, float f2, float f3) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, f2 * f3);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(0.0f, 1.0f);
    }

    /* renamed from: d1 */
    public static void m3602d1(View view, int i) {
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
    public static void m3603f(View view, float f2) {
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
    public static void m3604f0(ImageView imageView, float f2, boolean z2, float[] fArr, float[] fArr2) {
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
    public static void m3605h1(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: i1 */
    public static void m3606i1(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: j1 */
    public static void m3607j1(ImageView imageView, C1572s c1572s) {
        if (imageView == null || c1572s == null) {
            return;
        }
        imageView.post(new RunnableC1559n0(imageView, 5, c1572s));
    }

    /* renamed from: l */
    public static void m3608l(ImageView imageView, boolean z2) {
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
    public final void m3609A0(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f7364d;
        if (cfgdata.f2537K2 && cfgdata.f2589X2) {
            boolean m3655a0 = m3655a0();
            carData cardata = this.f7367e;
            if (m3655a0 || AbstractC1539g1.m4194P(cfgdata, cardata)) {
                byte b2 = (byte) (i & 15);
                byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
                EnumC1457c enumC1457c = cfgdata.f2543M0;
                if (!AbstractC1539g1.m4194P(cfgdata, cardata) && (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite)) {
                    b3 = 1;
                    b2 = 1;
                }
                if (b2 == 1) {
                    ImageView imageView2 = this.f7377h0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView2 = this.f7380i0;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                    }
                } else if (b2 == 2) {
                    ImageView imageView3 = this.f7377h0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        this.f7377h0.setColorFilter(-7829368);
                    }
                    TextView textView3 = this.f7380i0;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    ImageView imageView4 = this.f7377h0;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        this.f7377h0.setColorFilter(-16711936);
                    }
                    TextView textView4 = this.f7380i0;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
                if (cardata.m1747f() < 20 && (textView = this.f7380i0) != null) {
                    textView.setVisibility(4);
                }
                if (b3 == 1) {
                    ImageView imageView5 = this.f7383j0;
                    if (imageView5 != null) {
                        imageView5.setVisibility(4);
                    }
                } else if (b3 == 2) {
                    ImageView imageView6 = this.f7383j0;
                    if (imageView6 != null) {
                        imageView6.setVisibility(0);
                        this.f7383j0.setColorFilter(-7829368);
                    }
                } else if (b3 == 3 && (imageView = this.f7383j0) != null) {
                    imageView.setVisibility(0);
                    this.f7383j0.setColorFilter(-16711936);
                }
                m3721z1();
                m3634L();
                return;
            }
        }
        m3653X();
    }

    /* renamed from: A1 */
    public final void m3610A1() {
        float f2;
        float f3;
        if (this.f7373g == null || this.f7399o1 == null || !m3613B1()) {
            ViewGroup viewGroup = this.f7373g;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
                return;
            }
            return;
        }
        if (this.f7373g.getWidth() <= 0 || this.f7373g.getHeight() <= 0) {
            this.f7373g.post(new RunnableC1585y0(this, 23));
            return;
        }
        float f4 = this.f7361c.getResources().getDisplayMetrics().density;
        float f5 = 14.0f * f4;
        float f6 = f4 * 1.0f;
        if (m3677k1()) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f2 = f6;
            f3 = f5;
        }
        this.f7399o1.m4160b();
        if (!this.f7399o1.m4161c()) {
            this.f7399o1.m4162d(m3677k1() ? -15068660 : -16777216);
        }
        if (m3677k1()) {
            ViewGroup viewGroup2 = this.f7373g;
            if (viewGroup2 != null) {
                viewGroup2.getOverlay().clear();
            }
            RectF m3699s0 = m3699s0();
            if (m3699s0.width() > 0.0f && m3699s0.height() > 0.0f) {
                this.f7399o1.m4159a(m3699s0.left, m3699s0.top, m3699s0.right, m3699s0.bottom, f3, f2);
            }
        } else if (m3619D1() || m3679l1()) {
            RectF m3640O = m3640O();
            if (m3619D1() && !m3679l1()) {
                m3640O = m3591U0(m3640O, this.f7375g1);
            }
            if (m3640O.width() <= 0.0f || m3640O.height() <= 0.0f) {
                ViewGroup viewGroup3 = this.f7373g;
                if (viewGroup3 != null) {
                    viewGroup3.getOverlay().clear();
                }
            } else {
                this.f7399o1.m4159a(m3640O.left, m3640O.top, m3640O.right, m3640O.bottom, f5, 0.0f);
                ViewGroup viewGroup4 = this.f7373g;
                if (viewGroup4 != null) {
                    viewGroup4.getOverlay().clear();
                }
            }
        } else {
            ViewGroup viewGroup5 = this.f7373g;
            if (viewGroup5 != null) {
                viewGroup5.getOverlay().clear();
            }
        }
        if (m3682m1()) {
            RectF m3591U0 = m3591U0(m3708v0(), this.f7342T0);
            if (m3591U0.width() > 0.0f && m3591U0.height() > 0.0f) {
                this.f7399o1.m4159a(m3591U0.left, m3591U0.top, m3591U0.right, m3591U0.bottom, f5, 0.0f);
            }
        }
        ImageView imageView = this.f7397o;
        if (imageView != null && imageView.getBackground() == this.f7399o1) {
            this.f7397o.invalidate();
        } else if (this.f7373g.getBackground() == this.f7399o1) {
            this.f7373g.invalidate();
        }
    }

    /* renamed from: B */
    public final void m3611B(float f2) {
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, f2));
        if (m3678l0()) {
            max = 1.0f;
        }
        m3599a1(this.f7392m0, max);
        m3599a1(this.f7323K, max);
        float max2 = Math.max(0.0f, Math.min(1.0f, this.f7378h1));
        if (max2 > 0.001f) {
            m3668g1(this.f7331O, max2);
            m3668g1(this.f7341T, max2);
        } else {
            m3599a1(this.f7331O, max);
            m3599a1(this.f7341T, max);
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
    public final void m3612B0(int i) {
        Bitmap bitmap;
        int i2;
        ImageView imageView = this.f7400p;
        if (imageView == null || this.f7403q == null || (bitmap = this.f7415v) == null || this.f7417w == null) {
            return;
        }
        cfgData cfgdata = this.f7364d;
        if (cfgdata.f2641i2 && cfgdata.f2615d1.f7096F) {
            i2 = i == 1 ? 1 : 2;
            if (i2 != this.f7352Y0) {
                return;
            }
            this.f7352Y0 = i2;
            if (i2 == 0) {
                imageView.setImageBitmap(bitmap);
                this.f7403q.setImageBitmap(this.f7417w);
                return;
            } else {
                int i3 = i2 == 1 ? -65536 : f7301t1;
                EnumC1456b enumC1456b = cfgdata.f2615d1;
                AbstractC1261H.m3037b(this.f7361c, imageView, bitmap, "themes/49/theme_49_spd.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                AbstractC1261H.m3037b(this.f7361c, this.f7403q, this.f7417w, "themes/49/theme_49_rpm.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                return;
            }
        }
        i2 = 0;
        if (i2 != this.f7352Y0) {
        }
    }

    /* renamed from: B1 */
    public final boolean m3613B1() {
        return this.f7364d.f2537K2 && (m3682m1() || m3681m0() || m3678l0() || m3619D1());
    }

    /* renamed from: C */
    public final void m3614C() {
        if (this.f7372f1 < 0.999f) {
            return;
        }
        m3690p0();
        m3693q0();
        m3654Z(this.f7372f1);
        m3647S0();
        m3649T0();
        m3654Z(this.f7372f1);
        m3687o0();
    }

    /* renamed from: C0 */
    public final void m3615C0() {
        TextView textView = this.f7349X;
        if (textView == null) {
            return;
        }
        if (!this.f7364d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f7367e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f7349X.setVisibility(4);
            return;
        }
        this.f7349X.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f7349X, -7829368, -1), 0, replace.length(), 33);
        this.f7349X.setText(spannableString);
    }

    /* renamed from: C1 */
    public final boolean m3616C1() {
        return m3678l0() || m3681m0() || m3684n0() || this.f7364d.f2635h1 == 2;
    }

    /* renamed from: D */
    public final void m3617D() {
        boolean m3619D1 = m3619D1();
        Boolean bool = this.f7390l1;
        if (bool == null || bool.booleanValue() != m3619D1) {
            this.f7390l1 = Boolean.valueOf(m3619D1);
            m3717y0();
        }
        if (m3619D1 && m3613B1()) {
            m3701t();
            m3610A1();
        } else if (!m3681m0() && !m3678l0() && !m3682m1()) {
            m3652W();
        }
        float m4297a = m3619D1 ? AbstractC1561o.m4297a(1.0f, this.f7378h1, 0.0f, this.f7375g1) : 0.0f;
        if (m3678l0() || m3667g0()) {
            m3605h1(this.f7385k);
            m3605h1(this.f7388l);
            m3605h1(this.f7391m);
        } else {
            float f2 = this.f7361c.getResources().getDisplayMetrics().density;
            float f3 = (80.0f * f2) + 10.0f;
            float f4 = f2 * 14.0f;
            boolean z2 = (!m3619D1() || m3679l1() || m3678l0()) ? false : true;
            float f5 = z2 ? 0.0f : f4;
            m3603f(this.f7385k, f3);
            m3603f(this.f7391m, f3);
            View view = this.f7388l;
            if (view != null) {
                m3603f(view, f5 + 25.0f + 10.0f);
                C1528d c1528d = this.f7394n;
                if (c1528d != null) {
                    c1528d.m4167b(f5);
                }
            }
            m3587A(this.f7385k, m4297a, f3);
            m3587A(this.f7388l, m4297a, f5 + 25.0f + 10.0f);
            m3587A(this.f7391m, m4297a, f3);
            float max = z2 ? Math.max(14.0f, (f3 - 10.0f) - 25.0f) : 14.0f;
            m3592V0(this.f7385k, true, max, z2);
            m3592V0(this.f7391m, false, max, z2);
        }
        if (m3619D1) {
            View view2 = this.f7385k;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.f7388l;
            if (view3 != null) {
                view3.bringToFront();
            }
            View view4 = this.f7391m;
            if (view4 != null) {
                view4.bringToFront();
            }
        }
        View view5 = this.f7395n0;
        if (view5 != null) {
            view5.bringToFront();
        }
        View view6 = this.f7392m0;
        if (view6 != null && view6.getVisibility() == 0) {
            this.f7392m0.bringToFront();
            View view7 = this.f7395n0;
            if (view7 != null) {
                view7.bringToFront();
            }
        }
        View view8 = this.f7323K;
        if (view8 != null && view8.getVisibility() == 0) {
            this.f7323K.bringToFront();
        }
        m3692q(false);
        m3614C();
        m3670h0();
        if (m3655a0()) {
            ImageView m3690p0 = m3690p0();
            cfgData cfgdata = this.f7364d;
            boolean z3 = cfgdata.f2636h2;
            m3675k(m3690p0, z3 ? this.f7409s : this.f7406r, z3 ? this.f7365d0 : this.f7362c0, m3693q0(), false, this.f7372f1, 0.0f, 0.0f);
            m3700s1(m3690p0(), this.f7372f1, false, 0.0f, 0.0f);
            if (m3682m1()) {
                m3716y();
            } else {
                ImageView m3647S0 = m3647S0();
                boolean z4 = cfgdata.f2636h2;
                m3675k(m3647S0, z4 ? this.f7406r : this.f7409s, z4 ? this.f7362c0 : this.f7365d0, m3649T0(), true, this.f7372f1, 0.0f, 0.0f);
                m3700s1(m3647S0(), this.f7372f1, true, 0.0f, 0.0f);
            }
            m3713x();
        }
    }

    /* renamed from: D0 */
    public final void m3618D0(C0636d c0636d) {
        View view = this.f7392m0;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        if (!this.f7364d.f2585W2 || m3667g0() || m3678l0() || c0636d == null || !c0636d.m1851a()) {
            this.f7392m0.setVisibility(8);
            this.f7392m0.setAlpha(1.0f);
            m3697r1();
            m3692q(false);
            return;
        }
        this.f7392m0.setVisibility(this.f7378h1 >= 0.999f ? 4 : 0);
        if (this.f7378h1 >= 0.999f) {
            this.f7392m0.setAlpha(0.0f);
        }
        TextView textView = this.f7410s0;
        if (textView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f7412t0;
        if (textView2 != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            this.f7412t0.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f7407r0;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f7407r0.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f7407r0.setVisibility(8);
            }
        }
        this.f7422y0 = c0636d.f3002h;
        this.f7420x0 = c0636d.f3001g;
        this.f7424z0 = c0636d.f3000f;
        this.f7304A0 = SystemClock.elapsedRealtime();
        m3698s(this.f7420x0);
        m3697r1();
        m3692q(false);
    }

    /* renamed from: D1 */
    public final boolean m3619D1() {
        return m3684n0() || this.f7364d.f2635h1 == 2 || this.f7375g1 > 0.001f || this.f7378h1 > 0.001f || this.f7372f1 < 0.999f;
    }

    /* renamed from: E */
    public final void m3620E() {
        View view = this.f7379i;
        if (view == null) {
            return;
        }
        cfgData cfgdata = this.f7364d;
        boolean z2 = cfgdata.f2625f1 != EnumC1455a.f6981n;
        boolean z3 = view.getVisibility() == 0;
        this.f7379i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            AbstractC1539g1.m4215f(R.drawable.ip_theme_49_top_bar, this.f7379i, AbstractC1539g1.m4230m0(cfgdata, this.f7367e));
            AbstractC1539g1.m4221i(this.f7351Y, this.f7353Z, cfgdata, m3655a0());
        }
        if (z3 == z2 || !m3674j0()) {
            return;
        }
        m3701t();
        m3610A1();
    }

    /* renamed from: E0 */
    public final void m3621E0() {
        ImageView imageView = this.f7356a0;
        carData cardata = this.f7367e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f7359b0 != null) {
            this.f7359b0.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f7359b0.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
    }

    /* renamed from: E1 */
    public final boolean m3622E1() {
        cfgData cfgdata = this.f7364d;
        int i = cfgdata.f2635h1;
        if (i == 0) {
            return true;
        }
        return i == 2 && AbstractC1539g1.m4194P(cfgdata, this.f7367e);
    }

    /* renamed from: F */
    public final void m3623F(ImageView imageView) {
        ImageView[] m3718y1 = m3718y1(imageView);
        if (m3718y1 == null || imageView == null) {
            return;
        }
        float pivotX = imageView.getPivotX();
        float pivotY = imageView.getPivotY();
        float scaleX = imageView.getScaleX();
        float scaleY = imageView.getScaleY();
        float translationX = imageView.getTranslationX();
        float translationY = imageView.getTranslationY();
        for (ImageView imageView2 : m3718y1) {
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
    public final void m3624F0() {
        if (this.f7329N == null) {
            return;
        }
        cfgData cfgdata = this.f7364d;
        if (!cfgdata.f2537K2 || m3667g0() || ((!m3655a0() && !m3678l0()) || (!cfgdata.f2569S2 && !cfgdata.f2577U2 && !cfgdata.f2573T2))) {
            this.f7329N.setVisibility(8);
            m3697r1();
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = cfgdata.f2569S2;
        carData cardata = this.f7367e;
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
            this.f7329N.setVisibility(8);
            m3697r1();
            return;
        }
        SpannableString spannableString = new SpannableString(sb2);
        this.f7329N.setTextColor(-1);
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
        this.f7329N.setText(spannableString, TextView.BufferType.SPANNABLE);
        this.f7329N.setVisibility(0);
        m3697r1();
    }

    /* renamed from: G */
    public final void m3625G(TextView textView) {
        if (textView == null) {
            return;
        }
        if (Math.abs(0.0f) < 0.001f) {
            m3589P0(textView, 0.0f, 0.0f);
        } else if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.post(new RunnableC1559n0(this, 6, textView));
        } else {
            m3588I(textView, 1.0f, textView.getLeft(), textView.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: G0 */
    public final void m3626G0() {
        if (this.f7353Z == null) {
            return;
        }
        float m1773s = this.f7367e.m1773s();
        if (m1773s < -90.0f) {
            this.f7353Z.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        this.f7353Z.setTextColor(-7829368);
        spannableString.setSpan(new ForegroundColorSpan(f7300s1), 0, replace.length(), 33);
        this.f7353Z.setText(spannableString);
    }

    /* renamed from: H */
    public final void m3627H() {
        boolean z2 = this.f7364d.f2537K2 && m3678l0() && !m3655a0();
        m3606i1(this.f7374g0, z2);
        m3606i1(this.f7368e0, z2);
        m3606i1(this.f7371f0, z2);
        m3625G(this.f7368e0);
        m3625G(this.f7371f0);
    }

    /* renamed from: H0 */
    public final void m3628H0() {
        cfgData cfgdata = this.f7364d;
        if (cfgdata.f2537K2 && m3678l0() && !m3655a0()) {
            float m3663e0 = m3663e0();
            float m3661d0 = m3661d0();
            TextView textView = this.f7368e0;
            int i = -1;
            if (textView != null) {
                textView.setTextColor(m3663e0 > cfgdata.f2568S1 ? -65536 : m3663e0 > cfgdata.f2564R1 ? -256 : -1);
                this.f7368e0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m3663e0)).replace(",", "."));
            }
            TextView textView2 = this.f7371f0;
            if (textView2 != null) {
                if (m3661d0 > cfgdata.f2576U1) {
                    i = -65536;
                } else if (m3661d0 > cfgdata.f2572T1) {
                    i = -256;
                }
                textView2.setTextColor(i);
                this.f7371f0.setText(AbstractC1256E0.m2986A(m3661d0));
            }
        }
    }

    /* renamed from: I0 */
    public final void m3629I0() {
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup == null || this.f7336Q0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7373g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7373g.post(new RunnableC1585y0(this, 10));
            return;
        }
        int round = Math.round(this.f7361c.getResources().getDisplayMetrics().density * 96.0f);
        float m3712w1 = m3712w1();
        m3611B(m3712w1);
        m3707v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f7378h1, 0.0f, m3712w1()));
        m3673j(width, height, round, m3712w1);
    }

    /* renamed from: J */
    public final void m3630J() {
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f7328M0);
        cfgData cfgdata = this.f7364d;
        if (!cfgdata.f2537K2) {
            m3639N0();
            this.f7373g.setVisibility(4);
            m3643Q();
            m3620E();
            m3653X();
            m3669h();
            View view = this.f7376h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        boolean m3655a0 = m3655a0();
        carData cardata = this.f7367e;
        if (m3655a0) {
            this.f7373g.setVisibility(0);
            boolean m3681m0 = m3681m0();
            Boolean bool = this.f7350X0;
            if (bool == null || bool.booleanValue() != m3681m0) {
                this.f7350X0 = Boolean.valueOf(m3681m0);
            }
            m3717y0();
            m3666g();
            m3609A0(cardata.m1745e());
            m3710w();
            m3627H();
            m3669h();
            View view2 = this.f7376h;
            if (view2 != null) {
                view2.setVisibility(m3613B1() ? 4 : 8);
            }
            if (m3613B1()) {
                m3701t();
                m3610A1();
                return;
            }
            return;
        }
        m3639N0();
        this.f7373g.setVisibility(0);
        if (m3667g0()) {
            m3643Q();
            View view3 = this.f7376h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else if (cfgdata.f2561Q2) {
            m3717y0();
            View view4 = this.f7376h;
            if (view4 != null) {
                view4.setVisibility(4);
            }
            if (m3613B1()) {
                m3701t();
                m3610A1();
            }
        } else {
            if (m3678l0()) {
                m3717y0();
                if (m3613B1()) {
                    m3610A1();
                }
            } else {
                m3643Q();
            }
            View view5 = this.f7376h;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        m3606i1(this.f7400p, false);
        m3606i1(this.f7403q, false);
        m3606i1(this.f7406r, false);
        m3606i1(this.f7409s, false);
        m3665f1(this.f7406r, false);
        m3665f1(this.f7409s, false);
        m3606i1(this.f7411t, false);
        m3606i1(this.f7413u, false);
        m3606i1(this.f7362c0, false);
        m3606i1(this.f7365d0, false);
        m3606i1(this.f7325L, false);
        m3606i1(this.f7327M, false);
        m3606i1(this.f7345V, false);
        m3606i1(this.f7347W, false);
        if (m3655a0() || AbstractC1539g1.m4194P(cfgdata, cardata)) {
            m3721z1();
        } else {
            m3653X();
        }
        if (!m3678l0()) {
            m3606i1(this.f7329N, false);
            m3606i1(this.f7341T, false);
            m3697r1();
        }
        m3641O0();
        m3635L0();
        m3666g();
        m3609A0(cardata.m1745e());
        m3627H();
        m3628H0();
        m3669h();
        m3618D0(C0639g.m1872x().m1880u());
        m3692q(false);
        m3614C();
        m3670h0();
        m3620E();
    }

    /* renamed from: J0 */
    public final float m3631J0(float f2) {
        float f3 = this.f7363c1;
        return f2 >= 0.999f ? f3 - (-21.0f) : f3;
    }

    /* renamed from: K */
    public final void m3632K() {
        final RunnableC1585y0 runnableC1585y0 = new RunnableC1585y0(this, 1);
        final int i = 10;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        };
        carData cardata = this.f7367e;
        C1537g c1537g = this.f7355a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 11;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i3 = 12;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i4 = 13;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i5 = 14;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i6 = 15;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i7 = 16;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i8 = 17;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i9 = 18;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i10 = 0;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i12 = 2;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i13 = 3;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i14 = 4;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i15 = 5;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i16 = 6;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i17 = 7;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i18 = 8;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i19 = 9;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.z0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1585y0.run();
                        break;
                    case 1:
                        runnableC1585y0.run();
                        break;
                    case 2:
                        runnableC1585y0.run();
                        break;
                    case 3:
                        runnableC1585y0.run();
                        break;
                    case 4:
                        runnableC1585y0.run();
                        break;
                    case 5:
                        runnableC1585y0.run();
                        break;
                    case 6:
                        runnableC1585y0.run();
                        break;
                    case 7:
                        runnableC1585y0.run();
                        break;
                    case 8:
                        runnableC1585y0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1585y0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1585y0.run();
                        break;
                    case 13:
                        runnableC1585y0.run();
                        break;
                    case 14:
                        runnableC1585y0.run();
                        break;
                    case 15:
                        runnableC1585y0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1585y0.run();
                        break;
                    case 17:
                        runnableC1585y0.run();
                        break;
                    default:
                        runnableC1585y0.run();
                        break;
                }
            }
        });
        final int i20 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i21 = cfgdata4.f2635h1;
                                                    if (i21 >= 0 && i21 <= 2) {
                                                        r4 = i21;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f7361c);
        final int i26 = 6;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 8;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 9;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 10;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 11;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 12;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 13;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 14;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 15;
        cardata.m1756j0(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
        final int i36 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.A0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7170b;

            {
                this.f7170b = this;
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
                        this.f7170b.m3626G0();
                        break;
                    case 1:
                        this.f7170b.m3621E0();
                        break;
                    case 2:
                        this.f7170b.m3621E0();
                        break;
                    case 3:
                        this.f7170b.m3621E0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1477E0 c1477e0 = this.f7170b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1477e0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1477e0.f7396n1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1477e0.f7361c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1477e0.f7364d;
                            if (cfgdata.f2537K2) {
                                c1477e0.f7393m1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1477e0.f7396n1 == -1 && intValue > -1) {
                            c1477e0.f7393m1 = 0.0f;
                            ViewGroup viewGroup = c1477e0.f7373g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1477e0.f7373g.setAlpha(1.0f);
                            }
                            c1477e0.m3691p1("ip");
                        }
                        c1477e0.f7396n1 = intValue;
                        c1477e0.m3615C0();
                        break;
                    case 5:
                        this.f7170b.m3615C0();
                        break;
                    case 6:
                        C1477E0 c1477e02 = this.f7170b;
                        Integer num2 = (Integer) obj;
                        c1477e02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1477e02.f7361c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1477e02.f7364d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1477e02.f7340S0 || !c1477e02.m3682m1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1477e02.f7364d, c1477e02.f7367e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1477e02.f7364d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1477e02.f7361c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1477e02.m3691p1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1477e02.f7367e)) {
                                                                        cfgData cfgdata3 = c1477e02.f7364d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1477e02.f7367e.m1760l0(z2);
                                                                        c1477e02.f7364d.m1795o(c1477e02.f7361c);
                                                                        Context context2 = c1477e02.f7361c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1477e02.f7364d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1477e02.f7364d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1477e02.f7361c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1477e02.m3691p1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y02 = c1477e02.f7338R0;
                                                                    handler.removeCallbacks(runnableC1585y02);
                                                                    handler.postDelayed(runnableC1585y02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1477e02.m3682m1()) {
                                                                    c1477e02.f7340S0 = true;
                                                                    if (c1477e02.m3676k0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1477e02.f7330N0 && ((valueAnimator = c1477e02.f7332O0) == null || !valueAnimator.isRunning())) {
                                                                            c1477e02.m3715x1(true);
                                                                        }
                                                                        Handler handler2 = c1477e02.f7370f;
                                                                        RunnableC1585y0 runnableC1585y03 = c1477e02.f7338R0;
                                                                        handler2.removeCallbacks(runnableC1585y03);
                                                                        handler2.postDelayed(runnableC1585y03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1477e02.f7340S0) {
                                                                    Handler handler3 = c1477e02.f7370f;
                                                                    RunnableC1585y0 runnableC1585y04 = c1477e02.f7338R0;
                                                                    handler3.removeCallbacks(runnableC1585y04);
                                                                    handler3.postDelayed(runnableC1585y04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1477e02.f7336Q0) {
                                                        ValueAnimator valueAnimator2 = c1477e02.f7381i1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1477e02.f7328M0;
                                                            if (!z3 || !c1477e02.m3684n0()) {
                                                                boolean z4 = !c1477e02.f7328M0;
                                                                c1477e02.f7328M0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1477e02.m3656b(z3);
                                                                break;
                                                            } else {
                                                                c1477e02.f7387k1 = 0;
                                                                RunnableC1585y0 runnableC1585y05 = new RunnableC1585y0(c1477e02, 19);
                                                                if (!c1477e02.m3684n0() && Math.abs(c1477e02.f7372f1 - 1.0f) < 0.001f) {
                                                                    runnableC1585y05.run();
                                                                    break;
                                                                } else {
                                                                    c1477e02.f7384j1 = true;
                                                                    c1477e02.m3658c(runnableC1585y05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1477e02.f7364d.f2672o3) {
                                                        Context context3 = c1477e02.f7361c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1477e02.m3691p1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1477e02.m3691p1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1477e02.f7367e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1477e02.f7361c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1477e02.f7364d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1477e02.f7361c, m3282M[0], m3282M[1], 0.7019608f, c1477e02.f7364d.f2657l3);
                                                }
                                                c1477e02.f7312E0 = AbstractC1372y1.f6437g;
                                                c1477e02.m3692q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1477e02.m3676k0()) {
                                            ValueAnimator valueAnimator3 = c1477e02.f7332O0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1477e02.f7340S0 = false;
                                                c1477e02.m3715x1(c1477e02.f7330N0);
                                                break;
                                            }
                                        }
                                    } else if (c1477e02.f7364d.f2561Q2 && !c1477e02.f7336Q0) {
                                        ValueAnimator valueAnimator4 = c1477e02.f7381i1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1477e02.f7364d;
                                            if (cfgdata4.f2561Q2 && !c1477e02.m3678l0()) {
                                                if (c1477e02.m3681m0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1477e02.f7361c);
                                                c1477e02.m3658c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1477e02.f7361c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1477E0 c1477e03 = this.f7170b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1477e03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1477e03.m3612B0(intValue2);
                        break;
                    case 8:
                        C1477E0 c1477e04 = this.f7170b;
                        c1477e04.m3648T();
                        c1477e04.m3630J();
                        c1477e04.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1477E0 c1477e05 = this.f7170b;
                        c1477e05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1477e05.m3639N0();
                        }
                        c1477e05.m3648T();
                        c1477e05.m3630J();
                        c1477e05.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1477E0 c1477e06 = this.f7170b;
                        c1477e06.m3630J();
                        c1477e06.m3618D0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1477E0 c1477e07 = this.f7170b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1477e07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1477e07.m3609A0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1477E0 c1477e08 = this.f7170b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1477e08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1477e08.f7380i0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1477e08.m3609A0(c1477e08.f7367e.m1745e());
                        break;
                    case 13:
                        C1477E0 c1477e09 = this.f7170b;
                        AbstractC1539g1.m4225k(c1477e09.f7361c);
                        c1477e09.m3648T();
                        c1477e09.m3630J();
                        break;
                    case 14:
                        C1477E0 c1477e010 = this.f7170b;
                        c1477e010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1477e010.f7328M0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1477e010.f7328M0;
                        Context context4 = c1477e010.f7361c;
                        if (!z5) {
                            c1477e010.f7387k1 = -1;
                            cfgData cfgdata5 = c1477e010.f7364d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1477e010.f7381i1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1477e010.f7381i1 = null;
                            }
                            c1477e010.f7372f1 = c1477e010.m3709v1();
                            c1477e010.f7375g1 = 1.0f;
                            c1477e010.f7378h1 = 0.0f;
                            c1477e010.m3617D();
                        }
                        c1477e010.m3630J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1477e010.f7328M0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1477E0 c1477e011 = this.f7170b;
                        if (bool == null) {
                            c1477e011.getClass();
                            break;
                        } else {
                            c1477e011.m3680m(false);
                            break;
                        }
                    default:
                        this.f7170b.m3618D0((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: K0 */
    public final void m3633K0(ImageView imageView) {
        View[] m3657b0 = m3657b0(imageView);
        int length = m3657b0.length;
        for (int i = 0; i < length; i++) {
            View view = m3657b0[i];
            m3589P0(view, view == this.f7327M ? m3631J0(this.f7372f1) : m3702t0(view), m3705u0(view));
        }
    }

    /* renamed from: L */
    public final void m3634L() {
        if (this.f7373g == null) {
            return;
        }
        TextView textView = this.f7380i0;
        if (textView != null) {
            textView.bringToFront();
        }
        ImageView imageView = this.f7377h0;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.f7383j0;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        this.f7373g.invalidate();
    }

    /* renamed from: L0 */
    public final void m3635L0() {
        ImageView m3690p0 = m3690p0();
        boolean z2 = this.f7364d.f2636h2;
        ImageView imageView = z2 ? this.f7409s : this.f7406r;
        TextView textView = z2 ? this.f7365d0 : this.f7362c0;
        m3589P0(m3690p0, 0.0f, 0.0f);
        m3637M0(imageView);
        m3589P0(textView, 0.0f, m3693q0());
        m3633K0(m3690p0);
    }

    /* renamed from: M */
    public final void m3636M() {
        ValueAnimator valueAnimator = this.f7332O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7332O0 = null;
        }
    }

    /* renamed from: M0 */
    public final void m3637M0(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        m3589P0(imageView, 0.0f, 0.0f);
        if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        }
        ImageView imageView2 = this.f7406r;
        if (imageView == imageView2 || imageView == this.f7409s) {
            C1572s c1572s = imageView == imageView2 ? this.f7316G0 : this.f7318H0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m3623F(imageView);
        }
    }

    /* renamed from: N */
    public final void m3638N() {
        ImageView m3647S0 = m3647S0();
        if (m3647S0 == null) {
            this.f7348W0 = false;
            return;
        }
        RunnableC1559n0 runnableC1559n0 = new RunnableC1559n0(this, m3647S0, 7);
        if (m3647S0.getWidth() <= 0 || m3647S0.getHeight() <= 0) {
            m3647S0.post(runnableC1559n0);
        } else {
            runnableC1559n0.run();
        }
    }

    /* renamed from: N0 */
    public final void m3639N0() {
        this.f7370f.removeCallbacks(this.f7338R0);
        m3636M();
        this.f7330N0 = true;
        this.f7342T0 = 0.0f;
        this.f7348W0 = false;
        AbstractC1372y1.m3287R(false, false);
    }

    /* renamed from: O */
    public final RectF m3640O() {
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7373g.getHeight() <= 0) {
            return new RectF();
        }
        int width = this.f7373g.getWidth();
        int height = this.f7373g.getHeight();
        float f2 = height - 25.0f;
        if (!m3619D1() && !m3679l1()) {
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
    public final void m3641O0() {
        ImageView m3647S0 = m3647S0();
        boolean z2 = this.f7364d.f2636h2;
        ImageView imageView = z2 ? this.f7406r : this.f7409s;
        TextView textView = z2 ? this.f7362c0 : this.f7365d0;
        m3589P0(m3647S0, 0.0f, 0.0f);
        m3637M0(imageView);
        m3589P0(textView, 0.0f, m3649T0());
        m3633K0(m3647S0);
    }

    /* renamed from: P */
    public final void m3642P(ImageView imageView, ImageView imageView2, TextView textView, float f2) {
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        ImageView imageView3 = null;
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            imageView2.setRotation(0.0f);
            m3623F(imageView2);
            C1572s c1572s = imageView2 == this.f7406r ? this.f7316G0 : imageView2 == this.f7409s ? this.f7318H0 : null;
            if (c1572s != null) {
                c1572s.m4470a(imageView2);
                ImageView[] m3718y1 = m3718y1(imageView2);
                if (m3718y1 != null) {
                    float f3 = c1572s.f8682h;
                    for (ImageView imageView4 : m3718y1) {
                        if (imageView4 != null) {
                            imageView4.setRotation(f3);
                        }
                    }
                }
            }
        }
        if (imageView == this.f7400p) {
            imageView3 = this.f7411t;
        } else if (imageView == this.f7403q) {
            imageView3 = this.f7413u;
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
        View[] m3657b0 = m3657b0(imageView);
        int length = m3657b0.length;
        for (int i = 0; i < length; i++) {
            View view = m3657b0[i];
            if (view != null) {
                view.setTranslationX(view == this.f7327M ? m3631J0(this.f7372f1) : m3702t0(view));
                view.setTranslationY(m3705u0(view));
            }
        }
    }

    /* renamed from: Q */
    public final void m3643Q() {
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f7373g;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(android.R.color.transparent);
        }
        m3672i0();
        ViewGroup viewGroup3 = this.f7373g;
        if (viewGroup3 != null) {
            viewGroup3.getOverlay().clear();
        }
        C1525c c1525c = this.f7399o1;
        if (c1525c != null) {
            c1525c.m4163e(null);
        }
    }

    /* renamed from: Q0 */
    public final C1574t m3644Q0() {
        int i;
        cfgData cfgdata = this.f7364d;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        if (enumC1455a == EnumC1455a.f6949f) {
            return new C1574t(0, null, 4);
        }
        int i2 = cfgdata.f2630g1;
        if (i2 < 31) {
            int i3 = enumC1455a.f7036d;
            return i3 != 0 ? new C1574t(i3, null, 4) : new C1574t(0, null, 4);
        }
        String[] strArr = cfgdata.f2603b;
        if (strArr != null && i2 >= 31 && (i = i2 - 31) >= 0 && i < strArr.length) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata.f2603b[i]);
            if (file.exists()) {
                return new C1574t(0, Uri.fromFile(file), 4);
            }
        }
        return new C1574t(0, null, 4);
    }

    /* renamed from: R0 */
    public final void m3645R0() {
        ViewGroup viewGroup;
        if (!this.f7326L0) {
            m3632K();
            this.f7326L0 = true;
        }
        C1531e c1531e = this.f7314F0;
        if (c1531e != null) {
            c1531e.m4170a();
        }
        boolean z2 = this.f7364d.f2561Q2;
        this.f7328M0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m3703t1();
        ValueAnimator valueAnimator = this.f7334P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7334P0 = null;
        }
        this.f7336Q0 = false;
        ImageView imageView = this.f7397o;
        if (imageView != null) {
            imageView.setTranslationY(0.0f);
        }
        m3636M();
        this.f7330N0 = true;
        this.f7342T0 = 0.0f;
        this.f7348W0 = false;
        this.f7350X0 = Boolean.valueOf(m3681m0());
        m3711w0();
        m3680m(false);
        if (this.f7393m1 <= 0.0f && (viewGroup = this.f7373g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        m3714x0();
        m3618D0(C0639g.m1872x().m1880u());
        this.f7312E0 = AbstractC1372y1.f6437g;
        m3630J();
        View view = this.f7395n0;
        if (view != null) {
            view.post(new RunnableC1585y0(this, 5));
            return;
        }
        View view2 = this.f7392m0;
        if (view2 != null) {
            view2.post(new RunnableC1585y0(this, 13));
        }
    }

    /* renamed from: S */
    public final void m3646S() {
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup != null) {
            viewGroup.getOverlay().clear();
        }
        ImageView imageView = this.f7397o;
        if (imageView != null && imageView.getBackground() == this.f7399o1) {
            this.f7397o.setBackground(null);
            this.f7397o.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f7373g;
        if (viewGroup2 != null && viewGroup2.getBackground() == this.f7399o1) {
            this.f7373g.setBackgroundResource(android.R.color.transparent);
            this.f7373g.setLayerType(0, null);
        }
        C1525c c1525c = this.f7399o1;
        if (c1525c != null) {
            c1525c.m4160b();
            this.f7399o1.m4163e(null);
        }
    }

    /* renamed from: S0 */
    public final ImageView m3647S0() {
        return this.f7364d.f2636h2 ? this.f7400p : this.f7403q;
    }

    /* renamed from: T */
    public final void m3648T() {
        cfgData cfgdata = this.f7364d;
        if (cfgdata.f2561Q2) {
            boolean m3678l0 = m3678l0();
            Context context = this.f7361c;
            if (m3678l0) {
                if (cfgdata.f2635h1 != 0 || Math.abs(this.f7372f1 - m3709v1()) >= 0.001f || this.f7378h1 >= 0.001f) {
                    cfgdata.f2635h1 = 0;
                    cfgdata.m1795o(context);
                    m3658c(null);
                    return;
                }
                return;
            }
            if (m3681m0() && cfgdata.f2635h1 == 1) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
                m3658c(null);
            } else {
                if (Math.abs(this.f7375g1 - (m3622E1() ? 1.0f : 0.0f)) < 0.001f) {
                    return;
                }
                m3658c(null);
            }
        }
    }

    /* renamed from: T0 */
    public final float m3649T0() {
        return this.f7364d.f2636h2 ? this.f7357a1 : this.f7360b1;
    }

    /* renamed from: U */
    public final void m3650U() {
        View view = this.f7392m0;
        if (view == null || this.f7373g == null) {
            return;
        }
        if (this.f7395n0 != null && view.getParent() == this.f7395n0) {
            int round = Math.round(this.f7361c.getResources().getDisplayMetrics().density * 96.0f);
            ((ViewGroup) this.f7395n0).removeView(this.f7392m0);
            C1592d c1592d = new C1592d(470, round);
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            this.f7373g.addView(this.f7392m0, c1592d);
            this.f7306B0 = -1.0f;
            this.f7308C0 = -1.0f;
            this.f7392m0.setTranslationX(0.0f);
            this.f7392m0.setTranslationY(0.0f);
        }
        this.f7392m0.getParent();
    }

    /* renamed from: V */
    public final int m3651V() {
        int i = this.f7404q0;
        if (i > 0) {
            return i;
        }
        TextView textView = this.f7329N;
        if (textView == null || this.f7331O == null) {
            return 0;
        }
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        int paddingBottom = this.f7331O.getPaddingBottom() + this.f7331O.getPaddingTop() + Math.round((this.f7329N.getLineSpacingExtra() + (fontMetrics.descent - fontMetrics.ascent)) * 3.0f);
        this.f7404q0 = paddingBottom;
        if (paddingBottom <= 0) {
            float f2 = this.f7361c.getResources().getDisplayMetrics().density;
            this.f7404q0 = AbstractC0062j.m150d(f2, 20.0f, 22.0f * f2 * 3.2f);
        }
        return this.f7404q0;
    }

    /* renamed from: W */
    public final void m3652W() {
        m3605h1(this.f7385k);
        m3605h1(this.f7388l);
        m3605h1(this.f7391m);
        if (this.f7376h == null || m3613B1()) {
            return;
        }
        this.f7376h.setVisibility(8);
    }

    /* renamed from: X */
    public final void m3653X() {
        ImageView imageView = this.f7377h0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.f7380i0;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView2 = this.f7383j0;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        ImageView imageView3 = this.f7386k0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f7389l0;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
    }

    /* renamed from: Z */
    public final float m3654Z(float f2) {
        float m3709v1 = m3709v1();
        float f3 = f2 - 1.0f;
        if (Math.abs(f3) < 0.001f) {
            return 0.0f;
        }
        float f4 = m3709v1 - 1.0f;
        if (Math.abs(f4) < 0.001f) {
            return 0.0f;
        }
        return f3 / f4;
    }

    /* renamed from: a0 */
    public final boolean m3655a0() {
        return this.f7364d.f2561Q2 && this.f7328M0;
    }

    /* renamed from: b */
    public final void m3656b(boolean z2) {
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup == null) {
            m3630J();
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7373g.getHeight() <= 0) {
            this.f7373g.post(new RunnableC1473C0(this, z2, 0));
            return;
        }
        ValueAnimator valueAnimator = this.f7334P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7334P0 = null;
        }
        this.f7336Q0 = false;
        m3636M();
        m3639N0();
        ImageView m3690p0 = m3690p0();
        ImageView m3647S0 = m3647S0();
        boolean z3 = this.f7364d.f2636h2;
        ImageView imageView = z3 ? this.f7409s : this.f7406r;
        ImageView imageView2 = z3 ? this.f7406r : this.f7409s;
        TextView textView = z3 ? this.f7365d0 : this.f7362c0;
        TextView textView2 = z3 ? this.f7362c0 : this.f7365d0;
        float m3693q0 = m3693q0();
        float m3649T0 = m3649T0();
        float width = this.f7373g.getWidth();
        float height = this.f7373g.getHeight();
        float f2 = this.f7361c.getResources().getDisplayMetrics().density * 80.0f;
        float f3 = m3690p0 != null ? -(m3690p0.getRight() + f2) : -width;
        if (m3647S0 != null) {
            width = (width - m3647S0.getLeft()) + f2;
        }
        float f4 = width;
        if (!z2) {
            m3606i1(m3690p0, true);
            m3606i1(m3647S0, true);
            m3606i1(imageView, true);
            m3606i1(imageView2, true);
            m3665f1(imageView, true);
            m3665f1(imageView2, true);
            m3606i1(textView, true);
            m3606i1(textView2, true);
            m3606i1(this.f7411t, true);
            m3606i1(this.f7413u, true);
            m3606i1(this.f7325L, true);
            m3606i1(this.f7345V, true);
            m3606i1(this.f7347W, true);
            m3606i1(this.f7327M, !r1.f2543M0.f7147f);
            m3624F0();
            m3618D0(C0639g.m1872x().m1880u());
        }
        View view = this.f7392m0;
        boolean z4 = view != null && view.getVisibility() == 0;
        float top = this.f7392m0 != null ? (height - r1.getTop()) + f2 : 0.0f;
        if (m3674j0()) {
            m3646S();
        }
        ViewGroup viewGroup2 = this.f7373g;
        if (viewGroup2 != null) {
            viewGroup2.setLayerType(0, null);
        }
        m3719z();
        float f5 = this.f7397o != null ? -(r0.getHeight() + f2) : -height;
        int[] m3297c = AbstractC1372y1.m3297c();
        this.f7336Q0 = true;
        m3660d(z2 ? 0.0f : 1.0f, m3690p0, imageView, textView, m3693q0, f3, m3647S0, imageView2, textView2, m3649T0, f4, z4, top, f5);
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7334P0 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f7334P0);
        this.f7334P0.addUpdateListener(new C1558n(this, z2, m3690p0, imageView, textView, m3693q0, f3, m3647S0, imageView2, textView2, m3649T0, f4, z4, top, f5, m3297c, 4));
        this.f7334P0.addListener(new C1564p(this, m3297c, m3690p0, imageView, textView, m3693q0, m3647S0, imageView2, textView2, m3649T0, z4, z2, 3));
        this.f7334P0.start();
    }

    /* renamed from: b0 */
    public final View[] m3657b0(ImageView imageView) {
        return imageView == this.f7400p ? new View[]{this.f7325L, this.f7327M} : imageView == this.f7403q ? new View[]{this.f7345V, this.f7347W} : new View[0];
    }

    /* renamed from: c */
    public final void m3658c(RunnableC1585y0 runnableC1585y0) {
        ImageView m3690p0 = m3690p0();
        if (m3684n0() && (m3690p0 == null || m3690p0.getWidth() <= 0)) {
            if (m3690p0 != null) {
                m3690p0.post(new RunnableC1559n0(this, 8, runnableC1585y0));
                return;
            } else {
                if (runnableC1585y0 != null) {
                    runnableC1585y0.run();
                    return;
                }
                return;
            }
        }
        float m3709v1 = m3684n0() ? m3709v1() : 1.0f;
        float f2 = m3622E1() ? 1.0f : 0.0f;
        float f3 = this.f7364d.f2635h1 != 2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = this.f7381i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.f7372f1 - m3709v1) < 0.001f && Math.abs(this.f7375g1 - f2) < 0.001f && Math.abs(this.f7378h1 - f3) < 0.001f) {
            this.f7381i1 = null;
            this.f7372f1 = m3709v1;
            this.f7375g1 = f2;
            this.f7378h1 = f3;
            m3617D();
            if (runnableC1585y0 != null) {
                runnableC1585y0.run();
                return;
            }
            return;
        }
        float f4 = this.f7372f1;
        float f5 = this.f7375g1;
        float f6 = this.f7378h1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7381i1 = ofFloat;
        ofFloat.setDuration(260L);
        AbstractC0062j.m166t(this.f7381i1);
        this.f7381i1.addUpdateListener(new C1555m(this, f4, m3709v1, f5, f2, f6, f3, 3));
        this.f7381i1.addListener(new C1567q(this, m3709v1, f2, f3, runnableC1585y0, 3));
        this.f7381i1.start();
    }

    /* renamed from: c0 */
    public final void m3659c0(float[] fArr) {
        float f2 = (!this.f7330N0 || this.f7342T0 > 0.0f) ? this.f7342T0 : 0.0f;
        if (f2 <= 0.0f || !this.f7348W0) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        RectF m3708v0 = m3708v0();
        if (m3708v0.width() <= 0.0f || m3708v0.height() <= 0.0f) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = (m3708v0.centerX() - this.f7344U0) * f2;
            fArr[1] = (m3708v0.centerY() - this.f7346V0) * f2;
        }
    }

    /* renamed from: d */
    public final void m3660d(float f2, ImageView imageView, ImageView imageView2, TextView textView, float f3, float f4, ImageView imageView3, ImageView imageView4, TextView textView2, float f5, float f6, boolean z2, float f7, float f8) {
        View view;
        m3662e(imageView, imageView2, textView, f3, f4, -540.0f, f2);
        m3662e(imageView3, imageView4, textView2, f5, f6, 540.0f, f2);
        if (z2 && (view = this.f7392m0) != null) {
            view.setTranslationY((f7 * f2) + this.f7310D0);
        }
        ImageView imageView5 = this.f7397o;
        if (imageView5 != null) {
            imageView5.setTranslationY(f8 * f2);
        }
    }

    /* renamed from: d0 */
    public final float m3661d0() {
        return Math.max(0.0f, this.f7367e.m1779y() / 1000.0f);
    }

    /* renamed from: e */
    public final void m3662e(ImageView imageView, ImageView imageView2, TextView textView, float f2, float f3, float f4, float f5) {
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
            ImageView[] m3718y1 = m3718y1(imageView2);
            if (m3718y1 != null) {
                for (ImageView imageView3 : m3718y1) {
                    if (imageView3 != null) {
                        imageView3.setPivotY(AbstractC0062j.m153g(imageView3.getWidth(), 0.5f, imageView3) * 0.5f);
                        imageView3.setTranslationX(f6);
                        imageView3.setTranslationY(0.0f);
                        imageView3.setRotation(f7);
                    }
                }
            }
        }
        ImageView imageView4 = imageView == this.f7400p ? this.f7411t : imageView == this.f7403q ? this.f7413u : null;
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
        View[] m3657b0 = m3657b0(imageView);
        int length = m3657b0.length;
        for (int i = 0; i < length; i++) {
            View view = m3657b0[i];
            if (view != null) {
                view.setTranslationX((f3 * f5) + (view == this.f7327M ? m3631J0(this.f7372f1) : m3702t0(view)));
                view.setTranslationY(m3705u0(view));
            }
        }
    }

    /* renamed from: e0 */
    public final float m3663e0() {
        float m1780z = this.f7367e.m1780z();
        if (m1780z < 0.0f) {
            return 0.0f;
        }
        return m1780z * this.f7364d.f2702u3;
    }

    /* renamed from: e1 */
    public final void m3664e1(ImageView imageView, boolean z2) {
        for (View view : m3657b0(imageView)) {
            if (view == this.f7327M) {
                m3606i1(view, z2 && !this.f7364d.f2543M0.f7147f);
            } else {
                m3606i1(view, z2);
            }
        }
    }

    /* renamed from: f1 */
    public final void m3665f1(ImageView imageView, boolean z2) {
        ImageView[] m3718y1 = m3718y1(imageView);
        if (m3718y1 == null) {
            return;
        }
        for (ImageView imageView2 : m3718y1) {
            m3606i1(imageView2, z2);
        }
    }

    /* renamed from: g */
    public final void m3666g() {
        ImageView imageView = this.f7377h0;
        if (imageView == null || this.f7383j0 == null) {
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
        ImageView imageView2 = this.f7383j0;
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
        TextView textView = this.f7380i0;
        if (textView != null) {
            textView.setTextSize(2, 32.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f7380i0.getLayoutParams();
            if (layoutParams3 instanceof C1592d) {
                C1592d c1592d3 = (C1592d) layoutParams3;
                ((ViewGroup.MarginLayoutParams) c1592d3).topMargin = -7;
                this.f7380i0.setLayoutParams(c1592d3);
            }
            this.f7380i0.setTranslationX(13.0f);
            this.f7380i0.setTranslationY(12.0f);
        }
        ImageView imageView3 = this.f7377h0;
        if (imageView3 != null) {
            imageView3.setBackgroundResource(R.drawable.ip_theme_49_cruise_icon_bg);
            this.f7377h0.setPadding(6, 6, 6, 6);
        }
        ImageView imageView4 = this.f7383j0;
        if (imageView4 != null) {
            imageView4.setBackgroundResource(R.drawable.ip_theme_49_cruise_icon_bg);
            this.f7383j0.setPadding(6, 6, 6, 6);
        }
        TextView textView2 = this.f7380i0;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.ip_theme_49_cruise_icon_bg);
        }
        m3721z1();
        m3634L();
    }

    /* renamed from: g0 */
    public final boolean m3667g0() {
        return this.f7364d.f2561Q2 && !this.f7328M0;
    }

    /* renamed from: g1 */
    public final void m3668g1(View view, float f2) {
        Context context;
        Drawable m1b;
        if (view == null || (context = this.f7361c) == null || (m1b = AbstractC0000a.m1b(context, f7302u1)) == null) {
            return;
        }
        Drawable mutate = m1b.mutate();
        int round = Math.round((Math.max(0.0f, Math.min(1.0f, f2)) * (Color.alpha(-535162356) - 128)) + 128);
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(Color.argb(round, 26, 18, 12));
        }
        view.setBackground(mutate);
    }

    /* renamed from: h */
    public final void m3669h() {
        cfgData cfgdata = this.f7364d;
        if (!cfgdata.f2537K2) {
            ViewGroup viewGroup = this.f7333P;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            m3606i1(this.f7329N, false);
            m3606i1(this.f7341T, false);
            View view = this.f7323K;
            if (view != null) {
                view.setVisibility(8);
            }
            m3605h1(this.f7347W);
            m3697r1();
            return;
        }
        m3606i1(this.f7341T, cfgdata.f2581V2 && (!m3667g0() && (m3655a0() || m3678l0())));
        m3624F0();
        if (m3678l0()) {
            m3671i(false);
        } else if (cfgdata.f2585W2 || m3678l0() || m3667g0() || !m3655a0() || this.f7378h1 >= 0.999f) {
            m3671i(false);
        } else {
            m3671i(true);
        }
        m3720z0();
        m3697r1();
        if (!m3619D1() && !m3681m0() && !m3678l0() && !m3682m1()) {
            m3652W();
            if (m3674j0()) {
                m3717y0();
            }
        }
        m3629I0();
    }

    /* renamed from: h0 */
    public final void m3670h0() {
        m3605h1(this.f7382j);
        m3605h1(this.f7333P);
        if (m3678l0() || m3667g0() || !m3619D1()) {
            m3605h1(this.f7385k);
            m3605h1(this.f7388l);
            m3605h1(this.f7391m);
        }
        if (m3678l0() || this.f7364d.f2585W2) {
            m3605h1(this.f7323K);
            m3605h1(this.f7309D);
            m3605h1(this.f7305B);
            m3605h1(this.f7307C);
            m3605h1(this.f7313F);
            m3605h1(this.f7311E);
            m3605h1(this.f7315G);
            m3605h1(this.f7319I);
            m3605h1(this.f7317H);
            m3605h1(this.f7321J);
        }
    }

    /* renamed from: i */
    public final void m3671i(boolean z2) {
        if (!z2) {
            View view = this.f7323K;
            if (view != null) {
                view.setVisibility(8);
            }
            m3605h1(this.f7313F);
            m3605h1(this.f7311E);
            m3605h1(this.f7315G);
            m3605h1(this.f7309D);
            m3605h1(this.f7305B);
            m3605h1(this.f7307C);
            m3605h1(this.f7319I);
            m3605h1(this.f7317H);
            m3605h1(this.f7321J);
            return;
        }
        View view2 = this.f7323K;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        boolean z3 = this.f7364d.useJourneyFuel;
        m3606i1(this.f7313F, z3);
        m3606i1(this.f7311E, z3);
        m3606i1(this.f7315G, z3);
        m3606i1(this.f7309D, true);
        m3606i1(this.f7305B, true);
        m3606i1(this.f7307C, true);
        m3606i1(this.f7319I, true);
        m3606i1(this.f7317H, true);
        m3606i1(this.f7321J, true);
    }

    /* renamed from: i0 */
    public final void m3672i0() {
        ImageView imageView = this.f7397o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        this.f7397o.setLayerType(0, null);
        this.f7397o.setBackground(null);
        this.f7397o.setImageDrawable(null);
    }

    /* renamed from: j */
    public final void m3673j(int i, int i2, int i3, float f2) {
        ImageView m3690p0;
        if (this.f7323K == null || m3678l0()) {
            return;
        }
        boolean z2 = (this.f7364d.f2585W2 || m3667g0() || !m3655a0()) ? false : true;
        float max = Math.max(0.0f, Math.min(1.0f, this.f7378h1));
        if (!z2) {
            this.f7323K.setAlpha(1.0f);
            this.f7323K.setTranslationY(0.0f);
            return;
        }
        if (max >= 0.999f) {
            this.f7323K.setAlpha(0.0f);
            this.f7323K.setVisibility(4);
            return;
        }
        if (this.f7323K.getVisibility() != 0) {
            m3671i(true);
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float f3 = ((-0.19999999f) * max2) + 1.0f;
        if (this.f7323K != null) {
            Context context = this.f7361c;
            float f4 = context.getResources().getDisplayMetrics().density;
            float f5 = context.getResources().getDisplayMetrics().scaledDensity;
            float max3 = Math.max(0.5f, Math.min(1.2f, f3));
            float f6 = 10.0f * f4 * max3;
            this.f7323K.setPadding(AbstractC0062j.m168v(f4, 14.0f, max3), Math.round(f6), AbstractC0062j.m168v(f4, 16.0f, max3), Math.round(f6));
            View view = this.f7323K;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(true);
                ((ViewGroup) this.f7323K).setClipChildren(true);
            }
            float f7 = 15.0f * max3;
            m3601c1(this.f7319I, f7, f5);
            float f8 = 30.0f * max3;
            m3601c1(this.f7317H, f8, f5);
            float f9 = 16.0f * max3;
            m3601c1(this.f7321J, f9, f5);
            m3601c1(this.f7313F, f7, f5);
            m3601c1(this.f7311E, f8, f5);
            m3601c1(this.f7315G, f9, f5);
            m3601c1(this.f7309D, f7, f5);
            m3601c1(this.f7305B, f8, f5);
            m3601c1(this.f7307C, f9, f5);
            AbstractC1539g1.m4202X(this.f7317H, this.f7311E, this.f7305B);
            TextView textView = this.f7313F;
            View view2 = textView != null ? (View) textView.getParent() : null;
            float f10 = 22.0f * f4 * max3;
            if (view2 != null && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMarginStart(Math.round(f10));
                view2.setLayoutParams(marginLayoutParams);
            }
            TextView textView2 = this.f7309D;
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
        if (max2 > 0.001f && (m3690p0 = m3690p0()) != null && m3690p0.getWidth() > 0 && m3690p0.getHeight() > 0) {
            float f12 = this.f7372f1;
            float left = m3690p0.getLeft();
            float width = m3690p0.getWidth() * f12;
            float height = (m3690p0.getHeight() * f12) + m3690p0.getTop();
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
        View view4 = this.f7323K;
        if (view4 != null && this.f7373g != null && (view4.getLayoutParams() instanceof C1592d)) {
            C1592d c1592d = (C1592d) this.f7323K.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = 470;
            ((ViewGroup.MarginLayoutParams) c1592d).height = m152f;
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(max6);
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max7;
            this.f7323K.setLayoutParams(c1592d);
            this.f7323K.setTranslationX(0.0f);
            this.f7323K.setTranslationY(0.0f);
        }
        this.f7323K.setAlpha(1.0f - max);
        this.f7323K.setTranslationY(max * 40.0f);
        this.f7323K.bringToFront();
        View view5 = this.f7395n0;
        if (view5 != null) {
            view5.bringToFront();
        }
    }

    /* renamed from: j0 */
    public final boolean m3674j0() {
        if (this.f7399o1 == null) {
            return false;
        }
        ImageView imageView = this.f7397o;
        if (imageView != null && imageView.getVisibility() == 0 && this.f7397o.getBackground() == this.f7399o1) {
            return true;
        }
        ViewGroup viewGroup = this.f7373g;
        return viewGroup != null && viewGroup.getBackground() == this.f7399o1;
    }

    /* renamed from: k */
    public final void m3675k(ImageView imageView, ImageView imageView2, TextView textView, float f2, boolean z2, float f3, float f4, float f5) {
        float f6;
        float f7;
        if (imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1585y0(this, 20));
            return;
        }
        float f8 = f3 - 1.0f;
        if (Math.abs(f8) < 0.001f) {
            m3589P0(imageView, f4, f5);
            m3637M0(imageView2);
            m3589P0(textView, f4, f2 + f5);
            m3706u1(imageView, 1.0f, 0.0f, 0.0f, f4, f5, 0.0f, 0.0f);
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m3604f0(imageView, f3, z2, fArr, fArr2);
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        if (f3 < 0.999f) {
            f7 = m3712w1() * (-20.0f);
        } else {
            if (f3 <= 1.001f) {
                f6 = 0.0f;
                m3588I(imageView, f3, f9, f10, f4, f5, f11, f12);
                m3704u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
                m3588I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
                m3706u1(imageView, f3, f9, f10, f4, f5, f11, f12);
            }
            if (Math.abs(f8) < 0.001f || f3 < 1.0f) {
                f7 = 0.0f;
            } else {
                float m3654Z = m3654Z(f3);
                f7 = (((-imageView.getHeight()) * 0.16f) * m3654Z) - (m3654Z * 120.0f);
            }
        }
        f6 = f7;
        m3588I(imageView, f3, f9, f10, f4, f5, f11, f12);
        m3704u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
        m3588I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
        m3706u1(imageView, f3, f9, f10, f4, f5, f11, f12);
    }

    /* renamed from: k0 */
    public final boolean m3676k0() {
        return this.f7364d.f2537K2 && m3655a0();
    }

    /* renamed from: k1 */
    public final boolean m3677k1() {
        return m3678l0() && !m3667g0();
    }

    /* renamed from: l0 */
    public final boolean m3678l0() {
        cfgData cfgdata = this.f7364d;
        return AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
    }

    /* renamed from: l1 */
    public final boolean m3679l1() {
        return m3681m0() && !m3667g0();
    }

    /* renamed from: m */
    public final void m3680m(boolean z2) {
        boolean z3 = this.f7364d.f2636h2;
        if (z2 || !Boolean.valueOf(z3).equals(this.f7354Z0)) {
            this.f7354Z0 = Boolean.valueOf(z3);
            this.f7348W0 = false;
            m3602d1(this.f7400p, z3 ? 1 : 0);
            m3602d1(this.f7403q, z3 ? 1 : 0);
            m3602d1(this.f7406r, z3 ? 1 : 0);
            m3602d1(this.f7409s, z3 ? 1 : 0);
            for (ImageView imageView : this.f7419x) {
                m3602d1(imageView, z3 ? 1 : 0);
            }
            for (ImageView imageView2 : this.f7421y) {
                m3602d1(imageView2, z3 ? 1 : 0);
            }
            m3608l(this.f7400p, z3);
            m3608l(this.f7403q, !z3);
            ImageView imageView3 = this.f7406r;
            if (imageView3 != null && this.f7316G0 != null) {
                imageView3.post(new RunnableC1585y0(this, 11));
            }
            ImageView imageView4 = this.f7409s;
            if (imageView4 != null && this.f7318H0 != null) {
                imageView4.post(new RunnableC1585y0(this, 12));
            }
            ImageView imageView5 = this.f7411t;
            if (imageView5 != null && this.f7320I0 != null) {
                imageView5.post(new RunnableC1585y0(this, 14));
            }
            ImageView imageView6 = this.f7413u;
            if (imageView6 != null && this.f7322J0 != null) {
                imageView6.post(new RunnableC1585y0(this, 15));
            }
            m3710w();
            carData cardata = this.f7367e;
            m3612B0(cardata.m1753i());
            m3609A0(cardata.m1745e());
        }
    }

    /* renamed from: m0 */
    public final boolean m3681m0() {
        return AbstractC1539g1.m4195Q(this.f7364d, this.f7367e);
    }

    /* renamed from: m1 */
    public final boolean m3682m1() {
        if (m3676k0()) {
            return !this.f7330N0 || this.f7342T0 > 0.0f;
        }
        return false;
    }

    /* renamed from: n */
    public final void m3683n() {
        if (this.f7399o1 == null) {
            C1525c c1525c = new C1525c(-16777216);
            this.f7399o1 = c1525c;
            c1525c.m4164f(1720508584);
        }
        C1574t m3644Q0 = m3644Q0();
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        this.f7373g.setBackgroundResource(android.R.color.transparent);
        if (!m3644Q0.m4472a() || m3694q1()) {
            if (m3644Q0.m4472a()) {
                m3672i0();
            }
            m3686o();
        } else if (m3694q1()) {
            m3672i0();
            m3686o();
            m3610A1();
        } else if (this.f7397o == null) {
            m3672i0();
            this.f7399o1.m4163e(null);
            this.f7399o1.m4162d(m3677k1() ? -15068660 : -16777216);
            this.f7373g.setLayerType(1, null);
            this.f7373g.setBackground(this.f7399o1);
        } else if (m3674j0() && this.f7397o.getBackground() == this.f7399o1) {
            this.f7397o.setLayerType(1, null);
            m3610A1();
        } else {
            this.f7397o.setVisibility(0);
            this.f7397o.setLayerType(1, null);
            this.f7397o.setBackground(null);
            RunnableC0123b runnableC0123b = new RunnableC0123b(this, 6, m3644Q0);
            if (m3644Q0.f8687b != 0) {
                runnableC0123b.run();
            } else {
                Uri uri = m3644Q0.f8688c;
                if (uri != null) {
                    this.f7397o.setImageURI(uri);
                    this.f7397o.post(runnableC0123b);
                }
            }
        }
        m3610A1();
    }

    /* renamed from: n0 */
    public final boolean m3684n0() {
        return this.f7364d.f2635h1 == 0 && !this.f7384j1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v243, types: [android.view.View] */
    /* renamed from: n1 */
    public final void m3685n1() {
        int i;
        View view = this.f7358b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_49_root);
        this.f7373g = viewGroup;
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
        this.f7397o = (ImageView) view.findViewById(R.id.theme_49_style_bg);
        this.f7376h = view.findViewById(R.id.theme_49_navi_hole);
        this.f7379i = view.findViewById(R.id.theme_49_top_panel);
        this.f7382j = view.findViewById(R.id.theme_49_bottom_panel);
        this.f7385k = view.findViewById(R.id.theme_49_bottom_panel_left);
        this.f7388l = view.findViewById(R.id.theme_49_bottom_panel_center);
        this.f7391m = view.findViewById(R.id.theme_49_bottom_panel_right);
        if (this.f7388l != null) {
            C1528d c1528d = new C1528d(-15068660);
            this.f7394n = c1528d;
            this.f7388l.setBackground(c1528d);
        }
        this.f7400p = (ImageView) view.findViewById(R.id.theme_49_spd_face);
        this.f7403q = (ImageView) view.findViewById(R.id.theme_49_rpm_face);
        this.f7406r = (ImageView) view.findViewById(R.id.theme_49_spd_needle);
        this.f7409s = (ImageView) view.findViewById(R.id.theme_49_rpm_needle);
        this.f7411t = (ImageView) view.findViewById(R.id.theme_49_fuel_needle);
        this.f7413u = (ImageView) view.findViewById(R.id.theme_49_temp_needle);
        this.f7305B = (TextView) view.findViewById(R.id.theme_49_inst_fuel);
        this.f7307C = (TextView) view.findViewById(R.id.theme_49_inst_fuel_sub);
        this.f7309D = (TextView) view.findViewById(R.id.theme_49_lbl_inst);
        this.f7311E = (TextView) view.findViewById(R.id.theme_49_avg_jour);
        this.f7313F = (TextView) view.findViewById(R.id.theme_49_lbl_avg_jour);
        this.f7315G = (TextView) view.findViewById(R.id.theme_49_avg_jour_sub);
        this.f7317H = (TextView) view.findViewById(R.id.theme_49_avg_total);
        this.f7319I = (TextView) view.findViewById(R.id.theme_49_lbl_avg_total);
        this.f7321J = (TextView) view.findViewById(R.id.theme_49_avg_total_sub);
        this.f7323K = view.findViewById(R.id.theme_49_fuel_cons_wrap);
        this.f7333P = (ViewGroup) view.findViewById(R.id.theme_49_odo_wrap);
        this.f7335Q = (TextView) view.findViewById(R.id.theme_49_odo_total);
        this.f7337R = (TextView) view.findViewById(R.id.theme_49_odo_day);
        this.f7339S = (TextView) view.findViewById(R.id.theme_49_odo_trip);
        this.f7341T = (ViewGroup) view.findViewById(R.id.theme_49_tires_wrap);
        this.f7343U = (TextView) view.findViewById(R.id.theme_49_tires_up);
        this.f7347W = (TextView) view.findViewById(R.id.theme_49_battery);
        this.f7349X = (TextView) view.findViewById(R.id.theme_49_gear);
        this.f7351Y = (TextView) view.findViewById(R.id.theme_49_clock);
        this.f7353Z = (TextView) view.findViewById(R.id.theme_49_out_temp);
        this.f7356a0 = (ImageView) view.findViewById(R.id.theme_49_wifi);
        this.f7359b0 = (ImageView) view.findViewById(R.id.theme_49_inet);
        this.f7362c0 = (TextView) view.findViewById(R.id.theme_49_spd_value);
        this.f7365d0 = (TextView) view.findViewById(R.id.theme_49_rpm_value);
        this.f7325L = (TextView) view.findViewById(R.id.theme_49_fuel_up);
        this.f7345V = (TextView) view.findViewById(R.id.theme_49_temp_up);
        TextView textView = (TextView) view.findViewById(R.id.theme_49_remain);
        this.f7327M = textView;
        if (textView != null) {
            this.f7363c1 = textView.getTranslationX();
        }
        this.f7329N = (TextView) view.findViewById(R.id.theme_49_odo_up);
        View findViewById = view.findViewById(R.id.theme_49_odo_frame);
        this.f7331O = findViewById;
        AbstractC1539g1.m4223j(this.f7329N, findViewById);
        AbstractC1539g1.m4204Z(this.f7335Q, this.f7337R, this.f7339S);
        AbstractC1539g1.m4202X(this.f7317H, this.f7311E, this.f7305B);
        this.f7368e0 = (TextView) view.findViewById(R.id.theme_49_txt_speed);
        this.f7374g0 = view.findViewById(R.id.theme_49_txt_speed_scrim);
        this.f7371f0 = (TextView) view.findViewById(R.id.theme_49_txt_rpm);
        TextView textView2 = this.f7362c0;
        TextView textView3 = this.f7365d0;
        this.f7357a1 = textView2 != null ? textView2.getTranslationY() : 0.0f;
        this.f7360b1 = textView3 != null ? textView3.getTranslationY() : 0.0f;
        if (Math.abs(this.f7357a1) < 0.5f && Math.abs(this.f7360b1) < 0.5f) {
            float f2 = this.f7361c.getResources().getDisplayMetrics().scaledDensity * 60.0f;
            this.f7357a1 = f2;
            this.f7360b1 = f2;
            if (textView2 != null) {
                textView2.setTranslationY(f2);
            }
            if (textView3 != null) {
                textView3.setTranslationY(f2);
            }
        }
        this.f7377h0 = (ImageView) view.findViewById(R.id.theme_49_cruise);
        this.f7380i0 = (TextView) view.findViewById(R.id.theme_49_cruise_speed);
        this.f7383j0 = (ImageView) view.findViewById(R.id.theme_49_lane);
        this.f7386k0 = (ImageView) view.findViewById(R.id.theme_49_hide_cruise);
        this.f7389l0 = (ImageView) view.findViewById(R.id.theme_49_hide_la);
        this.f7401p0 = view.findViewById(R.id.theme_49_ext_spacer);
        View findViewById2 = view.findViewById(R.id.theme_49_media_wrap);
        this.f7392m0 = findViewById2;
        AbstractC0641i.m1886c(findViewById2);
        this.f7395n0 = view.findViewById(R.id.theme_49_center_float);
        this.f7398o0 = view.findViewById(R.id.theme_49_ext_row);
        View view2 = this.f7395n0;
        if (view2 instanceof ViewGroup) {
            ((ViewGroup) view2).setClipChildren(false);
            ((ViewGroup) this.f7395n0).setClipToPadding(false);
        }
        ViewGroup viewGroup4 = this.f7373g;
        if (viewGroup4 != null) {
            viewGroup4.setClipChildren(false);
            this.f7373g.setClipToPadding(false);
        }
        View view3 = this.f7398o0;
        if (view3 != null) {
            if (view3 instanceof ViewGroup) {
                ((ViewGroup) view3).setClipChildren(false);
                ((ViewGroup) this.f7398o0).setClipToPadding(false);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7398o0.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin += 15;
                this.f7398o0.setLayoutParams(marginLayoutParams);
            }
        }
        m3650U();
        this.f7407r0 = (ImageView) view.findViewById(R.id.theme_49_media_art);
        this.f7410s0 = (TextView) view.findViewById(R.id.theme_49_media_title);
        this.f7412t0 = (TextView) view.findViewById(R.id.theme_49_media_artist);
        this.f7414u0 = (TextView) view.findViewById(R.id.theme_49_media_elapsed);
        this.f7416v0 = (TextView) view.findViewById(R.id.theme_49_media_total);
        this.f7418w0 = (ProgressBar) view.findViewById(R.id.theme_49_media_bar);
        TextView textView4 = (TextView) view.findViewById(R.id.theme_49_free_mem);
        Handler handler = this.f7370f;
        this.f7314F0 = new C1531e(handler, textView4);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f7355a);
        }
        m3670h0();
        m3680m(true);
        m3666g();
        carData cardata = this.f7367e;
        m3609A0(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView5 = this.f7380i0;
        if (textView5 != null) {
            textView5.setText(String.valueOf(m1747f));
        }
        m3609A0(cardata.m1745e());
        float m3663e0 = m3663e0();
        float m3661d0 = m3661d0();
        this.f7316G0 = new C1572s(0.0f, 220.0f, -135.5f, 136.5f, m3663e0, 3);
        this.f7318H0 = new C1572s(0.0f, 8.0f, -135.5f, 136.5f, m3661d0, 3);
        float max = Math.max(0.0f, cardata.m1774t());
        float m1743d = cardata.m1743d();
        float f3 = m1743d < 40.0f ? 40.0f : m1743d;
        this.f7320I0 = new C1572s(0.0f, 100.0f, 32.5f, -32.5f, max, 3);
        this.f7322J0 = new C1572s(40.0f, 130.0f, 32.5f, -32.5f, f3, 3);
        m3607j1(this.f7406r, this.f7316G0);
        m3607j1(this.f7409s, this.f7318H0);
        m3607j1(this.f7411t, this.f7320I0);
        m3607j1(this.f7413u, this.f7322J0);
        ImageView imageView = this.f7400p;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ImageView imageView2 = this.f7403q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        ImageView imageView3 = this.f7406r;
        if (imageView3 != null) {
            imageView3.setImageDrawable(null);
        }
        ImageView imageView4 = this.f7409s;
        if (imageView4 != null) {
            imageView4.setImageDrawable(null);
        }
        ImageView imageView5 = this.f7411t;
        if (imageView5 != null) {
            imageView5.setImageDrawable(null);
        }
        ImageView imageView6 = this.f7413u;
        if (imageView6 != null) {
            imageView6.setImageDrawable(null);
        }
        this.f7419x = m3590R(this.f7406r);
        this.f7421y = m3590R(this.f7409s);
        C1572s c1572s = this.f7316G0;
        if (c1572s != null) {
            float f4 = c1572s.f8682h;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f7423z;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = f4;
                i2++;
            }
        }
        C1572s c1572s2 = this.f7318H0;
        if (c1572s2 != null) {
            float f5 = c1572s2.f8682h;
            while (true) {
                float[] fArr2 = this.f7303A;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = f5;
                i++;
            }
        }
        m3711w0();
        final int i3 = 0;
        m3696r0("themes/49/theme_49_spd.bin", new Consumer(this) { // from class: u0.B0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7174b;

            {
                this.f7174b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i3) {
                    case 0:
                        C1477E0 c1477e0 = this.f7174b;
                        c1477e0.f7415v = bitmap;
                        c1477e0.f7352Y0 = -1;
                        c1477e0.m3612B0(c1477e0.f7367e.m1753i());
                        break;
                    case 1:
                        C1477E0 c1477e02 = this.f7174b;
                        c1477e02.f7417w = bitmap;
                        c1477e02.f7352Y0 = -1;
                        c1477e02.m3612B0(c1477e02.f7367e.m1753i());
                        break;
                    case 2:
                        C1477E0 c1477e03 = this.f7174b;
                        ImageView imageView7 = c1477e03.f7406r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1477e03.f7409s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1477e03.f7419x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1477e03.f7421y;
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
                        C1477E0 c1477e04 = this.f7174b;
                        ImageView imageView11 = c1477e04.f7411t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1477e04.f7413u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        m3696r0("themes/49/theme_49_rpm.bin", new Consumer(this) { // from class: u0.B0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7174b;

            {
                this.f7174b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i4) {
                    case 0:
                        C1477E0 c1477e0 = this.f7174b;
                        c1477e0.f7415v = bitmap;
                        c1477e0.f7352Y0 = -1;
                        c1477e0.m3612B0(c1477e0.f7367e.m1753i());
                        break;
                    case 1:
                        C1477E0 c1477e02 = this.f7174b;
                        c1477e02.f7417w = bitmap;
                        c1477e02.f7352Y0 = -1;
                        c1477e02.m3612B0(c1477e02.f7367e.m1753i());
                        break;
                    case 2:
                        C1477E0 c1477e03 = this.f7174b;
                        ImageView imageView7 = c1477e03.f7406r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1477e03.f7409s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1477e03.f7419x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1477e03.f7421y;
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
                        C1477E0 c1477e04 = this.f7174b;
                        ImageView imageView11 = c1477e04.f7411t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1477e04.f7413u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 2;
        m3696r0("themes/49/theme_49_needle.bin", new Consumer(this) { // from class: u0.B0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7174b;

            {
                this.f7174b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i5) {
                    case 0:
                        C1477E0 c1477e0 = this.f7174b;
                        c1477e0.f7415v = bitmap;
                        c1477e0.f7352Y0 = -1;
                        c1477e0.m3612B0(c1477e0.f7367e.m1753i());
                        break;
                    case 1:
                        C1477E0 c1477e02 = this.f7174b;
                        c1477e02.f7417w = bitmap;
                        c1477e02.f7352Y0 = -1;
                        c1477e02.m3612B0(c1477e02.f7367e.m1753i());
                        break;
                    case 2:
                        C1477E0 c1477e03 = this.f7174b;
                        ImageView imageView7 = c1477e03.f7406r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1477e03.f7409s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1477e03.f7419x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1477e03.f7421y;
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
                        C1477E0 c1477e04 = this.f7174b;
                        ImageView imageView11 = c1477e04.f7411t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1477e04.f7413u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 3;
        m3696r0("themes/49/theme_49_needle_small.bin", new Consumer(this) { // from class: u0.B0

            /* renamed from: b */
            public final /* synthetic */ C1477E0 f7174b;

            {
                this.f7174b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i6) {
                    case 0:
                        C1477E0 c1477e0 = this.f7174b;
                        c1477e0.f7415v = bitmap;
                        c1477e0.f7352Y0 = -1;
                        c1477e0.m3612B0(c1477e0.f7367e.m1753i());
                        break;
                    case 1:
                        C1477E0 c1477e02 = this.f7174b;
                        c1477e02.f7417w = bitmap;
                        c1477e02.f7352Y0 = -1;
                        c1477e02.m3612B0(c1477e02.f7367e.m1753i());
                        break;
                    case 2:
                        C1477E0 c1477e03 = this.f7174b;
                        ImageView imageView7 = c1477e03.f7406r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1477e03.f7409s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1477e03.f7419x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1477e03.f7421y;
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
                        C1477E0 c1477e04 = this.f7174b;
                        ImageView imageView11 = c1477e04.f7411t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1477e04.f7413u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView7 = this.f7400p;
        if (imageView7 != null) {
            imageView7.post(new RunnableC1585y0(this, 0));
        }
        if (!this.f7326L0) {
            m3632K();
            this.f7326L0 = true;
        }
        ViewGroup viewGroup5 = this.f7373g;
        if (viewGroup5 != null) {
            viewGroup5.setAlpha(1.0f);
        }
        this.f7393m1 = 0.0f;
        this.f7330N0 = true;
        this.f7342T0 = 0.0f;
        boolean z2 = this.f7364d.f2561Q2;
        this.f7328M0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m3703t1();
        this.f7350X0 = Boolean.valueOf(m3681m0());
        m3630J();
        this.f7324K0 = true;
        handler.post(this.f7402p1);
        handler.post(this.f7408r1);
        this.f7312E0 = AbstractC1372y1.f6437g;
        handler.post(this.f7405q1);
        this.f7314F0.m4171b();
        View view4 = this.f7395n0;
        if (view4 != null) {
            view4.post(new RunnableC1585y0(this, 2));
            return;
        }
        View view5 = this.f7392m0;
        if (view5 != null) {
            view5.post(new RunnableC1585y0(this, 3));
        }
    }

    /* renamed from: o */
    public final void m3686o() {
        if (this.f7397o == null) {
            m3672i0();
            this.f7399o1.m4163e(null);
            this.f7399o1.m4162d(m3677k1() ? -15068660 : -16777216);
            this.f7373g.setLayerType(1, null);
            this.f7373g.setBackground(this.f7399o1);
            return;
        }
        if (m3674j0()) {
            Drawable background = this.f7397o.getBackground();
            C1525c c1525c = this.f7399o1;
            if (background == c1525c) {
                c1525c.m4163e(null);
                this.f7399o1.m4162d(m3677k1() ? -15068660 : -16777216);
                this.f7397o.setLayerType(1, null);
                return;
            }
        }
        this.f7397o.setVisibility(0);
        this.f7397o.setLayerType(1, null);
        this.f7397o.setImageDrawable(null);
        this.f7397o.setBackground(null);
        this.f7399o1.m4163e(null);
        this.f7399o1.m4162d(m3677k1() ? -15068660 : -16777216);
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
            this.f7373g.setBackgroundResource(android.R.color.transparent);
        }
        this.f7397o.setBackground(this.f7399o1);
    }

    /* renamed from: o0 */
    public final void m3687o0() {
        TextView textView;
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f7347W == null || (textView = this.f7345V) == null || this.f7403q == null) {
            return;
        }
        if (textView.getVisibility() != 0) {
            this.f7347W.setVisibility(8);
            return;
        }
        if (this.f7403q.getWidth() <= 0 || this.f7345V.getWidth() <= 0 || this.f7347W.getWidth() <= 0) {
            this.f7347W.setVisibility(0);
            this.f7403q.post(new RunnableC1585y0(this, 8));
            return;
        }
        this.f7347W.setVisibility(0);
        float width = (this.f7345V.getWidth() * 0.5f) + this.f7345V.getLeft();
        this.f7366d1 = (((((this.f7403q.getWidth() * 0.5f) + this.f7403q.getLeft()) * 2.0f) - width) - 5.0f) - ((this.f7347W.getWidth() * 0.5f) + this.f7347W.getLeft());
        this.f7369e1 = ((this.f7345V.getHeight() * 0.5f) + this.f7345V.getTop()) - ((this.f7347W.getHeight() * 0.5f) + this.f7347W.getTop());
        if (this.f7347W == null || (imageView = this.f7403q) == null || imageView.getWidth() <= 0) {
            return;
        }
        ImageView imageView2 = this.f7403q;
        boolean z2 = imageView2 == m3647S0();
        float f5 = this.f7372f1;
        if (z2 && m3682m1()) {
            float[] fArr = new float[2];
            m3659c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m3684n0()) {
                f5 = this.f7372f1 * (1.0f - this.f7342T0);
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
            TextView textView2 = this.f7347W;
            m3589P0(textView2, m3702t0(textView2), m3705u0(this.f7347W));
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m3604f0(imageView2, f2, z2, fArr2, fArr3);
        TextView textView3 = this.f7347W;
        m3588I(textView3, f2, fArr2[0], fArr2[1], f3, f4, m3702t0(textView3) + fArr3[0], m3705u0(this.f7347W) + fArr3[1]);
    }

    /* renamed from: o1 */
    public final void m3688o1(float f2, float f3, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f7332O0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f7332O0);
        this.f7332O0.addUpdateListener(new C0174W(13, this));
        this.f7332O0.addListener(new C0181b0(this, 11, runnable));
        this.f7332O0.start();
    }

    /* renamed from: p */
    public final void m3689p(float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f7392m0 == null) {
            return;
        }
        Context context = this.f7361c;
        float f3 = context.getResources().getDisplayMetrics().density;
        float f4 = context.getResources().getDisplayMetrics().scaledDensity;
        float f5 = f3 * 14.0f * f2;
        float f6 = 10.0f * f3 * f2;
        this.f7392m0.setPadding(Math.round(f5), Math.round(f6), AbstractC0062j.m168v(f3, 16.0f, f2), Math.round(f6));
        if (this.f7407r0 != null) {
            int max = Math.max(1, Math.round(72.0f * f3 * f2));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7407r0.getLayoutParams();
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = max;
                marginLayoutParams2.height = max;
                marginLayoutParams2.setMarginEnd(Math.round(f5));
                this.f7407r0.setLayoutParams(marginLayoutParams2);
            }
        }
        TextView textView = this.f7410s0;
        if (textView != null) {
            AbstractC0062j.m164r(f4, 22.0f, f2, textView, 0);
        }
        TextView textView2 = this.f7412t0;
        if (textView2 != null) {
            AbstractC0062j.m164r(f4, 16.0f, f2, textView2, 0);
        }
        TextView textView3 = this.f7414u0;
        if (textView3 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView3, 0);
            this.f7414u0.setMinWidth(Math.round(f3 * 46.0f * f2));
        }
        TextView textView4 = this.f7416v0;
        if (textView4 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView4, 0);
            this.f7416v0.setMinWidth(Math.round(46.0f * f3 * f2));
        }
        ProgressBar progressBar = this.f7418w0;
        if (progressBar != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar.getLayoutParams()) != null) {
            marginLayoutParams.height = Math.max(1, Math.round(6.0f * f3 * f2));
            int round = Math.round(f3 * 8.0f * f2);
            marginLayoutParams.setMarginStart(round);
            marginLayoutParams.setMarginEnd(round);
            this.f7418w0.setLayoutParams(marginLayoutParams);
        }
        View view = this.f7392m0;
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
    public final ImageView m3690p0() {
        return this.f7364d.f2636h2 ? this.f7403q : this.f7400p;
    }

    /* renamed from: p1 */
    public final void m3691p1(String str) {
        Context context = this.f7361c;
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
    public final void m3692q(boolean z2) {
        int i;
        int i2;
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup == null || this.f7336Q0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7373g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7373g.post(new RunnableC1473C0(this, z2, 1));
            return;
        }
        m3650U();
        m3697r1();
        int round = Math.round(this.f7361c.getResources().getDisplayMetrics().density * 96.0f);
        float m3712w1 = m3712w1();
        float max = Math.max(0.0f, Math.min(1.0f, this.f7378h1));
        m3611B(m3712w1);
        m3707v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f7378h1, 0.0f, m3712w1()));
        m3673j(width, height, round, m3712w1);
        boolean z3 = m3712w1 > 0.001f;
        if (this.f7392m0 != null && this.f7364d.f2585W2 && !m3667g0() && !m3678l0()) {
            C0639g.m1872x().m1880u();
            if (C0639g.m1872x().m1880u().m1851a()) {
                if (max >= 0.999f) {
                    this.f7392m0.setAlpha(0.0f);
                    this.f7392m0.setVisibility(4);
                } else if (this.f7392m0.getVisibility() != 0) {
                    this.f7392m0.setVisibility(0);
                }
            }
        }
        View view = this.f7392m0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int i3 = width - 470;
        int max2 = Math.max(0, i3 / 2);
        int m4298b = AbstractC1561o.m4298b(height, round, 40, 0);
        if (!z3) {
            m3689p(1.0f);
            m3695r(this.f7392m0, round, max2, m4298b, max * 40.0f, z2);
            this.f7392m0.setAlpha(1.0f - max);
            this.f7392m0.bringToFront();
            View view2 = this.f7395n0;
            if (view2 != null) {
                view2.bringToFront();
                return;
            }
            return;
        }
        float f2 = ((-0.19999999f) * m3712w1) + 1.0f;
        m3689p(f2);
        int m152f = AbstractC0062j.m152f(round, f2, 1);
        ImageView m3690p0 = m3690p0();
        if (m3690p0 == null || m3690p0.getWidth() <= 0 || m3690p0.getHeight() <= 0) {
            i = max2;
            i2 = m4298b;
        } else {
            float f3 = this.f7372f1;
            float left = m3690p0.getLeft();
            float width2 = m3690p0.getWidth() * f3;
            float height2 = (m3690p0.getHeight() * f3) + m3690p0.getTop();
            float m149c = AbstractC0062j.m149c(width2, 470, 0.5f, left);
            float f4 = height2 + 23.0f;
            float max3 = Math.max(0.0f, (height - m152f) - 8.0f);
            if (f4 > max3) {
                f4 = max3;
            }
            float f5 = max2;
            int m151e = AbstractC0062j.m151e(m149c, f5, m3712w1, f5);
            float f6 = m4298b;
            int m151e2 = AbstractC0062j.m151e(f4, f6, m3712w1, f6);
            int max4 = Math.max(0, Math.min(m151e, Math.max(0, i3)));
            int max5 = Math.max(0, m151e2);
            i = max4;
            i2 = max5;
        }
        m3695r(this.f7392m0, m152f, i, i2, max * 40.0f, z2);
        this.f7392m0.setAlpha(1.0f - max);
        this.f7392m0.bringToFront();
        View view3 = this.f7395n0;
        if (view3 != null) {
            view3.bringToFront();
        }
    }

    /* renamed from: q0 */
    public final float m3693q0() {
        return this.f7364d.f2636h2 ? this.f7360b1 : this.f7357a1;
    }

    /* renamed from: q1 */
    public final boolean m3694q1() {
        return m3677k1() && m3644Q0().m4472a();
    }

    /* renamed from: r */
    public final void m3695r(View view, int i, int i2, int i3, float f2, boolean z2) {
        float f3 = this.f7306B0;
        if (f3 < 0.0f) {
            f3 = i2;
        }
        float f4 = f3 + 0.0f;
        float f5 = this.f7308C0;
        float f6 = f5 >= 0.0f ? f5 + this.f7310D0 : i3 + f2;
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
        if (z2 && this.f7308C0 >= 0.0f && z3) {
            view.animate().cancel();
            view.setTranslationX(f4 - f7);
            view.setTranslationY(f6 - f8);
            view.animate().translationX(0.0f).translationY(f2).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            view.animate().cancel();
            view.setTranslationX(0.0f);
            view.setTranslationY(f2);
        }
        this.f7306B0 = f7;
        this.f7308C0 = f8;
        this.f7310D0 = f2;
    }

    /* renamed from: r0 */
    public final void m3696r0(String str, Consumer consumer) {
        AbstractC1354s1.m3252a(this.f7361c, str, new C1562o0(consumer, 2), this.f7370f, 0);
    }

    /* renamed from: r1 */
    public final void m3697r1() {
        View view;
        ViewGroup viewGroup;
        View view2;
        TextView textView = this.f7329N;
        boolean z2 = textView != null && textView.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f7341T;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = z2 || z3;
        View view3 = this.f7331O;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        int m3651V = m3651V();
        View view4 = this.f7331O;
        if (view4 != null) {
            if (!z2 || m3651V <= 0) {
                view4.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    view4.setLayoutParams(layoutParams);
                }
            } else {
                m3597Z0(view4, m3651V);
                View view5 = this.f7331O;
                if (view5 instanceof LinearLayout) {
                    ((LinearLayout) view5).setGravity(17);
                }
                TextView textView2 = this.f7329N;
                if (textView2 != null) {
                    AbstractC1539g1.m4223j(textView2, this.f7331O);
                }
            }
        }
        ViewGroup viewGroup3 = this.f7341T;
        if (viewGroup3 != null) {
            if (z3 && m3651V > 0) {
                TextView textView3 = this.f7343U;
                if (textView3 != null) {
                    int round = Math.round(textView3.getPaint().measureText("000       000")) + this.f7341T.getPaddingEnd() + this.f7341T.getPaddingStart();
                    if (round > 0) {
                        this.f7341T.setMinimumWidth(round);
                    }
                }
                m3597Z0(this.f7341T, m3651V);
            } else if (z3 && z2 && (view2 = this.f7331O) != null) {
                view2.post(new RunnableC1585y0(this, 7));
            } else {
                viewGroup3.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    viewGroup3.setLayoutParams(layoutParams2);
                }
            }
        }
        boolean z5 = (z2 && z3) || m3616C1() || m3712w1() > 0.001f;
        View view6 = this.f7401p0;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams3 = view6.getLayoutParams() instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) this.f7401p0.getLayoutParams() : null;
            if (z5) {
                this.f7401p0.setVisibility(0);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 1.0f;
                    this.f7401p0.setLayoutParams(layoutParams3);
                }
            } else {
                this.f7401p0.setVisibility(8);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 0.0f;
                    this.f7401p0.setLayoutParams(layoutParams3);
                }
            }
        }
        View view7 = this.f7398o0;
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
        boolean m3616C1 = m3616C1();
        View view8 = this.f7398o0;
        if ((view8 instanceof ViewGroup) && (view = this.f7331O) != null && (viewGroup = this.f7341T) != null && this.f7401p0 != null) {
            ViewGroup viewGroup4 = (ViewGroup) view8;
            if (m3616C1) {
                view = viewGroup;
            }
            if (viewGroup4.getChildCount() < 1 || viewGroup4.getChildAt(0) != view) {
                viewGroup4.removeView(this.f7331O);
                viewGroup4.removeView(this.f7401p0);
                viewGroup4.removeView(this.f7341T);
                if (m3616C1) {
                    viewGroup4.addView(this.f7341T);
                    viewGroup4.addView(this.f7401p0);
                    viewGroup4.addView(this.f7331O);
                } else {
                    viewGroup4.addView(this.f7331O);
                    viewGroup4.addView(this.f7401p0);
                    viewGroup4.addView(this.f7341T);
                }
            }
        }
        if (m3616C1) {
            m3593W0(this.f7341T, 48);
            m3593W0(this.f7331O, 8388661);
        } else {
            m3593W0(this.f7331O, 48);
            m3593W0(this.f7341T, 8388661);
        }
        View view9 = this.f7398o0;
        if (view9 != null) {
            view9.setVisibility(z4 ? 0 : 8);
        }
        View view10 = this.f7395n0;
        if (view10 != null) {
            view10.setVisibility(z4 ? 0 : 8);
        }
    }

    /* renamed from: s */
    public final void m3698s(long j2) {
        boolean z2 = this.f7422y0 > 0;
        ProgressBar progressBar = this.f7418w0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7418w0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7422y0)));
            }
        }
        TextView textView = this.f7414u0;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7414u0.setText(m3595Y(j2));
            }
        }
        TextView textView2 = this.f7416v0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7416v0.setText(m3595Y(this.f7422y0));
            }
        }
    }

    /* renamed from: s0 */
    public final RectF m3699s0() {
        RectF rectF = new RectF();
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup != null && viewGroup.getWidth() > 0 && this.f7373g.getHeight() > 0) {
            float width = this.f7373g.getWidth() - 0.0f;
            float height = this.f7373g.getHeight();
            if (width > 0.0f && height > 0.0f) {
                rectF.set(0.0f, 0.0f, width, height);
            }
        }
        return rectF;
    }

    /* renamed from: s1 */
    public final void m3700s1(ImageView imageView, float f2, boolean z2, float f3, float f4) {
        ImageView imageView2 = imageView == this.f7400p ? this.f7411t : imageView == this.f7403q ? this.f7413u : null;
        if (imageView2 == null || imageView == null) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m3637M0(imageView2);
            C1572s c1572s = imageView2 == this.f7411t ? this.f7320I0 : this.f7322J0;
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
        m3604f0(imageView, f2, z2, fArr, fArr2);
        m3704u(imageView2, imageView, f2, fArr[0], fArr[1], fArr2[0] + f3, fArr2[1] + f4);
        C1572s c1572s2 = imageView2 == this.f7411t ? this.f7320I0 : this.f7322J0;
        if (c1572s2 != null) {
            c1572s2.m4470a(imageView2);
        }
    }

    /* renamed from: t */
    public final void m3701t() {
        ViewGroup viewGroup;
        if (this.f7376h == null || (viewGroup = this.f7373g) == null) {
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f7373g.getHeight() <= 0) {
            this.f7373g.post(new RunnableC1585y0(this, 6));
            return;
        }
        if (this.f7376h.getLayoutParams() instanceof C1592d) {
            RectF m3699s0 = m3677k1() ? m3699s0() : m3640O();
            C1592d c1592d = (C1592d) this.f7376h.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m3699s0.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m3699s0.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m3699s0.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m3699s0.top);
            this.f7376h.setLayoutParams(c1592d);
            if (m3613B1() || m3619D1()) {
                this.f7376h.setVisibility(4);
            }
            if (m3619D1() || m3679l1()) {
                float f2 = this.f7361c.getResources().getDisplayMetrics().density * 14.0f;
                View view = this.f7388l;
                if (view == null) {
                    return;
                }
                m3603f(view, 25.0f + f2 + 10.0f);
                C1528d c1528d = this.f7394n;
                if (c1528d != null) {
                    c1528d.m4167b(f2);
                }
            }
        }
    }

    /* renamed from: t0 */
    public final float m3702t0(View view) {
        if (view == this.f7327M) {
            return this.f7363c1;
        }
        if (view == this.f7347W) {
            return this.f7366d1;
        }
        return 0.0f;
    }

    /* renamed from: t1 */
    public final void m3703t1() {
        ValueAnimator valueAnimator = this.f7381i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7381i1 = null;
        }
        this.f7384j1 = false;
        this.f7387k1 = -1;
        cfgData cfgdata = this.f7364d;
        boolean z2 = cfgdata.f2561Q2;
        Context context = this.f7361c;
        if (!z2) {
            if (cfgdata.f2635h1 != 0) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
            }
            this.f7372f1 = m3709v1();
            this.f7375g1 = 1.0f;
            this.f7378h1 = 0.0f;
            m3617D();
            return;
        }
        if (m3681m0() && cfgdata.f2635h1 == 1) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        if (m3678l0() && cfgdata.f2635h1 != 0) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        this.f7372f1 = m3684n0() ? m3709v1() : 1.0f;
        this.f7375g1 = m3622E1() ? 1.0f : 0.0f;
        this.f7378h1 = cfgdata.f2635h1 == 2 ? 1.0f : 0.0f;
        m3617D();
        if (m3684n0()) {
            ImageView m3690p0 = m3690p0();
            if (m3690p0 == null) {
                m3690p0 = m3647S0();
            }
            if (m3690p0 == null || m3690p0.getWidth() > 0) {
                return;
            }
            m3690p0.post(new RunnableC1585y0(this, 9));
        }
    }

    /* renamed from: u */
    public final void m3704u(ImageView imageView, ImageView imageView2, float f2, float f3, float f4, float f5, float f6) {
        if (imageView == null || imageView2 == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1585y0(this, 22));
            return;
        }
        float width = (imageView2.getWidth() * 0.5f) + imageView2.getLeft();
        float m149c = AbstractC0062j.m149c(width, f3, f2, f3);
        imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setTranslationX((m149c - ((imageView.getWidth() * 0.5f) + imageView.getLeft())) + f5);
        imageView.setTranslationY((AbstractC0062j.m149c((imageView2.getHeight() * 0.5f) + imageView2.getTop(), f4, f2, f4) - ((imageView.getHeight() * 0.5f) + imageView.getTop())) + f6 + 0.0f);
        ImageView imageView3 = this.f7406r;
        if (imageView == imageView3 || imageView == this.f7409s) {
            C1572s c1572s = imageView == imageView3 ? this.f7316G0 : this.f7318H0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m3623F(imageView);
        }
    }

    /* renamed from: u0 */
    public final float m3705u0(View view) {
        if (view == this.f7347W) {
            return this.f7369e1;
        }
        return 0.0f;
    }

    /* renamed from: u1 */
    public final void m3706u1(ImageView imageView, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (Math.abs(f2 - 1.0f) < 0.001f) {
            View[] m3657b0 = m3657b0(imageView);
            int length = m3657b0.length;
            for (int i = 0; i < length; i++) {
                View view = m3657b0[i];
                m3589P0(view, (view == this.f7327M ? m3631J0(f2) : m3702t0(view)) + f5 + f7, m3705u0(view) + f6 + f8);
            }
            return;
        }
        View[] m3657b02 = m3657b0(imageView);
        int length2 = m3657b02.length;
        for (int i2 = 0; i2 < length2; i2++) {
            View view2 = m3657b02[i2];
            m3588I(view2, f2, f3, f4, f5, f6, (view2 == this.f7327M ? m3631J0(f2) : m3702t0(view2)) + f7, m3705u0(view2) + f8);
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
    public final void m3707v(int i, int i2, int i3, float f2) {
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
        View view4 = this.f7395n0;
        if (view4 == null || view4.getVisibility() != 0) {
            return;
        }
        View view5 = this.f7331O;
        boolean z2 = view5 != null && view5.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f7341T;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = (z2 ^ z3) && !(m3616C1() || (m3712w1() > 0.001f ? 1 : (m3712w1() == 0.001f ? 0 : -1)) > 0);
        int m3651V = m3651V();
        if (m3651V <= 0 || (!z2 && !z3)) {
            if (!z2 || (view = this.f7331O) == null) {
                m3651V = 0;
            } else if (view.getHeight() > 0) {
                m3651V = Math.max(0, this.f7331O.getHeight());
            } else {
                this.f7331O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                m3651V = Math.max(0, this.f7331O.getMeasuredHeight());
            }
            if (z3 && (viewGroup = this.f7341T) != null) {
                if (viewGroup.getHeight() > 0) {
                    max = Math.max(m3651V, this.f7341T.getHeight());
                } else {
                    this.f7341T.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    max = Math.max(m3651V, this.f7341T.getMeasuredHeight());
                }
                m3651V = max;
            }
        }
        if (m3651V <= 0) {
            View view6 = this.f7398o0;
            if (view6 != null && view6.getVisibility() == 0 && this.f7398o0.getHeight() > 0) {
                m3651V = this.f7398o0.getHeight();
            } else if (this.f7395n0.getHeight() > 0) {
                m3651V = this.f7395n0.getHeight();
            }
        }
        if (m3651V <= 0) {
            this.f7395n0.post(new RunnableC1585y0(this, 10));
            return;
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float max3 = Math.max(0.0f, Math.min(1.0f, this.f7378h1));
        float f7 = (max2 * (-0.19999999f)) + 1.0f;
        if (z4) {
            View view7 = z2 ? this.f7331O : this.f7341T;
            if (view7 != null) {
                view7.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(m3651V, 1073741824));
                if (view7.getMeasuredWidth() > 0) {
                    i4 = view7.getMeasuredWidth();
                    float f8 = i4;
                    float f9 = f8 * f7;
                    float f10 = m3651V * f7;
                    int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
                    int i8 = i - i4;
                    int m152f = AbstractC0062j.m152f(i8, 0.5f, 0);
                    float f11 = m4298b - m3651V;
                    float f12 = 1.0f - max2;
                    int max4 = Math.max(0, Math.round(f11 - (27.0f * f12)));
                    if (max2 <= 0.001f) {
                        ImageView m3647S0 = m3647S0();
                        if (m3647S0 == null || m3647S0.getWidth() <= 0 || m3647S0.getHeight() <= 0) {
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
                            float m3709v1 = m3709v1();
                            float f15 = this.f7372f1;
                            float m149c = AbstractC0062j.m149c(m3709v1, f15, max3, f15);
                            f3 = f12;
                            f4 = f8;
                            float width = (((m3647S0.getWidth() * m149c) - f9) * 0.5f) + AbstractC0062j.m149c(1.0f, m149c, m3647S0.getWidth(), m3647S0.getLeft()) + 110.0f;
                            float height = (m3647S0.getHeight() * m149c) + m3647S0.getTop() + 23.0f + 70.0f;
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
                    view2 = this.f7395n0;
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
                        this.f7395n0.setLayoutParams(c1592d);
                        f5 = 0.0f;
                        float max7 = (Math.max(0.0f, Math.min(1.0f, max2)) * (-0.19999999f)) + 1.0f;
                        this.f7395n0.setPivotX(z4 ? 0.5f * f4 : 0.0f);
                        this.f7395n0.setPivotY(0.0f);
                        this.f7395n0.setScaleX(max7);
                        this.f7395n0.setScaleY(max7);
                        this.f7395n0.setTranslationX(0.0f);
                        this.f7395n0.setTranslationY(0.0f);
                    }
                    view3 = this.f7395n0;
                    if (view3 != null) {
                        view3.setTranslationX((-15.0f) * max2);
                        this.f7395n0.setTranslationY(f5);
                    }
                    if (this.f7331O != null) {
                        this.f7331O.setTranslationX((m3616C1() ? -50.0f : (-20.0f) * f3) - (7.0f * max3));
                        this.f7331O.setTranslationY(max3 * (-40.0f));
                    }
                    if (this.f7341T == null) {
                        if (m3616C1()) {
                            f6 = m3678l0() ? -235.0f : -215.0f;
                        } else {
                            f6 = ((z4 ? f5 : max2 * (-10.0f)) - (max2 * 15.0f)) - (f3 * 10.0f);
                        }
                        this.f7341T.setTranslationX(f6 - (20.0f * max3));
                        this.f7341T.setTranslationY(max3 * (-40.0f));
                        this.f7341T.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
        }
        i4 = 470;
        float f82 = i4;
        float f92 = f82 * f7;
        float f102 = m3651V * f7;
        int m4298b2 = AbstractC1561o.m4298b(i2, i3, 40, 0);
        int i82 = i - i4;
        int m152f2 = AbstractC0062j.m152f(i82, 0.5f, 0);
        float f112 = m4298b2 - m3651V;
        float f122 = 1.0f - max2;
        int max42 = Math.max(0, Math.round(f112 - (27.0f * f122)));
        if (max2 <= 0.001f) {
        }
        int round2 = m152f2 - Math.round(550.0f * max3);
        view2 = this.f7395n0;
        if (view2 != null) {
        }
        view3 = this.f7395n0;
        if (view3 != null) {
        }
        if (this.f7331O != null) {
        }
        if (this.f7341T == null) {
        }
    }

    /* renamed from: v0 */
    public final RectF m3708v0() {
        Rect m4239u = AbstractC1539g1.m4239u();
        ViewGroup viewGroup = this.f7373g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f7373g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4208b0(m4239u, this.f7373g.getWidth(), this.f7373g.getHeight());
    }

    /* renamed from: v1 */
    public final float m3709v1() {
        ImageView m3690p0 = m3690p0();
        if (m3690p0 == null) {
            m3690p0 = m3647S0();
        }
        float f2 = this.f7361c.getResources().getDisplayMetrics().density * 87.0f;
        float width = (m3690p0 == null || m3690p0.getWidth() <= 0) ? 730.0f : m3690p0.getWidth();
        return Math.max(0.2f, (width - f2) / width);
    }

    /* renamed from: w */
    public final void m3710w() {
        m3716y();
        boolean m3655a0 = m3655a0();
        ImageView m3690p0 = m3690p0();
        cfgData cfgdata = this.f7364d;
        boolean z2 = cfgdata.f2636h2;
        ImageView imageView = z2 ? this.f7409s : this.f7406r;
        TextView textView = z2 ? this.f7365d0 : this.f7362c0;
        m3606i1(m3690p0, m3655a0);
        m3606i1(imageView, m3655a0);
        m3665f1(imageView, m3655a0);
        ImageView imageView2 = null;
        m3606i1(textView, m3655a0 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m3690p0 == this.f7400p) {
            imageView2 = this.f7411t;
        } else if (m3690p0 == this.f7403q) {
            imageView2 = this.f7413u;
        }
        m3606i1(imageView2, m3655a0);
        m3664e1(m3690p0, m3655a0);
        if (!m3655a0) {
            m3635L0();
        } else if (m3684n0()) {
            m3675k(m3690p0, imageView, textView, m3693q0(), false, this.f7372f1, 0.0f, 0.0f);
            m3700s1(m3690p0, this.f7372f1, false, 0.0f, 0.0f);
        } else {
            m3635L0();
            m3700s1(m3690p0, 1.0f, false, 0.0f, 0.0f);
        }
        m3692q(false);
        m3614C();
        m3670h0();
        m3713x();
    }

    /* renamed from: w0 */
    public final void m3711w0() {
        float f2 = this.f7361c.getResources().getDisplayMetrics().density * 6.0f;
        m3596Y0(this.f7400p, f2);
        m3596Y0(this.f7403q, f2);
        m3596Y0(this.f7406r, f2);
        m3596Y0(this.f7409s, f2);
        for (ImageView imageView : this.f7419x) {
            m3596Y0(imageView, f2);
        }
        for (ImageView imageView2 : this.f7421y) {
            m3596Y0(imageView2, f2);
        }
        m3596Y0(this.f7411t, f2);
        m3596Y0(this.f7413u, f2);
        m3596Y0(this.f7362c0, f2);
        m3596Y0(this.f7365d0, f2);
        m3596Y0(this.f7325L, f2);
        m3596Y0(this.f7345V, f2);
        m3596Y0(this.f7327M, f2);
        m3596Y0(this.f7329N, f2);
        m3596Y0(this.f7341T, f2);
        m3596Y0(this.f7395n0, f2);
        m3596Y0(this.f7392m0, f2);
        m3596Y0(this.f7323K, f2);
        m3596Y0(this.f7347W, f2);
        m3596Y0(this.f7385k, 2.0f);
        m3596Y0(this.f7388l, 2.0f);
        m3596Y0(this.f7391m, 2.0f);
        m3596Y0(this.f7397o, 0.0f);
    }

    /* renamed from: w1 */
    public final float m3712w1() {
        float m3709v1 = m3709v1();
        if (Math.abs(m3709v1 - 1.0f) < 0.001f) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (1.0f - this.f7372f1) / (1.0f - m3709v1)));
    }

    /* renamed from: x */
    public final void m3713x() {
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f7327M == null || (imageView = this.f7400p) == null) {
            return;
        }
        if (imageView.getWidth() <= 0) {
            this.f7400p.post(new RunnableC1585y0(this, 18));
            return;
        }
        ImageView imageView2 = this.f7400p;
        boolean z2 = imageView2 == m3647S0();
        float f5 = this.f7372f1;
        if (z2 && m3682m1()) {
            float[] fArr = new float[2];
            m3659c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m3684n0()) {
                f5 = this.f7372f1 * (1.0f - this.f7342T0);
            }
            f2 = f5;
            f4 = f7;
            f3 = f6;
        } else {
            f2 = f5;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        float m3631J0 = m3631J0(f2);
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m3589P0(this.f7327M, m3631J0, 0.0f);
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m3604f0(imageView2, f2, z2, fArr2, fArr3);
        m3588I(this.f7327M, f2, fArr2[0], fArr2[1], f3, f4, m3631J0 + fArr3[0], fArr3[1]);
    }

    /* renamed from: x0 */
    public final void m3714x0() {
        float max;
        float m1789h;
        float f2;
        int i;
        AbstractC1539g1.m4228l0(this.f7373g, !this.f7328M0);
        C1572s c1572s = this.f7316G0;
        c1572s.f8681g = Math.max(c1572s.f8676b, Math.min(c1572s.f8677c, m3663e0()));
        C1572s c1572s2 = this.f7318H0;
        c1572s2.f8681g = Math.max(c1572s2.f8676b, Math.min(c1572s2.f8677c, m3661d0()));
        float m3663e0 = m3663e0();
        float m3661d0 = m3661d0();
        TextView textView = this.f7362c0;
        cfgData cfgdata = this.f7364d;
        int i2 = f7300s1;
        if (textView != null) {
            textView.setTextColor(m3663e0 > cfgdata.f2568S1 ? -65536 : m3663e0 > cfgdata.f2564R1 ? -256 : i2);
            this.f7362c0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m3663e0)).replace(",", "."));
        }
        TextView textView2 = this.f7365d0;
        if (textView2 != null) {
            textView2.setTextColor(m3661d0 > cfgdata.f2576U1 ? -65536 : m3661d0 > cfgdata.f2572T1 ? -256 : i2);
            this.f7365d0.setText(AbstractC1256E0.m2986A(m3661d0));
        }
        m3628H0();
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f7367e;
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
        C1572s c1572s3 = this.f7320I0;
        if (c1572s3 != null) {
            c1572s3.f8681g = Math.max(c1572s3.f8676b, Math.min(c1572s3.f8677c, f2));
        }
        TextView textView3 = this.f7325L;
        if (textView3 != null) {
            m3594X0(textView3, m1789h, "L", max < 15.0f ? -65536 : max < 30.0f ? -256 : i2);
        }
        int i3 = max < 15.0f ? -65536 : max < 30.0f ? -256 : i2;
        if (this.f7327M != null) {
            if (!m3655a0() || cfgdata.f2543M0.f7147f) {
                this.f7327M.setVisibility(4);
            } else {
                this.f7327M.setVisibility(0);
                float m1777w = cardata.m1777w();
                if (m1777w < 0.0f) {
                    SpannableString spannableString = new SpannableString("--km");
                    spannableString.setSpan(AbstractC0062j.m155i(this.f7327M, -7829368, i3), 0, 2, 33);
                    this.f7327M.setText(spannableString);
                } else {
                    m3594X0(this.f7327M, m1777w, "km", i3);
                }
            }
        }
        float m1743d = cardata.m1743d();
        C1572s c1572s4 = this.f7322J0;
        if (c1572s4 != null) {
            float f4 = c1572s4.f8676b;
            float f5 = c1572s4.f8677c;
            if (m1743d < -90.0f) {
                c1572s4.f8681g = Math.max(f4, Math.min(f5, 40.0f));
            } else {
                c1572s4.f8681g = Math.max(f4, Math.min(f5, m1743d));
            }
        }
        TextView textView4 = this.f7345V;
        if (textView4 != null) {
            if (m1743d < -90.0f) {
                textView4.setText("--°C");
                this.f7345V.setTextColor(-7829368);
            } else {
                if (m1743d < 40.0f) {
                    i2 = -16776961;
                } else if (m1743d > 112.0f) {
                    i2 = -65536;
                } else if (m1743d > 107.0f) {
                    i2 = -256;
                }
                m3594X0(textView4, m1743d, "°C", i2);
                m3687o0();
            }
        }
        float m1765o = cardata.m1765o();
        TextView textView5 = this.f7305B;
        if (textView5 != null) {
            textView5.setTextColor(-1);
            this.f7305B.setText(m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L");
        }
        if (this.f7307C != null) {
            this.f7307C.setText(this.f7358b.getContext().getString((cardata.m1780z() > 0.0f ? 1 : (cardata.m1780z() == 0.0f ? 0 : -1)) > 0 ? R.string.ip_theme_41_inst_fuel_unit_l100 : R.string.ip_theme_41_inst_fuel_unit_lph));
        }
        m3600b1(this.f7311E, cardata.m1739b());
        m3600b1(this.f7317H, cardata.m1737a());
        m3720z0();
        m3624F0();
        if (this.f7343U != null) {
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
            this.f7343U.setText(spannableStringBuilder);
        }
        m3626G0();
        m3621E0();
        m3615C0();
        TextView textView6 = this.f7351Y;
        if (textView6 == null) {
            return;
        }
        textView6.setText(AbstractC1372y1.m3307m(this.f7361c));
    }

    /* renamed from: x1 */
    public final void m3715x1(boolean z2) {
        this.f7370f.removeCallbacks(this.f7338R0);
        if (z2 && AbstractC1372y1.m3272C()) {
            m3639N0();
            return;
        }
        if (!m3676k0()) {
            m3639N0();
            return;
        }
        m3636M();
        if (z2) {
            AbstractC1372y1.m3287R(true, true);
            m3638N();
            this.f7330N0 = false;
            this.f7342T0 = 0.0f;
            if (m3674j0()) {
                m3610A1();
            } else {
                m3717y0();
            }
            m3710w();
            m3688o1(0.0f, 1.0f, new RunnableC1585y0(this, 16));
            return;
        }
        if (m3682m1() && this.f7342T0 > 0.0f) {
            m3710w();
            m3688o1(this.f7342T0, 0.0f, new RunnableC1585y0(this, 17));
        } else {
            this.f7330N0 = true;
            this.f7342T0 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m3630J();
        }
    }

    /* renamed from: y */
    public final void m3716y() {
        boolean z2;
        boolean z3 = m3655a0() && (((z2 = this.f7330N0) && this.f7342T0 <= 0.0f) || z2 || this.f7342T0 < 1.0f);
        ImageView m3647S0 = m3647S0();
        cfgData cfgdata = this.f7364d;
        boolean z4 = cfgdata.f2636h2;
        ImageView imageView = z4 ? this.f7406r : this.f7409s;
        TextView textView = z4 ? this.f7362c0 : this.f7365d0;
        m3606i1(m3647S0, z3);
        m3606i1(imageView, z3);
        m3665f1(imageView, z3);
        ImageView imageView2 = null;
        m3606i1(textView, z3 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m3647S0 == this.f7400p) {
            imageView2 = this.f7411t;
        } else if (m3647S0 == this.f7403q) {
            imageView2 = this.f7413u;
        }
        m3606i1(imageView2, z3);
        m3664e1(m3647S0, z3);
        if (!z3) {
            m3641O0();
            return;
        }
        if (m3684n0()) {
            float[] fArr = new float[2];
            m3659c0(fArr);
            float f2 = (1.0f - this.f7342T0) * this.f7372f1;
            m3675k(m3647S0, imageView, textView, m3649T0(), true, f2, fArr[0], fArr[1]);
            m3700s1(m3647S0, f2, true, fArr[0], fArr[1]);
            return;
        }
        boolean z5 = this.f7330N0;
        float f3 = (!z5 || this.f7342T0 > 0.0f) ? this.f7342T0 : 0.0f;
        float max = (!z5 || this.f7342T0 > 0.0f) ? Math.max(0.0f, 1.0f - this.f7342T0) : 1.0f;
        if (f3 <= 0.0f && Math.abs(max - 1.0f) < 0.001f) {
            m3641O0();
            m3700s1(m3647S0, 1.0f, true, 0.0f, 0.0f);
            return;
        }
        ImageView m3647S02 = m3647S0();
        if (m3647S02 != null) {
            if (m3647S02.getWidth() <= 0 || m3647S02.getHeight() <= 0) {
                m3647S02.post(new RunnableC1585y0(this, 22));
            } else {
                float[] fArr2 = {this.f7348W0 ? this.f7344U0 : m3647S02.getLeft() + (m3647S02.getWidth() * 0.5f), this.f7348W0 ? this.f7346V0 : (m3647S02.getHeight() * 0.5f) + m3647S02.getTop()};
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float[] fArr3 = new float[2];
                m3659c0(fArr3);
                boolean z6 = cfgdata.f2636h2;
                ImageView imageView3 = z6 ? this.f7406r : this.f7409s;
                TextView textView2 = z6 ? this.f7362c0 : this.f7365d0;
                float m3649T0 = m3649T0();
                float f6 = max;
                m3588I(m3647S02, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
                m3704u(imageView3, m3647S02, max, f4, f5, fArr3[0], fArr3[1]);
                m3588I(textView2, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, m3649T0);
                m3706u1(m3647S02, max, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
            }
        }
        m3700s1(m3647S0, max, true, 0.0f, 0.0f);
    }

    /* renamed from: y0 */
    public final void m3717y0() {
        C1525c c1525c;
        if (this.f7373g == null) {
            return;
        }
        try {
            if (!this.f7364d.f2561Q2 && !m3678l0()) {
                m3643Q();
                return;
            }
            if (!m3613B1()) {
                if (m3674j0()) {
                    m3646S();
                }
                ViewGroup viewGroup = this.f7373g;
                if (viewGroup != null) {
                    viewGroup.setLayerType(0, null);
                }
                View view = this.f7376h;
                if (view != null) {
                    view.setVisibility(8);
                }
                m3719z();
                return;
            }
            if (!m3674j0()) {
                m3683n();
                m3701t();
                return;
            }
            C1574t m3644Q0 = m3644Q0();
            if (m3694q1()) {
                C1525c c1525c2 = this.f7399o1;
                if (c1525c2 != null && c1525c2.m4161c()) {
                    m3672i0();
                    m3686o();
                }
            } else if (m3644Q0.m4472a() && (c1525c = this.f7399o1) != null && !c1525c.m4161c()) {
                m3683n();
                return;
            }
            m3701t();
            m3610A1();
        } finally {
            m3620E();
        }
    }

    /* renamed from: y1 */
    public final ImageView[] m3718y1(ImageView imageView) {
        if (imageView == this.f7406r) {
            return this.f7419x;
        }
        if (imageView == this.f7409s) {
            return this.f7421y;
        }
        return null;
    }

    /* renamed from: z */
    public final void m3719z() {
        ViewGroup viewGroup = this.f7373g;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        if (this.f7397o == null) {
            ViewGroup viewGroup2 = this.f7373g;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(m3677k1() ? -15068660 : -16777216);
                return;
            }
            return;
        }
        C1574t m3644Q0 = m3644Q0();
        this.f7397o.setVisibility(0);
        this.f7397o.setLayerType(0, null);
        this.f7397o.setTranslationY(0.0f);
        this.f7397o.setBackground(null);
        if (!m3644Q0.m4472a()) {
            this.f7397o.setImageDrawable(null);
            this.f7397o.setBackgroundResource(R.drawable.ip_theme_49_bg);
            return;
        }
        int i = m3644Q0.f8687b;
        if (i != 0) {
            this.f7397o.setImageResource(i);
            return;
        }
        Uri uri = m3644Q0.f8688c;
        if (uri != null) {
            this.f7397o.setImageURI(uri);
        }
    }

    /* renamed from: z0 */
    public final void m3720z0() {
        TextView textView = this.f7347W;
        if (textView == null) {
            return;
        }
        textView.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(this.f7367e.m1741c())));
        m3687o0();
    }

    /* renamed from: z1 */
    public final void m3721z1() {
        cfgData cfgdata = this.f7364d;
        int i = (cfgdata.f2537K2 && cfgdata.f2589X2 && m3655a0() && !AbstractC1539g1.m4194P(cfgdata, this.f7367e)) ? 0 : 8;
        ImageView imageView = this.f7386k0;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.f7389l0;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
    }
}
