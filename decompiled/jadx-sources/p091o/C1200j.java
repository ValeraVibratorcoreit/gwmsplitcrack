package p091o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.j */
/* loaded from: classes.dex */
public final class C1200j implements Collection {

    /* renamed from: a */
    public final /* synthetic */ C1191a f5411a;

    public C1200j(C1191a c1191a) {
        this.f5411a = c1191a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f5411a.m2838a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5411a.m2843f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5411a.m2841d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1197g(this.f5411a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1191a c1191a = this.f5411a;
        int m2843f = c1191a.m2843f(obj);
        if (m2843f < 0) {
            return false;
        }
        c1191a.m2844g(m2843f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1191a c1191a = this.f5411a;
        int m2841d = c1191a.m2841d();
        int i = 0;
        boolean z2 = false;
        while (i < m2841d) {
            if (collection.contains(c1191a.m2839b(i, 1))) {
                c1191a.m2844g(i);
                i--;
                m2841d--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1191a c1191a = this.f5411a;
        int m2841d = c1191a.m2841d();
        int i = 0;
        boolean z2 = false;
        while (i < m2841d) {
            if (!collection.contains(c1191a.m2839b(i, 1))) {
                c1191a.m2844g(i);
                i--;
                m2841d--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5411a.m2841d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1191a c1191a = this.f5411a;
        int m2841d = c1191a.m2841d();
        Object[] objArr = new Object[m2841d];
        for (int i = 0; i < m2841d; i++) {
            objArr[i] = c1191a.m2839b(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f5411a.m2845i(1, objArr);
    }
}
