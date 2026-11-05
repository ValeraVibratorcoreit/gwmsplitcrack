package p069f1;

import java.lang.reflect.Method;
import p003B.C0043j;

/* renamed from: f1.s */
/* loaded from: classes.dex */
public final class C0847s extends AbstractC0851w {

    /* renamed from: b */
    public final /* synthetic */ Method f4259b;

    /* renamed from: c */
    public final /* synthetic */ Object f4260c;

    public C0847s(Method method, Object obj) {
        this.f4259b = method;
        this.f4260c = obj;
    }

    @Override // p069f1.AbstractC0851w
    /* renamed from: a */
    public final Object mo2372a(Class cls) {
        String m62h = C0043j.m62h(cls);
        if (m62h != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m62h));
        }
        return this.f4259b.invoke(this.f4260c, cls);
    }
}
