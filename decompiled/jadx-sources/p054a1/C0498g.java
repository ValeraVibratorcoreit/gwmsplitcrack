package p054a1;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p045W0.C0356f;
import p045W0.C0361k;

/* renamed from: a1.g */
/* loaded from: classes.dex */
public final class C0498g extends C0356f {

    /* renamed from: q */
    public final RectF f1565q;

    public C0498g(C0361k c0361k, RectF rectF) {
        super(c0361k);
        this.f1565q = rectF;
    }

    @Override // p045W0.C0356f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0499h c0499h = new C0499h(this);
        c0499h.f1567C = this;
        c0499h.invalidateSelf();
        return c0499h;
    }

    public C0498g(C0498g c0498g) {
        super(c0498g);
        this.f1565q = c0498g.f1565q;
    }
}
