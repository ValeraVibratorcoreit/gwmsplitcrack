package p025L0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.sun.jna.Function;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p006C.AbstractC0055c;
import p007C0.C0068b;
import p008D.AbstractC0070a;
import p008D.AbstractC0071b;
import p008D.InterfaceC0073d;
import p034Q0.AbstractC0294k;
import p034Q0.C0292i;
import p034Q0.InterfaceC0291h;
import p039T0.C0335d;
import p045W0.C0351a;
import p045W0.C0356f;
import p045W0.C0357g;
import p045W0.C0360j;

/* renamed from: L0.f */
/* loaded from: classes.dex */
public final class C0255f extends C0357g implements Drawable.Callback, InterfaceC0291h {

    /* renamed from: K0 */
    public static final int[] f636K0 = {R.attr.state_enabled};

    /* renamed from: L0 */
    public static final ShapeDrawable f637L0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    public PorterDuffColorFilter f638A0;

    /* renamed from: B0 */
    public ColorStateList f639B0;

    /* renamed from: C */
    public ColorStateList f640C;

    /* renamed from: C0 */
    public PorterDuff.Mode f641C0;

    /* renamed from: D */
    public ColorStateList f642D;

    /* renamed from: D0 */
    public int[] f643D0;

    /* renamed from: E */
    public float f644E;

    /* renamed from: E0 */
    public ColorStateList f645E0;

    /* renamed from: F */
    public float f646F;

    /* renamed from: F0 */
    public WeakReference f647F0;

    /* renamed from: G */
    public ColorStateList f648G;

    /* renamed from: G0 */
    public TextUtils.TruncateAt f649G0;

    /* renamed from: H */
    public float f650H;

    /* renamed from: H0 */
    public boolean f651H0;

    /* renamed from: I */
    public ColorStateList f652I;

    /* renamed from: I0 */
    public int f653I0;

    /* renamed from: J */
    public CharSequence f654J;

    /* renamed from: J0 */
    public boolean f655J0;

    /* renamed from: K */
    public boolean f656K;

    /* renamed from: L */
    public Drawable f657L;

    /* renamed from: M */
    public ColorStateList f658M;

    /* renamed from: N */
    public float f659N;

    /* renamed from: O */
    public boolean f660O;

    /* renamed from: P */
    public boolean f661P;

    /* renamed from: Q */
    public Drawable f662Q;

    /* renamed from: R */
    public RippleDrawable f663R;

    /* renamed from: S */
    public ColorStateList f664S;

    /* renamed from: T */
    public float f665T;

    /* renamed from: U */
    public SpannableStringBuilder f666U;

    /* renamed from: V */
    public boolean f667V;

    /* renamed from: W */
    public boolean f668W;

    /* renamed from: X */
    public Drawable f669X;

    /* renamed from: Y */
    public ColorStateList f670Y;

    /* renamed from: Z */
    public C0068b f671Z;

    /* renamed from: a0 */
    public C0068b f672a0;

    /* renamed from: b0 */
    public float f673b0;

    /* renamed from: c0 */
    public float f674c0;

    /* renamed from: d0 */
    public float f675d0;

    /* renamed from: e0 */
    public float f676e0;

    /* renamed from: f0 */
    public float f677f0;

    /* renamed from: g0 */
    public float f678g0;

    /* renamed from: h0 */
    public float f679h0;

    /* renamed from: i0 */
    public float f680i0;

    /* renamed from: j0 */
    public final Context f681j0;

    /* renamed from: k0 */
    public final Paint f682k0;

    /* renamed from: l0 */
    public final Paint.FontMetrics f683l0;

    /* renamed from: m0 */
    public final RectF f684m0;

    /* renamed from: n0 */
    public final PointF f685n0;

    /* renamed from: o0 */
    public final Path f686o0;

    /* renamed from: p0 */
    public final C0292i f687p0;

    /* renamed from: q0 */
    public int f688q0;

