package p052a;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import p107t1.AbstractC1461d;

/* renamed from: a.g */
/* loaded from: classes.dex */
public final class C0467g {

    /* renamed from: a */
    public static final C0467g f1484a = new C0467g();

    /* renamed from: a */
    public final OnBackInvokedDispatcher m1178a(Activity activity) {
        AbstractC1461d.m3494e("activity", activity);
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC1461d.m3493d("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
        return onBackInvokedDispatcher;
    }
}
