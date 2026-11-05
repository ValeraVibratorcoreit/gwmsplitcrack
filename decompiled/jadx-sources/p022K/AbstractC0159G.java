package p022K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.G */
/* loaded from: classes.dex */
public abstract class AbstractC0159G {
    /* renamed from: a */
    public static C0221v0 m446a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0221v0 m680g = C0221v0.m680g(null, rootWindowInsets);
        C0217t0 c0217t0 = m680g.f573a;
        c0217t0.mo659p(m680g);
        c0217t0.mo653d(view.getRootView());
        return m680g;
    }

    /* renamed from: b */
    public static int m447b(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: c */
    public static void m448c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* renamed from: d */
    public static void m449d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
