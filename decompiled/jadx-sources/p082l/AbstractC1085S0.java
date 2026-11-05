package p082l;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p052a.C0482v;

/* renamed from: l.S0 */
/* loaded from: classes.dex */
public abstract class AbstractC1085S0 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2698a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2699b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0482v(2, runnable);
    }

    /* renamed from: c */
    public static void m2700c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    public static void m2701d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
