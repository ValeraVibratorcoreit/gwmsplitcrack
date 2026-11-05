package p007C0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p006C.AbstractC0062j;
import p050Z.C0441a;

/* renamed from: C0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0067a {

    /* renamed from: a */
    public static final LinearInterpolator f224a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0441a f225b = new C0441a(C0441a.f1416d);

    /* renamed from: c */
    public static final C0441a f226c = new C0441a();

    /* renamed from: d */
    public static final C0441a f227d = new C0441a(C0441a.f1417e);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static float m193a(float f2, float f3, float f4) {
        return AbstractC0062j.m149c(f3, f2, f4, f2);
    }

    /* renamed from: b */
    public static float m194b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : m193a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    /* renamed from: c */
    public static int m195c(int i, int i2, float f2) {
        return Math.round(f2 * (i2 - i)) + i;
    }
}
