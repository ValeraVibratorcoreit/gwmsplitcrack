package p088n;

import java.util.Map;

/* renamed from: n.c */
/* loaded from: classes.dex */
public final class C1172c implements Map.Entry {

    /* renamed from: a */
    public final Object f5351a;

    /* renamed from: b */
    public final Object f5352b;

    /* renamed from: c */
    public C1172c f5353c;

    /* renamed from: d */
    public C1172c f5354d;

    public C1172c(Object obj, Object obj2) {
        this.f5351a = obj;
        this.f5352b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1172c)) {
            return false;
        }
        C1172c c1172c = (C1172c) obj;
        return this.f5351a.equals(c1172c.f5351a) && this.f5352b.equals(c1172c.f5352b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5351a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5352b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5351a.hashCode() ^ this.f5352b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f5351a + "=" + this.f5352b;
    }
}
