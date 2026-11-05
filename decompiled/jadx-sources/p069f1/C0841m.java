package p069f1;

import java.util.Map;

/* renamed from: f1.m */
/* loaded from: classes.dex */
public final class C0841m implements Map.Entry {

    /* renamed from: a */
    public C0841m f4239a;

    /* renamed from: b */
    public C0841m f4240b;

    /* renamed from: c */
    public C0841m f4241c;

    /* renamed from: d */
    public C0841m f4242d;

    /* renamed from: e */
    public C0841m f4243e;

    /* renamed from: f */
    public final Object f4244f;

    /* renamed from: g */
    public final boolean f4245g;

    /* renamed from: h */
    public Object f4246h;

    /* renamed from: i */
    public int f4247i;

    public C0841m(boolean z2) {
        this.f4244f = null;
        this.f4245g = z2;
        this.f4243e = this;
        this.f4242d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f4244f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f4246h;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4244f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4246h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f4244f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f4246h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f4245g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f4246h;
        this.f4246h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4244f + "=" + this.f4246h;
    }

    public C0841m(boolean z2, C0841m c0841m, Object obj, C0841m c0841m2, C0841m c0841m3) {
        this.f4239a = c0841m;
        this.f4244f = obj;
        this.f4245g = z2;
        this.f4247i = 1;
        this.f4242d = c0841m2;
        this.f4243e = c0841m3;
        c0841m3.f4242d = this;
        c0841m2.f4243e = this;
    }
}
