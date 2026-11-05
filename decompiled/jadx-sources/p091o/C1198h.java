package p091o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h */
/* loaded from: classes.dex */
public final class C1198h implements Set {

    /* renamed from: a */
    public final /* synthetic */ int f5405a;

    /* renamed from: b */
    public final /* synthetic */ C1191a f5406b;

    public /* synthetic */ C1198h(C1191a c1191a, int i) {
        this.f5405a = i;
        this.f5406b = c1191a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5405a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5405a) {
            case 0:
                C1191a c1191a = this.f5406b;
                int m2841d = c1191a.m2841d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c1191a.f5374d) {
                        case 0:
                            ((C1192b) c1191a.f5375e).put(key, value);
                            break;
                        default:
                            ((C1193c) c1191a.f5375e).add(key);
                            break;
                    }
                }
                return m2841d != c1191a.m2841d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f5405a) {
            case 0:
                this.f5406b.m2838a();
                break;
            default:
                this.f5406b.m2838a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5405a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C1191a c1191a = this.f5406b;
                int m2842e = c1191a.m2842e(key);
                if (m2842e < 0) {
                    return false;
                }
                Object m2839b = c1191a.m2839b(m2842e, 1);
                Object value = entry.getValue();
                return m2839b == value || (m2839b != null && m2839b.equals(value));
            default:
                return this.f5406b.m2842e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5405a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map m2840c = this.f5406b.m2840c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!m2840c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f5405a) {
        }
        return C1191a.m2837h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f5405a) {
            case 0:
                C1191a c1191a = this.f5406b;
                int i = 0;
                for (int m2841d = c1191a.m2841d() - 1; m2841d >= 0; m2841d--) {
                    Object m2839b = c1191a.m2839b(m2841d, 0);
                    Object m2839b2 = c1191a.m2839b(m2841d, 1);
                    i += (m2839b == null ? 0 : m2839b.hashCode()) ^ (m2839b2 == null ? 0 : m2839b2.hashCode());
                }
                return i;
            default:
                C1191a c1191a2 = this.f5406b;
                int i2 = 0;
                for (int m2841d2 = c1191a2.m2841d() - 1; m2841d2 >= 0; m2841d2--) {
                    Object m2839b3 = c1191a2.m2839b(m2841d2, 0);
                    i2 += m2839b3 == null ? 0 : m2839b3.hashCode();
                }
                return i2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5405a) {
            case 0:
                if (this.f5406b.m2841d() == 0) {
                }
                break;
            default:
                if (this.f5406b.m2841d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5405a) {
            case 0:
                return new C1199i(this.f5406b);
            default:
                return new C1197g(this.f5406b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5405a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1191a c1191a = this.f5406b;
                int m2842e = c1191a.m2842e(obj);
                if (m2842e < 0) {
                    return false;
                }
                c1191a.m2844g(m2842e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5405a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map m2840c = this.f5406b.m2840c();
                int size = m2840c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    m2840c.remove(it.next());
                }
                return size != m2840c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5405a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map m2840c = this.f5406b.m2840c();
                int size = m2840c.size();
                Iterator it = m2840c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != m2840c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f5405a) {
        }
        return this.f5406b.m2841d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5405a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f5406b.m2845i(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5405a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1191a c1191a = this.f5406b;
                int m2841d = c1191a.m2841d();
                Object[] objArr = new Object[m2841d];
                for (int i = 0; i < m2841d; i++) {
                    objArr[i] = c1191a.m2839b(i, 0);
                }
                return objArr;
        }
    }
}
