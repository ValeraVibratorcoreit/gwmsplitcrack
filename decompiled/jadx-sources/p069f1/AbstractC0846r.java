package p069f1;

import java.lang.reflect.AccessibleObject;

/* renamed from: f1.r */
/* loaded from: classes.dex */
public abstract class AbstractC0846r {

    /* renamed from: a */
    public static final AbstractC0846r f4258a;

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    static {
        AbstractC0846r c0844p;
        if (AbstractC0837i.f4230a >= 9) {
            try {
                c0844p = new C0844p(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
            if (c0844p == null) {
                c0844p = new C0845q();
            }
            f4258a = c0844p;
        }
        c0844p = null;
        if (c0844p == null) {
        }
        f4258a = c0844p;
    }

    /* renamed from: a */
    public abstract boolean mo2371a(AccessibleObject accessibleObject, Object obj);
}
