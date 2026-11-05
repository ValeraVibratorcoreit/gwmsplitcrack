package p072g1;

import java.net.URL;
import p063d1.AbstractC0764y;
import p084l1.C1158a;

/* renamed from: g1.F */
/* loaded from: classes.dex */
public class C0899F extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        String m2786A = c1158a.m2786A();
        if (m2786A.equals("null")) {
            return null;
        }
        return new URL(m2786A);
    }
}
