package p082l;

import android.view.View;
import p079k.InterfaceC1016k;
import p079k.MenuC1018m;

/* renamed from: l.i */
/* loaded from: classes.dex */
public final class RunnableC1119i implements Runnable {

    /* renamed from: a */
    public final C1115g f5170a;

    /* renamed from: b */
    public final /* synthetic */ C1123k f5171b;

    public RunnableC1119i(C1123k c1123k, C1115g c1115g) {
        this.f5171b = c1123k;
        this.f5170a = c1115g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1016k interfaceC1016k;
        C1123k c1123k = this.f5171b;
        MenuC1018m menuC1018m = c1123k.f5181h;
        if (menuC1018m != null && (interfaceC1016k = menuC1018m.f4833e) != null) {
            interfaceC1016k.mo1878p(menuC1018m);
        }
        View view = (View) c1123k.f5186m;
        if (view != null && view.getWindowToken() != null) {
            C1115g c1115g = this.f5170a;
            if (!c1115g.m2636b()) {
                if (c1115g.f4901e != null) {
                    c1115g.m2638d(0, 0, false, false);
                }
            }
            c1123k.f5197x = c1115g;
        }
        c1123k.f5199z = null;
    }
}
