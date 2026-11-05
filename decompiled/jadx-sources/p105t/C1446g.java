package p105t;

import java.util.Iterator;

/* renamed from: t.g */
/* loaded from: classes.dex */
public class C1446g extends C1445f {

    /* renamed from: m */
    public int f6828m;

    public C1446g(AbstractC1454o abstractC1454o) {
        super(abstractC1454o);
        if (abstractC1454o instanceof C1450k) {
            this.f6820e = 2;
        } else {
            this.f6820e = 3;
        }
    }

    @Override // p105t.C1445f
    /* renamed from: d */
    public final void mo3444d(int i) {
        if (this.f6825j) {
            return;
        }
        this.f6825j = true;
        this.f6822g = i;
        Iterator it = this.f6826k.iterator();
        while (it.hasNext()) {
            InterfaceC1443d interfaceC1443d = (InterfaceC1443d) it.next();
            interfaceC1443d.mo3427a(interfaceC1443d);
        }
    }
}
