package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import com.altaysoft.t500_split.p061ip.Theme40NeedleHaloView;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.File;
import java.util.Locale;
import p000A.AbstractC0000a;
import p001A0.RunnableC0018l;
import p006C.AbstractC0062j;
import p017H0.RunnableC0123b;
import p022K.C0174W;
import p022K.C0181b0;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1353s0;
import p098q0.AbstractC1372y1;
import p098q0.C1253D0;
import p098q0.C1311e0;
import p106t0.EnumC1455a;
import p106t0.EnumC1457c;
import p111v.C1592d;

/* renamed from: u0.u */
/* loaded from: classes.dex */
public final class C1576u {

    /* renamed from: G1 */
    public static final int f8691G1 = Color.rgb(244, 246, 248);

    /* renamed from: H1 */
    public static final int f8692H1 = R.drawable.theme_40_spd;

    /* renamed from: I1 */
    public static final int f8693I1 = R.drawable.theme_40_rpm;

    /* renamed from: J1 */
    public static final int f8694J1 = R.drawable.theme_40_needle;

    /* renamed from: A */
    public View f8695A;

    /* renamed from: A0 */
    public ImageView f8696A0;

    /* renamed from: A1 */
    public float f8697A1;

    /* renamed from: B */
    public Theme40NeedleHaloView f8698B;

    /* renamed from: B0 */
    public ImageView f8699B0;

    /* renamed from: C */
    public Theme40NeedleHaloView f8701C;

    /* renamed from: C0 */
    public View f8702C0;

    /* renamed from: C1 */
    public C1525c f8703C1;

    /* renamed from: D */
    public ImageView f8704D;

    /* renamed from: D0 */
    public View f8705D0;

    /* renamed from: E */
    public ImageView f8707E;

    /* renamed from: E0 */
    public View f8708E0;

    /* renamed from: F0 */
    public View f8711F0;

    /* renamed from: G0 */
    public int f8714G0;

    /* renamed from: H0 */
    public ImageView f8716H0;

    /* renamed from: I0 */
    public TextView f8718I0;

    /* renamed from: J */
    public TextView f8719J;

    /* renamed from: J0 */
    public TextView f8720J0;

    /* renamed from: K */
    public TextView f8721K;

    /* renamed from: K0 */
    public TextView f8722K0;

    /* renamed from: L */
    public TextView f8723L;

    /* renamed from: L0 */
    public TextView f8724L0;

    /* renamed from: M */
    public TextView f8725M;

    /* renamed from: M0 */
    public ProgressBar f8726M0;

    /* renamed from: N */
    public TextView f8727N;

    /* renamed from: N0 */
    public long f8728N0;

    /* renamed from: O */
    public TextView f8729O;

    /* renamed from: O0 */
    public long f8730O0;

    /* renamed from: P */
    public TextView f8731P;

    /* renamed from: P0 */
    public boolean f8732P0;

    /* renamed from: Q */
    public TextView f8733Q;

    /* renamed from: Q0 */
    public long f8734Q0;

    /* renamed from: R */
    public TextView f8735R;

    /* renamed from: S */
    public View f8737S;

    /* renamed from: T */
    public TextView f8739T;

    /* renamed from: T0 */
    public float f8740T0;

    /* renamed from: U */
    public TextView f8741U;

    /* renamed from: U0 */
    public boolean f8742U0;

    /* renamed from: V */
    public TextView f8743V;

    /* renamed from: V0 */
    public C1531e f8744V0;

    /* renamed from: W */
    public ProgressBar f8745W;

    /* renamed from: W0 */
    public C1572s f8746W0;

    /* renamed from: X */
    public View f8747X;

    /* renamed from: X0 */
    public C1572s f8748X0;

    /* renamed from: Y */
    public TextView f8749Y;

    /* renamed from: Y0 */
    public C1572s f8750Y0;

    /* renamed from: Z */
    public TextView f8751Z;

    /* renamed from: Z0 */
    public C1572s f8752Z0;

    /* renamed from: a */
    public final C1537g f8753a;

    /* renamed from: a0 */
    public View f8754a0;

    /* renamed from: a1 */
    public boolean f8755a1;

    /* renamed from: b */
    public final View f8756b;

    /* renamed from: b0 */
    public ViewGroup f8757b0;

    /* renamed from: b1 */
    public boolean f8758b1;

    /* renamed from: c */
    public final Context f8759c;

    /* renamed from: c0 */
    public TextView f8760c0;

    /* renamed from: d0 */
    public TextView f8763d0;

    /* renamed from: e0 */
    public TextView f8766e0;

    /* renamed from: e1 */
    public ValueAnimator f8767e1;

    /* renamed from: f0 */
    public ViewGroup f8769f0;

    /* renamed from: f1 */
    public ValueAnimator f8770f1;

    /* renamed from: g */
    public ViewGroup f8771g;

    /* renamed from: g0 */
    public TextView f8772g0;

    /* renamed from: g1 */
    public boolean f8773g1;

    /* renamed from: h */
    public View f8774h;

    /* renamed from: h0 */
    public TextView f8775h0;

    /* renamed from: i */
    public View f8777i;

    /* renamed from: i0 */
    public TextView f8778i0;

    /* renamed from: j */
    public View f8780j;

    /* renamed from: j0 */
    public ProgressBar f8781j0;

    /* renamed from: k */
    public View f8783k;

    /* renamed from: k0 */
    public View f8784k0;

    /* renamed from: k1 */
    public float f8785k1;

    /* renamed from: l */
    public View f8786l;

    /* renamed from: l0 */
    public TextView f8787l0;

    /* renamed from: l1 */
    public float f8788l1;

    /* renamed from: m */
    public View f8789m;

    /* renamed from: m0 */
    public TextView f8790m0;

    /* renamed from: m1 */
    public boolean f8791m1;

    /* renamed from: n */
    public C1528d f8792n;

    /* renamed from: n0 */
    public TextView f8793n0;

    /* renamed from: n1 */
    public Boolean f8794n1;

    /* renamed from: o */
    public ImageView f8795o;

    /* renamed from: o0 */
    public TextView f8796o0;

    /* renamed from: o1 */
    public Boolean f8797o1;

    /* renamed from: p */
    public ImageView f8798p;

    /* renamed from: p0 */
    public TextView f8799p0;

    /* renamed from: p1 */
    public float f8800p1;

    /* renamed from: q */
    public ImageView f8801q;

    /* renamed from: q0 */
    public ImageView f8802q0;

    /* renamed from: q1 */
    public float f8803q1;

    /* renamed from: r */
    public ImageView f8804r;

    /* renamed from: r0 */
    public ImageView f8805r0;

    /* renamed from: r1 */
    public float f8806r1;

    /* renamed from: s */
    public ImageView f8807s;

    /* renamed from: s0 */
    public TextView f8808s0;

    /* renamed from: s1 */
    public float f8809s1;

    /* renamed from: t */
    public Theme40NeedleHaloView f8810t;

    /* renamed from: t0 */
    public TextView f8811t0;

    /* renamed from: u */
    public Theme40NeedleHaloView f8813u;

    /* renamed from: u0 */
    public TextView f8814u0;

    /* renamed from: v */
    public ImageView f8816v;

    /* renamed from: v0 */
    public TextView f8817v0;

    /* renamed from: w */
    public ImageView f8819w;

    /* renamed from: w0 */
    public View f8820w0;

    /* renamed from: w1 */
    public ValueAnimator f8821w1;

    /* renamed from: x */
    public Bitmap f8822x;

    /* renamed from: x0 */
    public ImageView f8823x0;

    /* renamed from: x1 */
    public boolean f8824x1;

    /* renamed from: y */
    public Bitmap f8825y;

    /* renamed from: y0 */
    public TextView f8826y0;

    /* renamed from: z */
    public View f8828z;

    /* renamed from: z0 */
    public ImageView f8829z0;

    /* renamed from: z1 */
    public Boolean f8830z1;

    /* renamed from: d */
    public final cfgData f8762d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f8765e = carData.getInstance();

    /* renamed from: f */
    public final Handler f8768f = new Handler(Looper.getMainLooper());

    /* renamed from: F */
    public ImageView[] f8710F = new ImageView[0];

    /* renamed from: G */
    public ImageView[] f8713G = new ImageView[0];

    /* renamed from: H */
    public final float[] f8715H = new float[0];

    /* renamed from: I */
    public final float[] f8717I = new float[0];

    /* renamed from: R0 */
    public float f8736R0 = -1.0f;

    /* renamed from: S0 */
    public float f8738S0 = -1.0f;

    /* renamed from: c1 */
    public boolean f8761c1 = true;

    /* renamed from: d1 */
    public boolean f8764d1 = true;

    /* renamed from: h1 */
    public final RunnableC1543i f8776h1 = new RunnableC1543i(this, 0);

    /* renamed from: i1 */
    public boolean f8779i1 = false;

    /* renamed from: j1 */
    public float f8782j1 = 0.0f;

    /* renamed from: t1 */
    public float f8812t1 = 1.0f;

    /* renamed from: u1 */
    public float f8815u1 = 0.0f;

    /* renamed from: v1 */
    public float f8818v1 = 0.0f;

    /* renamed from: y1 */
    public int f8827y1 = -1;

    /* renamed from: B1 */
    public int f8700B1 = 999;

    /* renamed from: D1 */
    public final RunnableC1570r f8706D1 = new RunnableC1570r(this, 0);

    /* renamed from: E1 */
    public final RunnableC1570r f8709E1 = new RunnableC1570r(this, 1);

    /* renamed from: F1 */
    public final RunnableC1570r f8712F1 = new RunnableC1570r(this, 2);

    public C1576u(C1537g c1537g, View view) {
        this.f8753a = c1537g;
        this.f8756b = view;
        this.f8759c = view.getContext();
    }

