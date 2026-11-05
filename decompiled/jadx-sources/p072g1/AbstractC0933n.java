package p072g1;

import java.util.Map;
import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p075i1.AbstractC0951c;
import p084l1.C1158a;
import p121y0.AbstractC1687o;

/* renamed from: g1.n */
/* loaded from: classes.dex */
public abstract class AbstractC0933n extends AbstractC0764y {

    /* renamed from: a */
    public final C0935p f4543a;

    public AbstractC0933n(C0935p c0935p) {
        this.f4543a = c0935p;
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        Object mo2474b = mo2474b();
        Map map = this.f4543a.f4546a;
        try {
            c1158a.m2798i();
            while (c1158a.m2805p()) {
                C0932m c0932m = (C0932m) map.get(c1158a.m2812w());
                if (c0932m == null) {
                    c1158a.m2794I();
                } else {
                    mo2476d(mo2474b, c1158a, c0932m);
                }
            }
            c1158a.m2802m();
            return mo2475c(mo2474b);
        } catch (IllegalAccessException e2) {
            AbstractC1687o abstractC1687o = AbstractC0951c.f4566a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalStateException e3) {
            throw new C0755p(e3);
        }
    }

    /* renamed from: b */
    public abstract Object mo2474b();

    /* renamed from: c */
    public abstract Object mo2475c(Object obj);

    /* renamed from: d */
    public abstract void mo2476d(Object obj, C1158a c1158a, C0932m c0932m);
}
