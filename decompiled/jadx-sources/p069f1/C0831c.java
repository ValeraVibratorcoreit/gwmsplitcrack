package p069f1;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* renamed from: f1.c */
/* loaded from: classes.dex */
public final class C0831c implements WildcardType, Serializable {

    /* renamed from: a */
    public final Type f4215a;

    /* renamed from: b */
    public final Type f4216b;

    public C0831c(Type[] typeArr, Type[] typeArr2) {
        AbstractC0832d.m2351b(typeArr2.length <= 1);
        AbstractC0832d.m2351b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC0832d.m2352c(typeArr[0]);
            this.f4216b = null;
            this.f4215a = AbstractC0832d.m2350a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC0832d.m2352c(typeArr2[0]);
        AbstractC0832d.m2351b(typeArr[0] == Object.class);
        this.f4216b = AbstractC0832d.m2350a(typeArr2[0]);
        this.f4215a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0832d.m2354e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f4216b;
        return type != null ? new Type[]{type} : AbstractC0832d.f4217a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f4215a};
    }

    public final int hashCode() {
        Type type = this.f4216b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f4215a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f4216b;
        if (type != null) {
            return "? super " + AbstractC0832d.m2360k(type);
        }
        Type type2 = this.f4215a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC0832d.m2360k(type2);
    }
}
