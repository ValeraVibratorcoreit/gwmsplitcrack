package p069f1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: f1.k */
/* loaded from: classes.dex */
public final class C0839k implements Iterator {

    /* renamed from: a */
    public C0841m f4232a;

    /* renamed from: b */
    public C0841m f4233b = null;

    /* renamed from: c */
    public int f4234c;

    /* renamed from: d */
    public final /* synthetic */ C0842n f4235d;

    /* renamed from: e */
    public final /* synthetic */ int f4236e;

    public C0839k(C0842n c0842n, int i) {
        this.f4236e = i;
        this.f4235d = c0842n;
        this.f4232a = c0842n.f4254f.f4242d;
        this.f4234c = c0842n.f4253e;
    }

    /* renamed from: a */
    public final Object m2363a() {
        return m2364b();
    }

    /* renamed from: b */
    public final C0841m m2364b() {
        C0841m c0841m = this.f4232a;
        C0842n c0842n = this.f4235d;
        if (c0841m == c0842n.f4254f) {
            throw new NoSuchElementException();
        }
        if (c0842n.f4253e != this.f4234c) {
            throw new ConcurrentModificationException();
        }
        this.f4232a = c0841m.f4242d;
        this.f4233b = c0841m;
        return c0841m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4232a != this.f4235d.f4254f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f4236e) {
            case 1:
                return m2364b().f4244f;
            default:
                return m2363a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0841m c0841m = this.f4233b;
        if (c0841m == null) {
            throw new IllegalStateException();
        }
        C0842n c0842n = this.f4235d;
        c0842n.m2367c(c0841m, true);
        this.f4233b = null;
        this.f4234c = c0842n.f4253e;
    }
}
