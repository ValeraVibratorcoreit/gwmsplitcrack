package p034Q0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p007C0.AbstractC0067a;
import p018I.AbstractC0136g;
import p022K.AbstractC0169Q;
import p039T0.C0332a;
import p050Z.C0441a;
import p121y0.AbstractC1687o;

/* renamed from: Q0.b */
/* loaded from: classes.dex */
public final class C0285b {

    /* renamed from: A */
    public CharSequence f739A;

    /* renamed from: B */
    public CharSequence f740B;

    /* renamed from: C */
    public boolean f741C;

    /* renamed from: E */
    public Bitmap f743E;

    /* renamed from: F */
    public float f744F;

    /* renamed from: G */
    public float f745G;

    /* renamed from: H */
    public float f746H;

    /* renamed from: I */
    public float f747I;

    /* renamed from: J */
    public float f748J;

    /* renamed from: K */
    public int f749K;

    /* renamed from: L */
    public int[] f750L;

    /* renamed from: M */
    public boolean f751M;

    /* renamed from: N */
    public final TextPaint f752N;

    /* renamed from: O */
    public final TextPaint f753O;

    /* renamed from: P */
    public LinearInterpolator f754P;

    /* renamed from: Q */
    public LinearInterpolator f755Q;

    /* renamed from: R */
    public float f756R;

    /* renamed from: S */
    public float f757S;

    /* renamed from: T */
    public float f758T;

    /* renamed from: U */
    public ColorStateList f759U;

    /* renamed from: V */
    public float f760V;

    /* renamed from: W */
    public float f761W;

    /* renamed from: X */
    public float f762X;

    /* renamed from: Y */
    public StaticLayout f763Y;

    /* renamed from: Z */
    public float f764Z;

    /* renamed from: a */
    public final TextInputLayout f765a;

    /* renamed from: a0 */
    public float f766a0;

    /* renamed from: b */
    public float f767b;

    /* renamed from: b0 */
    public float f768b0;

    /* renamed from: c */
    public final Rect f769c;

    /* renamed from: c0 */
    public CharSequence f770c0;

    /* renamed from: d */
    public final Rect f771d;

    /* renamed from: e */
    public final RectF f773e;

    /* renamed from: j */
    public ColorStateList f780j;

    /* renamed from: k */
    public ColorStateList f781k;

    /* renamed from: l */
    public float f782l;

    /* renamed from: m */
    public float f783m;

    /* renamed from: n */
    public float f784n;

    /* renamed from: o */
    public float f785o;

    /* renamed from: p */
    public float f786p;

    /* renamed from: q */
    public float f787q;

    /* renamed from: r */
    public Typeface f788r;

    /* renamed from: s */
    public Typeface f789s;

    /* renamed from: t */
    public Typeface f790t;

    /* renamed from: u */
    public Typeface f791u;

    /* renamed from: v */
    public Typeface f792v;

    /* renamed from: w */
    public Typeface f793w;

    /* renamed from: x */
    public Typeface f794x;

    /* renamed from: y */
    public C0332a f795y;

    /* renamed from: f */
    public int f775f = 16;

    /* renamed from: g */
    public int f777g = 16;

    /* renamed from: h */
    public float f778h = 15.0f;

    /* renamed from: i */
    public float f779i = 15.0f;

    /* renamed from: z */
    public final TextUtils.TruncateAt f796z = TextUtils.TruncateAt.END;

    /* renamed from: D */
    public final boolean f742D = true;

    /* renamed from: d0 */
    public final int f772d0 = 1;

    /* renamed from: e0 */
    public final float f774e0 = 1.0f;

    /* renamed from: f0 */
    public final int f776f0 = 1;

    public C0285b(TextInputLayout textInputLayout) {
        this.f765a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f752N = textPaint;
        this.f753O = new TextPaint(textPaint);
        this.f771d = new Rect();
        this.f769c = new Rect();
        this.f773e = new RectF();
        m829g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: a */
    public static int m823a(float f2, int i, int i2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    /* renamed from: f */
    public static float m824f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC0067a.m193a(f2, f3, f4);
    }

    /* renamed from: b */
    public final boolean m825b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        boolean z2 = this.f765a.getLayoutDirection() == 1;
        if (this.f742D) {
            return (z2 ? AbstractC0136g.f419d : AbstractC0136g.f418c).m384b(charSequence, charSequence.length());
        }
        return z2;
    }

