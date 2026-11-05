package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0537b {

    /* renamed from: a */
    public final int f1980a;

    /* renamed from: b */
    public final Method f1981b;

    public C0537b(int i, Method method) {
        this.f1980a = i;
        this.f1981b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0537b)) {
            return false;
        }
        C0537b c0537b = (C0537b) obj;
        return this.f1980a == c0537b.f1980a && this.f1981b.getName().equals(c0537b.f1981b.getName());
    }

    public final int hashCode() {
        return this.f1981b.getName().hashCode() + (this.f1980a * 31);
    }
}
