package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p006C.AbstractC0062j;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public abstract class AbstractC0556u {

    /* renamed from: a */
    public static final HashMap f2008a = new HashMap();

    /* renamed from: b */
    public static final HashMap f2009b = new HashMap();

    /* renamed from: a */
    public static void m1385a(Constructor constructor, InterfaceC0552q interfaceC0552q) {
        try {
            AbstractC1461d.m3493d("{\n            constructo…tance(`object`)\n        }", constructor.newInstance(interfaceC0552q));
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public static final String m1386b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int indexOf = str.indexOf(".", 0);
        if (indexOf >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            do {
                sb2.append((CharSequence) str, i, indexOf);
                sb2.append("_");
                i = indexOf + 1;
                if (indexOf >= str.length()) {
                    break;
                }
                indexOf = str.indexOf(".", i);
            } while (indexOf > 0);
            sb2.append((CharSequence) str, i, str.length());
            str = sb2.toString();
            AbstractC1461d.m3493d("stringBuilder.append(this, i, length).toString()", str);
        }
        return AbstractC0062j.m162p(sb, str, "_LifecycleAdapter");
    }

    /* renamed from: c */
    public static int m1387c(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        HashMap hashMap = f2008a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                AbstractC1461d.m3493d("fullPackage", name);
                if (name.length() != 0) {
                    AbstractC1461d.m3493d("name", canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC1461d.m3493d("this as java.lang.String).substring(startIndex)", canonicalName);
                }
                AbstractC1461d.m3493d("if (fullPackage.isEmpty(…g(fullPackage.length + 1)", canonicalName);
                String m1386b = m1386b(canonicalName);
                if (name.length() != 0) {
                    m1386b = name + '.' + m1386b;
                }
                constructor = Class.forName(m1386b).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap hashMap2 = f2009b;
            if (constructor != null) {
                List singletonList = Collections.singletonList(constructor);
                AbstractC1461d.m3493d("singletonList(element)", singletonList);
                hashMap2.put(cls, singletonList);
            } else {
                C0538c c0538c = C0538c.f1982c;
                HashMap hashMap3 = c0538c.f1984b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                            if (((InterfaceC0518A) declaredMethods[i2].getAnnotation(InterfaceC0518A.class)) != null) {
                                c0538c.m1373a(cls, declaredMethods);
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0552q.class.isAssignableFrom(superclass)) {
                        AbstractC1461d.m3493d("superclass", superclass);
                        if (m1387c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            AbstractC1461d.m3491b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    AbstractC1461d.m3493d("klass.interfaces", interfaces);
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && InterfaceC0552q.class.isAssignableFrom(cls2)) {
                                AbstractC1461d.m3493d("intrface", cls2);
                                if (m1387c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                AbstractC1461d.m3491b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