    /* renamed from: D */
    public static void m4473D(View view, float f2, float f3) {
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

    /* renamed from: K */
    public static void m4474K(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    public static void m4475N0(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    /* renamed from: T */
    public static ImageView[] m4476T(ImageView imageView) {
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

    /* renamed from: T0 */
    public static RectF m4477T0(RectF rectF, float f2) {
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

    /* renamed from: U0 */
    public static void m4478U0(View view, boolean z2, float f2) {
        Drawable background;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        Drawable mutate = background.mutate();
        view.setBackground(mutate);
        if (mutate instanceof LayerDrawable) {
            mutate = ((LayerDrawable) mutate).getDrawable(0);
        }
        if (mutate instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) mutate;
            if (z2) {
                gradientDrawable.setCornerRadii(new float[]{14.0f, 14.0f, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                gradientDrawable.setCornerRadii(new float[]{f2, f2, 14.0f, 14.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
        }
    }

    /* renamed from: V0 */
    public static void m4479V0(View view, int i) {
        if (view == null || !(view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: W0 */
    public static void m4480W0(View view, float f2) {
        if (view != null) {
            view.setElevation(f2);
        }
    }

    /* renamed from: X0 */
    public static void m4481X0(View view, int i) {
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

    /* renamed from: Y0 */
    public static void m4482Y0(TextView textView, float f2) {
        m4487d1(textView, f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L", " L", -1);
    }

    /* renamed from: Z0 */
    public static void m4483Z0(TextView textView, float f2, float f3) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, f2 * f3);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(0.0f, 1.0f);
        AbstractC1539g1.m4203Y(textView);
    }

    /* renamed from: a */
    public static void m4484a(C1576u c1576u, ImageView[] imageViewArr, float[] fArr, float f2, float f3) {
        c1576u.getClass();
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
    public static void m4485a1(View view, int i) {
        if (view != null) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: c0 */
    public static String m4486c0(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: d1 */
    public static void m4487d1(TextView textView, String str, String str2, int i) {
        if (textView == null || str == null) {
            return;
        }
        textView.setTextColor(i);
        if (str2 == null || str2.isEmpty()) {
            textView.setText(str);
            return;
        }
        int lastIndexOf = str.lastIndexOf(str2);
        if (lastIndexOf < 0) {
            textView.setText(str);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-9733494), lastIndexOf, str.length(), 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: e1 */
    public static void m4488e1(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4489f(View view, float f2) {
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
    public static void m4490f1(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: k */
    public static void m4491k(View view, ImageView imageView, boolean z2) {
        if (view == null || imageView == null) {
            return;
        }
        view.setPivotX(imageView.getPivotX());
        view.setPivotY(imageView.getPivotY());
        if (z2) {
            view.setRotation(imageView.getRotation());
        }
        view.setScaleX(imageView.getScaleX());
        view.setScaleY(imageView.getScaleY());
        view.setTranslationX(imageView.getTranslationX());
        view.setTranslationY(imageView.getTranslationY());
        view.setVisibility(imageView.getVisibility());
    }

    /* renamed from: o */
    public static void m4492o(ImageView imageView, boolean z2) {
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

    /* renamed from: r0 */
    public static int m4493r0(int i, float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        return Color.argb(AbstractC0062j.m150d(Color.alpha(0) - Color.alpha(i), max, Color.alpha(i)), AbstractC0062j.m150d(Color.red(0) - Color.red(i), max, Color.red(i)), AbstractC0062j.m150d(Color.green(0) - Color.green(i), max, Color.green(i)), AbstractC0062j.m150d(Color.blue(0) - Color.blue(i), max, Color.blue(i)));
    }

    /* renamed from: A */
    public final void m4494A() {
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f8749Y == null || (imageView = this.f8798p) == null) {
            return;
        }
        if (imageView.getWidth() <= 0) {
            this.f8798p.post(new RunnableC1543i(this, 12));
            return;
        }
        ImageView imageView2 = this.f8798p;
        boolean z2 = imageView2 == m4529R0();
        float f5 = this.f8812t1;
        if (z2 && m4557i1()) {
            float[] fArr = new float[2];
            m4548f0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m4572o0()) {
                f5 = this.f8812t1 * (1.0f - this.f8782j1);
            }
            f2 = f5;
            f4 = f7;
            f3 = f6;
        } else {
            f2 = f5;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        float f8 = this.f8809s1;
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m4475N0(this.f8749Y, f8, 0.0f);
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m4550g0(imageView2, f2, z2, fArr2, fArr3);
        m4474K(this.f8749Y, f2, fArr2[0], fArr2[1], f3, f4, f8 + fArr3[0], fArr3[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4495A0(int i) {
        int i2;
        Theme40NeedleHaloView theme40NeedleHaloView;
        Theme40NeedleHaloView theme40NeedleHaloView2;
        Theme40NeedleHaloView theme40NeedleHaloView3;
        Theme40NeedleHaloView theme40NeedleHaloView4;
        C1253D0 c1253d0;
        if (this.f8762d.f2641i2) {
            if (i == 1) {
                i2 = -3838354;
            } else if (i == 2) {
                i2 = -9790864;
            }
            theme40NeedleHaloView = this.f8810t;
            if (theme40NeedleHaloView != null) {
                theme40NeedleHaloView.setFillColor(i2);
            }
            theme40NeedleHaloView2 = this.f8813u;
            if (theme40NeedleHaloView2 != null) {
                theme40NeedleHaloView2.setFillColor(i2);
            }
            theme40NeedleHaloView3 = this.f8698B;
            if (theme40NeedleHaloView3 != null) {
                theme40NeedleHaloView3.setFillColor(i2);
            }
            theme40NeedleHaloView4 = this.f8701C;
            if (theme40NeedleHaloView4 != null) {
                theme40NeedleHaloView4.setFillColor(i2);
            }
            m4504E(m4590u1());
            c1253d0 = AbstractC1372y1.f6444n;
            if (c1253d0 == null && c1253d0.f5620W) {
                cfgData m1784i = cfgData.m1784i();
                C1253D0 c1253d02 = AbstractC1372y1.f6444n;
                float m3281L = AbstractC1372y1.m3281L(m1784i.f2620e1);
                if (c1253d02.f5620W && c1253d02.f5630d != null && c1253d02.f5641i0) {
                    c1253d02.m2965c(m3281L);
                    return;
                }
                return;
            }
        }
        i2 = -16730881;
        theme40NeedleHaloView = this.f8810t;
        if (theme40NeedleHaloView != null) {
        }
        theme40NeedleHaloView2 = this.f8813u;
        if (theme40NeedleHaloView2 != null) {
        }
        theme40NeedleHaloView3 = this.f8698B;
        if (theme40NeedleHaloView3 != null) {
        }
        theme40NeedleHaloView4 = this.f8701C;
        if (theme40NeedleHaloView4 != null) {
        }
        m4504E(m4590u1());
        c1253d0 = AbstractC1372y1.f6444n;
        if (c1253d0 == null) {
        }
    }

    /* renamed from: A1 */
    public final boolean m4496A1() {
        return m4567m0() || m4570n0() || m4572o0() || this.f8762d.f2635h1 == 2;
    }

    /* renamed from: B */
    public final void m4497B() {
        boolean z2;
        boolean z3 = m4545d0() && (((z2 = this.f8764d1) && this.f8782j1 <= 0.0f) || z2 || this.f8782j1 < 1.0f);
        ImageView m4529R0 = m4529R0();
        cfgData cfgdata = this.f8762d;
        boolean z4 = cfgdata.f2636h2;
        ImageView imageView = z4 ? this.f8804r : this.f8807s;
        TextView textView = z4 ? this.f8808s0 : this.f8811t0;
        m4490f1(m4529R0, z3);
        m4490f1(imageView, z3);
        m4543c1(imageView, z3);
        m4490f1(textView, z3 && AbstractC1539g1.m4220h0(cfgdata, null));
        m4490f1(this.f8704D, false);
        m4490f1(this.f8707E, false);
        m4541b1(m4529R0, z3);
        if (!z3) {
            m4520M0();
            return;
        }
        float[] fArr = new float[2];
        m4548f0(fArr);
        m4569n(m4529R0, imageView, textView, m4531S0(), true, (1.0f - this.f8782j1) * this.f8812t1, fArr[0], fArr[1]);
    }

    /* renamed from: B0 */
    public final void m4498B0() {
        TextView textView = this.f8793n0;
        if (textView == null) {
            return;
        }
        if (!this.f8762d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f8765e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f8793n0.setVisibility(4);
            return;
        }
        this.f8793n0.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f8793n0, -7829368, -1), 0, replace.length(), 33);
        this.f8793n0.setText(spannableString);
    }

    /* renamed from: B1 */
    public final boolean m4499B1() {
        return m4572o0() || this.f8762d.f2635h1 == 2 || this.f8815u1 > 0.001f || this.f8818v1 > 0.001f || this.f8812t1 < m4587t1() - 0.001f;
    }

    /* renamed from: C */
    public final void m4500C() {
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        if (this.f8795o == null) {
            ViewGroup viewGroup2 = this.f8771g;
            if (viewGroup2 != null) {
                m4551g1();
                viewGroup2.setBackgroundColor(-16777216);
                return;
            }
            return;
        }
        C1574t m4527Q0 = m4527Q0();
        this.f8795o.setVisibility(0);
        this.f8795o.setLayerType(0, null);
        this.f8795o.setTranslationY(0.0f);
        this.f8795o.setBackground(null);
        if (!m4527Q0.m4472a()) {
            this.f8795o.setImageDrawable(null);
            this.f8795o.setBackgroundResource(R.drawable.ip_theme_40_bg);
            return;
        }
        int i = m4527Q0.f8687b;
        if (i != 0) {
            this.f8795o.setImageResource(i);
            return;
        }
        Uri uri = m4527Q0.f8688c;
        if (uri != null) {
            this.f8795o.setImageURI(uri);
        }
    }

    /* renamed from: C0 */
    public final void m4501C0(C0636d c0636d) {
        View view = this.f8702C0;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        if (!this.f8762d.f2585W2 || m4553h0() || m4567m0() || c0636d == null || !c0636d.m1851a()) {
            this.f8702C0.setVisibility(8);
            this.f8702C0.setAlpha(1.0f);
            m4568m1();
            m4585t(false);
            return;
        }
        this.f8702C0.setVisibility(this.f8818v1 >= 0.999f ? 4 : 0);
        if (this.f8818v1 >= 0.999f) {
            this.f8702C0.setAlpha(0.0f);
        }
        TextView textView = this.f8718I0;
        if (textView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f8720J0;
        if (textView2 != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            this.f8720J0.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f8716H0;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f8716H0.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f8716H0.setVisibility(8);
            }
        }
        this.f8730O0 = c0636d.f3002h;
        this.f8728N0 = c0636d.f3001g;
        this.f8732P0 = c0636d.f3000f;
        this.f8734Q0 = SystemClock.elapsedRealtime();
        m4591v(this.f8728N0);
        m4568m1();
        m4585t(false);
    }

    /* renamed from: C1 */
    public final boolean m4502C1() {
        cfgData cfgdata = this.f8762d;
        int i = cfgdata.f2635h1;
        if (i == 0) {
            return true;
        }
        return i == 2 && AbstractC1539g1.m4194P(cfgdata, this.f8765e);
    }

    /* renamed from: D0 */
    public final void m4503D0() {
        ImageView imageView = this.f8802q0;
        carData cardata = this.f8765e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f8805r0 != null) {
            this.f8805r0.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f8805r0.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
    }

    /* renamed from: E */
    public final void m4504E(float f2) {
        int i;
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        cfgData cfgdata = this.f8762d;
        int m3251f = AbstractC1353s0.m3251f(cfgdata);
        if (max <= 0.001f) {
            m4555i(this.f8702C0, m3251f);
            m4555i(this.f8737S, m3251f);
            m4555i(this.f8754a0, m3251f);
            m4555i(this.f8769f0, m3251f);
            return;
        }
        int m1753i = this.f8765e.m1753i();
        if (cfgdata.f2641i2) {
            if (m1753i == 1) {
                i = -3838354;
            } else if (m1753i == 2) {
                i = -9790864;
            }
            int argb = Color.argb(51, Color.red(i), Color.green(i), Color.blue(i));
            int argb2 = Color.argb(153, Color.red(i), Color.green(i), Color.blue(i));
            int m4493r0 = m4493r0(argb, max);
            int m4493r02 = m4493r0(argb2, max);
            m4552h(this.f8702C0, m4493r0, m4493r02);
            m4552h(this.f8737S, m4493r0, m4493r02);
            m4552h(this.f8754a0, m4493r0, m4493r02);
            m4552h(this.f8769f0, m4493r0, m4493r02);
        }
        i = -16730881;
        int argb3 = Color.argb(51, Color.red(i), Color.green(i), Color.blue(i));
        int argb22 = Color.argb(153, Color.red(i), Color.green(i), Color.blue(i));
        int m4493r03 = m4493r0(argb3, max);
        int m4493r022 = m4493r0(argb22, max);
        m4552h(this.f8702C0, m4493r03, m4493r022);
        m4552h(this.f8737S, m4493r03, m4493r022);
        m4552h(this.f8754a0, m4493r03, m4493r022);
        m4552h(this.f8769f0, m4493r03, m4493r022);
    }

    /* renamed from: E0 */
    public final void m4505E0() {
        if (this.f8751Z == null) {
            return;
        }
        cfgData cfgdata = this.f8762d;
        if (!cfgdata.f2537K2 || m4553h0() || ((!m4545d0() && !m4567m0()) || (!cfgdata.f2569S2 && !cfgdata.f2577U2 && !cfgdata.f2573T2))) {
            this.f8751Z.setVisibility(8);
            m4568m1();
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = cfgdata.f2569S2;
        carData cardata = this.f8765e;
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
            this.f8751Z.setVisibility(8);
            m4568m1();
            return;
        }
        SpannableString spannableString = new SpannableString(sb2);
        this.f8751Z.setTextColor(-1);
        int indexOf = sb2.indexOf("ODO:");
        if (indexOf >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(-9733494), indexOf, indexOf + 4, 0);
        }
        int indexOf2 = sb2.indexOf("Day:");
        if (indexOf2 >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(-9733494), indexOf2, indexOf2 + 4, 0);
        }
        int indexOf3 = sb2.indexOf("Trip:");
        if (indexOf3 >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(-9733494), indexOf3, indexOf3 + 5, 0);
        }
        this.f8751Z.setText(spannableString, TextView.BufferType.SPANNABLE);
        this.f8751Z.setVisibility(0);
        m4568m1();
    }

    /* renamed from: F */
    public final void m4506F() {
        boolean m4499B1 = m4499B1();
        Boolean bool = this.f8830z1;
        if (bool == null || bool.booleanValue() != m4499B1) {
            this.f8830z1 = Boolean.valueOf(m4499B1);
            m4598x0();
        }
        if (m4499B1 && m4605z1()) {
            m4594w();
            m4602y1();
        } else if (!m4570n0() && !m4567m0() && !m4557i1()) {
            m4538a0();
        }
        float m4297a = m4499B1 ? AbstractC1561o.m4297a(1.0f, this.f8818v1, 0.0f, this.f8815u1) : 0.0f;
        if (m4567m0()) {
            m4488e1(this.f8783k);
            m4488e1(this.f8786l);
            m4488e1(this.f8789m);
        } else {
            float f2 = this.f8759c.getResources().getDisplayMetrics().density;
            float f3 = (80.0f * f2) + 10.0f;
            float f4 = f2 * 14.0f;
            boolean z2 = (!m4499B1() || m4554h1() || m4567m0()) ? false : true;
            float f5 = z2 ? 0.0f : f4;
            m4489f(this.f8783k, f3);
            m4489f(this.f8789m, f3);
            View view = this.f8786l;
            if (view != null) {
                m4489f(view, f5 + 25.0f + 10.0f);
                C1528d c1528d = this.f8792n;
                if (c1528d != null) {
                    c1528d.m4167b(f5);
                }
            }
            m4473D(this.f8783k, m4297a, f3);
            m4473D(this.f8786l, m4297a, f5 + 25.0f + 10.0f);
            m4473D(this.f8789m, m4297a, f3);
            float max = z2 ? Math.max(14.0f, (f3 - 10.0f) - 25.0f) : 14.0f;
            m4478U0(this.f8783k, true, max);
            m4478U0(this.f8789m, false, max);
        }
        if (m4499B1) {
            View view2 = this.f8783k;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.f8786l;
            if (view3 != null) {
                view3.bringToFront();
            }
            View view4 = this.f8789m;
            if (view4 != null) {
                view4.bringToFront();
            }
        }
        View view5 = this.f8705D0;
        if (view5 != null) {
            view5.bringToFront();
        }
        View view6 = this.f8702C0;
        if (view6 != null && view6.getVisibility() == 0) {
            this.f8702C0.bringToFront();
            View view7 = this.f8705D0;
            if (view7 != null) {
                view7.bringToFront();
            }
        }
        View view8 = this.f8737S;
        if (view8 != null && view8.getVisibility() == 0) {
            this.f8737S.bringToFront();
        }
        m4585t(false);
        m4556i0();
        if (m4545d0()) {
            ImageView m4575p0 = m4575p0();
            cfgData cfgdata = this.f8762d;
            boolean z3 = cfgdata.f2636h2;
            m4569n(m4575p0, z3 ? this.f8807s : this.f8804r, z3 ? this.f8811t0 : this.f8808s0, m4578q0(), false, this.f8812t1, 0.0f, 0.0f);
            m4571n1(m4575p0(), this.f8812t1, false);
            if (m4557i1()) {
                m4497B();
            } else {
                ImageView m4529R0 = m4529R0();
                boolean z4 = cfgdata.f2636h2;
                m4569n(m4529R0, z4 ? this.f8804r : this.f8807s, z4 ? this.f8808s0 : this.f8811t0, m4531S0(), true, this.f8812t1, 0.0f, 0.0f);
                m4571n1(m4529R0(), this.f8812t1, true);
            }
            m4494A();
        }
    }

    /* renamed from: F0 */
    public final void m4507F0() {
        if (this.f8799p0 == null) {
            return;
        }
        float m1773s = this.f8765e.m1773s();
        if (m1773s < -90.0f) {
            m4487d1(this.f8799p0, "--°C", "°C", -7829368);
        } else {
            m4487d1(this.f8799p0, AbstractC0062j.m160n(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", "."), "°C"), "°C", f8691G1);
        }
    }

    /* renamed from: G */
    public final void m4508G() {
        View view = this.f8777i;
        if (view == null) {
            return;
        }
        cfgData cfgdata = this.f8762d;
        boolean z2 = cfgdata.f2625f1 != EnumC1455a.f6981n;
        boolean z3 = view.getVisibility() == 0;
        this.f8777i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            if (AbstractC1539g1.m4230m0(cfgdata, this.f8765e)) {
                this.f8777i.setBackgroundResource(android.R.color.transparent);
            } else if (m4567m0() || m4527Q0().m4472a()) {
                this.f8777i.setBackgroundResource(R.drawable.ip_theme_40_top_bar);
            } else {
                this.f8777i.setBackgroundResource(R.drawable.ip_legacy_top_data_plain);
            }
            AbstractC1539g1.m4221i(this.f8796o0, this.f8799p0, cfgdata, m4545d0());
        }
        if (z3 == z2 || !m4561k0()) {
            return;
        }
        m4594w();
        m4602y1();
    }

    /* renamed from: G0 */
    public final void m4509G0() {
        cfgData cfgdata = this.f8762d;
        if (cfgdata.f2537K2 && m4567m0() && !m4545d0()) {
            float m4525P0 = m4525P0();
            float m4523O0 = m4523O0();
            TextView textView = this.f8814u0;
            int i = -1;
            if (textView != null) {
                textView.setTextColor(m4525P0 > cfgdata.f2568S1 ? -65536 : m4525P0 > cfgdata.f2564R1 ? -256 : -1);
                this.f8814u0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m4525P0)).replace(",", "."));
            }
            TextView textView2 = this.f8817v0;
            if (textView2 != null) {
                if (m4523O0 > cfgdata.f2576U1) {
                    i = -65536;
                } else if (m4523O0 > cfgdata.f2572T1) {
                    i = -256;
                }
                textView2.setTextColor(i);
                this.f8817v0.setText(AbstractC1256E0.m2986A(m4523O0));
            }
        }
    }

    /* renamed from: H */
    public final void m4510H(ImageView imageView) {
        ImageView[] m4596w1 = m4596w1(imageView);
        if (m4596w1 == null || imageView == null) {
            return;
        }
        float pivotX = imageView.getPivotX();
        float pivotY = imageView.getPivotY();
        float scaleX = imageView.getScaleX();
        float scaleY = imageView.getScaleY();
        float translationX = imageView.getTranslationX();
        float translationY = imageView.getTranslationY();
        for (ImageView imageView2 : m4596w1) {
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

    /* renamed from: H0 */
    public final void m4511H0() {
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup == null || this.f8773g1) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8771g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8771g.post(new RunnableC1543i(this, 10));
            return;
        }
        int round = Math.round(this.f8759c.getResources().getDisplayMetrics().density * 96.0f);
        float m4590u1 = m4590u1();
        m4504E(m4590u1);
        m4600y(width, height, round, AbstractC1561o.m4297a(1.0f, this.f8818v1, 0.0f, m4590u1()));
        m4566m(width, height, round, m4590u1);
    }

    /* renamed from: I */
    public final void m4512I(TextView textView) {
        if (textView == null) {
            return;
        }
        if (Math.abs(0.0f) < 0.001f) {
            m4475N0(textView, 0.0f, 0.0f);
        } else if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.post(new RunnableC0018l(this, 21, textView));
        } else {
            m4474K(textView, 1.0f, textView.getLeft(), textView.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: I0 */
    public final void m4513I0(ImageView imageView) {
        View[] m4547e0 = m4547e0(imageView);
        int length = m4547e0.length;
        for (int i = 0; i < length; i++) {
            View view = m4547e0[i];
            if (view != null) {
                m4475N0(view, view == this.f8749Y ? this.f8809s1 : m4586t0(view), 0.0f);
            }
        }
    }

    /* renamed from: J */
    public final void m4514J() {
        boolean z2 = this.f8762d.f2537K2 && m4567m0() && !m4545d0();
        m4490f1(this.f8820w0, z2);
        m4490f1(this.f8814u0, z2);
        m4490f1(this.f8817v0, z2);
        m4512I(this.f8814u0);
        m4512I(this.f8817v0);
    }

    /* renamed from: J0 */
    public final void m4515J0() {
        ImageView m4575p0 = m4575p0();
        boolean z2 = this.f8762d.f2636h2;
        ImageView imageView = z2 ? this.f8807s : this.f8804r;
        TextView textView = z2 ? this.f8811t0 : this.f8808s0;
        m4475N0(m4575p0, 0.0f, 0.0f);
        m4516K0(imageView);
        m4475N0(textView, 0.0f, m4578q0());
        m4513I0(m4575p0);
    }

    /* renamed from: K0 */
    public final void m4516K0(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        m4475N0(imageView, 0.0f, 0.0f);
        if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        }
        ImageView imageView2 = this.f8804r;
        if (imageView == imageView2 || imageView == this.f8807s) {
            C1572s c1572s = imageView == imageView2 ? this.f8746W0 : this.f8748X0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m4510H(imageView);
        }
        m4579q1(imageView);
    }

    /* renamed from: L */
    public final void m4517L() {
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f8761c1);
        cfgData cfgdata = this.f8762d;
        if (!cfgdata.f2537K2) {
            m4518L0();
            this.f8771g.setVisibility(4);
            m4530S();
            m4508G();
            m4540b0();
            m4558j();
            View view = this.f8774h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        boolean m4545d0 = m4545d0();
        carData cardata = this.f8765e;
        if (m4545d0) {
            this.f8771g.setVisibility(0);
            boolean m4570n0 = m4570n0();
            Boolean bool = this.f8794n1;
            if (bool == null || bool.booleanValue() != m4570n0) {
                this.f8794n1 = Boolean.valueOf(m4570n0);
            }
            m4598x0();
            m4549g();
            m4604z0(cardata.m1745e());
            m4603z();
            m4514J();
            m4558j();
            View view2 = this.f8774h;
            if (view2 != null) {
                view2.setVisibility(m4605z1() ? 4 : 8);
            }
            if (m4605z1()) {
                m4594w();
                m4602y1();
                return;
            }
            return;
        }
        m4518L0();
        this.f8771g.setVisibility(0);
        if (m4553h0()) {
            m4530S();
            View view3 = this.f8774h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else if (cfgdata.f2561Q2) {
            m4598x0();
            View view4 = this.f8774h;
            if (view4 != null) {
                view4.setVisibility(4);
            }
            if (m4605z1()) {
                m4594w();
                m4602y1();
            }
        } else {
            if (m4567m0()) {
                m4598x0();
                if (m4605z1()) {
                    m4602y1();
                }
            } else {
                m4530S();
            }
            View view5 = this.f8774h;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        m4490f1(this.f8798p, false);
        m4490f1(this.f8801q, false);
        m4490f1(this.f8804r, false);
        m4490f1(this.f8807s, false);
        m4581r1();
        m4543c1(this.f8804r, false);
        m4543c1(this.f8807s, false);
        m4490f1(this.f8704D, false);
        m4490f1(this.f8707E, false);
        m4490f1(this.f8808s0, false);
        m4490f1(this.f8811t0, false);
        m4541b1(this.f8798p, false);
        m4541b1(this.f8801q, false);
        if (m4545d0() || AbstractC1539g1.m4194P(cfgdata, cardata)) {
            m4599x1();
        } else {
            m4540b0();
        }
        if (!m4567m0()) {
            m4490f1(this.f8751Z, false);
            m4490f1(this.f8769f0, false);
            m4568m1();
        }
        m4520M0();
        m4515J0();
        m4549g();
        m4604z0(cardata.m1745e());
        m4514J();
        m4509G0();
        m4558j();
        m4501C0(C0639g.m1872x().m1880u());
        m4585t(false);
        m4556i0();
        m4508G();
    }

    /* renamed from: L0 */
    public final void m4518L0() {
        this.f8768f.removeCallbacks(this.f8776h1);
        m4522O();
        this.f8764d1 = true;
        this.f8782j1 = 0.0f;
        this.f8791m1 = false;
        AbstractC1372y1.m3287R(false, false);
    }

    /* renamed from: M */
    public final void m4519M() {
        final RunnableC1543i runnableC1543i = new RunnableC1543i(this, 13);
        final int i = 10;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        };
        carData cardata = this.f8765e;
        C1537g c1537g = this.f8753a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 11;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i3 = 12;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i4 = 13;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i5 = 14;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i6 = 15;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i7 = 16;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i8 = 17;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i9 = 18;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i10 = 0;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i12 = 2;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i13 = 3;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i14 = 4;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i15 = 5;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i16 = 6;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i17 = 7;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i18 = 8;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i19 = 9;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.j
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1543i.run();
                        break;
                    case 1:
                        runnableC1543i.run();
                        break;
                    case 2:
                        runnableC1543i.run();
                        break;
                    case 3:
                        runnableC1543i.run();
                        break;
                    case 4:
                        runnableC1543i.run();
                        break;
                    case 5:
                        runnableC1543i.run();
                        break;
                    case 6:
                        runnableC1543i.run();
                        break;
                    case 7:
                        runnableC1543i.run();
                        break;
                    case 8:
                        runnableC1543i.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1543i.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1543i.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1543i.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1543i.run();
                        break;
                    case 13:
                        runnableC1543i.run();
                        break;
                    case 14:
                        runnableC1543i.run();
                        break;
                    case 15:
                        runnableC1543i.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1543i.run();
                        break;
                    case 17:
                        runnableC1543i.run();
                        break;
                    default:
                        runnableC1543i.run();
                        break;
                }
            }
        });
        final int i20 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i21 = cfgdata4.f2635h1;
                                                    if (i21 >= 0 && i21 <= 2) {
                                                        r4 = i21;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f8759c);
        final int i26 = 6;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 8;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 9;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 10;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 11;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 12;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 13;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 14;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 15;
        cardata.m1756j0(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
        final int i36 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.k

            /* renamed from: b */
            public final /* synthetic */ C1576u f8363b;

            {
                this.f8363b = this;
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
                        this.f8363b.m4507F0();
                        break;
                    case 1:
                        this.f8363b.m4503D0();
                        break;
                    case 2:
                        this.f8363b.m4503D0();
                        break;
                    case 3:
                        this.f8363b.m4503D0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1576u c1576u = this.f8363b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1576u.getClass();
                            intValue = num.intValue();
                        }
                        if (c1576u.f8700B1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1576u.f8759c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1576u.f8762d;
                            if (cfgdata.f2537K2) {
                                c1576u.f8697A1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1576u.f8700B1 == -1 && intValue > -1) {
                            c1576u.f8697A1 = 0.0f;
                            ViewGroup viewGroup = c1576u.f8771g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1576u.f8771g.setAlpha(1.0f);
                            }
                            c1576u.m4562k1("ip");
                        }
                        c1576u.f8700B1 = intValue;
                        c1576u.m4498B0();
                        break;
                    case 5:
                        this.f8363b.m4498B0();
                        break;
                    case 6:
                        C1576u c1576u2 = this.f8363b;
                        Integer num2 = (Integer) obj;
                        c1576u2.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1576u2.f8759c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1576u2.f8762d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1576u2.f8779i1 || !c1576u2.m4557i1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1576u2.f8762d, c1576u2.f8765e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1576u2.f8762d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1576u2.f8759c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1576u2.m4562k1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1576u2.f8765e)) {
                                                                        cfgData cfgdata3 = c1576u2.f8762d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1576u2.f8765e.m1760l0(z2);
                                                                        c1576u2.f8762d.m1795o(c1576u2.f8759c);
                                                                        Context context2 = c1576u2.f8759c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1576u2.f8762d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1576u2.f8762d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1576u2.f8759c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1576u2.m4562k1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i2 = c1576u2.f8776h1;
                                                                    handler.removeCallbacks(runnableC1543i2);
                                                                    handler.postDelayed(runnableC1543i2, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1576u2.m4557i1()) {
                                                                    c1576u2.f8779i1 = true;
                                                                    if (c1576u2.m4564l0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1576u2.f8764d1 && ((valueAnimator = c1576u2.f8767e1) == null || !valueAnimator.isRunning())) {
                                                                            c1576u2.m4593v1(true);
                                                                        }
                                                                        Handler handler2 = c1576u2.f8768f;
                                                                        RunnableC1543i runnableC1543i3 = c1576u2.f8776h1;
                                                                        handler2.removeCallbacks(runnableC1543i3);
                                                                        handler2.postDelayed(runnableC1543i3, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1576u2.f8779i1) {
                                                                    Handler handler3 = c1576u2.f8768f;
                                                                    RunnableC1543i runnableC1543i4 = c1576u2.f8776h1;
                                                                    handler3.removeCallbacks(runnableC1543i4);
                                                                    handler3.postDelayed(runnableC1543i4, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1576u2.f8773g1) {
                                                        ValueAnimator valueAnimator2 = c1576u2.f8821w1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1576u2.f8761c1;
                                                            if (!z3 || !c1576u2.m4572o0()) {
                                                                boolean z4 = !c1576u2.f8761c1;
                                                                c1576u2.f8761c1 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1576u2.m4539b(z3);
                                                                break;
                                                            } else {
                                                                c1576u2.f8827y1 = 0;
                                                                RunnableC1543i runnableC1543i5 = new RunnableC1543i(c1576u2, 17);
                                                                if (!c1576u2.m4572o0() && Math.abs(c1576u2.f8812t1 - c1576u2.m4587t1()) < 0.001f) {
                                                                    runnableC1543i5.run();
                                                                    break;
                                                                } else {
                                                                    c1576u2.f8824x1 = true;
                                                                    c1576u2.m4542c(runnableC1543i5);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1576u2.f8762d.f2672o3) {
                                                        Context context3 = c1576u2.f8759c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1576u2.m4562k1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1576u2.m4562k1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1576u2.f8765e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1576u2.f8759c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1576u2.f8762d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1576u2.f8759c, m3282M[0], m3282M[1], 1.0f, c1576u2.f8762d.f2657l3);
                                                }
                                                c1576u2.f8742U0 = AbstractC1372y1.f6437g;
                                                c1576u2.m4585t(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1576u2.m4564l0()) {
                                            ValueAnimator valueAnimator3 = c1576u2.f8767e1;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1576u2.f8779i1 = false;
                                                c1576u2.m4593v1(c1576u2.f8764d1);
                                                break;
                                            }
                                        }
                                    } else if (c1576u2.f8762d.f2561Q2 && !c1576u2.f8773g1) {
                                        ValueAnimator valueAnimator4 = c1576u2.f8821w1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1576u2.f8762d;
                                            if (cfgdata4.f2561Q2 && !c1576u2.m4567m0()) {
                                                if (c1576u2.m4570n0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1576u2.f8759c);
                                                c1576u2.m4542c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1576u2.f8759c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1576u c1576u3 = this.f8363b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1576u3.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1576u3.m4495A0(intValue2);
                        break;
                    case 8:
                        C1576u c1576u4 = this.f8363b;
                        c1576u4.m4533V();
                        c1576u4.m4517L();
                        c1576u4.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1576u c1576u5 = this.f8363b;
                        c1576u5.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1576u5.m4518L0();
                        }
                        c1576u5.m4533V();
                        c1576u5.m4517L();
                        c1576u5.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1576u c1576u6 = this.f8363b;
                        c1576u6.m4517L();
                        c1576u6.m4501C0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1576u c1576u7 = this.f8363b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1576u7.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1576u7.m4604z0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1576u c1576u8 = this.f8363b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1576u8.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1576u8.f8826y0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1576u8.m4604z0(c1576u8.f8765e.m1745e());
                        break;
                    case 13:
                        C1576u c1576u9 = this.f8363b;
                        AbstractC1539g1.m4225k(c1576u9.f8759c);
                        c1576u9.m4533V();
                        c1576u9.m4517L();
                        break;
                    case 14:
                        C1576u c1576u10 = this.f8363b;
                        c1576u10.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1576u10.f8761c1 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1576u10.f8761c1;
                        Context context4 = c1576u10.f8759c;
                        if (!z5) {
                            c1576u10.f8827y1 = -1;
                            cfgData cfgdata5 = c1576u10.f8762d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1576u10.f8821w1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1576u10.f8821w1 = null;
                            }
                            c1576u10.f8812t1 = c1576u10.m4584s1();
                            c1576u10.f8815u1 = 1.0f;
                            c1576u10.f8818v1 = 0.0f;
                            c1576u10.m4506F();
                        }
                        c1576u10.m4517L();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1576u10.f8761c1) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1576u c1576u11 = this.f8363b;
                        if (bool == null) {
                            c1576u11.getClass();
                            break;
                        } else {
                            c1576u11.m4574p(false);
                            break;
                        }
                    default:
                        this.f8363b.m4501C0((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: M0 */
    public final void m4520M0() {
        ImageView m4529R0 = m4529R0();
        boolean z2 = this.f8762d.f2636h2;
        ImageView imageView = z2 ? this.f8804r : this.f8807s;
        TextView textView = z2 ? this.f8808s0 : this.f8811t0;
        m4475N0(m4529R0, 0.0f, 0.0f);
        m4516K0(imageView);
        m4475N0(textView, 0.0f, m4531S0());
        m4513I0(m4529R0);
    }

    /* renamed from: N */
    public final void m4521N() {
        if (this.f8771g == null) {
            return;
        }
        TextView textView = this.f8826y0;
        if (textView != null) {
            textView.bringToFront();
        }
        ImageView imageView = this.f8823x0;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.f8829z0;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        this.f8771g.invalidate();
    }

    /* renamed from: O */
    public final void m4522O() {
        ValueAnimator valueAnimator = this.f8767e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8767e1 = null;
        }
    }

    /* renamed from: O0 */
    public final float m4523O0() {
        return Math.max(0.0f, this.f8765e.m1779y() / 1000.0f);
    }

    /* renamed from: P */
    public final void m4524P() {
        ImageView m4529R0 = m4529R0();
        if (m4529R0 == null) {
            this.f8791m1 = false;
            return;
        }
        RunnableC0018l runnableC0018l = new RunnableC0018l(this, 22, m4529R0);
        if (m4529R0.getWidth() <= 0 || m4529R0.getHeight() <= 0) {
            m4529R0.post(runnableC0018l);
        } else {
            runnableC0018l.run();
        }
    }

    /* renamed from: P0 */
    public final float m4525P0() {
        float m1780z = this.f8765e.m1780z();
        if (m1780z < 0.0f) {
            return 0.0f;
        }
        return this.f8762d.f2702u3 * m1780z;
    }

    /* renamed from: Q */
    public final RectF m4526Q() {
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup == null || viewGroup.getWidth() <= 0 || this.f8771g.getHeight() <= 0) {
            return new RectF();
        }
        int width = this.f8771g.getWidth();
        int height = this.f8771g.getHeight();
        float f2 = height - 25.0f;
        if (!m4499B1() && !m4554h1()) {
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
        RectF m4206a02 = AbstractC1539g1.m4206a0(new Rect(m4238t.left + 27, 99, m4238t.right - 27, round), width, height);
        if (m4206a02.width() > 0.0f && m4206a02.height() > 0.0f) {
            m4206a02.set(m4206a02.left, m4206a02.top, m4206a02.right, f2);
        }
        return m4206a02;
    }

    /* renamed from: Q0 */
    public final C1574t m4527Q0() {
        int i;
        cfgData cfgdata = this.f8762d;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        if (enumC1455a == EnumC1455a.f6949f) {
            return new C1574t(0, null, 0);
        }
        int i2 = cfgdata.f2630g1;
        if (i2 < 31) {
            int i3 = enumC1455a.f7036d;
            return i3 != 0 ? new C1574t(i3, null, 0) : new C1574t(0, null, 0);
        }
        String[] strArr = cfgdata.f2603b;
        if (strArr != null && i2 >= 31 && (i = i2 - 31) >= 0 && i < strArr.length) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata.f2603b[i]);
            if (file.exists()) {
                return new C1574t(0, Uri.fromFile(file), 0);
            }
        }
        return new C1574t(0, null, 0);
    }

    /* renamed from: R */
    public final void m4528R(ImageView imageView, ImageView imageView2, TextView textView, float f2) {
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        ImageView imageView3 = null;
        ImageView imageView4 = imageView == this.f8798p ? this.f8816v : imageView == this.f8801q ? this.f8819w : null;
        if (imageView4 != null) {
            imageView4.setTranslationX(0.0f);
            imageView4.setRotation(0.0f);
        }
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            imageView2.setRotation(0.0f);
            m4510H(imageView2);
            C1572s c1572s = imageView2 == this.f8804r ? this.f8746W0 : imageView2 == this.f8807s ? this.f8748X0 : null;
            if (c1572s != null) {
                c1572s.m4470a(imageView2);
                ImageView[] m4596w1 = m4596w1(imageView2);
                if (m4596w1 != null) {
                    float f3 = c1572s.f8682h;
                    for (ImageView imageView5 : m4596w1) {
                        if (imageView5 != null) {
                            imageView5.setRotation(f3);
                        }
                    }
                }
            }
        }
        if (imageView == this.f8798p) {
            imageView3 = this.f8704D;
        } else if (imageView == this.f8801q) {
            imageView3 = this.f8707E;
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
        View[] m4547e0 = m4547e0(imageView);
        int length = m4547e0.length;
        for (int i = 0; i < length; i++) {
            View view = m4547e0[i];
            if (view != null) {
                view.setTranslationX(view == this.f8749Y ? this.f8809s1 : m4586t0(view));
                view.setTranslationY(0.0f);
            }
        }
    }

    /* renamed from: R0 */
    public final ImageView m4529R0() {
        return this.f8762d.f2636h2 ? this.f8798p : this.f8801q;
    }

    /* renamed from: S */
    public final void m4530S() {
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f8771g;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(android.R.color.transparent);
        }
        m4559j0();
        ViewGroup viewGroup3 = this.f8771g;
        if (viewGroup3 != null) {
            viewGroup3.getOverlay().clear();
        }
        C1525c c1525c = this.f8703C1;
        if (c1525c != null) {
            c1525c.m4163e(null);
        }
    }

    /* renamed from: S0 */
    public final float m4531S0() {
        return (this.f8762d.f2636h2 ? this.f8800p1 : this.f8803q1) + 15.0f;
    }

    /* renamed from: U */
    public final void m4532U() {
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup != null) {
            viewGroup.getOverlay().clear();
        }
        ImageView imageView = this.f8795o;
        if (imageView != null && imageView.getBackground() == this.f8703C1) {
            this.f8795o.setBackground(null);
            this.f8795o.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f8771g;
        if (viewGroup2 != null && viewGroup2.getBackground() == this.f8703C1) {
            this.f8771g.setBackgroundResource(android.R.color.transparent);
            this.f8771g.setLayerType(0, null);
        }
        C1525c c1525c = this.f8703C1;
        if (c1525c != null) {
            c1525c.m4160b();
            this.f8703C1.m4163e(null);
        }
    }

    /* renamed from: V */
    public final void m4533V() {
        cfgData cfgdata = this.f8762d;
        if (cfgdata.f2561Q2) {
            boolean m4567m0 = m4567m0();
            Context context = this.f8759c;
            if (m4567m0) {
                if (cfgdata.f2635h1 != 0 || Math.abs(this.f8812t1 - m4584s1()) >= 0.001f || this.f8818v1 >= 0.001f) {
                    cfgdata.f2635h1 = 0;
                    cfgdata.m1795o(context);
                    m4542c(null);
                    return;
                }
                return;
            }
            if (m4570n0() && cfgdata.f2635h1 == 1) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
                m4542c(null);
            } else {
                if (Math.abs(this.f8815u1 - (m4502C1() ? 1.0f : 0.0f)) < 0.001f) {
                    return;
                }
                m4542c(null);
            }
        }
    }

    /* renamed from: W */
    public final void m4534W() {
        this.f8703C1.m4163e(null);
        C1525c c1525c = this.f8703C1;
        m4551g1();
        c1525c.m4162d(-16777216);
    }

    /* renamed from: X */
    public final void m4535X() {
        View view = this.f8702C0;
        if (view == null || this.f8771g == null) {
            return;
        }
        if (this.f8705D0 != null && view.getParent() == this.f8705D0) {
            int round = Math.round(this.f8759c.getResources().getDisplayMetrics().density * 96.0f);
            ((ViewGroup) this.f8705D0).removeView(this.f8702C0);
            C1592d c1592d = new C1592d(470, round);
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            this.f8771g.addView(this.f8702C0, c1592d);
            this.f8736R0 = -1.0f;
            this.f8738S0 = -1.0f;
            this.f8702C0.setTranslationX(0.0f);
            this.f8702C0.setTranslationY(0.0f);
        }
        this.f8702C0.getParent();
    }

    /* renamed from: Y */
    public final int m4536Y() {
        int i = this.f8714G0;
        if (i > 0) {
            return i;
        }
        TextView textView = this.f8751Z;
        if (textView == null || this.f8754a0 == null) {
            return 0;
        }
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        int paddingBottom = this.f8754a0.getPaddingBottom() + this.f8754a0.getPaddingTop() + Math.round((this.f8751Z.getLineSpacingExtra() + (fontMetrics.descent - fontMetrics.ascent)) * 3.0f);
        this.f8714G0 = paddingBottom;
        if (paddingBottom <= 0) {
            float f2 = this.f8759c.getResources().getDisplayMetrics().density;
            this.f8714G0 = AbstractC0062j.m150d(f2, 20.0f, 22.0f * f2 * 3.2f);
        }
        return this.f8714G0;
    }

    /* renamed from: Z */
    public final Bitmap m4537Z(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f8759c.getResources(), i);
        if (decodeResource == null) {
            return null;
        }
        Bitmap copy = decodeResource.copy(Bitmap.Config.ARGB_8888, true);
        if (copy == null) {
            return decodeResource;
        }
        decodeResource.recycle();
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            int i5 = (i4 >>> 24) & Function.USE_VARARGS;
            if (i5 < 8) {
                iArr[i3] = 0;
            } else {
                int i6 = (i4 >> 16) & Function.USE_VARARGS;
                int i7 = ((((i4 & Function.USE_VARARGS) * 19) + ((((i4 >> 8) & Function.USE_VARARGS) * 183) + (i6 * 54))) >> 8) - 28;
                if (i7 <= 0) {
                    iArr[i3] = 0;
                } else {
                    iArr[i3] = (i4 & 16777215) | (((Math.min(Function.USE_VARARGS, i7 * 3) * i5) / Function.USE_VARARGS) << 24);
                }
            }
        }
        copy.setPixels(iArr, 0, width, 0, 0, width, height);
        return copy;
    }

    /* renamed from: a0 */
    public final void m4538a0() {
        m4488e1(this.f8783k);
        m4488e1(this.f8786l);
        m4488e1(this.f8789m);
        if (this.f8774h == null || m4605z1()) {
            return;
        }
        this.f8774h.setVisibility(8);
    }

    /* renamed from: b */
    public final void m4539b(boolean z2) {
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup == null) {
            m4517L();
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f8771g.getHeight() <= 0) {
            this.f8771g.post(new RunnableC1552l(this, z2, 1));
            return;
        }
        ValueAnimator valueAnimator = this.f8770f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8770f1 = null;
        }
        this.f8773g1 = false;
        m4522O();
        m4518L0();
        ImageView m4575p0 = m4575p0();
        ImageView m4529R0 = m4529R0();
        boolean z3 = this.f8762d.f2636h2;
        ImageView imageView = z3 ? this.f8807s : this.f8804r;
        ImageView imageView2 = z3 ? this.f8804r : this.f8807s;
        TextView textView = z3 ? this.f8811t0 : this.f8808s0;
        TextView textView2 = z3 ? this.f8808s0 : this.f8811t0;
        float m4578q0 = m4578q0();
        float m4531S0 = m4531S0();
        float width = this.f8771g.getWidth();
        float height = this.f8771g.getHeight();
        float f2 = this.f8759c.getResources().getDisplayMetrics().density * 80.0f;
        float f3 = m4575p0 != null ? -(m4575p0.getRight() + f2) : -width;
        if (m4529R0 != null) {
            width = (width - m4529R0.getLeft()) + f2;
        }
        float f4 = width;
        if (!z2) {
            m4490f1(m4575p0, true);
            m4490f1(m4529R0, true);
            m4490f1(imageView, true);
            m4490f1(imageView2, true);
            m4543c1(imageView, true);
            m4543c1(imageView2, true);
            m4490f1(textView, true);
            m4490f1(textView2, true);
            m4541b1(this.f8798p, true);
            m4541b1(this.f8801q, true);
            m4505E0();
            m4501C0(C0639g.m1872x().m1880u());
        }
        View view = this.f8702C0;
        boolean z4 = view != null && view.getVisibility() == 0;
        float top = this.f8702C0 != null ? (height - r3.getTop()) + f2 : 0.0f;
        if (m4561k0()) {
            m4532U();
        }
        ViewGroup viewGroup2 = this.f8771g;
        if (viewGroup2 != null) {
            viewGroup2.setLayerType(0, null);
        }
        m4500C();
        float f5 = this.f8795o != null ? -(r1.getHeight() + f2) : -height;
        int[] m3297c = AbstractC1372y1.m3297c();
        this.f8773g1 = true;
        m4544d(z2 ? 0.0f : 1.0f, m4575p0, imageView, textView, m4578q0, f3, m4529R0, imageView2, textView2, m4531S0, f4, z4, top, f5);
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8770f1 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f8770f1);
        this.f8770f1.addUpdateListener(new C1558n(this, z2, m4575p0, imageView, textView, m4578q0, f3, m4529R0, imageView2, textView2, m4531S0, f4, z4, top, f5, m3297c, 0));
        this.f8770f1.addListener(new C1564p(this, m3297c, m4575p0, imageView, textView, m4578q0, m4529R0, imageView2, textView2, m4531S0, z4, z2, 0));
        this.f8770f1.start();
    }

    /* renamed from: b0 */
    public final void m4540b0() {
        ImageView imageView = this.f8823x0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.f8826y0;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView2 = this.f8829z0;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        ImageView imageView3 = this.f8696A0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f8699B0;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
    }

    /* renamed from: b1 */
    public final void m4541b1(ImageView imageView, boolean z2) {
        for (View view : m4547e0(imageView)) {
            if (view != null) {
                TextView textView = this.f8749Y;
                cfgData cfgdata = this.f8762d;
                if (view == textView) {
                    m4490f1(view, z2 && !cfgdata.f2543M0.f7147f);
                } else if (view == this.f8790m0) {
                    m4490f1(view, z2 && cfgdata.f2543M0.f7149h);
                } else {
                    m4490f1(view, z2);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m4542c(RunnableC1543i runnableC1543i) {
        ImageView m4575p0 = m4575p0();
        if (m4572o0() && (m4575p0 == null || m4575p0.getWidth() <= 0)) {
            if (m4575p0 != null) {
                m4575p0.post(new RunnableC0018l(this, 23, runnableC1543i));
                return;
            } else {
                if (runnableC1543i != null) {
                    runnableC1543i.run();
                    return;
                }
                return;
            }
        }
        float m4584s1 = m4572o0() ? m4584s1() : m4587t1();
        float f2 = m4502C1() ? 1.0f : 0.0f;
        float f3 = this.f8762d.f2635h1 == 2 ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.f8821w1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.f8812t1 - m4584s1) < 0.001f && Math.abs(this.f8815u1 - f2) < 0.001f && Math.abs(this.f8818v1 - f3) < 0.001f) {
            this.f8821w1 = null;
            this.f8812t1 = m4584s1;
            this.f8815u1 = f2;
            this.f8818v1 = f3;
            m4506F();
            if (runnableC1543i != null) {
                runnableC1543i.run();
                return;
            }
            return;
        }
        float f4 = this.f8812t1;
        float f5 = this.f8815u1;
        float f6 = this.f8818v1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8821w1 = ofFloat;
        ofFloat.setDuration(260L);
        AbstractC0062j.m166t(this.f8821w1);
        this.f8821w1.addUpdateListener(new C1555m(this, f4, m4584s1, f5, f2, f6, f3, 0));
        this.f8821w1.addListener(new C1567q(this, m4584s1, f2, f3, runnableC1543i, 0));
        this.f8821w1.start();
    }

    /* renamed from: c1 */
    public final void m4543c1(ImageView imageView, boolean z2) {
        ImageView[] m4596w1 = m4596w1(imageView);
        if (m4596w1 == null) {
            return;
        }
        for (ImageView imageView2 : m4596w1) {
            m4490f1(imageView2, z2);
        }
    }

    /* renamed from: d */
    public final void m4544d(float f2, ImageView imageView, ImageView imageView2, TextView textView, float f3, float f4, ImageView imageView3, ImageView imageView4, TextView textView2, float f5, float f6, boolean z2, float f7, float f8) {
        View view;
        m4546e(imageView, imageView2, textView, f3, f4, -540.0f, f2);
        m4546e(imageView3, imageView4, textView2, f5, f6, 540.0f, f2);
        if (z2 && (view = this.f8702C0) != null) {
            view.setTranslationY((f7 * f2) + this.f8740T0);
        }
        ImageView imageView5 = this.f8795o;
        if (imageView5 != null) {
            imageView5.setTranslationY(f8 * f2);
        }
    }

    /* renamed from: d0 */
    public final boolean m4545d0() {
        return this.f8762d.f2561Q2 && this.f8761c1;
    }

    /* renamed from: e */
    public final void m4546e(ImageView imageView, ImageView imageView2, TextView textView, float f2, float f3, float f4, float f5) {
        if (imageView != null) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
            imageView.setTranslationX(f3 * f5);
            imageView.setRotation(f4 * f5);
        }
        ImageView imageView3 = null;
        ImageView imageView4 = imageView == this.f8798p ? this.f8816v : imageView == this.f8801q ? this.f8819w : null;
        if (imageView4 != null) {
            imageView4.setPivotY(AbstractC0062j.m153g(imageView4.getWidth(), 0.5f, imageView4) * 0.5f);
            imageView4.setTranslationX(f3 * f5);
            imageView4.setRotation(f4 * f5);
        }
        if (imageView2 != null) {
            imageView2.setPivotY(AbstractC0062j.m153g(imageView2.getWidth(), 0.5f, imageView2) * 0.5f);
            float f6 = f3 * f5;
            imageView2.setTranslationX(f6);
            imageView2.setTranslationY(0.0f);
            float f7 = f4 * f5;
            imageView2.setRotation(f7);
            ImageView[] m4596w1 = m4596w1(imageView2);
            if (m4596w1 != null) {
                for (ImageView imageView5 : m4596w1) {
                    if (imageView5 != null) {
                        imageView5.setPivotY(AbstractC0062j.m153g(imageView5.getWidth(), 0.5f, imageView5) * 0.5f);
                        imageView5.setTranslationX(f6);
                        imageView5.setTranslationY(0.0f);
                        imageView5.setRotation(f7);
                    }
                }
            }
        }
        if (imageView == this.f8798p) {
            imageView3 = this.f8704D;
        } else if (imageView == this.f8801q) {
            imageView3 = this.f8707E;
        }
        if (imageView3 != null) {
            imageView3.setPivotY(AbstractC0062j.m153g(imageView3.getWidth(), 0.5f, imageView3) * 0.5f);
            imageView3.setTranslationX(f3 * f5);
            imageView3.setTranslationY(0.0f);
            imageView3.setRotation(f4 * f5);
        }
        if (textView != null) {
            textView.setTranslationX(f3 * f5);
            textView.setTranslationY(f2);
        }
        View[] m4547e0 = m4547e0(imageView);
        int length = m4547e0.length;
        for (int i = 0; i < length; i++) {
            View view = m4547e0[i];
            if (view != null) {
                view.setTranslationX((f3 * f5) + (view == this.f8749Y ? this.f8809s1 : m4586t0(view)));
                view.setTranslationY(0.0f);
            }
        }
    }

    /* renamed from: e0 */
    public final View[] m4547e0(ImageView imageView) {
        return imageView == this.f8798p ? new View[]{this.f8747X, this.f8745W, this.f8743V, this.f8749Y, this.f8790m0, this.f8787l0, this.f8828z} : imageView == this.f8801q ? new View[]{this.f8775h0, this.f8784k0, this.f8781j0, this.f8695A} : new View[0];
    }

    /* renamed from: f0 */
    public final void m4548f0(float[] fArr) {
        float f2 = (!this.f8764d1 || this.f8782j1 > 0.0f) ? this.f8782j1 : 0.0f;
        if (f2 <= 0.0f || !this.f8791m1) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        RectF m4589u0 = m4589u0();
        if (m4589u0.width() <= 0.0f || m4589u0.height() <= 0.0f) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = (m4589u0.centerX() - this.f8785k1) * f2;
            fArr[1] = (m4589u0.centerY() - this.f8788l1) * f2;
        }
    }

    /* renamed from: g */
    public final void m4549g() {
        ImageView imageView = this.f8823x0;
        if (imageView == null || this.f8829z0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof C1592d) {
            C1592d c1592d = (C1592d) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1592d).width = 90;
            ((ViewGroup.MarginLayoutParams) c1592d).height = 90;
            c1592d.setMarginStart(640);
            ((ViewGroup.MarginLayoutParams) c1592d).leftMargin = 640;
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = 100;
            imageView.setLayoutParams(c1592d);
        }
        ImageView imageView2 = this.f8829z0;
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
        TextView textView = this.f8826y0;
        if (textView != null) {
            textView.setTextSize(2, 24.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f8826y0.getLayoutParams();
            if (layoutParams3 instanceof C1592d) {
                C1592d c1592d3 = (C1592d) layoutParams3;
                ((ViewGroup.MarginLayoutParams) c1592d3).topMargin = -7;
                this.f8826y0.setLayoutParams(c1592d3);
            }
            this.f8826y0.setTranslationX(-7.0f);
            this.f8826y0.setTranslationY(12.0f);
        }
        ImageView imageView3 = this.f8823x0;
        if (imageView3 != null) {
            imageView3.setBackgroundResource(R.drawable.ip_theme_40_cruise_icon_bg);
            this.f8823x0.setPadding(6, 6, 6, 6);
        }
        ImageView imageView4 = this.f8829z0;
        if (imageView4 != null) {
            imageView4.setBackgroundResource(R.drawable.ip_theme_40_cruise_icon_bg);
            this.f8829z0.setPadding(6, 6, 6, 6);
        }
        TextView textView2 = this.f8826y0;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.ip_theme_40_cruise_icon_bg);
        }
        m4599x1();
        m4521N();
    }

    /* renamed from: g0 */
    public final void m4550g0(ImageView imageView, float f2, boolean z2, float[] fArr, float[] fArr2) {
        float width;
        float f3;
        fArr[0] = z2 ? imageView.getWidth() + r0 : imageView.getLeft();
        fArr[1] = imageView.getTop();
        float f4 = 0.0f;
        if (f2 < 0.999f) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
        } else {
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
                f3 = (f5 * 10.0f) / 0.3f;
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
        fArr2[1] = (m4590u1() * 40.0f) + ((1.0f - m4590u1()) * 25.0f) + fArr2[1];
        float m4590u1 = (m4590u1() * 15.0f) + ((1.0f - m4590u1()) * 10.0f);
        float f6 = fArr2[0];
        if (z2) {
            m4590u1 = -m4590u1;
        }
        fArr2[0] = f6 + m4590u1;
    }

    /* renamed from: g1 */
    public final boolean m4551g1() {
        return m4567m0() && !m4553h0();
    }

    /* renamed from: h */
    public final void m4552h(View view, int i, int i2) {
        Context context;
        Drawable m1b;
        if (view == null || (context = this.f8759c) == null || (m1b = AbstractC0000a.m1b(context, AbstractC1353s0.m3251f(this.f8762d))) == null) {
            return;
        }
        Drawable mutate = m1b.mutate();
        if (mutate instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) mutate;
            gradientDrawable.setColor(i);
            gradientDrawable.setStroke(Math.max(1, Math.round(context.getResources().getDisplayMetrics().density)), i2);
        }
        view.setBackground(mutate);
    }

    /* renamed from: h0 */
    public final boolean m4553h0() {
        return this.f8762d.f2561Q2 && !this.f8761c1;
    }

    /* renamed from: h1 */
    public final boolean m4554h1() {
        return m4570n0() && !m4553h0();
    }

    /* renamed from: i */
    public final void m4555i(View view, int i) {
        if (view == null || this.f8759c == null || i == 0) {
            return;
        }
        view.setBackgroundResource(i);
    }

    /* renamed from: i0 */
    public final void m4556i0() {
        m4488e1(this.f8780j);
        m4488e1(this.f8757b0);
        if (m4567m0() || !m4499B1()) {
            m4488e1(this.f8783k);
            m4488e1(this.f8786l);
            m4488e1(this.f8789m);
        }
        if (m4567m0() || this.f8762d.f2585W2) {
            m4488e1(this.f8737S);
            m4488e1(this.f8723L);
            m4488e1(this.f8719J);
            m4488e1(this.f8721K);
            m4488e1(this.f8727N);
            m4488e1(this.f8725M);
            m4488e1(this.f8729O);
            m4488e1(this.f8733Q);
            m4488e1(this.f8731P);
            m4488e1(this.f8735R);
        }
    }

    /* renamed from: i1 */
    public final boolean m4557i1() {
        if (m4564l0()) {
            return !this.f8764d1 || this.f8782j1 > 0.0f;
        }
        return false;
    }

    /* renamed from: j */
    public final void m4558j() {
        cfgData cfgdata = this.f8762d;
        if (!cfgdata.f2537K2) {
            ViewGroup viewGroup = this.f8757b0;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            m4490f1(this.f8751Z, false);
            m4490f1(this.f8769f0, false);
            View view = this.f8737S;
            if (view != null) {
                view.setVisibility(8);
            }
            m4488e1(this.f8787l0);
            m4490f1(this.f8790m0, false);
            m4568m1();
            return;
        }
        m4490f1(this.f8769f0, cfgdata.f2581V2 && (!m4553h0() && (m4545d0() || m4567m0())));
        m4505E0();
        if (m4567m0()) {
            m4563l(false);
        } else if (cfgdata.f2585W2 || m4567m0() || m4553h0() || !m4545d0() || this.f8818v1 >= 0.999f) {
            m4563l(false);
        } else {
            m4563l(true);
        }
        m4601y0();
        m4568m1();
        if (!m4499B1() && !m4570n0() && !m4567m0() && !m4557i1()) {
            m4538a0();
            if (m4561k0()) {
                m4598x0();
            }
        }
        m4511H0();
    }

    /* renamed from: j0 */
    public final void m4559j0() {
        ImageView imageView = this.f8795o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        this.f8795o.setLayerType(0, null);
        this.f8795o.setBackground(null);
        this.f8795o.setImageDrawable(null);
    }

    /* renamed from: j1 */
    public final void m4560j1(float f2, float f3, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f8767e1 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f8767e1);
        this.f8767e1.addUpdateListener(new C0174W(4, this));
        this.f8767e1.addListener(new C0181b0(this, 2, runnable));
        this.f8767e1.start();
    }

    /* renamed from: k0 */
    public final boolean m4561k0() {
        if (this.f8703C1 == null) {
            return false;
        }
        ImageView imageView = this.f8795o;
        if (imageView != null && imageView.getVisibility() == 0 && this.f8795o.getBackground() == this.f8703C1) {
            return true;
        }
        ViewGroup viewGroup = this.f8771g;
        return viewGroup != null && viewGroup.getBackground() == this.f8703C1;
    }

    /* renamed from: k1 */
    public final void m4562k1(String str) {
        Context context = this.f8759c;
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

    /* renamed from: l */
    public final void m4563l(boolean z2) {
        if (!z2) {
            View view = this.f8737S;
            if (view != null) {
                view.setVisibility(8);
            }
            m4488e1(this.f8727N);
            m4488e1(this.f8725M);
            m4488e1(this.f8729O);
            m4488e1(this.f8723L);
            m4488e1(this.f8719J);
            m4488e1(this.f8721K);
            m4488e1(this.f8733Q);
            m4488e1(this.f8731P);
            m4488e1(this.f8735R);
            return;
        }
        View view2 = this.f8737S;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        boolean z3 = this.f8762d.useJourneyFuel;
        m4490f1(this.f8727N, z3);
        m4490f1(this.f8725M, z3);
        m4490f1(this.f8729O, z3);
        m4490f1(this.f8723L, true);
        m4490f1(this.f8719J, true);
        m4490f1(this.f8721K, true);
        m4490f1(this.f8733Q, true);
        m4490f1(this.f8731P, true);
        m4490f1(this.f8735R, true);
    }

    /* renamed from: l0 */
    public final boolean m4564l0() {
        return this.f8762d.f2537K2 && m4545d0();
    }

    /* renamed from: l1 */
    public final boolean m4565l1() {
        return m4551g1() && m4527Q0().m4472a();
    }

    /* renamed from: m */
    public final void m4566m(int i, int i2, int i3, float f2) {
        ImageView m4575p0;
        if (this.f8737S == null || m4567m0()) {
            return;
        }
        boolean z2 = (this.f8762d.f2585W2 || m4553h0() || !m4545d0()) ? false : true;
        float max = Math.max(0.0f, Math.min(1.0f, this.f8818v1));
        if (!z2) {
            this.f8737S.setAlpha(1.0f);
            this.f8737S.setTranslationY(0.0f);
            return;
        }
        if (max >= 0.999f) {
            this.f8737S.setAlpha(0.0f);
            this.f8737S.setVisibility(4);
            return;
        }
        if (this.f8737S.getVisibility() != 0) {
            m4563l(true);
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float f3 = ((-0.19999999f) * max2) + 1.0f;
        if (this.f8737S != null) {
            Context context = this.f8759c;
            float f4 = context.getResources().getDisplayMetrics().density;
            float f5 = context.getResources().getDisplayMetrics().scaledDensity;
            float max3 = Math.max(0.5f, Math.min(1.2f, f3));
            int round = Math.round(14.0f * f4 * max3) + 20;
            int round2 = Math.round((f4 * 16.0f) * max3) - 20;
            int i4 = round2 < 0 ? 0 : round2;
            float f6 = 10.0f * f4 * max3;
            int round3 = Math.round(f6);
            int round4 = Math.round(f6);
            this.f8737S.setPadding(round, round3 < 0 ? 0 : round3, i4, round4 < 0 ? 0 : round4);
            View view = this.f8737S;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(true);
                ((ViewGroup) this.f8737S).setClipChildren(true);
            }
            float f7 = 15.0f * max3;
            m4483Z0(this.f8733Q, f7, f5);
            float f8 = 30.0f * max3;
            m4483Z0(this.f8731P, f8, f5);
            float f9 = 16.0f * max3;
            m4483Z0(this.f8735R, f9, f5);
            m4483Z0(this.f8727N, f7, f5);
            m4483Z0(this.f8725M, f8, f5);
            m4483Z0(this.f8729O, f9, f5);
            m4483Z0(this.f8723L, f7, f5);
            m4483Z0(this.f8719J, f8, f5);
            m4483Z0(this.f8721K, f9, f5);
            AbstractC1539g1.m4202X(this.f8731P, this.f8725M, this.f8719J);
            TextView textView = this.f8727N;
            float f10 = 22.0f * f4 * max3;
            if (textView != null && (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams.setMarginStart(Math.round(f10));
                textView.setLayoutParams(marginLayoutParams);
            }
            TextView textView2 = this.f8723L;
            float f11 = f4 * 18.0f * max3;
            if (textView2 != null && (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                marginLayoutParams2.setMarginStart(Math.round(f11));
                textView2.setLayoutParams(marginLayoutParams2);
            }
        }
        int m152f = AbstractC0062j.m152f(i3, f3, 1);
        int i5 = i - 470;
        int max4 = Math.max(0, i5 / 2);
        int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
        if (max2 > 0.001f && (m4575p0 = m4575p0()) != null && m4575p0.getWidth() > 0 && m4575p0.getHeight() > 0) {
            float f12 = this.f8812t1;
            float left = m4575p0.getLeft();
            float width = m4575p0.getWidth() * f12;
            float height = (m4575p0.getHeight() * f12) + m4575p0.getTop();
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
        int max6 = Math.max(0, Math.min(max4, Math.max(0, i5)));
        int max7 = Math.max(0, m4298b);
        View view2 = this.f8737S;
        if (view2 != null && this.f8771g != null && (view2.getLayoutParams() instanceof C1592d)) {
            C1592d c1592d = (C1592d) this.f8737S.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = 470;
            ((ViewGroup.MarginLayoutParams) c1592d).height = m152f;
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(max6);
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max7;
            this.f8737S.setLayoutParams(c1592d);
            this.f8737S.setTranslationX(0.0f);
            this.f8737S.setTranslationY(0.0f);
        }
        this.f8737S.setAlpha(1.0f - max);
        this.f8737S.setTranslationY(max * 40.0f);
        this.f8737S.bringToFront();
        View view3 = this.f8705D0;
        if (view3 != null) {
            view3.bringToFront();
        }
    }

    /* renamed from: m0 */
    public final boolean m4567m0() {
        cfgData cfgdata = this.f8762d;
        return AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
    }

    /* renamed from: m1 */
    public final void m4568m1() {
        View view;
        ViewGroup viewGroup;
        View view2;
        TextView textView = this.f8751Z;
        boolean z2 = textView != null && textView.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f8769f0;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = z2 || z3;
        View view3 = this.f8754a0;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        int m4536Y = m4536Y();
        View view4 = this.f8754a0;
        if (view4 != null) {
            if (!z2 || m4536Y <= 0) {
                view4.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    view4.setLayoutParams(layoutParams);
                }
            } else {
                m4481X0(view4, m4536Y);
                View view5 = this.f8754a0;
                if (view5 instanceof LinearLayout) {
                    ((LinearLayout) view5).setGravity(17);
                }
                TextView textView2 = this.f8751Z;
                if (textView2 != null) {
                    AbstractC1539g1.m4223j(textView2, this.f8754a0);
                }
            }
        }
        ViewGroup viewGroup3 = this.f8769f0;
        if (viewGroup3 != null) {
            if (z3 && m4536Y > 0) {
                TextView textView3 = this.f8772g0;
                if (textView3 != null) {
                    int round = Math.round(textView3.getPaint().measureText("000       000")) + this.f8769f0.getPaddingEnd() + this.f8769f0.getPaddingStart();
                    if (round > 0) {
                        this.f8769f0.setMinimumWidth(round);
                    }
                }
                m4481X0(this.f8769f0, m4536Y);
            } else if (z3 && z2 && (view2 = this.f8754a0) != null) {
                view2.post(new RunnableC1543i(this, 9));
            } else {
                viewGroup3.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    viewGroup3.setLayoutParams(layoutParams2);
                }
            }
        }
        boolean z5 = (z2 && z3) || m4496A1() || m4590u1() > 0.001f;
        View view6 = this.f8711F0;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams3 = view6.getLayoutParams() instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) this.f8711F0.getLayoutParams() : null;
            if (z5) {
                this.f8711F0.setVisibility(0);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 1.0f;
                    this.f8711F0.setLayoutParams(layoutParams3);
                }
            } else {
                this.f8711F0.setVisibility(8);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 0.0f;
                    this.f8711F0.setLayoutParams(layoutParams3);
                }
            }
        }
        View view7 = this.f8708E0;
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
        boolean m4496A1 = m4496A1();
        View view8 = this.f8708E0;
        if ((view8 instanceof ViewGroup) && (view = this.f8754a0) != null && (viewGroup = this.f8769f0) != null && this.f8711F0 != null) {
            ViewGroup viewGroup4 = (ViewGroup) view8;
            if (m4496A1) {
                view = viewGroup;
            }
            if (viewGroup4.getChildCount() < 1 || viewGroup4.getChildAt(0) != view) {
                viewGroup4.removeView(this.f8754a0);
                viewGroup4.removeView(this.f8711F0);
                viewGroup4.removeView(this.f8769f0);
                if (m4496A1) {
                    viewGroup4.addView(this.f8769f0);
                    viewGroup4.addView(this.f8711F0);
                    viewGroup4.addView(this.f8754a0);
                } else {
                    viewGroup4.addView(this.f8754a0);
                    viewGroup4.addView(this.f8711F0);
                    viewGroup4.addView(this.f8769f0);
                }
            }
        }
        if (m4496A1) {
            m4479V0(this.f8769f0, 48);
            m4479V0(this.f8754a0, 8388661);
        } else {
            m4479V0(this.f8754a0, 48);
            m4479V0(this.f8769f0, 8388661);
        }
        View view9 = this.f8708E0;
        if (view9 != null) {
            view9.setVisibility(z4 ? 0 : 8);
        }
        View view10 = this.f8705D0;
        if (view10 != null) {
            view10.setVisibility(z4 ? 0 : 8);
        }
    }

