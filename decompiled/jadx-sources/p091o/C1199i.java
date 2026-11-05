package p091o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.i */
/* loaded from: classes.dex */
public final class C1199i implements Iterator, Map.Entry {

    /* renamed from: a */
    public int f5407a;

    /* renamed from: d */
    public final /* synthetic */ C1191a f5410d;

    /* renamed from: c */
    public boolean f5409c = false;

    /* renamed from: b */
    public int f5408b = -1;

    public C1199i(C1191a c1191a) {
        this.f5410d = c1191a;
        this.f5407a = c1191a.m2841d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5409c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f5408b;
        C1191a c1191a = this.f5410d;
        Object m2839b = c1191a.m2839b(i, 0);
        if (key != m2839b && (key == null || !key.equals(m2839b))) {
            return false;
        }
        Object value = entry.getValue();
        Object m2839b2 = c1191a.m2839b(this.f5408b, 1);
        return value == m2839b2 || (value != null && value.equals(m2839b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f5409c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5410d.m2839b(this.f5408b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f5409c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5410d.m2839b(this.f5408b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5408b < this.f5407a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5409c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f5408b;
        C1191a c1191a = this.f5410d;
        Object m2839b = c1191a.m2839b(i, 0);
        Object m2839b2 = c1191a.m2839b(this.f5408b, 1);
        return (m2839b == null ? 0 : m2839b.hashCode()) ^ (m2839b2 != null ? m2839b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5408b++;
        this.f5409c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5409c) {
            throw new IllegalStateException();
        }
        this.f5410d.m2844g(this.f5408b);
        this.f5408b--;
        this.f5407a--;
        this.f5409c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f5409c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C1191a c1191a = this.f5410d;
        int i = this.f5408b;
        switch (c1191a.f5374d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((C1192b) c1191a.f5375e).f5417b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
