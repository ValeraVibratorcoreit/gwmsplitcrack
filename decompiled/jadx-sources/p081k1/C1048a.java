package p081k1;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import p069f1.AbstractC0832d;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public class C1048a<T> {

    /* renamed from: a */
    public final Class f4990a;

    /* renamed from: b */
    public final Type f4991b;

    /* renamed from: c */
    public final int f4992c;

    public C1048a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C1048a.class) {
                Type m2350a = AbstractC0832d.m2350a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m2644a(m2350a);
                }
                this.f4991b = m2350a;
                this.f4990a = AbstractC0832d.m2357h(m2350a);
                this.f4992c = m2350a.hashCode();
                return;
            }
        } else if (genericSuperclass == C1048a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /* renamed from: a */
    public static void m2644a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m2644a(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m2644a(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m2644a(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m2644a(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m2644a(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1048a) {
            if (AbstractC0832d.m2354e(this.f4991b, ((C1048a) obj).f4991b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4992c;
    }

    public final String toString() {
        return AbstractC0832d.m2360k(this.f4991b);
    }

    public C1048a(Type type) {
        Objects.requireNonNull(type);
        Type m2350a = AbstractC0832d.m2350a(type);
        this.f4991b = m2350a;
        this.f4990a = AbstractC0832d.m2357h(m2350a);
        this.f4992c = m2350a.hashCode();
    }
}
