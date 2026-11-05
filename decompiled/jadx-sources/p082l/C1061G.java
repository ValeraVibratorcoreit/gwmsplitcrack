package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.altaysoft.t500_split.R;
import p008D.AbstractC0070a;
import p008D.AbstractC0071b;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p067f.AbstractC0770a;

/* renamed from: l.G */
/* loaded from: classes.dex */
public final class C1061G extends C1051B {

    /* renamed from: e */
    public final C1059F f5037e;

    /* renamed from: f */
    public Drawable f5038f;

    /* renamed from: g */
    public ColorStateList f5039g;

    /* renamed from: h */
    public PorterDuff.Mode f5040h;

    /* renamed from: i */
    public boolean f5041i;

    /* renamed from: j */
    public boolean f5042j;

    public C1061G(C1059F c1059f) {
        super(c1059f);
        this.f5039g = null;
        this.f5040h = null;
        this.f5041i = false;
        this.f5042j = false;
        this.f5037e = c1059f;
    }

    @Override // p082l.C1051B
    /* renamed from: e */
    public final void mo2658e(AttributeSet attributeSet, int i) {
        super.mo2658e(attributeSet, R.attr.seekBarStyle);
        C1059F c1059f = this.f5037e;
        Context context = c1059f.getContext();
        int[] iArr = AbstractC0770a.f3900g;
        C0198k m591r = C0198k.m591r(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC0169Q.m504i(c1059f, c1059f.getContext(), iArr, attributeSet, (TypedArray) m591r.f534c, R.attr.seekBarStyle);
        Drawable m599i = m591r.m599i(0);
        if (m599i != null) {
            c1059f.setThumb(m599i);
        }
        Drawable m598h = m591r.m598h(1);
        Drawable drawable = this.f5038f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f5038f = m598h;
        if (m598h != null) {
            m598h.setCallback(c1059f);
            AbstractC0071b.m209b(m598h, c1059f.getLayoutDirection());
            if (m598h.isStateful()) {
                m598h.setState(c1059f.getDrawableState());
            }
            m2667i();
        }
        c1059f.invalidate();
        TypedArray typedArray = (TypedArray) m591r.f534c;
        if (typedArray.hasValue(3)) {
            this.f5040h = AbstractC1118h0.m2730b(typedArray.getInt(3, -1), this.f5040h);
            this.f5042j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f5039g = m591r.m597g(2);
            this.f5041i = true;
        }
        m591r.m609t();
        m2667i();
    }

    /* renamed from: i */
    public final void m2667i() {
        Drawable drawable = this.f5038f;
        if (drawable != null) {
            if (this.f5041i || this.f5042j) {
                Drawable mutate = drawable.mutate();
                this.f5038f = mutate;
                if (this.f5041i) {
                    AbstractC0070a.m206h(mutate, this.f5039g);
                }
                if (this.f5042j) {
                    AbstractC0070a.m207i(this.f5038f, this.f5040h);
                }
                if (this.f5038f.isStateful()) {
                    this.f5038f.setState(this.f5037e.getDrawableState());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m2668j(Canvas canvas) {
        if (this.f5038f != null) {
            int max = this.f5037e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f5038f.getIntrinsicWidth();
                int intrinsicHeight = this.f5038f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f5038f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5038f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