    /* renamed from: n */
    public final void m4569n(ImageView imageView, ImageView imageView2, TextView textView, float f2, boolean z2, float f3, float f4, float f5) {
        if (imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1543i(this, 11));
            return;
        }
        float f6 = f3 - 1.0f;
        if (Math.abs(f6) < 0.001f) {
            m4475N0(imageView, f4, f5);
            m4516K0(imageView2);
            m4475N0(textView, f4, f2 + f5);
            m4576p1(imageView, 1.0f, 0.0f, 0.0f, f4, f5, 0.0f, 0.0f);
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m4550g0(imageView, f3, z2, fArr, fArr2);
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = 0.0f;
        if (f3 > 1.001f && Math.abs(f6) >= 0.001f && f3 >= 1.0f) {
            float m4584s1 = m4584s1();
            float m4587t1 = m4587t1();
            float f12 = f3 - m4587t1;
            if (Math.abs(f12) >= 0.001f) {
                float f13 = m4584s1 - m4587t1;
                if (Math.abs(f13) >= 0.001f) {
                    f11 = f12 / f13;
                }
            }
            f11 = (((-imageView.getHeight()) * 0.16f) * f11) - (f11 * 120.0f);
        }
        m4474K(imageView, f3, f7, f8, f4, f5, f9, f10);
        m4597x(imageView2, imageView, f3, f7, f8, f9 + f4, f10 + f5);
        m4474K(textView, f3, f7, f8, f4, f5, f9, f2 + f10 + f11 + f5);
        m4576p1(imageView, f3, f7, f8, f4, f5, f9, f10);
    }

