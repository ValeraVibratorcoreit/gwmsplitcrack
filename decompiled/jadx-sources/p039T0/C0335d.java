package p039T0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p003B.AbstractC0049p;
import p004B0.AbstractC0051a;
import p010D1.AbstractC0088l;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: T0.d */
/* loaded from: classes.dex */
public final class C0335d {

    /* renamed from: a */
    public final ColorStateList f951a;

    /* renamed from: b */
    public final String f952b;

    /* renamed from: c */
    public final int f953c;

    /* renamed from: d */
    public final int f954d;

    /* renamed from: e */
    public final float f955e;

    /* renamed from: f */
    public final float f956f;

    /* renamed from: g */
    public final float f957g;

    /* renamed from: h */
    public final boolean f958h;

    /* renamed from: i */
    public final float f959i;

    /* renamed from: j */
    public final ColorStateList f960j;

    /* renamed from: k */
    public float f961k;

    /* renamed from: l */
    public final int f962l;

    /* renamed from: m */
    public boolean f963m = false;

    /* renamed from: n */
    public Typeface f964n;

    public C0335d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0051a.f162A);
        this.f961k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f960j = AbstractC0088l.m255B(context, obtainStyledAttributes, 3);
        AbstractC0088l.m255B(context, obtainStyledAttributes, 4);
        AbstractC0088l.m255B(context, obtainStyledAttributes, 5);
        this.f953c = obtainStyledAttributes.getInt(2, 0);
        this.f954d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f962l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f952b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f951a = AbstractC0088l.m255B(context, obtainStyledAttributes, 6);
        this.f955e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f956f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f957g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0051a.f183r);
        this.f958h = obtainStyledAttributes2.hasValue(0);
        this.f959i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m929a() {
        String str;
        Typeface typeface = this.f964n;
        int i = this.f953c;
        if (typeface == null && (str = this.f952b) != null) {
            this.f964n = Typeface.create(str, i);
        }
        if (this.f964n == null) {
            int i2 = this.f954d;
            if (i2 == 1) {
                this.f964n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f964n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f964n = Typeface.DEFAULT;
            } else {
                this.f964n = Typeface.MONOSPACE;
            }
            this.f964n = Typeface.create(this.f964n, i);
        }
    }

    /* renamed from: b */
    public final Typeface m930b(Context context) {
        if (this.f963m) {
            return this.f964n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m101a = AbstractC0049p.m101a(context, this.f962l);
                this.f964n = m101a;
                if (m101a != null) {
                    this.f964n = Typeface.create(m101a, this.f953c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f952b, e2);
            }
        }
        m929a();
        this.f963m = true;
        return this.f964n;
    }

    /* renamed from: c */
    public final void m931c(Context context, AbstractC1680h abstractC1680h) {
        if (m932d(context)) {
            m930b(context);
        } else {
            m929a();
        }
        int i = this.f962l;
        if (i == 0) {
            this.f963m = true;
        }
        if (this.f963m) {
            abstractC1680h.mo738H(this.f964n, true);
            return;
        }
        try {
            C0333b c0333b = new C0333b(this, abstractC1680h);
            ThreadLocal threadLocal = AbstractC0049p.f148a;
            if (context.isRestricted()) {
                c0333b.m51a(-4);
            } else {
                AbstractC0049p.m102b(context, i, new TypedValue(), 0, c0333b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f963m = true;
            abstractC1680h.mo737G(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f952b, e2);
            this.f963m = true;
            abstractC1680h.mo737G(-3);
        }
    }

    /* renamed from: d */
    public final boolean m932d(Context context) {
        Typeface typeface = null;
        int i = this.f962l;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC0049p.f148a;
            if (!context.isRestricted()) {
                typeface = AbstractC0049p.m102b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    /* renamed from: e */
    public final void m933e(Context context, TextPaint textPaint, AbstractC1680h abstractC1680h) {
        m934f(context, textPaint, abstractC1680h);
        ColorStateList colorStateList = this.f960j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f951a;
        textPaint.setShadowLayer(this.f957g, this.f955e, this.f956f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m934f(Context context, TextPaint textPaint, AbstractC1680h abstractC1680h) {
        if (m932d(context)) {
            m935g(context, textPaint, m930b(context));
            return;
        }
        m929a();
        m935g(context, textPaint, this.f964n);
        m931c(context, new C0334c(this, context, textPaint, abstractC1680h));
    }

    /* renamed from: g */
    public final void m935g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface m4913F = AbstractC1687o.m4913F(context.getResources().getConfiguration(), typeface);
        if (m4913F != null) {
            typeface = m4913F;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f953c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f961k);
        if (this.f958h) {
            textPaint.setLetterSpacing(this.f959i);
        }
    }
}
