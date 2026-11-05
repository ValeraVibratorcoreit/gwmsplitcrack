package p107t1;

/* renamed from: t1.g */
/* loaded from: classes.dex */
public abstract class AbstractC1464g {

    /* renamed from: a */
    public static final C1465h f7163a;

    static {
        C1465h c1465h = null;
        try {
            c1465h = (C1465h) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1465h == null) {
            c1465h = new C1465h();
        }
        f7163a = c1465h;
    }

    /* renamed from: a */
    public static C1459b m3498a(Class cls) {
        f7163a.getClass();
        return new C1459b(cls);
    }
}
