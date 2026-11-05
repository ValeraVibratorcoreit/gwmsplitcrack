package p072g1;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006C.AbstractC0062j;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.C0755p;
import p063d1.EnumC0763x;
import p069f1.C0842n;
import p084l1.C1158a;
import p097q.AbstractC1241e;

/* renamed from: g1.l */
/* loaded from: classes.dex */
public final class C0931l extends AbstractC0764y {

    /* renamed from: c */
    public static final C0930k f4533c = new C0930k(0, new C0931l(EnumC0763x.f3891b));

    /* renamed from: d */
    public static final C0930k f4534d = new C0930k(1, EnumC0763x.f3890a);

    /* renamed from: a */
    public final /* synthetic */ int f4535a = 1;

    /* renamed from: b */
    public final Object f4536b;

    public C0931l(C0752m c0752m, EnumC0763x enumC0763x) {
        this.f4536b = enumC0763x;
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        Object arrayList;
        Serializable arrayList2;
        switch (this.f4535a) {
            case 0:
                int m2788C = c1158a.m2788C();
                int m2943b = AbstractC1241e.m2943b(m2788C);
                if (m2943b == 5 || m2943b == 6) {
                    return ((EnumC0763x) this.f4536b).mo2203a(c1158a);
                }
                if (m2943b == 8) {
                    c1158a.m2814y();
                    return null;
                }
                throw new C0755p("Expecting number, got: " + AbstractC0062j.m146A(m2788C) + "; at path " + c1158a.m2804o(false));
            case 1:
                int m2788C2 = c1158a.m2788C();
                int m2943b2 = AbstractC1241e.m2943b(m2788C2);
                if (m2943b2 == 0) {
                    c1158a.m2797d();
                    arrayList = new ArrayList();
                } else if (m2943b2 != 2) {
                    arrayList = null;
                } else {
                    c1158a.m2798i();
                    arrayList = new C0842n(true);
                }
                if (arrayList == null) {
                    return m2473b(c1158a, m2788C2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c1158a.m2805p()) {
                        String m2812w = arrayList instanceof Map ? c1158a.m2812w() : null;
                        int m2788C3 = c1158a.m2788C();
                        int m2943b3 = AbstractC1241e.m2943b(m2788C3);
                        if (m2943b3 == 0) {
                            c1158a.m2797d();
                            arrayList2 = new ArrayList();
                        } else if (m2943b3 != 2) {
                            arrayList2 = null;
                        } else {
                            c1158a.m2798i();
                            arrayList2 = new C0842n(true);
                        }
                        boolean z2 = arrayList2 != null;
                        if (arrayList2 == null) {
                            arrayList2 = m2473b(c1158a, m2788C3);
                        }
                        if (arrayList instanceof List) {
                            ((List) arrayList).add(arrayList2);
                        } else {
                            ((Map) arrayList).put(m2812w, arrayList2);
                        }
                        if (z2) {
                            arrayDeque.addLast(arrayList);
                            arrayList = arrayList2;
                        }
                    } else {
                        if (arrayList instanceof List) {
                            c1158a.m2801l();
                        } else {
                            c1158a.m2802m();
                        }
                        if (arrayDeque.isEmpty()) {
                            return arrayList;
                        }
                        arrayList = arrayDeque.removeLast();
                    }
                }
            default:
                return ((AbstractC0764y) this.f4536b).mo2196a(c1158a);
        }
    }

    /* renamed from: b */
    public Serializable m2473b(C1158a c1158a, int i) {
        int m2943b = AbstractC1241e.m2943b(i);
        if (m2943b == 5) {
            return c1158a.m2786A();
        }
        if (m2943b == 6) {
            return ((EnumC0763x) this.f4536b).mo2203a(c1158a);
        }
        if (m2943b == 7) {
            return Boolean.valueOf(c1158a.m2808s());
        }
        if (m2943b != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0062j.m146A(i)));
        }
        c1158a.m2814y();
        return null;
    }

    public C0931l(C0752m c0752m, AbstractC0764y abstractC0764y, Type type) {
        this.f4536b = abstractC0764y;
    }

    public C0931l(EnumC0763x enumC0763x) {
        this.f4536b = enumC0763x;
    }
}
