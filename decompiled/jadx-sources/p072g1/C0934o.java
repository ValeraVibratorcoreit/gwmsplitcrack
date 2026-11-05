package p072g1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import p006C.AbstractC0062j;
import p063d1.C0755p;
import p069f1.AbstractC0846r;
import p069f1.InterfaceC0843o;
import p075i1.AbstractC0951c;
import p084l1.C1158a;
import p109u0.AbstractC1561o;

/* renamed from: g1.o */
/* loaded from: classes.dex */
public final class C0934o extends AbstractC0933n {

    /* renamed from: b */
    public final InterfaceC0843o f4544b;

    public C0934o(InterfaceC0843o interfaceC0843o, C0935p c0935p) {
        super(c0935p);
        this.f4544b = interfaceC0843o;
    }

    @Override // p072g1.AbstractC0933n
    /* renamed from: b */
    public final Object mo2474b() {
        return this.f4544b.mo902o();
    }

    @Override // p072g1.AbstractC0933n
    /* renamed from: c */
    public final Object mo2475c(Object obj) {
        return obj;
    }

    @Override // p072g1.AbstractC0933n
    /* renamed from: d */
    public final void mo2476d(Object obj, C1158a c1158a, C0932m c0932m) {
        Object mo2196a = c0932m.f4540d.mo2196a(c1158a);
        if (mo2196a == null && c0932m.f4541e) {
            return;
        }
        Field field = c0932m.f4537a;
        if (c0932m.f4539c) {
            if (!AbstractC0846r.f4258a.mo2371a(field, Modifier.isStatic(field.getModifiers()) ? null : obj)) {
                throw new C0755p(AbstractC0062j.m160n(AbstractC0951c.m2493d(field, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
            }
        } else if (c0932m.f4542f) {
            throw new C0755p(AbstractC1561o.m4299c("Cannot set value of 'static final' ", AbstractC0951c.m2493d(field, false)));
        }
        field.set(obj, mo2196a);
    }
}
