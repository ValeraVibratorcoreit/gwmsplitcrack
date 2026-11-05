package p072g1;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.C0755p;
import p066e1.InterfaceC0769b;
import p069f1.C0833e;
import p069f1.InterfaceC0843o;
import p084l1.C1158a;

/* renamed from: g1.j */
/* loaded from: classes.dex */
public final class C0929j extends AbstractC0764y {

    /* renamed from: a */
    public final /* synthetic */ int f4527a;

    /* renamed from: b */
    public final Object f4528b;

    /* renamed from: c */
    public final Object f4529c;

    /* renamed from: d */
    public final Object f4530d;

    public C0929j(C0923d c0923d, C0752m c0752m, Type type, AbstractC0764y abstractC0764y, Type type2, AbstractC0764y abstractC0764y2, InterfaceC0843o interfaceC0843o) {
        this.f4527a = 0;
        this.f4528b = new C0931l(c0752m, abstractC0764y, type);
        this.f4529c = new C0931l(c0752m, abstractC0764y2, type2);
        this.f4530d = interfaceC0843o;
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        switch (this.f4527a) {
            case 0:
                int m2788C = c1158a.m2788C();
                if (m2788C == 9) {
                    c1158a.m2814y();
                    return null;
                }
                Map map = (Map) ((InterfaceC0843o) this.f4530d).mo902o();
                if (m2788C == 1) {
                    c1158a.m2797d();
                    while (c1158a.m2805p()) {
                        c1158a.m2797d();
                        Object mo2196a = ((AbstractC0764y) ((C0931l) this.f4528b).f4536b).mo2196a(c1158a);
                        if (map.put(mo2196a, ((AbstractC0764y) ((C0931l) this.f4529c).f4536b).mo2196a(c1158a)) != null) {
                            throw new C0755p("duplicate key: " + mo2196a);
                        }
                        c1158a.m2801l();
                    }
                    c1158a.m2801l();
                } else {
                    c1158a.m2798i();
                    while (c1158a.m2805p()) {
                        C0833e.f4218g.getClass();
                        int i = c1158a.f5313g;
                        if (i == 0) {
                            i = c1158a.m2800k();
                        }
                        if (i == 13) {
                            c1158a.f5313g = 9;
                        } else if (i == 12) {
                            c1158a.f5313g = 8;
                        } else {
                            if (i != 14) {
                                throw c1158a.m2796K("a name");
                            }
                            c1158a.f5313g = 10;
                        }
                        Object mo2196a2 = ((AbstractC0764y) ((C0931l) this.f4528b).f4536b).mo2196a(c1158a);
                        if (map.put(mo2196a2, ((AbstractC0764y) ((C0931l) this.f4529c).f4536b).mo2196a(c1158a)) != null) {
                            throw new C0755p("duplicate key: " + mo2196a2);
                        }
                    }
                    c1158a.m2802m();
                }
                return map;
            default:
                if (c1158a.m2788C() == 9) {
                    c1158a.m2814y();
                    return null;
                }
                String m2786A = c1158a.m2786A();
                Enum r02 = (Enum) ((HashMap) this.f4528b).get(m2786A);
                return r02 == null ? (Enum) ((HashMap) this.f4529c).get(m2786A) : r02;
        }
    }

    public C0929j(Class cls) {
        this.f4527a = 1;
        this.f4528b = new HashMap();
        this.f4529c = new HashMap();
        this.f4530d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C0918Z(cls))) {
                Enum r4 = (Enum) field.get(null);
                String name = r4.name();
                String str = r4.toString();
                InterfaceC0769b interfaceC0769b = (InterfaceC0769b) field.getAnnotation(InterfaceC0769b.class);
                if (interfaceC0769b != null) {
                    name = interfaceC0769b.value();
                    for (String str2 : interfaceC0769b.alternate()) {
                        ((HashMap) this.f4528b).put(str2, r4);
                    }
                }
                ((HashMap) this.f4528b).put(name, r4);
                ((HashMap) this.f4529c).put(str, r4);
                ((HashMap) this.f4530d).put(r4, name);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
