package p072g1;

import p006C.AbstractC0062j;
import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p069f1.AbstractC0832d;
import p084l1.C1158a;

/* renamed from: g1.z */
/* loaded from: classes.dex */
public class C0945z extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        String m2786A = c1158a.m2786A();
        try {
            return AbstractC0832d.m2358i(m2786A);
        } catch (NumberFormatException e2) {
            StringBuilder m163q = AbstractC0062j.m163q("Failed parsing '", m2786A, "' as BigDecimal; at path ");
            m163q.append(c1158a.m2804o(true));
            throw new C0755p(m163q.toString(), e2);
        }
    }
}
