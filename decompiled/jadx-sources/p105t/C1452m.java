package p105t;

import p097q.AbstractC1241e;
import p102s.AbstractC1411i;
import p102s.C1405c;
import p102s.C1406d;

/* renamed from: t.m */
/* loaded from: classes.dex */
public final class C1452m extends AbstractC1454o {

    /* renamed from: k */
    public C1445f f6833k;

    /* renamed from: l */
    public C1440a f6834l;

    @Override // p105t.InterfaceC1443d
    /* renamed from: a */
    public final void mo3427a(InterfaceC1443d interfaceC1443d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC1241e.m2943b(this.f6850j) == 3) {
            C1406d c1406d = this.f6842b;
            m3469l(c1406d.f6637J, c1406d.f6639L, 1);
            return;
        }
        C1446g c1446g = this.f6845e;
        if (c1446g.f6818c && !c1446g.f6825j && this.f6844d == 3) {
            C1406d c1406d2 = this.f6842b;
            int i2 = c1406d2.f6688s;
            if (i2 == 2) {
                C1406d c1406d3 = c1406d2.f6647T;
                if (c1406d3 != null) {
                    if (c1406d3.f6662e.f6845e.f6825j) {
                        c1446g.mo3444d((int) ((r5.f6822g * c1406d2.f6695z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C1446g c1446g2 = c1406d2.f6660d.f6845e;
                if (c1446g2.f6825j) {
                    int i3 = c1406d2.f6651X;
                    if (i3 == -1) {
                        f2 = c1446g2.f6822g;
                        f3 = c1406d2.f6650W;
                    } else if (i3 == 0) {
                        f4 = c1446g2.f6822g * c1406d2.f6650W;
                        i = (int) (f4 + 0.5f);
                        c1446g.mo3444d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c1446g.mo3444d(i);
                    } else {
                        f2 = c1446g2.f6822g;
                        f3 = c1406d2.f6650W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c1446g.mo3444d(i);
                }
            }
        }
        C1445f c1445f = this.f6848h;
        if (c1445f.f6818c) {
            C1445f c1445f2 = this.f6849i;
            if (c1445f2.f6818c) {
                if (c1445f.f6825j && c1445f2.f6825j && c1446g.f6825j) {
                    return;
                }
                if (!c1446g.f6825j && this.f6844d == 3) {
                    C1406d c1406d4 = this.f6842b;
                    if (c1406d4.f6687r == 0 && !c1406d4.m3402y()) {
                        C1445f c1445f3 = (C1445f) c1445f.f6827l.get(0);
                        C1445f c1445f4 = (C1445f) c1445f2.f6827l.get(0);
                        int i4 = c1445f3.f6822g + c1445f.f6821f;
                        int i5 = c1445f4.f6822g + c1445f2.f6821f;
                        c1445f.mo3444d(i4);
                        c1445f2.mo3444d(i5);
                        c1446g.mo3444d(i5 - i4);
                        return;
                    }
                }
                if (!c1446g.f6825j && this.f6844d == 3 && this.f6841a == 1 && c1445f.f6827l.size() > 0 && c1445f2.f6827l.size() > 0) {
                    C1445f c1445f5 = (C1445f) c1445f.f6827l.get(0);
                    int i6 = (((C1445f) c1445f2.f6827l.get(0)).f6822g + c1445f2.f6821f) - (c1445f5.f6822g + c1445f.f6821f);
                    int i7 = c1446g.f6828m;
                    if (i6 < i7) {
                        c1446g.mo3444d(i6);
                    } else {
                        c1446g.mo3444d(i7);
                    }
                }
                if (c1446g.f6825j && c1445f.f6827l.size() > 0 && c1445f2.f6827l.size() > 0) {
                    C1445f c1445f6 = (C1445f) c1445f.f6827l.get(0);
                    C1445f c1445f7 = (C1445f) c1445f2.f6827l.get(0);
                    int i8 = c1445f6.f6822g;
                    int i9 = c1445f.f6821f + i8;
                    int i10 = c1445f7.f6822g;
                    int i11 = c1445f2.f6821f + i10;
                    float f5 = this.f6842b.f6663e0;
                    if (c1445f6 == c1445f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c1445f.mo3444d((int) ((((i10 - i8) - c1446g.f6822g) * f5) + i8 + 0.5f));
                    c1445f2.mo3444d(c1445f.f6822g + c1446g.f6822g);
                }
            }
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: d */
    public final void mo3428d() {
        C1406d c1406d;
        C1406d c1406d2;
        C1406d c1406d3;
        C1406d c1406d4;
        C1406d c1406d5 = this.f6842b;
        boolean z2 = c1406d5.f6654a;
        C1446g c1446g = this.f6845e;
        if (z2) {
            c1446g.mo3444d(c1406d5.m3390k());
        }
        boolean z3 = c1446g.f6825j;
        C1445f c1445f = this.f6849i;
        C1445f c1445f2 = this.f6848h;
        if (!z3) {
            C1406d c1406d6 = this.f6842b;
            this.f6844d = c1406d6.f6685p0[1];
            if (c1406d6.f6632E) {
                this.f6834l = new C1440a(this);
            }
            int i = this.f6844d;
            if (i != 3) {
                if (i == 4 && (c1406d4 = this.f6842b.f6647T) != null && c1406d4.f6685p0[1] == 1) {
                    int m3390k = (c1406d4.m3390k() - this.f6842b.f6637J.m3357e()) - this.f6842b.f6639L.m3357e();
                    AbstractC1454o.m3464b(c1445f2, c1406d4.f6662e.f6848h, this.f6842b.f6637J.m3357e());
                    AbstractC1454o.m3464b(c1445f, c1406d4.f6662e.f6849i, -this.f6842b.f6639L.m3357e());
                    c1446g.mo3444d(m3390k);
                    return;
                }
                if (i == 1) {
                    c1446g.mo3444d(this.f6842b.m3390k());
                }
            }
        } else if (this.f6844d == 4 && (c1406d2 = (c1406d = this.f6842b).f6647T) != null && c1406d2.f6685p0[1] == 1) {
            AbstractC1454o.m3464b(c1445f2, c1406d2.f6662e.f6848h, c1406d.f6637J.m3357e());
            AbstractC1454o.m3464b(c1445f, c1406d2.f6662e.f6849i, -this.f6842b.f6639L.m3357e());
            return;
        }
        boolean z4 = c1446g.f6825j;
        C1445f c1445f3 = this.f6833k;
        if (z4) {
            C1406d c1406d7 = this.f6842b;
            if (c1406d7.f6654a) {
                C1405c[] c1405cArr = c1406d7.f6644Q;
                C1405c c1405c = c1405cArr[2];
                C1405c c1405c2 = c1405c.f6624f;
                if (c1405c2 != null && c1405cArr[3].f6624f != null) {
                    if (c1406d7.m3402y()) {
                        c1445f2.f6821f = this.f6842b.f6644Q[2].m3357e();
                        c1445f.f6821f = -this.f6842b.f6644Q[3].m3357e();
                    } else {
                        C1445f m3465h = AbstractC1454o.m3465h(this.f6842b.f6644Q[2]);
                        if (m3465h != null) {
                            AbstractC1454o.m3464b(c1445f2, m3465h, this.f6842b.f6644Q[2].m3357e());
                        }
                        C1445f m3465h2 = AbstractC1454o.m3465h(this.f6842b.f6644Q[3]);
                        if (m3465h2 != null) {
                            AbstractC1454o.m3464b(c1445f, m3465h2, -this.f6842b.f6644Q[3].m3357e());
                        }
                        c1445f2.f6817b = true;
                        c1445f.f6817b = true;
                    }
                    C1406d c1406d8 = this.f6842b;
                    if (c1406d8.f6632E) {
                        AbstractC1454o.m3464b(c1445f3, c1445f2, c1406d8.f6655a0);
                        return;
                    }
                    return;
                }
                if (c1405c2 != null) {
                    C1445f m3465h3 = AbstractC1454o.m3465h(c1405c);
                    if (m3465h3 != null) {
                        AbstractC1454o.m3464b(c1445f2, m3465h3, this.f6842b.f6644Q[2].m3357e());
                        AbstractC1454o.m3464b(c1445f, c1445f2, c1446g.f6822g);
                        C1406d c1406d9 = this.f6842b;
                        if (c1406d9.f6632E) {
                            AbstractC1454o.m3464b(c1445f3, c1445f2, c1406d9.f6655a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1405c c1405c3 = c1405cArr[3];
                if (c1405c3.f6624f != null) {
                    C1445f m3465h4 = AbstractC1454o.m3465h(c1405c3);
                    if (m3465h4 != null) {
                        AbstractC1454o.m3464b(c1445f, m3465h4, -this.f6842b.f6644Q[3].m3357e());
                        AbstractC1454o.m3464b(c1445f2, c1445f, -c1446g.f6822g);
                    }
                    C1406d c1406d10 = this.f6842b;
                    if (c1406d10.f6632E) {
                        AbstractC1454o.m3464b(c1445f3, c1445f2, c1406d10.f6655a0);
                        return;
                    }
                    return;
                }
                C1405c c1405c4 = c1405cArr[4];
                if (c1405c4.f6624f != null) {
                    C1445f m3465h5 = AbstractC1454o.m3465h(c1405c4);
                    if (m3465h5 != null) {
                        AbstractC1454o.m3464b(c1445f3, m3465h5, 0);
                        AbstractC1454o.m3464b(c1445f2, c1445f3, -this.f6842b.f6655a0);
                        AbstractC1454o.m3464b(c1445f, c1445f2, c1446g.f6822g);
                        return;
                    }
                    return;
                }
                if ((c1406d7 instanceof AbstractC1411i) || c1406d7.f6647T == null || c1406d7.mo3388i(7).f6624f != null) {
                    return;
                }
                C1406d c1406d11 = this.f6842b;
                AbstractC1454o.m3464b(c1445f2, c1406d11.f6647T.f6662e.f6848h, c1406d11.m3396s());
                AbstractC1454o.m3464b(c1445f, c1445f2, c1446g.f6822g);
                C1406d c1406d12 = this.f6842b;
                if (c1406d12.f6632E) {
                    AbstractC1454o.m3464b(c1445f3, c1445f2, c1406d12.f6655a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f6844d != 3) {
            c1446g.m3442b(this);
        } else {
            C1406d c1406d13 = this.f6842b;
            int i2 = c1406d13.f6688s;
            if (i2 == 2) {
                C1406d c1406d14 = c1406d13.f6647T;
                if (c1406d14 != null) {
                    C1446g c1446g2 = c1406d14.f6662e.f6845e;
                    c1446g.f6827l.add(c1446g2);
                    c1446g2.f6826k.add(c1446g);
                    c1446g.f6817b = true;
                    c1446g.f6826k.add(c1445f2);
                    c1446g.f6826k.add(c1445f);
                }
            } else if (i2 == 3 && !c1406d13.m3402y()) {
                C1406d c1406d15 = this.f6842b;
                if (c1406d15.f6687r != 3) {
                    C1446g c1446g3 = c1406d15.f6660d.f6845e;
                    c1446g.f6827l.add(c1446g3);
                    c1446g3.f6826k.add(c1446g);
                    c1446g.f6817b = true;
                    c1446g.f6826k.add(c1445f2);
                    c1446g.f6826k.add(c1445f);
                }
            }
        }
        C1406d c1406d16 = this.f6842b;
        C1405c[] c1405cArr2 = c1406d16.f6644Q;
        C1405c c1405c5 = c1405cArr2[2];
        C1405c c1405c6 = c1405c5.f6624f;
        if (c1405c6 != null && c1405cArr2[3].f6624f != null) {
            if (c1406d16.m3402y()) {
                c1445f2.f6821f = this.f6842b.f6644Q[2].m3357e();
                c1445f.f6821f = -this.f6842b.f6644Q[3].m3357e();
            } else {
                C1445f m3465h6 = AbstractC1454o.m3465h(this.f6842b.f6644Q[2]);
                C1445f m3465h7 = AbstractC1454o.m3465h(this.f6842b.f6644Q[3]);
                if (m3465h6 != null) {
                    m3465h6.m3442b(this);
                }
                if (m3465h7 != null) {
                    m3465h7.m3442b(this);
                }
                this.f6850j = 4;
            }
            if (this.f6842b.f6632E) {
                m3467c(c1445f3, c1445f2, 1, this.f6834l);
            }
        } else if (c1405c6 != null) {
            C1445f m3465h8 = AbstractC1454o.m3465h(c1405c5);
            if (m3465h8 != null) {
                AbstractC1454o.m3464b(c1445f2, m3465h8, this.f6842b.f6644Q[2].m3357e());
                m3467c(c1445f, c1445f2, 1, c1446g);
                if (this.f6842b.f6632E) {
                    m3467c(c1445f3, c1445f2, 1, this.f6834l);
                }
                if (this.f6844d == 3) {
                    C1406d c1406d17 = this.f6842b;
                    if (c1406d17.f6650W > 0.0f) {
                        C1450k c1450k = c1406d17.f6660d;
                        if (c1450k.f6844d == 3) {
                            c1450k.f6845e.f6826k.add(c1446g);
                            c1446g.f6827l.add(this.f6842b.f6660d.f6845e);
                            c1446g.f6816a = this;
                        }
                    }
                }
            }
        } else {
            C1405c c1405c7 = c1405cArr2[3];
            if (c1405c7.f6624f != null) {
                C1445f m3465h9 = AbstractC1454o.m3465h(c1405c7);
                if (m3465h9 != null) {
                    AbstractC1454o.m3464b(c1445f, m3465h9, -this.f6842b.f6644Q[3].m3357e());
                    m3467c(c1445f2, c1445f, -1, c1446g);
                    if (this.f6842b.f6632E) {
                        m3467c(c1445f3, c1445f2, 1, this.f6834l);
                    }
                }
            } else {
                C1405c c1405c8 = c1405cArr2[4];
                if (c1405c8.f6624f != null) {
                    C1445f m3465h10 = AbstractC1454o.m3465h(c1405c8);
                    if (m3465h10 != null) {
                        AbstractC1454o.m3464b(c1445f3, m3465h10, 0);
                        m3467c(c1445f2, c1445f3, -1, this.f6834l);
                        m3467c(c1445f, c1445f2, 1, c1446g);
                    }
                } else if (!(c1406d16 instanceof AbstractC1411i) && (c1406d3 = c1406d16.f6647T) != null) {
                    AbstractC1454o.m3464b(c1445f2, c1406d3.f6662e.f6848h, c1406d16.m3396s());
                    m3467c(c1445f, c1445f2, 1, c1446g);
                    if (this.f6842b.f6632E) {
                        m3467c(c1445f3, c1445f2, 1, this.f6834l);
                    }
                    if (this.f6844d == 3) {
                        C1406d c1406d18 = this.f6842b;
                        if (c1406d18.f6650W > 0.0f) {
                            C1450k c1450k2 = c1406d18.f6660d;
                            if (c1450k2.f6844d == 3) {
                                c1450k2.f6845e.f6826k.add(c1446g);
                                c1446g.f6827l.add(this.f6842b.f6660d.f6845e);
                                c1446g.f6816a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1446g.f6827l.size() == 0) {
            c1446g.f6818c = true;
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: e */
    public final void mo3429e() {
        C1445f c1445f = this.f6848h;
        if (c1445f.f6825j) {
            this.f6842b.f6653Z = c1445f.f6822g;
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: f */
    public final void mo3430f() {
        this.f6843c = null;
        this.f6848h.m3443c();
        this.f6849i.m3443c();
        this.f6833k.m3443c();
        this.f6845e.m3443c();
        this.f6847g = false;
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: k */
    public final boolean mo3432k() {
        return this.f6844d != 3 || this.f6842b.f6688s == 0;
    }

    /* renamed from: m */
    public final void m3460m() {
        this.f6847g = false;
        C1445f c1445f = this.f6848h;
        c1445f.m3443c();
        c1445f.f6825j = false;
        C1445f c1445f2 = this.f6849i;
        c1445f2.m3443c();
        c1445f2.f6825j = false;
        C1445f c1445f3 = this.f6833k;
        c1445f3.m3443c();
        c1445f3.f6825j = false;
        this.f6845e.f6825j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f6842b.f6669h0;
    }
}
