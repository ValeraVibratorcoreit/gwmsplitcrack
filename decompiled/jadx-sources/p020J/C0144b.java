package p020J;

import java.util.Objects;

/* renamed from: J.b */
/* loaded from: classes.dex */
public final class C0144b {

    /* renamed from: a */
    public final Object f449a;

    /* renamed from: b */
    public final Object f450b;

    public C0144b(Object obj, Object obj2) {
        this.f449a = obj;
        this.f450b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0144b)) {
            return false;
        }
        C0144b c0144b = (C0144b) obj;
        return Objects.equals(c0144b.f449a, this.f449a) && Objects.equals(c0144b.f450b, this.f450b);
    }

    public final int hashCode() {
        Object obj = this.f449a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f450b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f449a + " " + this.f450b + "}";
    }
}
