package p093o1;

import p096p1.C1236a;
import p099q1.C1377b;
import p107t1.AbstractC1461d;

/* renamed from: o1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1208b {

    /* renamed from: a */
    public static final C1207a f5435a;

    static {
        C1207a c1207a;
        try {
            Object newInstance = C1377b.class.newInstance();
            AbstractC1461d.m3493d("forName(\"kotlin.internal…entations\").newInstance()", newInstance);
            try {
                try {
                    c1207a = (C1207a) newInstance;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C1207a.class.getClassLoader();
                    if (AbstractC1461d.m3490a(classLoader, classLoader2)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = C1236a.class.newInstance();
                AbstractC1461d.m3493d("forName(\"kotlin.internal…entations\").newInstance()", newInstance2);
                try {
                    try {
                        c1207a = (C1207a) newInstance2;
                    } catch (ClassNotFoundException unused2) {
                        c1207a = new C1207a();
                    }
                } catch (ClassCastException e3) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = C1207a.class.getClassLoader();
                    if (AbstractC1461d.m3490a(classLoader3, classLoader4)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e3);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            AbstractC1461d.m3493d("forName(\"kotlin.internal…entations\").newInstance()", newInstance3);
            try {
                try {
                    c1207a = (C1207a) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    AbstractC1461d.m3493d("forName(\"kotlin.internal…entations\").newInstance()", newInstance4);
                    try {
                        c1207a = (C1207a) newInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C1207a.class.getClassLoader();
                        if (AbstractC1461d.m3490a(classLoader5, classLoader6)) {
                            throw e4;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e4);
                    }
                }
            } catch (ClassCastException e5) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = C1207a.class.getClassLoader();
                if (AbstractC1461d.m3490a(classLoader7, classLoader8)) {
                    throw e5;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e5);
            }
        }
        f5435a = c1207a;
    }
}
