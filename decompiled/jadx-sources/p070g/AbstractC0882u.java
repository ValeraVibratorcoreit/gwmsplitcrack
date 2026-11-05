package p070g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p024L.AbstractC0234d;
import p052a.C0482v;

/* renamed from: g.u */
/* loaded from: classes.dex */
public abstract class AbstractC0882u {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2432a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2433b(Object obj, LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z) {
        Objects.requireNonNull(layoutInflaterFactory2C0887z);
        C0482v c0482v = new C0482v(1, layoutInflaterFactory2C0887z);
        AbstractC0234d.m698e(obj).registerOnBackInvokedCallback(1000000, c0482v);
        return c0482v;
    }

    /* renamed from: c */
    public static void m2434c(Object obj, Object obj2) {
        AbstractC0234d.m698e(obj).unregisterOnBackInvokedCallback(AbstractC0234d.m695b(obj2));
    }
}
