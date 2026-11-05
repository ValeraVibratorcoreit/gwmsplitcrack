package p091o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.g */
/* loaded from: classes.dex */
public final class C1197g implements Iterator {

    /* renamed from: a */
    public final int f5400a;

    /* renamed from: b */
    public int f5401b;

    /* renamed from: c */
    public int f5402c;

    /* renamed from: d */
    public boolean f5403d = false;

    /* renamed from: e */
    public final /* synthetic */ C1191a f5404e;

    public C1197g(C1191a c1191a, int i) {
        this.f5404e = c1191a;
        this.f5400a = i;
        this.f5401b = c1191a.m2841d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5402c < this.f5401b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object m2839b = this.f5404e.m2839b(this.f5402c, this.f5400a);
        this.f5402c++;
        this.f5403d = true;
        return m2839b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5403d) {
            throw new IllegalStateException();
        }
        int i = this.f5402c - 1;
        this.f5402c = i;
        this.f5401b--;
        this.f5403d = false;
        this.f5404e.m2844g(i);
    }
}
