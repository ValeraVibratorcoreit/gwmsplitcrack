package p052a;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p022K.C0223w0;
import p022K.C0225x0;
import p045W0.C0355e;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1680h;

/* renamed from: a.q */
/* loaded from: classes.dex */
public class C0477q extends C0476p {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052a.AbstractC0475o
    /* renamed from: a */
    public void mo1194a(C0460F c0460f, C0460F c0460f2, Window window, View view, boolean z2, boolean z3) {
        C0223w0 c0223w0;
        WindowInsetsController insetsController;
        AbstractC1461d.m3494e("statusBarStyle", c0460f);
        AbstractC1461d.m3494e("navigationBarStyle", c0460f2);
        AbstractC1461d.m3494e("window", window);
        AbstractC1461d.m3494e("view", view);
        AbstractC1680h.m4855Q(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C0355e c0355e = new C0355e(view, 5);
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            C0225x0 c0225x0 = new C0225x0(insetsController, c0355e);
            c0225x0.f577d = window;
            c0223w0 = c0225x0;
        } else {
            c0223w0 = new C0223w0(window, c0355e);
        }
        c0223w0.mo312l0(!z2);
        c0223w0.mo310k0(!z3);
    }
}
