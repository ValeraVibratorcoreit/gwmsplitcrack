package p105t;

import p102s.C1406d;
import p102s.C1410h;

/* renamed from: t.i */
/* loaded from: classes.dex */
public final class C1448i extends AbstractC1454o {
    @Override // p105t.InterfaceC1443d
    /* renamed from: a */
    public final void mo3427a(InterfaceC1443d interfaceC1443d) {
        C1445f c1445f = this.f6848h;
        if (c1445f.f6818c && !c1445f.f6825j) {
            c1445f.mo3444d((int) ((((C1445f) c1445f.f6827l.get(0)).f6822g * ((C1410h) this.f6842b).f6772q0) + 0.5f));
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: d */
    public final void mo3428d() {
        C1406d c1406d = this.f6842b;
        C1410h c1410h = (C1410h) c1406d;
        int i = c1410h.f6773r0;
        int i2 = c1410h.f6774s0;
        int i3 = c1410h.f6776u0;
        C1445f c1445f = this.f6848h;
        if (i3 == 1) {
            if (i != -1) {
                c1445f.f6827l.add(c1406d.f6647T.f6660d.f6848h);
                this.f6842b.f6647T.f6660d.f6848h.f6826k.add(c1445f);
                c1445f.f6821f = i;
            } else if (i2 != -1) {
                c1445f.f6827l.add(c1406d.f6647T.f6660d.f6849i);
                this.f6842b.f6647T.f6660d.f6849i.f6826k.add(c1445f);
                c1445f.f6821f = -i2;
            } else {
                c1445f.f6817b = true;
                c1445f.f6827l.add(c1406d.f6647T.f6660d.f6849i);
                this.f6842b.f6647T.f6660d.f6849i.f6826k.add(c1445f);
            }
            m3454m(this.f6842b.f6660d.f6848h);
            m3454m(this.f6842b.f6660d.f6849i);
            return;
        }
        if (i != -1) {
            c1445f.f6827l.add(c1406d.f6647T.f6662e.f6848h);
            this.f6842b.f6647T.f6662e.f6848h.f6826k.add(c1445f);
            c1445f.f6821f = i;
        } else if (i2 != -1) {
            c1445f.f6827l.add(c1406d.f6647T.f6662e.f6849i);
            this.f6842b.f6647T.f6662e.f6849i.f6826k.add(c1445f);
            c1445f.f6821f = -i2;
        } else {
            c1445f.f6817b = true;
            c1445f.f6827l.add(c1406d.f6647T.f6662e.f6849i);
            this.f6842b.f6647T.f6662e.f6849i.f6826k.add(c1445f);
        }
        m3454m(this.f6842b.f6662e.f6848h);
        m3454m(this.f6842b.f6662e.f6849i);
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: e */
    public final void mo3429e() {
        C1406d c1406d = this.f6842b;
        int i = ((C1410h) c1406d).f6776u0;
        C1445f c1445f = this.f6848h;
        if (i == 1) {
            c1406d.f6652Y = c1445f.f6822g;
        } else {
            c1406d.f6653Z = c1445f.f6822g;
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: f */
    public final void mo3430f() {
        this.f6848h.m3443c();
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: k */
    public final boolean mo3432k() {
        return false;
    }

    /* renamed from: m */
    public final void m3454m(C1445f c1445f) {
        C1445f c1445f2 = this.f6848h;
        c1445f2.f6826k.add(c1445f);
        c1445f.f6827l.add(c1445f2);
    }
}
