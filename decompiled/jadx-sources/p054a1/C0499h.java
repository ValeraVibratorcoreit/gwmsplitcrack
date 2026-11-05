package p054a1;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p045W0.C0357g;

/* renamed from: a1.h */
/* loaded from: classes.dex */
public final class C0499h extends C0357g {

    /* renamed from: D */
    public static final /* synthetic */ int f1566D = 0;

    /* renamed from: C */
    public C0498g f1567C;

    @Override // p045W0.C0357g
    /* renamed from: f */
    public final void mo953f(Canvas canvas) {
        if (this.f1567C.f1565q.isEmpty()) {
            super.mo953f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f1567C.f1565q);
        super.mo953f(canvas);
        canvas.restore();
    }

    @Override // p045W0.C0357g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1567C = new C0498g(this.f1567C);
        return this;
    }

    /* renamed from: o */
    public final void m1212o(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f1567C.f1565q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
