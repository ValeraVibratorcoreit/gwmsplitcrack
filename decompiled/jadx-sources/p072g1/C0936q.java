package p072g1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p006C.AbstractC0062j;
import p046X.C0421t;
import p075i1.AbstractC0951c;
import p084l1.C1158a;
import p121y0.AbstractC1687o;

/* renamed from: g1.q */
/* loaded from: classes.dex */
public final class C0936q extends AbstractC0933n {

    /* renamed from: e */
    public static final HashMap f4547e;

    /* renamed from: b */
    public final Constructor f4548b;

    /* renamed from: c */
    public final Object[] f4549c;

    /* renamed from: d */
    public final HashMap f4550d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f4547e = hashMap;
    }

    public C0936q(Class cls, C0935p c0935p) {
        super(c0935p);
        this.f4550d = new HashMap();
        AbstractC1687o abstractC1687o = AbstractC0951c.f4566a;
        Constructor mo2488q = abstractC1687o.mo2488q(cls);
        this.f4548b = mo2488q;
        AbstractC0951c.m2495f(mo2488q);
        String[] mo2489u = abstractC1687o.mo2489u(cls);
        for (int i = 0; i < mo2489u.length; i++) {
            this.f4550d.put(mo2489u[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f4548b.getParameterTypes();
        this.f4549c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f4549c[i2] = f4547e.get(parameterTypes[i2]);
        }
    }

    @Override // p072g1.AbstractC0933n
    /* renamed from: b */
    public final Object mo2474b() {
        return (Object[]) this.f4549c.clone();
    }

    @Override // p072g1.AbstractC0933n
    /* renamed from: c */
    public final Object mo2475c(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f4548b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            AbstractC1687o abstractC1687o = AbstractC0951c.f4566a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0951c.m2491b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0951c.m2491b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0951c.m2491b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
        }
    }

    @Override // p072g1.AbstractC0933n
    /* renamed from: d */
    public final void mo2476d(Object obj, C1158a c1158a, C0932m c0932m) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f4550d;
        String str = c0932m.f4538b;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC0951c.m2491b(this.f4548b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object mo2196a = c0932m.f4540d.mo2196a(c1158a);
        if (mo2196a != null || !c0932m.f4541e) {
            objArr[intValue] = mo2196a;
        } else {
            StringBuilder m163q = AbstractC0062j.m163q("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            m163q.append(c1158a.m2804o(false));
            throw new C0421t(m163q.toString());
        }
    }
}
