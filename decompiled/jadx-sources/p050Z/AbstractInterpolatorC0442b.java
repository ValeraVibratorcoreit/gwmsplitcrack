package p050Z;

import android.view.animation.Interpolator;
import p006C.AbstractC0062j;

/* renamed from: Z.b */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0442b implements Interpolator {

    /* renamed from: a */
    public final float[] f1418a;

    /* renamed from: b */
    public final float f1419b;

    public AbstractInterpolatorC0442b(float[] fArr) {
        this.f1418a = fArr;
        this.f1419b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1418a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f1419b;
        float f4 = (f2 - (min * f3)) / f3;
        float f5 = fArr[min];
        return AbstractC0062j.m149c(fArr[min + 1], f5, f4, f5);
    }
}
