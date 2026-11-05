package p072g1;

import java.lang.reflect.Type;
import java.util.Collection;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.C0755p;
import p069f1.InterfaceC0843o;
import p084l1.C1158a;

/* renamed from: g1.c */
/* loaded from: classes.dex */
public final class C0922c extends AbstractC0764y {

    /* renamed from: a */
    public final /* synthetic */ int f4515a = 0;

    /* renamed from: b */
    public final Object f4516b;

    /* renamed from: c */
    public final Object f4517c;

    public C0922c(C0752m c0752m, Type type, AbstractC0764y abstractC0764y, InterfaceC0843o interfaceC0843o) {
        this.f4516b = new C0931l(c0752m, abstractC0764y, type);
        this.f4517c = interfaceC0843o;
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        switch (this.f4515a) {
            case 0:
                if (c1158a.m2788C() == 9) {
                    c1158a.m2814y();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC0843o) this.f4517c).mo902o();
                c1158a.m2797d();
                while (c1158a.m2805p()) {
                    collection.add(((AbstractC0764y) ((C0931l) this.f4516b).f4536b).mo2196a(c1158a));
                }
                c1158a.m2801l();
                return collection;
            default:
                Object mo2196a = ((C0909P) this.f4517c).f4479c.mo2196a(c1158a);
                if (mo2196a != null) {
                    Class cls = (Class) this.f4516b;
                    if (!cls.isInstance(mo2196a)) {
                        throw new C0755p("Expected a " + cls.getName() + " but was " + mo2196a.getClass().getName() + "; at path " + c1158a.m2804o(true));
                    }
                }
                return mo2196a;
        }
    }

    public C0922c(C0909P c0909p, Class cls) {
        this.f4517c = c0909p;
        this.f4516b = cls;
    }
}
