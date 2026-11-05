package p052a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.sun.jna.Callback;
import p104s1.InterfaceC1417a;
import p107t1.AbstractC1461d;

/* renamed from: a.w */
/* loaded from: classes.dex */
public final class C0483w {

    /* renamed from: a */
    public static final C0483w f1533a = new C0483w();

    /* renamed from: a */
    public final OnBackInvokedCallback m1196a(InterfaceC1417a interfaceC1417a) {
        AbstractC1461d.m3494e("onBackInvoked", interfaceC1417a);
        return new C0482v(0, interfaceC1417a);
    }

    /* renamed from: b */
    public final void m1197b(Object obj, int i, Object obj2) {
        AbstractC1461d.m3494e("dispatcher", obj);
        AbstractC1461d.m3494e(Callback.METHOD_NAME, obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: c */
    public final void m1198c(Object obj, Object obj2) {
        AbstractC1461d.m3494e("dispatcher", obj);
        AbstractC1461d.m3494e(Callback.METHOD_NAME, obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
