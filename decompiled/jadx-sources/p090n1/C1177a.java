package p090n1;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p107t1.AbstractC1461d;
import p110u1.InterfaceC1588a;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C1177a extends AbstractList implements List, InterfaceC1588a {

    /* renamed from: d */
    public static final Object[] f5363d = new Object[0];

    /* renamed from: a */
    public int f5364a;

    /* renamed from: b */
    public Object[] f5365b = f5363d;

    /* renamed from: c */
    public int f5366c;

    /* renamed from: a */
    public final void m2829a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f5365b.length;
        while (i < length && it.hasNext()) {
            this.f5365b[i] = it.next();
            i++;
        }
        int i2 = this.f5364a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f5365b[i3] = it.next();
        }
        this.f5366c = collection.size() + this.f5366c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f5366c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i3);
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m2830b(i3 + 1);
        int m2832d = m2832d(this.f5364a + i);
        int i4 = this.f5366c;
        if (i < ((i4 + 1) >> 1)) {
            if (m2832d == 0) {
                Object[] objArr = this.f5365b;
                AbstractC1461d.m3494e("<this>", objArr);
                m2832d = objArr.length;
            }
            int i5 = m2832d - 1;
            int i6 = this.f5364a;
            if (i6 == 0) {
                Object[] objArr2 = this.f5365b;
                AbstractC1461d.m3494e("<this>", objArr2);
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.f5364a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f5365b;
                objArr3[i2] = objArr3[i7];
                AbstractC1178b.m2833v0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f5365b;
                AbstractC1178b.m2833v0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f5365b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC1178b.m2833v0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f5365b[i5] = obj;
            this.f5364a = i2;
        } else {
            int m2832d2 = m2832d(this.f5364a + i4);
            if (m2832d < m2832d2) {
                Object[] objArr6 = this.f5365b;
                AbstractC1178b.m2833v0(objArr6, objArr6, m2832d + 1, m2832d, m2832d2);
            } else {
                Object[] objArr7 = this.f5365b;
                AbstractC1178b.m2833v0(objArr7, objArr7, 1, 0, m2832d2);
                Object[] objArr8 = this.f5365b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC1178b.m2833v0(objArr8, objArr8, m2832d + 1, m2832d, objArr8.length - 1);
            }
            this.f5365b[m2832d] = obj;
        }
        this.f5366c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC1461d.m3494e("elements", collection);
        int i2 = this.f5366c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.f5366c;
        if (i == i3) {
            return addAll(collection);
        }
        m2830b(collection.size() + i3);
        int m2832d = m2832d(this.f5364a + this.f5366c);
        int m2832d2 = m2832d(this.f5364a + i);
        int size = collection.size();
        if (i < ((this.f5366c + 1) >> 1)) {
            int i4 = this.f5364a;
            int i5 = i4 - size;
            if (m2832d2 < i4) {
                Object[] objArr = this.f5365b;
                AbstractC1178b.m2833v0(objArr, objArr, i5, i4, objArr.length);
                if (size >= m2832d2) {
                    Object[] objArr2 = this.f5365b;
                    AbstractC1178b.m2833v0(objArr2, objArr2, objArr2.length - size, 0, m2832d2);
                } else {
                    Object[] objArr3 = this.f5365b;
                    AbstractC1178b.m2833v0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f5365b;
                    AbstractC1178b.m2833v0(objArr4, objArr4, 0, size, m2832d2);
                }
            } else if (i5 >= 0) {
                Object[] objArr5 = this.f5365b;
                AbstractC1178b.m2833v0(objArr5, objArr5, i5, i4, m2832d2);
            } else {
                Object[] objArr6 = this.f5365b;
                i5 += objArr6.length;
                int i6 = m2832d2 - i4;
                int length = objArr6.length - i5;
                if (length >= i6) {
                    AbstractC1178b.m2833v0(objArr6, objArr6, i5, i4, m2832d2);
                } else {
                    AbstractC1178b.m2833v0(objArr6, objArr6, i5, i4, i4 + length);
                    Object[] objArr7 = this.f5365b;
                    AbstractC1178b.m2833v0(objArr7, objArr7, 0, this.f5364a + length, m2832d2);
                }
            }
            this.f5364a = i5;
            int i7 = m2832d2 - size;
            if (i7 < 0) {
                i7 += this.f5365b.length;
            }
            m2829a(i7, collection);
        } else {
            int i8 = m2832d2 + size;
            if (m2832d2 < m2832d) {
                int i9 = size + m2832d;
                Object[] objArr8 = this.f5365b;
                if (i9 <= objArr8.length) {
                    AbstractC1178b.m2833v0(objArr8, objArr8, i8, m2832d2, m2832d);
                } else if (i8 >= objArr8.length) {
                    AbstractC1178b.m2833v0(objArr8, objArr8, i8 - objArr8.length, m2832d2, m2832d);
                } else {
                    int length2 = m2832d - (i9 - objArr8.length);
                    AbstractC1178b.m2833v0(objArr8, objArr8, 0, length2, m2832d);
                    Object[] objArr9 = this.f5365b;
                    AbstractC1178b.m2833v0(objArr9, objArr9, i8, m2832d2, length2);
                }
            } else {
                Object[] objArr10 = this.f5365b;
                AbstractC1178b.m2833v0(objArr10, objArr10, size, 0, m2832d);
                Object[] objArr11 = this.f5365b;
                if (i8 >= objArr11.length) {
                    AbstractC1178b.m2833v0(objArr11, objArr11, i8 - objArr11.length, m2832d2, objArr11.length);
                } else {
                    AbstractC1178b.m2833v0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f5365b;
                    AbstractC1178b.m2833v0(objArr12, objArr12, i8, m2832d2, objArr12.length - size);
                }
            }
            m2829a(m2832d2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        m2830b(this.f5366c + 1);
        int i = this.f5364a;
        if (i == 0) {
            Object[] objArr = this.f5365b;
            AbstractC1461d.m3494e("<this>", objArr);
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f5364a = i2;
        this.f5365b[i2] = obj;
        this.f5366c++;
    }

    public final void addLast(Object obj) {
        m2830b(this.f5366c + 1);
        this.f5365b[m2832d(this.f5364a + this.f5366c)] = obj;
        this.f5366c++;
    }

    /* renamed from: b */
    public final void m2830b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f5365b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f5363d) {
            if (i < 10) {
                i = 10;
            }
            this.f5365b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC1178b.m2833v0(objArr, objArr2, 0, this.f5364a, objArr.length);
        Object[] objArr3 = this.f5365b;
        int length2 = objArr3.length;
        int i3 = this.f5364a;
        AbstractC1178b.m2833v0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f5364a = 0;
        this.f5365b = objArr2;
    }

    /* renamed from: c */
    public final int m2831c(int i) {
        AbstractC1461d.m3494e("<this>", this.f5365b);
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int m2832d = m2832d(this.f5364a + this.f5366c);
        int i = this.f5364a;
        if (i < m2832d) {
            Object[] objArr = this.f5365b;
            AbstractC1461d.m3494e("<this>", objArr);
            Arrays.fill(objArr, i, m2832d, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f5365b;
            Arrays.fill(objArr2, this.f5364a, objArr2.length, (Object) null);
            Object[] objArr3 = this.f5365b;
            AbstractC1461d.m3494e("<this>", objArr3);
            Arrays.fill(objArr3, 0, m2832d, (Object) null);
        }
        this.f5364a = 0;
        this.f5366c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m2832d(int i) {
        Object[] objArr = this.f5365b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f5366c;
        if (i >= 0 && i < i2) {
            return this.f5365b[m2832d(this.f5364a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int m2832d = m2832d(this.f5364a + this.f5366c);
        int i2 = this.f5364a;
        if (i2 < m2832d) {
            while (i2 < m2832d) {
                if (AbstractC1461d.m3490a(obj, this.f5365b[i2])) {
                    i = this.f5364a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < m2832d) {
            return -1;
        }
        int length = this.f5365b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < m2832d; i3++) {
                    if (AbstractC1461d.m3490a(obj, this.f5365b[i3])) {
                        i2 = i3 + this.f5365b.length;
                        i = this.f5364a;
                    }
                }
                return -1;
            }
            if (AbstractC1461d.m3490a(obj, this.f5365b[i2])) {
                i = this.f5364a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5366c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int m2832d = m2832d(this.f5364a + this.f5366c);
        int i2 = this.f5364a;
        if (i2 < m2832d) {
            length = m2832d - 1;
            if (i2 <= length) {
                while (!AbstractC1461d.m3490a(obj, this.f5365b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f5364a;
                return length - i;
            }
            return -1;
        }
        if (i2 > m2832d) {
            int i3 = m2832d - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f5365b;
                    AbstractC1461d.m3494e("<this>", objArr);
                    length = objArr.length - 1;
                    int i4 = this.f5364a;
                    if (i4 <= length) {
                        while (!AbstractC1461d.m3490a(obj, this.f5365b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f5364a;
                    }
                } else {
                    if (AbstractC1461d.m3490a(obj, this.f5365b[i3])) {
                        length = i3 + this.f5365b.length;
                        i = this.f5364a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.f5366c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int m2832d = m2832d(this.f5364a + i);
        Object[] objArr = this.f5365b;
        Object obj = objArr[m2832d];
        if (i < (this.f5366c >> 1)) {
            int i3 = this.f5364a;
            if (m2832d >= i3) {
                AbstractC1178b.m2833v0(objArr, objArr, i3 + 1, i3, m2832d);
            } else {
                AbstractC1178b.m2833v0(objArr, objArr, 1, 0, m2832d);
                Object[] objArr2 = this.f5365b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f5364a;
                AbstractC1178b.m2833v0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f5365b;
            int i5 = this.f5364a;
            objArr3[i5] = null;
            this.f5364a = m2831c(i5);
        } else {
            int m2832d2 = m2832d((size() - 1) + this.f5364a);
            if (m2832d <= m2832d2) {
                Object[] objArr4 = this.f5365b;
                AbstractC1178b.m2833v0(objArr4, objArr4, m2832d, m2832d + 1, m2832d2 + 1);
            } else {
                Object[] objArr5 = this.f5365b;
                AbstractC1178b.m2833v0(objArr5, objArr5, m2832d, m2832d + 1, objArr5.length);
                Object[] objArr6 = this.f5365b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC1178b.m2833v0(objArr6, objArr6, 0, 1, m2832d2 + 1);
            }
            this.f5365b[m2832d2] = null;
        }
        this.f5366c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int m2832d;
        AbstractC1461d.m3494e("elements", collection);
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f5365b.length != 0) {
            int m2832d2 = m2832d(this.f5364a + this.f5366c);
            int i = this.f5364a;
            if (i < m2832d2) {
                m2832d = i;
                while (i < m2832d2) {
                    Object obj = this.f5365b[i];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f5365b[m2832d] = obj;
                        m2832d++;
                    }
                    i++;
                }
                Object[] objArr = this.f5365b;
                AbstractC1461d.m3494e("<this>", objArr);
                Arrays.fill(objArr, m2832d, m2832d2, (Object) null);
            } else {
                int length = this.f5365b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f5365b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f5365b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                m2832d = m2832d(i2);
                for (int i3 = 0; i3 < m2832d2; i3++) {
                    Object[] objArr3 = this.f5365b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f5365b[m2832d] = obj3;
                        m2832d = m2831c(m2832d);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i4 = m2832d - this.f5364a;
                if (i4 < 0) {
                    i4 += this.f5365b.length;
                }
                this.f5366c = i4;
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f5365b;
        int i = this.f5364a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f5364a = m2831c(i);
        this.f5366c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int m2832d = m2832d((size() - 1) + this.f5364a);
        Object[] objArr = this.f5365b;
        Object obj = objArr[m2832d];
        objArr[m2832d] = null;
        this.f5366c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int m2832d;
        AbstractC1461d.m3494e("elements", collection);
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f5365b.length != 0) {
            int m2832d2 = m2832d(this.f5364a + this.f5366c);
            int i = this.f5364a;
            if (i < m2832d2) {
                m2832d = i;
                while (i < m2832d2) {
                    Object obj = this.f5365b[i];
                    if (collection.contains(obj)) {
                        this.f5365b[m2832d] = obj;
                        m2832d++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                Object[] objArr = this.f5365b;
                AbstractC1461d.m3494e("<this>", objArr);
                Arrays.fill(objArr, m2832d, m2832d2, (Object) null);
            } else {
                int length = this.f5365b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f5365b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f5365b[i2] = obj2;
                        i2++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                m2832d = m2832d(i2);
                for (int i3 = 0; i3 < m2832d2; i3++) {
                    Object[] objArr3 = this.f5365b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f5365b[m2832d] = obj3;
                        m2832d = m2831c(m2832d);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i4 = m2832d - this.f5364a;
                if (i4 < 0) {
                    i4 += this.f5365b.length;
                }
                this.f5366c = i4;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f5366c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int m2832d = m2832d(this.f5364a + i);
        Object[] objArr = this.f5365b;
        Object obj2 = objArr[m2832d];
        objArr[m2832d] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5366c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f5366c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1461d.m3494e("array", objArr);
        int length = objArr.length;
        int i = this.f5366c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC1461d.m3492c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", newInstance);
            objArr = (Object[]) newInstance;
        }
        int m2832d = m2832d(this.f5364a + this.f5366c);
        int i2 = this.f5364a;
        if (i2 < m2832d) {
            AbstractC1178b.m2833v0(this.f5365b, objArr, 0, i2, m2832d);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f5365b;
            AbstractC1178b.m2833v0(objArr2, objArr, 0, this.f5364a, objArr2.length);
            Object[] objArr3 = this.f5365b;
            AbstractC1178b.m2833v0(objArr3, objArr, objArr3.length - this.f5364a, 0, m2832d);
        }
        int length2 = objArr.length;
        int i3 = this.f5366c;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1461d.m3494e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        m2830b(collection.size() + this.f5366c);
        m2829a(m2832d(this.f5364a + this.f5366c), collection);
        return true;
    }
}
