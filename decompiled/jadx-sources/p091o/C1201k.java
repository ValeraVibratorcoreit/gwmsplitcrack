package p091o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.k */
/* loaded from: classes.dex */
public class C1201k {

    /* renamed from: d */
    public static Object[] f5412d;

    /* renamed from: e */
    public static int f5413e;

    /* renamed from: f */
    public static Object[] f5414f;

    /* renamed from: g */
    public static int f5415g;

    /* renamed from: a */
    public int[] f5416a = AbstractC1194d.f5387a;

    /* renamed from: b */
    public Object[] f5417b = AbstractC1194d.f5389c;

    /* renamed from: c */
    public int f5418c = 0;

    /* renamed from: c */
    public static void m2864c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1201k.class) {
                try {
                    if (f5415g < 10) {
                        objArr[0] = f5414f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f5414f = objArr;
                        f5415g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1201k.class) {
                try {
                    if (f5413e < 10) {
                        objArr[0] = f5412d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5412d = objArr;
                        f5413e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2865a(int i) {
        if (i == 8) {
            synchronized (C1201k.class) {
                try {
                    Object[] objArr = f5414f;
                    if (objArr != null) {
                        this.f5417b = objArr;
                        f5414f = (Object[]) objArr[0];
                        this.f5416a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5415g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C1201k.class) {
                try {
                    Object[] objArr2 = f5412d;
                    if (objArr2 != null) {
                        this.f5417b = objArr2;
                        f5412d = (Object[]) objArr2[0];
                        this.f5416a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5413e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5416a = new int[i];
        this.f5417b = new Object[i << 1];
    }

    /* renamed from: b */
    public final void m2866b(int i) {
        int i2 = this.f5418c;
        int[] iArr = this.f5416a;
        if (iArr.length < i) {
            Object[] objArr = this.f5417b;
            m2865a(i);
            if (this.f5418c > 0) {
                System.arraycopy(iArr, 0, this.f5416a, 0, i2);
                System.arraycopy(objArr, 0, this.f5417b, 0, i2 << 1);
            }
            m2864c(iArr, objArr, i2);
        }
        if (this.f5418c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f5418c;
        if (i > 0) {
            int[] iArr = this.f5416a;
            Object[] objArr = this.f5417b;
            this.f5416a = AbstractC1194d.f5387a;
            this.f5417b = AbstractC1194d.f5389c;
            this.f5418c = 0;
            m2864c(iArr, objArr, i);
        }
        if (this.f5418c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m2868e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m2870g(obj) >= 0;
    }

    /* renamed from: d */
    public final int m2867d(int i, Object obj) {
        int i2 = this.f5418c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m2851a = AbstractC1194d.m2851a(i2, i, this.f5416a);
            if (m2851a < 0 || obj.equals(this.f5417b[m2851a << 1])) {
                return m2851a;
            }
            int i3 = m2851a + 1;
            while (i3 < i2 && this.f5416a[i3] == i) {
                if (obj.equals(this.f5417b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m2851a - 1; i4 >= 0 && this.f5416a[i4] == i; i4--) {
                if (obj.equals(this.f5417b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int m2868e(Object obj) {
        return obj == null ? m2869f() : m2867d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1201k) {
            C1201k c1201k = (C1201k) obj;
            if (this.f5418c != c1201k.f5418c) {
                return false;
            }
            for (int i = 0; i < this.f5418c; i++) {
                try {
                    Object m2871h = m2871h(i);
                    Object m2873j = m2873j(i);
                    Object orDefault = c1201k.getOrDefault(m2871h, null);
                    if (m2873j == null) {
                        if (orDefault != null || !c1201k.containsKey(m2871h)) {
                            return false;
                        }
                    } else if (!m2873j.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f5418c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f5418c; i2++) {
                try {
                    Object m2871h2 = m2871h(i2);
                    Object m2873j2 = m2873j(i2);
                    Object obj2 = map.get(m2871h2);
                    if (m2873j2 == null) {
                        if (obj2 != null || !map.containsKey(m2871h2)) {
                            return false;
                        }
                    } else if (!m2873j2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m2869f() {
        int i = this.f5418c;
        if (i == 0) {
            return -1;
        }
        try {
            int m2851a = AbstractC1194d.m2851a(i, 0, this.f5416a);
            if (m2851a < 0 || this.f5417b[m2851a << 1] == null) {
                return m2851a;
            }
            int i2 = m2851a + 1;
            while (i2 < i && this.f5416a[i2] == 0) {
                if (this.f5417b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m2851a - 1; i3 >= 0 && this.f5416a[i3] == 0; i3--) {
                if (this.f5417b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final int m2870g(Object obj) {
        int i = this.f5418c * 2;
        Object[] objArr = this.f5417b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int m2868e = m2868e(obj);
        return m2868e >= 0 ? this.f5417b[(m2868e << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final Object m2871h(int i) {
        return this.f5417b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f5416a;
        Object[] objArr = this.f5417b;
        int i = this.f5418c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public final Object m2872i(int i) {
        Object[] objArr = this.f5417b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f5418c;
        int i4 = 0;
        if (i3 <= 1) {
            m2864c(this.f5416a, objArr, i3);
            this.f5416a = AbstractC1194d.f5387a;
            this.f5417b = AbstractC1194d.f5389c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f5416a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f5417b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f5417b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m2865a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f5418c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f5416a, 0, i);
                    System.arraycopy(objArr, 0, this.f5417b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f5416a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f5417b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f5418c) {
            throw new ConcurrentModificationException();
        }
        this.f5418c = i4;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f5418c <= 0;
    }

    /* renamed from: j */
    public final Object m2873j(int i) {
        return this.f5417b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int m2867d;
        int i2 = this.f5418c;
        if (obj == null) {
            m2867d = m2869f();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            m2867d = m2867d(hashCode, obj);
        }
        if (m2867d >= 0) {
            int i3 = (m2867d << 1) + 1;
            Object[] objArr = this.f5417b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~m2867d;
        int[] iArr = this.f5416a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f5417b;
            m2865a(i5);
            if (i2 != this.f5418c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5416a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f5417b, 0, objArr2.length);
            }
            m2864c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f5416a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f5417b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f5418c - i4) << 1);
        }
        int i7 = this.f5418c;
        if (i2 == i7) {
            int[] iArr4 = this.f5416a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f5417b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f5418c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int m2868e = m2868e(obj);
        if (m2868e >= 0) {
            return m2872i(m2868e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int m2868e = m2868e(obj);
        if (m2868e < 0) {
            return null;
        }
        int i = (m2868e << 1) + 1;
        Object[] objArr = this.f5417b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f5418c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5418c * 28);
        sb.append('{');
        for (int i = 0; i < this.f5418c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object m2871h = m2871h(i);
            if (m2871h != this) {
                sb.append(m2871h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m2873j = m2873j(i);
            if (m2873j != this) {
                sb.append(m2873j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int m2868e = m2868e(obj);
        if (m2868e < 0) {
            return false;
        }
        Object m2873j = m2873j(m2868e);
        if (obj2 != m2873j && (obj2 == null || !obj2.equals(m2873j))) {
            return false;
        }
        m2872i(m2868e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int m2868e = m2868e(obj);
        if (m2868e < 0) {
            return false;
        }
        Object m2873j = m2873j(m2868e);
        if (m2873j != obj2 && (obj2 == null || !obj2.equals(m2873j))) {
            return false;
        }
        int i = (m2868e << 1) + 1;
        Object[] objArr = this.f5417b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
