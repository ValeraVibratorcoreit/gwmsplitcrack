package p036S;

import android.view.animation.Interpolator;

/* renamed from: S.d */
/* loaded from: classes.dex */
public final class InterpolatorC0304d implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ int f852a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f852a) {
            case 0:
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            default:
                float f4 = f2 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }
}
