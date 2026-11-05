package p072g1;

import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p084l1.C1158a;

/* renamed from: g1.V */
/* loaded from: classes.dex */
public class C0914V extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        try {
            int m2810u = c1158a.m2810u();
            if (m2810u <= 65535 && m2810u >= -32768) {
                return Short.valueOf((short) m2810u);
            }
            throw new C0755p("Lossy conversion from " + m2810u + " to short; at path " + c1158a.m2804o(true));
        } catch (NumberFormatException e2) {
            throw new C0755p(e2);
        }
    }
}
