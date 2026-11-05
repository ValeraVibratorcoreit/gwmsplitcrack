package p105t;

import java.util.Iterator;
import p102s.C1403a;
import p102s.C1406d;

/* renamed from: t.j */
/* loaded from: classes.dex */
public final class C1449j extends AbstractC1454o {
    @Override // p105t.InterfaceC1443d
    /* renamed from: a */
    public final void mo3427a(InterfaceC1443d interfaceC1443d) {
        C1403a c1403a = (C1403a) this.f6842b;
        int i = c1403a.f6598s0;
        C1445f c1445f = this.f6848h;
        Iterator it = c1445f.f6827l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1445f) it.next()).f6822g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c1445f.mo3444d(i3 + c1403a.f6600u0);
        } else {
            c1445f.mo3444d(i2 + c1403a.f6600u0);
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: d */
    public final void mo3428d() {
        C1406d c1406d = this.f6842b;
        if (c1406d instanceof C1403a) {
            C1445f c1445f = this.f6848h;
            c1445f.f6817b = true;
            C1403a c1403a = (C1403a) c1406d;
            int i = c1403a.f6598s0;
            boolean z2 = c1403a.f6599t0;
            int i2 = 0;
            if (i == 0) {
                c1445f.f6820e = 4;
                while (i2 < c1403a.f6779r0) {
                    C1406d c1406d2 = c1403a.f6778q0[i2];
                    if (z2 || c1406d2.f6667g0 != 8) {
                        C1445f c1445f2 = c1406d2.f6660d.f6848h;
                        c1445f2.f6826k.add(c1445f);
                        c1445f.f6827l.add(c1445f2);
                    }
                    i2++;
                }
                m3455m(this.f6842b.f6660d.f6848h);
                m3455m(this.f6842b.f6660d.f6849i);
                return;
            }
            if (i == 1) {
                c1445f.f6820e = 5;
                while (i2 < c1403a.f6779r0) {
                    C1406d c1406d3 = c1403a.f6778q0[i2];
                    if (z2 || c1406d3.f6667g0 != 8) {
                        C1445f c1445f3 = c1406d3.f6660d.f6849i;
                        c1445f3.f6826k.add(c1445f);
                        c1445f.f6827l.add(c1445f3);
                    }
                    i2++;
                }
                m3455m(this.f6842b.f6660d.f6848h);
                m3455m(this.f6842b.f6660d.f6849i);
                return;
            }
            if (i == 2) {
                c1445f.f6820e = 6;
                while (i2 < c1403a.f6779r0) {
                    C1406d c1406d4 = c1403a.f6778q0[i2];
                    if (z2 || c1406d4.f6667g0 != 8) {
                        C1445f c1445f4 = c1406d4.f6662e.f6848h;
                        c1445f4.f6826k.add(c1445f);
                        c1445f.f6827l.add(c1445f4);
                    }
                    i2++;
                }
                m3455m(this.f6842b.f6662e.f6848h);
                m3455m(this.f6842b.f6662e.f6849i);
                return;
            }
            if (i != 3) {
                return;
            }
            c1445f.f6820e = 7;
            while (i2 < c1403a.f6779r0) {
                C1406d c1406d5 = c1403a.f6778q0[i2];
                if (z2 || c1406d5.f6667g0 != 8) {
                    C1445f c1445f5 = c1406d5.f6662e.f6849i;
                    c1445f5.f6826k.add(c1445f);
                    c1445f.f6827l.add(c1445f5);
                }
                i2++;
            }
            m3455m(this.f6842b.f6662e.f6848h);
            m3455m(this.f6842b.f6662e.f6849i);
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: e */
    public final void mo3429e() {
        C1406d c1406d = this.f6842b;
        if (c1406d instanceof C1403a) {
            int i = ((C1403a) c1406d).f6598s0;
            C1445f c1445f = this.f6848h;
            if (i == 0 || i == 1) {
                c1406d.f6652Y = c1445f.f6822g;
            } else {
                c1406d.f6653Z = c1445f.f6822g;
            }
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: f */
    public final void mo3430f() {
        this.f6843c = null;
        this.f6848h.m3443c();
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: k */
    public final boolean mo3432k() {
        return false;
    }

    /* renamed from: m */
    public final void m3455m(C1445f c1445f) {
        C1445f c1445f2 = this.f6848h;
        c1445f2.f6826k.add(c1445f);
        c1445f.f6827l.add(c1445f2);
    }
}
