package p091o;

/* renamed from: o.e */
/* loaded from: classes.dex */
public final class C1195e implements Cloneable {

    /* renamed from: e */
    public static final Object f5390e = new Object();

    /* renamed from: a */
    public boolean f5391a;

    /* renamed from: b */
    public long[] f5392b;

    /* renamed from: c */
    public Object[] f5393c;

    /* renamed from: d */
    public int f5394d;

    public C1195e() {
        this(10);
    }

    /* renamed from: a */
    public final void m2853a() {
        int i = this.f5394d;
        Object[] objArr = this.f5393c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5394d = 0;
        this.f5391a = false;
    }

    /* renamed from: b */
    public final void m2854b() {
        int i = this.f5394d;
        long[] jArr = this.f5392b;
        Object[] objArr = this.f5393c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5390e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5391a = false;
        this.f5394d = i2;
    }

    /* renamed from: c */
    public final Object m2855c(long j2, Long l2) {
        Object obj;
        int m2852b = AbstractC1194d.m2852b(this.f5392b, this.f5394d, j2);
        return (m2852b < 0 || (obj = this.f5393c[m2852b]) == f5390e) ? l2 : obj;
    }

    public final Object clone() {
        try {
            C1195e c1195e = (C1195e) super.clone();
            c1195e.f5392b = (long[]) this.f5392b.clone();
            c1195e.f5393c = (Object[]) this.f5393c.clone();
            return c1195e;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    public final long m2856d(int i) {
        if (this.f5391a) {
            m2854b();
        }
        return this.f5392b[i];
    }

    /* renamed from: e */
    public final void m2857e(long j2, Object obj) {
        int m2852b = AbstractC1194d.m2852b(this.f5392b, this.f5394d, j2);
        if (m2852b >= 0) {
            this.f5393c[m2852b] = obj;
            return;
        }
        int i = ~m2852b;
        int i2 = this.f5394d;
        if (i < i2) {
            Object[] objArr = this.f5393c;
            if (objArr[i] == f5390e) {
                this.f5392b[i] = j2;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f5391a && i2 >= this.f5392b.length) {
            m2854b();
            i = ~AbstractC1194d.m2852b(this.f5392b, this.f5394d, j2);
        }
        int i3 = this.f5394d;
        if (i3 >= this.f5392b.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f5392b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5393c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5392b = jArr;
            this.f5393c = objArr2;
        }
        int i8 = this.f5394d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f5392b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f5393c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f5394d - i);
        }
        this.f5392b[i] = j2;
        this.f5393c[i] = obj;
        this.f5394d++;
    }

    /* renamed from: f */
    public final void m2858f(long j2) {
        int m2852b = AbstractC1194d.m2852b(this.f5392b, this.f5394d, j2);
        if (m2852b >= 0) {
            Object[] objArr = this.f5393c;
            Object obj = objArr[m2852b];
            Object obj2 = f5390e;
            if (obj != obj2) {
                objArr[m2852b] = obj2;
                this.f5391a = true;
            }
        }
    }

    /* renamed from: g */
    public final int m2859g() {
        if (this.f5391a) {
            m2854b();
        }
        return this.f5394d;
    }

    /* renamed from: h */
    public final Object m2860h(int i) {
        if (this.f5391a) {
            m2854b();
        }
        return this.f5393c[i];
    }

    public final String toString() {
        if (m2859g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5394d * 28);
        sb.append('{');
        for (int i = 0; i < this.f5394d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m2856d(i));
            sb.append('=');
            Object m2860h = m2860h(i);
            if (m2860h != this) {
                sb.append(m2860h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1195e(int i) {
        this.f5391a = false;
        if (i == 0) {
            this.f5392b = AbstractC1194d.f5388b;
            this.f5393c = AbstractC1194d.f5389c;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f5392b = new long[i5];
        this.f5393c = new Object[i5];
    }
}
