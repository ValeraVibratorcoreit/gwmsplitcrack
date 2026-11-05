package p069f1;

import java.lang.reflect.Method;
import p003B.C0043j;

/* renamed from: f1.u */
/* loaded from: classes.dex */
public final class C0849u extends AbstractC0851w {

    /* renamed from: b */
    public final /* synthetic */ Method f4263b;

    public C0849u(Method method) {
        this.f4263b = method;
    }

    @Override // p069f1.AbstractC0851w
    /* renamed from: a */
    public final Object mo2372a(Class cls) {
        String m62h = C0043j.m62h(cls);
        if (m62h != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m62h));
        }
        return this.f4263b.invoke(null, cls, Object.class);
    }
}
