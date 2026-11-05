package p052a;

import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.InterfaceC0551p;
import androidx.lifecycle.InterfaceC0553r;
import p046X.C0379G;
import p107t1.AbstractC1461d;

/* renamed from: a.z */
/* loaded from: classes.dex */
public final class C0486z implements InterfaceC0551p, InterfaceC0463c {

    /* renamed from: a */
    public final C0555t f1539a;

    /* renamed from: b */
    public final C0379G f1540b;

    /* renamed from: c */
    public C0455A f1541c;

    /* renamed from: d */
    public final /* synthetic */ C0457C f1542d;

    public C0486z(C0457C c0457c, C0555t c0555t, C0379G c0379g) {
        AbstractC1461d.m3494e("lifecycle", c0555t);
        AbstractC1461d.m3494e("onBackPressedCallback", c0379g);
        this.f1542d = c0457c;
        this.f1539a = c0555t;
        this.f1540b = c0379g;
        c0555t.m1377a(this);
    }

    @Override // p052a.InterfaceC0463c
    public final void cancel() {
        this.f1539a.m1382f(this);
        this.f1540b.f1124b.remove(this);
        C0455A c0455a = this.f1541c;
        if (c0455a != null) {
            c0455a.cancel();
        }
        this.f1541c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0551p
    /* renamed from: d */
    public final void mo1177d(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
        if (enumC0547l == EnumC0547l.ON_START) {
            C0457C c0457c = this.f1542d;
            C0379G c0379g = this.f1540b;
            AbstractC1461d.m3494e("onBackPressedCallback", c0379g);
            c0457c.f1464b.addLast(c0379g);
            C0455A c0455a = new C0455A(c0457c, c0379g);
            c0379g.f1124b.add(c0455a);
            c0457c.m1170d();
            c0379g.f1125c = new C0456B(1, c0457c);
            this.f1541c = c0455a;
            return;
        }
        if (enumC0547l != EnumC0547l.ON_STOP) {
            if (enumC0547l == EnumC0547l.ON_DESTROY) {
                cancel();
            }
        } else {
            C0455A c0455a2 = this.f1541c;
            if (c0455a2 != null) {
                c0455a2.cancel();
            }
        }
    }
}
