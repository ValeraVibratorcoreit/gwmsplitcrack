package p022K;

import android.view.VelocityTracker;

/* renamed from: K.w */
/* loaded from: classes.dex */
public abstract class AbstractC0222w {
    /* renamed from: a */
    public static float m686a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* renamed from: b */
    public static float m687b(VelocityTracker velocityTracker, int i, int i2) {
        return velocityTracker.getAxisVelocity(i, i2);
    }

    /* renamed from: c */
    public static boolean m688c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }
}
