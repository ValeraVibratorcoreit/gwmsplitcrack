package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p067f.AbstractC0770a;

/* renamed from: l.p */
/* loaded from: classes.dex */
public final class C1133p {

    /* renamed from: a */
    public final View f5225a;

    /* renamed from: d */
    public C1078O0 f5228d;

    /* renamed from: e */
    public C1078O0 f5229e;

    /* renamed from: f */
    public C1078O0 f5230f;

    /* renamed from: c */
    public int f5227c = -1;

    /* renamed from: b */
    public final C1141t f5226b = C1141t.m2762a();

    public C1133p(View view) {
        this.f5225a = view;
    }

    /* renamed from: a */
    public final void m2744a() {
        View view = this.f5225a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f5228d != null) {
                if (this.f5230f == null) {
                    this.f5230f = new C1078O0();
                }
                C1078O0 c1078o0 = this.f5230f;
                c1078o0.f5083a = null;
                c1078o0.f5086d = false;
                c1078o0.f5084b = null;
                c1078o0.f5085c = false;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                ColorStateList m426g = AbstractC0158F.m426g(view);
                if (m426g != null) {
                    c1078o0.f5086d = true;
                    c1078o0.f5083a = m426g;
                }
                PorterDuff.Mode m427h = AbstractC0158F.m427h(view);
                if (m427h != null) {
                    c1078o0.f5085c = true;
                    c1078o0.f5084b = m427h;
                }
                if (c1078o0.f5086d || c1078o0.f5085c) {
                    C1141t.m2765e(background, c1078o0, view.getDrawableState());
                    return;
                }
            }
            C1078O0 c1078o02 = this.f5229e;
            if (c1078o02 != null) {
                C1141t.m2765e(background, c1078o02, view.getDrawableState());
                return;
            }
            C1078O0 c1078o03 = this.f5228d;
            if (c1078o03 != null) {
                C1141t.m2765e(background, c1078o03, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList m2745b() {
        C1078O0 c1078o0 = this.f5229e;
        if (c1078o0 != null) {
            return c1078o0.f5083a;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode m2746c() {
        C1078O0 c1078o0 = this.f5229e;
        if (c1078o0 != null) {
            return c1078o0.f5084b;
        }
        return null;
    }

    /* renamed from: d */
    public final void m2747d(AttributeSet attributeSet, int i) {
        ColorStateList m2674f;
        View view = this.f5225a;
        Context context = view.getContext();
        int[] iArr = AbstractC0770a.f3918y;
        C0198k m591r = C0198k.m591r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) m591r.f534c;
        View view2 = this.f5225a;
        AbstractC0169Q.m504i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) m591r.f534c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f5227c = typedArray.getResourceId(0, -1);
                C1141t c1141t = this.f5226b;
                Context context2 = view.getContext();
                int i2 = this.f5227c;
                synchronized (c1141t) {
                    m2674f = c1141t.f5273a.m2674f(context2, i2);
                }
                if (m2674f != null) {
                    m2750g(m2674f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0158F.m436q(view, m591r.m597g(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0158F.m437r(view, AbstractC1118h0.m2730b(typedArray.getInt(2, -1), null));
            }
        } finally {
            m591r.m609t();
        }
    }

    /* renamed from: e */
    public final void m2748e() {
        this.f5227c = -1;
        m2750g(null);
        m2744a();
    }

    /* renamed from: f */
    public final void m2749f(int i) {
        ColorStateList colorStateList;
        this.f5227c = i;
        C1141t c1141t = this.f5226b;
        if (c1141t != null) {
            Context context = this.f5225a.getContext();
            synchronized (c1141t) {
                colorStateList = c1141t.f5273a.m2674f(context, i);
            }
        } else {
            colorStateList = null;
        }
        m2750g(colorStateList);
        m2744a();
    }

    /* renamed from: g */
    public final void m2750g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5228d == null) {
                this.f5228d = new C1078O0();
            }
            C1078O0 c1078o0 = this.f5228d;
            c1078o0.f5083a = colorStateList;
            c1078o0.f5086d = true;
        } else {
            this.f5228d = null;
        }
        m2744a();
    }

    /* renamed from: h */
    public final void m2751h(ColorStateList colorStateList) {
        if (this.f5229e == null) {
            this.f5229e = new C1078O0();
        }
        C1078O0 c1078o0 = this.f5229e;
        c1078o0.f5083a = colorStateList;
        c1078o0.f5086d = true;
        m2744a();
    }

    /* renamed from: i */
    public final void m2752i(PorterDuff.Mode mode) {
        if (this.f5229e == null) {
            this.f5229e = new C1078O0();
        }
        C1078O0 c1078o0 = this.f5229e;
        c1078o0.f5084b = mode;
        c1078o0.f5085c = true;
        m2744a();
    }
}
