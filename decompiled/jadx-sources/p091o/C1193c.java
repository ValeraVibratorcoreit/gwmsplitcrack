package p091o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.c */
/* loaded from: classes.dex */
public final class C1193c implements Collection, Set {

    /* renamed from: e */
    public static final int[] f5377e = new int[0];

    /* renamed from: f */
    public static final Object[] f5378f = new Object[0];

    /* renamed from: g */
    public static Object[] f5379g;

    /* renamed from: h */
    public static int f5380h;

    /* renamed from: i */
    public static Object[] f5381i;

    /* renamed from: j */
    public static int f5382j;

    /* renamed from: a */
    public int[] f5383a = f5377e;

    /* renamed from: b */
    public Object[] f5384b = f5378f;

    /* renamed from: c */
    public int f5385c = 0;

    /* renamed from: d */
    public C1191a f5386d;

    /* renamed from: b */
    public static void m2846b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1193c.class) {
                try {
                    if (f5382j < 10) {
                        objArr[0] = f5381i;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f5381i = objArr;
                        f5382j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1193c.class) {
                try {
                    if (f5380h < 10) {
                        objArr[0] = f5379g;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5379g = objArr;
                        f5380h++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2847a(int i) {
        if (i == 8) {
            synchronized (C1193c.class) {
                try {
                    Object[] objArr = f5381i;
                    if (objArr != null) {
                        this.f5384b = objArr;
                        f5381i = (Object[]) objArr[0];
                        this.f5383a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5382j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C1193c.class) {
                try {
                    Object[] objArr2 = f5379g;
                    if (objArr2 != null) {
                        this.f5384b = objArr2;
                        f5379g = (Object[]) objArr2[0];
                        this.f5383a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5380h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5383a = new int[i];
        this.f5384b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int m2848c;
        if (obj == null) {
            m2848c = m2849d();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            m2848c = m2848c(hashCode, obj);
        }
        if (m2848c >= 0) {
            return false;
        }
        int i2 = ~m2848c;
        int i3 = this.f5385c;
        int[] iArr = this.f5383a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f5384b;
            m2847a(i4);
            int[] iArr2 = this.f5383a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5384b, 0, objArr.length);
            }
            m2846b(iArr, objArr, this.f5385c);
        }
        int i5 = this.f5385c;
        if (i2 < i5) {
            int[] iArr3 = this.f5383a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f5384b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f5385c - i2);
        }
        this.f5383a[i2] = i;
        this.f5384b[i2] = obj;
        this.f5385c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f5385c;
        int[] iArr = this.f5383a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5384b;
            m2847a(size);
            int i = this.f5385c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f5383a, 0, i);
                System.arraycopy(objArr, 0, this.f5384b, 0, this.f5385c);
            }
            m2846b(iArr, objArr, this.f5385c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    /* renamed from: c */
    public final int m2848c(int i, Object obj) {
        int i2 = this.f5385c;
        if (i2 == 0) {
            return -1;
        }
        int m2851a = AbstractC1194d.m2851a(i2, i, this.f5383a);
        if (m2851a < 0 || obj.equals(this.f5384b[m2851a])) {
            return m2851a;
        }
        int i3 = m2851a + 1;
        while (i3 < i2 && this.f5383a[i3] == i) {
            if (obj.equals(this.f5384b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m2851a - 1; i4 >= 0 && this.f5383a[i4] == i; i4--) {
            if (obj.equals(this.f5384b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f5385c;
        if (i != 0) {
            m2846b(this.f5383a, this.f5384b, i);
            this.f5383a = f5377e;
            this.f5384b = f5378f;
            this.f5385c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m2849d() {
        int i = this.f5385c;
        if (i == 0) {
            return -1;
        }
        int m2851a = AbstractC1194d.m2851a(i, 0, this.f5383a);
        if (m2851a < 0 || this.f5384b[m2851a] == null) {
            return m2851a;
        }
        int i2 = m2851a + 1;
        while (i2 < i && this.f5383a[i2] == 0) {
            if (this.f5384b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m2851a - 1; i3 >= 0 && this.f5383a[i3] == 0; i3--) {
            if (this.f5384b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: e */
    public final void m2850e(int i) {
        Object[] objArr = this.f5384b;
        Object obj = objArr[i];
        int i2 = this.f5385c;
        if (i2 <= 1) {
            m2846b(this.f5383a, objArr, i2);
            this.f5383a = f5377e;
            this.f5384b = f5378f;
            this.f5385c = 0;
            return;
        }
        int[] iArr = this.f5383a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f5385c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f5384b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f5385c - i);
            }
            this.f5384b[this.f5385c] = null;
            return;
        }
        m2847a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f5385c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f5383a, 0, i);
            System.arraycopy(objArr, 0, this.f5384b, 0, i);
        }
        int i5 = this.f5385c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f5383a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f5384b, i, this.f5385c - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f5385c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f5385c; i++) {
                try {
                    if (!set.contains(this.f5384b[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5383a;
        int i = this.f5385c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m2849d() : m2848c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5385c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f5386d == null) {
            this.f5386d = new C1191a(1, this);
        }
        C1191a c1191a = this.f5386d;
        if (c1191a.f5372b == null) {
            c1191a.f5372b = new C1198h(c1191a, 1);
        }
        return c1191a.f5372b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m2850e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i = this.f5385c - 1; i >= 0; i--) {
            if (!collection.contains(this.f5384b[i])) {
                m2850e(i);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5385c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f5385c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5384b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5385c * 14);
        sb.append('{');
        for (int i = 0; i < this.f5385c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f5384b[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f5385c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f5385c);
        }
        System.arraycopy(this.f5384b, 0, objArr, 0, this.f5385c);
        int length = objArr.length;
        int i = this.f5385c;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
