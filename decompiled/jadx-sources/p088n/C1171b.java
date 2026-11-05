package p088n;

import java.util.Iterator;

/* renamed from: n.b */
/* loaded from: classes.dex */
public final class C1171b extends AbstractC1174e implements Iterator {

    /* renamed from: a */
    public C1172c f5348a;

    /* renamed from: b */
    public C1172c f5349b;

    /* renamed from: c */
    public final /* synthetic */ int f5350c;

    public C1171b(C1172c c1172c, C1172c c1172c2, int i) {
        this.f5350c = i;
        this.f5348a = c1172c2;
        this.f5349b = c1172c;
    }

    @Override // p088n.AbstractC1174e
    /* renamed from: a */
    public final void mo2827a(C1172c c1172c) {
        C1172c c1172c2;
        C1172c c1172c3 = null;
        if (this.f5348a == c1172c && c1172c == this.f5349b) {
            this.f5349b = null;
            this.f5348a = null;
        }
        C1172c c1172c4 = this.f5348a;
        if (c1172c4 == c1172c) {
            switch (this.f5350c) {
                case 0:
                    c1172c2 = c1172c4.f5354d;
                    break;
                default:
                    c1172c2 = c1172c4.f5353c;
                    break;
            }
            this.f5348a = c1172c2;
        }
        C1172c c1172c5 = this.f5349b;
        if (c1172c5 == c1172c) {
            C1172c c1172c6 = this.f5348a;
            if (c1172c5 != c1172c6 && c1172c6 != null) {
                c1172c3 = m2828b(c1172c5);
            }
            this.f5349b = c1172c3;
        }
    }

    /* renamed from: b */
    public final C1172c m2828b(C1172c c1172c) {
        switch (this.f5350c) {
            case 0:
                return c1172c.f5353c;
            default:
                return c1172c.f5354d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5349b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1172c c1172c = this.f5349b;
        C1172c c1172c2 = this.f5348a;
        this.f5349b = (c1172c == c1172c2 || c1172c2 == null) ? null : m2828b(c1172c);
        return c1172c;
    }
}
