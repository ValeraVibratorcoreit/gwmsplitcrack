package p072g1;

import java.util.BitSet;
import p006C.AbstractC0062j;
import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p084l1.C1158a;
import p097q.AbstractC1241e;

/* renamed from: g1.O */
/* loaded from: classes.dex */
public class C0908O extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        boolean z2;
        BitSet bitSet = new BitSet();
        c1158a.m2797d();
        int m2788C = c1158a.m2788C();
        int i = 0;
        while (m2788C != 2) {
            int m2943b = AbstractC1241e.m2943b(m2788C);
            if (m2943b == 5 || m2943b == 6) {
                int m2810u = c1158a.m2810u();
                if (m2810u == 0) {
                    z2 = false;
                } else {
                    if (m2810u != 1) {
                        throw new C0755p("Invalid bitset value " + m2810u + ", expected 0 or 1; at path " + c1158a.m2804o(true));
                    }
                    z2 = true;
                }
            } else {
                if (m2943b != 7) {
                    throw new C0755p("Invalid bitset value type: " + AbstractC0062j.m146A(m2788C) + "; at path " + c1158a.m2804o(false));
                }
                z2 = c1158a.m2808s();
            }
            if (z2) {
                bitSet.set(i);
            }
            i++;
            m2788C = c1158a.m2788C();
        }
        c1158a.m2801l();
        return bitSet;
    }
}
