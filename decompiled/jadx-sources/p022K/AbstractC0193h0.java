package p022K;

import android.view.animation.Interpolator;

/* renamed from: K.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC0193h0 {

    /* renamed from: a */
    public final int f521a;

    /* renamed from: b */
    public float f522b;

    /* renamed from: c */
    public final Interpolator f523c;

    /* renamed from: d */
    public final long f524d;

    public AbstractC0193h0(int i, Interpolator interpolator, long j2) {
        this.f521a = i;
        this.f523c = interpolator;
        this.f524d = j2;
    }

    /* renamed from: a */
    public long mo580a() {
        return this.f524d;
    }

    /* renamed from: b */
    public float mo581b() {
        Interpolator interpolator = this.f523c;
        return interpolator != null ? interpolator.getInterpolation(this.f522b) : this.f522b;
    }

    /* renamed from: c */
    public int mo582c() {
        return this.f521a;
    }

    /* renamed from: d */
    public void mo583d(float f2) {
        this.f522b = f2;
    }
}
