package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0538c {

    /* renamed from: c */
    public static final C0538c f1982c = new C0538c();

    /* renamed from: a */
    public final HashMap f1983a = new HashMap();

    /* renamed from: b */
    public final HashMap f1984b = new HashMap();

    /* renamed from: b */
    public static void m1372b(HashMap hashMap, C0537b c0537b, EnumC0547l enumC0547l, Class cls) {
        EnumC0547l enumC0547l2 = (EnumC0547l) hashMap.get(c0537b);
        if (enumC0547l2 == null || enumC0547l == enumC0547l2) {
            if (enumC0547l2 == null) {
                hashMap.put(c0537b, enumC0547l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0537b.f1981b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0547l2 + ", new value " + enumC0547l);
    }

    /* renamed from: a */
    public final C0536a m1373a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1983a;
        if (superclass != null) {
            C0536a c0536a = (C0536a) hashMap2.get(superclass);
            if (c0536a == null) {
                c0536a = m1373a(superclass, null);
            }
            hashMap.putAll(c0536a.f1979b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0536a c0536a2 = (C0536a) hashMap2.get(cls2);
            if (c0536a2 == null) {
                c0536a2 = m1373a(cls2, null);
            }
            for (Map.Entry entry : c0536a2.f1979b.entrySet()) {
                m1372b(hashMap, (C0537b) entry.getKey(), (EnumC0547l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC0518A interfaceC0518A = (InterfaceC0518A) method.getAnnotation(InterfaceC0518A.class);
            if (interfaceC0518A != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0553r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0547l value = interfaceC0518A.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0547l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0547l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1372b(hashMap, new C0537b(i, method), value, cls);
                z2 = true;
            }
        }
        C0536a c0536a3 = new C0536a(hashMap);
        hashMap2.put(cls, c0536a3);
        this.f1984b.put(cls, Boolean.valueOf(z2));
        return c0536a3;
    }
}
