package p022K;

import android.view.WindowInsetsAnimation;

/* renamed from: K.g0 */
/* loaded from: classes.dex */
public final class C0191g0 extends AbstractC0193h0 {

    /* renamed from: e */
    public final WindowInsetsAnimation f520e;

    public C0191g0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f520e = windowInsetsAnimation;
    }

    @Override // p022K.AbstractC0193h0
    /* renamed from: a */
    public final long mo580a() {
        long durationMillis;
        durationMillis = this.f520e.getDurationMillis();
        return durationMillis;
    }

    @Override // p022K.AbstractC0193h0
    /* renamed from: b */
    public final float mo581b() {
        float interpolatedFraction;
        interpolatedFraction = this.f520e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // p022K.AbstractC0193h0
    /* renamed from: c */
    public final int mo582c() {
        int typeMask;
        typeMask = this.f520e.getTypeMask();
        return typeMask;
    }

    @Override // p022K.AbstractC0193h0
    /* renamed from: d */
    public final void mo583d(float f2) {
        this.f520e.setFraction(f2);
    }
}