    /* renamed from: n0 */
    public final boolean m4570n0() {
        return AbstractC1539g1.m4195Q(this.f8762d, this.f8765e);
    }

    /* renamed from: n1 */
    public final void m4571n1(ImageView imageView, float f2, boolean z2) {
        ImageView imageView2 = imageView == this.f8798p ? this.f8704D : imageView == this.f8801q ? this.f8707E : null;
        if (imageView2 == null || imageView == null) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(0.0f) < 0.01f && Math.abs(0.0f) < 0.01f) {
            m4516K0(imageView2);
            C1572s c1572s = imageView2 == this.f8704D ? this.f8750Y0 : this.f8752Z0;
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
        m4550g0(imageView, f2, z2, fArr, fArr2);
        m4597x(imageView2, imageView, f2, fArr[0], fArr[1], fArr2[0] + 0.0f, fArr2[1] + 0.0f);
        C1572s c1572s2 = imageView2 == this.f8704D ? this.f8750Y0 : this.f8752Z0;
        if (c1572s2 != null) {
            c1572s2.m4470a(imageView2);
        }
    }

    /* renamed from: o0 */
    public final boolean m4572o0() {
        return this.f8762d.f2635h1 == 0 && !this.f8824x1;
    }

    /* renamed from: o1 */
    public final void m4573o1() {
        ValueAnimator valueAnimator = this.f8821w1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8821w1 = null;
        }
        this.f8824x1 = false;
        this.f8827y1 = -1;
        cfgData cfgdata = this.f8762d;
        boolean z2 = cfgdata.f2561Q2;
        Context context = this.f8759c;
        if (!z2) {
            if (cfgdata.f2635h1 != 0) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
            }
            this.f8812t1 = m4584s1();
            this.f8815u1 = 1.0f;
            this.f8818v1 = 0.0f;
            m4506F();
            return;
        }
        if (m4570n0() && cfgdata.f2635h1 == 1) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        if (m4567m0() && cfgdata.f2635h1 != 0) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        this.f8812t1 = m4572o0() ? m4584s1() : m4587t1();
        this.f8815u1 = m4502C1() ? 1.0f : 0.0f;
        this.f8818v1 = cfgdata.f2635h1 == 2 ? 1.0f : 0.0f;
        m4506F();
        if (m4572o0()) {
            ImageView m4575p0 = m4575p0();
            if (m4575p0 == null) {
                m4575p0 = m4529R0();
            }
            if (m4575p0 == null || m4575p0.getWidth() > 0) {
                return;
            }
            m4575p0.post(new RunnableC1543i(this, 15));
        }
    }

    /* renamed from: p */
    public final void m4574p(boolean z2) {
        boolean z3 = this.f8762d.f2636h2;
        if (z2 || !Boolean.valueOf(z3).equals(this.f8797o1)) {
            this.f8797o1 = Boolean.valueOf(z3);
            this.f8791m1 = false;
            m4485a1(this.f8798p, z3 ? 1 : 0);
            m4485a1(this.f8801q, z3 ? 1 : 0);
            m4485a1(this.f8804r, z3 ? 1 : 0);
            m4485a1(this.f8807s, z3 ? 1 : 0);
            m4485a1(this.f8810t, z3 ? 1 : 0);
            m4485a1(this.f8813u, z3 ? 1 : 0);
            m4485a1(this.f8816v, z3 ? 1 : 0);
            m4485a1(this.f8819w, z3 ? 1 : 0);
            m4485a1(this.f8698B, z3 ? 1 : 0);
            m4485a1(this.f8701C, z3 ? 1 : 0);
            for (ImageView imageView : this.f8710F) {
                m4485a1(imageView, z3 ? 1 : 0);
            }
            for (ImageView imageView2 : this.f8713G) {
                m4485a1(imageView2, z3 ? 1 : 0);
            }
            m4492o(this.f8798p, z3);
            m4492o(this.f8801q, !z3);
            ImageView imageView3 = this.f8804r;
            if (imageView3 != null && this.f8746W0 != null) {
                imageView3.post(new RunnableC1543i(this, 5));
            }
            ImageView imageView4 = this.f8807s;
            if (imageView4 != null && this.f8748X0 != null) {
                imageView4.post(new RunnableC1543i(this, 6));
            }
            ImageView imageView5 = this.f8704D;
            if (imageView5 != null && this.f8750Y0 != null) {
                imageView5.post(new RunnableC1543i(this, 7));
            }
            ImageView imageView6 = this.f8707E;
            if (imageView6 != null && this.f8752Z0 != null) {
                imageView6.post(new RunnableC1543i(this, 8));
            }
            m4603z();
            carData cardata = this.f8765e;
            m4495A0(cardata.m1753i());
            m4604z0(cardata.m1745e());
        }
    }

    /* renamed from: p0 */
    public final ImageView m4575p0() {
        return this.f8762d.f2636h2 ? this.f8801q : this.f8798p;
    }

    /* renamed from: p1 */
    public final void m4576p1(ImageView imageView, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (Math.abs(f2 - 1.0f) < 0.001f) {
            View[] m4547e0 = m4547e0(imageView);
            int length = m4547e0.length;
            for (int i = 0; i < length; i++) {
                View view = m4547e0[i];
                if (view != null) {
                    m4475N0(view, (view == this.f8749Y ? this.f8809s1 : m4586t0(view)) + f5 + f7, 0.0f + f6 + f8);
                }
            }
            return;
        }
        View[] m4547e02 = m4547e0(imageView);
        int length2 = m4547e02.length;
        for (int i2 = 0; i2 < length2; i2++) {
            View view2 = m4547e02[i2];
            if (view2 != null) {
                m4474K(view2, f2, f3, f4, f5, f6, (view2 == this.f8749Y ? this.f8809s1 : m4586t0(view2)) + f7, 0.0f + f8);
            }
        }
    }

    /* renamed from: q */
    public final void m4577q() {
        if (this.f8703C1 == null) {
            C1525c c1525c = new C1525c(-16777216);
            this.f8703C1 = c1525c;
            c1525c.m4164f(1720508584);
        }
        C1574t m4527Q0 = m4527Q0();
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        this.f8771g.setBackgroundResource(android.R.color.transparent);
        if (!m4527Q0.m4472a() || m4565l1()) {
            if (m4527Q0.m4472a()) {
                m4559j0();
            }
            m4580r();
        } else if (m4565l1()) {
            m4559j0();
            m4580r();
            m4602y1();
        } else if (this.f8795o == null) {
            m4559j0();
            m4534W();
            this.f8771g.setLayerType(1, null);
            this.f8771g.setBackground(this.f8703C1);
        } else if (m4561k0() && this.f8795o.getBackground() == this.f8703C1) {
            this.f8795o.setLayerType(1, null);
            m4602y1();
        } else {
            this.f8795o.setVisibility(0);
            this.f8795o.setLayerType(1, null);
            this.f8795o.setBackground(null);
            RunnableC0123b runnableC0123b = new RunnableC0123b(this, 2, m4527Q0);
            if (m4527Q0.f8687b != 0) {
                runnableC0123b.run();
            } else {
                Uri uri = m4527Q0.f8688c;
                if (uri != null) {
                    this.f8795o.setImageURI(uri);
                    this.f8795o.post(runnableC0123b);
                }
            }
        }
        m4602y1();
    }

    /* renamed from: q0 */
    public final float m4578q0() {
        return (this.f8762d.f2636h2 ? this.f8803q1 : this.f8800p1) + 15.0f;
    }

    /* renamed from: q1 */
    public final void m4579q1(ImageView imageView) {
        ImageView imageView2 = this.f8804r;
        if (imageView == imageView2) {
            m4491k(this.f8810t, imageView2, false);
            m4491k(this.f8816v, this.f8804r, false);
            m4491k(this.f8698B, this.f8804r, true);
        } else {
            ImageView imageView3 = this.f8807s;
            if (imageView == imageView3) {
                m4491k(this.f8813u, imageView3, false);
                m4491k(this.f8819w, this.f8807s, false);
                m4491k(this.f8701C, this.f8807s, true);
            }
        }
    }

    /* renamed from: r */
    public final void m4580r() {
        if (this.f8795o == null) {
            m4559j0();
            m4534W();
            this.f8771g.setLayerType(1, null);
            this.f8771g.setBackground(this.f8703C1);
            return;
        }
        if (m4561k0() && this.f8795o.getBackground() == this.f8703C1) {
            m4534W();
            this.f8795o.setLayerType(1, null);
            return;
        }
        this.f8795o.setVisibility(0);
        this.f8795o.setLayerType(1, null);
        this.f8795o.setImageDrawable(null);
        this.f8795o.setBackground(null);
        m4534W();
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
            this.f8771g.setBackgroundResource(android.R.color.transparent);
        }
        this.f8795o.setBackground(this.f8703C1);
    }

    /* renamed from: r1 */
    public final void m4581r1() {
        m4491k(this.f8810t, this.f8804r, false);
        m4491k(this.f8816v, this.f8804r, false);
        m4491k(this.f8813u, this.f8807s, false);
        m4491k(this.f8819w, this.f8807s, false);
        m4491k(this.f8698B, this.f8804r, true);
        m4491k(this.f8701C, this.f8807s, true);
    }

    /* renamed from: s */
    public final void m4582s(float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f8702C0 == null) {
            return;
        }
        Context context = this.f8759c;
        float f3 = context.getResources().getDisplayMetrics().density;
        float f4 = context.getResources().getDisplayMetrics().scaledDensity;
        float f5 = f3 * 14.0f * f2;
        float f6 = 10.0f * f3 * f2;
        this.f8702C0.setPadding(Math.round(f5), Math.round(f6), AbstractC0062j.m168v(f3, 16.0f, f2), Math.round(f6));
        if (this.f8716H0 != null) {
            int max = Math.max(1, Math.round(72.0f * f3 * f2));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f8716H0.getLayoutParams();
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = max;
                marginLayoutParams2.height = max;
                marginLayoutParams2.setMarginEnd(Math.round(f5));
                this.f8716H0.setLayoutParams(marginLayoutParams2);
            }
        }
        TextView textView = this.f8718I0;
        if (textView != null) {
            AbstractC0062j.m164r(f4, 22.0f, f2, textView, 0);
        }
        TextView textView2 = this.f8720J0;
        if (textView2 != null) {
            AbstractC0062j.m164r(f4, 16.0f, f2, textView2, 0);
        }
        TextView textView3 = this.f8722K0;
        if (textView3 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView3, 0);
            this.f8722K0.setMinWidth(Math.round(f3 * 46.0f * f2));
        }
        TextView textView4 = this.f8724L0;
        if (textView4 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView4, 0);
            this.f8724L0.setMinWidth(Math.round(46.0f * f3 * f2));
        }
        ProgressBar progressBar = this.f8726M0;
        if (progressBar != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar.getLayoutParams()) != null) {
            marginLayoutParams.height = Math.max(1, Math.round(6.0f * f3 * f2));
            int round = Math.round(f3 * 8.0f * f2);
            marginLayoutParams.setMarginStart(round);
            marginLayoutParams.setMarginEnd(round);
            this.f8726M0.setLayoutParams(marginLayoutParams);
        }
        View view = this.f8702C0;
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

    /* renamed from: s0 */
    public final RectF m4583s0() {
        RectF rectF = new RectF();
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup != null && viewGroup.getWidth() > 0 && this.f8771g.getHeight() > 0) {
            float width = this.f8771g.getWidth() - 0.0f;
            float height = this.f8771g.getHeight();
            if (width > 0.0f && height > 0.0f) {
                rectF.set(0.0f, 0.0f, width, height);
            }
        }
        return rectF;
    }

    /* renamed from: s1 */
    public final float m4584s1() {
        ImageView m4575p0 = m4575p0();
        if (m4575p0 == null) {
            m4575p0 = m4529R0();
        }
        float f2 = (this.f8759c.getResources().getDisplayMetrics().density * 87.0f) + 50.0f;
        float width = (m4575p0 == null || m4575p0.getWidth() <= 0) ? 730.0f : m4575p0.getWidth();
        return Math.max(0.2f, (width - f2) / width);
    }

    /* renamed from: t */
    public final void m4585t(boolean z2) {
        int i;
        int i2;
        ViewGroup viewGroup = this.f8771g;
        if (viewGroup == null || this.f8773g1) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8771g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8771g.post(new RunnableC1552l(this, z2, 0));
            return;
        }
        m4535X();
        m4568m1();
        int round = Math.round(this.f8759c.getResources().getDisplayMetrics().density * 96.0f);
        float m4590u1 = m4590u1();
        float max = Math.max(0.0f, Math.min(1.0f, this.f8818v1));
        m4504E(m4590u1);
        m4600y(width, height, round, AbstractC1561o.m4297a(1.0f, this.f8818v1, 0.0f, m4590u1()));
        m4566m(width, height, round, m4590u1);
        boolean z3 = m4590u1 > 0.001f;
        if (this.f8702C0 != null && this.f8762d.f2585W2 && !m4553h0() && !m4567m0()) {
            C0639g.m1872x().m1880u();
            if (C0639g.m1872x().m1880u().m1851a()) {
                if (max >= 0.999f) {
                    this.f8702C0.setAlpha(0.0f);
                    this.f8702C0.setVisibility(4);
                } else if (this.f8702C0.getVisibility() != 0) {
                    this.f8702C0.setVisibility(0);
                }
            }
        }
        View view = this.f8702C0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int i3 = width - 470;
        int max2 = Math.max(0, i3 / 2);
        int m4298b = AbstractC1561o.m4298b(height, round, 40, 0);
        if (!z3) {
            m4582s(1.0f);
            m4588u(this.f8702C0, round, max2, m4298b, max * 40.0f, z2);
            this.f8702C0.setAlpha(1.0f - max);
            this.f8702C0.bringToFront();
            View view2 = this.f8705D0;
            if (view2 != null) {
                view2.bringToFront();
                return;
            }
            return;
        }
        float f2 = ((-0.19999999f) * m4590u1) + 1.0f;
        m4582s(f2);
        int m152f = AbstractC0062j.m152f(round, f2, 1);
        ImageView m4575p0 = m4575p0();
        if (m4575p0 == null || m4575p0.getWidth() <= 0 || m4575p0.getHeight() <= 0) {
            i = max2;
            i2 = m4298b;
        } else {
            float f3 = this.f8812t1;
            float left = m4575p0.getLeft();
            float width2 = m4575p0.getWidth() * f3;
            float height2 = (m4575p0.getHeight() * f3) + m4575p0.getTop();
            float m149c = AbstractC0062j.m149c(width2, 470, 0.5f, left);
            float f4 = height2 + 23.0f;
            float max3 = Math.max(0.0f, (height - m152f) - 8.0f);
            if (f4 > max3) {
                f4 = max3;
            }
            float f5 = max2;
            int m151e = AbstractC0062j.m151e(m149c, f5, m4590u1, f5);
            float f6 = m4298b;
            int m151e2 = AbstractC0062j.m151e(f4, f6, m4590u1, f6);
            int max4 = Math.max(0, Math.min(m151e, Math.max(0, i3)));
            int max5 = Math.max(0, m151e2);
            i = max4;
            i2 = max5;
        }
        m4588u(this.f8702C0, m152f, i, i2, max * 40.0f, z2);
        this.f8702C0.setAlpha(1.0f - max);
        this.f8702C0.bringToFront();
        View view3 = this.f8705D0;
        if (view3 != null) {
            view3.bringToFront();
        }
    }

    /* renamed from: t0 */
    public final float m4586t0(View view) {
        if (view == this.f8749Y) {
            return this.f8809s1;
        }
        if (view != this.f8787l0 && view == this.f8784k0) {
            return this.f8806r1;
        }
        return 0.0f;
    }

    /* renamed from: t1 */
    public final float m4587t1() {
        ImageView m4575p0 = m4575p0();
        if (m4575p0 == null) {
            m4575p0 = m4529R0();
        }
        float width = (m4575p0 == null || m4575p0.getWidth() <= 0) ? 730.0f : m4575p0.getWidth();
        return Math.max(0.2f, (width - 40.0f) / width);
    }

    /* renamed from: u */
    public final void m4588u(View view, int i, int i2, int i3, float f2, boolean z2) {
        float f3 = this.f8736R0;
        if (f3 < 0.0f) {
            f3 = i2;
        }
        float f4 = f3 + 0.0f;
        float f5 = this.f8738S0;
        float f6 = f5 >= 0.0f ? f5 + this.f8740T0 : i3 + f2;
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
        if (z2 && this.f8738S0 >= 0.0f && z3) {
            view.animate().cancel();
            view.setTranslationX(f4 - f7);
            view.setTranslationY(f6 - f8);
            view.animate().translationX(0.0f).translationY(f2).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            view.animate().cancel();
            view.setTranslationX(0.0f);
            view.setTranslationY(f2);
        }
        this.f8736R0 = f7;
        this.f8738S0 = f8;
        this.f8740T0 = f2;
    }

    /* renamed from: u0 */
    public final RectF m4589u0() {
        Rect m4239u = AbstractC1539g1.m4239u();
        ViewGroup viewGroup = this.f8771g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f8771g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4208b0(m4239u, this.f8771g.getWidth(), this.f8771g.getHeight());
    }

    /* renamed from: u1 */
    public final float m4590u1() {
        float m4584s1 = m4584s1();
        float m4587t1 = m4587t1();
        if (Math.abs(m4584s1 - m4587t1) < 0.001f) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (m4587t1 - this.f8812t1) / (m4587t1 - m4584s1)));
    }

    /* renamed from: v */
    public final void m4591v(long j2) {
        boolean z2 = this.f8730O0 > 0;
        ProgressBar progressBar = this.f8726M0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8726M0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f8730O0)));
            }
        }
        TextView textView = this.f8722K0;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8722K0.setText(m4486c0(j2));
            }
        }
        TextView textView2 = this.f8724L0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8724L0.setText(m4486c0(this.f8730O0));
            }
        }
    }

    /* renamed from: v0 */
    public final void m4592v0() {
        float f2 = this.f8759c.getResources().getDisplayMetrics().density * 6.0f;
        m4480W0(this.f8798p, f2);
        m4480W0(this.f8801q, f2);
        m4480W0(this.f8810t, f2);
        m4480W0(this.f8813u, f2);
        m4480W0(this.f8816v, f2);
        m4480W0(this.f8819w, f2);
        m4480W0(this.f8698B, f2);
        m4480W0(this.f8804r, f2);
        m4480W0(this.f8701C, f2);
        m4480W0(this.f8807s, f2);
        for (ImageView imageView : this.f8710F) {
            m4480W0(imageView, f2);
        }
        for (ImageView imageView2 : this.f8713G) {
            m4480W0(imageView2, f2);
        }
        m4480W0(this.f8704D, f2);
        m4480W0(this.f8707E, f2);
        m4480W0(this.f8808s0, f2);
        m4480W0(this.f8811t0, f2);
        m4480W0(this.f8741U, f2);
        m4480W0(this.f8739T, f2);
        m4480W0(this.f8743V, f2);
        m4480W0(this.f8747X, f2);
        m4480W0(this.f8745W, f2);
        m4480W0(this.f8749Y, f2);
        m4480W0(this.f8778i0, f2);
        m4480W0(this.f8775h0, f2);
        m4480W0(this.f8784k0, f2);
        m4480W0(this.f8781j0, f2);
        m4480W0(this.f8828z, f2);
        m4480W0(this.f8695A, f2);
        m4480W0(this.f8751Z, f2);
        m4480W0(this.f8769f0, f2);
        m4480W0(this.f8705D0, f2);
        m4480W0(this.f8702C0, f2);
        m4480W0(this.f8737S, f2);
        m4480W0(this.f8787l0, f2);
        m4480W0(this.f8790m0, f2);
        m4480W0(this.f8783k, 2.0f);
        m4480W0(this.f8786l, 2.0f);
        m4480W0(this.f8789m, 2.0f);
        m4480W0(this.f8795o, 0.0f);
    }

    /* renamed from: v1 */
    public final void m4593v1(boolean z2) {
        this.f8768f.removeCallbacks(this.f8776h1);
        if (z2 && AbstractC1372y1.m3272C()) {
            m4518L0();
            return;
        }
        if (!m4564l0()) {
            m4518L0();
            return;
        }
        m4522O();
        if (z2) {
            AbstractC1372y1.m3287R(true, true);
            m4524P();
            this.f8764d1 = false;
            this.f8782j1 = 0.0f;
            if (m4561k0()) {
                m4602y1();
            } else {
                m4598x0();
            }
            m4603z();
            m4560j1(0.0f, 1.0f, new RunnableC1543i(this, 1));
            return;
        }
        if (m4557i1() && this.f8782j1 > 0.0f) {
            m4603z();
            m4560j1(this.f8782j1, 0.0f, new RunnableC1543i(this, 2));
        } else {
            this.f8764d1 = true;
            this.f8782j1 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m4517L();
        }
    }

    /* renamed from: w */
    public final void m4594w() {
        ViewGroup viewGroup;
        if (this.f8774h == null || (viewGroup = this.f8771g) == null) {
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f8771g.getHeight() <= 0) {
            this.f8771g.post(new RunnableC1543i(this, 3));
            return;
        }
        if (this.f8774h.getLayoutParams() instanceof C1592d) {
            RectF m4583s0 = m4551g1() ? m4583s0() : m4526Q();
            C1592d c1592d = (C1592d) this.f8774h.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m4583s0.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m4583s0.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m4583s0.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m4583s0.top);
            this.f8774h.setLayoutParams(c1592d);
            if (m4605z1() || m4499B1()) {
                this.f8774h.setVisibility(4);
            }
            if (m4499B1() || m4554h1()) {
                float f2 = this.f8759c.getResources().getDisplayMetrics().density * 14.0f;
                View view = this.f8786l;
                if (view == null) {
                    return;
                }
                m4489f(view, 25.0f + f2 + 10.0f);
                C1528d c1528d = this.f8792n;
                if (c1528d != null) {
                    c1528d.m4167b(f2);
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void m4595w0() {
        float max;
        float f2;
        int i;
        AbstractC1539g1.m4228l0(this.f8771g, !this.f8761c1);
        C1572s c1572s = this.f8746W0;
        c1572s.f8681g = Math.max(c1572s.f8676b, Math.min(c1572s.f8677c, m4525P0()));
        C1572s c1572s2 = this.f8748X0;
        c1572s2.f8681g = Math.max(c1572s2.f8676b, Math.min(c1572s2.f8677c, m4523O0()));
        float m4525P0 = m4525P0();
        float m4523O0 = m4523O0();
        TextView textView = this.f8808s0;
        cfgData cfgdata = this.f8762d;
        int i2 = f8691G1;
        if (textView != null) {
            textView.setTextColor(m4525P0 > cfgdata.f2568S1 ? -65536 : m4525P0 > cfgdata.f2564R1 ? -256 : i2);
            this.f8808s0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m4525P0)).replace(",", "."));
        }
        TextView textView2 = this.f8811t0;
        if (textView2 != null) {
            textView2.setTextColor(m4523O0 > cfgdata.f2576U1 ? -65536 : m4523O0 > cfgdata.f2572T1 ? -256 : i2);
            this.f8811t0.setText(AbstractC1256E0.m2986A(m4523O0));
        }
        m4509G0();
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f8765e;
        if (z2) {
            float f3 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            float m1776v = cardata.m1776v();
            max = cfgdata.m1786e(m1775u, m1776v, f3);
            f2 = cfgdata.m1787f(m1775u, m1776v, f3);
            ProgressBar progressBar = this.f8745W;
            if (progressBar != null) {
                progressBar.setProgress(Math.round(m1775u * f3));
            }
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            ProgressBar progressBar2 = this.f8745W;
            if (progressBar2 != null) {
                progressBar2.setProgress(Math.round(max));
            }
            f2 = max;
        }
        C1572s c1572s3 = this.f8750Y0;
        if (c1572s3 != null) {
            c1572s3.f8681g = Math.max(c1572s3.f8676b, Math.min(c1572s3.f8677c, f2));
        }
        int i3 = max < 15.0f ? -65536 : max < 30.0f ? -256 : i2;
        TextView textView3 = this.f8743V;
        if (textView3 != null) {
            Locale locale = Locale.ENGLISH;
            EnumC1457c enumC1457c2 = cfgdata.f2543M0;
            m4487d1(textView3, String.format(locale, "%.0f L", Float.valueOf(enumC1457c2.f7147f ? cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c2 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f) : Math.max(0.0f, cardata.m1774t()) * cfgdata.m1789h())), " L", i3);
        }
        if (this.f8749Y != null) {
            if (!m4545d0() || cfgdata.f2543M0.f7147f) {
                this.f8749Y.setVisibility(4);
            } else {
                this.f8749Y.setVisibility(0);
                float m1777w = cardata.m1777w();
                if (m1777w < 0.0f) {
                    m4487d1(this.f8749Y, "--- km ", " km", i3);
                } else {
                    m4487d1(this.f8749Y, String.format(Locale.ENGLISH, "%.0f km ", Float.valueOf(m1777w)), " km", i3);
                }
            }
        }
        float m1743d = cardata.m1743d();
        C1572s c1572s4 = this.f8752Z0;
        if (c1572s4 != null) {
            float f4 = c1572s4.f8676b;
            float f5 = c1572s4.f8677c;
            if (m1743d < -90.0f) {
                c1572s4.f8681g = Math.max(f4, Math.min(f5, 40.0f));
            } else {
                c1572s4.f8681g = Math.max(f4, Math.min(f5, m1743d));
            }
        }
        ProgressBar progressBar3 = this.f8781j0;
        if (progressBar3 != null) {
            progressBar3.setProgress((m1743d >= -90.0f && m1743d >= 40.0f) ? m1743d > 130.0f ? 100 : Math.round(((m1743d - 40.0f) / 90.0f) * 100.0f) : 0);
        }
        TextView textView4 = this.f8775h0;
        if (textView4 != null) {
            if (m1743d < -90.0f) {
                m4487d1(textView4, "-- °C", " °C", -7829368);
            } else {
                String format = String.format(Locale.ENGLISH, "%.0f °C", Float.valueOf(m1743d));
                if (m1743d < 40.0f) {
                    i2 = -16776961;
                } else if (m1743d > 112.0f) {
                    i2 = -65536;
                } else if (m1743d > 107.0f) {
                    i2 = -256;
                }
                m4487d1(textView4, format, " °C", i2);
            }
        }
        float m1765o = cardata.m1765o();
        TextView textView5 = this.f8719J;
        if (textView5 != null) {
            m4487d1(textView5, m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L", " L", -1);
        }
        if (this.f8721K != null) {
            this.f8721K.setText(this.f8756b.getContext().getString((cardata.m1780z() > 0.0f ? 1 : (cardata.m1780z() == 0.0f ? 0 : -1)) > 0 ? R.string.ip_theme_41_inst_fuel_unit_l100 : R.string.ip_theme_41_inst_fuel_unit_lph));
        }
        m4482Y0(this.f8725M, cardata.m1739b());
        m4482Y0(this.f8731P, cardata.m1737a());
        m4601y0();
        m4505E0();
        if (this.f8772g0 != null) {
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
            this.f8772g0.setText(spannableStringBuilder);
        }
        m4507F0();
        m4503D0();
        m4498B0();
        TextView textView6 = this.f8796o0;
        if (textView6 == null) {
            return;
        }
        textView6.setText(AbstractC1372y1.m3307m(this.f8759c));
    }

    /* renamed from: w1 */
    public final ImageView[] m4596w1(ImageView imageView) {
        if (imageView == this.f8804r) {
            return this.f8710F;
        }
        if (imageView == this.f8807s) {
            return this.f8713G;
        }
        return null;
    }

    /* renamed from: x */
    public final void m4597x(ImageView imageView, ImageView imageView2, float f2, float f3, float f4, float f5, float f6) {
        if (imageView == null || imageView2 == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1543i(this, 16));
            return;
        }
        float width = (imageView2.getWidth() * 0.5f) + imageView2.getLeft();
        float m149c = AbstractC0062j.m149c(width, f3, f2, f3);
        imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setTranslationX((m149c - ((imageView.getWidth() * 0.5f) + imageView.getLeft())) + f5);
        imageView.setTranslationY((AbstractC0062j.m149c((imageView2.getHeight() * 0.5f) + imageView2.getTop(), f4, f2, f4) - ((imageView.getHeight() * 0.5f) + imageView.getTop())) + f6 + 0.0f);
        ImageView imageView3 = this.f8804r;
        if (imageView == imageView3 || imageView == this.f8807s) {
            C1572s c1572s = imageView == imageView3 ? this.f8746W0 : this.f8748X0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m4510H(imageView);
        }
        m4579q1(imageView);
    }

    /* renamed from: x0 */
    public final void m4598x0() {
        C1525c c1525c;
        if (this.f8771g == null) {
            return;
        }
        try {
            if (!this.f8762d.f2561Q2 && !m4567m0()) {
                m4530S();
                return;
            }
            if (!m4605z1()) {
                if (m4561k0()) {
                    m4532U();
                }
                ViewGroup viewGroup = this.f8771g;
                if (viewGroup != null) {
                    viewGroup.setLayerType(0, null);
                }
                View view = this.f8774h;
                if (view != null) {
                    view.setVisibility(8);
                }
                m4500C();
                return;
            }
            if (!m4561k0()) {
                m4577q();
                m4594w();
                return;
            }
            C1574t m4527Q0 = m4527Q0();
            if (m4565l1()) {
                C1525c c1525c2 = this.f8703C1;
                if (c1525c2 != null && c1525c2.m4161c()) {
                    m4559j0();
                    m4580r();
                }
            } else if (m4527Q0.m4472a() && (c1525c = this.f8703C1) != null && !c1525c.m4161c()) {
                m4577q();
                return;
            }
            m4594w();
            m4602y1();
        } finally {
            m4508G();
        }
    }

    /* renamed from: x1 */
    public final void m4599x1() {
        cfgData cfgdata = this.f8762d;
        int i = (cfgdata.f2537K2 && cfgdata.f2589X2 && m4545d0() && !AbstractC1539g1.m4194P(cfgdata, this.f8765e)) ? 0 : 8;
        ImageView imageView = this.f8696A0;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.f8699B0;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
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
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4600y(int i, int i2, int i3, float f2) {
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
        View view4 = this.f8705D0;
        if (view4 == null || view4.getVisibility() != 0) {
            return;
        }
        View view5 = this.f8754a0;
        boolean z2 = view5 != null && view5.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f8769f0;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = (z2 ^ z3) && !(m4496A1() || (m4590u1() > 0.001f ? 1 : (m4590u1() == 0.001f ? 0 : -1)) > 0);
        int m4536Y = m4536Y();
        if (m4536Y <= 0 || (!z2 && !z3)) {
            if (!z2 || (view = this.f8754a0) == null) {
                m4536Y = 0;
            } else if (view.getHeight() > 0) {
                m4536Y = Math.max(0, this.f8754a0.getHeight());
            } else {
                this.f8754a0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                m4536Y = Math.max(0, this.f8754a0.getMeasuredHeight());
            }
            if (z3 && (viewGroup = this.f8769f0) != null) {
                if (viewGroup.getHeight() > 0) {
                    max = Math.max(m4536Y, this.f8769f0.getHeight());
                } else {
                    this.f8769f0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    max = Math.max(m4536Y, this.f8769f0.getMeasuredHeight());
                }
                m4536Y = max;
            }
        }
        if (m4536Y <= 0) {
            View view6 = this.f8708E0;
            if (view6 != null && view6.getVisibility() == 0 && this.f8708E0.getHeight() > 0) {
                m4536Y = this.f8708E0.getHeight();
            } else if (this.f8705D0.getHeight() > 0) {
                m4536Y = this.f8705D0.getHeight();
            }
        }
        if (m4536Y <= 0) {
            this.f8705D0.post(new RunnableC1543i(this, 10));
            return;
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float max3 = Math.max(0.0f, Math.min(1.0f, this.f8818v1));
        float f7 = (max2 * (-0.19999999f)) + 1.0f;
        if (z4) {
            View view7 = z2 ? this.f8754a0 : this.f8769f0;
            if (view7 != null) {
                view7.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(m4536Y, 1073741824));
                if (view7.getMeasuredWidth() > 0) {
                    i4 = view7.getMeasuredWidth();
                    float f8 = i4;
                    float f9 = f8 * f7;
                    float f10 = m4536Y * f7;
                    int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
                    int i8 = i - i4;
                    int m152f = AbstractC0062j.m152f(i8, 0.5f, 0);
                    float f11 = m4298b - m4536Y;
                    float f12 = 1.0f - max2;
                    int max4 = Math.max(0, Math.round(f11 - (27.0f * f12)));
                    if (max2 <= 0.001f) {
                        ImageView m4529R0 = m4529R0();
                        if (m4529R0 == null || m4529R0.getWidth() <= 0 || m4529R0.getHeight() <= 0) {
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
                            float m4584s1 = m4584s1();
                            float f15 = this.f8812t1;
                            float m149c = AbstractC0062j.m149c(m4584s1, f15, max3, f15);
                            f3 = f12;
                            f4 = f8;
                            float width = (((m4529R0.getWidth() * m149c) - f9) * 0.5f) + AbstractC0062j.m149c(1.0f, m149c, m4529R0.getWidth(), m4529R0.getLeft()) + 110.0f;
                            float height = (m4529R0.getHeight() * m149c) + m4529R0.getTop() + 23.0f + 70.0f;
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
                    view2 = this.f8705D0;
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
                        this.f8705D0.setLayoutParams(c1592d);
                        f5 = 0.0f;
                        float max7 = (Math.max(0.0f, Math.min(1.0f, max2)) * (-0.19999999f)) + 1.0f;
                        this.f8705D0.setPivotX(z4 ? 0.5f * f4 : 0.0f);
                        this.f8705D0.setPivotY(0.0f);
                        this.f8705D0.setScaleX(max7);
                        this.f8705D0.setScaleY(max7);
                        this.f8705D0.setTranslationX(0.0f);
                        this.f8705D0.setTranslationY(0.0f);
                    }
                    view3 = this.f8705D0;
                    if (view3 != null) {
                        view3.setTranslationX((-15.0f) * max2);
                        this.f8705D0.setTranslationY(f5);
                    }
                    if (this.f8754a0 != null) {
                        this.f8754a0.setTranslationX((m4496A1() ? -50.0f : (-20.0f) * f3) - (7.0f * max3));
                        this.f8754a0.setTranslationY(max3 * (-40.0f));
                    }
                    if (this.f8769f0 == null) {
                        if (m4496A1()) {
                            f6 = m4567m0() ? -235.0f : -215.0f;
                        } else {
                            f6 = ((z4 ? f5 : max2 * (-10.0f)) - (max2 * 15.0f)) - (f3 * 10.0f);
                        }
                        this.f8769f0.setTranslationX(f6 - (20.0f * max3));
                        this.f8769f0.setTranslationY(max3 * (-40.0f));
                        this.f8769f0.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
        }
        i4 = 470;
        float f82 = i4;
        float f92 = f82 * f7;
        float f102 = m4536Y * f7;
        int m4298b2 = AbstractC1561o.m4298b(i2, i3, 40, 0);
        int i82 = i - i4;
        int m152f2 = AbstractC0062j.m152f(i82, 0.5f, 0);
        float f112 = m4298b2 - m4536Y;
        float f122 = 1.0f - max2;
        int max42 = Math.max(0, Math.round(f112 - (27.0f * f122)));
        if (max2 <= 0.001f) {
        }
        int round2 = m152f2 - Math.round(550.0f * max3);
        view2 = this.f8705D0;
        if (view2 != null) {
        }
        view3 = this.f8705D0;
        if (view3 != null) {
        }
        if (this.f8754a0 != null) {
        }
        if (this.f8769f0 == null) {
        }
    }

    /* renamed from: y0 */
    public final void m4601y0() {
        TextView textView = this.f8787l0;
        carData cardata = this.f8765e;
        if (textView != null) {
            m4487d1(textView, String.format(Locale.ENGLISH, "%.1f V", Float.valueOf(cardata.m1741c())), " V", -1);
        }
        TextView textView2 = this.f8790m0;
        if (textView2 == null) {
            return;
        }
        EnumC1457c enumC1457c = this.f8762d.f2543M0;
        if (enumC1457c.f7149h) {
            String str = (enumC1457c == EnumC1457c.T500_Urban || enumC1457c == EnumC1457c.T400 || enumC1457c == EnumC1457c.T700_100 || enumC1457c == EnumC1457c.T700) ? "%" : "V";
            m4487d1(textView2, String.format(Locale.ENGLISH, "%.1f %s", Float.valueOf(cardata.m1761m()), str), " ".concat(str), -1);
        }
    }

    /* renamed from: y1 */
    public final void m4602y1() {
        float f2;
        float f3;
        if (this.f8771g == null || this.f8703C1 == null || !m4605z1()) {
            ViewGroup viewGroup = this.f8771g;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
                return;
            }
            return;
        }
        if (this.f8771g.getWidth() <= 0 || this.f8771g.getHeight() <= 0) {
            this.f8771g.post(new RunnableC1543i(this, 4));
            return;
        }
        float f4 = this.f8759c.getResources().getDisplayMetrics().density;
        float f5 = 14.0f * f4;
        float f6 = f4 * 1.0f;
        if (m4551g1()) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f2 = f6;
            f3 = f5;
        }
        this.f8703C1.m4160b();
        if (!this.f8703C1.m4161c()) {
            C1525c c1525c = this.f8703C1;
            m4551g1();
            c1525c.m4162d(-16777216);
        }
        if (m4551g1()) {
            ViewGroup viewGroup2 = this.f8771g;
            if (viewGroup2 != null) {
                viewGroup2.getOverlay().clear();
            }
            RectF m4583s0 = m4583s0();
            if (m4583s0.width() > 0.0f && m4583s0.height() > 0.0f) {
                this.f8703C1.m4159a(m4583s0.left, m4583s0.top, m4583s0.right, m4583s0.bottom, f3, f2);
            }
        } else if (m4499B1() || m4554h1()) {
            RectF m4526Q = m4526Q();
            if (m4499B1() && !m4554h1()) {
                m4526Q = m4477T0(m4526Q, this.f8815u1);
            }
            if (m4526Q.width() <= 0.0f || m4526Q.height() <= 0.0f) {
                ViewGroup viewGroup3 = this.f8771g;
                if (viewGroup3 != null) {
                    viewGroup3.getOverlay().clear();
                }
            } else {
                this.f8703C1.m4159a(m4526Q.left, m4526Q.top, m4526Q.right, m4526Q.bottom, f5, 0.0f);
                ViewGroup viewGroup4 = this.f8771g;
                if (viewGroup4 != null) {
                    viewGroup4.getOverlay().clear();
                }
            }
        } else {
            ViewGroup viewGroup5 = this.f8771g;
            if (viewGroup5 != null) {
                viewGroup5.getOverlay().clear();
            }
        }
        if (m4557i1()) {
            RectF m4477T0 = m4477T0(m4589u0(), this.f8782j1);
            if (m4477T0.width() > 0.0f && m4477T0.height() > 0.0f) {
                this.f8703C1.m4159a(m4477T0.left, m4477T0.top, m4477T0.right, m4477T0.bottom, f5, 0.0f);
            }
        }
        ImageView imageView = this.f8795o;
        if (imageView != null && imageView.getBackground() == this.f8703C1) {
            this.f8795o.invalidate();
        } else if (this.f8771g.getBackground() == this.f8703C1) {
            this.f8771g.invalidate();
        }
    }

    /* renamed from: z */
    public final void m4603z() {
        m4497B();
        boolean m4545d0 = m4545d0();
        ImageView m4575p0 = m4575p0();
        cfgData cfgdata = this.f8762d;
        boolean z2 = cfgdata.f2636h2;
        ImageView imageView = z2 ? this.f8807s : this.f8804r;
        TextView textView = z2 ? this.f8811t0 : this.f8808s0;
        m4490f1(m4575p0, m4545d0);
        m4490f1(imageView, m4545d0);
        m4543c1(imageView, m4545d0);
        m4490f1(textView, m4545d0 && AbstractC1539g1.m4220h0(cfgdata, null));
        m4490f1(this.f8704D, false);
        m4490f1(this.f8707E, false);
        m4541b1(m4575p0, m4545d0);
        if (m4545d0) {
            m4569n(m4575p0, imageView, textView, m4578q0(), false, this.f8812t1, 0.0f, 0.0f);
        } else {
            m4515J0();
        }
        m4585t(false);
        m4556i0();
        m4494A();
        m4581r1();
    }

    /* renamed from: z0 */
    public final void m4604z0(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f8762d;
        if (cfgdata.f2537K2 && cfgdata.f2589X2) {
            boolean m4545d0 = m4545d0();
            carData cardata = this.f8765e;
            if (m4545d0 || AbstractC1539g1.m4194P(cfgdata, cardata)) {
                byte b2 = (byte) (i & 15);
                byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
                EnumC1457c enumC1457c = cfgdata.f2543M0;
                if (!AbstractC1539g1.m4194P(cfgdata, cardata) && (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite)) {
                    b3 = 1;
                    b2 = 1;
                }
                if (b2 == 1) {
                    ImageView imageView2 = this.f8823x0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView2 = this.f8826y0;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                    }
                } else if (b2 == 2) {
                    ImageView imageView3 = this.f8823x0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        this.f8823x0.setColorFilter(-7829368);
                    }
                    TextView textView3 = this.f8826y0;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    ImageView imageView4 = this.f8823x0;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        this.f8823x0.setColorFilter(-16711936);
                    }
                    TextView textView4 = this.f8826y0;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
                if (cardata.m1747f() < 20 && (textView = this.f8826y0) != null) {
                    textView.setVisibility(4);
                }
                if (b3 == 1) {
                    ImageView imageView5 = this.f8829z0;
                    if (imageView5 != null) {
                        imageView5.setVisibility(4);
                    }
                } else if (b3 == 2) {
                    ImageView imageView6 = this.f8829z0;
                    if (imageView6 != null) {
                        imageView6.setVisibility(0);
                        this.f8829z0.setColorFilter(-7829368);
                    }
                } else if (b3 == 3 && (imageView = this.f8829z0) != null) {
                    imageView.setVisibility(0);
                    this.f8829z0.setColorFilter(-16711936);
                }
                m4599x1();
                m4521N();
                return;
            }
        }
        m4540b0();
    }

    /* renamed from: z1 */
    public final boolean m4605z1() {
        return this.f8762d.f2537K2 && (m4557i1() || m4570n0() || m4567m0() || m4499B1());
    }
}
