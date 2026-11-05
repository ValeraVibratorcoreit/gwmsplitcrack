package p122y1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p058c.C0572f;
import p107t1.AbstractC1461d;
import p110u1.InterfaceC1588a;

/* renamed from: y1.b */
/* loaded from: classes.dex */
public final class C1689b implements Iterator, InterfaceC1588a {

    /* renamed from: a */
    public Object f9622a;

    /* renamed from: b */
    public int f9623b = -2;

    /* renamed from: c */
    public final /* synthetic */ C1690c f9624c;

    public C1689b(C1690c c1690c) {
        this.f9624c = c1690c;
    }

    /* renamed from: a */
    public final void m4954a() {
        Object mo1171c;
        int i = this.f9623b;
        C1690c c1690c = this.f9624c;
        if (i == -2) {
            c1690c.getClass();
            mo1171c = C0572f.f2181b.mo1164a();
        } else {
            C1692e c1692e = c1690c.f9625a;
            Object obj = this.f9622a;
            AbstractC1461d.m3491b(obj);
            mo1171c = c1692e.mo1171c(obj);
        }
        this.f9622a = mo1171c;
        this.f9623b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9623b < 0) {
            m4954a();
        }
        return this.f9623b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9623b < 0) {
            m4954a();
        }
        if (this.f9623b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f9622a;
        AbstractC1461d.m3492c("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
        this.f9623b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
