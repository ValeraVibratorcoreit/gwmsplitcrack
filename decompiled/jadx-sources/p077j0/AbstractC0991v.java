package p077j0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: j0.v */
/* loaded from: classes.dex */
public abstract class AbstractC0991v {

    /* renamed from: a */
    public static final C0965A f4728a;

    /* renamed from: b */
    public static final C0971b f4729b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4728a = new C0966B();
        } else {
            f4728a = new C0965A();
        }
        f4729b = new C0971b(Float.class, "translationAlpha", 5);
        new C0971b(Rect.class, "clipBounds", 6);
    }

    /* renamed from: a */
    public static void m2568a(View view, int i, int i2, int i3, int i4) {
        f4728a.mo2509c0(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    public static void m2569b(View view, int i) {
        f4728a.mo2508a0(view, i);
    }
}
