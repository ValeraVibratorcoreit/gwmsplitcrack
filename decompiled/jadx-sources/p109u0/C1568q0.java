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
import p001A0.RunnableC0018l;
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

/* renamed from: u0.q0 */
/* loaded from: classes.dex */
public final class C1568q0 {

    /* renamed from: u1 */
    public static final int f8540u1 = Color.rgb(232, 245, 236);

    /* renamed from: v1 */
    public static final int f8541v1 = Color.rgb(140, 224, 168);

    /* renamed from: A0 */
    public long f8543A0;

    /* renamed from: B */
    public TextView f8544B;

    /* renamed from: B0 */
    public boolean f8545B0;

    /* renamed from: C */
    public TextView f8546C;

    /* renamed from: C0 */
    public long f8547C0;

    /* renamed from: D */
    public TextView f8548D;

    /* renamed from: E */
    public TextView f8550E;

    /* renamed from: F */
    public TextView f8552F;

    /* renamed from: F0 */
    public float f8553F0;

    /* renamed from: G */
    public TextView f8554G;

    /* renamed from: G0 */
    public boolean f8555G0;

    /* renamed from: H */
    public TextView f8556H;

    /* renamed from: H0 */
    public C1531e f8557H0;

    /* renamed from: I */
    public TextView f8558I;

    /* renamed from: I0 */
    public C1572s f8559I0;

    /* renamed from: J */
    public TextView f8560J;

    /* renamed from: J0 */
    public C1572s f8561J0;

    /* renamed from: K */
    public View f8562K;

    /* renamed from: K0 */
    public C1572s f8563K0;

    /* renamed from: L */
    public TextView f8564L;

    /* renamed from: L0 */
    public C1572s f8565L0;

    /* renamed from: M */
    public TextView f8566M;

    /* renamed from: M0 */
    public boolean f8567M0;

    /* renamed from: N */
    public TextView f8568N;

    /* renamed from: N0 */
    public boolean f8569N0;

    /* renamed from: O */
    public View f8570O;

    /* renamed from: P */
    public View f8572P;

    /* renamed from: Q */
    public TextView f8574Q;

    /* renamed from: Q0 */
    public ValueAnimator f8575Q0;

    /* renamed from: R */
    public ViewGroup f8576R;

    /* renamed from: R0 */
    public ValueAnimator f8577R0;

    /* renamed from: S */
    public TextView f8578S;

    /* renamed from: S0 */
    public boolean f8579S0;

    /* renamed from: T */
    public TextView f8580T;

    /* renamed from: U */
    public TextView f8582U;

    /* renamed from: V */
    public ViewGroup f8584V;

    /* renamed from: W */
    public TextView f8586W;

    /* renamed from: W0 */
    public float f8587W0;

    /* renamed from: X */
    public TextView f8588X;

    /* renamed from: X0 */
    public float f8589X0;

    /* renamed from: Y */
    public TextView f8590Y;

    /* renamed from: Y0 */
    public boolean f8591Y0;

    /* renamed from: Z */
    public TextView f8592Z;

    /* renamed from: Z0 */
    public Boolean f8593Z0;

    /* renamed from: a */
    public final C1537g f8594a;

    /* renamed from: a0 */
    public TextView f8595a0;

    /* renamed from: b */
    public final View f8597b;

    /* renamed from: b0 */
    public TextView f8598b0;

    /* renamed from: b1 */
    public Boolean f8599b1;

    /* renamed from: c */
    public final Context f8600c;

    /* renamed from: c0 */
    public ImageView f8601c0;

    /* renamed from: c1 */
    public float f8602c1;

    /* renamed from: d0 */
    public ImageView f8604d0;

    /* renamed from: d1 */
    public float f8605d1;

    /* renamed from: e0 */
    public TextView f8607e0;

    /* renamed from: e1 */
    public float f8608e1;

    /* renamed from: f0 */
    public TextView f8610f0;

    /* renamed from: f1 */
    public float f8611f1;

    /* renamed from: g */
    public ViewGroup f8612g;

    /* renamed from: g0 */
    public TextView f8613g0;

    /* renamed from: g1 */
    public float f8614g1;

    /* renamed from: h */
    public View f8615h;

    /* renamed from: h0 */
    public TextView f8616h0;

    /* renamed from: i */
    public View f8618i;

    /* renamed from: i0 */
    public View f8619i0;

    /* renamed from: j */
    public View f8621j;

    /* renamed from: j0 */
    public ImageView f8622j0;

    /* renamed from: k */
    public View f8624k;

    /* renamed from: k0 */
    public TextView f8625k0;

    /* renamed from: k1 */
    public ValueAnimator f8626k1;

    /* renamed from: l */
    public View f8627l;

    /* renamed from: l0 */
    public ImageView f8628l0;

    /* renamed from: l1 */
    public boolean f8629l1;

    /* renamed from: m */
    public View f8630m;

    /* renamed from: m0 */
    public ImageView f8631m0;

    /* renamed from: n */
    public C1528d f8633n;

    /* renamed from: n0 */
    public ImageView f8634n0;

    /* renamed from: n1 */
    public Boolean f8635n1;

    /* renamed from: o */
    public ImageView f8636o;

    /* renamed from: o0 */
    public View f8637o0;

    /* renamed from: o1 */
    public float f8638o1;

    /* renamed from: p */
    public ImageView f8639p;

    /* renamed from: p0 */
    public View f8640p0;

    /* renamed from: q */
    public ImageView f8642q;

    /* renamed from: q0 */
    public View f8643q0;

    /* renamed from: q1 */
    public C1525c f8644q1;

    /* renamed from: r */
    public ImageView f8645r;

    /* renamed from: r0 */
    public View f8646r0;

    /* renamed from: s */
    public ImageView f8648s;

    /* renamed from: s0 */
    public int f8649s0;

    /* renamed from: t */
    public ImageView f8651t;

    /* renamed from: t0 */
    public ImageView f8652t0;

    /* renamed from: u */
    public ImageView f8654u;

    /* renamed from: u0 */
    public TextView f8655u0;

    /* renamed from: v */
    public Bitmap f8656v;

    /* renamed from: v0 */
    public TextView f8657v0;

    /* renamed from: w */
    public Bitmap f8658w;

    /* renamed from: w0 */
    public TextView f8659w0;

    /* renamed from: x0 */
    public TextView f8661x0;

    /* renamed from: y0 */
    public ProgressBar f8663y0;

    /* renamed from: z0 */
    public long f8665z0;

    /* renamed from: d */
    public final cfgData f8603d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f8606e = carData.getInstance();

    /* renamed from: f */
    public final Handler f8609f = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    public ImageView[] f8660x = new ImageView[0];

    /* renamed from: y */
    public ImageView[] f8662y = new ImageView[0];

    /* renamed from: z */
    public final float[] f8664z = new float[0];

    /* renamed from: A */
    public final float[] f8542A = new float[0];

    /* renamed from: D0 */
    public float f8549D0 = -1.0f;

    /* renamed from: E0 */
    public float f8551E0 = -1.0f;

    /* renamed from: O0 */
    public boolean f8571O0 = true;

    /* renamed from: P0 */
    public boolean f8573P0 = true;

    /* renamed from: T0 */
    public final RunnableC1544i0 f8581T0 = new RunnableC1544i0(this, 4);

    /* renamed from: U0 */
    public boolean f8583U0 = false;

    /* renamed from: V0 */
    public float f8585V0 = 0.0f;

    /* renamed from: a1 */
    public int f8596a1 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: h1 */
    public float f8617h1 = 1.0f;

    /* renamed from: i1 */
    public float f8620i1 = 0.0f;

    /* renamed from: j1 */
    public float f8623j1 = 0.0f;

    /* renamed from: m1 */
    public int f8632m1 = -1;

    /* renamed from: p1 */
    public int f8641p1 = 999;

    /* renamed from: r1 */
    public final RunnableC1565p0 f8647r1 = new RunnableC1565p0(this, 0);

    /* renamed from: s1 */
    public final RunnableC1565p0 f8650s1 = new RunnableC1565p0(this, 1);

    /* renamed from: t1 */
    public final RunnableC1565p0 f8653t1 = new RunnableC1565p0(this, 2);

    public C1568q0(C1537g c1537g, View view) {
        this.f8594a = c1537g;
        this.f8597b = view;
        this.f8600c = view.getContext();
    }

