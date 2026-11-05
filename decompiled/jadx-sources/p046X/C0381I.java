package p046X;

import java.lang.reflect.InvocationTargetException;
import p006C.AbstractC0062j;
import p091o.C1201k;

/* renamed from: X.I */
/* loaded from: classes.dex */
public final class C0381I {

    /* renamed from: b */
    public static final C1201k f1128b = new C1201k();

    /* renamed from: a */
    public final /* synthetic */ C0387O f1129a;

    public C0381I(C0387O c0387o) {
        this.f1129a = c0387o;
    }

    /* renamed from: b */
    public static Class m978b(String str, ClassLoader classLoader) {
        C1201k c1201k = f1128b;
        C1201k c1201k2 = (C1201k) c1201k.getOrDefault(classLoader, null);
        if (c1201k2 == null) {
            c1201k2 = new C1201k();
            c1201k.put(classLoader, c1201k2);
        }
        Class cls = (Class) c1201k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1201k2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class m979c(String str, ClassLoader classLoader) {
        try {
            return m978b(str, classLoader);
        } catch (ClassCastException e2) {
            throw new C0421t(AbstractC0062j.m161o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new C0421t(AbstractC0062j.m161o("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    /* renamed from: a */
    public final AbstractComponentCallbacksC0423v m980a(String str) {
        try {
            return (AbstractComponentCallbacksC0423v) m979c(str, this.f1129a.f1168t.f1385l.getClassLoader()).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new C0421t(AbstractC0062j.m161o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new C0421t(AbstractC0062j.m161o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new C0421t(AbstractC0062j.m161o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new C0421t(AbstractC0062j.m161o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
