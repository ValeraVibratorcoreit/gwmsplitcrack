package p026M;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: M.a */
/* loaded from: classes.dex */
public abstract class AbstractC0256a {
    /* renamed from: a */
    public static Interpolator m774a(float f2, float f3) {
        return new PathInterpolator(f2, f3);
    }

    /* renamed from: b */
    public static Interpolator m775b(float f2, float f3, float f4, float f5) {
        return new PathInterpolator(f2, f3, f4, f5);
    }

    /* renamed from: c */
    public static Interpolator m776c(Path path) {
        return new PathInterpolator(path);
    }
}
