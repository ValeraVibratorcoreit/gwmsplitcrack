package p072g1;

import java.util.UUID;
import p006C.AbstractC0062j;
import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p084l1.C1158a;

/* renamed from: g1.I */
/* loaded from: classes.dex */
public class C0902I extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        String m2786A = c1158a.m2786A();
        try {
            return UUID.fromString(m2786A);
        } catch (IllegalArgumentException e2) {
            StringBuilder m163q = AbstractC0062j.m163q("Failed parsing '", m2786A, "' as UUID; at path ");
            m163q.append(c1158a.m2804o(true));
            throw new C0755p(m163q.toString(), e2);
        }
    }
}
