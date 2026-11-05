package p069f1;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: f1.l */
/* loaded from: classes.dex */
public final class C0840l extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f4237a;

    /* renamed from: b */
    public final /* synthetic */ C0842n f4238b;

    public /* synthetic */ C0840l(C0842n c0842n, int i) {
        this.f4237a = i;
        this.f4238b = c0842n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4237a) {
            case 0:
                this.f4238b.clear();
                break;
            default:
                this.f4238b.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        C0841m m2365a;
        switch (this.f4237a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C0842n c0842n = this.f4238b;
                c0842n.getClass();
                Object key = entry.getKey();
                C0841m c0841m = null;
                if (key != null) {
                    try {
                        m2365a = c0842n.m2365a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (m2365a != null && Objects.equals(m2365a.f4246h, entry.getValue())) {
                        c0841m = m2365a;
                    }
                    return c0841m == null;
                }
                m2365a = null;
                if (m2365a != null) {
                    c0841m = m2365a;
                }
                if (c0841m == null) {
                }
            default:
                return this.f4238b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4237a) {
            case 0:
                return new C0839k(this.f4238b, 0);
            default:
                return new C0839k(this.f4238b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        C0841m m2365a;
        switch (this.f4237a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C0842n c0842n = this.f4238b;
                    c0842n.getClass();
                    Object key = entry.getKey();
                    C0841m c0841m = null;
                    if (key != null) {
                        try {
                            m2365a = c0842n.m2365a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (m2365a != null && Objects.equals(m2365a.f4246h, entry.getValue())) {
                            c0841m = m2365a;
                        }
                        if (c0841m == null) {
                            c0842n.m2367c(c0841m, true);
                            break;
                        }
                    }
                    m2365a = null;
                    if (m2365a != null) {
                        c0841m = m2365a;
                    }
                    if (c0841m == null) {
                    }
                }
                break;
            default:
                C0842n c0842n2 = this.f4238b;
                c0842n2.getClass();
                C0841m c0841m2 = null;
                if (obj != null) {
                    try {
                        c0841m2 = c0842n2.m2365a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c0841m2 != null) {
                    c0842n2.m2367c(c0841m2, true);
                }
                if (c0841m2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4237a) {
        }
        return this.f4238b.f4252d;
    }
}
