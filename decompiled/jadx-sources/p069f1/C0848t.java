package p069f1;

import java.lang.reflect.Method;
import p003B.C0043j;

/* renamed from: f1.t */
/* loaded from: classes.dex */
public final class C0848t extends AbstractC0851w {

    /* renamed from: b */
    public final /* synthetic */ Method f4261b;

    /* renamed from: c */
    public final /* synthetic */ int f4262c;

    public C0848t(int i, Method method) {
        this.f4261b = method;
        this.f4262c = i;
    }

    @Override // p069f1.AbstractC0851w
    /* renamed from: a */
    public final Object mo2372a(Class cls) {
        String m62h = C0043j.m62h(cls);
        if (m62h != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m62h));
        }
        return this.f4261b.invoke(null, cls, Integer.valueOf(this.f4262c));
    }
}