    /* renamed from: r0 */
    public int f689r0;

    /* renamed from: s0 */
    public int f690s0;

    /* renamed from: t0 */
    public int f691t0;

    /* renamed from: u0 */
    public int f692u0;

    /* renamed from: v0 */
    public int f693v0;

    /* renamed from: w0 */
    public boolean f694w0;

    /* renamed from: x0 */
    public int f695x0;

    /* renamed from: y0 */
    public int f696y0;

    /* renamed from: z0 */
    public ColorFilter f697z0;

    public C0255f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action);
        this.f646F = -1.0f;
        this.f682k0 = new Paint(1);
        this.f683l0 = new Paint.FontMetrics();
        this.f684m0 = new RectF();
        this.f685n0 = new PointF();
        this.f686o0 = new Path();
        this.f696y0 = Function.USE_VARARGS;
        this.f641C0 = PorterDuff.Mode.SRC_IN;
        this.f647F0 = new WeakReference(null);
        m956i(context);
        this.f681j0 = context;
        C0292i c0292i = new C0292i(this);
        this.f687p0 = c0292i;
        this.f654J = "";
        c0292i.f816a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f636K0;
        setState(iArr);
        if (!Arrays.equals(this.f643D0, iArr)) {
            this.f643D0 = iArr;
            if (m763T()) {
                m770w(getState(), iArr);
            }
        }
        this.f651H0 = true;
        f637L0.setTint(-1);
    }

    /* renamed from: U */
    public static void m741U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: t */
    public static boolean m742t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: u */
    public static boolean m743u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A */
    public final void m744A(boolean z2) {
        if (this.f668W != z2) {
            boolean m761R = m761R();
            this.f668W = z2;
            boolean m761R2 = m761R();
            if (m761R != m761R2) {
                if (m761R2) {
                    m764o(this.f669X);
                } else {
                    m741U(this.f669X);
                }
                invalidateSelf();
                m769v();
            }
        }
    }

    /* renamed from: B */
    public final void m745B(float f2) {
        if (this.f646F != f2) {
            this.f646F = f2;
            C0360j m968e = this.f1026f.f1008a.m968e();
            m968e.f1052e = new C0351a(f2);
            m968e.f1053f = new C0351a(f2);
            m968e.f1054g = new C0351a(f2);
            m968e.f1055h = new C0351a(f2);
            setShapeAppearanceModel(m968e.m963a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final void m746C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f657L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0073d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m766q = m766q();
            this.f657L = drawable != null ? drawable.mutate() : null;
            float m766q2 = m766q();
            m741U(drawable2);
            if (m762S()) {
                m764o(this.f657L);
            }
            invalidateSelf();
            if (m766q != m766q2) {
                m769v();
            }
        }
    }

    /* renamed from: D */
    public final void m747D(float f2) {
        if (this.f659N != f2) {
            float m766q = m766q();
            this.f659N = f2;
            float m766q2 = m766q();
            invalidateSelf();
            if (m766q != m766q2) {
                m769v();
            }
        }
    }

    /* renamed from: E */
    public final void m748E(ColorStateList colorStateList) {
        this.f660O = true;
        if (this.f658M != colorStateList) {
            this.f658M = colorStateList;
            if (m762S()) {
                AbstractC0070a.m206h(this.f657L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: F */
    public final void m749F(boolean z2) {
        if (this.f656K != z2) {
            boolean m762S = m762S();
            this.f656K = z2;
            boolean m762S2 = m762S();
            if (m762S != m762S2) {
                if (m762S2) {
                    m764o(this.f657L);
                } else {
                    m741U(this.f657L);
                }
                invalidateSelf();
                m769v();
            }
        }
    }

    /* renamed from: G */
    public final void m750G(ColorStateList colorStateList) {
        if (this.f648G != colorStateList) {
            this.f648G = colorStateList;
            if (this.f655J0) {
                C0356f c0356f = this.f1026f;
                if (c0356f.f1011d != colorStateList) {
                    c0356f.f1011d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H */
    public final void m751H(float f2) {
        if (this.f650H != f2) {
            this.f650H = f2;
            this.f682k0.setStrokeWidth(f2);
            if (this.f655J0) {
                this.f1026f.f1017j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public final void m752I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f662Q;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0073d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float m767r = m767r();
            this.f662Q = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateList = this.f652I;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.f663R = new RippleDrawable(colorStateList, this.f662Q, f637L0);
            float m767r2 = m767r();
            m741U(drawable2);
            if (m763T()) {
                m764o(this.f662Q);
            }
            invalidateSelf();
            if (m767r != m767r2) {
                m769v();
            }
        }
    }

    /* renamed from: J */
    public final void m753J(float f2) {
        if (this.f679h0 != f2) {
            this.f679h0 = f2;
            invalidateSelf();
            if (m763T()) {
                m769v();
            }
        }
    }

    /* renamed from: K */
    public final void m754K(float f2) {
        if (this.f665T != f2) {
            this.f665T = f2;
            invalidateSelf();
            if (m763T()) {
                m769v();
            }
        }
    }

    /* renamed from: L */
    public final void m755L(float f2) {
        if (this.f678g0 != f2) {
            this.f678g0 = f2;
            invalidateSelf();
            if (m763T()) {
                m769v();
            }
        }
    }

    /* renamed from: M */
    public final void m756M(ColorStateList colorStateList) {
        if (this.f664S != colorStateList) {
            this.f664S = colorStateList;
            if (m763T()) {
                AbstractC0070a.m206h(this.f662Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N */
    public final void m757N(boolean z2) {
        if (this.f661P != z2) {
            boolean m763T = m763T();
            this.f661P = z2;
            boolean m763T2 = m763T();
            if (m763T != m763T2) {
                if (m763T2) {
                    m764o(this.f662Q);
                } else {
                    m741U(this.f662Q);
                }
                invalidateSelf();
                m769v();
            }
        }
    }

    /* renamed from: O */
    public final void m758O(float f2) {
        if (this.f675d0 != f2) {
            float m766q = m766q();
            this.f675d0 = f2;
            float m766q2 = m766q();
            invalidateSelf();
            if (m766q != m766q2) {
                m769v();
            }
        }
    }

    /* renamed from: P */
    public final void m759P(float f2) {
        if (this.f674c0 != f2) {
            float m766q = m766q();
            this.f674c0 = f2;
            float m766q2 = m766q();
            invalidateSelf();
            if (m766q != m766q2) {
                m769v();
            }
        }
    }

    /* renamed from: Q */
    public final void m760Q(ColorStateList colorStateList) {
        if (this.f652I != colorStateList) {
            this.f652I = colorStateList;
            this.f645E0 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: R */
    public final boolean m761R() {
        return this.f668W && this.f669X != null && this.f694w0;
    }

    /* renamed from: S */
    public final boolean m762S() {
        return this.f656K && this.f657L != null;
    }

    /* renamed from: T */
    public final boolean m763T() {
        return this.f661P && this.f662Q != null;
    }

    @Override // p034Q0.InterfaceC0291h
    /* renamed from: a */
    public final void mo327a() {
        m769v();
        invalidateSelf();
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        float f2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f696y0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f655J0;
        Paint paint = this.f682k0;
        RectF rectF3 = this.f684m0;
        if (!z2) {
            paint.setColor(this.f688q0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m768s(), m768s(), paint);
        }
        if (!this.f655J0) {
            paint.setColor(this.f689r0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f697z0;
            if (colorFilter == null) {
                colorFilter = this.f638A0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m768s(), m768s(), paint);
        }
        if (this.f655J0) {
            super.draw(canvas);
        }
        if (this.f650H > 0.0f && !this.f655J0) {
            paint.setColor(this.f691t0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f655J0) {
                ColorFilter colorFilter2 = this.f697z0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f638A0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.f650H / 2.0f;
            rectF3.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.f646F - (this.f650H / 2.0f);
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
        paint.setColor(this.f692u0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f655J0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f686o0;
            C0356f c0356f = this.f1026f;
            this.f1043w.m969a(c0356f.f1008a, c0356f.f1016i, rectF4, this.f1042v, path);
            m952e(canvas, paint, path, this.f1026f.f1008a, m954g());
        } else {
            canvas.drawRoundRect(rectF3, m768s(), m768s(), paint);
        }
        if (m762S()) {
            m765p(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f657L.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f657L.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (m761R()) {
            m765p(bounds, rectF3);
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f669X.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f669X.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.f651H0 || this.f654J == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f685n0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f654J;
            C0292i c0292i = this.f687p0;
            if (charSequence != null) {
                float m766q = m766q() + this.f673b0 + this.f676e0;
                if (AbstractC0071b.m208a(this) == 0) {
                    pointF.x = bounds.left + m766q;
                } else {
                    pointF.x = bounds.right - m766q;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = c0292i.f816a;
                Paint.FontMetrics fontMetrics = this.f683l0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f654J != null) {
                float m766q2 = m766q() + this.f673b0 + this.f676e0;
                float m767r = m767r() + this.f680i0 + this.f677f0;
                if (AbstractC0071b.m208a(this) == 0) {
                    rectF3.left = bounds.left + m766q2;
                    rectF3.right = bounds.right - m767r;
                } else {
                    rectF3.left = bounds.left + m767r;
                    rectF3.right = bounds.right - m766q2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C0335d c0335d = c0292i.f822g;
            TextPaint textPaint2 = c0292i.f816a;
            if (c0335d != null) {
                textPaint2.drawableState = getState();
                c0292i.f822g.m933e(this.f681j0, textPaint2, c0292i.f817b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f654J.toString();
            if (c0292i.f820e) {
                c0292i.m838a(charSequence2);
                f2 = c0292i.f818c;
            } else {
                f2 = c0292i.f818c;
            }
            boolean z3 = Math.round(f2) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence3 = this.f654J;
            if (z3 && this.f649G0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.f649G0);
            }
            CharSequence charSequence4 = charSequence3;
            int length = charSequence4.length();
            float f10 = pointF.x;
            float f11 = pointF.y;
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence4, 0, length, f10, f11, textPaint2);
            if (z3) {
                canvas.restoreToCount(i5);
            }
        }
        if (m763T()) {
            rectF.setEmpty();
            if (m763T()) {
                float f12 = this.f680i0 + this.f679h0;
                if (AbstractC0071b.m208a(this) == 0) {
                    float f13 = bounds.right - f12;
                    rectF2 = rectF;
                    rectF2.right = f13;
                    rectF2.left = f13 - this.f665T;
                } else {
                    rectF2 = rectF;
                    float f14 = bounds.left + f12;
                    rectF2.left = f14;
                    rectF2.right = f14 + this.f665T;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.f665T;
                float f16 = exactCenterY - (f15 / 2.0f);
                rectF2.top = f16;
                rectF2.bottom = f16 + f15;
            } else {
                rectF2 = rectF;
            }
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.f662Q.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.f663R.setBounds(this.f662Q.getBounds());
            this.f663R.jumpToCurrentState();
            this.f663R.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.f696y0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f696y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f697z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f644E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f2;
        float m766q = m766q() + this.f673b0 + this.f676e0;
        String charSequence = this.f654J.toString();
        C0292i c0292i = this.f687p0;
        if (c0292i.f820e) {
            c0292i.m838a(charSequence);
            f2 = c0292i.f818c;
        } else {
            f2 = c0292i.f818c;
        }
        return Math.min(Math.round(m767r() + f2 + m766q + this.f677f0 + this.f680i0), this.f653I0);
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f655J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f644E, this.f646F);
        } else {
            outline.setRoundRect(bounds, this.f646F);
        }
        outline.setAlpha(this.f696y0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C0335d c0335d;
        ColorStateList colorStateList;
        return m742t(this.f640C) || m742t(this.f642D) || m742t(this.f648G) || !((c0335d = this.f687p0.f822g) == null || (colorStateList = c0335d.f960j) == null || !colorStateList.isStateful()) || ((this.f668W && this.f669X != null && this.f667V) || m743u(this.f657L) || m743u(this.f669X) || m742t(this.f639B0));
    }

    /* renamed from: o */
    public final void m764o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0071b.m209b(drawable, AbstractC0071b.m208a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f662Q) {
            if (drawable.isStateful()) {
                drawable.setState(this.f643D0);
            }
            AbstractC0070a.m206h(drawable, this.f664S);
            return;
        }
        Drawable drawable2 = this.f657L;
        if (drawable == drawable2 && this.f660O) {
            AbstractC0070a.m206h(drawable2, this.f658M);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m762S()) {
            onLayoutDirectionChanged |= AbstractC0071b.m209b(this.f657L, i);
        }
        if (m761R()) {
            onLayoutDirectionChanged |= AbstractC0071b.m209b(this.f669X, i);
        }
        if (m763T()) {
            onLayoutDirectionChanged |= AbstractC0071b.m209b(this.f662Q, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m762S()) {
            onLevelChange |= this.f657L.setLevel(i);
        }
        if (m761R()) {
            onLevelChange |= this.f669X.setLevel(i);
        }
        if (m763T()) {
            onLevelChange |= this.f662Q.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable, p034Q0.InterfaceC0291h
    public final boolean onStateChange(int[] iArr) {
        if (this.f655J0) {
            super.onStateChange(iArr);
        }
        return m770w(iArr, this.f643D0);
    }

    /* renamed from: p */
    public final void m765p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m762S() || m761R()) {
            float f2 = this.f673b0 + this.f674c0;
            Drawable drawable = this.f694w0 ? this.f669X : this.f657L;
            float f3 = this.f659N;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (AbstractC0071b.m208a(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.f694w0 ? this.f669X : this.f657L;
            float f6 = this.f659N;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(AbstractC0294k.m843d(this.f681j0, 24));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f6 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    /* renamed from: q */
    public final float m766q() {
        if (!m762S() && !m761R()) {
            return 0.0f;
        }
        float f2 = this.f674c0;
        Drawable drawable = this.f694w0 ? this.f669X : this.f657L;
        float f3 = this.f659N;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f675d0;
    }

    /* renamed from: r */
    public final float m767r() {
        if (m763T()) {
            return this.f678g0 + this.f665T + this.f679h0;
        }
        return 0.0f;
    }

    /* renamed from: s */
    public final float m768s() {
        return this.f655J0 ? this.f1026f.f1008a.f1064e.mo939a(m954g()) : this.f646F;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f696y0 != i) {
            this.f696y0 = i;
            invalidateSelf();
        }
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f697z0 != colorFilter) {
            this.f697z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f639B0 != colorStateList) {
            this.f639B0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f641C0 != mode) {
            this.f641C0 = mode;
            ColorStateList colorStateList = this.f639B0;
            this.f638A0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (m762S()) {
            visible |= this.f657L.setVisible(z2, z3);
        }
        if (m761R()) {
            visible |= this.f669X.setVisible(z2, z3);
        }
        if (m763T()) {
            visible |= this.f662Q.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public final void m769v() {
        InterfaceC0254e interfaceC0254e = (InterfaceC0254e) this.f647F0.get();
        if (interfaceC0254e != null) {
            Chip chip = (Chip) interfaceC0254e;
            chip.m2066b(chip.f3465u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m770w(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z2;
        boolean z3;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f640C;
        int m950c = m950c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f688q0) : 0);
        boolean z4 = true;
        if (this.f688q0 != m950c) {
            this.f688q0 = m950c;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f642D;
        int m950c2 = m950c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f689r0) : 0);
        if (this.f689r0 != m950c2) {
            this.f689r0 = m950c2;
            onStateChange = true;
        }
        int m105b = AbstractC0055c.m105b(m950c2, m950c);
        if ((this.f690s0 != m105b) | (this.f1026f.f1010c == null)) {
            this.f690s0 = m105b;
            m958k(ColorStateList.valueOf(m105b));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f648G;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f691t0) : 0;
        if (this.f691t0 != colorForState3) {
            this.f691t0 = colorForState3;
            onStateChange = true;
        }
        if (this.f645E0 != null) {
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z6 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z7 = true;
                }
            }
            if (z6 && z7) {
                z5 = true;
            }
            if (z5) {
                i = this.f645E0.getColorForState(iArr, this.f692u0);
                if (this.f692u0 != i) {
                    this.f692u0 = i;
                }
                C0335d c0335d = this.f687p0.f822g;
                colorForState = (c0335d != null || (colorStateList = c0335d.f960j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f693v0);
                if (this.f693v0 != colorForState) {
                    this.f693v0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.f667V) {
                            z2 = true;
                        }
                    }
                }
                z2 = false;
                if (this.f694w0 != z2 || this.f669X == null) {
                    z3 = false;
                } else {
                    float m766q = m766q();
                    this.f694w0 = z2;
                    if (m766q != m766q()) {
                        onStateChange = true;
                        z3 = true;
                    } else {
                        z3 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.f639B0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f695x0) : 0;
                if (this.f695x0 == colorForState2) {
                    this.f695x0 = colorForState2;
                    ColorStateList colorStateList6 = this.f639B0;
                    PorterDuff.Mode mode = this.f641C0;
                    this.f638A0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (m743u(this.f657L)) {
                    z4 |= this.f657L.setState(iArr);
                }
                if (m743u(this.f669X)) {
                    z4 |= this.f669X.setState(iArr);
                }
                if (m743u(this.f662Q)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f662Q.setState(iArr3);
                }
                if (m743u(this.f663R)) {
                    z4 |= this.f663R.setState(iArr2);
                }
                if (z4) {
                    invalidateSelf();
                }
                if (z3) {
                    m769v();
                }
                return z4;
            }
        }
        i = 0;
        if (this.f692u0 != i) {
        }
        C0335d c0335d2 = this.f687p0.f822g;
        if (c0335d2 != null) {
        }
        if (this.f693v0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z2 = false;
        if (this.f694w0 != z2) {
        }
        z3 = false;
        ColorStateList colorStateList52 = this.f639B0;
        if (colorStateList52 == null) {
        }
        if (this.f695x0 == colorForState2) {
        }
        if (m743u(this.f657L)) {
        }
        if (m743u(this.f669X)) {
        }
        if (m743u(this.f662Q)) {
        }
        if (m743u(this.f663R)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    /* renamed from: x */
    public final void m771x(boolean z2) {
        if (this.f667V != z2) {
            this.f667V = z2;
            float m766q = m766q();
            if (!z2 && this.f694w0) {
                this.f694w0 = false;
            }
            float m766q2 = m766q();
            invalidateSelf();
            if (m766q != m766q2) {
                m769v();
            }
        }
    }

    /* renamed from: y */
    public final void m772y(Drawable drawable) {
        if (this.f669X != drawable) {
            float m766q = m766q();
            this.f669X = drawable;
            float m766q2 = m766q();
            m741U(this.f669X);
            m764o(this.f669X);
            invalidateSelf();
            if (m766q != m766q2) {
                m769v();
            }
        }
    }

    /* renamed from: z */
    public final void m773z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f670Y != colorStateList) {
            this.f670Y = colorStateList;
            if (this.f668W && (drawable = this.f669X) != null && this.f667V) {
                AbstractC0070a.m206h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