    /* renamed from: A */
    public static void m4316A(View view, float f2, float f3) {
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
    public static void m4317I(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
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
    public static void m4318N0(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    /* renamed from: R */
    public static ImageView[] m4319R(ImageView imageView) {
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
    public static RectF m4320S0(RectF rectF, float f2) {
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
    public static void m4321T0(View view, int i) {
        if (view == null || !(view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: U0 */
    public static void m4322U0(TextView textView, float f2, String str, int i) {
        if (textView == null) {
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, str));
        spannableString.setSpan(AbstractC0062j.m155i(textView, -7829368, i), 0, replace.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: V0 */
    public static void m4323V0(View view, float f2) {
        if (view != null) {
            view.setElevation(f2);
        }
    }

    /* renamed from: W0 */
    public static void m4324W0(View view, int i) {
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

    /* renamed from: X0 */
    public static void m4325X0(View view, float f2) {
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

    /* renamed from: Y */
    public static String m4326Y(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: Y0 */
    public static void m4327Y0(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(-1);
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: Z0 */
    public static void m4328Z0(TextView textView, float f2, float f3) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, f2 * f3);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(0.0f, 1.0f);
    }

    /* renamed from: a */
    public static void m4329a(C1568q0 c1568q0, ImageView[] imageViewArr, float[] fArr, float f2, float f3) {
        c1568q0.getClass();
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
    public static void m4330a1(View view, int i) {
        if (view != null) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: d0 */
    public static void m4331d0(ImageView imageView, float f2, boolean z2, float[] fArr, float[] fArr2) {
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
    public static void m4332f(View view, float f2) {
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
    public static void m4333f1(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: g1 */
    public static void m4334g1(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: h1 */
    public static void m4335h1(ImageView imageView, C1572s c1572s) {
        if (imageView == null || c1572s == null) {
            return;
        }
        imageView.post(new RunnableC1559n0(imageView, 0, c1572s));
    }

    /* renamed from: l */
    public static void m4336l(ImageView imageView, boolean z2) {
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
    public final void m4337A0() {
        TextView textView = this.f8592Z;
        if (textView == null) {
            return;
        }
        if (!this.f8603d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f8606e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f8592Z.setVisibility(4);
            return;
        }
        this.f8592Z.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f8592Z, -7829368, -1), 0, replace.length(), 33);
        this.f8592Z.setText(spannableString);
    }

    /* renamed from: A1 */
    public final boolean m4338A1() {
        return m4400j0() || m4403k0() || m4405l0() || this.f8603d.f2635h1 == 2;
    }

    /* renamed from: B */
    public final void m4339B(float f2) {
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, f2));
        if (m4400j0()) {
            max = 1.0f;
        }
        m4325X0(this.f8637o0, max);
        m4325X0(this.f8562K, max);
        float max2 = Math.max(0.0f, Math.min(1.0f, this.f8623j1));
        if (max2 > 0.001f) {
            m4387d1(this.f8570O, max2);
            m4387d1(this.f8584V, max2);
            m4387d1(this.f8572P, max2);
        } else {
            m4325X0(this.f8570O, max);
            m4325X0(this.f8572P, max);
            m4325X0(this.f8584V, max);
        }
    }

    /* renamed from: B0 */
    public final void m4340B0(C0636d c0636d) {
        View view = this.f8637o0;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        if (!this.f8603d.f2585W2 || m4389e0() || m4400j0() || c0636d == null || !c0636d.m1851a()) {
            this.f8637o0.setVisibility(8);
            this.f8637o0.setAlpha(1.0f);
            m4418p1();
            m4419q(false);
            return;
        }
        this.f8637o0.setVisibility(this.f8623j1 >= 0.999f ? 4 : 0);
        if (this.f8623j1 >= 0.999f) {
            this.f8637o0.setAlpha(0.0f);
        }
        TextView textView = this.f8655u0;
        if (textView != null) {
            String str = c0636d.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f8657v0;
        if (textView2 != null) {
            String str2 = c0636d.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            this.f8657v0.setVisibility((str2 == null || str2.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f8652t0;
        if (imageView != null) {
            Bitmap bitmap = c0636d.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f8652t0.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f8652t0.setVisibility(8);
            }
        }
        this.f8543A0 = c0636d.f3002h;
        this.f8665z0 = c0636d.f3001g;
        this.f8545B0 = c0636d.f3000f;
        this.f8547C0 = SystemClock.elapsedRealtime();
        m4425s(this.f8665z0);
        m4418p1();
        m4419q(false);
    }

    /* renamed from: B1 */
    public final boolean m4341B1() {
        return m4405l0() || this.f8603d.f2635h1 == 2 || this.f8620i1 > 0.001f || this.f8623j1 > 0.001f || this.f8617h1 < 0.999f;
    }

    /* renamed from: C */
    public final void m4342C() {
        if (this.f8617h1 < 0.999f) {
            return;
        }
        m4411n0();
        m4414o0();
        m4378Z(this.f8617h1);
        m4370Q0();
        m4371R0();
        m4378Z(this.f8617h1);
        m4408m0();
    }

    /* renamed from: C0 */
    public final void m4343C0() {
        ImageView imageView = this.f8601c0;
        carData cardata = this.f8606e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f8604d0 != null) {
            this.f8604d0.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f8604d0.setColorFilter(cardata.m1713A() ? -256 : -1);
        }
    }

    /* renamed from: C1 */
    public final boolean m4344C1() {
        cfgData cfgdata = this.f8603d;
        int i = cfgdata.f2635h1;
        if (i == 0) {
            return true;
        }
        return i == 2 && AbstractC1539g1.m4194P(cfgdata, this.f8606e);
    }

    /* renamed from: D */
    public final void m4345D() {
        boolean m4341B1 = m4341B1();
        Boolean bool = this.f8635n1;
        if (bool == null || bool.booleanValue() != m4341B1) {
            this.f8635n1 = Boolean.valueOf(m4341B1);
            m4438w0();
        }
        if (m4341B1 && m4448z1()) {
            m4428t();
            m4445y1();
        } else if (!m4403k0() && !m4400j0() && !m4404k1()) {
            m4376W();
        }
        float m4297a = m4341B1 ? AbstractC1561o.m4297a(1.0f, this.f8623j1, 0.0f, this.f8620i1) : 0.0f;
        if (m4400j0() || m4389e0()) {
            m4333f1(this.f8624k);
            m4333f1(this.f8627l);
            m4333f1(this.f8630m);
        } else {
            float f2 = this.f8600c.getResources().getDisplayMetrics().density;
            float f3 = (80.0f * f2) + 10.0f;
            float f4 = f2 * 14.0f;
            m4332f(this.f8624k, f3);
            m4332f(this.f8630m, f3);
            View view = this.f8627l;
            if (view != null) {
                m4332f(view, f4 + 25.0f + 10.0f);
                C1528d c1528d = this.f8633n;
                if (c1528d != null) {
                    c1528d.m4167b(f4);
                }
            }
            m4316A(this.f8624k, m4297a, f3);
            m4316A(this.f8627l, m4297a, f4 + 25.0f + 10.0f);
            m4316A(this.f8630m, m4297a, f3);
        }
        if (m4341B1) {
            View view2 = this.f8624k;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.f8627l;
            if (view3 != null) {
                view3.bringToFront();
            }
            View view4 = this.f8630m;
            if (view4 != null) {
                view4.bringToFront();
            }
        }
        View view5 = this.f8640p0;
        if (view5 != null) {
            view5.bringToFront();
        }
        View view6 = this.f8637o0;
        if (view6 != null && view6.getVisibility() == 0) {
            this.f8637o0.bringToFront();
            View view7 = this.f8640p0;
            if (view7 != null) {
                view7.bringToFront();
            }
        }
        View view8 = this.f8562K;
        if (view8 != null && view8.getVisibility() == 0) {
            this.f8562K.bringToFront();
        }
        m4419q(false);
        m4342C();
        m4391f0();
        if (m4379a0()) {
            ImageView m4411n0 = m4411n0();
            cfgData cfgdata = this.f8603d;
            boolean z2 = cfgdata.f2636h2;
            m4402k(m4411n0, z2 ? this.f8648s : this.f8645r, z2 ? this.f8610f0 : this.f8607e0, m4414o0(), false, this.f8617h1, 0.0f, 0.0f);
            m4421q1(m4411n0(), this.f8617h1, false, 0.0f, 0.0f);
            if (m4404k1()) {
                m4443y();
            } else {
                ImageView m4370Q0 = m4370Q0();
                boolean z3 = cfgdata.f2636h2;
                m4402k(m4370Q0, z3 ? this.f8645r : this.f8648s, z3 ? this.f8607e0 : this.f8610f0, m4371R0(), true, this.f8617h1, 0.0f, 0.0f);
                m4421q1(m4370Q0(), this.f8617h1, true, 0.0f, 0.0f);
            }
            m4440x();
        }
    }

    /* renamed from: D0 */
    public final void m4346D0() {
        if (this.f8568N == null) {
            return;
        }
        cfgData cfgdata = this.f8603d;
        if (!cfgdata.f2537K2 || m4389e0() || ((!m4379a0() && !m4400j0()) || (!cfgdata.f2569S2 && !cfgdata.f2577U2 && !cfgdata.f2573T2))) {
            this.f8568N.setVisibility(8);
            m4390e1();
            m4418p1();
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = cfgdata.f2569S2;
        carData cardata = this.f8606e;
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
            this.f8568N.setVisibility(8);
            m4390e1();
            m4418p1();
            return;
        }
        TextView textView = this.f8568N;
        SpannableString spannableString = new SpannableString(sb2);
        textView.setTextColor(-1);
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
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        this.f8568N.setVisibility(0);
        m4390e1();
        m4418p1();
    }

    /* renamed from: E */
    public final void m4347E() {
        View view = this.f8618i;
        if (view == null) {
            return;
        }
        cfgData cfgdata = this.f8603d;
        boolean z2 = cfgdata.f2625f1 != EnumC1455a.f6981n;
        boolean z3 = view.getVisibility() == 0;
        this.f8618i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            AbstractC1539g1.m4215f(R.drawable.ip_theme_47_top_bar, this.f8618i, AbstractC1539g1.m4230m0(cfgdata, this.f8606e));
            AbstractC1539g1.m4221i(this.f8595a0, this.f8598b0, cfgdata, m4379a0());
        }
        if (z3 == z2 || !m4395h0()) {
            return;
        }
        m4428t();
        m4445y1();
    }

    /* renamed from: E0 */
    public final void m4348E0() {
        if (this.f8598b0 == null) {
            return;
        }
        float m1773s = this.f8606e.m1773s();
        if (m1773s < -90.0f) {
            this.f8598b0.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        this.f8598b0.setTextColor(-7829368);
        spannableString.setSpan(new ForegroundColorSpan(f8540u1), 0, replace.length(), 33);
        this.f8598b0.setText(spannableString);
    }

    /* renamed from: F */
    public final void m4349F(ImageView imageView) {
        ImageView[] m4439w1 = m4439w1(imageView);
        if (m4439w1 == null || imageView == null) {
            return;
        }
        float pivotX = imageView.getPivotX();
        float pivotY = imageView.getPivotY();
        float scaleX = imageView.getScaleX();
        float scaleY = imageView.getScaleY();
        float translationX = imageView.getTranslationX();
        float translationY = imageView.getTranslationY();
        for (ImageView imageView2 : m4439w1) {
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
    public final void m4350F0() {
        cfgData cfgdata = this.f8603d;
        if (cfgdata.f2537K2 && m4400j0() && !m4379a0()) {
            carData cardata = this.f8606e;
            float m1780z = cardata.m1780z();
            float f2 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
            float m1779y = cardata.m1779y() / 1000.0f;
            float f3 = m1779y >= 0.0f ? m1779y : 0.0f;
            TextView textView = this.f8613g0;
            int i = -1;
            if (textView != null) {
                textView.setTextColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : -1);
                this.f8613g0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)).replace(",", "."));
            }
            TextView textView2 = this.f8616h0;
            if (textView2 != null) {
                if (f3 > cfgdata.f2576U1) {
                    i = -65536;
                } else if (f3 > cfgdata.f2572T1) {
                    i = -256;
                }
                textView2.setTextColor(i);
                this.f8616h0.setText(AbstractC1256E0.m2986A(f3));
            }
        }
    }

    /* renamed from: G */
    public final void m4351G(TextView textView) {
        if (textView == null) {
            return;
        }
        if (Math.abs(0.0f) < 0.001f) {
            m4318N0(textView, 0.0f, 0.0f);
        } else if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            textView.post(new RunnableC0018l(this, 27, textView));
        } else {
            m4317I(textView, 1.0f, textView.getLeft(), textView.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: G0 */
    public final void m4352G0() {
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup == null || this.f8579S0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8612g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8612g.post(new RunnableC1544i0(this, 20));
            return;
        }
        int round = Math.round(this.f8600c.getResources().getDisplayMetrics().density * 96.0f);
        float m4433u1 = m4433u1();
        m4339B(m4433u1);
        m4434v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f8623j1, 0.0f, m4433u1()));
        m4399j(width, height, round, m4433u1);
    }

    /* renamed from: H */
    public final void m4353H() {
        boolean z2 = this.f8603d.f2537K2 && m4400j0() && !m4379a0();
        m4334g1(this.f8619i0, z2);
        m4334g1(this.f8613g0, z2);
        m4334g1(this.f8616h0, z2);
        m4351G(this.f8613g0);
        m4351G(this.f8616h0);
    }

    /* renamed from: H0 */
    public final float m4354H0(float f2) {
        float f3 = this.f8608e1;
        return f2 >= 0.999f ? f3 - (-21.0f) : f3;
    }

    /* renamed from: I0 */
    public final void m4355I0(ImageView imageView) {
        View[] m4381b0 = m4381b0(imageView);
        int length = m4381b0.length;
        for (int i = 0; i < length; i++) {
            View view = m4381b0[i];
            m4318N0(view, view == this.f8566M ? m4354H0(this.f8617h1) : m4423r0(view), m4426s0(view));
        }
    }

    /* renamed from: J */
    public final void m4356J() {
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f8571O0);
        cfgData cfgdata = this.f8603d;
        if (!cfgdata.f2537K2) {
            m4361L0();
            this.f8612g.setVisibility(4);
            m4369Q();
            m4347E();
            m4377X();
            m4394h();
            View view = this.f8615h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        boolean m4379a0 = m4379a0();
        carData cardata = this.f8606e;
        if (m4379a0) {
            this.f8612g.setVisibility(0);
            boolean m4403k0 = m4403k0();
            Boolean bool = this.f8593Z0;
            if (bool == null || bool.booleanValue() != m4403k0) {
                this.f8593Z0 = Boolean.valueOf(m4403k0);
            }
            m4438w0();
            m4392g();
            m4444y0(cardata.m1745e());
            m4437w();
            m4353H();
            m4394h();
            View view2 = this.f8615h;
            if (view2 != null) {
                view2.setVisibility(m4448z1() ? 4 : 8);
            }
            if (m4448z1()) {
                m4428t();
                m4445y1();
                return;
            }
            return;
        }
        m4361L0();
        this.f8612g.setVisibility(0);
        if (m4389e0()) {
            m4369Q();
            View view3 = this.f8615h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else if (cfgdata.f2561Q2) {
            m4438w0();
            View view4 = this.f8615h;
            if (view4 != null) {
                view4.setVisibility(4);
            }
            if (m4448z1()) {
                m4428t();
                m4445y1();
            }
        } else {
            if (m4400j0()) {
                m4438w0();
                if (m4448z1()) {
                    m4445y1();
                }
            } else {
                m4369Q();
            }
            View view5 = this.f8615h;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        m4334g1(this.f8639p, false);
        m4334g1(this.f8642q, false);
        m4334g1(this.f8645r, false);
        m4334g1(this.f8648s, false);
        m4385c1(this.f8645r, false);
        m4385c1(this.f8648s, false);
        m4334g1(this.f8651t, false);
        m4334g1(this.f8654u, false);
        m4334g1(this.f8607e0, false);
        m4334g1(this.f8610f0, false);
        m4334g1(this.f8564L, false);
        m4334g1(this.f8566M, false);
        m4334g1(this.f8588X, false);
        m4334g1(this.f8590Y, false);
        if (m4379a0() || AbstractC1539g1.m4194P(cfgdata, cardata)) {
            m4442x1();
        } else {
            m4377X();
        }
        if (!m4400j0()) {
            m4334g1(this.f8568N, false);
            m4334g1(this.f8574Q, false);
            View view6 = this.f8572P;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            m4334g1(this.f8584V, false);
            m4418p1();
        }
        m4363M0();
        m4357J0();
        m4392g();
        m4444y0(cardata.m1745e());
        m4353H();
        m4350F0();
        m4394h();
        m4340B0(C0639g.m1872x().m1880u());
        m4419q(false);
        m4342C();
        m4391f0();
        m4347E();
    }

    /* renamed from: J0 */
    public final void m4357J0() {
        ImageView m4411n0 = m4411n0();
        boolean z2 = this.f8603d.f2636h2;
        ImageView imageView = z2 ? this.f8648s : this.f8645r;
        TextView textView = z2 ? this.f8610f0 : this.f8607e0;
        m4318N0(m4411n0, 0.0f, 0.0f);
        m4359K0(imageView);
        m4318N0(textView, 0.0f, m4414o0());
        m4355I0(m4411n0);
    }

    /* renamed from: K */
    public final void m4358K() {
        final RunnableC1544i0 runnableC1544i0 = new RunnableC1544i0(this, 2);
        final int i = 10;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        };
        carData cardata = this.f8606e;
        C1537g c1537g = this.f8594a;
        cardata.m1754i0(c1537g, interfaceC0561z);
        final int i2 = 11;
        cardata.m1750g0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i3 = 12;
        cardata.m1742c0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i4 = 13;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i5 = 14;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i6 = 15;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i7 = 16;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i8 = 17;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i9 = 18;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i10 = 0;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i12 = 2;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i13 = 3;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i14 = 4;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i15 = 5;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i16 = 6;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i17 = 7;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i18 = 8;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i18) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i19 = 9;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.k0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i19) {
                    case 0:
                        runnableC1544i0.run();
                        break;
                    case 1:
                        runnableC1544i0.run();
                        break;
                    case 2:
                        runnableC1544i0.run();
                        break;
                    case 3:
                        runnableC1544i0.run();
                        break;
                    case 4:
                        runnableC1544i0.run();
                        break;
                    case 5:
                        runnableC1544i0.run();
                        break;
                    case 6:
                        runnableC1544i0.run();
                        break;
                    case 7:
                        runnableC1544i0.run();
                        break;
                    case 8:
                        runnableC1544i0.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1544i0.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1544i0.run();
                        break;
                    case 13:
                        runnableC1544i0.run();
                        break;
                    case 14:
                        runnableC1544i0.run();
                        break;
                    case 15:
                        runnableC1544i0.run();
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        runnableC1544i0.run();
                        break;
                    case 17:
                        runnableC1544i0.run();
                        break;
                    default:
                        runnableC1544i0.run();
                        break;
                }
            }
        });
        final int i20 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i21 = cfgdata4.f2635h1;
                                                    if (i21 >= 0 && i21 <= 2) {
                                                        r4 = i21;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i24 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f8600c);
        final int i26 = 6;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 8;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 9;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 10;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 11;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 12;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 13;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 14;
        cardata.m1752h0(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i35 = 15;
        cardata.m1756j0(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
        final int i36 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.l0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8374b;

            {
                this.f8374b = this;
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
                        this.f8374b.m4348E0();
                        break;
                    case 1:
                        this.f8374b.m4343C0();
                        break;
                    case 2:
                        this.f8374b.m4343C0();
                        break;
                    case 3:
                        this.f8374b.m4343C0();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1568q0 c1568q0 = this.f8374b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1568q0.getClass();
                            intValue = num.intValue();
                        }
                        if (c1568q0.f8641p1 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1568q0.f8600c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1568q0.f8603d;
                            if (cfgdata.f2537K2) {
                                c1568q0.f8638o1 = 1.0f;
                            }
                            if (cfgdata.f2553O2) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1568q0.f8641p1 == -1 && intValue > -1) {
                            c1568q0.f8638o1 = 0.0f;
                            ViewGroup viewGroup = c1568q0.f8612g;
                            if (viewGroup != null) {
                                viewGroup.animate().cancel();
                                c1568q0.f8612g.setAlpha(1.0f);
                            }
                            c1568q0.m4412n1("ip");
                        }
                        c1568q0.f8641p1 = intValue;
                        c1568q0.m4337A0();
                        break;
                    case 5:
                        this.f8374b.m4337A0();
                        break;
                    case 6:
                        C1568q0 c1568q02 = this.f8374b;
                        Integer num2 = (Integer) obj;
                        c1568q02.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (!AbstractC1372y1.m3315u(c1568q02.f8600c, num2.intValue())) {
                                    if (num2.intValue() != 17 && num2.intValue() != 5) {
                                        if (num2.intValue() != 1) {
                                            if (num2.intValue() != 4) {
                                                if (num2.intValue() != 6) {
                                                    if (num2.intValue() != 3 || !c1568q02.f8603d.f2561Q2) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                                if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1568q02.f8583U0 || !c1568q02.m4404k1()) {
                                                                    if (num2.intValue() != 9) {
                                                                        if (num2.intValue() == 12 && AbstractC1539g1.m4211d(c1568q02.f8603d, c1568q02.f8606e)) {
                                                                            AbstractC1372y1.m3296b();
                                                                            cfgData cfgdata2 = c1568q02.f8603d;
                                                                            cfgdata2.f2557P2 = !cfgdata2.f2557P2;
                                                                            cfgdata2.m1795o(c1568q02.f8600c);
                                                                            AbstractC1372y1.m3300f();
                                                                            c1568q02.m4412n1("ip");
                                                                            break;
                                                                        }
                                                                    } else if (AbstractC1539g1.m4209c(c1568q02.f8606e)) {
                                                                        cfgData cfgdata3 = c1568q02.f8603d;
                                                                        boolean z2 = !cfgdata3.f2549N2;
                                                                        cfgdata3.f2549N2 = z2;
                                                                        c1568q02.f8606e.m1760l0(z2);
                                                                        c1568q02.f8603d.m1795o(c1568q02.f8600c);
                                                                        Context context2 = c1568q02.f8600c;
                                                                        AbstractC1372y1.m3289T(context2, context2.getString(c1568q02.f8603d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                        if (c1568q02.f8603d.f2549N2) {
                                                                            AbstractC1372y1.m3304j(c1568q02.f8600c);
                                                                        }
                                                                        AbstractC1372y1.m3300f();
                                                                        c1568q02.m4412n1("ip");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    Handler handler = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i02 = c1568q02.f8581T0;
                                                                    handler.removeCallbacks(runnableC1544i02);
                                                                    handler.postDelayed(runnableC1544i02, 15000L);
                                                                    break;
                                                                }
                                                            } else if (!AbstractC1372y1.f6438h) {
                                                                if (!c1568q02.m4404k1()) {
                                                                    c1568q02.f8583U0 = true;
                                                                    if (c1568q02.m4397i0() && !AbstractC1372y1.m3272C()) {
                                                                        if (c1568q02.f8573P0 && ((valueAnimator = c1568q02.f8575Q0) == null || !valueAnimator.isRunning())) {
                                                                            c1568q02.m4436v1(true);
                                                                        }
                                                                        Handler handler2 = c1568q02.f8609f;
                                                                        RunnableC1544i0 runnableC1544i03 = c1568q02.f8581T0;
                                                                        handler2.removeCallbacks(runnableC1544i03);
                                                                        handler2.postDelayed(runnableC1544i03, 15000L);
                                                                        break;
                                                                    }
                                                                } else if (c1568q02.f8583U0) {
                                                                    Handler handler3 = c1568q02.f8609f;
                                                                    RunnableC1544i0 runnableC1544i04 = c1568q02.f8581T0;
                                                                    handler3.removeCallbacks(runnableC1544i04);
                                                                    handler3.postDelayed(runnableC1544i04, 15000L);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else if (!c1568q02.f8579S0) {
                                                        ValueAnimator valueAnimator2 = c1568q02.f8626k1;
                                                        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                                            boolean z3 = c1568q02.f8571O0;
                                                            if (!z3 || !c1568q02.m4405l0()) {
                                                                boolean z4 = !c1568q02.f8571O0;
                                                                c1568q02.f8571O0 = z4;
                                                                AbstractC1372y1.m3286Q(z4);
                                                                c1568q02.m4380b(z3);
                                                                break;
                                                            } else {
                                                                c1568q02.f8632m1 = 0;
                                                                RunnableC1544i0 runnableC1544i05 = new RunnableC1544i0(c1568q02, 19);
                                                                if (!c1568q02.m4405l0() && Math.abs(c1568q02.f8617h1 - 1.0f) < 0.001f) {
                                                                    runnableC1544i05.run();
                                                                    break;
                                                                } else {
                                                                    c1568q02.f8629l1 = true;
                                                                    c1568q02.m4383c(runnableC1544i05);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    AbstractC1372y1.m3300f();
                                                    if (!c1568q02.f8603d.f2672o3) {
                                                        Context context3 = c1568q02.f8600c;
                                                        AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                        c1568q02.m4412n1("ip_rest");
                                                        break;
                                                    } else {
                                                        c1568q02.m4412n1("ip_rest_launcher");
                                                        break;
                                                    }
                                                }
                                            } else if (c1568q02.f8606e.m1714B()) {
                                                if (AbstractC1372y1.f6437g) {
                                                    AbstractC1372y1.m3305k(c1568q02.f8600c);
                                                } else {
                                                    int[] m3282M = AbstractC1372y1.m3282M(c1568q02.f8603d.f2620e1);
                                                    AbstractC1372y1.m3290U(c1568q02.f8600c, m3282M[0], m3282M[1], 0.7019608f, c1568q02.f8603d.f2657l3);
                                                }
                                                c1568q02.f8555G0 = AbstractC1372y1.f6437g;
                                                c1568q02.m4419q(true);
                                                break;
                                            }
                                        } else if (!AbstractC1372y1.m3302h() && c1568q02.m4397i0()) {
                                            ValueAnimator valueAnimator3 = c1568q02.f8575Q0;
                                            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                                                c1568q02.f8583U0 = false;
                                                c1568q02.m4436v1(c1568q02.f8573P0);
                                                break;
                                            }
                                        }
                                    } else if (c1568q02.f8603d.f2561Q2 && !c1568q02.f8579S0) {
                                        ValueAnimator valueAnimator4 = c1568q02.f8626k1;
                                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                            cfgData cfgdata4 = c1568q02.f8603d;
                                            if (cfgdata4.f2561Q2 && !c1568q02.m4400j0()) {
                                                if (c1568q02.m4403k0()) {
                                                    cfgdata4.f2635h1 = cfgdata4.f2635h1 != 2 ? 2 : 0;
                                                } else {
                                                    int i212 = cfgdata4.f2635h1;
                                                    if (i212 >= 0 && i212 <= 2) {
                                                        r4 = i212;
                                                    }
                                                    cfgdata4.f2635h1 = (r4 + 1) % 3;
                                                }
                                                cfgdata4.m1795o(c1568q02.f8600c);
                                                c1568q02.m4383c(null);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1568q02.f8600c);
                                break;
                            }
                        }
                        break;
                    case 7:
                        Integer num3 = (Integer) obj;
                        C1568q0 c1568q03 = this.f8374b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1568q03.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1568q03.m4447z0(intValue2);
                        break;
                    case 8:
                        C1568q0 c1568q04 = this.f8374b;
                        c1568q04.m4373T();
                        c1568q04.m4356J();
                        c1568q04.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.GNU /* 9 */:
                        C1568q0 c1568q05 = this.f8374b;
                        c1568q05.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1568q05.m4361L0();
                        }
                        c1568q05.m4373T();
                        c1568q05.m4356J();
                        c1568q05.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1568q0 c1568q06 = this.f8374b;
                        c1568q06.m4356J();
                        c1568q06.m4340B0(C0639g.m1872x().m1880u());
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1568q0 c1568q07 = this.f8374b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1568q07.getClass();
                            intValue3 = num4.intValue();
                        }
                        c1568q07.m4444y0(intValue3);
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        Integer num5 = (Integer) obj;
                        C1568q0 c1568q08 = this.f8374b;
                        if (num5 == null) {
                            intValue4 = 0;
                        } else {
                            c1568q08.getClass();
                            intValue4 = num5.intValue();
                        }
                        TextView textView = c1568q08.f8625k0;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue4));
                        }
                        c1568q08.m4444y0(c1568q08.f8606e.m1745e());
                        break;
                    case 13:
                        C1568q0 c1568q09 = this.f8374b;
                        AbstractC1539g1.m4225k(c1568q09.f8600c);
                        c1568q09.m4373T();
                        c1568q09.m4356J();
                        break;
                    case 14:
                        C1568q0 c1568q010 = this.f8374b;
                        c1568q010.getClass();
                        boolean equals = Boolean.TRUE.equals((Boolean) obj);
                        c1568q010.f8571O0 = equals;
                        AbstractC1372y1.m3286Q(equals);
                        boolean z5 = c1568q010.f8571O0;
                        Context context4 = c1568q010.f8600c;
                        if (!z5) {
                            c1568q010.f8632m1 = -1;
                            cfgData cfgdata5 = c1568q010.f8603d;
                            if (cfgdata5.f2635h1 != 0) {
                                cfgdata5.f2635h1 = 0;
                                cfgdata5.m1795o(context4);
                            }
                            ValueAnimator valueAnimator5 = c1568q010.f8626k1;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                                c1568q010.f8626k1 = null;
                            }
                            c1568q010.f8617h1 = c1568q010.m4430t1();
                            c1568q010.f8620i1 = 1.0f;
                            c1568q010.f8623j1 = 0.0f;
                            c1568q010.m4345D();
                        }
                        c1568q010.m4356J();
                        boolean z6 = AbstractC1372y1.f6437g;
                        if (z6 && !c1568q010.f8571O0) {
                            AbstractC1372y1.m3317w();
                            break;
                        } else if (z6) {
                            AbstractC1372y1.m3292W(context4, true);
                            break;
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        C1568q0 c1568q011 = this.f8374b;
                        if (bool == null) {
                            c1568q011.getClass();
                            break;
                        } else {
                            c1568q011.m4407m(false);
                            break;
                        }
                    default:
                        this.f8374b.m4340B0((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: K0 */
    public final void m4359K0(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        m4318N0(imageView, 0.0f, 0.0f);
        if (imageView.getWidth() > 0 && imageView.getHeight() > 0) {
            imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        }
        ImageView imageView2 = this.f8645r;
        if (imageView == imageView2 || imageView == this.f8648s) {
            C1572s c1572s = imageView == imageView2 ? this.f8559I0 : this.f8561J0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m4349F(imageView);
        }
    }

    /* renamed from: L */
    public final void m4360L() {
        if (this.f8612g == null) {
            return;
        }
        TextView textView = this.f8625k0;
        if (textView != null) {
            textView.bringToFront();
        }
        ImageView imageView = this.f8622j0;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.f8628l0;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        this.f8612g.invalidate();
    }

    /* renamed from: L0 */
    public final void m4361L0() {
        this.f8609f.removeCallbacks(this.f8581T0);
        m4362M();
        this.f8573P0 = true;
        this.f8585V0 = 0.0f;
        this.f8591Y0 = false;
        AbstractC1372y1.m3287R(false, false);
    }

    /* renamed from: M */
    public final void m4362M() {
        ValueAnimator valueAnimator = this.f8575Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8575Q0 = null;
        }
    }

    /* renamed from: M0 */
    public final void m4363M0() {
        ImageView m4370Q0 = m4370Q0();
        boolean z2 = this.f8603d.f2636h2;
        ImageView imageView = z2 ? this.f8645r : this.f8648s;
        TextView textView = z2 ? this.f8607e0 : this.f8610f0;
        m4318N0(m4370Q0, 0.0f, 0.0f);
        m4359K0(imageView);
        m4318N0(textView, 0.0f, m4371R0());
        m4355I0(m4370Q0);
    }

    /* renamed from: N */
    public final void m4364N() {
        ImageView m4370Q0 = m4370Q0();
        if (m4370Q0 == null) {
            this.f8591Y0 = false;
            return;
        }
        RunnableC0018l runnableC0018l = new RunnableC0018l(this, 28, m4370Q0);
        if (m4370Q0.getWidth() <= 0 || m4370Q0.getHeight() <= 0) {
            m4370Q0.post(runnableC0018l);
        } else {
            runnableC0018l.run();
        }
    }

    /* renamed from: O */
    public final RectF m4365O() {
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup == null || viewGroup.getWidth() <= 0 || this.f8612g.getHeight() <= 0) {
            return new RectF();
        }
        int width = this.f8612g.getWidth();
        int height = this.f8612g.getHeight();
        float f2 = height - 25.0f;
        if (!m4341B1() && !m4401j1()) {
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
    public final C1574t m4366O0() {
        int i;
        cfgData cfgdata = this.f8603d;
        EnumC1455a enumC1455a = cfgdata.f2625f1;
        if (enumC1455a == EnumC1455a.f6949f) {
            return new C1574t(0, null, 2);
        }
        int i2 = cfgdata.f2630g1;
        if (i2 < 31) {
            int i3 = enumC1455a.f7036d;
            return i3 != 0 ? new C1574t(i3, null, 2) : new C1574t(0, null, 2);
        }
        String[] strArr = cfgdata.f2603b;
        if (strArr != null && i2 >= 31 && (i = i2 - 31) >= 0 && i < strArr.length) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles/" + cfgdata.f2603b[i]);
            if (file.exists()) {
                return new C1574t(0, Uri.fromFile(file), 2);
            }
        }
        return new C1574t(0, null, 2);
    }

    /* renamed from: P */
    public final void m4367P(ImageView imageView, ImageView imageView2, TextView textView, float f2) {
        if (imageView != null) {
            imageView.setTranslationX(0.0f);
            imageView.setRotation(0.0f);
        }
        ImageView imageView3 = null;
        if (imageView2 != null) {
            imageView2.setTranslationX(0.0f);
            imageView2.setTranslationY(0.0f);
            imageView2.setRotation(0.0f);
            m4349F(imageView2);
            C1572s c1572s = imageView2 == this.f8645r ? this.f8559I0 : imageView2 == this.f8648s ? this.f8561J0 : null;
            if (c1572s != null) {
                c1572s.m4470a(imageView2);
                ImageView[] m4439w1 = m4439w1(imageView2);
                if (m4439w1 != null) {
                    float f3 = c1572s.f8682h;
                    for (ImageView imageView4 : m4439w1) {
                        if (imageView4 != null) {
                            imageView4.setRotation(f3);
                        }
                    }
                }
            }
        }
        if (imageView == this.f8639p) {
            imageView3 = this.f8651t;
        } else if (imageView == this.f8642q) {
            imageView3 = this.f8654u;
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
        View[] m4381b0 = m4381b0(imageView);
        int length = m4381b0.length;
        for (int i = 0; i < length; i++) {
            View view = m4381b0[i];
            if (view != null) {
                view.setTranslationX(view == this.f8566M ? m4354H0(this.f8617h1) : m4423r0(view));
                view.setTranslationY(m4426s0(view));
            }
        }
    }

    /* renamed from: P0 */
    public final void m4368P0() {
        ViewGroup viewGroup;
        if (!this.f8569N0) {
            m4358K();
            this.f8569N0 = true;
        }
        C1531e c1531e = this.f8557H0;
        if (c1531e != null) {
            c1531e.m4170a();
        }
        boolean z2 = this.f8603d.f2561Q2;
        this.f8571O0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4424r1();
        ValueAnimator valueAnimator = this.f8577R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8577R0 = null;
        }
        this.f8579S0 = false;
        ImageView imageView = this.f8636o;
        if (imageView != null) {
            imageView.setTranslationY(0.0f);
        }
        m4362M();
        this.f8573P0 = true;
        this.f8585V0 = 0.0f;
        this.f8591Y0 = false;
        this.f8593Z0 = Boolean.valueOf(m4403k0());
        m4432u0();
        m4407m(false);
        if (this.f8638o1 <= 0.0f && (viewGroup = this.f8612g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        m4435v0();
        m4340B0(C0639g.m1872x().m1880u());
        this.f8555G0 = AbstractC1372y1.f6437g;
        m4356J();
        View view = this.f8640p0;
        if (view != null) {
            view.post(new RunnableC1544i0(this, 0));
            return;
        }
        View view2 = this.f8637o0;
        if (view2 != null) {
            view2.post(new RunnableC1544i0(this, 3));
        }
    }

    /* renamed from: Q */
    public final void m4369Q() {
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f8612g;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(android.R.color.transparent);
        }
        m4393g0();
        ViewGroup viewGroup3 = this.f8612g;
        if (viewGroup3 != null) {
            viewGroup3.getOverlay().clear();
        }
        C1525c c1525c = this.f8644q1;
        if (c1525c != null) {
            c1525c.m4163e(null);
        }
    }

    /* renamed from: Q0 */
    public final ImageView m4370Q0() {
        return this.f8603d.f2636h2 ? this.f8639p : this.f8642q;
    }

    /* renamed from: R0 */
    public final float m4371R0() {
        return this.f8603d.f2636h2 ? this.f8602c1 : this.f8605d1;
    }

    /* renamed from: S */
    public final void m4372S() {
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup != null) {
            viewGroup.getOverlay().clear();
        }
        ImageView imageView = this.f8636o;
        if (imageView != null && imageView.getBackground() == this.f8644q1) {
            this.f8636o.setBackground(null);
            this.f8636o.setLayerType(0, null);
        }
        ViewGroup viewGroup2 = this.f8612g;
        if (viewGroup2 != null && viewGroup2.getBackground() == this.f8644q1) {
            this.f8612g.setBackgroundResource(android.R.color.transparent);
            this.f8612g.setLayerType(0, null);
        }
        C1525c c1525c = this.f8644q1;
        if (c1525c != null) {
            c1525c.m4160b();
            this.f8644q1.m4163e(null);
        }
    }

    /* renamed from: T */
    public final void m4373T() {
        cfgData cfgdata = this.f8603d;
        if (cfgdata.f2561Q2) {
            boolean m4400j0 = m4400j0();
            Context context = this.f8600c;
            if (m4400j0) {
                if (cfgdata.f2635h1 != 0 || Math.abs(this.f8617h1 - m4430t1()) >= 0.001f || this.f8623j1 >= 0.001f) {
                    cfgdata.f2635h1 = 0;
                    cfgdata.m1795o(context);
                    m4383c(null);
                    return;
                }
                return;
            }
            if (m4403k0() && cfgdata.f2635h1 == 1) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
                m4383c(null);
            } else {
                if (Math.abs(this.f8620i1 - (m4344C1() ? 1.0f : 0.0f)) < 0.001f) {
                    return;
                }
                m4383c(null);
            }
        }
    }

    /* renamed from: U */
    public final void m4374U() {
        View view = this.f8637o0;
        if (view == null || this.f8612g == null) {
            return;
        }
        if (this.f8640p0 != null && view.getParent() == this.f8640p0) {
            int round = Math.round(this.f8600c.getResources().getDisplayMetrics().density * 96.0f);
            ((ViewGroup) this.f8640p0).removeView(this.f8637o0);
            C1592d c1592d = new C1592d(470, round);
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            this.f8612g.addView(this.f8637o0, c1592d);
            this.f8549D0 = -1.0f;
            this.f8551E0 = -1.0f;
            this.f8637o0.setTranslationX(0.0f);
            this.f8637o0.setTranslationY(0.0f);
        }
        this.f8637o0.getParent();
    }

    /* renamed from: V */
    public final int m4375V() {
        int i = this.f8649s0;
        if (i > 0) {
            return i;
        }
        TextView textView = this.f8568N;
        if (textView == null || this.f8570O == null) {
            return 0;
        }
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        int paddingBottom = this.f8570O.getPaddingBottom() + this.f8570O.getPaddingTop() + Math.round((this.f8568N.getLineSpacingExtra() + (fontMetrics.descent - fontMetrics.ascent)) * 3.0f);
        this.f8649s0 = paddingBottom;
        if (paddingBottom <= 0) {
            float f2 = this.f8600c.getResources().getDisplayMetrics().density;
            this.f8649s0 = AbstractC0062j.m150d(f2, 20.0f, 22.0f * f2 * 3.2f);
        }
        return this.f8649s0;
    }

    /* renamed from: W */
    public final void m4376W() {
        m4333f1(this.f8624k);
        m4333f1(this.f8627l);
        m4333f1(this.f8630m);
        if (this.f8615h == null || m4448z1()) {
            return;
        }
        this.f8615h.setVisibility(8);
    }

    /* renamed from: X */
    public final void m4377X() {
        ImageView imageView = this.f8622j0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        TextView textView = this.f8625k0;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView2 = this.f8628l0;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        ImageView imageView3 = this.f8631m0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f8634n0;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
    }

    /* renamed from: Z */
    public final float m4378Z(float f2) {
        float m4430t1 = m4430t1();
        float f3 = f2 - 1.0f;
        if (Math.abs(f3) < 0.001f) {
            return 0.0f;
        }
        float f4 = m4430t1 - 1.0f;
        if (Math.abs(f4) < 0.001f) {
            return 0.0f;
        }
        return f3 / f4;
    }

    /* renamed from: a0 */
    public final boolean m4379a0() {
        return this.f8603d.f2561Q2 && this.f8571O0;
    }

    /* renamed from: b */
    public final void m4380b(boolean z2) {
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup == null) {
            m4356J();
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f8612g.getHeight() <= 0) {
            this.f8612g.post(new RunnableC1556m0(this, z2, 1));
            return;
        }
        ValueAnimator valueAnimator = this.f8577R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8577R0 = null;
        }
        this.f8579S0 = false;
        m4362M();
        m4361L0();
        ImageView m4411n0 = m4411n0();
        ImageView m4370Q0 = m4370Q0();
        boolean z3 = this.f8603d.f2636h2;
        ImageView imageView = z3 ? this.f8648s : this.f8645r;
        ImageView imageView2 = z3 ? this.f8645r : this.f8648s;
        TextView textView = z3 ? this.f8610f0 : this.f8607e0;
        TextView textView2 = z3 ? this.f8607e0 : this.f8610f0;
        float m4414o0 = m4414o0();
        float m4371R0 = m4371R0();
        float width = this.f8612g.getWidth();
        float height = this.f8612g.getHeight();
        float f2 = this.f8600c.getResources().getDisplayMetrics().density * 80.0f;
        float f3 = m4411n0 != null ? -(m4411n0.getRight() + f2) : -width;
        if (m4370Q0 != null) {
            width = (width - m4370Q0.getLeft()) + f2;
        }
        float f4 = width;
        if (!z2) {
            m4334g1(m4411n0, true);
            m4334g1(m4370Q0, true);
            m4334g1(imageView, true);
            m4334g1(imageView2, true);
            m4385c1(imageView, true);
            m4385c1(imageView2, true);
            m4334g1(textView, true);
            m4334g1(textView2, true);
            m4334g1(this.f8651t, true);
            m4334g1(this.f8654u, true);
            m4334g1(this.f8564L, true);
            m4334g1(this.f8588X, true);
            m4334g1(this.f8590Y, true);
            m4334g1(this.f8566M, !r3.f2543M0.f7147f);
            m4346D0();
            m4340B0(C0639g.m1872x().m1880u());
        }
        View view = this.f8637o0;
        boolean z4 = view != null && view.getVisibility() == 0;
        float top = this.f8637o0 != null ? (height - r3.getTop()) + f2 : 0.0f;
        if (m4395h0()) {
            m4372S();
        }
        ViewGroup viewGroup2 = this.f8612g;
        if (viewGroup2 != null) {
            viewGroup2.setLayerType(0, null);
        }
        m4446z();
        float f5 = this.f8636o != null ? -(r1.getHeight() + f2) : -height;
        int[] m3297c = AbstractC1372y1.m3297c();
        this.f8579S0 = true;
        m4386d(z2 ? 0.0f : 1.0f, m4411n0, imageView, textView, m4414o0, f3, m4370Q0, imageView2, textView2, m4371R0, f4, z4, top, f5);
        AbstractC1372y1.m3295a(m3297c, 0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8577R0 = ofFloat;
        ofFloat.setDuration(420L);
        AbstractC0062j.m166t(this.f8577R0);
        this.f8577R0.addUpdateListener(new C1558n(this, z2, m4411n0, imageView, textView, m4414o0, f3, m4370Q0, imageView2, textView2, m4371R0, f4, z4, top, f5, m3297c, 2));
        this.f8577R0.addListener(new C1564p(this, m3297c, m4411n0, imageView, textView, m4414o0, m4370Q0, imageView2, textView2, m4371R0, z4, z2, 1));
        this.f8577R0.start();
    }

    /* renamed from: b0 */
    public final View[] m4381b0(ImageView imageView) {
        return imageView == this.f8639p ? new View[]{this.f8564L, this.f8566M} : imageView == this.f8642q ? new View[]{this.f8588X, this.f8590Y} : new View[0];
    }

    /* renamed from: b1 */
    public final void m4382b1(ImageView imageView, boolean z2) {
        for (View view : m4381b0(imageView)) {
            if (view == this.f8566M) {
                m4334g1(view, z2 && !this.f8603d.f2543M0.f7147f);
            } else {
                m4334g1(view, z2);
            }
        }
    }

    /* renamed from: c */
    public final void m4383c(RunnableC1544i0 runnableC1544i0) {
        ImageView m4411n0 = m4411n0();
        if (m4405l0() && (m4411n0 == null || m4411n0.getWidth() <= 0)) {
            if (m4411n0 != null) {
                m4411n0.post(new RunnableC0018l(this, 29, runnableC1544i0));
                return;
            } else {
                if (runnableC1544i0 != null) {
                    runnableC1544i0.run();
                    return;
                }
                return;
            }
        }
        float m4430t1 = m4405l0() ? m4430t1() : 1.0f;
        float f2 = m4344C1() ? 1.0f : 0.0f;
        float f3 = this.f8603d.f2635h1 != 2 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = this.f8626k1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.f8617h1 - m4430t1) < 0.001f && Math.abs(this.f8620i1 - f2) < 0.001f && Math.abs(this.f8623j1 - f3) < 0.001f) {
            this.f8626k1 = null;
            this.f8617h1 = m4430t1;
            this.f8620i1 = f2;
            this.f8623j1 = f3;
            m4345D();
            if (runnableC1544i0 != null) {
                runnableC1544i0.run();
                return;
            }
            return;
        }
        float f4 = this.f8617h1;
        float f5 = this.f8620i1;
        float f6 = this.f8623j1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8626k1 = ofFloat;
        ofFloat.setDuration(260L);
        AbstractC0062j.m166t(this.f8626k1);
        this.f8626k1.addUpdateListener(new C1555m(this, f4, m4430t1, f5, f2, f6, f3, 1));
        this.f8626k1.addListener(new C1567q(this, m4430t1, f2, f3, runnableC1544i0, 1));
        this.f8626k1.start();
    }

    /* renamed from: c0 */
    public final void m4384c0(float[] fArr) {
        float f2 = (!this.f8573P0 || this.f8585V0 > 0.0f) ? this.f8585V0 : 0.0f;
        if (f2 <= 0.0f || !this.f8591Y0) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        RectF m4429t0 = m4429t0();
        if (m4429t0.width() <= 0.0f || m4429t0.height() <= 0.0f) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = (m4429t0.centerX() - this.f8587W0) * f2;
            fArr[1] = (m4429t0.centerY() - this.f8589X0) * f2;
        }
    }

    /* renamed from: c1 */
    public final void m4385c1(ImageView imageView, boolean z2) {
        ImageView[] m4439w1 = m4439w1(imageView);
        if (m4439w1 == null) {
            return;
        }
        for (ImageView imageView2 : m4439w1) {
            m4334g1(imageView2, z2);
        }
    }

    /* renamed from: d */
    public final void m4386d(float f2, ImageView imageView, ImageView imageView2, TextView textView, float f3, float f4, ImageView imageView3, ImageView imageView4, TextView textView2, float f5, float f6, boolean z2, float f7, float f8) {
        View view;
        m4388e(imageView, imageView2, textView, f3, f4, -540.0f, f2);
        m4388e(imageView3, imageView4, textView2, f5, f6, 540.0f, f2);
        if (z2 && (view = this.f8637o0) != null) {
            view.setTranslationY((f7 * f2) + this.f8553F0);
        }
        ImageView imageView5 = this.f8636o;
        if (imageView5 != null) {
            imageView5.setTranslationY(f8 * f2);
        }
    }

    /* renamed from: d1 */
    public final void m4387d1(View view, float f2) {
        Context context;
        Drawable m1b;
        if (view == null || (context = this.f8600c) == null || (m1b = AbstractC0000a.m1b(context, R.drawable.ip_theme_47_media_frame)) == null) {
            return;
        }
        Drawable mutate = m1b.mutate();
        int round = Math.round((Math.max(0.0f, Math.min(1.0f, f2)) * (Color.alpha(-535289824) - 128)) + 128);
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(Color.argb(round, 24, 32, 32));
        }
        view.setBackground(mutate);
    }

    /* renamed from: e */
    public final void m4388e(ImageView imageView, ImageView imageView2, TextView textView, float f2, float f3, float f4, float f5) {
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
            ImageView[] m4439w1 = m4439w1(imageView2);
            if (m4439w1 != null) {
                for (ImageView imageView3 : m4439w1) {
                    if (imageView3 != null) {
                        imageView3.setPivotY(AbstractC0062j.m153g(imageView3.getWidth(), 0.5f, imageView3) * 0.5f);
                        imageView3.setTranslationX(f6);
                        imageView3.setTranslationY(0.0f);
                        imageView3.setRotation(f7);
                    }
                }
            }
        }
        ImageView imageView4 = imageView == this.f8639p ? this.f8651t : imageView == this.f8642q ? this.f8654u : null;
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
        View[] m4381b0 = m4381b0(imageView);
        int length = m4381b0.length;
        for (int i = 0; i < length; i++) {
            View view = m4381b0[i];
            if (view != null) {
                view.setTranslationX((f3 * f5) + (view == this.f8566M ? m4354H0(this.f8617h1) : m4423r0(view)));
                view.setTranslationY(m4426s0(view));
            }
        }
    }

    /* renamed from: e0 */
    public final boolean m4389e0() {
        return this.f8603d.f2561Q2 && !this.f8571O0;
    }

    /* renamed from: e1 */
    public final void m4390e1() {
        TextView textView = this.f8574Q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = this.f8572P;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: f0 */
    public final void m4391f0() {
        m4333f1(this.f8621j);
        m4333f1(this.f8576R);
        if (m4400j0() || m4389e0() || !m4341B1()) {
            m4333f1(this.f8624k);
            m4333f1(this.f8627l);
            m4333f1(this.f8630m);
        }
        if (m4400j0() || this.f8603d.f2585W2) {
            m4333f1(this.f8562K);
            m4333f1(this.f8548D);
            m4333f1(this.f8544B);
            m4333f1(this.f8546C);
            m4333f1(this.f8552F);
            m4333f1(this.f8550E);
            m4333f1(this.f8554G);
            m4333f1(this.f8558I);
            m4333f1(this.f8556H);
            m4333f1(this.f8560J);
        }
    }

    /* renamed from: g */
    public final void m4392g() {
        ImageView imageView = this.f8622j0;
        if (imageView == null || this.f8628l0 == null) {
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
        ImageView imageView2 = this.f8628l0;
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
        TextView textView = this.f8625k0;
        if (textView != null) {
            textView.setTextSize(2, 32.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f8625k0.getLayoutParams();
            if (layoutParams3 instanceof C1592d) {
                C1592d c1592d3 = (C1592d) layoutParams3;
                ((ViewGroup.MarginLayoutParams) c1592d3).topMargin = -7;
                this.f8625k0.setLayoutParams(c1592d3);
            }
            this.f8625k0.setTranslationX(13.0f);
            this.f8625k0.setTranslationY(12.0f);
        }
        ImageView imageView3 = this.f8622j0;
        if (imageView3 != null) {
            imageView3.setBackgroundResource(R.drawable.ip_theme_47_cruise_icon_bg);
            this.f8622j0.setPadding(6, 6, 6, 6);
        }
        ImageView imageView4 = this.f8628l0;
        if (imageView4 != null) {
            imageView4.setBackgroundResource(R.drawable.ip_theme_47_cruise_icon_bg);
            this.f8628l0.setPadding(6, 6, 6, 6);
        }
        TextView textView2 = this.f8625k0;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.ip_theme_47_cruise_icon_bg);
        }
        m4442x1();
        m4360L();
    }

    /* renamed from: g0 */
    public final void m4393g0() {
        ImageView imageView = this.f8636o;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        this.f8636o.setLayerType(0, null);
        this.f8636o.setBackground(null);
        this.f8636o.setImageDrawable(null);
    }

    /* renamed from: h */
    public final void m4394h() {
        cfgData cfgdata = this.f8603d;
        if (!cfgdata.f2537K2) {
            ViewGroup viewGroup = this.f8576R;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            m4334g1(this.f8568N, false);
            m4390e1();
            m4334g1(this.f8584V, false);
            View view = this.f8562K;
            if (view != null) {
                view.setVisibility(8);
            }
            m4333f1(this.f8590Y);
            m4418p1();
            return;
        }
        m4334g1(this.f8584V, cfgdata.f2581V2 && (!m4389e0() && (m4379a0() || m4400j0())));
        m4346D0();
        if (m4400j0()) {
            m4396i(false);
        } else if (cfgdata.f2585W2 || m4400j0() || m4389e0() || !m4379a0() || this.f8623j1 >= 0.999f) {
            m4396i(false);
        } else {
            m4396i(true);
        }
        m4441x0();
        m4418p1();
        if (!m4341B1() && !m4403k0() && !m4400j0() && !m4404k1()) {
            m4376W();
            if (m4395h0()) {
                m4438w0();
            }
        }
        m4352G0();
    }

    /* renamed from: h0 */
    public final boolean m4395h0() {
        if (this.f8644q1 == null) {
            return false;
        }
        ImageView imageView = this.f8636o;
        if (imageView != null && imageView.getVisibility() == 0 && this.f8636o.getBackground() == this.f8644q1) {
            return true;
        }
        ViewGroup viewGroup = this.f8612g;
        return viewGroup != null && viewGroup.getBackground() == this.f8644q1;
    }

    /* renamed from: i */
    public final void m4396i(boolean z2) {
        if (!z2) {
            View view = this.f8562K;
            if (view != null) {
                view.setVisibility(8);
            }
            m4333f1(this.f8552F);
            m4333f1(this.f8550E);
            m4333f1(this.f8554G);
            m4333f1(this.f8548D);
            m4333f1(this.f8544B);
            m4333f1(this.f8546C);
            m4333f1(this.f8558I);
            m4333f1(this.f8556H);
            m4333f1(this.f8560J);
            return;
        }
        View view2 = this.f8562K;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        boolean z3 = this.f8603d.useJourneyFuel;
        m4334g1(this.f8552F, z3);
        m4334g1(this.f8550E, z3);
        m4334g1(this.f8554G, z3);
        m4334g1(this.f8548D, true);
        m4334g1(this.f8544B, true);
        m4334g1(this.f8546C, true);
        m4334g1(this.f8558I, true);
        m4334g1(this.f8556H, true);
        m4334g1(this.f8560J, true);
    }

    /* renamed from: i0 */
    public final boolean m4397i0() {
        return this.f8603d.f2537K2 && m4379a0();
    }

    /* renamed from: i1 */
    public final boolean m4398i1() {
        return m4400j0() && !m4389e0();
    }

    /* renamed from: j */
    public final void m4399j(int i, int i2, int i3, float f2) {
        ImageView m4411n0;
        if (this.f8562K == null || m4400j0()) {
            return;
        }
        boolean z2 = (this.f8603d.f2585W2 || m4389e0() || !m4379a0()) ? false : true;
        float max = Math.max(0.0f, Math.min(1.0f, this.f8623j1));
        if (!z2) {
            this.f8562K.setAlpha(1.0f);
            this.f8562K.setTranslationY(0.0f);
            return;
        }
        if (max >= 0.999f) {
            this.f8562K.setAlpha(0.0f);
            this.f8562K.setVisibility(4);
            return;
        }
        if (this.f8562K.getVisibility() != 0) {
            m4396i(true);
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float f3 = ((-0.19999999f) * max2) + 1.0f;
        if (this.f8562K != null) {
            Context context = this.f8600c;
            float f4 = context.getResources().getDisplayMetrics().density;
            float f5 = context.getResources().getDisplayMetrics().scaledDensity;
            float max3 = Math.max(0.5f, Math.min(1.2f, f3));
            float f6 = 10.0f * f4 * max3;
            this.f8562K.setPadding(AbstractC0062j.m168v(f4, 14.0f, max3), Math.round(f6), AbstractC0062j.m168v(f4, 16.0f, max3), Math.round(f6));
            View view = this.f8562K;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(true);
                ((ViewGroup) this.f8562K).setClipChildren(true);
            }
            float f7 = 15.0f * max3;
            m4328Z0(this.f8558I, f7, f5);
            float f8 = 30.0f * max3;
            m4328Z0(this.f8556H, f8, f5);
            float f9 = 16.0f * max3;
            m4328Z0(this.f8560J, f9, f5);
            m4328Z0(this.f8552F, f7, f5);
            m4328Z0(this.f8550E, f8, f5);
            m4328Z0(this.f8554G, f9, f5);
            m4328Z0(this.f8548D, f7, f5);
            m4328Z0(this.f8544B, f8, f5);
            m4328Z0(this.f8546C, f9, f5);
            AbstractC1539g1.m4202X(this.f8556H, this.f8550E, this.f8544B);
            TextView textView = this.f8552F;
            View view2 = textView != null ? (View) textView.getParent() : null;
            float f10 = 22.0f * f4 * max3;
            if (view2 != null && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMarginStart(Math.round(f10));
                view2.setLayoutParams(marginLayoutParams);
            }
            TextView textView2 = this.f8548D;
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
        if (max2 > 0.001f && (m4411n0 = m4411n0()) != null && m4411n0.getWidth() > 0 && m4411n0.getHeight() > 0) {
            float f12 = this.f8617h1;
            float left = m4411n0.getLeft();
            float width = m4411n0.getWidth() * f12;
            float height = (m4411n0.getHeight() * f12) + m4411n0.getTop();
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
        View view4 = this.f8562K;
        if (view4 != null && this.f8612g != null && (view4.getLayoutParams() instanceof C1592d)) {
            C1592d c1592d = (C1592d) this.f8562K.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = 470;
            ((ViewGroup.MarginLayoutParams) c1592d).height = m152f;
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(max6);
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max7;
            this.f8562K.setLayoutParams(c1592d);
            this.f8562K.setTranslationX(0.0f);
        }
        this.f8562K.setAlpha(1.0f - max);
        this.f8562K.setTranslationY(max * 40.0f);
        this.f8562K.bringToFront();
        View view5 = this.f8640p0;
        if (view5 != null) {
            view5.bringToFront();
        }
        View view6 = this.f8572P;
        if (view6 == null || view6.getVisibility() != 0) {
            return;
        }
        this.f8572P.bringToFront();
    }

    /* renamed from: j0 */
    public final boolean m4400j0() {
        cfgData cfgdata = this.f8603d;
        return AbstractC1539g1.m4197S(cfgdata) && cfgdata.f2557P2;
    }

    /* renamed from: j1 */
    public final boolean m4401j1() {
        return m4403k0() && !m4389e0();
    }

    /* renamed from: k */
    public final void m4402k(ImageView imageView, ImageView imageView2, TextView textView, float f2, boolean z2, float f3, float f4, float f5) {
        float f6;
        float f7;
        if (imageView == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1544i0(this, 10));
            return;
        }
        float f8 = f3 - 1.0f;
        if (Math.abs(f8) < 0.001f) {
            m4318N0(imageView, f4, f5);
            m4359K0(imageView2);
            m4318N0(textView, f4, f2 + f5);
            m4427s1(imageView, 1.0f, 0.0f, 0.0f, f4, f5, 0.0f, 0.0f);
            return;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        m4331d0(imageView, f3, z2, fArr, fArr2);
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        if (f3 < 0.999f) {
            f7 = m4433u1() * (-20.0f);
        } else {
            if (f3 <= 1.001f) {
                f6 = 0.0f;
                m4317I(imageView, f3, f9, f10, f4, f5, f11, f12);
                m4431u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
                m4317I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
                m4427s1(imageView, f3, f9, f10, f4, f5, f11, f12);
            }
            if (Math.abs(f8) < 0.001f || f3 < 1.0f) {
                f7 = 0.0f;
            } else {
                float m4378Z = m4378Z(f3);
                f7 = (((-imageView.getHeight()) * 0.16f) * m4378Z) - (m4378Z * 120.0f);
            }
        }
        f6 = f7;
        m4317I(imageView, f3, f9, f10, f4, f5, f11, f12);
        m4431u(imageView2, imageView, f3, f9, f10, f11 + f4, f12 + f5);
        m4317I(textView, f3, f9, f10, f4, f5, f11, f2 + f12 + f6 + f5);
        m4427s1(imageView, f3, f9, f10, f4, f5, f11, f12);
    }

    /* renamed from: k0 */
    public final boolean m4403k0() {
        return AbstractC1539g1.m4195Q(this.f8603d, this.f8606e);
    }

    /* renamed from: k1 */
    public final boolean m4404k1() {
        if (m4397i0()) {
            return !this.f8573P0 || this.f8585V0 > 0.0f;
        }
        return false;
    }

    /* renamed from: l0 */
    public final boolean m4405l0() {
        return this.f8603d.f2635h1 == 0 && !this.f8629l1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v247, types: [android.view.View] */
    /* renamed from: l1 */
    public final void m4406l1() {
        int i;
        View view = this.f8597b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_47_root);
        this.f8612g = viewGroup;
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
        this.f8636o = (ImageView) view.findViewById(R.id.theme_47_style_bg);
        this.f8615h = view.findViewById(R.id.theme_47_navi_hole);
        this.f8618i = view.findViewById(R.id.theme_47_top_panel);
        this.f8621j = view.findViewById(R.id.theme_47_bottom_panel);
        this.f8624k = view.findViewById(R.id.theme_47_bottom_panel_left);
        this.f8627l = view.findViewById(R.id.theme_47_bottom_panel_center);
        this.f8630m = view.findViewById(R.id.theme_47_bottom_panel_right);
        if (this.f8627l != null) {
            C1528d c1528d = new C1528d(-14800856);
            this.f8633n = c1528d;
            this.f8627l.setBackground(c1528d);
        }
        this.f8639p = (ImageView) view.findViewById(R.id.theme_47_spd_face);
        this.f8642q = (ImageView) view.findViewById(R.id.theme_47_rpm_face);
        this.f8645r = (ImageView) view.findViewById(R.id.theme_47_spd_needle);
        this.f8648s = (ImageView) view.findViewById(R.id.theme_47_rpm_needle);
        this.f8651t = (ImageView) view.findViewById(R.id.theme_47_fuel_needle);
        this.f8654u = (ImageView) view.findViewById(R.id.theme_47_temp_needle);
        this.f8544B = (TextView) view.findViewById(R.id.theme_47_inst_fuel);
        this.f8546C = (TextView) view.findViewById(R.id.theme_47_inst_fuel_sub);
        this.f8548D = (TextView) view.findViewById(R.id.theme_47_lbl_inst);
        this.f8550E = (TextView) view.findViewById(R.id.theme_47_avg_jour);
        this.f8552F = (TextView) view.findViewById(R.id.theme_47_lbl_avg_jour);
        this.f8554G = (TextView) view.findViewById(R.id.theme_47_avg_jour_sub);
        this.f8556H = (TextView) view.findViewById(R.id.theme_47_avg_total);
        this.f8558I = (TextView) view.findViewById(R.id.theme_47_lbl_avg_total);
        this.f8560J = (TextView) view.findViewById(R.id.theme_47_avg_total_sub);
        this.f8562K = view.findViewById(R.id.theme_47_fuel_cons_wrap);
        this.f8576R = (ViewGroup) view.findViewById(R.id.theme_47_odo_wrap);
        this.f8578S = (TextView) view.findViewById(R.id.theme_47_odo_total);
        this.f8580T = (TextView) view.findViewById(R.id.theme_47_odo_day);
        this.f8582U = (TextView) view.findViewById(R.id.theme_47_odo_trip);
        this.f8584V = (ViewGroup) view.findViewById(R.id.theme_47_tires_wrap);
        this.f8586W = (TextView) view.findViewById(R.id.theme_47_tires_up);
        this.f8590Y = (TextView) view.findViewById(R.id.theme_47_battery);
        this.f8592Z = (TextView) view.findViewById(R.id.theme_47_gear);
        this.f8595a0 = (TextView) view.findViewById(R.id.theme_47_clock);
        this.f8598b0 = (TextView) view.findViewById(R.id.theme_47_out_temp);
        this.f8601c0 = (ImageView) view.findViewById(R.id.theme_47_wifi);
        this.f8604d0 = (ImageView) view.findViewById(R.id.theme_47_inet);
        this.f8607e0 = (TextView) view.findViewById(R.id.theme_47_spd_value);
        this.f8610f0 = (TextView) view.findViewById(R.id.theme_47_rpm_value);
        this.f8564L = (TextView) view.findViewById(R.id.theme_47_fuel_up);
        this.f8588X = (TextView) view.findViewById(R.id.theme_47_temp_up);
        TextView textView = (TextView) view.findViewById(R.id.theme_47_remain);
        this.f8566M = textView;
        if (textView != null) {
            this.f8608e1 = textView.getTranslationX();
        }
        this.f8568N = (TextView) view.findViewById(R.id.theme_47_odo_up);
        View findViewById = view.findViewById(R.id.theme_47_odo_frame);
        this.f8570O = findViewById;
        AbstractC1539g1.m4223j(this.f8568N, findViewById);
        this.f8572P = view.findViewById(R.id.theme_47_trip_frame);
        TextView textView2 = (TextView) view.findViewById(R.id.theme_47_trip_up);
        this.f8574Q = textView2;
        AbstractC1539g1.m4223j(textView2, this.f8572P);
        AbstractC1539g1.m4204Z(this.f8578S, this.f8580T, this.f8582U);
        AbstractC1539g1.m4202X(this.f8556H, this.f8550E, this.f8544B);
        this.f8613g0 = (TextView) view.findViewById(R.id.theme_47_txt_speed);
        this.f8619i0 = view.findViewById(R.id.theme_47_txt_speed_scrim);
        this.f8616h0 = (TextView) view.findViewById(R.id.theme_47_txt_rpm);
        TextView textView3 = this.f8607e0;
        TextView textView4 = this.f8610f0;
        this.f8602c1 = textView3 != null ? textView3.getTranslationY() : 0.0f;
        this.f8605d1 = textView4 != null ? textView4.getTranslationY() : 0.0f;
        if (Math.abs(this.f8602c1) < 0.5f && Math.abs(this.f8605d1) < 0.5f) {
            float f2 = this.f8600c.getResources().getDisplayMetrics().scaledDensity * 60.0f;
            this.f8602c1 = f2;
            this.f8605d1 = f2;
            if (textView3 != null) {
                textView3.setTranslationY(f2);
            }
            if (textView4 != null) {
                textView4.setTranslationY(f2);
            }
        }
        this.f8622j0 = (ImageView) view.findViewById(R.id.theme_47_cruise);
        this.f8625k0 = (TextView) view.findViewById(R.id.theme_47_cruise_speed);
        this.f8628l0 = (ImageView) view.findViewById(R.id.theme_47_lane);
        this.f8631m0 = (ImageView) view.findViewById(R.id.theme_47_hide_cruise);
        this.f8634n0 = (ImageView) view.findViewById(R.id.theme_47_hide_la);
        this.f8646r0 = view.findViewById(R.id.theme_47_ext_spacer);
        View findViewById2 = view.findViewById(R.id.theme_47_media_wrap);
        this.f8637o0 = findViewById2;
        AbstractC0641i.m1886c(findViewById2);
        this.f8640p0 = view.findViewById(R.id.theme_47_center_float);
        this.f8643q0 = view.findViewById(R.id.theme_47_ext_row);
        View view2 = this.f8640p0;
        if (view2 instanceof ViewGroup) {
            ((ViewGroup) view2).setClipChildren(false);
            ((ViewGroup) this.f8640p0).setClipToPadding(false);
        }
        ViewGroup viewGroup4 = this.f8612g;
        if (viewGroup4 != null) {
            viewGroup4.setClipChildren(false);
            this.f8612g.setClipToPadding(false);
        }
        View view3 = this.f8643q0;
        if (view3 != null) {
            if (view3 instanceof ViewGroup) {
                ((ViewGroup) view3).setClipChildren(false);
                ((ViewGroup) this.f8643q0).setClipToPadding(false);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8643q0.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin += 15;
                this.f8643q0.setLayoutParams(marginLayoutParams);
            }
        }
        m4374U();
        this.f8652t0 = (ImageView) view.findViewById(R.id.theme_47_media_art);
        this.f8655u0 = (TextView) view.findViewById(R.id.theme_47_media_title);
        this.f8657v0 = (TextView) view.findViewById(R.id.theme_47_media_artist);
        this.f8659w0 = (TextView) view.findViewById(R.id.theme_47_media_elapsed);
        this.f8661x0 = (TextView) view.findViewById(R.id.theme_47_media_total);
        this.f8663y0 = (ProgressBar) view.findViewById(R.id.theme_47_media_bar);
        TextView textView5 = (TextView) view.findViewById(R.id.theme_47_free_mem);
        Handler handler = this.f8609f;
        this.f8557H0 = new C1531e(handler, textView5);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f8594a);
        }
        m4391f0();
        m4407m(true);
        m4392g();
        carData cardata = this.f8606e;
        m4444y0(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView6 = this.f8625k0;
        if (textView6 != null) {
            textView6.setText(String.valueOf(m1747f));
        }
        m4444y0(cardata.m1745e());
        float m1780z = cardata.m1780z();
        cfgData cfgdata = this.f8603d;
        float f3 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        float max = Math.max(0.0f, cardata.m1779y() / 1000.0f);
        this.f8559I0 = new C1572s(0.0f, 220.0f, -135.5f, 136.5f, f3, 1);
        this.f8561J0 = new C1572s(0.0f, 8.0f, -135.5f, 136.5f, max, 1);
        float max2 = Math.max(0.0f, cardata.m1774t());
        float m1743d = cardata.m1743d();
        float f4 = m1743d < 40.0f ? 40.0f : m1743d;
        this.f8563K0 = new C1572s(0.0f, 100.0f, 32.5f, -32.5f, max2, 1);
        this.f8565L0 = new C1572s(40.0f, 130.0f, 32.5f, -32.5f, f4, 1);
        m4335h1(this.f8645r, this.f8559I0);
        m4335h1(this.f8648s, this.f8561J0);
        m4335h1(this.f8651t, this.f8563K0);
        m4335h1(this.f8654u, this.f8565L0);
        ImageView imageView = this.f8639p;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ImageView imageView2 = this.f8642q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        ImageView imageView3 = this.f8645r;
        if (imageView3 != null) {
            imageView3.setImageDrawable(null);
        }
        ImageView imageView4 = this.f8648s;
        if (imageView4 != null) {
            imageView4.setImageDrawable(null);
        }
        ImageView imageView5 = this.f8651t;
        if (imageView5 != null) {
            imageView5.setImageDrawable(null);
        }
        ImageView imageView6 = this.f8654u;
        if (imageView6 != null) {
            imageView6.setImageDrawable(null);
        }
        this.f8660x = m4319R(this.f8645r);
        this.f8662y = m4319R(this.f8648s);
        C1572s c1572s = this.f8559I0;
        if (c1572s != null) {
            float f5 = c1572s.f8682h;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f8664z;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = f5;
                i2++;
            }
        }
        C1572s c1572s2 = this.f8561J0;
        if (c1572s2 != null) {
            float f6 = c1572s2.f8682h;
            while (true) {
                float[] fArr2 = this.f8542A;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = f6;
                i++;
            }
        }
        m4432u0();
        final int i3 = 0;
        m4417p0("themes/47/theme_47_spd.bin", new Consumer(this) { // from class: u0.j0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8341b;

            {
                this.f8341b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i3) {
                    case 0:
                        C1568q0 c1568q0 = this.f8341b;
                        c1568q0.f8656v = bitmap;
                        c1568q0.f8596a1 = -1;
                        c1568q0.m4447z0(c1568q0.f8606e.m1753i());
                        break;
                    case 1:
                        C1568q0 c1568q02 = this.f8341b;
                        c1568q02.f8658w = bitmap;
                        c1568q02.f8596a1 = -1;
                        c1568q02.m4447z0(c1568q02.f8606e.m1753i());
                        break;
                    case 2:
                        C1568q0 c1568q03 = this.f8341b;
                        ImageView imageView7 = c1568q03.f8645r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1568q03.f8648s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1568q03.f8660x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1568q03.f8662y;
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
                        C1568q0 c1568q04 = this.f8341b;
                        ImageView imageView11 = c1568q04.f8651t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1568q04.f8654u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        m4417p0("themes/47/theme_47_rpm.bin", new Consumer(this) { // from class: u0.j0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8341b;

            {
                this.f8341b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i4) {
                    case 0:
                        C1568q0 c1568q0 = this.f8341b;
                        c1568q0.f8656v = bitmap;
                        c1568q0.f8596a1 = -1;
                        c1568q0.m4447z0(c1568q0.f8606e.m1753i());
                        break;
                    case 1:
                        C1568q0 c1568q02 = this.f8341b;
                        c1568q02.f8658w = bitmap;
                        c1568q02.f8596a1 = -1;
                        c1568q02.m4447z0(c1568q02.f8606e.m1753i());
                        break;
                    case 2:
                        C1568q0 c1568q03 = this.f8341b;
                        ImageView imageView7 = c1568q03.f8645r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1568q03.f8648s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1568q03.f8660x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1568q03.f8662y;
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
                        C1568q0 c1568q04 = this.f8341b;
                        ImageView imageView11 = c1568q04.f8651t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1568q04.f8654u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 2;
        m4417p0("themes/47/theme_47_needle.bin", new Consumer(this) { // from class: u0.j0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8341b;

            {
                this.f8341b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i5) {
                    case 0:
                        C1568q0 c1568q0 = this.f8341b;
                        c1568q0.f8656v = bitmap;
                        c1568q0.f8596a1 = -1;
                        c1568q0.m4447z0(c1568q0.f8606e.m1753i());
                        break;
                    case 1:
                        C1568q0 c1568q02 = this.f8341b;
                        c1568q02.f8658w = bitmap;
                        c1568q02.f8596a1 = -1;
                        c1568q02.m4447z0(c1568q02.f8606e.m1753i());
                        break;
                    case 2:
                        C1568q0 c1568q03 = this.f8341b;
                        ImageView imageView7 = c1568q03.f8645r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1568q03.f8648s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1568q03.f8660x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1568q03.f8662y;
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
                        C1568q0 c1568q04 = this.f8341b;
                        ImageView imageView11 = c1568q04.f8651t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1568q04.f8654u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 3;
        m4417p0("themes/47/theme_47_needle_small.bin", new Consumer(this) { // from class: u0.j0

            /* renamed from: b */
            public final /* synthetic */ C1568q0 f8341b;

            {
                this.f8341b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i6) {
                    case 0:
                        C1568q0 c1568q0 = this.f8341b;
                        c1568q0.f8656v = bitmap;
                        c1568q0.f8596a1 = -1;
                        c1568q0.m4447z0(c1568q0.f8606e.m1753i());
                        break;
                    case 1:
                        C1568q0 c1568q02 = this.f8341b;
                        c1568q02.f8658w = bitmap;
                        c1568q02.f8596a1 = -1;
                        c1568q02.m4447z0(c1568q02.f8606e.m1753i());
                        break;
                    case 2:
                        C1568q0 c1568q03 = this.f8341b;
                        ImageView imageView7 = c1568q03.f8645r;
                        if (imageView7 != null) {
                            imageView7.setImageBitmap(bitmap);
                        }
                        ImageView imageView8 = c1568q03.f8648s;
                        if (imageView8 != null) {
                            imageView8.setImageBitmap(bitmap);
                        }
                        ImageView[] imageViewArr = c1568q03.f8660x;
                        if (imageViewArr != null && bitmap != null) {
                            for (ImageView imageView9 : imageViewArr) {
                                if (imageView9 != null) {
                                    imageView9.setImageBitmap(bitmap);
                                }
                            }
                        }
                        ImageView[] imageViewArr2 = c1568q03.f8662y;
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
                        C1568q0 c1568q04 = this.f8341b;
                        ImageView imageView11 = c1568q04.f8651t;
                        if (imageView11 != null) {
                            imageView11.setImageBitmap(bitmap);
                        }
                        ImageView imageView12 = c1568q04.f8654u;
                        if (imageView12 != null) {
                            imageView12.setImageBitmap(bitmap);
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView7 = this.f8639p;
        if (imageView7 != null) {
            imageView7.post(new RunnableC1544i0(this, 5));
        }
        if (!this.f8569N0) {
            m4358K();
            this.f8569N0 = true;
        }
        ViewGroup viewGroup5 = this.f8612g;
        if (viewGroup5 != null) {
            viewGroup5.setAlpha(1.0f);
        }
        this.f8638o1 = 0.0f;
        this.f8573P0 = true;
        this.f8585V0 = 0.0f;
        boolean z2 = cfgdata.f2561Q2;
        this.f8571O0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4424r1();
        this.f8593Z0 = Boolean.valueOf(m4403k0());
        m4356J();
        this.f8567M0 = true;
        handler.post(this.f8647r1);
        handler.post(this.f8653t1);
        this.f8555G0 = AbstractC1372y1.f6437g;
        handler.post(this.f8650s1);
        this.f8557H0.m4171b();
        View view4 = this.f8640p0;
        if (view4 != null) {
            view4.post(new RunnableC1544i0(this, 6));
            return;
        }
        View view5 = this.f8637o0;
        if (view5 != null) {
            view5.post(new RunnableC1544i0(this, 13));
        }
    }

    /* renamed from: m */
    public final void m4407m(boolean z2) {
        boolean z3 = this.f8603d.f2636h2;
        if (z2 || !Boolean.valueOf(z3).equals(this.f8599b1)) {
            this.f8599b1 = Boolean.valueOf(z3);
            this.f8591Y0 = false;
            m4330a1(this.f8639p, z3 ? 1 : 0);
            m4330a1(this.f8642q, z3 ? 1 : 0);
            m4330a1(this.f8645r, z3 ? 1 : 0);
            m4330a1(this.f8648s, z3 ? 1 : 0);
            for (ImageView imageView : this.f8660x) {
                m4330a1(imageView, z3 ? 1 : 0);
            }
            for (ImageView imageView2 : this.f8662y) {
                m4330a1(imageView2, z3 ? 1 : 0);
            }
            m4336l(this.f8639p, z3);
            m4336l(this.f8642q, !z3);
            ImageView imageView3 = this.f8645r;
            if (imageView3 != null && this.f8559I0 != null) {
                imageView3.post(new RunnableC1544i0(this, 15));
            }
            ImageView imageView4 = this.f8648s;
            if (imageView4 != null && this.f8561J0 != null) {
                imageView4.post(new RunnableC1544i0(this, 16));
            }
            ImageView imageView5 = this.f8651t;
            if (imageView5 != null && this.f8563K0 != null) {
                imageView5.post(new RunnableC1544i0(this, 17));
            }
            ImageView imageView6 = this.f8654u;
            if (imageView6 != null && this.f8565L0 != null) {
                imageView6.post(new RunnableC1544i0(this, 18));
            }
            m4437w();
            carData cardata = this.f8606e;
            m4447z0(cardata.m1753i());
            m4444y0(cardata.m1745e());
        }
    }

    /* renamed from: m0 */
    public final void m4408m0() {
        TextView textView;
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f8590Y == null || (textView = this.f8588X) == null || this.f8642q == null) {
            return;
        }
        if (textView.getVisibility() != 0) {
            this.f8590Y.setVisibility(8);
            return;
        }
        if (this.f8642q.getWidth() <= 0 || this.f8588X.getWidth() <= 0 || this.f8590Y.getWidth() <= 0) {
            this.f8590Y.setVisibility(0);
            this.f8642q.post(new RunnableC1544i0(this, 1));
            return;
        }
        this.f8590Y.setVisibility(0);
        float width = (this.f8588X.getWidth() * 0.5f) + this.f8588X.getLeft();
        this.f8611f1 = (((((this.f8642q.getWidth() * 0.5f) + this.f8642q.getLeft()) * 2.0f) - width) - 5.0f) - ((this.f8590Y.getWidth() * 0.5f) + this.f8590Y.getLeft());
        this.f8614g1 = ((this.f8588X.getHeight() * 0.5f) + this.f8588X.getTop()) - ((this.f8590Y.getHeight() * 0.5f) + this.f8590Y.getTop());
        if (this.f8590Y == null || (imageView = this.f8642q) == null || imageView.getWidth() <= 0) {
            return;
        }
        ImageView imageView2 = this.f8642q;
        boolean z2 = imageView2 == m4370Q0();
        float f5 = this.f8617h1;
        if (z2 && m4404k1()) {
            float[] fArr = new float[2];
            m4384c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m4405l0()) {
                f5 = this.f8617h1 * (1.0f - this.f8585V0);
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
            TextView textView2 = this.f8590Y;
            m4318N0(textView2, m4423r0(textView2), m4426s0(this.f8590Y));
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m4331d0(imageView2, f2, z2, fArr2, fArr3);
        TextView textView3 = this.f8590Y;
        m4317I(textView3, f2, fArr2[0], fArr2[1], f3, f4, m4423r0(textView3) + fArr3[0], m4426s0(this.f8590Y) + fArr3[1]);
    }

    /* renamed from: m1 */
    public final void m4409m1(float f2, float f3, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f8575Q0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f8575Q0);
        this.f8575Q0.addUpdateListener(new C0174W(11, this));
        this.f8575Q0.addListener(new C0181b0(this, 9, runnable));
        this.f8575Q0.start();
    }

    /* renamed from: n */
    public final void m4410n() {
        if (this.f8644q1 == null) {
            C1525c c1525c = new C1525c(-15722472);
            this.f8644q1 = c1525c;
            c1525c.m4164f(1720508584);
        }
        C1574t m4366O0 = m4366O0();
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
        }
        this.f8612g.setBackgroundResource(android.R.color.transparent);
        if (!m4366O0.m4472a() || m4415o1()) {
            if (m4366O0.m4472a()) {
                m4393g0();
            }
            m4413o();
        } else if (m4415o1()) {
            m4393g0();
            m4413o();
            m4445y1();
        } else if (this.f8636o == null) {
            m4393g0();
            this.f8644q1.m4163e(null);
            this.f8644q1.m4162d(m4398i1() ? -15854574 : -15722472);
            this.f8612g.setLayerType(1, null);
            this.f8612g.setBackground(this.f8644q1);
        } else if (m4395h0() && this.f8636o.getBackground() == this.f8644q1) {
            this.f8636o.setLayerType(1, null);
            m4445y1();
        } else {
            this.f8636o.setVisibility(0);
            this.f8636o.setLayerType(1, null);
            this.f8636o.setBackground(null);
            RunnableC0123b runnableC0123b = new RunnableC0123b(this, 4, m4366O0);
            if (m4366O0.f8687b != 0) {
                runnableC0123b.run();
            } else {
                Uri uri = m4366O0.f8688c;
                if (uri != null) {
                    this.f8636o.setImageURI(uri);
                    this.f8636o.post(runnableC0123b);
                }
            }
        }
        m4445y1();
    }

    /* renamed from: n0 */
    public final ImageView m4411n0() {
        return this.f8603d.f2636h2 ? this.f8642q : this.f8639p;
    }

    /* renamed from: n1 */
    public final void m4412n1(String str) {
        Context context = this.f8600c;
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
    public final void m4413o() {
        if (this.f8636o == null) {
            m4393g0();
            this.f8644q1.m4163e(null);
            this.f8644q1.m4162d(m4398i1() ? -15854574 : -15722472);
            this.f8612g.setLayerType(1, null);
            this.f8612g.setBackground(this.f8644q1);
            return;
        }
        if (m4395h0()) {
            Drawable background = this.f8636o.getBackground();
            C1525c c1525c = this.f8644q1;
            if (background == c1525c) {
                c1525c.m4163e(null);
                this.f8644q1.m4162d(m4398i1() ? -15854574 : -15722472);
                this.f8636o.setLayerType(1, null);
                return;
            }
        }
        this.f8636o.setVisibility(0);
        this.f8636o.setLayerType(1, null);
        this.f8636o.setImageDrawable(null);
        this.f8636o.setBackground(null);
        this.f8644q1.m4163e(null);
        this.f8644q1.m4162d(m4398i1() ? -15854574 : -15722472);
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup != null) {
            viewGroup.setLayerType(0, null);
            this.f8612g.setBackgroundResource(android.R.color.transparent);
        }
        this.f8636o.setBackground(this.f8644q1);
    }

    /* renamed from: o0 */
    public final float m4414o0() {
        return this.f8603d.f2636h2 ? this.f8605d1 : this.f8602c1;
    }

    /* renamed from: o1 */
    public final boolean m4415o1() {
        return m4398i1() && m4366O0().m4472a();
    }

    /* renamed from: p */
    public final void m4416p(float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f8637o0 == null) {
            return;
        }
        Context context = this.f8600c;
        float f3 = context.getResources().getDisplayMetrics().density;
        float f4 = context.getResources().getDisplayMetrics().scaledDensity;
        float f5 = f3 * 14.0f * f2;
        float f6 = 10.0f * f3 * f2;
        this.f8637o0.setPadding(Math.round(f5), Math.round(f6), AbstractC0062j.m168v(f3, 16.0f, f2), Math.round(f6));
        if (this.f8652t0 != null) {
            int max = Math.max(1, Math.round(72.0f * f3 * f2));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f8652t0.getLayoutParams();
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = max;
                marginLayoutParams2.height = max;
                marginLayoutParams2.setMarginEnd(Math.round(f5));
                this.f8652t0.setLayoutParams(marginLayoutParams2);
            }
        }
        TextView textView = this.f8655u0;
        if (textView != null) {
            AbstractC0062j.m164r(f4, 22.0f, f2, textView, 0);
        }
        TextView textView2 = this.f8657v0;
        if (textView2 != null) {
            AbstractC0062j.m164r(f4, 16.0f, f2, textView2, 0);
        }
        TextView textView3 = this.f8659w0;
        if (textView3 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView3, 0);
            this.f8659w0.setMinWidth(Math.round(f3 * 46.0f * f2));
        }
        TextView textView4 = this.f8661x0;
        if (textView4 != null) {
            AbstractC0062j.m164r(f4, 14.0f, f2, textView4, 0);
            this.f8661x0.setMinWidth(Math.round(46.0f * f3 * f2));
        }
        ProgressBar progressBar = this.f8663y0;
        if (progressBar != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar.getLayoutParams()) != null) {
            marginLayoutParams.height = Math.max(1, Math.round(6.0f * f3 * f2));
            int round = Math.round(f3 * 8.0f * f2);
            marginLayoutParams.setMarginStart(round);
            marginLayoutParams.setMarginEnd(round);
            this.f8663y0.setLayoutParams(marginLayoutParams);
        }
        View view = this.f8637o0;
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
    public final void m4417p0(String str, Consumer consumer) {
        AbstractC1354s1.m3252a(this.f8600c, str, new C1562o0(consumer, 0), this.f8609f, 0);
    }

    /* renamed from: p1 */
    public final void m4418p1() {
        View view;
        View view2;
        TextView textView = this.f8568N;
        boolean z2 = textView != null && textView.getVisibility() == 0;
        ViewGroup viewGroup = this.f8584V;
        boolean z3 = viewGroup != null && viewGroup.getVisibility() == 0;
        boolean z4 = z2 || z3;
        View view3 = this.f8570O;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        int m4375V = m4375V();
        View view4 = this.f8570O;
        if (view4 != null) {
            if (!z2 || m4375V <= 0) {
                view4.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    view4.setLayoutParams(layoutParams);
                }
            } else {
                m4324W0(view4, m4375V);
                View view5 = this.f8570O;
                if (view5 instanceof LinearLayout) {
                    ((LinearLayout) view5).setGravity(17);
                }
                TextView textView2 = this.f8568N;
                if (textView2 != null) {
                    AbstractC1539g1.m4223j(textView2, this.f8570O);
                }
            }
        }
        ViewGroup viewGroup2 = this.f8584V;
        if (viewGroup2 != null) {
            if (z3 && m4375V > 0) {
                TextView textView3 = this.f8586W;
                if (textView3 != null) {
                    int round = Math.round(textView3.getPaint().measureText("000       000")) + this.f8584V.getPaddingEnd() + this.f8584V.getPaddingStart();
                    if (round > 0) {
                        this.f8584V.setMinimumWidth(round);
                    }
                }
                m4324W0(this.f8584V, m4375V);
            } else if (z3 && z2 && (view2 = this.f8570O) != null) {
                view2.post(new RunnableC1544i0(this, 9));
            } else {
                viewGroup2.setMinimumHeight(0);
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    viewGroup2.setLayoutParams(layoutParams2);
                }
            }
        }
        boolean z5 = (z2 && z3) || m4338A1() || m4433u1() > 0.001f;
        View view6 = this.f8646r0;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams3 = view6.getLayoutParams() instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) this.f8646r0.getLayoutParams() : null;
            if (z5) {
                this.f8646r0.setVisibility(0);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 1.0f;
                    this.f8646r0.setLayoutParams(layoutParams3);
                }
            } else {
                this.f8646r0.setVisibility(8);
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 0.0f;
                    this.f8646r0.setLayoutParams(layoutParams3);
                }
            }
        }
        View view7 = this.f8643q0;
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
        boolean m4338A1 = m4338A1();
        if ((this.f8643q0 instanceof ViewGroup) && (view = this.f8570O) != null && this.f8584V != null && this.f8646r0 != null && ((view.getParent() == null || this.f8570O.getParent() == this.f8643q0) && (this.f8584V.getParent() == null || this.f8584V.getParent() == this.f8643q0))) {
            ViewGroup viewGroup3 = (ViewGroup) this.f8643q0;
            View view8 = m4338A1 ? this.f8584V : this.f8570O;
            if (viewGroup3.getChildCount() < 1 || viewGroup3.getChildAt(0) != view8) {
                viewGroup3.removeView(this.f8570O);
                viewGroup3.removeView(this.f8646r0);
                viewGroup3.removeView(this.f8584V);
                if (m4338A1) {
                    viewGroup3.addView(this.f8584V);
                    viewGroup3.addView(this.f8646r0);
                    viewGroup3.addView(this.f8570O);
                } else {
                    viewGroup3.addView(this.f8570O);
                    viewGroup3.addView(this.f8646r0);
                    viewGroup3.addView(this.f8584V);
                }
            }
        }
        if (m4338A1) {
            m4321T0(this.f8584V, 48);
            m4321T0(this.f8570O, 8388661);
        } else {
            m4321T0(this.f8570O, 48);
            m4321T0(this.f8584V, 8388661);
        }
        View view9 = this.f8643q0;
        if (view9 != null) {
            view9.setVisibility(z4 ? 0 : 8);
        }
        View view10 = this.f8640p0;
        if (view10 != null) {
            view10.setVisibility(z4 ? 0 : 8);
        }
    }

    /* renamed from: q */
    public final void m4419q(boolean z2) {
        int i;
        int i2;
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup == null || this.f8579S0) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8612g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8612g.post(new RunnableC1556m0(this, z2, 0));
            return;
        }
        m4374U();
        m4418p1();
        int round = Math.round(this.f8600c.getResources().getDisplayMetrics().density * 96.0f);
        float m4433u1 = m4433u1();
        float max = Math.max(0.0f, Math.min(1.0f, this.f8623j1));
        m4339B(m4433u1);
        m4434v(width, height, round, AbstractC1561o.m4297a(1.0f, this.f8623j1, 0.0f, m4433u1()));
        m4399j(width, height, round, m4433u1);
        boolean z3 = m4433u1 > 0.001f;
        if (this.f8637o0 != null && this.f8603d.f2585W2 && !m4389e0() && !m4400j0()) {
            C0639g.m1872x().m1880u();
            if (C0639g.m1872x().m1880u().m1851a()) {
                if (max >= 0.999f) {
                    this.f8637o0.setAlpha(0.0f);
                    this.f8637o0.setVisibility(4);
                } else if (this.f8637o0.getVisibility() != 0) {
                    this.f8637o0.setVisibility(0);
                }
            }
        }
        View view = this.f8637o0;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int i3 = width - 470;
        int max2 = Math.max(0, i3 / 2);
        int m4298b = AbstractC1561o.m4298b(height, round, 40, 0);
        float f2 = 40.0f * max;
        if (!z3) {
            m4416p(1.0f);
            m4422r(this.f8637o0, round, max2, m4298b, f2, z2);
            this.f8637o0.setAlpha(1.0f - max);
            this.f8637o0.bringToFront();
            View view2 = this.f8640p0;
            if (view2 != null) {
                view2.bringToFront();
            }
            View view3 = this.f8572P;
            if (view3 == null || view3.getVisibility() != 0) {
                return;
            }
            this.f8572P.bringToFront();
            return;
        }
        float f3 = ((-0.19999999f) * m4433u1) + 1.0f;
        m4416p(f3);
        int m152f = AbstractC0062j.m152f(round, f3, 1);
        ImageView m4411n0 = m4411n0();
        if (m4411n0 == null || m4411n0.getWidth() <= 0 || m4411n0.getHeight() <= 0) {
            i = max2;
            i2 = m4298b;
        } else {
            float f4 = this.f8617h1;
            float left = m4411n0.getLeft();
            float width2 = m4411n0.getWidth() * f4;
            float height2 = (m4411n0.getHeight() * f4) + m4411n0.getTop();
            float m149c = AbstractC0062j.m149c(width2, 470, 0.5f, left);
            float f5 = height2 + 23.0f;
            float max3 = Math.max(0.0f, (height - m152f) - 8.0f);
            if (f5 > max3) {
                f5 = max3;
            }
            float f6 = max2;
            int m151e = AbstractC0062j.m151e(m149c, f6, m4433u1, f6);
            float f7 = m4298b;
            int m151e2 = AbstractC0062j.m151e(f5, f7, m4433u1, f7);
            int max4 = Math.max(0, Math.min(m151e, Math.max(0, i3)));
            int max5 = Math.max(0, m151e2);
            i = max4;
            i2 = max5;
        }
        m4422r(this.f8637o0, m152f, i, i2, f2, z2);
        this.f8637o0.setAlpha(1.0f - max);
        this.f8637o0.bringToFront();
        View view4 = this.f8640p0;
        if (view4 != null) {
            view4.bringToFront();
        }
        View view5 = this.f8572P;
        if (view5 == null || view5.getVisibility() != 0) {
            return;
        }
        this.f8572P.bringToFront();
    }

    /* renamed from: q0 */
    public final RectF m4420q0() {
        RectF rectF = new RectF();
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup != null && viewGroup.getWidth() > 0 && this.f8612g.getHeight() > 0) {
            float width = this.f8612g.getWidth() - 0.0f;
            float height = this.f8612g.getHeight();
            if (width > 0.0f && height > 0.0f) {
                rectF.set(0.0f, 0.0f, width, height);
            }
        }
        return rectF;
    }

    /* renamed from: q1 */
    public final void m4421q1(ImageView imageView, float f2, boolean z2, float f3, float f4) {
        ImageView imageView2 = imageView == this.f8639p ? this.f8651t : imageView == this.f8642q ? this.f8654u : null;
        if (imageView2 == null || imageView == null) {
            return;
        }
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m4359K0(imageView2);
            C1572s c1572s = imageView2 == this.f8651t ? this.f8563K0 : this.f8565L0;
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
        m4331d0(imageView, f2, z2, fArr, fArr2);
        m4431u(imageView2, imageView, f2, fArr[0], fArr[1], fArr2[0] + f3, fArr2[1] + f4);
        C1572s c1572s2 = imageView2 == this.f8651t ? this.f8563K0 : this.f8565L0;
        if (c1572s2 != null) {
            c1572s2.m4470a(imageView2);
        }
    }

    /* renamed from: r */
    public final void m4422r(View view, int i, int i2, int i3, float f2, boolean z2) {
        float f3 = this.f8549D0;
        if (f3 < 0.0f) {
            f3 = i2;
        }
        float f4 = f3 + 0.0f;
        float f5 = this.f8551E0;
        float f6 = f5 >= 0.0f ? f5 + this.f8553F0 : i3 + f2;
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
        if (z2 && this.f8551E0 >= 0.0f && z3) {
            view.animate().cancel();
            view.setTranslationX(f4 - f7);
            view.setTranslationY(f6 - f8);
            view.animate().translationX(0.0f).translationY(f2).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            view.animate().cancel();
            view.setTranslationX(0.0f);
            view.setTranslationY(f2);
        }
        this.f8549D0 = f7;
        this.f8551E0 = f8;
        this.f8553F0 = f2;
    }

    /* renamed from: r0 */
    public final float m4423r0(View view) {
        if (view == this.f8566M) {
            return this.f8608e1;
        }
        if (view == this.f8590Y) {
            return this.f8611f1;
        }
        return 0.0f;
    }

    /* renamed from: r1 */
    public final void m4424r1() {
        ValueAnimator valueAnimator = this.f8626k1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8626k1 = null;
        }
        this.f8629l1 = false;
        this.f8632m1 = -1;
        cfgData cfgdata = this.f8603d;
        boolean z2 = cfgdata.f2561Q2;
        Context context = this.f8600c;
        if (!z2) {
            if (cfgdata.f2635h1 != 0) {
                cfgdata.f2635h1 = 0;
                cfgdata.m1795o(context);
            }
            this.f8617h1 = m4430t1();
            this.f8620i1 = 1.0f;
            this.f8623j1 = 0.0f;
            m4345D();
            return;
        }
        if (m4403k0() && cfgdata.f2635h1 == 1) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        if (m4400j0() && cfgdata.f2635h1 != 0) {
            cfgdata.f2635h1 = 0;
            cfgdata.m1795o(context);
        }
        this.f8617h1 = m4405l0() ? m4430t1() : 1.0f;
        this.f8620i1 = m4344C1() ? 1.0f : 0.0f;
        this.f8623j1 = cfgdata.f2635h1 == 2 ? 1.0f : 0.0f;
        m4345D();
        if (m4405l0()) {
            ImageView m4411n0 = m4411n0();
            if (m4411n0 == null) {
                m4411n0 = m4370Q0();
            }
            if (m4411n0 == null || m4411n0.getWidth() > 0) {
                return;
            }
            m4411n0.post(new RunnableC1544i0(this, 22));
        }
    }

    /* renamed from: s */
    public final void m4425s(long j2) {
        boolean z2 = this.f8543A0 > 0;
        ProgressBar progressBar = this.f8663y0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8663y0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f8543A0)));
            }
        }
        TextView textView = this.f8659w0;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8659w0.setText(m4326Y(j2));
            }
        }
        TextView textView2 = this.f8661x0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f8661x0.setText(m4326Y(this.f8543A0));
            }
        }
    }

    /* renamed from: s0 */
    public final float m4426s0(View view) {
        if (view == this.f8590Y) {
            return this.f8614g1;
        }
        return 0.0f;
    }

    /* renamed from: s1 */
    public final void m4427s1(ImageView imageView, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (Math.abs(f2 - 1.0f) < 0.001f) {
            View[] m4381b0 = m4381b0(imageView);
            int length = m4381b0.length;
            for (int i = 0; i < length; i++) {
                View view = m4381b0[i];
                m4318N0(view, (view == this.f8566M ? m4354H0(f2) : m4423r0(view)) + f5 + f7, m4426s0(view) + f6 + f8);
            }
            return;
        }
        View[] m4381b02 = m4381b0(imageView);
        int length2 = m4381b02.length;
        for (int i2 = 0; i2 < length2; i2++) {
            View view2 = m4381b02[i2];
            m4317I(view2, f2, f3, f4, f5, f6, (view2 == this.f8566M ? m4354H0(f2) : m4423r0(view2)) + f7, m4426s0(view2) + f8);
        }
    }

    /* renamed from: t */
    public final void m4428t() {
        ViewGroup viewGroup;
        if (this.f8615h == null || (viewGroup = this.f8612g) == null) {
            return;
        }
        if (viewGroup.getWidth() <= 0 || this.f8612g.getHeight() <= 0) {
            this.f8612g.post(new RunnableC1544i0(this, 7));
            return;
        }
        if (this.f8615h.getLayoutParams() instanceof C1592d) {
            RectF m4420q0 = m4398i1() ? m4420q0() : m4365O();
            C1592d c1592d = (C1592d) this.f8615h.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m4420q0.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m4420q0.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m4420q0.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m4420q0.top);
            this.f8615h.setLayoutParams(c1592d);
            if (m4448z1() || m4341B1()) {
                this.f8615h.setVisibility(4);
            }
            if (m4341B1() || m4401j1()) {
                float f2 = this.f8600c.getResources().getDisplayMetrics().density * 14.0f;
                View view = this.f8627l;
                if (view == null) {
                    return;
                }
                m4332f(view, 25.0f + f2 + 10.0f);
                C1528d c1528d = this.f8633n;
                if (c1528d != null) {
                    c1528d.m4167b(f2);
                }
            }
        }
    }

    /* renamed from: t0 */
    public final RectF m4429t0() {
        Rect m4239u = AbstractC1539g1.m4239u();
        ViewGroup viewGroup = this.f8612g;
        return (viewGroup == null || viewGroup.getWidth() <= 0 || this.f8612g.getHeight() <= 0) ? new RectF() : AbstractC1539g1.m4208b0(m4239u, this.f8612g.getWidth(), this.f8612g.getHeight());
    }

    /* renamed from: t1 */
    public final float m4430t1() {
        ImageView m4411n0 = m4411n0();
        if (m4411n0 == null) {
            m4411n0 = m4370Q0();
        }
        float f2 = this.f8600c.getResources().getDisplayMetrics().density * 87.0f;
        float width = (m4411n0 == null || m4411n0.getWidth() <= 0) ? 730.0f : m4411n0.getWidth();
        return Math.max(0.2f, (width - f2) / width);
    }

    /* renamed from: u */
    public final void m4431u(ImageView imageView, ImageView imageView2, float f2, float f3, float f4, float f5, float f6) {
        if (imageView == null || imageView2 == null) {
            return;
        }
        if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            imageView.post(new RunnableC1544i0(this, 8));
            return;
        }
        float width = (imageView2.getWidth() * 0.5f) + imageView2.getLeft();
        float m149c = AbstractC0062j.m149c(width, f3, f2, f3);
        imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setTranslationX((m149c - ((imageView.getWidth() * 0.5f) + imageView.getLeft())) + f5);
        imageView.setTranslationY((AbstractC0062j.m149c((imageView2.getHeight() * 0.5f) + imageView2.getTop(), f4, f2, f4) - ((imageView.getHeight() * 0.5f) + imageView.getTop())) + f6 + 0.0f);
        ImageView imageView3 = this.f8645r;
        if (imageView == imageView3 || imageView == this.f8648s) {
            C1572s c1572s = imageView == imageView3 ? this.f8559I0 : this.f8561J0;
            if (c1572s != null) {
                c1572s.m4470a(imageView);
            }
            m4349F(imageView);
        }
    }

    /* renamed from: u0 */
    public final void m4432u0() {
        float f2 = this.f8600c.getResources().getDisplayMetrics().density * 6.0f;
        m4323V0(this.f8639p, f2);
        m4323V0(this.f8642q, f2);
        m4323V0(this.f8645r, f2);
        m4323V0(this.f8648s, f2);
        for (ImageView imageView : this.f8660x) {
            m4323V0(imageView, f2);
        }
        for (ImageView imageView2 : this.f8662y) {
            m4323V0(imageView2, f2);
        }
        m4323V0(this.f8651t, f2);
        m4323V0(this.f8654u, f2);
        m4323V0(this.f8607e0, f2);
        m4323V0(this.f8610f0, f2);
        m4323V0(this.f8564L, f2);
        m4323V0(this.f8588X, f2);
        m4323V0(this.f8566M, f2);
        m4323V0(this.f8568N, f2);
        m4323V0(this.f8584V, f2);
        m4323V0(this.f8640p0, f2);
        m4323V0(this.f8637o0, f2);
        m4323V0(this.f8562K, f2);
        m4323V0(this.f8572P, f2);
        m4323V0(this.f8590Y, f2);
        m4323V0(this.f8624k, 2.0f);
        m4323V0(this.f8627l, 2.0f);
        m4323V0(this.f8630m, 2.0f);
        m4323V0(this.f8636o, 0.0f);
    }

    /* renamed from: u1 */
    public final float m4433u1() {
        float m4430t1 = m4430t1();
        if (Math.abs(m4430t1 - 1.0f) < 0.001f) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, (1.0f - this.f8617h1) / (1.0f - m4430t1)));
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
    public final void m4434v(int i, int i2, int i3, float f2) {
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
        View view4 = this.f8640p0;
        if (view4 == null || view4.getVisibility() != 0) {
            return;
        }
        View view5 = this.f8570O;
        boolean z2 = view5 != null && view5.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f8584V;
        boolean z3 = viewGroup2 != null && viewGroup2.getVisibility() == 0;
        boolean z4 = (z2 ^ z3) && !(m4338A1() || (m4433u1() > 0.001f ? 1 : (m4433u1() == 0.001f ? 0 : -1)) > 0);
        int m4375V = m4375V();
        if (m4375V <= 0 || (!z2 && !z3)) {
            if (!z2 || (view = this.f8570O) == null) {
                m4375V = 0;
            } else if (view.getHeight() > 0) {
                m4375V = Math.max(0, this.f8570O.getHeight());
            } else {
                this.f8570O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                m4375V = Math.max(0, this.f8570O.getMeasuredHeight());
            }
            if (z3 && (viewGroup = this.f8584V) != null) {
                if (viewGroup.getHeight() > 0) {
                    max = Math.max(m4375V, this.f8584V.getHeight());
                } else {
                    this.f8584V.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    max = Math.max(m4375V, this.f8584V.getMeasuredHeight());
                }
                m4375V = max;
            }
        }
        if (m4375V <= 0) {
            View view6 = this.f8643q0;
            if (view6 != null && view6.getVisibility() == 0 && this.f8643q0.getHeight() > 0) {
                m4375V = this.f8643q0.getHeight();
            } else if (this.f8640p0.getHeight() > 0) {
                m4375V = this.f8640p0.getHeight();
            }
        }
        if (m4375V <= 0) {
            this.f8640p0.post(new RunnableC1544i0(this, 20));
            return;
        }
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        float max3 = Math.max(0.0f, Math.min(1.0f, this.f8623j1));
        float f7 = (max2 * (-0.19999999f)) + 1.0f;
        if (z4) {
            View view7 = z2 ? this.f8570O : this.f8584V;
            if (view7 != null) {
                view7.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(m4375V, 1073741824));
                if (view7.getMeasuredWidth() > 0) {
                    i4 = view7.getMeasuredWidth();
                    float f8 = i4;
                    float f9 = f8 * f7;
                    float f10 = m4375V * f7;
                    int m4298b = AbstractC1561o.m4298b(i2, i3, 40, 0);
                    int i8 = i - i4;
                    int m152f = AbstractC0062j.m152f(i8, 0.5f, 0);
                    float f11 = m4298b - m4375V;
                    float f12 = 1.0f - max2;
                    int max4 = Math.max(0, Math.round(f11 - (27.0f * f12)));
                    if (max2 <= 0.001f) {
                        ImageView m4370Q0 = m4370Q0();
                        if (m4370Q0 == null || m4370Q0.getWidth() <= 0 || m4370Q0.getHeight() <= 0) {
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
                            float m4430t1 = m4430t1();
                            float f15 = this.f8617h1;
                            float m149c = AbstractC0062j.m149c(m4430t1, f15, max3, f15);
                            f3 = f12;
                            f4 = f8;
                            float width = (((m4370Q0.getWidth() * m149c) - f9) * 0.5f) + AbstractC0062j.m149c(1.0f, m149c, m4370Q0.getWidth(), m4370Q0.getLeft()) + 110.0f;
                            float height = (m4370Q0.getHeight() * m149c) + m4370Q0.getTop() + 23.0f + 70.0f;
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
                    view2 = this.f8640p0;
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
                        this.f8640p0.setLayoutParams(c1592d);
                        f5 = 0.0f;
                        float max7 = (Math.max(0.0f, Math.min(1.0f, max2)) * (-0.19999999f)) + 1.0f;
                        this.f8640p0.setPivotX(z4 ? 0.5f * f4 : 0.0f);
                        this.f8640p0.setPivotY(0.0f);
                        this.f8640p0.setScaleX(max7);
                        this.f8640p0.setScaleY(max7);
                        this.f8640p0.setTranslationX(0.0f);
                        this.f8640p0.setTranslationY(0.0f);
                    }
                    view3 = this.f8640p0;
                    if (view3 != null) {
                        view3.setTranslationX((-15.0f) * max2);
                        this.f8640p0.setTranslationY(f5);
                    }
                    if (this.f8570O != null) {
                        this.f8570O.setTranslationX((m4338A1() ? -50.0f : (-20.0f) * f3) - (7.0f * max3));
                        this.f8570O.setTranslationY(max3 * (-40.0f));
                    }
                    if (this.f8584V == null) {
                        if (m4338A1()) {
                            f6 = m4400j0() ? -235.0f : -215.0f;
                        } else {
                            f6 = ((z4 ? f5 : max2 * (-10.0f)) - (max2 * 15.0f)) - (f3 * 10.0f);
                        }
                        this.f8584V.setTranslationX(f6 - (20.0f * max3));
                        this.f8584V.setTranslationY(max3 * (-40.0f));
                        this.f8584V.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
        }
        i4 = 470;
        float f82 = i4;
        float f92 = f82 * f7;
        float f102 = m4375V * f7;
        int m4298b2 = AbstractC1561o.m4298b(i2, i3, 40, 0);
        int i82 = i - i4;
        int m152f2 = AbstractC0062j.m152f(i82, 0.5f, 0);
        float f112 = m4298b2 - m4375V;
        float f122 = 1.0f - max2;
        int max42 = Math.max(0, Math.round(f112 - (27.0f * f122)));
        if (max2 <= 0.001f) {
        }
        int round2 = m152f2 - Math.round(550.0f * max3);
        view2 = this.f8640p0;
        if (view2 != null) {
        }
        view3 = this.f8640p0;
        if (view3 != null) {
        }
        if (this.f8570O != null) {
        }
        if (this.f8584V == null) {
        }
    }

    /* renamed from: v0 */
    public final void m4435v0() {
        float f2;
        float m1789h;
        float f3;
        int i;
        AbstractC1539g1.m4228l0(this.f8612g, !this.f8571O0);
        carData cardata = this.f8606e;
        float m1780z = cardata.m1780z();
        cfgData cfgdata = this.f8603d;
        float f4 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        C1572s c1572s = this.f8559I0;
        c1572s.f8681g = Math.max(c1572s.f8676b, Math.min(c1572s.f8677c, f4));
        C1572s c1572s2 = this.f8561J0;
        c1572s2.f8681g = Math.max(c1572s2.f8676b, Math.min(c1572s2.f8677c, Math.max(0.0f, cardata.m1779y() / 1000.0f)));
        float m1780z2 = cardata.m1780z();
        float f5 = m1780z2 < 0.0f ? 0.0f : m1780z2 * cfgdata.f2702u3;
        float m1779y = cardata.m1779y() / 1000.0f;
        if (m1779y < 0.0f) {
            m1779y = 0.0f;
        }
        TextView textView = this.f8607e0;
        int i2 = f8540u1;
        if (textView != null) {
            textView.setTextColor(f5 > cfgdata.f2568S1 ? -65536 : f5 > cfgdata.f2564R1 ? -256 : i2);
            this.f8607e0.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f5)).replace(",", "."));
        }
        TextView textView2 = this.f8610f0;
        if (textView2 != null) {
            textView2.setTextColor(m1779y > cfgdata.f2576U1 ? -65536 : m1779y > cfgdata.f2572T1 ? -256 : i2);
            this.f8610f0.setText(AbstractC1256E0.m2986A(m1779y));
        }
        m4350F0();
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
        C1572s c1572s3 = this.f8563K0;
        if (c1572s3 != null) {
            c1572s3.f8681g = Math.max(c1572s3.f8676b, Math.min(c1572s3.f8677c, f3));
        }
        TextView textView3 = this.f8564L;
        if (textView3 != null) {
            m4322U0(textView3, m1789h, "L", f2 < 15.0f ? -65536 : f2 < 30.0f ? -256 : i2);
        }
        int i3 = f2 < 15.0f ? -65536 : f2 < 30.0f ? -256 : i2;
        if (this.f8566M != null) {
            if (!m4379a0() || cfgdata.f2543M0.f7147f) {
                this.f8566M.setVisibility(4);
            } else {
                this.f8566M.setVisibility(0);
                float m1777w = cardata.m1777w();
                if (m1777w < 0.0f) {
                    SpannableString spannableString = new SpannableString("--km");
                    spannableString.setSpan(AbstractC0062j.m155i(this.f8566M, -7829368, i3), 0, 2, 33);
                    this.f8566M.setText(spannableString);
                } else {
                    m4322U0(this.f8566M, m1777w, "km", i3);
                }
            }
        }
        float m1743d = cardata.m1743d();
        C1572s c1572s4 = this.f8565L0;
        if (c1572s4 != null) {
            float f7 = c1572s4.f8676b;
            float f8 = c1572s4.f8677c;
            if (m1743d < -90.0f) {
                c1572s4.f8681g = Math.max(f7, Math.min(f8, 40.0f));
            } else {
                c1572s4.f8681g = Math.max(f7, Math.min(f8, m1743d));
            }
        }
        TextView textView4 = this.f8588X;
        if (textView4 != null) {
            if (m1743d < -90.0f) {
                textView4.setText("--°C");
                this.f8588X.setTextColor(-7829368);
            } else {
                m4322U0(textView4, m1743d, "°C", m1743d < 40.0f ? -16776961 : m1743d > 112.0f ? -65536 : m1743d > 107.0f ? -256 : i2);
                m4408m0();
            }
        }
        float m1765o = cardata.m1765o();
        TextView textView5 = this.f8544B;
        if (textView5 != null) {
            textView5.setTextColor(-1);
            this.f8544B.setText(m1765o > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(m1765o)) : "-.- L");
        }
        if (this.f8546C != null) {
            this.f8546C.setText(this.f8597b.getContext().getString((cardata.m1780z() > 0.0f ? 1 : (cardata.m1780z() == 0.0f ? 0 : -1)) > 0 ? R.string.ip_theme_41_inst_fuel_unit_l100 : R.string.ip_theme_41_inst_fuel_unit_lph));
        }
        m4327Y0(this.f8550E, cardata.m1739b());
        m4327Y0(this.f8556H, cardata.m1737a());
        m4441x0();
        m4346D0();
        if (this.f8586W != null) {
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
            this.f8586W.setText(spannableStringBuilder);
        }
        m4348E0();
        m4343C0();
        m4337A0();
        TextView textView6 = this.f8595a0;
        if (textView6 == null) {
            return;
        }
        textView6.setText(AbstractC1372y1.m3307m(this.f8600c));
    }

    /* renamed from: v1 */
    public final void m4436v1(boolean z2) {
        this.f8609f.removeCallbacks(this.f8581T0);
        if (z2 && AbstractC1372y1.m3272C()) {
            m4361L0();
            return;
        }
        if (!m4397i0()) {
            m4361L0();
            return;
        }
        m4362M();
        if (z2) {
            AbstractC1372y1.m3287R(true, true);
            m4364N();
            this.f8573P0 = false;
            this.f8585V0 = 0.0f;
            if (m4395h0()) {
                m4445y1();
            } else {
                m4438w0();
            }
            m4437w();
            m4409m1(0.0f, 1.0f, new RunnableC1544i0(this, 12));
            return;
        }
        if (m4404k1() && this.f8585V0 > 0.0f) {
            m4437w();
            m4409m1(this.f8585V0, 0.0f, new RunnableC1544i0(this, 14));
        } else {
            this.f8573P0 = true;
            this.f8585V0 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m4356J();
        }
    }

    /* renamed from: w */
    public final void m4437w() {
        m4443y();
        boolean m4379a0 = m4379a0();
        ImageView m4411n0 = m4411n0();
        cfgData cfgdata = this.f8603d;
        boolean z2 = cfgdata.f2636h2;
        ImageView imageView = z2 ? this.f8648s : this.f8645r;
        TextView textView = z2 ? this.f8610f0 : this.f8607e0;
        m4334g1(m4411n0, m4379a0);
        m4334g1(imageView, m4379a0);
        m4385c1(imageView, m4379a0);
        ImageView imageView2 = null;
        m4334g1(textView, m4379a0 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m4411n0 == this.f8639p) {
            imageView2 = this.f8651t;
        } else if (m4411n0 == this.f8642q) {
            imageView2 = this.f8654u;
        }
        m4334g1(imageView2, m4379a0);
        m4382b1(m4411n0, m4379a0);
        if (!m4379a0) {
            m4357J0();
        } else if (m4405l0()) {
            m4402k(m4411n0, imageView, textView, m4414o0(), false, this.f8617h1, 0.0f, 0.0f);
            m4421q1(m4411n0, this.f8617h1, false, 0.0f, 0.0f);
        } else {
            m4357J0();
            m4421q1(m4411n0, 1.0f, false, 0.0f, 0.0f);
        }
        m4419q(false);
        m4342C();
        m4391f0();
        m4440x();
    }

    /* renamed from: w0 */
    public final void m4438w0() {
        C1525c c1525c;
        if (this.f8612g == null) {
            return;
        }
        try {
            if (!this.f8603d.f2561Q2 && !m4400j0()) {
                m4369Q();
                return;
            }
            if (!m4448z1()) {
                if (m4395h0()) {
                    m4372S();
                }
                ViewGroup viewGroup = this.f8612g;
                if (viewGroup != null) {
                    viewGroup.setLayerType(0, null);
                }
                View view = this.f8615h;
                if (view != null) {
                    view.setVisibility(8);
                }
                m4446z();
                return;
            }
            if (!m4395h0()) {
                m4410n();
                m4428t();
                return;
            }
            C1574t m4366O0 = m4366O0();
            if (m4415o1()) {
                C1525c c1525c2 = this.f8644q1;
                if (c1525c2 != null && c1525c2.m4161c()) {
                    m4393g0();
                    m4413o();
                }
            } else if (m4366O0.m4472a() && (c1525c = this.f8644q1) != null && !c1525c.m4161c()) {
                m4410n();
                return;
            }
            m4428t();
            m4445y1();
        } finally {
            m4347E();
        }
    }

    /* renamed from: w1 */
    public final ImageView[] m4439w1(ImageView imageView) {
        if (imageView == this.f8645r) {
            return this.f8660x;
        }
        if (imageView == this.f8648s) {
            return this.f8662y;
        }
        return null;
    }

    /* renamed from: x */
    public final void m4440x() {
        ImageView imageView;
        float f2;
        float f3;
        float f4;
        if (this.f8566M == null || (imageView = this.f8639p) == null) {
            return;
        }
        if (imageView.getWidth() <= 0) {
            this.f8639p.post(new RunnableC1544i0(this, 23));
            return;
        }
        ImageView imageView2 = this.f8639p;
        boolean z2 = imageView2 == m4370Q0();
        float f5 = this.f8617h1;
        if (z2 && m4404k1()) {
            float[] fArr = new float[2];
            m4384c0(fArr);
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (m4405l0()) {
                f5 = this.f8617h1 * (1.0f - this.f8585V0);
            }
            f2 = f5;
            f4 = f7;
            f3 = f6;
        } else {
            f2 = f5;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        float m4354H0 = m4354H0(f2);
        if (Math.abs(f2 - 1.0f) < 0.001f && Math.abs(f3) < 0.01f && Math.abs(f4) < 0.01f) {
            m4318N0(this.f8566M, m4354H0, 0.0f);
            return;
        }
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        m4331d0(imageView2, f2, z2, fArr2, fArr3);
        m4317I(this.f8566M, f2, fArr2[0], fArr2[1], f3, f4, m4354H0 + fArr3[0], fArr3[1]);
    }

    /* renamed from: x0 */
    public final void m4441x0() {
        TextView textView = this.f8590Y;
        if (textView == null) {
            return;
        }
        textView.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(this.f8606e.m1741c())));
        m4408m0();
    }

    /* renamed from: x1 */
    public final void m4442x1() {
        cfgData cfgdata = this.f8603d;
        int i = (cfgdata.f2537K2 && cfgdata.f2589X2 && m4379a0() && !AbstractC1539g1.m4194P(cfgdata, this.f8606e)) ? 0 : 8;
        ImageView imageView = this.f8631m0;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.f8634n0;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
    }

    /* renamed from: y */
    public final void m4443y() {
        boolean z2;
        boolean z3 = m4379a0() && (((z2 = this.f8573P0) && this.f8585V0 <= 0.0f) || z2 || this.f8585V0 < 1.0f);
        ImageView m4370Q0 = m4370Q0();
        cfgData cfgdata = this.f8603d;
        boolean z4 = cfgdata.f2636h2;
        ImageView imageView = z4 ? this.f8645r : this.f8648s;
        TextView textView = z4 ? this.f8607e0 : this.f8610f0;
        m4334g1(m4370Q0, z3);
        m4334g1(imageView, z3);
        m4385c1(imageView, z3);
        ImageView imageView2 = null;
        m4334g1(textView, z3 && AbstractC1539g1.m4220h0(cfgdata, null));
        if (m4370Q0 == this.f8639p) {
            imageView2 = this.f8651t;
        } else if (m4370Q0 == this.f8642q) {
            imageView2 = this.f8654u;
        }
        m4334g1(imageView2, z3);
        m4382b1(m4370Q0, z3);
        if (!z3) {
            m4363M0();
            return;
        }
        if (m4405l0()) {
            float[] fArr = new float[2];
            m4384c0(fArr);
            float f2 = (1.0f - this.f8585V0) * this.f8617h1;
            m4402k(m4370Q0, imageView, textView, m4371R0(), true, f2, fArr[0], fArr[1]);
            m4421q1(m4370Q0, f2, true, fArr[0], fArr[1]);
            return;
        }
        boolean z5 = this.f8573P0;
        float f3 = (!z5 || this.f8585V0 > 0.0f) ? this.f8585V0 : 0.0f;
        float max = (!z5 || this.f8585V0 > 0.0f) ? Math.max(0.0f, 1.0f - this.f8585V0) : 1.0f;
        if (f3 <= 0.0f && Math.abs(max - 1.0f) < 0.001f) {
            m4363M0();
            m4421q1(m4370Q0, 1.0f, true, 0.0f, 0.0f);
            return;
        }
        ImageView m4370Q02 = m4370Q0();
        if (m4370Q02 != null) {
            if (m4370Q02.getWidth() <= 0 || m4370Q02.getHeight() <= 0) {
                m4370Q02.post(new RunnableC1544i0(this, 8));
            } else {
                float[] fArr2 = {this.f8591Y0 ? this.f8587W0 : m4370Q02.getLeft() + (m4370Q02.getWidth() * 0.5f), this.f8591Y0 ? this.f8589X0 : (m4370Q02.getHeight() * 0.5f) + m4370Q02.getTop()};
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float[] fArr3 = new float[2];
                m4384c0(fArr3);
                boolean z6 = cfgdata.f2636h2;
                ImageView imageView3 = z6 ? this.f8645r : this.f8648s;
                TextView textView2 = z6 ? this.f8607e0 : this.f8610f0;
                float m4371R0 = m4371R0();
                float f6 = max;
                m4317I(m4370Q02, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
                m4431u(imageView3, m4370Q02, max, f4, f5, fArr3[0], fArr3[1]);
                m4317I(textView2, f6, f4, f5, fArr3[0], fArr3[1], 0.0f, m4371R0);
                m4427s1(m4370Q02, max, f4, f5, fArr3[0], fArr3[1], 0.0f, 0.0f);
            }
        }
        m4421q1(m4370Q0, max, true, 0.0f, 0.0f);
    }

    /* renamed from: y0 */
    public final void m4444y0(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f8603d;
        if (cfgdata.f2537K2 && cfgdata.f2589X2) {
            boolean m4379a0 = m4379a0();
            carData cardata = this.f8606e;
            if (m4379a0 || AbstractC1539g1.m4194P(cfgdata, cardata)) {
                byte b2 = (byte) (i & 15);
                byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
                EnumC1457c enumC1457c = cfgdata.f2543M0;
                if (!AbstractC1539g1.m4194P(cfgdata, cardata) && (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite)) {
                    b3 = 1;
                    b2 = 1;
                }
                if (b2 == 1) {
                    ImageView imageView2 = this.f8622j0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView2 = this.f8625k0;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                    }
                } else if (b2 == 2) {
                    ImageView imageView3 = this.f8622j0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        this.f8622j0.setColorFilter(-7829368);
                    }
                    TextView textView3 = this.f8625k0;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (b2 == 3) {
                    ImageView imageView4 = this.f8622j0;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        this.f8622j0.setColorFilter(-16711936);
                    }
                    TextView textView4 = this.f8625k0;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
                if (cardata.m1747f() < 20 && (textView = this.f8625k0) != null) {
                    textView.setVisibility(4);
                }
                if (b3 == 1) {
                    ImageView imageView5 = this.f8628l0;
                    if (imageView5 != null) {
                        imageView5.setVisibility(4);
                    }
                } else if (b3 == 2) {
                    ImageView imageView6 = this.f8628l0;
                    if (imageView6 != null) {
                        imageView6.setVisibility(0);
                        this.f8628l0.setColorFilter(-7829368);
                    }
                } else if (b3 == 3 && (imageView = this.f8628l0) != null) {
                    imageView.setVisibility(0);
                    this.f8628l0.setColorFilter(-16711936);
                }
                m4442x1();
                m4360L();
                return;
            }
        }
        m4377X();
    }

    /* renamed from: y1 */
    public final void m4445y1() {
        float f2;
        float f3;
        if (this.f8612g == null || this.f8644q1 == null || !m4448z1()) {
            ViewGroup viewGroup = this.f8612g;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
                return;
            }
            return;
        }
        if (this.f8612g.getWidth() <= 0 || this.f8612g.getHeight() <= 0) {
            this.f8612g.post(new RunnableC1544i0(this, 11));
            return;
        }
        float f4 = this.f8600c.getResources().getDisplayMetrics().density;
        float f5 = 14.0f * f4;
        float f6 = f4 * 1.0f;
        if (m4398i1()) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            f2 = f6;
            f3 = f5;
        }
        this.f8644q1.m4160b();
        if (!this.f8644q1.m4161c()) {
            this.f8644q1.m4162d(m4398i1() ? -15854574 : -15722472);
        }
        if (m4398i1()) {
            ViewGroup viewGroup2 = this.f8612g;
            if (viewGroup2 != null) {
                viewGroup2.getOverlay().clear();
            }
            RectF m4420q0 = m4420q0();
            if (m4420q0.width() > 0.0f && m4420q0.height() > 0.0f) {
                this.f8644q1.m4159a(m4420q0.left, m4420q0.top, m4420q0.right, m4420q0.bottom, f3, f2);
            }
        } else if (m4341B1() || m4401j1()) {
            RectF m4365O = m4365O();
            if (m4341B1() && !m4401j1()) {
                m4365O = m4320S0(m4365O, this.f8620i1);
            }
            if (m4365O.width() <= 0.0f || m4365O.height() <= 0.0f) {
                ViewGroup viewGroup3 = this.f8612g;
                if (viewGroup3 != null) {
                    viewGroup3.getOverlay().clear();
                }
            } else {
                this.f8644q1.m4159a(m4365O.left, m4365O.top, m4365O.right, m4365O.bottom, f5, 0.0f);
                ViewGroup viewGroup4 = this.f8612g;
                if (viewGroup4 != null) {
                    viewGroup4.getOverlay().clear();
                }
            }
        } else {
            ViewGroup viewGroup5 = this.f8612g;
            if (viewGroup5 != null) {
                viewGroup5.getOverlay().clear();
            }
        }
        if (m4404k1()) {
            RectF m4320S0 = m4320S0(m4429t0(), this.f8585V0);
            if (m4320S0.width() > 0.0f && m4320S0.height() > 0.0f) {
                this.f8644q1.m4159a(m4320S0.left, m4320S0.top, m4320S0.right, m4320S0.bottom, f5, 0.0f);
            }
        }
        ImageView imageView = this.f8636o;
        if (imageView != null && imageView.getBackground() == this.f8644q1) {
            this.f8636o.invalidate();
        } else if (this.f8612g.getBackground() == this.f8644q1) {
            this.f8612g.invalidate();
        }
    }

    /* renamed from: z */
    public final void m4446z() {
        ViewGroup viewGroup = this.f8612g;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        if (this.f8636o == null) {
            ViewGroup viewGroup2 = this.f8612g;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(m4398i1() ? -15854574 : -15722472);
                return;
            }
            return;
        }
        C1574t m4366O0 = m4366O0();
        this.f8636o.setVisibility(0);
        this.f8636o.setLayerType(0, null);
        this.f8636o.setTranslationY(0.0f);
        this.f8636o.setBackground(null);
        if (!m4366O0.m4472a()) {
            this.f8636o.setImageDrawable(null);
            this.f8636o.setBackgroundResource(R.drawable.ip_theme_47_bg);
            return;
        }
        int i = m4366O0.f8687b;
        if (i != 0) {
            this.f8636o.setImageResource(i);
            return;
        }
        Uri uri = m4366O0.f8688c;
        if (uri != null) {
            this.f8636o.setImageURI(uri);
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
    public final void m4447z0(int i) {
        Bitmap bitmap;
        int i2;
        ImageView imageView = this.f8639p;
        if (imageView == null || this.f8642q == null || (bitmap = this.f8656v) == null || this.f8658w == null) {
            return;
        }
        cfgData cfgdata = this.f8603d;
        if (cfgdata.f2641i2 && cfgdata.f2615d1.f7096F) {
            i2 = i == 1 ? 1 : 2;
            if (i2 != this.f8596a1) {
                return;
            }
            this.f8596a1 = i2;
            if (i2 == 0) {
                imageView.setImageBitmap(bitmap);
                this.f8642q.setImageBitmap(this.f8658w);
                return;
            } else {
                int i3 = i2 == 1 ? -65536 : f8541v1;
                EnumC1456b enumC1456b = cfgdata.f2615d1;
                AbstractC1261H.m3037b(this.f8600c, imageView, bitmap, "themes/47/theme_47_spd.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                AbstractC1261H.m3037b(this.f8600c, this.f8642q, this.f8658w, "themes/47/theme_47_rpm.bin", i3, enumC1456b.f7097G, enumC1456b.f7098H, enumC1456b.f7099I);
                return;
            }
        }
        i2 = 0;
        if (i2 != this.f8596a1) {
        }
    }

    /* renamed from: z1 */
    public final boolean m4448z1() {
        return this.f8603d.f2537K2 && (m4404k1() || m4403k0() || m4400j0() || m4341B1());
    }
}
