package p052a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.InterfaceC0551p;
import androidx.lifecycle.InterfaceC0553r;
import p070g.AbstractActivityC0870i;
import p107t1.AbstractC1461d;

/* renamed from: a.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0466f implements InterfaceC0551p {

    /* renamed from: a */
    public final /* synthetic */ C0457C f1482a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0870i f1483b;

    public /* synthetic */ C0466f(C0457C c0457c, AbstractActivityC0870i abstractActivityC0870i) {
        this.f1482a = c0457c;
        this.f1483b = abstractActivityC0870i;
    }

    @Override // androidx.lifecycle.InterfaceC0551p
    /* renamed from: d */
    public final void mo1177d(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
        C0457C c0457c = this.f1482a;
        AbstractActivityC0870i abstractActivityC0870i = this.f1483b;
        if (enumC0547l == EnumC0547l.ON_CREATE) {
            OnBackInvokedDispatcher m1178a = C0467g.f1484a.m1178a(abstractActivityC0870i);
            AbstractC1461d.m3494e("invoker", m1178a);
            c0457c.f1467e = m1178a;
            c0457c.m1169c(c0457c.f1469g);
        }
    }
}
