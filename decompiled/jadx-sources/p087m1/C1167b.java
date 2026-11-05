package p087m1;

import java.io.Serializable;
import p107t1.AbstractC1461d;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public final class C1167b implements Serializable {

    /* renamed from: a */
    public final Object f5339a;

    /* renamed from: b */
    public final Object f5340b;

    public C1167b(Object obj, Object obj2) {
        this.f5339a = obj;
        this.f5340b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1167b)) {
            return false;
        }
        C1167b c1167b = (C1167b) obj;
        return AbstractC1461d.m3490a(this.f5339a, c1167b.f5339a) && AbstractC1461d.m3490a(this.f5340b, c1167b.f5340b);
    }

    public final int hashCode() {
        Object obj = this.f5339a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5340b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5339a + ", " + this.f5340b + ')';
    }
}
