package p069f1;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public final class C0829a implements GenericArrayType, Serializable {

    /* renamed from: a */
    public final Type f4211a;

    public C0829a(Type type) {
        Objects.requireNonNull(type);
        this.f4211a = AbstractC0832d.m2350a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0832d.m2354e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f4211a;
    }

    public final int hashCode() {
        return this.f4211a.hashCode();
    }

    public final String toString() {
        return AbstractC0832d.m2360k(this.f4211a) + "[]";
    }
}
