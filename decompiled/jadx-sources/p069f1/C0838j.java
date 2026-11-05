package p069f1;

/* renamed from: f1.j */
/* loaded from: classes.dex */
public final class C0838j extends Number {

    /* renamed from: a */
    public final String f4231a;

    public C0838j(String str) {
        this.f4231a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f4231a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0838j) {
            return this.f4231a.equals(((C0838j) obj).f4231a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f4231a);
    }

    public final int hashCode() {
        return this.f4231a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f4231a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return AbstractC0832d.m2358i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f4231a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC0832d.m2358i(str).longValue();
        }
    }

    public final String toString() {
        return this.f4231a;
    }
}
