package p088n;

import java.util.Iterator;

/* renamed from: n.d */
/* loaded from: classes.dex */
public final class C1173d extends AbstractC1174e implements Iterator {

    /* renamed from: a */
    public C1172c f5355a;

    /* renamed from: b */
    public boolean f5356b = true;

    /* renamed from: c */
    public final /* synthetic */ C1175f f5357c;

    public C1173d(C1175f c1175f) {
        this.f5357c = c1175f;
    }

    @Override // p088n.AbstractC1174e
    /* renamed from: a */
    public final void mo2827a(C1172c c1172c) {
        C1172c c1172c2 = this.f5355a;
        if (c1172c == c1172c2) {
            C1172c c1172c3 = c1172c2.f5354d;
            this.f5355a = c1172c3;
            this.f5356b = c1172c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5356b) {
            return this.f5357c.f5358a != null;
        }
        C1172c c1172c = this.f5355a;
        return (c1172c == null || c1172c.f5353c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5356b) {
            this.f5356b = false;
            this.f5355a = this.f5357c.f5358a;
        } else {
            C1172c c1172c = this.f5355a;
            this.f5355a = c1172c != null ? c1172c.f5353c : null;
        }
        return this.f5355a;
    }
}
