package p063d1;

import p072g1.AbstractC0938s;
import p084l1.C1158a;

/* renamed from: d1.l */
/* loaded from: classes.dex */
public class C0751l extends AbstractC0938s {

    /* renamed from: a */
    public AbstractC0764y f3877a = null;

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        AbstractC0764y abstractC0764y = this.f3877a;
        if (abstractC0764y != null) {
            return abstractC0764y.mo2196a(c1158a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
