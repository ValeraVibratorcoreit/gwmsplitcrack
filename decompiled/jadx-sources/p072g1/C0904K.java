package p072g1;

import java.util.GregorianCalendar;
import p063d1.AbstractC0764y;
import p084l1.C1158a;

/* renamed from: g1.K */
/* loaded from: classes.dex */
public class C0904K extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        int m2810u;
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        c1158a.m2798i();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c1158a.m2788C() != 4) {
            String m2812w = c1158a.m2812w();
            m2810u = c1158a.m2810u();
            m2812w.getClass();
            switch (m2812w) {
                case "dayOfMonth":
                    i3 = m2810u;
                    break;
                case "minute":
                    i5 = m2810u;
                    break;
                case "second":
                    i6 = m2810u;
                    break;
                case "year":
                    i = m2810u;
                    break;
                case "month":
                    i2 = m2810u;
                    break;
                case "hourOfDay":
                    i4 = m2810u;
                    break;
            }
        }
        c1158a.m2802m();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }
}