    /* renamed from: c */
    public final void m826c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f739A == null) {
            return;
        }
        float width = this.f771d.width();
        float width2 = this.f769c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.f779i;
            f4 = this.f760V;
            this.f744F = 1.0f;
            typeface = this.f788r;
        } else {
            float f5 = this.f778h;
            float f6 = this.f761W;
            Typeface typeface2 = this.f791u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f744F = 1.0f;
            } else {
                this.f744F = m824f(this.f778h, this.f779i, f2, this.f755Q) / this.f778h;
            }
            float f7 = this.f779i / this.f778h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f752N;
        if (width > 0.0f) {
            boolean z4 = this.f745G != f3;
            boolean z5 = this.f762X != f4;
            boolean z6 = this.f794x != typeface;
            StaticLayout staticLayout = this.f763Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f751M;
            this.f745G = f3;
            this.f762X = f4;
            this.f794x = typeface;
            this.f751M = false;
            textPaint.setLinearText(this.f744F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f740B == null || z3) {
            textPaint.setTextSize(this.f745G);
            textPaint.setTypeface(this.f794x);
            textPaint.setLetterSpacing(this.f762X);
            boolean m825b = m825b(this.f739A);
            this.f741C = m825b;
            int i = this.f772d0;
            if (i <= 1 || m825b) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f775f, m825b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f741C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f741C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C0290g c0290g = new C0290g(this.f739A, textPaint, (int) width);
            c0290g.f815k = this.f796z;
            c0290g.f814j = m825b;
            c0290g.f809e = alignment;
            c0290g.f813i = false;
            c0290g.f810f = i;
            c0290g.f811g = this.f774e0;
            c0290g.f812h = this.f776f0;
            StaticLayout m837a = c0290g.m837a();
            m837a.getClass();
            this.f763Y = m837a;
            this.f740B = m837a.getText();
        }
    }

    /* renamed from: d */
    public final float m827d() {
        TextPaint textPaint = this.f753O;
        textPaint.setTextSize(this.f779i);
        textPaint.setTypeface(this.f788r);
        textPaint.setLetterSpacing(this.f760V);
        return -textPaint.ascent();
    }

    /* renamed from: e */
    public final int m828e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f750L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: g */
    public final void m829g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f790t;
            if (typeface != null) {
                this.f789s = AbstractC1687o.m4913F(configuration, typeface);
            }
            Typeface typeface2 = this.f793w;
            if (typeface2 != null) {
                this.f792v = AbstractC1687o.m4913F(configuration, typeface2);
            }
            Typeface typeface3 = this.f789s;
            if (typeface3 == null) {
                typeface3 = this.f790t;
            }
            this.f788r = typeface3;
            Typeface typeface4 = this.f792v;
            if (typeface4 == null) {
                typeface4 = this.f793w;
            }
            this.f791u = typeface4;
            m830h(true);
        }
    }

    /* renamed from: h */
    public final void m830h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f765a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        m826c(1.0f, z2);
        CharSequence charSequence = this.f740B;
        TextPaint textPaint = this.f752N;
        if (charSequence != null && (staticLayout = this.f763Y) != null) {
            this.f770c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f796z);
        }
        CharSequence charSequence2 = this.f770c0;
        if (charSequence2 != null) {
            this.f764Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f764Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f777g, this.f741C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f771d;
        if (i == 48) {
            this.f783m = rect.top;
        } else if (i != 80) {
            this.f783m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f783m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f785o = rect.centerX() - (this.f764Z / 2.0f);
        } else if (i2 != 5) {
            this.f785o = rect.left;
        } else {
            this.f785o = rect.right - this.f764Z;
        }
        m826c(0.0f, z2);
        float height = this.f763Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f763Y;
        if (staticLayout2 == null || this.f772d0 <= 1) {
            CharSequence charSequence3 = this.f740B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f763Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f775f, this.f741C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f769c;
        if (i3 == 48) {
            this.f782l = rect2.top;
        } else if (i3 != 80) {
            this.f782l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f782l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f784n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f784n = rect2.left;
        } else {
            this.f784n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f743E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f743E = null;
        }
        m834l(this.f767b);
        float f2 = this.f767b;
        float m824f = m824f(rect2.left, rect.left, f2, this.f754P);
        RectF rectF = this.f773e;
        rectF.left = m824f;
        rectF.top = m824f(this.f782l, this.f783m, f2, this.f754P);
        rectF.right = m824f(rect2.right, rect.right, f2, this.f754P);
        rectF.bottom = m824f(rect2.bottom, rect.bottom, f2, this.f754P);
        this.f786p = m824f(this.f784n, this.f785o, f2, this.f754P);
        this.f787q = m824f(this.f782l, this.f783m, f2, this.f754P);
        m834l(f2);
        C0441a c0441a = AbstractC0067a.f225b;
        this.f766a0 = 1.0f - m824f(0.0f, 1.0f, 1.0f - f2, c0441a);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        textInputLayout.postInvalidateOnAnimation();
        this.f768b0 = m824f(1.0f, 0.0f, f2, c0441a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f781k;
        ColorStateList colorStateList2 = this.f780j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m823a(f2, m828e(colorStateList2), m828e(this.f781k)));
        } else {
            textPaint.setColor(m828e(colorStateList));
        }
        float f3 = this.f760V;
        float f4 = this.f761W;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m824f(f4, f3, f2, c0441a));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f746H = AbstractC0067a.m193a(0.0f, this.f756R, f2);
        this.f747I = AbstractC0067a.m193a(0.0f, this.f757S, f2);
        this.f748J = AbstractC0067a.m193a(0.0f, this.f758T, f2);
        int m823a = m823a(f2, 0, m828e(this.f759U));
        this.f749K = m823a;
        textPaint.setShadowLayer(this.f746H, this.f747I, this.f748J, m823a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: i */
    public final void m831i(ColorStateList colorStateList) {
        if (this.f781k == colorStateList && this.f780j == colorStateList) {
            return;
        }
        this.f781k = colorStateList;
        this.f780j = colorStateList;
        m830h(false);
    }

    /* renamed from: j */
    public final boolean m832j(Typeface typeface) {
        C0332a c0332a = this.f795y;
        if (c0332a != null) {
            c0332a.f944m = true;
        }
        if (this.f790t == typeface) {
            return false;
        }
        this.f790t = typeface;
        Typeface m4913F = AbstractC1687o.m4913F(this.f765a.getContext().getResources().getConfiguration(), typeface);
        this.f789s = m4913F;
        if (m4913F == null) {
            m4913F = this.f790t;
        }
        this.f788r = m4913F;
        return true;
    }

    /* renamed from: k */
    public final void m833k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f767b) {
            this.f767b = f2;
            float f3 = this.f769c.left;
            Rect rect = this.f771d;
            float m824f = m824f(f3, rect.left, f2, this.f754P);
            RectF rectF = this.f773e;
            rectF.left = m824f;
            rectF.top = m824f(this.f782l, this.f783m, f2, this.f754P);
            rectF.right = m824f(r1.right, rect.right, f2, this.f754P);
            rectF.bottom = m824f(r1.bottom, rect.bottom, f2, this.f754P);
            this.f786p = m824f(this.f784n, this.f785o, f2, this.f754P);
            this.f787q = m824f(this.f782l, this.f783m, f2, this.f754P);
            m834l(f2);
            C0441a c0441a = AbstractC0067a.f225b;
            this.f766a0 = 1.0f - m824f(0.0f, 1.0f, 1.0f - f2, c0441a);
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            TextInputLayout textInputLayout = this.f765a;
            textInputLayout.postInvalidateOnAnimation();
            this.f768b0 = m824f(1.0f, 0.0f, f2, c0441a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f781k;
            ColorStateList colorStateList2 = this.f780j;
            TextPaint textPaint = this.f752N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m823a(f2, m828e(colorStateList2), m828e(this.f781k)));
            } else {
                textPaint.setColor(m828e(colorStateList));
            }
            float f4 = this.f760V;
            float f5 = this.f761W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(m824f(f5, f4, f2, c0441a));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.f746H = AbstractC0067a.m193a(0.0f, this.f756R, f2);
            this.f747I = AbstractC0067a.m193a(0.0f, this.f757S, f2);
            this.f748J = AbstractC0067a.m193a(0.0f, this.f758T, f2);
            int m823a = m823a(f2, 0, m828e(this.f759U));
            this.f749K = m823a;
            textPaint.setShadowLayer(this.f746H, this.f747I, this.f748J, m823a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final void m834l(float f2) {
        m826c(f2, false);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        this.f765a.postInvalidateOnAnimation();
    }

    /* renamed from: m */
    public final void m835m(Typeface typeface) {
        boolean z2;
        boolean m832j = m832j(typeface);
        if (this.f793w != typeface) {
            this.f793w = typeface;
            Typeface m4913F = AbstractC1687o.m4913F(this.f765a.getContext().getResources().getConfiguration(), typeface);
            this.f792v = m4913F;
            if (m4913F == null) {
                m4913F = this.f793w;
            }
            this.f791u = m4913F;
            z2 = true;
        } else {
            z2 = false;
        }
        if (m832j || z2) {
            m830h(false);
        }
    }
}
