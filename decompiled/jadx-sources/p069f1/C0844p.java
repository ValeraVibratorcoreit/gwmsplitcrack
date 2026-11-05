package p069f1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* renamed from: f1.p */
/* loaded from: classes.dex */
public final class C0844p extends AbstractC0846r {

    /* renamed from: b */
    public final /* synthetic */ Method f4257b;

    public C0844p(Method method) {
        this.f4257b = method;
    }

    @Override // p069f1.AbstractC0846r
    /* renamed from: a */
    public final boolean mo2371a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.f4257b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e2) {
            throw new RuntimeException("Failed invoking canAccess", e2);
        }
    }
}
