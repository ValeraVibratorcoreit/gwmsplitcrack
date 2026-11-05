package p072g1;

import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p084l1.C1158a;

/* renamed from: g1.u */
/* loaded from: classes.dex */
public class C0940u extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        try {
            return Long.valueOf(c1158a.m2811v());
        } catch (NumberFormatException e2) {
            throw new C0755p(e2);
        }
    }
}
