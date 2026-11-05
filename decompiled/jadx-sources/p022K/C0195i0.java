package p022K;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: K.i0 */
/* loaded from: classes.dex */
public final class C0195i0 {

    /* renamed from: a */
    public AbstractC0193h0 f526a;

    public C0195i0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f526a = new C0191g0(AbstractC0187e0.m561i(i, interpolator, j2));
        } else {
            this.f526a = new C0185d0(i, interpolator, j2);
        }
    }
}
