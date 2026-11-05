package p075i1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p121y0.AbstractC1687o;

/* renamed from: i1.b */
/* loaded from: classes.dex */
public final class C0950b extends AbstractC1687o {

    /* renamed from: d */
    public final Method f4562d = Class.class.getMethod("isRecord", null);

    /* renamed from: e */
    public final Method f4563e = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: f */
    public final Method f4564f;

    /* renamed from: g */
    public final Method f4565g;

    public C0950b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f4564f = cls.getMethod("getName", null);
        this.f4565g = cls.getMethod("getType", null);
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: A */
    public final boolean mo2486A(Class cls) {
        try {
            return ((Boolean) this.f4562d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: p */
    public final Method mo2487p(Field field, Class cls) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: q */
    public final Constructor mo2488q(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f4563e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f4565g.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: u */
    public final String[] mo2489u(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f4563e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f4564f.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
