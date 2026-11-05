package p052a;

import p046X.C0379G;
import p090n1.C1177a;
import p107t1.AbstractC1461d;

/* renamed from: a.A */
/* loaded from: classes.dex */
public final class C0455A implements InterfaceC0463c {

    /* renamed from: a */
    public final C0379G f1456a;

    /* renamed from: b */
    public final /* synthetic */ C0457C f1457b;

    public C0455A(C0457C c0457c, C0379G c0379g) {
        AbstractC1461d.m3494e("onBackPressedCallback", c0379g);
        this.f1457b = c0457c;
        this.f1456a = c0379g;
    }

    @Override // p052a.InterfaceC0463c
    public final void cancel() {
        C0457C c0457c = this.f1457b;
        C1177a c1177a = c0457c.f1464b;
        C0379G c0379g = this.f1456a;
        c1177a.remove(c0379g);
        if (AbstractC1461d.m3490a(c0457c.f1465c, c0379g)) {
            c0379g.getClass();
            c0457c.f1465c = null;
        }
        c0379g.f1124b.remove(this);
        C0456B c0456b = c0379g.f1125c;
        if (c0456b != null) {
            c0456b.mo1164a();
        }
        c0379g.f1125c = null;
    }
}
