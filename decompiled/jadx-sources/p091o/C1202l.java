package p091o;

/* renamed from: o.l */
/* loaded from: classes.dex */
public final class C1202l implements Cloneable {

    /* renamed from: d */
    public static final Object f5419d = new Object();

    /* renamed from: a */
    public int[] f5420a;

    /* renamed from: b */
    public Object[] f5421b;

    /* renamed from: c */
    public int f5422c;

    public C1202l() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f5420a = new int[i4];
        this.f5421b = new Object[i4];
    }

    /* renamed from: a */
    public final void m2874a(int i, Object obj) {
        int i2 = this.f5422c;
        if (i2 != 0 && i <= this.f5420a[i2 - 1]) {
            m2876c(i, obj);
            return;
        }
        if (i2 >= this.f5420a.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f5420a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f5421b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5420a = iArr;
            this.f5421b = objArr;
        }
        this.f5420a[i2] = i;
        this.f5421b[i2] = obj;
        this.f5422c = i2 + 1;
    }

    /* renamed from: b */
    public final Object m2875b(int i, Integer num) {
        Object obj;
        int m2851a = AbstractC1194d.m2851a(this.f5422c, i, this.f5420a);
        return (m2851a < 0 || (obj = this.f5421b[m2851a]) == f5419d) ? num : obj;
    }

    /* renamed from: c */
    public final void m2876c(int i, Object obj) {
        int m2851a = AbstractC1194d.m2851a(this.f5422c, i, this.f5420a);
        if (m2851a >= 0) {
            this.f5421b[m2851a] = obj;
            return;
        }
        int i2 = ~m2851a;
        int i3 = this.f5422c;
        if (i2 < i3) {
            Object[] objArr = this.f5421b;
            if (objArr[i2] == f5419d) {
                this.f5420a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f5420a.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f5420a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5421b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5420a = iArr;
            this.f5421b = objArr2;
        }
        int i8 = this.f5422c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f5420a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f5421b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f5422c - i2);
        }
        this.f5420a[i2] = i;
        this.f5421b[i2] = obj;
        this.f5422c++;
    }

    public final Object clone() {
        try {
            C1202l c1202l = (C1202l) super.clone();
            c1202l.f5420a = (int[]) this.f5420a.clone();
            c1202l.f5421b = (Object[]) this.f5421b.clone();
            return c1202l;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        int i = this.f5422c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5422c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5420a[i2]);
            sb.append('=');
            Object obj = this.f5421b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
