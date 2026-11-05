package p069f1;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: f1.b */
/* loaded from: classes.dex */
public final class C0830b implements ParameterizedType, Serializable {

    /* renamed from: a */
    public final Type f4212a;

    /* renamed from: b */
    public final Type f4213b;

    /* renamed from: c */
    public final Type[] f4214c;

    public C0830b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.f4212a = type == null ? null : AbstractC0832d.m2350a(type);
        this.f4213b = AbstractC0832d.m2350a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f4214c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f4214c[i]);
            AbstractC0832d.m2352c(this.f4214c[i]);
            Type[] typeArr3 = this.f4214c;
            typeArr3[i] = AbstractC0832d.m2350a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0832d.m2354e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f4214c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f4212a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f4213b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f4214c) ^ this.f4213b.hashCode();
        Type type = this.f4212a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f4214c;
        int length = typeArr.length;
        Type type = this.f4213b;
        if (length == 0) {
            return AbstractC0832d.m2360k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC0832d.m2360k(type));
        sb.append("<");
        sb.append(AbstractC0832d.m2360k(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC0832d.m2360k(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
