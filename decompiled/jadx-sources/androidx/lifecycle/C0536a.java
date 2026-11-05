package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0536a {

    /* renamed from: a */
    public final HashMap f1978a = new HashMap();

    /* renamed from: b */
    public final HashMap f1979b;

    public C0536a(HashMap hashMap) {
        this.f1979b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0547l enumC0547l = (EnumC0547l) entry.getValue();
            List list = (List) this.f1978a.get(enumC0547l);
            if (list == null) {
                list = new ArrayList();
                this.f1978a.put(enumC0547l, list);
            }
            list.add((C0537b) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1371a(List list, InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l, InterfaceC0552q interfaceC0552q) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0537b c0537b = (C0537b) list.get(size);
                c0537b.getClass();
                try {
                    int i = c0537b.f1980a;
                    Method method = c0537b.f1981b;
                    if (i == 0) {
                        method.invoke(interfaceC0552q, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0552q, interfaceC0553r);
                    } else if (i == 2) {
                        method.invoke(interfaceC0552q, interfaceC0553r, enumC0547l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
